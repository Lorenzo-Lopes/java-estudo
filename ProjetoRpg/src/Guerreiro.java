
public class Guerreiro extends Heroi {
	
	private String arma;
	
	private boolean escudo;
	
	
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}	
		
	
	public boolean getEscudo() {
		return escudo;
	}
	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
		if(escudo == true) {
			addDefesa(2);
		}
	}
	
	
	
}
