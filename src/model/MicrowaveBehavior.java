package model;

/**
 * This class allows a recipe to have microwave instructions
 * For instance a Cake can have a certain amount of time to bake in an oven and have a seperate amount of time to cook in a microwave.
 * @author Derek
 */
public class MicrowaveBehavior implements IBehavior{

    private final int cookTime;
    private final boolean flipAtHalfway;

    /**
     * This is the constructor for the MicrowaveBehavior object
     * @param cookTime is the cook time in minutes
     * @param flipAtHalfway is whether the recipe need sto be flipped/stirred or not throught cook
     */
    public MicrowaveBehavior(int cookTime, boolean flipAtHalfway){
        this.cookTime = cookTime;
        this.flipAtHalfway = flipAtHalfway;
    }

    /**
     * This is the getter for the field cookTime
     * @return an int representing cookTime in minutes
     */
    public int getCookTime(){
        return this.cookTime;
    }

    /**
     * This method returns proper information based on if flipAtHalfWay is true
     * @return an informative String used in the recipeBehavior method
     */
    public String flipInstructions(){
        if(this.flipAtHalfway) return "make sure to flip or stir when the time is halfway done";
        else return "no need to flip at all during cook time";
    }

    /**
     * This method is the override for the abstract method needed to implement iBehavior
     *
     */
    @Override
    public void recipeBehavior(Recipe r){
        System.out.println("Microwave recipe: " + r.format('|') + " for " + getCookTime() + "minutes and " + flipInstructions());
    }
}
