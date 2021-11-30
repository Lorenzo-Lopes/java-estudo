package polimorfismo;


public class Reptil extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("rantejando");
	}
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}
	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
	}

}
