package Listas.Desafio;

import java.util.Scanner;

public class Desafio_Larvicida {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Por favor informe o comprimento (em cm): ");
		double comprimento = tec.nextDouble();

		System.out.print("Por favor informe a largura (em cm): ");
		double largura = tec.nextDouble();

		System.out.print("Por favor informe a altura (em cm): ");
		double altura = tec.nextDouble();

		double volume = largura * altura * comprimento;
		System.out.printf("O volume calculado é %.2f cm³%n", volume);

		double capacidade = volume / 1000;
		System.out.printf("A capacidade em litros é %.2f L%n", capacidade);

		double larvicida = capacidade / 1000;
		System.out.printf("A quantidade de larvicida a ser usada é %.2f gramas%n", larvicida);

		tec.close();

	}

}
