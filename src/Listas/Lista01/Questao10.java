package Listas.Lista01;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor informe um numero: ");
		int numero = tec.nextInt();
		if (numero % 2 ==0) {
			System.out.println("o numero escolhido é par.");
		
		}else {
			System.out.println("o numero escolhido é impar. ");
		}
	}

}
