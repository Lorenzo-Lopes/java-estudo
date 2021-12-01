
public class CriaHeroi {
	public static void main(String[] args) {
		
		Guerreiro g1 = new Guerreiro();
		g1.setNivel(1);
		g1.setNome("Belegar");
		g1.setRaca("Anâo");
		g1.setTendencia("Leal Bom");
		g1.setArmadura("pesada");
		g1.setEscudo(true);
		g1.setArma("Machado");
		g1.setForca(15);
		g1.setDestreza(8);
		g1.setConstituicao(16);
		g1.setInteligencia(10);
		g1.setSabedoria(12);
		g1.setCarisma(12);
		g1.setHp(10);
		
		
		System.out.println("Meu nome é "+ g1.getNome());
		System.out.println("Sou um "+g1.raca+" Guerreiro");
		System.out.println("Uso como arma um "+g1.getArma()+" e minha armadura é " + g1.getArmadura());
		if(g1.getEscudo()) {
			System.out.println("Para melhorar a defesa uso um escudo.");
		}
		
		
		System.out.println("ESTATISTICAS:");
		System.out.println("FOR: "+(g1.getForca()-10)/2);
		System.out.println("DES:"+(g1.getDestreza()-10)/2);
		System.out.println("CON: "+(g1.getConstituicao()-10)/2);
		System.out.println("INT: "+(g1.getInteligencia()-10)/2);
		System.out.println("SAB: "+(g1.getSabedoria()-10)/2);
		System.out.println("CAR: "+(g1.getCarisma()-10)/2);
		System.out.println("A Clase de Armadura do Heroi: "+ g1.getDefesa());
		System.out.println("O HP do Heroi é de: "+ g1.getHp());
		
		
		
	}
	
}
