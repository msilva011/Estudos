package jogodavelha.poo;
import java.util.Scanner;

public class Jogadores {
    Tabuleiro tabu = new Tabuleiro();

    void vezJogador(int jogador) {
		char sinal;
		if(jogador %2==0) {
			System.out.println("\n--- Vez do jogador 1: X ---");
			sinal='X';
			tabu.digitarPosicao(sinal);
			
		}else {
			System.out.println("\n--- Vez do jogador 2: O ---");
			sinal='O';
			tabu.digitarPosicao(sinal);
		}
	}
    
    void vencedor() {
		boolean ganhou=false;
		int vez=1;
		while(!ganhou) {
			vezJogador(vez++);
			

			if(tabu.tabuleiro[0][0] == 'X' && tabu.tabuleiro[0][1] == 'X' && tabu.tabuleiro[0][2] =='X' || //horizontal cima
					tabu.tabuleiro[1][0] == 'X' && tabu.tabuleiro[1][1] == 'X' && tabu.tabuleiro[1][2] =='X' || //horizontal meio
					tabu.tabuleiro[2][0] == 'X' && tabu.tabuleiro[2][1] == 'X' && tabu.tabuleiro[2][2] =='X' || //horizontal baixo
					tabu.tabuleiro[0][0] == 'X' && tabu.tabuleiro[1][1] == 'X' && tabu.tabuleiro[2][2] =='X' || //diagonal esquerda
					tabu.tabuleiro[0][0] == 'X' && tabu.tabuleiro[1][0] == 'X' && tabu.tabuleiro[2][0] =='X' || //vertical esquerda
					tabu.tabuleiro[0][1] == 'X' && tabu.tabuleiro[1][1] == 'X' && tabu.tabuleiro[2][1] =='X' || //vertical meio
					tabu.tabuleiro[0][2] == 'X' && tabu.tabuleiro[1][2] == 'X' && tabu.tabuleiro[2][2] =='X' || //vertical direita
					tabu.tabuleiro[0][2] == 'X' && tabu.tabuleiro[1][1] == 'X' && tabu.tabuleiro[2][0] =='X' //diagonal direita
					) {
				ganhou = true;
				System.out.println("\n\n**** JOGADOR 1 GANHOU ****");
			}
			if(tabu.tabuleiro[0][0] == 'O' && tabu.tabuleiro[0][1] == 'O' && tabu.tabuleiro[0][2] =='O' || //horizontal cima
					tabu.tabuleiro[1][0] == 'O' && tabu.tabuleiro[1][1] == 'O' && tabu.tabuleiro[1][2] =='O' || //horizontal meio
					tabu.tabuleiro[2][0] == 'O' && tabu.tabuleiro[2][1] == 'O' && tabu.tabuleiro[2][2] =='O' || //horizontal baixo
					tabu.tabuleiro[0][0] == 'O' && tabu.tabuleiro[1][1] == 'O' && tabu.tabuleiro[2][2] =='O' || //diagonal esquerda
					tabu.tabuleiro[0][0] == 'O' && tabu.tabuleiro[1][0] == 'O' && tabu.tabuleiro[2][0] =='O' || //vertical esquerda
					tabu.tabuleiro[0][1] == 'O' && tabu.tabuleiro[1][1] == 'O' && tabu.tabuleiro[2][1] =='O' || //vertical meio
					tabu.tabuleiro[0][2] == 'O' && tabu.tabuleiro[1][2] == 'O' && tabu.tabuleiro[2][2] =='O' || //vertical direita
					tabu.tabuleiro[0][2] == 'O' && tabu.tabuleiro[1][1] == 'O' && tabu.tabuleiro[2][0] =='O' //diagonal direita
					) {
				ganhou = true;
				System.out.println("\n\n**** JOGADOR 2 GANHOU ****");
			} if(tabu.rodada > 9) {
				System.out.println("\n------Ninguem ganhou!----------\n");
				ganhou = true;
			}
			
		}
	}

    
}

