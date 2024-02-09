package exercicios01;

import java.util.Scanner;

public class ConversaoTemp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Dê o valor em Fahrenheit: ");
		double tempF = scan.nextDouble();
		
		double celsius = (5 * (tempF-32)/9);
		
		System.out.println("A temperatura em celsius é: " + celsius);
	}

}
