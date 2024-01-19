package Listas.Lista04;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		int n = tec.nextInt();

		double soma = 0;

		for (int i = 1; i <= n; i++) {
			double termo = 1.0 / i;
			soma += termo;
		}

		System.out.printf("A soma da série é igual a %.2f%n", soma);

		tec.close();

	}

}
