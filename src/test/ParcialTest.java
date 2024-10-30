package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;


public class ParcialTest {
	private long p = 999998727899999L;
	private Parcial parcial ;

	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void hallarRaicesTest() throws Exception {
		assertArrayEquals(double[] unaRespuesta = {0, 0}, this.parcial.hallarRaices(1, 2, 1));
		assertEquals(5.0, this.parcial.hallarRaices(1, 2, 1));
		assertThrows(Exception.class, () -> this.parcial.hallarRaices(3, 2, 1));
	}
}
