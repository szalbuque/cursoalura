package bankbyte;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total=0;
	
	public Conta (int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 1;
		System.out.println("Estou criando uma conta nova. Ag./Num/Saldo = "+this.agencia+"/"+this.numero+"/"+this.saldo);
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencio(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta contaDestino) {
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		} else {
			return false;
			
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void mostraSaldo () {
		System.out.println("Saldo da conta de "+ getTitular().getNome() + " = "+getSaldo());
	}
	
}