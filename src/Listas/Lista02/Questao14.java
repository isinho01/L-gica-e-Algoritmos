package Listas.Lista02;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite um ângulo em graus: ");
		float angulo = tec.nextFloat();

		String quadrante;
		if (0 <= angulo && angulo < 90) {
			quadrante = "primeiro quadrante";
		} else if (90 <= angulo && angulo < 180) {
			quadrante = "segundo quadrante";
		} else if (180 <= angulo && angulo < 270) {
			quadrante = "terceiro quadrante";
		} else if (270 <= angulo && angulo < 360) {
			quadrante = "quarto quadrante";
		} else {
			quadrante = "fora do intervalo de 0 a 360 graus";
		}

		System.out.printf("O ângulo de %.2f graus está no %s.\n", angulo, quadrante);

		tec.close();
	}
}
