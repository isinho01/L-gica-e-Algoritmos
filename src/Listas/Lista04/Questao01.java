package Listas.Lista04;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		   Scanner tec = new Scanner(System.in);

	        System.out.print("Digite um número para ver a sua tabuada de multiplicação: ");
	        int n = tec.nextInt();

	        System.out.printf("Tabuada de multiplicação de %d:%n", n);
	        for (int i = 1; i <= 10; i++) {
	            int resultado = n * i;
	            System.out.printf("%d x %d = %d%n", n, i, resultado);
	        }

	        tec.close();
	    }

	}


