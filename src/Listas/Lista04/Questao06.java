package Listas.Lista04;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		 Scanner tec = new Scanner(System.in);

	        System.out.print("Digite o valor de a: ");
	        double a = tec.nextDouble();

	        System.out.print("Digite o valor de n: ");
	        int n = tec.nextInt();

	        double resultado = Math.pow(a, n);

	        System.out.printf("%.2f elevado a %d é igual a %.2f%n", a, n, resultado);

	        tec.close();

	}

}
