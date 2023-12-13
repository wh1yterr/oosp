package com.company;

class ChineseCuisineFactory implements CuisineFactory {
    @Override
    public Dish createAppetizer() {
        return new ChineseAppetizer();
    }

    @Override
    public Dish createMainCourse() {
        return new ChineseMainCourse();
    }

    @Override
    public Dish createDessert() {
        return new ChineseDessert();
    }
}
