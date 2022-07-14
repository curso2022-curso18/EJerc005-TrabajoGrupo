package es.cic.curso2022.grupo9;

import java.util.Objects;

public class Factura {
	public long id;
	public long tipoPago;
	public int precio;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(long tipoPago) {
		this.tipoPago = tipoPago;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, precio, tipoPago);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return id == other.id && precio == other.precio && tipoPago == other.tipoPago;
	}
	

}
