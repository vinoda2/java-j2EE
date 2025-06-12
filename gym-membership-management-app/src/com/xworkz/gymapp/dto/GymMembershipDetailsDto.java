package com.xworkz.gymapp.dto;

import com.xworkz.gymapp.constant.MemberShipType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@ToString
public class GymMembershipDetailsDto {

    //properties or instance variables

    private int memberId;
    private String memberName;
    private String memberEmailId;
    private long contactNumber;
    private LocalDate issueddate;
    private LocalTime issuedTime;
    private LocalDate expDate;
    private MemberShipType memberShipType;

    //provide the getter and setter methods



}
