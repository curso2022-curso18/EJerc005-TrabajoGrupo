package es.cic.curso2022.grupo9;

import java.util.Objects;

public class Ciudad {
	private int cpostal;
    private String poblacion;
    private String estado;
    private String capital;
    private String nombre;
	public int getCpostal() {
		return cpostal;
	}
	public void setCpostal(int cpostal) {
		this.cpostal = cpostal;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(capital, cpostal, estado, nombre, poblacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(capital, other.capital) && cpostal == other.cpostal
				&& Objects.equals(estado, other.estado) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(poblacion, other.poblacion);
	}
}
