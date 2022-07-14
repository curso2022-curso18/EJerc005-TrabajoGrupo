package es.cic.curso2022.grupo9;

import java.util.List;

public class CiudadController {
	private CiudadService ciudadService;
	public long create(Ciudad ciudad) {
		return ciudadService.create(ciudad);
	}
	
	public Ciudad read(long Id) {
		return ciudadService.read(Id);
	}
	
	public List<Ciudad> readAll(){
		return ciudadService.readAll();
	}
	
	public void update(Ciudad ciudad) {
		ciudadService.update(ciudad);
	}
	
	public void delete(long Id) {
		ciudadService.delete(Id);
	}
	
	public CiudadService getciudadService() {
		return ciudadService;
	}

	public void setciudadService(CiudadService ciudadService) {
		this.ciudadService = ciudadService;
	}
}
