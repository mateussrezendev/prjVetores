package pctExercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorUm = new int[5];
		int[] vetorDois = new int[5];
		int[] vetorTrês = new int[5];
		int soma = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor 1: ");
			vetorUm[i] = entrada.nextInt();
			soma = soma + vetorUm[i];
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor 2: ");
			vetorUm[i] = entrada.nextInt();
			soma = soma + vetorDois[i];
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(
					"A soma dos valores do vetor 1 com os valores do vetor 2 é igual a " + (soma + soma) + ".");
			vetorUm[i] = entrada.nextInt();
			soma = soma + vetorTrês[i];
		}

		entrada.close();
	}

}
