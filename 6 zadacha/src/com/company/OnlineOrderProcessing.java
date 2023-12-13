package com.company;

class OnlineOrderProcessing extends OrderProcessing {

    @Override
    protected void confirmOrder() {
        System.out.println("Заказ подтвержден.");
    }

    @Override
    protected void packOrder() {
        System.out.println("Заказ упакован.");
    }

    @Override
    protected void shipOrder() {
        System.out.println("Заказ отправлен.");
    }
}
