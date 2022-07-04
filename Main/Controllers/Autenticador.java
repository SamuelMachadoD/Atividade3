package Controllers;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/principal")
public class Autenticador extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String paramAcao = request.getParameter("acao");
		HttpServletRequest Hrequest = (HttpServletRequest)request;
		HttpServletResponse Hresponse = (HttpServletResponse)response;
		HttpSession sessao = Hrequest.getSession();
		boolean naologado = (sessao.getAttribute("usuarioLogado") == null);
		boolean protegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
		
		if (naologado && protegida){
			Hresponse.sendRedirect("principal?acao=LoginForm");
			return;
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
