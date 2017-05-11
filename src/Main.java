
public class Main {
	
	public static void main(String[]asas) {
		ContaPoupanca cp = new ContaPoupanca(null, null, null);
		ContaEspecial ce = new ContaEspecial(null, null, null);
		
		cp.deposita(321);
		double saldocp = cp.getSaldo();
		System.out.println(saldocp);
		
		ce.deposita(321);
		double saldoce = ce.getSaldo();
		System.out.println(saldoce);
		
		System.out.println("getTaxaBancaria: " + ce.getTaxaBancaria(5));
		System.out.println("getTaxaBancaria: " + ce.getTaxaBancaria(30,5));
		
		ContaBancaria c1 = new ContaBancaria();
		c1.deposita(100);
		System.out.println(ClassificacaoClientes.BAIXO.isCompatible(c1));
		System.out.println(ClassificacaoClientes.MEDIO.isCompatible(c1));
		System.out.println(ClassificacaoClientes.POTENCIAL.isCompatible(c1));
		
	}
}