package Listas.Lista02;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Por favor, informe o primeiro número: ");
		double numero1 = tec.nextDouble();

		System.out.print("Por favor, informe o segundo número: ");
		double numero2 = tec.nextDouble();

		if (numero1 > numero2) {
			System.out.println("O primeiro número é o maior.");
		} else {
			System.out.println("O segundo número é o maior.");
		}

		tec.close();
	}
}
