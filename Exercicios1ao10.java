package exercicios;

import java.util.Scanner;
import static java.lang.Math.*;

public class Exercicios1ao10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios 1 ao 10");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println("\nExercício 1 - Soma\n");

			System.out.println("Digite a primeira parcela:");

			int parcela01 = sc.nextInt();

			System.out.println("Digite a segunda parcela:");

			int parcela02 = sc.nextInt();

			int soma = parcela01 + parcela02;

			System.out.println("A soma entre " + parcela01 + " e " + parcela02 + " é igual a: " + soma + ".");

			break;
		case 2:

			System.out.println("\nExercício 2 - Subtração\n");

			System.out.println("Digite o aditivo:");

			int aditivo = sc.nextInt();

			System.out.println("Digite o subtrativo:");

			int subtrativo = sc.nextInt();

			int diferenca = aditivo - subtrativo;

			System.out.println("A diferença entre " + aditivo + " e " + subtrativo + " é igual a: " + diferenca + ".");

			break;
		case 3:
			System.out.println("\nExercício 3 - Multiplicação\n");

			System.out.println("Digite o primeiro fator:");

			int fator01 = sc.nextInt();

			System.out.println("Digite o segundo fator:");

			int fator02 = sc.nextInt();

			int produto = fator01 * fator02;

			System.out.println("O produto de " + fator01 + " e " + fator02 + " é igual a: " + produto + ".");

			break;
		case 4:

			System.out.println("\nExercício 4 - Divisão\n");

			System.out.println("Digite o dividendo:");

			int dividendo = sc.nextInt();

			System.out.println("Digite o divisor:");

			int divisor = sc.nextInt();

			int quociente = dividendo + divisor;

			System.out.println("O quociente entre " + divisor + " e " + dividendo + " é igual a: " + quociente + ".");

			break;
		case 5:

			System.out.println("\nExercício 5 - Antecessor\n");

			System.out.println("Digite um número:");

			int valorAntecessor = sc.nextInt();

			int antecessor = valorAntecessor - 1;

			System.out.println("O antecessor do número " + valorAntecessor + " é: " + antecessor + ".");

			break;
		case 6:

			System.out.println("\nExercício 6 - Sucessor\n");

			System.out.println("Digite um número:");

			int valorSucessor = sc.nextInt();

			int sucessor = valorSucessor + 1;

			System.out.println("O antecessor do número " + valorSucessor + " é: " + sucessor + ".");

			break;
		case 7:

			System.out.println("\nExercício 7 - Área de um quadrado\n");

			System.out.println("Digite o valor dos lados:");

			int ladoQuadrado = sc.nextInt();

			int areaQuadrado = ladoQuadrado * 4;

			System.out.println("A área do quadrado é de: " + areaQuadrado + ".");

			break;
		case 8:

			System.out.println("\nExercício 8 - Área de um retângulo\n");

			System.out.println("Digite o valor da base:");

			int baseQuadrado = sc.nextInt();

			System.out.println("Digite o valor da altura:");

			int alturaQuadrado = sc.nextInt();

			int areaRetangulo = baseQuadrado * alturaQuadrado;

			System.out.println("A área do retângulo é de: " + areaRetangulo + ".");

			break;
		case 9:

			System.out.println("\nExercício 9 - Área de um triângulo\n");

			System.out.println("Digite o valor da base:");

			int baseTriangulo = sc.nextInt();

			System.out.println("Digite o valor da altura:");

			int alturaTriangulo = sc.nextInt();

			int areaTriangulo = (baseTriangulo * alturaTriangulo) / 4;

			System.out.println("A área do triângulo é de: " + areaTriangulo + ".");

			break;
		case 10:

			System.out.println("\nExercício 10 - Área de um círculo\n");

			System.out.println("Digite o valor do raio:");

			int raio = sc.nextInt();

			double areaCirculo = Math.PI * (raio * 2);

			System.out.println("A área do círculo é de: " + areaCirculo + ".");

			break;
		default:

			System.out.println("\nNúmero inválido\n");

			break;
		}

		sc.close();
	}
}
