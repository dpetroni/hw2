/**

Copyright (c) 2015 Elizabeth Walton & David Petroni
http://elon-punt1.rhcloud.com/homework2/
 */
package edu.elon.futureCalc;
import java.io.Serializable;
public class futureCalc implements Serializable{
  private String investmentAmount;
  private double yearlyInterestRate;
  private int numberOfYears;
  private String futureValue;
      
  public futureCalc(){
    investmentAmount = "";
    yearlyInterestRate = 0;
    numberOfYears = 0;
    futureValue = "";
  }
  public futureCalc(String investmentAmount, double yearlyInterestRate,
          int numberOfYears, String futureValue){
    this.investmentAmount = investmentAmount;
    this.yearlyInterestRate = yearlyInterestRate;
    this.numberOfYears = numberOfYears;
    this.futureValue = futureValue;
  }

  public String getInvestmentAmount() {
    return investmentAmount;
  }

  public void setInvestmentAmount(String investmentAmount) {
    this.investmentAmount = investmentAmount;
  }

  public double getYearlyInterestRate() {
    return yearlyInterestRate;
  }

  public void setYearlyInterestRate(double yearlyInterestRate) {
    this.yearlyInterestRate = yearlyInterestRate;
  }

  public int getNumberOfYears() {
    return numberOfYears;
  }

  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  public String getFutureValue() {
    return futureValue;
  }

  public void setFutureValue(String futureValue) {
    this.futureValue = futureValue;
  }


  
  
}
