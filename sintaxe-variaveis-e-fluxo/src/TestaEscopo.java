
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade=18;
		int pessoas= 2;
		boolean acompanhado;
		
		if(pessoas >=2) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}
		
		System.out.println("o valor da variavel acompanhado é de: "+ acompanhado);
		
		if(idade >=18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
}
