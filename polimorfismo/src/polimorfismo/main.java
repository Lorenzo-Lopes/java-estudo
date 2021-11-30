package polimorfismo;

public class main {
	public static void main (String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru canguru = new Canguru();
		
		m.setCorDoPelo("marrom");
		m.setIdade(5);
		
		
		
//		m.locomover();
//		a.locomover();
//		p.locomover();
//		r.locomover();
		
		canguru.locomover();
		
		
		
		
	}
}
