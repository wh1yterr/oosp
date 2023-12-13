package com.company;

class ChineseMainCourse implements Dish {
    @Override
    public void prepare() {
        System.out.println("Готовим китайский гарнир");
    }
}
