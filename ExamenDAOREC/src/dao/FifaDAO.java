package dao;

import bean.Fifa;

public interface FifaDAO {

	public void listarEquipos();
	public void nuevoEquipo(Fifa e);
	public void borrarEquipos();
	public void borrarEquiposAnyo();
	public void buscarChampions(int posicion);
	public void buscarEuropa(int posicion, int abonados);
	public void actualizarRanking();
}
