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
public interface MealBuilder {
    public void addSandwich(String s);
    public void addDrink(String d);
    public void addSides(String s);
    public void addOffer(String o);
    public void setPrice(double price);
    public Meal getMeal();
}
