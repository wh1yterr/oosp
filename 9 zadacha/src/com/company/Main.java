package com.company;

import java.util.HashMap;
import java.util.Map;
//������ �9 ������� 12
public class Main {
    public static void main(String[] args) {
        UserSessionManager userManager = UserSessionManager.getInstance();

        // ����������� �������������
        userManager.registerUser("����", "123");
        userManager.registerUser("������", "321");

        // ������� �����
        userManager.login("����", "123");
        userManager.login("������", "654"); // ������������ ������

        // �����
        userManager.logout("1234567890"); // �������� �� ������������ session ID
    }
}
