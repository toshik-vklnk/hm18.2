package com.company;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class JewelryShop extends TimerTask {



    @Override
    public void run() {
        try {
            System.out.println("break  " + LocalDateTime.now());
            Main.isOpen = false;
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.shopQueue = new Object[5];
        Main.isOpen = true;
        System.out.println("work " + LocalDateTime.now());
    }

}
