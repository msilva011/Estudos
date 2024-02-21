package matrix;
import java.util.Scanner;

public class Jogo_Velha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] tabela = new String[3][3];
		
		
		for(int i=0;i<tabela.length;i++) {
			for(int j=0;j<tabela.length;j++) {
				tabela[i][j] = "-";
				
			}
		}
		for(int i=0;i<tabela.length;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(tabela[i][j]+" ");
			}
		}
		
		
		
	}

}
