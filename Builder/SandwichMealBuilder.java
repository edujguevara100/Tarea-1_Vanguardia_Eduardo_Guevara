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
public class SandwichMealBuilder implements MealBuilder{
    private Meal _meal = new Meal();
    @Override
    public void addSandwich(String s) {
        _meal.sandwich = s;
    }

    @Override
    public void addDrink(String d) {
        _meal.drink = d;
    }

    @Override
    public void addSides(String s) {
        _meal.sideOrder = s;
    }

    @Override
    public void addOffer(String o) {
        _meal.offer = o;
    }

    @Override
    public void setPrice(double price) {
        _meal.price = price;
    }

    @Override
    public Meal getMeal() {
        return _meal;
    }
    
}
