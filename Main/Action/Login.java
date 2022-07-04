package Action;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDAO;
import Modelo.User;
import Util.JPAUtil;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		EntityManager em = JPAUtil.getEntityManager();
		UserDAO userDAO = new UserDAO(em);
		User user = userDAO.buscarPorNomeSenha(login, senha);
		
		if(user != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", user);
			return "foward:formCompra.jsp";
			
		} else {
			
			return "redirect:principal?acao=LoginForm";
		}
		
		
	}

}
