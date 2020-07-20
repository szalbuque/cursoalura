package bankbyte;

public class Administrador extends Funcionario implements Usuario{

	private Login login;
	
	public Administrador() {
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
