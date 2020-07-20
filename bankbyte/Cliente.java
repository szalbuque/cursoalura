package bankbyte;
//implementa os m�todos setSenha e autentica da interface Usuario
//a interface � um tipo de polimorfismo sem heran�a

public class Cliente implements Usuario {
	private String CPF;
	private String nome;
	
	//Este atributo est� sendo criado para evitar a repeti��o de
	//c�digos de implementa��o da interface Usu�rio
	private Login login;
	
	public Cliente() {
		//quando uma inst�ncia de Cliente � criada, internamente
		//uma inst�ncia de Login tamb�m � criada.
		this.login = new Login();
	}
	
	@Override
	public void setSenha(int senha) {
		//quem vai guardar a senha � o objeto login, que � um atributo
		//desta classe Cliente. Isso � uma delega��o da implementa��o do
		//c�digo do m�todo setSenha, que tem que ser feita para implementar
		//a interface Usu�rio
		this.login.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		//a mesma delega��o � feita com o m�todo autentica, ou seja,
		//quem vai implementar esse m�todo � a classe Login
		return this.login.autentica(senha);
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
