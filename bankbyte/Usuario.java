package bankbyte;
//numa interface n�o pode haver nada concreto
//a classe que implementa uma interface precisa implementar
//concretamente os seus m�todos

public abstract interface Usuario{

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}