package aula16_Exercicios;

import java.util.Scanner;
public class Nome_Usuario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");				
		String name = scan.next();
		String pass;
		
		do {
			System.out.println("Digite a senha: ");
			pass = scan.next();
		}while(pass.equals(name));
		
		System.out.println("Login cadastrado!!");
	}

}
