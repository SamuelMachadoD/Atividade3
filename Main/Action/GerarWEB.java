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
		Double frete = (r.nextInt(10000) + 1)/100.0;
		int numero2 = r.nextInt(10) + 1;
		
		request.setAttribute("valor", frete);
		request.setAttribute("valor2", numero2);
		
		return "foward:WEBVIEW.jsp";
	}

}
