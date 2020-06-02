/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Builder.Meal;
import Builder.MealBuilder;
import Builder.MealDirector;
import Builder.SandwichMealBuilder;
import Factory.CarFactory;
import Factory.CarType;
import Observer.HeadHunter;
import Observer.JobSeeker;
import Singleton.EagerSingleton;

/**
 *
 * @author edujg
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Singleton:");
        Singleton();
        System.out.println("");
        System.out.println("Factory:");
        Factory();
        System.out.println("");
        System.out.println("Observer:");
        Observer();
        System.out.println("");
        System.out.println("Builder:");
        Builder();
    }

    public static void Singleton() {
        EagerSingleton singleton = EagerSingleton.getInstance();
        System.out.println(singleton.toString());
    }

    public static void Factory() {
        CarFactory factory = new CarFactory();
        factory.buildCar(CarType.SMALL);
        factory.buildCar(CarType.SEDAN);
        factory.buildCar(CarType.LUXURY);
    }

    public static void Observer() {
        HeadHunter hunter = new HeadHunter();
        JobSeeker seeker = new JobSeeker("Seeker");
        hunter.registerObserver(seeker);
        hunter.addJob("Nuevo trabajo en Google");
    }

    public static void Builder() {
        MealBuilder builder = new SandwichMealBuilder();
        MealDirector director = new MealDirector();
        director.makeMeal(builder);
        Meal meal = builder.getMeal();
        System.out.println(meal);
    }
}
