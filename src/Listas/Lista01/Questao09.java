package Listas.Lista01;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("por favor insira seu salario: ");
		double salario = tec.nextDouble();
		double reajuste = (salario*7)/100;
		double novosalario = reajuste + salario ;
		System.out.println("seu novo salario reajustado é de: "+novosalario);
		tec.close();

	}

}
