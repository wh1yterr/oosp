package com.company;

class MexicanCuisineFactory implements CuisineFactory {
    @Override
    public Dish createAppetizer() {
        return new MexicanAppetizer();
    }

    @Override
    public Dish createMainCourse() {
        return new MexicanMainCourse();
    }

    @Override
    public Dish createDessert() {
        return new MexicanDessert();
    }
}
