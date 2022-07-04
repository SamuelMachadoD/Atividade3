package Action;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import com.google.gson.Gson;

@WebServlet("/GerarJSON")
public class GerarJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession sessao = request.getSession();
//		String cep = (String) sessao.getAttribute("CEP");
		
		Random r = new Random();

		Double frete = (r.nextInt(100) + 1)/100.0;
		int prazo = r.nextInt(10) + 1;
		JSONObject my_obj = new JSONObject();
		my_obj.put("Frete", frete);
		my_obj.put("Prazo de entrega", prazo);
		String json_string = my_obj.toString();
//		List<Integer> numeros = new ArrayList();
//		numeros.add(numero);
//		numeros.add(numero2);
//		
//		Gson gson = new Gson();
//		String json = gson.toJson(numeros);

		
		response.setContentType("application/json");
		response.getWriter().print(json_string);
	}

}
