package polimorfismo;

public class Master {
	public static void main(String[] args) {
//		Mamifero m = new Mamifero();
//		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		
		
//		m.emitirSom();
//		l.emitirSom();
//		c.emitirSom();
		
		c.reagir("aaaa");
		
		c.reagir(false);
		
		c.reagir(19, 0);
	}
}
