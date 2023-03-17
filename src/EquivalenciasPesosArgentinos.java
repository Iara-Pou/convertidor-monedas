
public class EquivalenciasPesosArgentinos {
	private double USD = 0.0049;
	private double EUR = 0.0046;
	private double JPY = 0.66;
	private double GBP = 0.0041;
	private double KRW = 6.42;

	public double getEquivalencia(String monedaRequerida) {
		switch (monedaRequerida) {
		case "KRW":
			return this.KRW;
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
