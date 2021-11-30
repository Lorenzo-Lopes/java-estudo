
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("marco");
		g1.setCpf("223344123-55");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
}
}
