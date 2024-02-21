package matrix;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[10][10];
		Random numeroRandom = new Random();
		
		for(int i=0;i<numerosAleatorios.length;i++) {
			for(int j=0;j<numerosAleatorios[i].length;j++) {
				numerosAleatorios [i][j] = numeroRandom.nextInt(100); //10 eu determino que deve gerar numeros aleatorios de 0 a 100
			}
		}
		
		int maiorL = 0,menorL=101, maiorC=0, menorC=101;
		int line=5;
		int col = 7;
		
		for(int i=0;i<numerosAleatorios[line].length;i++) {
				if(numerosAleatorios[line][i]>maiorL){
					maiorL = numerosAleatorios[line][i];
				}
				if(numerosAleatorios[line][i]<menorL) {
					menorL = numerosAleatorios[line][i];
				}
			
		}
		
		System.out.println("Maior valor Linha 5: "+maiorL+" Menor: "+menorL);

		for(int i=0;i<numerosAleatorios.length;i++) {
			if(numerosAleatorios[i][col]>maiorC){
				maiorC = numerosAleatorios[i][col];
			}
			if(numerosAleatorios[i][col]<menorC) {
				menorC = numerosAleatorios[i][col];
			}
		
	}
		
		for(int i=0;i<numerosAleatorios.length;i++) {
			for(int j=0;j<numerosAleatorios[i].length;j++) {
				System.out.print(numerosAleatorios[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nMaior valor coluna 7: "+maiorC + " Menor: "+menorC);
	}

}
