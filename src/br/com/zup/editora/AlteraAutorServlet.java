package br.com.zup.editora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/alteraAutor")
public class AlteraAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String idString = request.getParameter("id");
		
		int id = Integer.valueOf(idString);
		
		Banco banco = new Banco();
		Autor aut = banco.getAutorPorId(id);
		
		aut.setNome(nome);
		aut.setEmail(email);
		
		response.sendRedirect("listaAutor");
		
	}

}
