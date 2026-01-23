
package demo2.best;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppReadFile {

	public static void main(String[] args) {
		
		List<Recipe> recipes = new ArrayList<>();


		try (BufferedReader br = new BufferedReader(new FileReader("recipes.txt"))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				
				String[] parts = line.split(":");
				
				if (parts.length == 2) {
				
					String name = parts[0].trim();
					String ingredients = parts[1].trim();
					
					
					Recipe r = new Recipe(name, ingredients);
					
					IBehavior behavior = null;
					
					if (name.equals("Fried Rice")) {
						behavior = new BakingBehavior(20, 300);
						r.addBehavior(behavior);
					
					} else if (name.equals("Cake")) {
						behavior = new BakingBehavior(20, 300);
						r.addBehavior(behavior);
						
						behavior = new ChillingBehavior(30);
						r.addBehavior(behavior);
						
					} else {
						behavior = new ChillingBehavior(30);
						r.addBehavior(behavior);
					}
					
					
					recipes.add(r);
				}
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		for (Recipe r : recipes) {
			r.makeRecipe();
			System.out.println();
		}
		
	}

}
