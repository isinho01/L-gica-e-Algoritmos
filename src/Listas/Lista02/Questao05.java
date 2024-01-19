package Listas.Lista02;
import java.util.Scanner;
public class Questao05 {

	    public static void main(String[] args) {
	        Scanner tec = new Scanner(System.in);

	        System.out.print("Informe os graus em Celsius para realizar a conversão em Fahrenheit: ");
	        int celsius = tec.nextInt();

	        int fahrenheit = (celsius * 9 / 5) + 32;

	        System.out.println("A temperatura convertida de Celsius para Fahrenheit é " + fahrenheit);

	        tec.close();
	    }
	}


