package aula16_Exercicios;

public class Loop_For {

	public static void main(String[] args) {
		
		System.out.println("Contando até 10\n");
		for (int i=0;i<=10;i++) {
			System.out.println("\n"+i);
		}
		
		//enquanto incrementa i deve-se decrementar j
		for (int i=0, j=10; i<j; i++,j--) {
			System.out.println("\n\ni: "+ i + "\nj"+ j);
		}
	}

}
