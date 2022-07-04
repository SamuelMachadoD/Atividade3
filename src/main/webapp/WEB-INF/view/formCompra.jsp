<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/principal" var="linkServlet"/>
<%@ page import="Modelo.User" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<body>
	<form action="/Q1/principal" method="post">
	
		Nome: <input type="text" name="nome"/><br>
		CEP: <input type="text" name="CEP"><br>
		Estado: <input type="text" name="estado"/><br>
		Cidade: <input type="text" name="cidade"/><br>
		Rua/Avenida: <input type="text" name="rua"/><br>
		Numero: <input type="text" name="numero"/><br>
		Valor da Compra : xx
		Produto : XX
				
		
		<input type="hidden" name="acao" value="SalvarDados"/>
		<input type="submit" />
	</form>
</body>
</html>