package sistema_frete;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Funcionario funcionario1=new Funcionario("Mike");
		Carro carro1=new Carro("222", 2025);
		List<Fretavel> entrega1 = new ArrayList<>();
        entrega1.add(funcionario1);
        entrega1.add(carro1);
		ServicoDeEntrega servico1= new ServicoDeEntrega(entrega1);
		double frete1=servico1.calcularCustoTotal(10.0);
		System.out.println("O valor do frete1 é:"+ frete1);
		
		Autonomo autonomo2=new Autonomo("Mallu");
		//System.out.println(autonomo2.calcularCustoFrete(25.0));
		Motocicleta moto2=new Motocicleta("222", 2025);
		//System.out.println(moto2.calcularCustoFrete(25.0));
		List<Fretavel> entrega2 = new ArrayList<>();
        entrega2.add(autonomo2);
        entrega2.add(moto2);
		ServicoDeEntrega servico2= new ServicoDeEntrega(entrega2);
		double frete2=servico2.calcularCustoTotal(25.0);
		System.out.println("O valor do frete2 é:"+ frete2);
		
		
		
		

	}

}
