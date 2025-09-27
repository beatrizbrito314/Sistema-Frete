package sistema_frete;

public class Funcionario extends Entregador implements Fretavel  {

	public Funcionario(String nome) {
		super(nome);
	}
	public double calcularCustoFrete(double distanciaEmKm) {
		return 5.0;
	}

}
