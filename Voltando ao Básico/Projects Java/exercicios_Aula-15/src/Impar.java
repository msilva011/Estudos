import java.util.Scanner;
public class Impar {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		
		if(valor%2 == 0) {
			System.out.println("\n ******** Par *********");
		}else {
			System.out.println("\n -------- Impar -------");
		}
	}

}
