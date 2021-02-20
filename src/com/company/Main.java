package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static Object[] shopQueue;
    public static boolean isOpen;

    public static void main(String[] args) {
        Main main = new Main();
        main.shopWork();
    }

    public void shopWork() {
        Timer timer = new Timer();
        TimerTask timerTask = new JewelryShop();

        timer.schedule(timerTask, 0,40000);
    }

    public void customerCreate() {
        Timer timer = new Timer();
        TimerTask timerTask = new Сustomer();

        timer.schedule(timerTask, 0,random(2, 5));
    }

    public int random(int from, int to) {
        int r = from + (int) (Math.random() * (1 + to - from));
        return r;
    }

    public static int getIndexOfEmptyCell() {
        int cell = 0;
        for (int i = 0; i < shopQueue.length; i++) {
            if ((int)shopQueue[i] == 0) {
                cell = i;
            }
        }
        return cell;
    }
}
