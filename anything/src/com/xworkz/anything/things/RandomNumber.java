package com.xworkz.anything.things;

import java.util.Random;

public class RandomNumber {


    // 3 rd way of declaring the method
    public static int getRandomNumber(){
        Random random = new Random();
        int number =  random.nextInt(1,100);
        return number;
    }


}
