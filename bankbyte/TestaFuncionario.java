package bankbyte;

public class TestaFuncionario {
	public static void main (String[] args) {
		
	
		Gerente ger = new Gerente();
		ger.setNome("Pedro");
		ger.setSalario(5000.0);
		ger.setCpf("23232323");
		ger.setSenha(2222);
		System.out.println("Nome do gerente: "+ger.getNome());
		System.out.println("Salário do gerente: "+ ger.getSalario());
		System.out.println("CPF do gerente: "+ger.getCpf());
		System.out.println("Testa senha 2222: "+ger.autentica(2222));
		System.out.println("Bonificação do gerente: "+ger.getBonificacao());
	}
}
