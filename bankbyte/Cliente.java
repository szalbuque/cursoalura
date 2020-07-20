package bankbyte;
//implementa os métodos setSenha e autentica da interface Usuario
//a interface é um tipo de polimorfismo sem herança

public class Cliente implements Usuario {
	private String CPF;
	private String nome;
	
	//Este atributo está sendo criado para evitar a repetição de
	//códigos de implementação da interface Usuário
	private Login login;
	
	public Cliente() {
		//quando uma instância de Cliente é criada, internamente
		//uma instância de Login também é criada.
		this.login = new Login();
	}
	
	@Override
	public void setSenha(int senha) {
		//quem vai guardar a senha é o objeto login, que é um atributo
		//desta classe Cliente. Isso é uma delegação da implementação do
		//código do método setSenha, que tem que ser feita para implementar
		//a interface Usuário
		this.login.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		//a mesma delegação é feita com o método autentica, ou seja,
		//quem vai implementar esse método é a classe Login
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
