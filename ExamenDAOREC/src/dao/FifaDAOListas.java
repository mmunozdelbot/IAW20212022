package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Fifa;

public class FifaDAOListas implements FifaDAO {
	private List<Fifa> lista_equipos = new ArrayList<Fifa>();
	
	@Override
	public void listarEquipos() {
		for (Fifa fifa : lista_equipos) {
			System.out.println(fifa);
		}
		
	}

	@Override
	public void nuevoEquipo(Fifa e) {
		if (!lista_equipos.contains(e)) {
			lista_equipos.add(e);
			System.out.println("Equipo añadido.");
		}else {
			System.out.println("El equipo "+e+" ya está en la lista");
		}
		
	}

	@Override
	public void borrarEquipos() {
		lista_equipos.clear();
		
	}

	@Override
	public void borrarEquiposAnyo() {
		int contador = 0;
		for (Fifa fifa : lista_equipos) {
			if (fifa.getAnyo()<1930 && fifa.getNumeroAbonados()<1000) {
				lista_equipos.remove(fifa);
				contador++;
			}
		}
		System.out.println("Se han borrado "+contador+" equipos.");
	}

	@Override
	public void buscarChampions(int posicion) {
		for (Fifa fifa : lista_equipos) {
			if (fifa.isChampions() && fifa.getRanking()<posicion) {
				System.out.println(fifa);
			}
		}
		
	}

	@Override
	public void actualizarRanking() {
		for (Fifa fifa : lista_equipos) {
			if (fifa.isChampions()) {
				fifa.setRanking(fifa.getRanking()-10);
				System.out.println("El nuevo rankig del equipo "+fifa.getNombre()+ " es: "+fifa.getRanking());
			}
		}
		
	}

	@Override
	public void buscarEuropa(int posicion, int abonados) {
		for (Fifa fifa : lista_equipos) {
			if (fifa.getRanking()<posicion && fifa.getNumeroAbonados()>abonados) {
				System.out.println(fifa);
			}
		}
		
	}

}
