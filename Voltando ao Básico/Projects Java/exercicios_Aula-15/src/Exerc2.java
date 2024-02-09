import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		
		if(valor >= 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
	}

}
