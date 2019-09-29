package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet 
{
  private static final long serialVersionUID = 1L;

  @Override 
  public void service(HttpServletRequest request,
  HttpServletResponse response) 
      throws IOException
  {
    // http://localhost:8080/?paramName=paramValue
      response.getOutputStream().print("Hello World "+
      request.getParameter("paramName"));
  }
}
