
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo=200;
		
		Conta segundaConta = new Conta();
		
		System.out.println(primeiraConta.saldo);
		
		
		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("Numero da conta:" + segundaConta.numero);
		System.out.println("Nome do titular da conta "+segundaConta.titular);
	}
}
