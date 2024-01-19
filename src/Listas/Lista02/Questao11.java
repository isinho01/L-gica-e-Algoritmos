package Listas.Lista02;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = tec.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = tec.nextInt();

		System.out.print("Digite o terceiro número inteiro: ");
		int numero3 = tec.nextInt();

		System.out.print("Digite o quarto número inteiro: ");
		int numero4 = tec.nextInt();

		System.out.print("Digite o quinto número inteiro: ");
		int numero5 = tec.nextInt();

		int menorNumero = Math.min(Math.min(Math.min(Math.min(numero1, numero2), numero3), numero4), numero5);
		int maiorNumero = Math.max(Math.max(Math.max(Math.max(numero1, numero2), numero3), numero4), numero5);

		System.out.printf("O menor número entre %d, %d, %d, %d e %d é %d.\n", numero1, numero2, numero3, numero4,
				numero5, menorNumero);
		System.out.printf("O maior número entre %d, %d, %d, %d e %d é %d.\n", numero1, numero2, numero3, numero4,
				numero5, maiorNumero);

		tec.close();
	}
}
