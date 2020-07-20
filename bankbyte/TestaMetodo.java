package bankbyte;

public class TestaMetodo {
	public static void main (String[] args) {
		ContaCorrente contaDoPaulo = new ContaCorrente(10,2020);
		System.out.println(Conta.getTotal());
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		contaDoPaulo.setTitular(paulo);
		ContaPoupanca contaDaAna = new ContaPoupanca(10,3030);
		System.out.println(Conta.getTotal());
		Cliente ana = new Cliente();
		ana.setNome("Ana");
		contaDaAna.setTitular(ana);
		contaDoPaulo.deposita(100);
		contaDaAna.deposita(100);
		contaDoPaulo.mostraSaldo();
		contaDaAna.mostraSaldo();
		contaDoPaulo.deposita(200);
		contaDaAna.deposita(300);
		contaDoPaulo.mostraSaldo();
		contaDaAna.mostraSaldo();
		contaDoPaulo.saca(50);
		contaDaAna.saca(50);
		contaDoPaulo.mostraSaldo();
		contaDaAna.mostraSaldo();
		contaDoPaulo.transfere(50, contaDaAna);
		contaDoPaulo.mostraSaldo();
		contaDaAna.mostraSaldo();
	}
}
