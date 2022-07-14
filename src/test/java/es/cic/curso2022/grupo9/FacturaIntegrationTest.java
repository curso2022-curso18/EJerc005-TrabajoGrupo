package es.cic.curso2022.grupo9;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class FacturaIntegrationTest {

	private FacturaController facturaController;
	@BeforeEach
	void setUp() throws Exception {
		facturaController = new FacturaController();
		
		FacturaService personaService = new FacturaService();
		facturaController.setfacturaService(personaService);
		
		FacturaRepository personaRepository = new FacturaRepository();
		personaService.setPersonaRepository(personaRepository);
	}

	@Test
	void testCreate() {
		Factura factura = new Factura();
		long id = facturaController.create(factura);
		assertEquals(1,id);
//		assertThrows(UnsupportedOperationException.class, () -> personaController.create(persona));
	}

	@Test
	void testRead() {
		Factura factura = new Factura();
		long id = facturaController.create(factura);
		facturaController.read(id);
		assertNotNull(factura);
	}

	@Test
	void testReadAll() {
		//List<Factura> listaFacturas = new ArrayList();
	}

	@Test
	void testUpdate() {
		Factura factura = new Factura();
		facturaController.update(factura);
		//assertNo
	}

	@Test
	void testDelete() {
		Factura factura = new Factura();
		long id = facturaController.create(factura);
		facturaController.delete(id);
	}

}
