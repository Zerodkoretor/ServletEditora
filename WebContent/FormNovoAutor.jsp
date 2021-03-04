<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:url value="/novoAutor" var="linkNovoAutorServlet"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="${linkNovoAutorServlet }" method="post">
	
		Nome: <input type="text" name="nome" />
        Email: <input type="text" name="email" />
	
		<input type="submit"/>
	</form>



</body>
</html>