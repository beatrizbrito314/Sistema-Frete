package sistema_frete;

public class Carro extends Veiculo implements Fretavel {
	private double distancia;
	public Carro(String placa, int ano, double distancia) {
		super(placa, ano);
		this.distancia=distancia;
	}
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 1.25;
	}
}
