<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color=red> Hi I am Sarba</font></h1>

<%@page import="java.util.*,java.sql.*" %>  <%-- Directive tag --%>
<%
java.util.Date d=new java.util.Date();
out.println("time is "+d);

%>

<%-- jsp comments --%>
<br>
<b> The sum is :</b>

<%

int a=4;
int b=5;
int c=a+b;
out.println(c);
%>


<script>
alert(" Hello world");
</script>
<br>

sum is: <%=c%>  <%-- Expression tag --%>

<%!int count=0;%>  <%--  instance variable declared declaration tag  --%>

<%
count++;
out.println("web site visited "+count+" times");
%>



<%
for(int i=0;i<10;i++)
{ 
	if(i%2==0)
	{
		%>
		<html>
		
			<body>
				<marquee> Even number is <%=i%></marquee>
				<font color="green" size=10> Hello Mr Even</font>
			</body>
		</html>
		
		
		<% 
	} // end of if
	else
	{
		%>
		
		<h3> U r an odd number</h3>
		
		<% 
		
		
		
		
	}
}

%>







<form action="login.jsp">

Enter username:
<input type="Text" name="username"/>
<br/>

Enter password:
<input type="password" name="password"/>
<br/>
<input type="submit"/>
</form>
</body>
</html>

