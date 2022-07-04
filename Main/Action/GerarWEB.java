package Action;

import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/GerarWEB")
public class GerarWEB extends HttpServlet implements Acao{
	private static final long serialVersionUID = 1L;

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
//		HttpSession sessao = request.getSession();
//		String cep = (String) sessao.getAttribute("CEP");
		
		Random r = new Random();
		int numero = r.nextInt(100) + 1;
		int numero2 = r.nextInt(10) + 1;
		
		request.setAttribute("valor", numero);
		request.setAttribute("valor2", numero2);
		
		return "foward:WEBVIEW.jsp";
	}

}
