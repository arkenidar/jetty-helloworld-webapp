package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet 
{
  private static final long serialVersionUID = 1L;

  @Override 
  public void service(HttpServletRequest request,
  HttpServletResponse response) 
      throws IOException
  {

      response.getOutputStream().println("<!doctype html>");

// import javax.servlet.http.HttpSession;
    // http://localhost:8080/?paramName=paramValue
      response.getOutputStream().println("Hello World "+
      request.getParameter("paramName")+"<br>");

response.getOutputStream().println("(reload to test session)<br>");

  HttpSession session=request.getSession();
        session.setAttribute("counter",
session.getAttribute("counter")==null?
"0":Integer.valueOf(1+Integer.valueOf(session.getAttribute("counter").toString())).toString()
);

      response.getOutputStream().print(session.getAttribute("counter").toString());


  }
}
