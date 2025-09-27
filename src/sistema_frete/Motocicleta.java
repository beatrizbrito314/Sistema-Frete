package sistema_frete;

public class Motocicleta extends Veiculo implements Fretavel {
	private double distancia;
	public Motocicleta (String placa, int ano, double distancia) {
		super(placa, ano);
		this.distancia=distancia;
	}
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.45;
	}
}


