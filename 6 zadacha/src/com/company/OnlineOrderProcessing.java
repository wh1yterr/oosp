package com.company;

class OnlineOrderProcessing extends OrderProcessing {

    @Override
    protected void confirmOrder() {
        System.out.println("����� �����������.");
    }

    @Override
    protected void packOrder() {
        System.out.println("����� ��������.");
    }

    @Override
    protected void shipOrder() {
        System.out.println("����� ���������.");
    }
}
