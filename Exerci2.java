import java.util.Scanner;

public class Exerci2 {

	public static void main(String[] args) {

		
		
		int x = 1, N;
		
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			N = leitor.nextInt();
		
		while(x < N) {
			System.out.println(x);
		x++;
	    }
		
		System.out.println("Número escolhido: " +x);
		
		
		}
	}



	
