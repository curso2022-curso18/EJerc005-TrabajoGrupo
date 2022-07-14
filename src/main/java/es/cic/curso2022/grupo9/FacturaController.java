package es.cic.curso2022.grupo9;

import java.util.List;

public class FacturaController {
	private FacturaService facturaService;
	
	public long create(Factura factura) {
		return facturaService.create(factura);
	}
	
	public Factura read(long Id) {
		return facturaService.read(Id);
	}
	
	public List<Factura> readAll(){
		return facturaService.readAll();
	}
	
	public void update(Factura factura) {
		facturaService.update(factura);
	}
	
	public void delete(long Id) {
		facturaService.delete(Id);
	}
	
	public FacturaService getfacturaService() {
		return facturaService;
	}

	public void setfacturaService(FacturaService facturaService) {
		this.facturaService = facturaService;
	}
}
