package Listas.Lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Por favor, informe a primeira nota: ");
		double nota1 = tec.nextDouble();

		System.out.print("Por favor, informe a segunda nota: ");
		double nota2 = tec.nextDouble();

		System.out.print("Por favor, informe a terceira nota: ");
		double nota3 = tec.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("A média das três notas informadas é: " + media);

		tec.close();
	}
}
