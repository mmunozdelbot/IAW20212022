package poo;

import java.util.Objects;

public class Componente {
	
	private int codigo;
	private String comercial;
	private String componente;
	private double precio;
	private int anyo;
	private int estado;
	private String web;
	private int numeroVentas;
	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Componente(int codigo, String comercial, String componente, double precio, int anyo, int estado, String web,
			int numeroVentas) {
		super();
		this.codigo = codigo;
		this.comercial = comercial;
		this.componente = componente;
		this.precio = precio;
		this.anyo = anyo;
		this.estado = estado;
		this.web = web;
		this.numeroVentas = numeroVentas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getComercial() {
		return comercial;
	}
	public void setComercial(String comercial) {
		this.comercial = comercial;
	}
	public String getComponente() {
		return componente;
	}
	public void setComponente(String componente) {
		this.componente = componente;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getNumeroVentas() {
		return numeroVentas;
	}
	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}
	@Override
	public String toString() {
		return "Componente [codigo=" + codigo + ", comercial=" + comercial + ", componente=" + componente + ", precio="
				+ precio + ", anyo=" + anyo + ", estado=" + estado + ", web=" + web + ", numeroVentas=" + numeroVentas
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anyo, codigo, comercial, componente, estado, numeroVentas, precio, web);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Componente other = (Componente) obj;
		return anyo == other.anyo && codigo == other.codigo && Objects.equals(comercial, other.comercial)
				&& Objects.equals(componente, other.componente) && estado == other.estado
				&& numeroVentas == other.numeroVentas
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(web, other.web);
	}
	
	public void actualizarEstado() {
		if (this.numeroVentas>1000) {
			this.setEstado(2);
		}else if (this.numeroVentas<=1000 && this.numeroVentas>500) {
			this.setEstado(1);
		}else {
			this.setEstado(0);
		}
		System.out.println("Estado actualizado.");
	}
	
	public void incrementarVentas() {
		if (this.anyo==2021) {
			this.setNumeroVentas(numeroVentas+1);
		}
		System.out.println("El numero de ventas es: "+this.numeroVentas);
	}
	
	public void rebajarPrecio(double porcentaje) {
		if (this.anyo<2010 && this.componente.equalsIgnoreCase("peluche")) {
			this.precio = this.precio - this.precio*(porcentaje/100);
		}
		System.out.println("El nuevo precio es: "+this.precio);
	}
	
	public boolean comprobar() {
		if (this.web.equalsIgnoreCase("Amazon") || this.web.equalsIgnoreCase("PCComponentes") 
				||this.web.equalsIgnoreCase("MediaMarkt")) {
			return true;
		}else {
			return false;
		}
	}
	
}
