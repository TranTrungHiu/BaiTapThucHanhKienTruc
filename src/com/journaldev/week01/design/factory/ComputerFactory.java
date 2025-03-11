package com.journaldev.week01.design.factory;

import com.journaldev.week01.design.model.Computer;
import com.journaldev.week01.design.model.PC;
import com.journaldev.week01.design.model.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);
        return null;
    }
}