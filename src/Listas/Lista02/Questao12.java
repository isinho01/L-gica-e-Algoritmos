package Listas.Lista02;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite o comprimento do primeiro lado: ");
		int lado1 = tec.nextInt();

		System.out.print("Digite o comprimento do segundo lado: ");
		int lado2 = tec.nextInt();

		System.out.print("Digite o comprimento do terceiro lado: ");
		int lado3 = tec.nextInt();

		if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
			System.out.println("Os comprimentos informados podem formar um triângulo.");
		} else {
			System.out.println("Os comprimentos informados não podem formar um triângulo.");
		}

		tec.close();
	}
}
