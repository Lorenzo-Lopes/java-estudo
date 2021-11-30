

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo=100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		conta.saca(20);
		
		System.out.println(conta.saldo);
		
		
		
		Conta contaDaMarcela =new Conta();
		contaDaMarcela.saldo = 1000;
		
		contaDaMarcela.transfere(250,conta);
		
		System.out.println("O saldo da Marcela é: "+contaDaMarcela.saldo );
		System.out.println("O saldo a conta 1: "+conta.saldo);
	}
}
