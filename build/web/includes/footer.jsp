<!--
Copyright (c) 2015 Elizabeth Walton & David Petroni


-->
<%@page import = "java.util.GregorianCalendar, java.util.Calendar" %>
<%
  GregorianCalendar currentDate = new GregorianCalendar();
  int currentYear = currentDate.get(Calendar.YEAR);
%>
<div id="foot">
  <p id="footText">&copy; <%= currentYear%>, David Petroni and Lisa Walton</p>
</div>
</body>
</html>
