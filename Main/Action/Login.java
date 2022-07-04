package Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDAO;
import Modelo.User;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Passei aqui");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		UserDAO userDAO = new UserDAO();
		User user = userDAO.buscarPorNomeSenha(login, senha);
		
		if(user != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", user);
			return "forward:formCompra.jsp";
		} else {
			return "redirect:principal?acao=LoginForm";
		}
		
		
	}

}
