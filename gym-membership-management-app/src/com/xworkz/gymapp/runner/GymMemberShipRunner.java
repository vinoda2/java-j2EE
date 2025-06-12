package com.xworkz.gymapp.runner;

import com.xworkz.gymapp.constant.MemberShipType;
import com.xworkz.gymapp.dto.GymMembershipDetailsDto;
import com.xworkz.gymapp.repository.GymMembershipRepository;
import com.xworkz.gymapp.repository.GymMembershipRepositoryImpl;
import com.xworkz.gymapp.service.GymMembershipService;
import com.xworkz.gymapp.service.GymMembershipServiceImplementation;

public class GymMemberShipRunner {

    public static void main(String[] args) {
        GymMembershipDetailsDto dto =    new GymMembershipDetailsDto();
        dto.setMemberId(1);
        dto.setMemberName("your name");
        dto.setMemberEmailId("yourname@gmail.com");
        dto.setMemberShipType(MemberShipType.DAILY);
        //create  a instance for the repository
        GymMembershipRepository gymMembershipRepository = new GymMembershipRepositoryImpl();
        //create object  // upcasting
      GymMembershipService service =  new GymMembershipServiceImplementation(gymMembershipRepository);
      service.validateDto(dto);
        service.validateDto(dto);
        service.validateDto(dto);
        System.out.println("================read method ==========================");
        service.readDto();

    }

}
