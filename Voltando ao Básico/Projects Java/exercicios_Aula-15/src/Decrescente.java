import java.util.Scanner;
public class Decrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o primeito valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int valor3 = scan.nextInt();
		
		if(valor1 <= valor2 && valor1 <= valor3) {
			// valor 1 é o menor
			if(valor2<=valor3) {
				// 1- 2- 3
				System.out.println(""+valor1+"- "+valor2+"- "+valor3);
			}else if(valor2>=valor3) {
				// 1- 3- 2
				System.out.println(""+valor1+"- "+valor3+"- "+valor2);
			}
		}else if(valor2<=valor1 && valor2<= valor3) {
			//valor 2 menor
			if(valor1<=valor3) {
				// 2- 1- 3
				System.out.println(""+valor2+"- "+valor1+"- "+valor3);
			}else if(valor3<=valor1) {
				// 2- 3- 1
				System.out.println(""+valor2+"- "+ valor3+"- "+valor1);
			}
		}else if(valor3<= valor1 && valor3<= valor2) {
			//valor 3 menor
			if(valor2<=valor1) {
				// 3- 2- 1
				System.out.println(""+valor3+"- "+valor2+"- "+valor1);
			}else if(valor1<=valor2) {
				// 3- 1- 2
				System.out.println(""+valor3+"- "+valor1+"- "+valor2);
			}
		}
	}
 
}
