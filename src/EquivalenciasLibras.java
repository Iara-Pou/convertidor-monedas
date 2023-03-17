
public class EquivalenciasLibras {
	private double USD = 1.22;
	private double ARS = 247.85;
	private double EUR = 1.14;
	private double JPY = 160.68;
	private double KRW = 1591.87;

	public double getEquivalencia(String monedaRequerida) {
		switch (monedaRequerida) {
		case "ARS":
			return this.ARS;
		case "USD":
			return this.USD;
		case "KRW":
			return this.KRW;
		case "JPY":
			return this.JPY;
		case "EUR":
			return this.EUR;
		}
		
		return -1;
		//si retorna -1, es error
	}

}
