package exercicios01;

import java.util.Scanner;

public class ConversaoCels {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Dê o valor em Celsius: ");
		double tempC = scan.nextDouble();
		
		double fahrenheit = (tempC *1.8+32);
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}

}
