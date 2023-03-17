
public class ConvertidorEquivalencias {

	private EquivalenciasPesosArgentinos ARS = new EquivalenciasPesosArgentinos();
	private EquivalenciasDolares USD = new EquivalenciasDolares();
	private EquivalenciasEuros EUR = new EquivalenciasEuros();
	private EquivalenciasYen JPY = new EquivalenciasYen();
	private EquivalenciasWon KRW = new EquivalenciasWon();
	private EquivalenciasLibras GBP = new EquivalenciasLibras();

	public double calcularEquivalencia(String monedaOriginal, String monedaRequerida, double montoOriginal) {
		double equivalencia = getEquivalencia(monedaOriginal, monedaRequerida) * montoOriginal;
		double equivalenciaDosDecimales = Math.round(equivalencia * 100.0) / 100.0;
		return equivalenciaDosDecimales;
	}
	
	private double getEquivalencia(String monedaOriginal, String monedaRequerida) {

		switch (monedaOriginal) {
		case "ARS":
			return this.ARS.getEquivalencia(monedaRequerida);
		case "USD":
			return this.USD.getEquivalencia(monedaRequerida);
		case "EUR":
			return this.EUR.getEquivalencia(monedaRequerida);
		case "GBP":
			return this.GBP.getEquivalencia(monedaRequerida);
		case "JPY":
			return this.JPY.getEquivalencia(monedaRequerida);
		case "KRW":
			return this.KRW.getEquivalencia(monedaRequerida);
		default:
			return -1;
		}
	}

	//
}
