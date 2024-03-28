package aluno.poo;

import java.util.Scanner;
import java.util.Scanner;

public class Disciplina {
	String [] disciplinas = new String[3];
	double [] notas = new double[3];
	double media;
	boolean aprovacao = false;
	
	Scanner scan = new Scanner(System.in);


	void incluirDisciplina() {
		System.out.println("Nome 1ª Disciplina: ");
		disciplinas[0] = scan.next();
		System.out.println("Nome 2ª Disciplina: ");
		disciplinas[1] = scan.next();
		System.out.println("Nome 3ª Disciplina: ");
		disciplinas[2] = scan.next();
	}
	
	void incluirNotas() {
		System.out.println("Nota da " + disciplinas[0]+": ");
		notas[0] = scan.nextDouble();
		System.out.println("Nota "+ disciplinas[1]+": ");
		notas[1] = scan.nextDouble();
		System.out.println("Nota "+ disciplinas[2]+": ");
		notas[2] = scan.nextDouble();
		calcularMedia();
	}
	
	void visualizarSituacao() {
		String[][] quadro = new String [4][2];
		quadro[0][0] = disciplinas[0];
		quadro[1][0] = disciplinas[1];
		quadro[2][0] = disciplinas[2];
		quadro[0][1] = Double.toString(notas[0]);
		quadro[1][1] = Double.toString(notas[1]);
		quadro[2][1] = Double.toString(notas[2]);
		quadro[3][0] = "Media: ";
		quadro[3][1] = Double.toString(media);
		calcularAprovacao();
		
		for(int i=0; i<quadro.length;i++) {
			for(int j=0; j<quadro[i].length;j++) {
				System.out.print(quadro[i][j]+" ");
			}
			System.out.println();
		}
		if(!aprovacao) {
			System.out.println("\n-----REPROVADO-----\n");
		}else {
			System.out.println("\n*****APROVADO*****\n");
		}
	}
	
	void calcularMedia() {
		media = (notas[0]+notas[1]+notas[2])/3;
	}
	
	void calcularAprovacao() {
		if(media >= 7) {
			aprovacao = true;
		}else {
			aprovacao = false;
		}
	}
}
