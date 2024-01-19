package Listas.Lista01;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("por favor insira sua idade: ");
		int idade = tec.nextInt();
		System.out.println("voce ja viveu um total de: "+(idade*365)+" dias");
		tec.close();
	}

}
