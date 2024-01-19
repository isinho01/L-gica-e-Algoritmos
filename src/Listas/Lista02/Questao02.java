package Listas.Lista02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		        Scanner tec = new Scanner(System.in);

		        System.out.println("Por favor, informe a primeira nota: ");
		        double nota1 = tec.nextDouble();
		        double peso1 = 2;

		        double peso2 = nota1 * peso1;

		        System.out.print("Por favor, informe a segunda nota: ");
		        double nota2 = tec.nextDouble();
		        double peso3 = 3;

		        double peso4 = nota2 * peso3;

		        double resultadoFinal = (peso2 + peso4) / (peso1 + peso3);

		        System.out.println("A sua média ponderada calculada é " + resultadoFinal);

		        tec.close();
		    }
		}

