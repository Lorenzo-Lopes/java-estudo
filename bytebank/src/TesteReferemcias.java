

public class TesteReferemcias {
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo=300;
		
		System.out.println("Saldo da primeira conta: "+ primeiraconta.saldo);
		
		System.out.println(primeiraconta);
	}
}
