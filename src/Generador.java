import static org.junit.Assert.*;

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

	private int[] generarSecuenciaAleatoria(int inicio, int fin) {
	 int numElementos = (inicio > fin ) ? 0 : fin - inicio + 1;
	 
	 int[] secuencia = new int[numElementos];
		return secuencia;
	}

}
