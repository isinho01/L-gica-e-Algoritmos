package Listas.Lista02;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = tec.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = tec.nextInt();

		System.out.print("Digite o terceiro número inteiro: ");
		int numero3 = tec.nextInt();

		int menorNumero = Math.min(Math.min(numero1, numero2), numero3);

		System.out.printf("O menor número entre %d, %d e %d é %d.\n", numero1, numero2, numero3, menorNumero);

		tec.close();
	}
}
