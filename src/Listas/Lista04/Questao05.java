package Listas.Lista04;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite um número para encontrar seus divisores: ");
		int numero = tec.nextInt();

		System.out.println("Os divisores de " + numero + " são:");
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}

		tec.close();

	}

}
