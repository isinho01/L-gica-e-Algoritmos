package Listas.Lista01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor insira um numero ao qual deseja saber seu sucessor. ");
		int numero = tec.nextInt();
		System.out.println("o sucessor do numero escolhido é  " + (numero+1));
		tec.close();
	}

}
