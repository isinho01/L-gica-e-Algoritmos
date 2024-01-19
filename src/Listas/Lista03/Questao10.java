package Listas.Lista03;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double soma = 0;
		int quantidadeNumeros = 0;
		double maiorNumero = Double.NEGATIVE_INFINITY;
		double menorNumero = Double.POSITIVE_INFINITY;

		while (true) {
			System.out.print("Digite um número (ou -1 para parar): ");
			double numero = tec.nextDouble();

			if (numero == -1) {
				break;
			}

			quantidadeNumeros++;
			soma += numero;

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

			if (numero < menorNumero) {
				menorNumero = numero;
			}
		}

		if (quantidadeNumeros > 0) {
			double media = soma / quantidadeNumeros;
			System.out.println("Quantidade de números digitados: " + quantidadeNumeros);
			System.out.println("Média aritmética: " + media);
			System.out.println("Maior número: " + maiorNumero);
			System.out.println("Menor número: " + menorNumero);
		} else {
			System.out.println("Nenhum número foi digitado.");
		}

		tec.close();

	}

}
