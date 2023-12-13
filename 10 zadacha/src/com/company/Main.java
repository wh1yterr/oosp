package com.company;

import java.util.Scanner;
//Задача №10 Вариант 4
public class Main {
    public static void main(String[] args) {
        RestaurantFacade facade = new RestaurantFacade();
        facade.displayMenu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите блюдо из меню (или 'exit' для завершения заказа): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            facade.addToOrder(input);
        }

        facade.displayOrder();
        facade.processPayment();
    }
}
