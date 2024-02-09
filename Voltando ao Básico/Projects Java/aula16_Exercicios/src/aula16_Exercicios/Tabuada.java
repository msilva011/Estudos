package aula16_Exercicios;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value,i,result;
		
		System.out.println("Qual valor deseja a tabuada? ");
		value = scan.nextInt();
		System.out.println("TABUADA DO VALOR "+value);
		for(i=1; i<=10 ; i++) {
			result = value*i;
			System.out.println("\n"+value+" x "+i+ " = "+result);

		}
		

	}

}
