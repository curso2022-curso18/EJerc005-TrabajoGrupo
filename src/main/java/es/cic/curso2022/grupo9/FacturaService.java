package es.cic.curso2022.grupo9;

import java.util.List;

public class FacturaService {
	private FacturaRepository facturaRepository;
	public long create(Factura factura) {
		return facturaRepository.create(factura);
	}
	public Factura read(long Id) {
		return facturaRepository.read(Id);
	}
	public List<Factura> readAll(){
		return facturaRepository.readAll();
	}
	public void update(Factura Factura) {
		facturaRepository.update(Factura);
	}
	
	public void delete(long Id) {
		facturaRepository.delete(Id);
	}
	public FacturaRepository getPersonaRepository() {
		return facturaRepository;
	}

	public void setPersonaRepository(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}
}
