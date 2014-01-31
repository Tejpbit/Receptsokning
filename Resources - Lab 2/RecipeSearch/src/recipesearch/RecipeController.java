/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recipesearch;

import java.util.List;
import se.chalmers.ait.dat215.lab2.*;

/**
 *
 * @author André
 */
public class RecipeController implements IRecipeSearchInputs{
	
	private RecipeDatabase db = RecipeDatabase.getSharedInstance();
	private RecipeSearchView recipeSV;
	
	public RecipeController() {
		recipeSV = new RecipeSearchView(this);
		recipeSV.setVisible(true);
		
		
	}

	@Override
	public void reportSearchCriteria(String cuisine, String mainIngredient, String difficulity, int maxPrice, int maxTime) {
		
		System.out.println(
		String.format("*************\n" +
				"Cuisine: %s\n"
				+ "MainIngredient: %s\n"
				+ "Difficulity: %s\n"
				+ "MaxPrice: %d\n"
				+ "MaxTime: %d\n"
				+ "*****************",
				cuisine, mainIngredient, difficulity, maxPrice, maxTime)
		);
		//new SearchFilter(difficulity, maxTime, cuisine, maxPrice, mainIngredient)
		SearchFilter sf = new SearchFilter(difficulity, maxTime, cuisine, maxPrice, mainIngredient);
		List<Recipe> recipeList = db.search(sf);
		
		for (Recipe RL : recipeList){
			System.out.println("Match" + RL.getMatch());
		}
		System.out.println("nbrOfrecipes " + recipeList.size());
		System.out.println(recipeSV);
		recipeSV.setRecipeList(recipeList);
	}
}
