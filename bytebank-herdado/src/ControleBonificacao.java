

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma= this.soma+boni;
		
		System.out.println(soma);
		
	}
	
	public double getSoma() {
		return soma;
	}
}
