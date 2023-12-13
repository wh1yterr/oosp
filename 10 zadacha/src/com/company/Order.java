package com.company;

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<String> orderItems;

    public Order() {
        orderItems = new ArrayList<String>();
    }

    public void addItem(String item) {
        orderItems.add(item);
        System.out.println(item + " добавлено в заказ.");
    }

    public void displayOrder() {
        System.out.println("Ваш заказ:");
        for (String item : orderItems) {
            System.out.println(item);
        }
    }

    public double calculateTotal() {

        return orderItems.size() * 10.0;
    }
}
