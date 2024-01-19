package Listas.Lista02;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Por favor, informe a base em cm²: ");
		double base = tec.nextDouble();

		System.out.print("Por favor, informe a altura em cm: ");
		double altura = tec.nextDouble();

		double area = (base * altura) / 2;

		System.out.println("A área do triângulo é " + area + " cm²");

		tec.close();
	}
}
