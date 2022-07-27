package com.sergeev.Utill;

import java.util.Random;

public class RandomUttils {
    public static int getRandomNumber(int a) {
        Random random = new Random();
        return random.nextInt(a);
    }
}
