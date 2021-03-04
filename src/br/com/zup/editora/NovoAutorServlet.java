package br.com.zup.editora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoAutor")
public class NovoAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeAutor = request.getParameter("nome");
		String emailAutor = request.getParameter("email");
		
		Autor aut = new Autor();
		aut.setNome(nomeAutor);
		aut.setEmail(emailAutor);
		
		Banco banco = new Banco();
		banco.adiciona(aut);
		
		request.setAttribute("autor", aut.getNome() );
		response.sendRedirect("listaAutor");
		
		
	}

}
