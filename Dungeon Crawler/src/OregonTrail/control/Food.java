/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

/**
 *
 * @author MasterCraft Computer
 */
public class Food {
    public int determineFoodBalance(int invFood, int famSize, int indvFoodNeed) {
    int foodNeed = famSize * indvFoodNeed;
    if (invFood < 1 || invFood > 500) {
        return -1;
    }

    if (famSize < 1) {
        return -2;
    }

    if (indvFoodNeed < 0) {
        return -3;
    }

    if (foodNeed < 0) {
        return -4;
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

