
public class ContaPoupanca extends ContaBancaria {
	
	private double saldo = 100.0;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	private int diaAniversario;
	
	@Override
	public void saque(double valor) throws Exception {
		
		
		
		/*if(valor > saldo) {
			throw new Exception("Saldo Insuficiente");
		}
		super.saque(valor);*/
	}
	
	
	
	
	

}
