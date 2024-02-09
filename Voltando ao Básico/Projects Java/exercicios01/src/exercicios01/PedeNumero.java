package exercicios01;

import java.util.Scanner;

public class PedeNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor = scan.nextInt();
		
		System.out.println("O valor digitado foi: " + valor);

	}

}
