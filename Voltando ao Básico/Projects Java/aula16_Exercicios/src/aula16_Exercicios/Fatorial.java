package aula16_Exercicios;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value, i;
		
		System.out.println("Digite um valor para fatorar: ");
		value = scan.nextInt();
		
		System.out.println("O fatorial de "+value+":");
		
		for(i=value-1; i>0 ;i--) {
		
			value = value*i;

		}
		System.out.println("\n"+value);
		
	}

}
