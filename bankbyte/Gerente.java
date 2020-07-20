package bankbyte;
//a classe Gerente herda da classe Funcionário e
//implementa os métodos da interface Usuario

public class Gerente extends Funcionario implements Usuario{
	private Login login;
	
	public Gerente() {
		this.login = new Login();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.login.autentica(senha);
	}
	
	@Override
	public void setSenha(int senha) {
		this.login.setSenha(senha);
	}

	public double getBonificacao() {
		return super.getSalario();
	}

	
}
