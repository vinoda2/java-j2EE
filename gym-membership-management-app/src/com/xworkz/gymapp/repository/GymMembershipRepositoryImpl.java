package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

import java.util.Arrays;

public class GymMembershipRepositoryImpl implements  GymMembershipRepository{


    //declare the array
    private GymMembershipDetailsDto[]  listOfDtos = new GymMembershipDetailsDto[2];
    private int index = 0;

    @Override
    public boolean saveDto(GymMembershipDetailsDto dto){
        System.out.println("invoking the GymMembershipRepositoryImpl()");
        System.out.println("dto is:"+dto);
        if(this.index < listOfDtos.length){
            listOfDtos[this.index] = dto;
            this.index++;
            System.out.println("saved succussfully");
            return true;
        }else{
            System.err.println("check array length or array is full");
        }
        return false;
    }


    //write the logic to display
    @Override
    public void readDto(){
        System.out.println(Arrays.toString(listOfDtos));
    }
}
