import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor do seu triangulo: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor do seu triangulo: ");
		int valor2 = scan.nextInt();
		System.out.println("Digite o terceiro valor do seu triangulo: ");
		int valor3 = scan.nextInt();
		
		if((valor1+valor2)>valor3 || (valor1+valor3)>valor2 || (valor3+valor2)>valor1) {
			System.out.println("\n **********************************");
			System.out.println("\n É TRIANGULO\n ");
			
			if(valor1 == valor2 && valor2 == valor3) {
				System.out.println("\n Equilatero");
			}else if(valor1 == valor2 || valor2 == valor3 || valor1==valor3) {
				System.out.println("\n Isosceles");
			}else if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
				System.out.println("\n Escaleno");
			}
		}else {
			System.out.println("*** NÃO É TRIANGULO ***");
		}
		
	}

}
