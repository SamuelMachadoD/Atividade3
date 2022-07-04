<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/principal" var="linkServlet"/>
<!DOCTYPE html>
<html>
<body>
	<form action="${linkServlet}" method="post">
	
		Login: <input type="text" name="login"/>
		Senha: <input type="password" name="senha"/>
		
		<input type="hidden" name="acao" value="Login"/>
		<input type="submit" />
	</form>
</body>
</html>