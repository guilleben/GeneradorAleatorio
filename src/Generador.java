import static org.junit.Assert.*;

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
