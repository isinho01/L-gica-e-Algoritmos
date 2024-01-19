package Listas.Lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor digite o X :");
		int x = tec.nextInt();
		System.out.println("por favor digite o Y: ");
		int y = tec.nextInt();
		int quociente = x / y;
		int resto = x%y;
		System.out.println("o quociente de"+" "+ x +" "+ "dividido por"+" "+ y + " é: "+quociente);
		System.out.println("o resto da divisao entre X e Y é: "+ resto);
		tec.close();
	}

}
