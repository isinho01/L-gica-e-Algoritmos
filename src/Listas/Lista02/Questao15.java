package Listas.Lista02;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		float n1 = tec.nextFloat();

		System.out.print("Digite o segundo número: ");
		float n2 = tec.nextFloat();

		System.out.print("Digite o terceiro número: ");
		float n3 = tec.nextFloat();

		System.out.println("Números informados:");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);

		if (n1 > n2) {
			float temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n1 > n3) {
			float temp = n1;
			n1 = n3;
			n3 = temp;
		}
		if (n2 > n3) {
			float temp = n2;
			n2 = n3;
			n3 = temp;
		}

		System.out.println("\nNúmeros ordenados em ordem decrescente:");
		System.out.println("n1: " + n3);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n1);

		tec.close();
	}
}
