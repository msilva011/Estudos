package exercicios01;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("QUantas horas trabalhou? ");
		double horas = scan.nextDouble();
		
		double salario = ganhoHora * horas;
		double ir = salario * 0.11;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		double salarioLiq = salario - (ir + inss + sindicato);
		
		System.out.println("Seu salário bruto é: " + salario);
		System.out.println("Pago IR: " + ir);
		System.out.println("Pago INSS: " + inss);
		System.out.println("Pago sindicato: " + sindicato);
		System.out.println("Salario liquido: " + salarioLiq);
		
	}

}
