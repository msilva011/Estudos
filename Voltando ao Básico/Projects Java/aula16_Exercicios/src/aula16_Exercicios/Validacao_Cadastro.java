package aula16_Exercicios;
import java.util.Scanner;
public class Validacao_Cadastro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valid = false;
		String name, civil, gener;
		int idade;
		double salario;
		System.out.println("\n***Digite sua informações***\n");

		
		do {			
			
			System.out.println("Nome: ");
			name = scan.next();
			if(name.length()>=3) {
				valid= true;
			}else {
				System.out.println("Nome invalido");
			}
		}while(!valid);
		
		valid=false;
		
		do {			
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
			if(idade >0 && idade <=150) {
				valid= true;
			}else {
				System.out.println("Idade invalida");
			}
		}while(!valid);
		
		valid=false;
			
		do {			
			
			System.out.println("Salario: ");
			salario = scan.nextDouble();
			if(salario > 0) {
				valid= true;
			}else {
				System.out.println("Salario invalido");
			}
		}while(!valid);
		
		valid=false;
		
		do {			
			
			System.out.println("Genero: ");
			gener = scan.next();
			if(gener.equalsIgnoreCase("f") || gener.equalsIgnoreCase("m")) {
				valid= true;
			}else {
				System.out.println("Genero invalido");
			}
		}while(!valid);
		
		valid=false;
		
		do {						
			System.out.println("Civil: ");
			civil = scan.next();
			if(civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d")) {
				valid= true;
			}else {
				System.out.println("Genero invalido");
			}
		}while(!valid);
		
		System.out.println("\n-------Cadastro feito com sucesso------\n");
		System.out.println("Nome: "+name + "\nidade: "+idade+"\nsalario: "+salario+"\nGenero:"+gener+"\ncivil:"+civil);
		
	}

}
