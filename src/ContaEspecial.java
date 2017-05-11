
public class ContaEspecial extends ContaBancaria {
	
	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	@Override
	public void saque(double valor) {
		valor = valor - (valor * 0.1d);
		super.saque(valor);
	}
	
	@Override
	public void deposita(double valor) {
		valor = valor - (valor * 0.1d);
		super.deposita(valor);
	}
	
	public int getTaxaBancaria() {
		return 1;
	}
	public int getTaxaBancaria(int dias) {
		return this.getTaxaBancaria() * dias;
	}
	public int getTaxaBancaria(int dias, int meses) {
		return this.getTaxaBancaria(dias+meses*30);
	}
	
	
}