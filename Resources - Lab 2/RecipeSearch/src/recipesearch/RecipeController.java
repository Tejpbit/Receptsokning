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
                reportSearchCriteria(null, null, null, 0, 0);
		recipeSV.setVisible(true);
		
	}

	@Override
	public void reportSearchCriteria(String cuisine, String mainIngredient, String difficulity, int maxPrice, int maxTime) {
		SearchFilter sf = new SearchFilter(difficulity, maxTime, cuisine, maxPrice, mainIngredient);
		List<Recipe> recipeList = db.search(sf);
		recipeSV.setRecipeList(recipeList);
	}
}
