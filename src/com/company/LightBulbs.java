package com.company;

import java.util.ArrayList;
import java.util.List;

public class LightBulbs {


    public static boolean isOn(int number, int opt) {
        int count = 0;
        for (int i = 1; i <= opt; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count % 2 != 0;
    }

    static void numberOfLight(int[] bulbs, int opt) {
        int numberOfOnLight = 0;
        for (int i = 0; i < bulbs.length; i++) {
            int number = bulbs[i];
            numberOfOnLight = 0;
            for (int b = 1; b <= number; b++) {
                if (isOn(b, opt)) {
                    numberOfOnLight++;
                }
            }
            System.out.println(numberOfOnLight);
        }

    }

    public static void main(String[] args) {
        numberOfLight(new int[]{3, 1, 2}, 3);
    }


}
