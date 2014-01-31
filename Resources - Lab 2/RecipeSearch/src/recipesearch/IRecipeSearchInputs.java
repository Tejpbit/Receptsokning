/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recipesearch;

/**
 *
 * @author André
 */
public interface IRecipeSearchInputs {
	public void reportSearchCriteria(String cuisine, String mainIngredient, String difficulity, int maxPrice, int maxTime);
}
