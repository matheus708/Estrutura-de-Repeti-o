import java.util.Scanner;

public class Exerci3 {

	public static void main(String[] args) {
		
		int x = 1, soma = 0, media;
		int contagem = 1;
		
		
		Scanner leitor = new Scanner(System.in);
		
				System.out.println("Digite 20 números: ");
		
		do {
		
			System.out.printf("%d° número: ", contagem);
			x = leitor.nextInt();
				++contagem;
				soma = soma + x;
			}
		
		
		while(contagem <=20 ); 
					
		media = soma / 20;
			System.out.println("Soma: " +soma);
			System.out.println("Resultado: " +media);
		
		
	}
}
