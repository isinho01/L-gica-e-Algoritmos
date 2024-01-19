package Listas.Lista01;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor informe X: ");
		int x = tec.nextInt();
		System.out.println("por favor informe Y: ");
		int y = tec.nextInt();
		int resto = x%y;
		System.out.println("o resto da divisao é: "+resto);
		tec.close();
	}

}
