
public class Aliquota {
	public static void main(String[] args) {
		
		double salario = 3300;	
		if(salario <1900 || salario >4664 ) {
			System.out.println("o valor do salario esta fora do alcance do programa");
		}else if(salario >= 1900 && salario <=2800){
			System.out.println("O IR é de 7.5% e pode deduzir da declaração o valor de R$142,00");
		}else if(salario> 2800 && salario <=3751) {
			System.out.println("O IR é de 15% e pode deduzir da declaração o valor de R$350,00");
		}else if(salario > 3751 && salario<=4664){
			System.out.println("O IR é de 22.5% e pode deduzir da declaração o valor de R$636,00");
		}
			
	}
}
