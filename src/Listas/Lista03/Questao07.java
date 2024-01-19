package Listas.Lista03;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		   Scanner tec = new Scanner(System.in);

	        System.out.print("Digite o valor de m: ");
	        int m = tec.nextInt();

	        System.out.print("Digite o valor de n: ");
	        int n = tec.nextInt();

	        if (m > n) {
	            int temp = m;
	            m = n;
	            n = temp;
	        }

	        System.out.printf("Números no intervalo entre %d e %d:\n", m, n);
	        for (int numero = m; numero <= n; numero++) {
	            System.out.println(numero);
	        }

	        tec.close();
	    }

	}


