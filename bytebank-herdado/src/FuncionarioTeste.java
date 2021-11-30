
public class FuncionarioTeste {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; //0- funcionario -- 2- gerente -- 3 - diretor
	
	public FuncionarioTeste() {
		
	}
	
	public double getBonificacao() {
		if ( tipo == 0) {
		return this.salario= salario*0.10;
		}else if (tipo == 1) {
			return this.salario;
		}else {
			return this.salario= salario+1000.00;
		}
	}	
	
	
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getTipo() {
		return tipo;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
