package com.company;
//������ �3 ������� 4
public class Main {
    public static void main(String[] args) {
        OperatingSystem iOS = new IOS();
        OperatingSystem android = new Android();
        OperatingSystem harmonyOS = new HarmonyOS();

        MobileDevice iPhone = new Smartphone(iOS);
        MobileDevice galaxyTab = new Tablet(android);
        MobileDevice huaweiPhone = new Smartphone(harmonyOS);

        iPhone.runApp("�����");
        galaxyTab.runApp("������");
        huaweiPhone.runApp("������");

        iPhone.closeApp("�����");
        galaxyTab.closeApp("������");
        huaweiPhone.closeApp("������");
    }
}
