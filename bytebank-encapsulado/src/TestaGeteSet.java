
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(45456,1337);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	
	
	Cliente paulo = new Cliente();
	
	paulo.setNome("paulo silveira");
	
	conta.setTitular(paulo);
	System.out.println(conta.getTitular().getNome());
	
	
	
	}
}
