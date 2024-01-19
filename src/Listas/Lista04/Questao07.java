package Listas.Lista04;

public class Questao07 {

	public static void main(String[] args) {
		double soma = 0;

		for (int i = 1; i <= 50; i++) {
			double termo = 2 * i - 1;
			soma += termo / i;
		}

		System.out.printf("A soma da série é igual a %.2f%n", soma);

	}

}
