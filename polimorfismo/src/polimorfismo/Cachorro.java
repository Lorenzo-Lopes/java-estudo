package polimorfismo;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("latir");
	}

	
	public void reagir(String frase) {
		if(frase== "toma comida" ||frase == "ola") {
			System.out.println("abanar o rabo");
		}else {
			System.out.println("Rosnar");
		}
		
	}
	
	public void reagir(int hora, int min) {
		if(hora <12) {
			System.out.println("abanar o rabo");
		}else if(hora >=18) {
			System.out.println("ignorar");
		}else {
			System.out.println("abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("abanar o rabo");
		}else {
			System.out.println("rosnar e latir");
		}
		
	}
	
	public void reagir(int idade, double peso) {
		if(idade <5) {
			if(peso<10) {
				System.out.println("abanar");
			}else {
				System.out.println("latir");
			}
		}else {
			if(peso<10) {
				System.out.println("rosnar");
			}else {
				System.out.println("ignorar");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
