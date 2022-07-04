<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/principal" var="linkServlet"/>
<!DOCTYPE html>
<html>
<body>
	<form action="${linkServlet}" method="post">
	
		Nome: <input type="text" name="nome"/>
		CEP: <input type="text" name="CEP">
		Estado: <input type="text" name="estado"/>
		Cidade: <input type="text" name="cidade"/>
		Rua/Avenida: <input type="text" name="rua"/>
		Numero: <input type="text" name="numero"/>
		Valor da Compra : XX
		Produto : XX
				
		
		<input type="hidden" name="acao" value="SalvarDados"/>
		<input type="submit" />
	</form>
</body>
</html>