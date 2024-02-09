package exercicios01;

import java.util.Scanner;

public class Mmc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Voce é homem ou mulher? h ou m");
		String gener = scan.next();
		
		if(gener.equals("h")) {
			double mmcH = (72.7 * altura)-58; //homem
			System.out.println("Seu peso ideal é como homem: " + mmcH);
			System.out.println("Qual seu peso? ");
			double pesoH = scan.nextDouble();
			
			if(pesoH > mmcH) {
				System.out.println("Voce homem está acima do peso!");
			}else if(pesoH < mmcH) {
				System.out.println("Voce homem está abaixo do peso!");
			}else {
				System.out.println("Voce homem está no limite do peso!");
			}

		}else {
			double mmcM = (62.1 * altura)-44.7; //mulher
			System.out.println("Seu peso ideal é como mulher: " + mmcM);
			System.out.println("Qual seu peso? ");
			double pesoM = scan.nextDouble();
			
			if(pesoM > mmcM) {
				System.out.println("Voce mulher está acima do peso!");
			}else if(pesoM < mmcM) {
				System.out.println("Voce mulher está abaixo do peso!");
			}else {
				System.out.println("Voce mulher está no limite do peso!");
			}

		}
		
		
		
	}

}
