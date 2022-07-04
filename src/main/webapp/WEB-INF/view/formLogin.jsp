<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="" var="linkServlet"/>
<!DOCTYPE html>
<html>
<body>
	<form action="/Q1/principal" method="post">
	
		Login: <input type="text" name="login"/><br>
		Senha: <input type="password" name="senha"/><br>
		
		<input type="hidden" name="acao" value="Login"/>
		<input type="submit" />
	</form>
</body>
</html>