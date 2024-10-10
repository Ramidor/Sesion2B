package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {
	
	Empleado e;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.e = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculaNominaBrutaVendedorMasPrimas() {
		float expected = 2290;
		float actual = e.calculaNominaBruta(TipoEmpleado.Vendedor, 1500, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaVendedorMenosPrimas() {
		float expected = 2190;
		float actual = e.calculaNominaBruta(TipoEmpleado.Vendedor, 1000, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaVendedorNoPrimas() {
		float expected = 2090;
		float actual = e.calculaNominaBruta(TipoEmpleado.Vendedor, 500, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaEncargadoMasPrimas() {
		float expected = 2790;
		float actual = e.calculaNominaBruta(TipoEmpleado.Encargado, 1500, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaEncargadoMenosPrimas() {
		float expected = 2690;
		float actual = e.calculaNominaBruta(TipoEmpleado.Encargado, 1000, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaEncargadoNoPrimas() {
		float expected = 2590;
		float actual = e.calculaNominaBruta(TipoEmpleado.Encargado, 500, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaOtroMasPrimas() {
		float expected = 290;
		float actual = e.calculaNominaBruta(null, 1500, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaOtroMenosPrimas() {
		float expected = 190;
		float actual = e.calculaNominaBruta(null, 1000, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculaNominaBrutaOtroNoPrimas() {
		float expected = 90;
		float actual = e.calculaNominaBruta(null, 500, 3);
		
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNetaMayor2500() {
		float expected = 2132;
		float actual = e.calculoNominaNeta(2600);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMayor2100() {
		float expected = 1870;
		float actual = e.calculoNominaNeta(2200);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMenor() {
		float expected = 1000;
		float actual = e.calculoNominaNeta(1000);
		
		assertEquals(expected, actual);
	}

}