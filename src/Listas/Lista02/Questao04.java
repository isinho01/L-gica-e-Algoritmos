package Listas.Lista02;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Por favor, insira seu peso em quilogramas: ");
		double peso = tec.nextDouble();

		System.out.print("Por favor, insira sua altura em metros: ");
		double altura = tec.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("Seu IMC é: %.2f\n", imc);

		tec.close();
	}
}
