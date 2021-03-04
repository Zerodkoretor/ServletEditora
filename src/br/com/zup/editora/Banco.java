package br.com.zup.editora;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Autor> listaAutor = new ArrayList<Autor>();
	private static int chaveSequencial = 1;

	static {
		Autor aut = new Autor();
		aut.setId(chaveSequencial++);
		aut.setNome("Autor fantasma");
		aut.setEmail("fantasma@gmail.com");

		listaAutor.add(aut);

	}

	public void adiciona(Autor a) {
		a.setId(chaveSequencial++);
		listaAutor.add(a);
	}

	public List<Autor> getListaAutor() {
		return listaAutor;
	}

	public Autor getAutorPorId(int i) {

		for (int x = 0; x < listaAutor.size(); x++) {

			if (listaAutor.get(x).getId() == i) {
				return listaAutor.get(x);
			}
		}

		return null;

	}
	
	public void removerPorId(int i) {
		
		for(int x=0; x<listaAutor.size(); x++) {
			if(listaAutor.get(x).getId()==i) {
				listaAutor.remove(x);
			}
		}
		
	}

}
