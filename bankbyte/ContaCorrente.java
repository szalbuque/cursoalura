package bankbyte;

public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero) {
		//o construtor desta classe precisa usar o construtor da classe mãe
		super(agencia,numero);
	}
	//o método abaixo irá sobrescrever o da classe mãe
	//para implementar uma taxa bancária cobrada em cada saque
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
