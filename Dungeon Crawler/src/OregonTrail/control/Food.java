/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import exceptions.FoodException;

/**
 *
 * @author MasterCraft Computer
 */
public class Food {
    public int determineFoodBalance(int invFood, int famSize, int indvFoodNeed) 
    throws FoodException {
        int foodNeed = famSize * indvFoodNeed;
        if (invFood < 1 || invFood > 500) {
            throw new FoodException("Food quantity cannot be less than 1 or greater than 500.");
        }

        if (famSize < 1) {
            throw new FoodException("family size cannot bwe less than 1.");
        }

        if (indvFoodNeed < 0) {
            throw new FoodException("Individual food need cannot be less than 0.");
        }

        if (foodNeed < 0) {
            throw new FoodException("Family food need cannot be less than 0.");
        }

        int foodBalance = invFood - foodNeed;
        if (foodBalance > 0) {
            return foodBalance;
        }
        else {
            foodBalance = 0;
        }

        return foodBalance;
    }
}

