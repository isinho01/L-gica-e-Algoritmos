package Listas.Lista03;

public class Questao06 {

	public static void main(String[] args) {
		for (int numero = 1; numero <= 200; numero++) {
			if (numero % 3 == 0 || numero % 5 == 0) {
				System.out.println(numero);
			}
		}

	}

}
