package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {

	MatrizAdyacencia matriz = new MatrizAdyacencia(10);
	
	@Test
	void agregarElementoTest() throws Exception {
		int i = 4;
		int j = 4;
		matriz.agregarElemento(i, j);
		assertTrue(matriz.existeElemento(i, j));;
	}
	
	@Test
	void agregarElementoSimetriaTest() throws Exception {
		int i = 3;
		int j = 2;
		matriz.agregarElemento(i, j);
		assertTrue(matriz.existeElemento(j, i));;
	}
	
	@Test
	void eliminarElementoTest() throws Exception {
		int i = 5;
		int j = 3;
		matriz.agregarElemento(i, j);
		matriz.eliminarElemento(i, j);
		assertFalse(matriz.existeElemento(i, j));;
	}

	@Test
	void eliminarElementoSimetricoTest() throws Exception {
		int i = 5;
		int j = 3;
		matriz.agregarElemento(i, j);
		matriz.eliminarElemento(i, j);
		assertFalse(matriz.existeElemento(i, j));;
		assertFalse(matriz.existeElemento(j, i));;
	}

	@Test
	void contarRelacionesTest() throws Exception {
		int i = 2;
		int j = 3;
		int a = 1;
		int b = 4;
		int c = 1;
		int d = 2;
		matriz.agregarElemento(i, j);
		matriz.agregarElemento(a, b);
		matriz.agregarElemento(c, d);
		assertEquals(matriz.getCantidadElementos(),3);;
	}

	@Test
	void existenTodosLosElementoTest() throws Exception {
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++) {
				if(matriz.existeElemento(i, j) == false) {
					matriz.agregarElemento(i, j);
				}
								
			}
							   
		}
		
		assertEquals(matriz.getCantidadElementos(),50);;	
	}

	@Test
	void agregarElementoFilaNegativaTest() {
		int i = -3;
		int j = 2;
		
		Exception exception = assertThrows(Exception.class, () -> {
			matriz.agregarElemento(i, j);
	    });
		
		assertEquals("Fila Negativa Error", exception.getMessage());
	}

	@Test
	void agregarElementoColumnaNegativaTest() {
		int i = 3;
		int j = -2;
		
		Exception exception = assertThrows(Exception.class, () -> {
			matriz.agregarElemento(i, j);
	    });
		
		assertEquals("Columna Negativa Error", exception.getMessage());
	}

	@Test
	void agregarElementoFueraRangoTest() {
		int i = 4;
		int j = 12;
		
		Exception exception = assertThrows(Exception.class, () -> {
			matriz.agregarElemento(i, j);
	    });
		
		assertEquals("Elemento Fuera de Rango", exception.getMessage());
	}

}
