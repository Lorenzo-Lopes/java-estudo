
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		
		nico.setNome("nico steppat");
		nico.setCpf("111222333-44");
		nico.setSalario(2000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getSalario());
		
		System.out.println("A Bonificação de  Nico esse mês foi de: "+ nico.getBonificacao());
		
		nico.salario=2110;
		
		System.out.println(nico.getSalario());
		
		
		
	}

}
