package pctExercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorUm = new int[10];
		int[] vetorDois = new int[10];
		int dobro1 = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor para o vetor 1: ");
			vetorUm[i] = entrada.nextInt();
			dobro1 = dobro1 + vetorUm[i];
		}
		System.out.println("A soma de todos os 10 valores do vetor 1 é " + dobro1 + ".");

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor para o vetor 2 (Os mesmos valores do vetor 1): ");
			vetorUm[i] = entrada.nextInt();
			dobro1 = dobro1 + vetorDois[i];
		}

		System.out.println("O dobro dos valores do vetor 2 somados é igual a " + (dobro1 * 2) + ".");

		entrada.close();
	}

}
