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
		List<Recipe> recipeList = db.search(new SearchFilter("Lätt", 0, "Sverige", 0, "Kött"));
		System.out.println("nbrOfrecipes " + recipeList.size());
		recipeSV.setRecipeList(recipeList);
	}
}
