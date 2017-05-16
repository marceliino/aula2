import java.util.Calendar;

public class ContaBancaria {
	
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected double saldo;
	protected Calendar dataNascimento;
	protected Calendar dataConta;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nomeCliente, String endCliente, String
			cpfCliente) {
			super();
			this.nomeCliente = nomeCliente;
			this.endCliente = endCliente;
			this.cpfCliente = cpfCliente;
			}
	
	public void saque(double valor) throws Exception {
		saldo += valor;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		return result;
	}

	public boolean equals(ContaPoupanca obj) {
		if(obj instanceof ContaPoupanca) {
			ContaPoupanca conta = (ContaPoupanca) obj;
			return conta.cpfCliente.equals(endCliente);
		} else {
			return false;
		}
	
	}
	
	
}