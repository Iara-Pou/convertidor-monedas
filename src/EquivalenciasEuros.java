
public class EquivalenciasEuros {

	private double USD = 1.06;
	private double ARS = 215.48;
	private double JPY = 141.64;
	private double GBP = 0.88;
	private double KRW = 1384.84;

	public double getEquivalencia(String monedaRequerida) {
		switch (monedaRequerida) {
		case "ARS":
			return this.ARS;
		case "USD":
			return this.USD;
		case "JPY":
			return this.JPY;
		case "GBP":
			return this.GBP;
		case "KRW":
			return this.KRW;
		}
		
		return -1;
		//si retorna -1, es error
	}

}
