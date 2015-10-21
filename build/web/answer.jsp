<!--
Copyright (c) 2015 Elizabeth Walton & David Petroni


-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:import url="/includes/header.html" />

<div class="whole">
  <h1 class="alignLeft">Future Value Calculator</h1>
  <div id="tableDiv">  
    <jsp:useBean id="calc" scope="request" class="edu.elon.futureCalc.futureCalc"/>
    <table>
      <tbody>
        <tr>
          <td class="labelRow">Investment Amount:</td>
          <td class="inputRow">
            <jsp:getProperty name="calc" property="investmentAmount"/>
          </td>
        </tr>
        <tr>
          <td class="labelRow">Yearly Interest Rate:</td>
          <td class="inputRow"><jsp:getProperty name="calc" property="yearlyInterestRate"/></td>
        </tr>
        <tr>
          <td class="labelRow">Number of Years:</td>
          <td class="inputRow"><jsp:getProperty name="calc" property="numberOfYears"/></td>
        </tr>
        <tr>
          <td class="labelRow">Future Value:</td>
          <td class="inputRow"><jsp:getProperty name="calc" property="futureValue"/></td>
        </tr>
      </tbody>
    </table>
  </div>
  <c:import url="/includes/footer.jsp" /> 
</div>