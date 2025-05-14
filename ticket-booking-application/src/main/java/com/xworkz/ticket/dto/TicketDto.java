package com.xworkz.ticket.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class TicketDto {

    private int ticketId;
    private String pickUp;
    private String drop;
    private int noOfPassenger;


}
