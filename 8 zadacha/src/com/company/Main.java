package com.company;

import java.util.Scanner;
import java.util.Stack;
// ������ �8 ������� 2
public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("�������� ��������:");
            System.out.println("1. �������� ������� ���������");
            System.out.println("2. ��������� ������� ���������");
            System.out.println("3. �������� ��������� ��������� ������ ���������");
            System.out.println("4. ����� �� ���������");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("������� ����� ������� ��������� (�� 0 �� 100):");
                    int newVolume = scanner.nextInt();
                    if (newVolume >= 0 && newVolume <= 100) {
                        player.setVolume(newVolume);
                    } else {
                        System.out.println("������������ ������� ���������. ������� ������ ���� �� 0 �� 100.");
                    }
                    break;
                case 2:
                    player.saveVolumeLevel();
                    break;
                case 3:
                    player.undoVolumeLevel();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("������������ ����.");
                    break;
            }
        }

        scanner.close();
    }
}
