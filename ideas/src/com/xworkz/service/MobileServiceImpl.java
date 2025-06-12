package com.xworkz.service;

import com.xworkz.constant.Colour;
import com.xworkz.things.Mobile;

public class MobileServiceImpl implements  MobileService{
    @Override
    public boolean checkCondition(Mobile mobile) {

        if(mobile!=null){

            //validate the properties
            if(mobile.getPrice()==10000){
                System.out.println("we can you buy mobile");
            }else if(mobile.getPrice()==10000 && mobile.getColour().equals(Colour.BLACK)){
                System.out.println("mobile is available");
            }
            if(mobile.getBrandName().length()<3){
                System.out.println("length is <3");
            }

            return true;
        }

        return false;
    }
}
