package Listas.Lista01;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("insira o primeiro numero:");
		int primeiro = tec.nextInt();
		System.out.println("insira o segundo numero: ");
		int segundo = tec.nextInt();
		int soma = primeiro + segundo;
		int produto = primeiro * segundo;
		int quociente = primeiro / segundo;
		System.out.println("a soma é: "+soma);
		System.out.println("a multiplicação é: "+produto);
		System.out.println("o quociente é: "+ quociente);
		tec.close();
	}

}
