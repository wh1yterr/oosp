package com.company;

class ItalianCuisineFactory implements CuisineFactory {
    @Override
    public Dish createAppetizer() {
        return new ItalianAppetizer();
    }

    @Override
    public Dish createMainCourse() {
        return new ItalianMainCourse();
    }

    @Override
    public Dish createDessert() {
        return new ItalianDessert();
    }
}
