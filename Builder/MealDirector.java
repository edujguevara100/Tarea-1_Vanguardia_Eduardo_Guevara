/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author edujg
 */
public class MealDirector {
    public Meal makeMeal(MealBuilder builder) {
    builder.addDrink("Fanta");
    builder.addSandwich("Pan de Queso y Romero");
    builder.addSides("Papas preparadas");
    return builder.getMeal();
  }
}
