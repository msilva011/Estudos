import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite um segundo valor: ");
		int valor2 = scan.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("Maior valor é: "+ valor1);
		}else if(valor1<valor2) {
			System.out.println("Maior valor é: " + valor2);
			
		}else if (valor1 == valor2) {
			System.out.println("Valores iguais!");
		}
	}

}
