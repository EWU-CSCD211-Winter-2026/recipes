package model;

public class MixingBehavior implements IBehavior {

    private int seconds;

    public MixingBehavior (final int seconds){
        this.seconds = seconds;
    }

    public int getSeconds(){
        return this.seconds;
    }

    @Override
    public void recipeBehavior(Recipe r){
        System.out.println("Mixing ingredients of recipe [" + r.format('|') + "] for " + this.getSeconds() + " seconds.");
    }
    
}
