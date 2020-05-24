import java.util.Scanner;

public class Exerci4 {

	public static void main(String[] args) {
		
		
		int x, contagem = 1;
		int maior = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
				System.out.println("Digite 15 números: ");
				
		do {
			System.out.printf("%d° número: ", contagem);
			x = leitor.nextInt();
			contagem++;
			if(x > maior) {
			maior = x;
			}
		}
		while(contagem <= 15);
			
		System.out.printf("Número: " +maior);
		}

	}

