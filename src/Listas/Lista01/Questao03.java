package Listas.Lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor insira um numero ao qual deseja saber a metade. ");
		int numero = tec.nextInt();
		System.out.println("a metade do numero escolhido é: " + (numero/2));
		tec.close();
	}

}
