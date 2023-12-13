package com.company;

import java.util.Scanner;

class RestaurantFacade {
    private Menu menu;
    private Order order;
    private Scanner scanner;

    public RestaurantFacade() {
        menu = new Menu();
        order = new Order();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        menu.displayMenu();
    }

    public void addToOrder(String item) {
        if (menu.isValidItem(item)) {
            order.addItem(item);
        } else {
            System.out.println("Извините, этого блюда нет в меню.");
        }
    }

    public void displayOrder() {
        order.displayOrder();
    }

    public void processPayment() {
        double total = order.calculateTotal();
        System.out.println("Сумма к оплате: " + total);

        System.out.print("Введите сумму оплаты: ");
        double amountPaid = scanner.nextDouble();

        if (amountPaid >= total) {
            double change = amountPaid - total;
            System.out.println("Спасибо за оплату. Ваша сдача: " + change);
        } else {
            System.out.println("Недостаточно средств для оплаты.");
        }
    }
}
