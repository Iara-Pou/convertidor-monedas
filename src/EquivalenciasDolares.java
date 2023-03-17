
public class EquivalenciasDolares {

	private double ARS = 202.94;
	private double EUR = 0.94;
	private double JPY = 133.50;
	private double GBP = 0.83;
	private double KRW = 1304.70;
	
	public double getEquivalencia(String monedaRequerida) {
		switch (monedaRequerida) {
		case "ARS":
			return this.ARS;
		case "EUR":
			return this.EUR;
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
