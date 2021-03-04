<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:url value="/alteraAutor" var="linkAlteraAutorServlet"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="${linkAlteraAutorServlet }" method="post">
	
		Nome: <input type="text" name="nome" value="${autor.nome }" />
        Email: <input type="text" name="email" value="${autor.email }" />
        <input type="hidden" name="id" value="${autor.id }"/>
	
		<input type="submit"/>
	</form>



</body>
</html>