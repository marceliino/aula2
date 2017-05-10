
public class Main {
	
	public static void main(String[]asas) {
		ContaPoupanca cp = new ContaPoupanca();
		ContaEspecial ce = new ContaEspecial();
		
		cp.deposita(321);
		double saldocp = cp.getSaldo();
		System.out.println(saldocp);
		
		ce.deposita(321);
		double saldoce = ce.getSaldo();
		System.out.println(saldoce);
		
	}
}