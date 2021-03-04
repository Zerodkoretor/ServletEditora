package br.com.zup.editora;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mostraAutor")
public class MostraAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		int id = Integer.valueOf(idString);
		
		Banco banco = new Banco();
		Autor aut = banco.getAutorPorId(id);
		
		request.setAttribute("autor", aut);
		
		RequestDispatcher rd = request.getRequestDispatcher("/FormAlteraAutor.jsp");
		rd.forward(request, response);
		
	}

}
