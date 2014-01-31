/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recipesearch;

import se.chalmers.ait.dat215.lab2.*;
/**
 * Ingredient		//kommer
 * Recipe			//jag
 * RecipeComparator // nog inte använda
 * RecipeDatabase
 * SearchFilter
*/

/**
 *
 * @author André
 */
public class RecipeController implements IRecipeSearchInputs{
	
	private final RecipeDatabase recipeDatabase = RecipeDatabase.getSharedInstance();
	
	
	public RecipeController() {
		new RecipeSearchView(this).setVisible(true);
		
		
	}

	@Override
	public void reportSearchCriteria(String cuisine, String mainIngredient, String difficulity, int maxPrice, int maxTime) {
		System.out.println(String.format(""
				+ "Cuisine: %s\n"
				+ "MainIngredient: %s\n"
				+ "Difficulity: %s\n"
				+ "MaxPrice: %d\n"
				+ "MaxTime: %d", cuisine, mainIngredient, difficulity, maxPrice, maxTime));
	}
	
	
	
}
