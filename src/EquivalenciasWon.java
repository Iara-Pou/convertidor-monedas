
public class EquivalenciasWon {
	private double USD = 0.00077;
	private double ARS = 0.16;
	private double EUR = 0.00073;
	private double GBP = 0.00064;
	private double JPY = 0.10;

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
		case "EUR":
			return this.EUR;
		}
		
		return -1;
		//si retorna -1, es error
	}

}
