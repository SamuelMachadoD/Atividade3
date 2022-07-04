package Action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

@WebServlet("/GerarJSON")
public class GerarJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession sessao = request.getSession();
//		String cep = (String) sessao.getAttribute("CEP");
		
		Random r = new Random();
		Integer numero = r.nextInt(100) + 1;
		Integer numero2 = r.nextInt(10) + 1;
		List<Integer> numeros = new ArrayList();
		numeros.add(numero);
		numeros.add(numero2);
		
		Gson gson = new Gson();
		String json = gson.toJson(numeros);

		
		response.setContentType("application/json");
		response.getWriter().print(json);
	}

}
