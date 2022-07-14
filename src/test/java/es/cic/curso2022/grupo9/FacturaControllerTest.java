package es.cic.curso2022.grupo9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FacturaControllerTest {

	private FacturaController facturaController;
	private FacturaService facturaService;
	
	@BeforeEach
	void setUp() throws Exception {
		facturaController = new FacturaController();
		this.facturaController = mock(FacturaController.class);
		
		facturaController.setfacturaService(facturaService);
	}

	@Test
	void createTest() {
		Factura factura  = new Factura();
		when(facturaController.create(factura)).thenReturn(42L);
		long idCreado =facturaController.create(factura);
		assertEquals(42,idCreado);
		verify(facturaController, times(1)).create(factura);
	}
	void readTest() {

	}
	void readAllTest() {
		
	}
	void updateTest() {
		
	}
	void deleteTest() {
		
	}

}
