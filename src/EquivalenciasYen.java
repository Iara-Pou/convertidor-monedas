
public class EquivalenciasYen {
	private double USD = 0.0075;
	private double ARS = 1.52;
	private double EUR = 0.0071;
	private double GBP = 0.0062;
	private double KRW = 9.77;

	public double getEquivalencia(String monedaRequerida) {
		switch (monedaRequerida) {
		case "ARS":
			return this.ARS;
		case "USD":
			return this.USD;
		case "KRW":
			return this.KRW;
		case "GBP":
			return this.GBP;
		case "EUR":
			return this.EUR;
		}
		
		return -1;
		//si retorna -1, es error
	}

}
