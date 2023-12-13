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
            System.out.println("��������, ����� ����� ��� � ����.");
        }
    }

    public void displayOrder() {
        order.displayOrder();
    }

    public void processPayment() {
        double total = order.calculateTotal();
        System.out.println("����� � ������: " + total);

        System.out.print("������� ����� ������: ");
        double amountPaid = scanner.nextDouble();

        if (amountPaid >= total) {
            double change = amountPaid - total;
            System.out.println("������� �� ������. ���� �����: " + change);
        } else {
            System.out.println("������������ ������� ��� ������.");
        }
    }
}
