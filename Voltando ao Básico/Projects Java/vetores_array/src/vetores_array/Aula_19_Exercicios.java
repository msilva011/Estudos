package vetores_array;
import java.util.Scanner;
public class Aula_19_Exercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int value = scan.nextInt();
		
		int[] a = new int[value];
		
		int[] b = new int[a.length*2];
		
		int[] c = new int[a.length*3];

		
		System.out.println("O vetor A tem "+a.length+" posições e o vetor B tem "+b.length);
		
		for (int i=0; i<a.length;i++) {
			a[i] = i+2;
			System.out.println("\n---No vetor A---\nna posição "+i+" o valor é "+a[i]);
			
			b[i] = a[i]*2;
			System.out.println("\n---No vetor B---\nna posição "+i+" o valor é "+b[i]);
			

			c[i] = a[i]*b[i];
			
			System.out.println("\n---No vetor C---\nna posição "+i+" o valor é "+c[i]);
		}
		
	}

}
