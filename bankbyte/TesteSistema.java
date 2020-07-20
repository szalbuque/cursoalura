package bankbyte;

public class TesteSistema {

	public static void main(String[] args) {
		Usuario g = new Gerente();
		Usuario a = new Administrador();
		g.setSenha(1212);
		a.setSenha(2222);

		SistemaInterno si = new SistemaInterno();

		si.autentica(g);
		si.autentica(a);

	}

}
