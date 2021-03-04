package br.com.zup.editora;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaAutor")
public class ListaAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Autor> autores = banco.getListaAutor();
		
		request.setAttribute("autores", autores);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListaAutores.jsp");
		rd.forward(request, response);
		
	}

}
