package es.cic.curso2022.grupo9;

import java.util.List;

public class CiudadService {
	private CiudadRepository ciudadRepository;
	public long create(Ciudad Ciudad) {
		return ciudadRepository.create(Ciudad);
	}
	
	public Ciudad read(long Id) {
		return ciudadRepository.read(Id);
	}
	
	public List<Ciudad> readAll(){
		return ciudadRepository.readAll();
	}
	
	public void update(Ciudad CIudad) {
		ciudadRepository.update(CIudad);
	}
	
	public void delete(long Id) {
		ciudadRepository.delete(Id);
	}
	
	public CiudadRepository getCIudadRepository() {
		return ciudadRepository;
	}

	public void setCIudadRepository(CiudadRepository ciudadRepository) {
		this.ciudadRepository = ciudadRepository;
	}
}
