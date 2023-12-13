package com.company;

class ItalianMainCourse implements Dish {
    @Override
    public void prepare() {
        System.out.println("Готовим итальянский гарнир");
    }
}
