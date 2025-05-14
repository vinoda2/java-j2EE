package com.xworkz.ticket.servlet;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.repo.TicketRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/save")
public class TicketCreate extends HttpServlet {

    TicketRepo repo=new TicketRepo();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TicketDto dto=new TicketDto();
        dto.setTicketId(Integer.parseInt(req.getParameter("ticketId")));
        dto.setPickUp(req.getParameter("pickUp"));
        dto.setDrop(req.getParameter("drop"));
        dto.setNoOfPassenger(Integer.parseInt(req.getParameter("noOfPassenger")));
        repo.saveTicket(dto);
        System.out.println("data in Servlet :"+dto);
        req.getRequestDispatcher("success.jsp");
    }
}
