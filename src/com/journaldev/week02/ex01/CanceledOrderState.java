package com.journaldev.week02.ex01;

class CanceledOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Hủy đơn hàng: Hoàn tiền cho khách.");
    }
}
