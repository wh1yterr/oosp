package com.company;
//Задача №2 Вариант 12
public class Main {
    public static void main(String[] args) {

        CuisineFactory italianFactory = new ItalianCuisineFactory();

        Dish italianAppetizer = italianFactory.createAppetizer();
        Dish italianMainCourse = italianFactory.createMainCourse();
        Dish italianDessert = italianFactory.createDessert();

        italianAppetizer.prepare();
        italianMainCourse.prepare();
        italianDessert.prepare();
        System.out.println("\t");

        CuisineFactory chineseFactory = new ChineseCuisineFactory();

        Dish chineseAppetizer = chineseFactory.createAppetizer();
        Dish chineseDessert = chineseFactory.createDessert();
        Dish chineseMainCourse = chineseFactory.createMainCourse();

        chineseAppetizer.prepare();
        chineseDessert.prepare();
        chineseMainCourse.prepare();
        System.out.println("\t");

        CuisineFactory mexicanFactory = new MexicanCuisineFactory();

        Dish mexicanAppetizer = mexicanFactory.createAppetizer();
        Dish mexicanDessert = mexicanFactory.createDessert();
        Dish mexicanMainCourse = mexicanFactory.createMainCourse();

        mexicanAppetizer.prepare();
        mexicanDessert.prepare();
        mexicanMainCourse.prepare();

    }
}

