
public enum TipoCliente {
	
	POTENCIAL(400.000d,5000.00d),
	MEDIO(200.000d,400.000),
	BAIXO(0d, 200.000);
	
	private double valor1;
	private double valor2;
	
	TipoCliente(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double isCompatible(ContaBancaria bancaria) {
		return bancaria.getSaldo();
	}
}