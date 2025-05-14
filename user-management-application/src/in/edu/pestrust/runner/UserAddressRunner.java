package in.edu.pestrust.runner;

import in.edu.pestrust.things.UserAddress;

import java.util.Scanner;

public class UserAddressRunner {

    public static void main(String[] args) {
        System.out.println("city:"+UserAddress.city);
        System.out.println("pincode:"+UserAddress.pincode);

        Scanner sp = new Scanner(System.in);
        long time = System.currentTimeMillis();
        String choice = sp.nextLine();
        long endTime = System.currentTimeMillis();
        long taken =  endTime - time;

    }
}
