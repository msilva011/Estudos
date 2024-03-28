package aluno.poo;

import java.util.Scanner;
import java.util.Random;

public class Aluno {
	String nome;
	String curso;
	int matricula = 0;
	
	
	boolean finaliza = false;
	int acao;	
	
	Disciplina disciplina = new Disciplina();
	
	Scanner scan = new Scanner(System.in);
	
	void formulario() {
		while(!finaliza) {
			
			if(nome == null) {
				System.out.println("Nome do Aluno: ");
				nome = scan.next();
				System.out.println("Nome do Curso: ");
				curso = scan.next();		
				Random rand = new Random();
				matricula = rand.nextInt(100000);
			}
			acaoTomada();
		}
	}
	
	void acaoTomada() {
		System.out.println("Deseja: 1- Incluir Disciplinas | 2- incluir as notas | "
				+ "3- Visualizar Dados do aluno | 4- Informações do curso | 5- Finalizar programa");
		acao = scan.nextInt();
		
		if(acao ==1 ) {
			disciplina.incluirDisciplina();
			acaoTomada();
		}else if(acao == 2) {
			disciplina.incluirNotas();
			acaoTomada();
		}else if(acao ==3) {
			visualizarDados();
			acaoTomada();
		}else if(acao ==4) {
			disciplina.visualizarSituacao();
			acaoTomada();
		}else if(acao == 5) {
			finaliza=true;
		}
	}
	
	void visualizarDados() {
		System.out.println("\n-------------------------\nNome do Aluno: " + nome);
		System.out.println("Nome do Curso: " + curso);
		System.out.println("Matricula: " + matricula);
		System.out.println("-------------------------\n");
	}
}
