package bankbyte;

public class TestaConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(1,10);
		Conta cp = new ContaPoupanca(1,20);
		cc.deposita(100.0);
		cp.deposita(100.00);
		System.out.println("saldo da conta corrente: "+cc.getSaldo());
		System.out.println("saldo da conta poupança: "+cp.getSaldo());
		cc.transfere(50, cp);
		System.out.println("saldo da conta corrente: "+cc.getSaldo());
		System.out.println("saldo da conta poupança: "+cp.getSaldo());
		cc.saca(10.0);
		System.out.println("saldo da conta corrente: "+cc.getSaldo());
	}

}
