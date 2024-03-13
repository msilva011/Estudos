package jogo_velha;

import java.util.Scanner;

public class JogoDaVelha {
	
	static char[][] tabuleiro = new char[3][3];
	 

	public static void vezJogador(int jogador) {
		char sinal;
		if(jogador %2==0) {
			System.out.println("\n--- Vez do jogador 1: X ---");
			sinal='X';
			digitarPosicao(sinal);
			
		}else {
			System.out.println("\n--- Vez do jogador 2: O ---");
			sinal='O';
			digitarPosicao(sinal);
		}
	}
	public static void digitarPosicao(char sinal) {
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
	
	public static void preencherTabu(char sinal, int linha, int coluna) {
		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna]=='O') {
			System.out.println("////Posição já preenchida, tente novamente.\\\\");
			tabuleiroFunc();
			digitarPosicao(sinal);
		}else {
			tabuleiro[linha][coluna] = sinal;
			tabuleiroFunc();
		}
	}
	
	public static void tabuleiroFunc() {
			
			for(int i=0; i<tabuleiro.length;i++) {
				for(int j=0; j<tabuleiro.length;j++) {
					System.out.print(tabuleiro[i][j]+ " | ");
				}
				System.out.println();
			}
		}
	
	public static void vencedor() {
		
		boolean ganhou=false;
		int vez=1;
		while(!ganhou) {
			vezJogador(vez++);
			
			
			if(tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] =='X' ||
					tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] =='X' ||
					tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] =='X' ||
					tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] =='X' ||
					tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] =='X' ||
					tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] =='X' ||
					tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] =='X' ||
					tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] =='X' ||
					tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] =='X' ||
					tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] =='X') {
				ganhou = true;
				System.out.println("\n\n**** JOGADOR 1 GANHOU ****");
			}
			if(tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] =='O' ||
					tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] =='O' ||
					tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] =='O' ||
					tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] =='O' ||
					tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] =='O' ||
					tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] =='O' ||
					tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] =='O' ||
					tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] =='O' ||
					tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] =='O' ||
					tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O') {
				ganhou = true;
				System.out.println("\n\n1**** JOGADOR 2 GANHOU ****");
			}
		}
	}

	public static void main(String[] args) {
		
		vencedor();		

	}

}
