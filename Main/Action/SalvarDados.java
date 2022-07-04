package Action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SalvarDados implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		String cep = request.getParameter("CEP");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String rua = request.getParameter("rua");
		String numero = request.getParameter("numero");
		
		//Cria cliente;
		//Envia cliente para o banco;
		HttpSession sessao = request.getSession();
		sessao.setAttribute("CEP", cep);
		
		return "forward:EscolheGeração.jsp";
	}

}
