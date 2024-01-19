package Listas.Lista04;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double precoQuilo = 20.00;
		System.out.print("Digite a quantidade de clientes na mesa: ");
		int quantidadeClientes = tec.nextInt();
		double valorTotalConta = 0;

		for (int cliente = 1; cliente <= quantidadeClientes; cliente++) {
			System.out.printf("Cliente %d: Digite o peso do prato (em gramas): ", cliente);
			double pesoPratoGramas = tec.nextDouble();
			System.out.printf("Cliente %d: Digite o valor gasto com bebida: ", cliente);
			double valorBebida = tec.nextDouble();
			double pesoPratoQuilos = pesoPratoGramas / 1000.0;
			double valorPrato = precoQuilo * pesoPratoQuilos;
			double valorTotalCliente = valorPrato + valorBebida;
			valorTotalConta += valorTotalCliente;
		}

		System.out.printf("O valor total da conta da mesa é: R$ %.2f%n", valorTotalConta);

		tec.close();
	}

}
