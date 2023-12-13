package com.company;

abstract class OrderProcessing {

    public final void processOrder() {
        confirmOrder();
        packOrder();
        shipOrder();
    }

    protected abstract void confirmOrder();

    protected abstract void packOrder();

    protected abstract void shipOrder();
}
