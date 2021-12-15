package poo;

public class Principal {

	public static void main(String[] args) {
		Componente c1 = new Componente(1, "yo", "tarjeta", 50, 2021,2, "PCComponentes", 600);
		
		c1.actualizarEstado();
		System.out.println("-----------------------------------------------------");
		c1.incrementarVentas();
		System.out.println("-----------------------------------------------------");
		c1.rebajarPrecio(50);
		System.out.println("-----------------------------------------------------");
		if(c1.comprobar()) {
			System.out.println("La web es correcta");
		}
	}

}
