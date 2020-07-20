package bankbyte;

public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero) {
		//o construtor desta classe precisa usar o construtor da classe m�e
		super(agencia,numero);
	}
	//o m�todo abaixo ir� sobrescrever o da classe m�e
	//para implementar uma taxa banc�ria cobrada em cada saque
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
