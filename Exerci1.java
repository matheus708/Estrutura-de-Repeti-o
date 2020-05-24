import java.util.Scanner;

public class Exerci1 {

	public static void main(String[] args) {
		
		int x;
		int repeticoes = 1;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		do {
		System.out.printf("\n%d° número: ", repeticoes);
		x = leitor.nextInt();	
			
		if(x > 0) {
			System.out.printf(x+ " positivo \n" );
		}
		else if(x < 0) {
			System.out.printf(x+ " negativo \n");
		}
		else {
			System.out.printf(x+ " neutro \n");
		}
		repeticoes++;
		}while(repeticoes <= 10);
	}
}

