package Listas.Lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor insira um numero ao qual deseja saber seu antecessor. ");
		int numero = tec.nextInt();
		System.out.println("o numero antecessor ao qual voce escolheu é : "+(numero-1));
		tec.close();
	}

}
