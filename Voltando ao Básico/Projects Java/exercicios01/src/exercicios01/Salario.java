package exercicios01;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("QUantas horas trabalhou? ");
		double horas = scan.nextDouble();
		
		double salario = ganhoHora * horas;
		
		System.out.println("Seu salário é: " + salario);
		
	}

}
