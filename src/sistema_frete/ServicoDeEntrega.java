package sistema_frete;

import java.util.List;

public class ServicoDeEntrega {
	public List<Fretavel> entregas;//arazena classes que implementam essa interface
	double somaCusto;
	public ServicoDeEntrega(List<Fretavel> entregas) {
	        this.entregas = entregas;
	    }
	 public double calcularCustoTotal(double distancia) {
	        somaCusto = 0.0; // zera a soma antes do cálculo
	        for (Fretavel item : entregas) {
	            somaCusto += item.calcularCustoFrete(distancia); // chama o método da interface
	        }
	        return somaCusto;
	    }
	 }

