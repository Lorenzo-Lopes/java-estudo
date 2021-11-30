
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade=15;
		int pessoas = 1;
		if(idade>=18) {
			System.out.println("Voce é maior de idade");
		}
		
		else {
			if(pessoas >= 2) {
				System.out.println("Voce é menor de idade, mas pode entrar pois esta acompanhado.");
			}
			else {
				System.out.println("voce é menor de idade e nao vai poder entrar");
			}
		}
		
	}
	
	
}
