package polimorfismo;

public class Mamifero extends Animal{
	
	private String corDoPelo;
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar() {
		System.out.println("mamando");
	}
	
	@Override
	
	public void emitirSom(){
		System.out.println("som de mamifero");
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	
	
}