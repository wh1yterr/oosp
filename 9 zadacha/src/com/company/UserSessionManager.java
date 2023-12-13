package com.company;

import java.util.HashMap;
import java.util.Map;

// ����� ��� ���������� �������������� � ��������
class UserSessionManager {
    private static UserSessionManager instance;
    private Map<String, User> users;
    private Map<String, String> activeSessions;

    private UserSessionManager() {
        users = new HashMap<String, User>();
        activeSessions = new HashMap<String, String>();
    }

    public static synchronized UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public void registerUser(String username, String password) {
        users.put(username, new User(username, password));
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            String sessionId = generateSessionId();
            activeSessions.put(sessionId, username);
            System.out.println("������������ " + username + " ����� � �������: " + sessionId);
            return true;
        }
        return false;
    }

    public void logout(String sessionId) {
        activeSessions.remove(sessionId);
        System.out.println("������ " + sessionId + " ���������");
    }

    private String generateSessionId() {
        // ��������� ����������� ID ��� ������ (����� �������� �� ����� ������� ��������)
        return String.valueOf(System.currentTimeMillis());
    }
}
