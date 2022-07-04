package Action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.PessoaDAO;
import Dao.UserDAO;
import Modelo.Pessoa;
import Modelo.User;
import Util.JPAUtil;

public class SalvarDados implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		EntityManager em = JPAUtil.getEntityManager();
		PessoaDAO DAO = new PessoaDAO(em);
		
		String nome = request.getParameter("nome");
		String cep = request.getParameter("CEP");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String rua = request.getParameter("rua");
		String numero = request.getParameter("numero");
		
		if(cep.length() > 8 || cep.length() < 8) {
			return "foward:formCompra.jsp";
		}
		Pessoa pessoa = new Pessoa(nome,cep,estado,cidade,rua,numero);
		
		em.getTransaction().begin();
		DAO.cadastrar(pessoa);
		em.getTransaction().commit();
		em.close();
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("CEP", cep);
		
		return "foward:EscolheGeração.jsp";
	}

}
