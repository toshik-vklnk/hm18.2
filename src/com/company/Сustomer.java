package com.company;

import java.util.TimerTask;

import static com.company.Main.shopQueue;

public class Сustomer extends TimerTask {

    @Override
    public void run() {
        int cell = Main.getIndexOfEmptyCell();
        if (Main.isOpen = true) {
            shopQueue[cell] = new Object();
        }
    }
}
