package Listas.Lista04;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite um número para verificar se é primo: ");
		int numero = tec.nextInt();

		boolean ehPrimo = true;
		if (numero <= 1) {
			ehPrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}

		if (ehPrimo) {
			System.out.printf("%d é um número primo.%n", numero);
		} else {
			System.out.printf("%d não é um número primo.%n", numero);
		}

		tec.close();

	}

}
