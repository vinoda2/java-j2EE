package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMembershipService {
    //abstract method
    boolean validateDto(GymMembershipDetailsDto dto);
    //read method
    void readDto();

}
