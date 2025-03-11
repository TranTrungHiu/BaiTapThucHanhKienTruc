package com.journaldev.week01.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new
                BillPughSingleton();

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}