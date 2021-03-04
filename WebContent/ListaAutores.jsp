
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	<c:if test="${not empty autor }">
		Autor ${ autor } cadastrado com sucesso!	
	</c:if>

	

	Lista de autores:
	<br />

	<ul>
		<c:forEach items="${autores}" var="autor">

			<li>${autor.nome} - 
					${autor.email}
					<a href="/editora/mostraAutor?id=${autor.id }">editar</a>
					<a href="/editora/removeAutor?id=${autor.id }">remove</a>
					
			</li>
		</c:forEach>
	</ul>

</body>
</html>