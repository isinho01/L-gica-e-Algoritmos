package Listas.Lista03;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		  double soma = 0;
	        while (true) {
	            System.out.print("Digite um número (ou 0 para parar): ");
	            double numero = tec.nextDouble();
	            if (numero == 0) {
	                break;
	            }
	            soma += numero;
	        }

	        System.out.printf("A soma dos números é: %.2f%n", soma);

	        tec.close();

	}

}
