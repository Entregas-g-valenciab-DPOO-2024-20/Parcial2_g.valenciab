package logica;

import java.util.ArrayList;

public class Parcial {

	public double[] hallarRaices(double a, double b, double c) throws Exception {
	 //ax^2 + bx + c = 0
	//ArrayList<Double> actividadesExistentes = new ArrayList<Double>();
	double calculoP = (-b+(Math.sqrt(Math.pow(b, 2) -(4*a*c))))/(2*a);
	double calculoN = (-b-(Math.sqrt(Math.pow(b, 2) -(4*a*c))))/(2*a);
	double discriminante = Math.pow(b, 2)-(4*a*c);
	if (discriminante == 0){
		double[] unaRespuesta = {calculoP, -1};
		return unaRespuesta;
	}
		else if (discriminante < 0) {
			throw new Exception("Es complejo");
		
		}
	
		else {
			double[] dosRespuestas = {calculoP, calculoN};
			return dosRespuestas;
		}
	}
	
}
