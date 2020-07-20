package bankbyte;

public class ControleBonificacao {
	private double soma;
	
	public void setSoma(double valor) {
		soma += valor;
	}
	
	public double getSoma() {
		return soma;
	}

	public void registra (Funcionario f) {
		soma += f.getBonificacao();
	}
}
