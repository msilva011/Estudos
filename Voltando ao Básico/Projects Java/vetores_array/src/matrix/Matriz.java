package matrix;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		Random numeroAle = new Random();
		int [][] matrixAle = new int[10][10];
		
		for(int i=0; i<matrixAle.length; i++) {
			for(int j=0; j<matrixAle[i].length;j++) {
				matrixAle[i][j] = numeroAle.nextInt(10);
			}
		}
		
		for(int i=0; i<matrixAle.length;i++) {
			for(int j=0;j<matrixAle.length;j++) {
				System.out.print(matrixAle[i][j]+" ");
			}
			System.out.println();
		}
		
		int maiorL5=0;
		int menorL5=100;
		int maiorC7=0;
		int menorC7=7;
		
		for(int i=0; i<matrixAle[5].length;i++) {
			if(matrixAle[5][i]>maiorL5) {
				maiorL5 = matrixAle[5][i];
			}
			if(matrixAle[5][i]<menorL5) {
				menorL5 = matrixAle[5][i];
			}
		}
		
		for (int j=0; j<matrixAle.length;j++) {
			if(matrixAle[j][7]>maiorC7) {
				maiorC7 = matrixAle[j][7];
			}
			if(matrixAle[j][7]<menorC7) {
				menorC7 = matrixAle[j][7];
			}
		}
		
		System.out.println("Maior numero da linha 5: " + maiorL5);
		System.out.println("Menor numero da linha 5: " + menorL5);
		System.out.println("Maior numero da coluna 7: " + maiorC7);
		System.out.println("Menor numero da coluna 7: " + menorC7);
	}
}



