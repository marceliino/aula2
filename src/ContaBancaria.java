
public class ContaBancaria {
	
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected double saldo;
	
	public ContaBancaria(String nomeCliente, String endCliente, String
			cpfCliente) {
			super();
			this.nomeCliente = nomeCliente;
			this.endCliente = endCliente;
			this.cpfCliente = cpfCliente;
			}
	
	public void saque(double valor) {
		saldo += valor;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}