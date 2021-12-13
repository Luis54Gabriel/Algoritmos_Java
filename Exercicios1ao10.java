package exercicios;

import java.util.Scanner;
import static java.lang.Math.*;

public class Exercicios1ao10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios 1 ao 10");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println("\nExerc�cio 1 - Soma\n");

			System.out.println("Digite a primeira parcela:");

			int parcela01 = sc.nextInt();

			System.out.println("Digite a segunda parcela:");

			int parcela02 = sc.nextInt();

			int soma = parcela01 + parcela02;

			System.out.println("A soma entre " + parcela01 + " e " + parcela02 + " � igual a: " + soma + ".");

			break;
		case 2:

			System.out.println("\nExerc�cio 2 - Subtra��o\n");

			System.out.println("Digite o aditivo:");

			int aditivo = sc.nextInt();

			System.out.println("Digite o subtrativo:");

			int subtrativo = sc.nextInt();

			int diferenca = aditivo - subtrativo;

			System.out.println("A diferen�a entre " + aditivo + " e " + subtrativo + " � igual a: " + diferenca + ".");

			break;
		case 3:
			System.out.println("\nExerc�cio 3 - Multiplica��o\n");

			System.out.println("Digite o primeiro fator:");

			int fator01 = sc.nextInt();

			System.out.println("Digite o segundo fator:");

			int fator02 = sc.nextInt();

			int produto = fator01 * fator02;

			System.out.println("O produto de " + fator01 + " e " + fator02 + " � igual a: " + produto + ".");

			break;
		case 4:

			System.out.println("\nExerc�cio 4 - Divis�o\n");

			System.out.println("Digite o dividendo:");

			int dividendo = sc.nextInt();

			System.out.println("Digite o divisor:");

			int divisor = sc.nextInt();

			int quociente = dividendo + divisor;

			System.out.println("O quociente entre " + divisor + " e " + dividendo + " � igual a: " + quociente + ".");

			break;
		case 5:

			System.out.println("\nExerc�cio 5 - Antecessor\n");

			System.out.println("Digite um n�mero:");

			int valorAntecessor = sc.nextInt();

			int antecessor = valorAntecessor - 1;

			System.out.println("O antecessor do n�mero " + valorAntecessor + " �: " + antecessor + ".");

			break;
		case 6:

			System.out.println("\nExerc�cio 6 - Sucessor\n");

			System.out.println("Digite um n�mero:");

			int valorSucessor = sc.nextInt();

			int sucessor = valorSucessor + 1;

			System.out.println("O antecessor do n�mero " + valorSucessor + " �: " + sucessor + ".");

			break;
		case 7:

			System.out.println("\nExerc�cio 7 - �rea de um quadrado\n");

			System.out.println("Digite o valor dos lados:");

			int ladoQuadrado = sc.nextInt();

			int areaQuadrado = ladoQuadrado * 4;

			System.out.println("A �rea do quadrado � de: " + areaQuadrado + ".");

			break;
		case 8:

			System.out.println("\nExerc�cio 8 - �rea de um ret�ngulo\n");

			System.out.println("Digite o valor da base:");

			int baseQuadrado = sc.nextInt();

			System.out.println("Digite o valor da altura:");

			int alturaQuadrado = sc.nextInt();

			int areaRetangulo = baseQuadrado * alturaQuadrado;

			System.out.println("A �rea do ret�ngulo � de: " + areaRetangulo + ".");

			break;
		case 9:

			System.out.println("\nExerc�cio 9 - �rea de um tri�ngulo\n");

			System.out.println("Digite o valor da base:");

			int baseTriangulo = sc.nextInt();

			System.out.println("Digite o valor da altura:");

			int alturaTriangulo = sc.nextInt();

			int areaTriangulo = (baseTriangulo * alturaTriangulo) / 4;

			System.out.println("A �rea do tri�ngulo � de: " + areaTriangulo + ".");

			break;
		case 10:

			System.out.println("\nExerc�cio 10 - �rea de um c�rculo\n");

			System.out.println("Digite o valor do raio:");

			int raio = sc.nextInt();

			double areaCirculo = Math.PI * (raio * 2);

			System.out.println("A �rea do c�rculo � de: " + areaCirculo + ".");

			break;
		default:

			System.out.println("\nN�mero inv�lido\n");

			break;
		}

		sc.close();
	}
}
