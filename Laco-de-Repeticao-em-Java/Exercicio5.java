package La�osDeRepeti��o;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) 
	{/*
		5 - Crie um programa que leia um n�mero do teclado at� que encontre um 
		n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
		(DO...WHILE) */

		int n=0, soma=0;
		
		Scanner tec = new Scanner(System.in);
		
		do {
			System.out.print("Informa quantos n�meros quiser at� que a entrada seja 0: ");
			n = tec.nextInt();
			
			soma = soma+n;

		}while (n > 0);
		if(n == 0) {
			System.out.printf("O n�mero 0 foi encontrado e o total da soma dos numeros digitados foi: %d", soma);
			tec.close();
		}
		else {
			System.out.print("NUMERO INVALIDO");
		}
	}
}
