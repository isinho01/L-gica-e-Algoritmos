package Listas.Lista02;
import java.util.Scanner;

public class Questao06 {

	    public static void main(String[] args) {
	        Scanner tec = new Scanner(System.in);

	        System.out.print("Por favor, informe um número: ");
	        double numero = tec.nextDouble();

	        double resto = numero % 3;

	        if (resto == 0) {
	            System.out.println("O número escolhido é múltiplo de três.");
	        } else {
	            System.out.println("O número escolhido não é múltiplo de três.");
	        }

	        tec.close();
	    }
	}


