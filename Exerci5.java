import java.util.Scanner;

public class Exerci5 {

	public static void main(String[] args) {
		
		double cont1000 = 0 ;
		double salario = 1, altura;
		char sexo;
		double media, soma = 0, maior =0 , menor = 200;
		int contagem = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		
		do {
			
			System.out.printf("Digite seu sexo (m/f) ", contagem);
			sexo = leitor.next().charAt(0);
			System.out.printf("Digite seu salário ", contagem);
			salario = leitor.nextDouble();
			System.out.printf("Digite sua altura ", contagem);
			altura = leitor.nextDouble();
			contagem++;
			
			soma = soma + salario;
			media = soma /20;
			
			if(altura > maior) {
				maior = altura;
			}
			
			else if(altura < menor) {
				menor = altura;
				}
			if(salario <= 1000 && sexo =='f') {
				cont1000 = cont1000 + 1;
			}
		}
		
		while(contagem <= 20);
		
			System.out.println("Média dos salários é de: " +media);
			System.out.println("Maior altura: " +maior+ " Menor altura: " +menor);
			System.out.println("A quantidade de mulheres com salário até R$ 1.000,00 foi de: " +cont1000);
		
		
		
		
		
		
		
		
		
	
	
	
	

	}

}
