package polimorfismo;

public class Peixe extends Animal{
	public String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("nadando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo subistancias");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Peixe nao faz som");
	}
	
	public void soltarBolha() {
		System.out.println("soltou uma bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
