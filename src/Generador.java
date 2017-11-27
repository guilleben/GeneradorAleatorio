import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class Generador {
	private Generador generador;

	@Before
	public void setUp()  {
		generador = new Generador();
	}

	@Test
	public void un_rango_vacio_genera_una_secuancia_vacia() {
		int[] secuencia = generador.generarSecuenciaAleatoria(3, 1);
		
		assertEquals(0, secuencia.length);
		
	}
	
	@Test
	public void un_rango_de_un_elemento_genera_una_secuncia_con_ese_elemento() {
		int[] secuencia = generador.generarSecuenciaAleatoria(3, 3);
		
		assertEquals(1, secuencia.length);
		assertEquals(3, secuencia[0]);
		
	}
	
	@Test 
	public void un_rango_de_n_elementos_devuelve_una_secuencia_de_n_elementos_en_cualquier_orden() {
		int[] secuencia = generador.generarSecuenciaAleatoria(2, 14);
		
		assertEquals(13, secuencia.length);
		Arrays.sort(secuencia);
		assertEquals(2, secuencia[0]);
		assertEquals(5, secuencia[3]);
		assertEquals(14, secuencia[12]);
		
	}
	
	
	

	private int[] generarSecuenciaAleatoria(int inicio, int fin) {
	 int numElementos = (inicio > fin ) ? 0 : fin - inicio + 1;
	 
	 int[] secuencia = new int[numElementos];
	 Random rnd = new Random();
	 for (int i = 0; i < numElementos; i++){
		 int puntoDeInsercion = rnd.nextInt(i + 1);
		 secuencia[i] = secuencia[puntoDeInsercion];
		 secuencia[puntoDeInsercion] = inicio + i;
	 }
		return secuencia;
	}

}
