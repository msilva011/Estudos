import java.util.Scanner;	
public class ReajusteSal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salario do colaborador: ");
		double salario = scan.nextDouble();
		double reajuste=0;
		double aumento=0;
		double valorAtual=0;
		
		if(salario <=280.0 && salario >0) {
			 reajuste = 0.2;
			 aumento = salario * reajuste;
			 valorAtual = salario+aumento;
			
		}else if(salario >280.0 && salario <= 700.0) {
			 reajuste = 0.15;
			 aumento = salario * reajuste;
			 valorAtual = salario+aumento;
			
		}else if(salario > 700.0 && salario <= 1500.0) {
			 reajuste = 0.10;
			 aumento = salario * reajuste;
			 valorAtual = salario+aumento;
			
		}else if(salario >1500.0) {
			 reajuste = 0.05;
			 aumento = salario * reajuste;
			 valorAtual = salario+aumento;
			
		}else if(salario <=0) {
			System.out.println("Salario invalido!");
			System.exit(0);
		}
		
		System.out.println("______________________________");
		System.out.println("O salario era: "+ salario);
		System.out.println("O reajuste é de "+ reajuste * 100+"%. O aumento foi "+aumento);
		System.out.println("O salario atualizado passa a ser: "+ valorAtual);
	}

}
