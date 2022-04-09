package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {

	MatrizAdyacencia matriz = new MatrizAdyacencia(10);
	
	@Test
	void agregarElementoTest() {
		int i = 4;
		int j = 4;
		matriz.agregarElemento(i, j);
		assertTrue(matriz.existeElemento(i, j));;
	}
	
	@Test
	void agregarElementoSimetriaTest() {
		int i = 3;
		int j = 2;
		matriz.agregarElemento(i, j);
		assertTrue(matriz.existeElemento(j, i));;
	}
	
	@Test
	void eliminarElementoTest() {
		int i = 5;
		int j = 3;
		matriz.agregarElemento(i, j);
		matriz.eliminarElemento(i, j);
		assertFalse(matriz.existeElemento(i, j));;
	}

	@Test
	void eliminarElementoSimetricoTest() {
		fail("Implementar punto d");
	}

	@Test
	void contarRelacionesTest() {
		fail("Implementar punto e");
	}

	@Test
	void existenTodosLosElementoTest() {
		fail("Implementar punto f");
	}

	@Test
	void agregarElementoFilaNegativaTest() {
		fail("Implementar punto g");
	}

	@Test
	void agregarElementoColumnaNegativaTest() {
		fail("Implementar punto h");
	}

	@Test
	void agregarElementoFueraRangoTest() {
		fail("Implementar punto i");
	}

}
