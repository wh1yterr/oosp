package com.company;

class ItalianAppetizer implements Dish {
    @Override
    public void prepare() {
        System.out.println("Готовим итальянскую закуску");
    }
}
