package com.company;
//Задача №3 Вариант 4
public class Main {
    public static void main(String[] args) {
        OperatingSystem iOS = new IOS();
        OperatingSystem android = new Android();
        OperatingSystem harmonyOS = new HarmonyOS();

        MobileDevice iPhone = new Smartphone(iOS);
        MobileDevice galaxyTab = new Tablet(android);
        MobileDevice huaweiPhone = new Smartphone(harmonyOS);

        iPhone.runApp("Карты");
        galaxyTab.runApp("Камера");
        huaweiPhone.runApp("Музыка");

        iPhone.closeApp("Карты");
        galaxyTab.closeApp("Камера");
        huaweiPhone.closeApp("Музыка");
    }
}
