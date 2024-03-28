package jogodavelha.poo;

import java.util.Scanner;

public class Tabuleiro {
    char[][] tabuleiro = new char[3][3];
    int rodada= 1;

    
    void digitarPosicao(char sinal) {
		Scanner scan = new Scanner(System.in);
		int linha;
		int coluna;
		
		System.out.println("Digite a linha desejada (1,2 ou 3): ");
		linha = scan.nextInt();
		System.out.println("Digite a coluna desejada (1,2 ou 3): ");
		coluna = scan.nextInt();
		
		linha--;
		coluna--;
		preencherTabu(sinal,linha,coluna);

		
	}
	
	void preencherTabu(char sinal, int linha, int coluna) {
		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna]=='O') {
			System.out.println("////Posição já preenchida, tente novamente.\\\\");
			tabuleiroFunc();
			digitarPosicao(sinal);
		}else {
			tabuleiro[linha][coluna] = sinal;
			tabuleiroFunc();
			rodada++;
		}
	}
	
	void tabuleiroFunc() {
			
			for(int i=0; i<tabuleiro.length;i++) {
				for(int j=0; j<tabuleiro.length;j++) {
					System.out.print(tabuleiro[i][j]+ " | ");
				}
				System.out.println();
			}
		}
	
}
