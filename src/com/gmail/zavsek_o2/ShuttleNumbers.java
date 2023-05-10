package com.gmail.zavsek_o2;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (count < 100) {
            String shuttleNumber = String.format("%d", i);
            if (shuttleNumber.contains("4") || shuttleNumber.contains("9")) {
                i++;
                continue;
            }
            System.out.println("Шатл №: " + shuttleNumber);
            count++;
            i++;
        }
    }
}


