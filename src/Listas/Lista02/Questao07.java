package Listas.Lista02;
import java.util.Scanner;
public class Questao07 {

	    public static void main(String[] args) {
	        Scanner tec = new Scanner(System.in);

	        System.out.print("Por favor, informe o primeiro número: ");
	        double numero1 = tec.nextDouble();

	        System.out.print("Por favor, informe o segundo número: ");
	        double numero2 = tec.nextDouble();

	        if (numero1 == numero2) {
	            System.out.println("Eles são iguais.");
	        } else {
	            System.out.println("Eles não são iguais.");
	        }

	        tec.close();
	    }
	}


