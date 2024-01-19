package Listas.Lista02;

import java.util.Scanner;

public class Questao13 {

	    public static void main(String[] args) {
	        Scanner tec = new Scanner(System.in);

	        System.out.print("Digite o comprimento do primeiro lado: ");
	        int lado1 = tec.nextInt();

	        System.out.print("Digite o comprimento do segundo lado: ");
	        int lado2 = tec.nextInt();

	        System.out.print("Digite o comprimento do terceiro lado: ");
	        int lado3 = tec.nextInt();

	        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                System.out.println("O triângulo é equilátero (todos os lados iguais).");
	            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	                System.out.println("O triângulo é isósceles (dois lados iguais).");
	            } else {
	                System.out.println("O triângulo é escaleno (todos os lados diferentes).");
	            }
	        } else {
	            System.out.println("Os comprimentos informados não podem formar um triângulo.");
	        }

	        tec.close();
	    }
	}


