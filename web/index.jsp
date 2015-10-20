<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />


<div id="box">
  <h1>Future Value Calculator</h1>
  <form action="" method="post">
    <label>Investment Amount</label>
    <input type="text" name="investmentAmount"><br>
    <label>Yearly Interest Rate</label>
    <input type="text" name="yearlyInterestRate"><br>
    <label>Number of Years</label>
    <input type="text" name="numberOfYears"><br>
    <input type="submit" value="Calculate" class="marginLeft">
  </form>
</div>
<c:import url="footer.jsp" /> 


