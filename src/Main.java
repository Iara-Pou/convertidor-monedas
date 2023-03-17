import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Main {
	
	public static double getMontoOriginal() {
		double montoOriginal = 0;
		boolean inputAceptado = false;
		while (!inputAceptado) {
			try {
				montoOriginal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresá un numero", 0));
				if (montoOriginal == 0) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número mayor a cero.");
				} else {
					inputAceptado = true;
				}

			} catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Debes ingresar un número.");
			};
		}
		return montoOriginal;
	}
	
	public static String getMoneda(boolean esOriginal) {
		String moneda[] = new String[] {"ARS", "USD", "EUR", "JPY", "KRW", "GBP"};
		if(esOriginal) {
			JOptionPane.showMessageDialog(null, "Ingresá la moneda original");
		} else {
			JOptionPane.showMessageDialog(null, "Ingresá la moneda a convertir");
		}
		
		return (String) JOptionPane.showInputDialog(null, "Seleccioná", "MONEDA", JOptionPane.QUESTION_MESSAGE, null, moneda, "ARS");
	}
		
	public static void mostrarResultado(String monedaOriginal, String monedaNueva, double montoOriginal) {
		ConvertidorEquivalencias convertidor = new ConvertidorEquivalencias();
		double totalConversion = convertidor.calcularEquivalencia(monedaOriginal, monedaNueva, montoOriginal);
		
		JOptionPane.showMessageDialog(null, montoOriginal + " " + monedaOriginal + " son " + totalConversion + " " + monedaNueva + "!");
	}

	public static void main(String[] args) {
		double montoOriginal = getMontoOriginal();
		String monedaOriginal = getMoneda(true);
		String monedaNueva = getMoneda(false);
		
			while (monedaOriginal == monedaNueva) {
				JOptionPane.showMessageDialog(null, "Debes ingresar una moneda diferente a la anterior " + monedaOriginal, "ERROR", JOptionPane.ERROR_MESSAGE);
				monedaNueva = getMoneda(false);
			}
			
		mostrarResultado(monedaOriginal, monedaNueva, montoOriginal);
	
	}

	//tantos static?
	//mostrar monedas por su abreviacion en mayus
	//que hayan 2 métodos, cada uno con validaciones correspondientes. Uno que sea get moneda que derive de esos también.


}
