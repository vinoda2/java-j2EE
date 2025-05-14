package servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class FeedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("Feed back Servlet is running");
      String name =  servletRequest.getParameter("name");
      String email =  servletRequest.getParameter("email");
      String contactNumber =  servletRequest.getParameter("contactnumber");
      String feedback =  servletRequest.getParameter("feedback");
      System.out.println(name+" "+email+" "+contactNumber+ " "+ feedback);

      //send response back to the browser
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println(name +" Thanks for submitting the feedback");

    }
}
