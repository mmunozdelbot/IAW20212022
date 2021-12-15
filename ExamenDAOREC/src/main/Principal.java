package main;

import bean.Fifa;
import dao.FifaDAO;
import dao.FifaDAOListas;

public class Principal {

	public static void main(String[] args) {
		FifaDAO lista = new FifaDAOListas();
		
		Fifa e1 = new Fifa(1, "Sevilla", 1890, 1000,15, true, true, false);
		Fifa e2 = new Fifa(2, "Madrid", 1925, 800,30, true, true, false);
		Fifa e3 = new Fifa(3, "Betis", 1, 1000,10, true, true, false);
		
		lista.nuevoEquipo(e1);
		lista.nuevoEquipo(e2);
		lista.nuevoEquipo(e3);
		System.out.println("-------------------------------------------------------------------");
		lista.borrarEquiposAnyo();
		System.out.println("-------------------------------------------------------------------");
		lista.listarEquipos();
		System.out.println("-------------------------------------------------------------------");
		lista.buscarChampions(20);
		System.out.println("-------------------------------------------------------------------");
		lista.buscarEuropa(20, 100);
		System.out.println("-------------------------------------------------------------------");
		lista.actualizarRanking();
	}

}
