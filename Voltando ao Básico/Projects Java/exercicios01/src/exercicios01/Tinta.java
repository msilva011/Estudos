package exercicios01;

import java.util.Scanner;

public class Tinta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos metros quadrados irá pintar: ");
		double metrosQ = scan.nextDouble();
		
		//1 litr para cada 6 metros quadrados
		//latas de 18 litros custa 80$
		// ou galoes de 3,6 litros por 25$
		
		double qtdTinta = (metrosQ / 6) * 0.9;
		
		
	}

}
