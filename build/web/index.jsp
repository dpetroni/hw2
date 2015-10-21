<!--
Copyright (c) 2015 Elizabeth Walton & David Petroni


-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:import url="/includes/header.html" />

<div class="whole">
  <div id="box">
    <h1 class="alignLeft">Future Value Calculator</h1>
    <form action="calculate" method="post">
      <input type="hidden" name="action" value="calc">
      <label>Investment Amount</label>
      <input class="textBox" type="number" step="any" name="investmentAmount" min="0" required><br>
      <label>Yearly Interest Rate</label>
      <input class="textBox" type="number" step="any" name="yearlyInterestRate" min="0" required><br>
      <label>Number of Years</label>
      <input class="textBox" type="number" name="numberOfYears" placeholder="Integer number of years" min="0" required><br>
      <input id="button" type="submit" value="Calculate" class="marginLeft">
    </form>
  </div>

  <c:import url="/includes/footer.jsp" /> 
</div>