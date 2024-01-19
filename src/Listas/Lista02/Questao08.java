package Listas.Lista02;
import java.util.Scanner;

public class Questao08 {

	    public static void main(String[] args) {
	        Scanner tec = new Scanner(System.in);

	        System.out.print("Por favor, informe um número: ");
	        int numero = tec.nextInt();

	        if (numero % 2 == 1) {
	            System.out.println("Ele é ímpar.");
	        } else {
	            System.out.println("Ele é par.");
	        }

	        tec.close();
	    }
	}


