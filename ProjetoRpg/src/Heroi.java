
public abstract class Heroi {
	protected String nome;
	protected String raca;
	protected String tendencia;
	protected int nivel;
	protected int hp;
	protected int defesa;
	private String armadura;
	
	
	

	protected int forca;
	protected int destreza;
	protected int constituicao;
	protected int inteligencia;
	protected int sabedoria;
	protected int carisma;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getTendencia() {
		return tendencia;
	}
	public void setTendencia(String tendencia) {
		this.tendencia = tendencia;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(int constituição) {
		this.constituicao = constituição;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int x) {
		this.hp += (x +((constituicao-10)/2));
		
	}
	
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public void setDefesa(int defesa) {
		this.defesa += defesa;
	}
	public int getDefesa() {
		return defesa;
	}
	
	public void addDefesa(int pontoDefesa){
		this.defesa += pontoDefesa;
	}
	public void setArmadura(String armadura) {
		this.armadura = armadura;
		if(armadura == "leve") {
			setDefesa(6);
		}else if(armadura =="media") {
			setDefesa(9);
		}else if(armadura == "pesada") {
			setDefesa(12);
		}else {
			setDefesa(0);
		}
	}
	public String getArmadura() {
		return armadura;
	}
}
