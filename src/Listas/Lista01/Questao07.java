package Listas.Lista01;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		 Scanner tec = new Scanner(System.in);

	        System.out.print("Por favor, insira x: ");
	        double x = tec.nextDouble();

	        System.out.print("Por favor, insira y: ");
	        double y = tec.nextDouble();

	        double elevacao = Math.pow(x, y);

	        System.out.println(x + " elevado a " + y + " é igual a " + elevacao);

	        tec.close();

	}

}
