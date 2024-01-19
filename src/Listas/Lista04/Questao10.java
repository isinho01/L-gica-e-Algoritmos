package Listas.Lista04;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos que você está comprando: ");
		int quantidadeProdutos = tec.nextInt();
		double valorTotalCompra = 0;

		for (int i = 1; i <= quantidadeProdutos; i++) {
			System.out.printf("Digite o preço do produto %d: ", i);
			double precoProduto = tec.nextDouble();
			valorTotalCompra += precoProduto;
		}

		double valorAvista = valorTotalCompra * 0.95;
		double valorParcelado = valorTotalCompra * 1.002 / 3;

		System.out.printf("Valor total da compra: R$ %.2f%n", valorTotalCompra);
		System.out.println("Opções de pagamento:");
		System.out.printf("1. À vista (5%% de desconto): R$ %.2f%n", valorAvista);
		System.out.printf("2. Parcelado em 3 vezes: 3x de R$ %.2f%n", valorParcelado);

		tec.close();

	}

}
