package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;


public class ParcialTest {
		private Parcial parcial ;

	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void hallarRaicesTest() throws Exception {
		double[] unaRespuesta = {2, -1};
		double[] dosRespuestas = {4, 0};
		assertArrayEquals(unaRespuesta, this.parcial.hallarRaices(1, -4, 4));
		assertArrayEquals(dosRespuestas, this.parcial.hallarRaices(1, -4, 0));
		assertThrows(Exception.class, () -> this.parcial.hallarRaices(3, 2, 1));
	}
}
