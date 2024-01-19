package Listas.Lista03;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		 Scanner tec = new Scanner(System.in);
		  double soma = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um número: ");
	            double numero = tec.nextDouble();
	            soma += numero;
	        }

	        System.out.printf("A soma dos 10 números é: %.2f%n", soma);

	        tec.close();
	}

}
