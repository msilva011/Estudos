package vetores_array;

import java.util.Scanner;

public class Par_vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int value = scan.nextInt();
		
		int[] a = new int[value];
		
		System.out.println("O vetor A tem "+a.length);
		
		for (int i=0; i<value;i++) {
			boolean par = false;
			a[i] = i+3;
			
			if(a[i]%2==0) {
				par = true;
				System.out.println(""+a[i]+" é par");
			}else {
				par=false;
				System.out.println("\n"+a[i]);
			}
			
		}

	}

}
