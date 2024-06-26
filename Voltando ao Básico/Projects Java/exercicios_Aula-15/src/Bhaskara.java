import java.util.Scanner;
public class Bhaskara {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = scan.nextDouble();
		
		if(a == 0) {
			System.out.println("Valor de a inválido!");
			
		}else {
			System.out.println("Valor de b: ");
			double b = scan.nextDouble();
			
			System.out.println("Valor de c: ");
			double c = scan.nextDouble();
			
			double delta = Math.pow(b,2) - 4*a*c;
			if(delta < 0) {
				System.out.println("Delta é negativo");
			}else {
				double x1 = ((-b) + Math.sqrt(delta))/(2*a);
				double x2 = ((-b) - Math.sqrt(delta))/(2*a);
				
				System.out.println("\n\nX' = "+x1+"\nX'' = "+x2);
				System.out.println("\n***********************\n "+delta);
			}
		}
	}

}
