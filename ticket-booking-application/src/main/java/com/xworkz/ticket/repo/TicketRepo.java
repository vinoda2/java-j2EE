package com.xworkz.ticket.repo;

import com.xworkz.ticket.dto.TicketDto;
import  java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TicketRepo {

    public void saveTicket(TicketDto ticketDto){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket","root","root");
             PreparedStatement prepareStatement=
                    connection.prepareStatement("insert into ticket_info(ticketId,pickUp,`drop`,noOfPassenger) values(?,?,?,?)");
             prepareStatement.setInt(1,ticketDto.getTicketId());
             prepareStatement.setString(2,ticketDto.getPickUp());
            prepareStatement.setString(3,ticketDto.getDrop());
            prepareStatement.setInt(4,ticketDto.getNoOfPassenger());
            prepareStatement.execute();
            System.out.println("Data saved :"+ticketDto);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
