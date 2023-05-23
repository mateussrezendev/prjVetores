package pctExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorUm = new int[10];
		int soma = 0, div = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite sua nota: ");
			vetorUm[i] = entrada.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			soma = soma + vetorUm[i];
			div = soma / vetorUm.length;
		}
		System.out.println("Sua média é " + div + ".");

		entrada.close();
	}

}
