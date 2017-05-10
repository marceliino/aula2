
public class ContaEspecial extends ContaBancaria {
	
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
}