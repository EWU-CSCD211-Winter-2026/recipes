package demo2.best;

import java.util.ArrayList;
import java.util.List;

public class Recipe implements IRecipe {
	

	private String name;
	
	private List<IBehavior> behaviors;
	

	private String ingredients;


	public Recipe(String name, String ingredients) {
		this.name = name;
		this.ingredients = ingredients;
		behaviors = new ArrayList<>();
		
	}
	
	public void addBehavior(IBehavior behavior) {
		this.behaviors.add(behavior);
	}


	public String getName() { 
		return name;
	}
	

	public String getIngredients() {
		return ingredients; 
	}

	protected void prepare() {
		System.out.println("Preparing ingredients for recipe " + format('|'));
	}
	
	protected String format(char separator) {
		return name + separator + ingredients;
	}
	

	@Override
	public void makeRecipe() {
		prepare();
		for (IBehavior behavior : behaviors) {
			behavior.recipeBehavior(this);
		}
	}
	
}
