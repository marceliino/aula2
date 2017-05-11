
public class ContaPoupanca extends ContaBancaria {
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	private int diaAniversario;
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
	}
	

}
