<%@page import="org.example.SavingAccount"%>
<%
SavingAccount sa1 = new SavingAccount(5000);
%>

<h2>The balance is <%=sa1.getBalance() %></h2>