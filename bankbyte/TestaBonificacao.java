package bankbyte;

public class TestaBonificacao {
	public static void main (String[] args) {
		ControleBonificacao controle = new ControleBonificacao();
		
		Funcionario g = new Gerente();
		
		g.setNome("Ana");
		g.setSalario(1000.0);
		
		controle.registra(g);
		
		System.out.println("Sal�rio de "+g.getNome()+" = "+g.getSalario());
		System.out.println("Bonifica��o = " + g.getBonificacao());
		System.out.println("Total de bonifica��es: "+controle.getSoma());
	}

}
