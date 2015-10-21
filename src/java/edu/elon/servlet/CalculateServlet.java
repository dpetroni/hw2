package edu.elon.servlet;
import edu.elon.futureCalc.futureCalc;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**

Copyright (c) 2015 Elizabeth Walton & David Petroni
http://elon-punt1.rhcloud.com/homework2/
 */
@WebServlet(name = "CalculateServlet", urlPatterns = {"/calculate"})
public class CalculateServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doPost(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    double futureValue;
    String url = "/index.jsp";
    String action = request.getParameter("action");
    if (action == null) {
      action = "join";
    }
    if (action.equals("join")) {
      url = "/index.jsp";
    } else if (action.equals("calc")) {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      
      
      
      String investmentAmountString = request.getParameter("investmentAmount");
      double investmentAmount = Double.parseDouble(investmentAmountString);
      investmentAmountString = formatter.format(investmentAmount);
//      investmentAmount = Double.parseDouble(investmentAmountString);
      
      String yearlyInterestRateString = request.getParameter("yearlyInterestRate");
      double yearlyInterestRate = Double.parseDouble(yearlyInterestRateString);

      String numberOfYearsString = request.getParameter("numberOfYears");
      int numberOfYears = Integer.parseInt(numberOfYearsString);

      futureValue
              = investmentAmount * Math.pow((1 + (yearlyInterestRate / 100)), numberOfYears);
      String futureValueString = formatter.format(futureValue);
//      futureValue = Double.parseDouble(futureValueString);
      

      request.setAttribute("investmentAmount", investmentAmount);
      request.setAttribute("yearlyInterestRate", yearlyInterestRate);
      request.setAttribute("numberOfYears", numberOfYears);
      request.setAttribute("futureValue", formatter.format(futureValue));
      
      futureCalc calc = new futureCalc(investmentAmountString,
              yearlyInterestRate, numberOfYears, futureValueString);
      
      request.setAttribute("calc",calc);

      url = "/answer.jsp";

      getServletContext()
              .getRequestDispatcher(url)
              .forward(request, response);
    }

  }

}
