

	public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
		
		public Conta(int agencia, int numero) {
			total++;
			//System.out.println("o total de conta do banco é: "+total);
			this.agencia=agencia;
			this.numero=numero;
			
			System.out.println("construindo uma conta, numero: "+this.numero+"  Agencia: "+this.agencia);
		}
		
		void deposita(double valor){
			this.saldo+= valor;
		}
		
		public boolean saca(double valor) {
			if(this.saldo >= valor) {
				this.saldo-=valor;
				return true;
			}else	
			return false;
			
		}
		
		public boolean transfere(double valor,Conta destino) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.saldo += valor;
				return true;
			}
			else {
				System.out.println("Nao foi possivel transferir, operação cancelada");
			return false;
			}
		}
		
		public double getSaldo() {
			return this.saldo;
			
		}
		
		public int getNumero() {
			
			return this.numero;
		}
		
		public void setNumero(int numero) {
			if(numero <=0 ) {
				System.out.println("o numero da conta é invalido, favor vaerificar");
				return;
			}else {
			this.numero = numero;
			}
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			if(agencia <=0 ) {
				System.out.println("o numero da agencia é invalido, favor vaerificar");
				return;
			}else {
			this.agencia = agencia;
			}
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public static int getTotal() {
			return total;
		}
		
	}
