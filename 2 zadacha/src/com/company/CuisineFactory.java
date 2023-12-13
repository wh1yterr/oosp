package com.company;

interface CuisineFactory {
    Dish createAppetizer();

    Dish createMainCourse();

    Dish createDessert();
}
