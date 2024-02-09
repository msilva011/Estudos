package aula16_Exercicios;
import java.util.Scanner;

public class Habitantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int habA, habB, i=0;
		double taxaA, taxaB;
		boolean valid=false;
		double resultA=0, resultB=0;

		
		System.out.println("******Informe os paremetros população e taxa de crescimento******\n");
		
		do {
			System.out.println("\nHabitantes A: ");
			habA = scan.nextInt();
			
			if(habA > 0) {
				valid=true;
			}else {
				System.out.println("Habitante invalidos!!!");
			}
			
		}while(!valid);
		
		valid=false;
		
		do {
			System.out.println("\nTaxa A: ");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valid=true;
			}else {
				System.out.println("Taxa invalida!!!");
			}
			
		}while(!valid);
		
		do {
			System.out.println("\nHabitantes B: ");
			habB = scan.nextInt();
			
			if(habB > 0) {
				valid=true;
			}else {
				System.out.println("Habitante invalidos B!!!");
			}
			
		}while(!valid);
		
		valid=false;
		
		do {
			System.out.println("\nTaxa B: ");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valid=true;
			}else {
				System.out.println("Taxa invalida B!!!");
			}
			
		}while(!valid);
		
		while(habA < habB) {
			i++;
			habA +=(habA * taxaA);
			habB +=(habB * taxaB);
		}
		
		System.out.println("\nHabitantes A: "+ habB + "\nHabitantes B: "+habB+"\nAnos: "+i);		
	}

}
