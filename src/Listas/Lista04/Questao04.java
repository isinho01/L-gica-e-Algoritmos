package Listas.Lista04;

public class Questao04 {
	public static void main(String[] args) {
		int quantidadePrimosEncontrados = 0;
		int numero = 2;

		System.out.println("Os 50 primeiros números primos são:");
		while (quantidadePrimosEncontrados < 50) {
			if (ehPrimo(numero)) {
				System.out.print(numero + " ");
				quantidadePrimosEncontrados++;
			}
			numero++;
		}
	}

	public static boolean ehPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
