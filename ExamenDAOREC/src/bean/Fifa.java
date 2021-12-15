package bean;

import java.io.Serializable;
import java.util.Objects;

public class Fifa implements Serializable {
	private int codigo;
	private String nombre;
	private int anyo;
	private int numeroAbonados;
	private int ranking;
	private boolean champions;
	private boolean europa;
	private boolean conference;
	public Fifa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fifa(int codigo, String nombre, int anyo, int numeroAbonados, int ranking, boolean champions, boolean europa,
			boolean conference) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.anyo = anyo;
		this.numeroAbonados = numeroAbonados;
		this.ranking = ranking;
		this.champions = champions;
		this.europa = europa;
		this.conference = conference;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public int getNumeroAbonados() {
		return numeroAbonados;
	}
	public void setNumeroAbonados(int numeroAbonados) {
		this.numeroAbonados = numeroAbonados;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public boolean isChampions() {
		return champions;
	}
	public void setChampions(boolean champions) {
		this.champions = champions;
	}
	public boolean isEuropa() {
		return europa;
	}
	public void setEuropa(boolean europa) {
		this.europa = europa;
	}
	public boolean isConference() {
		return conference;
	}
	public void setConference(boolean conference) {
		this.conference = conference;
	}
	@Override
	public String toString() {
		return "Fifa [codigo=" + codigo + ", nombre=" + nombre + ", anyo=" + anyo + ", numeroAbonados=" + numeroAbonados
				+ ", ranking=" + ranking + ", champions=" + champions + ", europa=" + europa + ", conference="
				+ conference + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anyo, champions, codigo, conference, europa, nombre, numeroAbonados, ranking);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fifa other = (Fifa) obj;
		return anyo == other.anyo && champions == other.champions && codigo == other.codigo
				&& conference == other.conference && europa == other.europa && Objects.equals(nombre, other.nombre)
				&& numeroAbonados == other.numeroAbonados && ranking == other.ranking;
	}
	
	
	
	
	
	
}
