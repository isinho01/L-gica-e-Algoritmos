package Listas.Lista04;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner tec  = new Scanner(System.in);

		System.out.print("Digite a quantidade de números que deseja verificar: ");
		int n = tec.nextInt();

		int primos = 0;
		int naoPrimos = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			int numero = tec.nextInt();
			if (ehPrimo(numero)) {
				primos++;
			} else {
				naoPrimos++;
			}
		}

		System.out.println("Quantidade de números primos: " + primos);
		System.out.println("Quantidade de números não primos: " + naoPrimos);

		tec.close();
	}

	public static boolean ehPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
