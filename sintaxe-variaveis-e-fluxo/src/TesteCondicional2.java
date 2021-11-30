
public class TesteCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade=18;
		int pessoas= 1;
		boolean acompanhado= pessoas >=2;
		
		if(idade >=18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
}
