package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg51AJ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Manzano 1 ao 13");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println("Apresentar os quadrados dos números inteiros de 15 a 200. \n");

			double cont = 15;
			double quadrado;
			do {
				quadrado = cont * cont;
				System.out.println("O quadrado de " + cont + " é " + quadrado);
				cont++;
			} while (cont <= 200);

			break;
		case 2:
			System.out.println(
					"Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de \r\n"
							+ "1 até 500.\n");

			double cont1 = 0;
			double soma = 0;

			do {
				if (cont1 % 2 == 0) {
					soma = soma + cont1;
				}
				cont1++;
			} while (cont1 <= 500);
			System.out.println("A soma dos valores pares é de: " + soma);

			break;
		case 3:
			System.out.println(
					"Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o \r\n"
							+ "número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a \r\n"
							+ "instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o \r\n"
							+ "próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.\n");

			double cont01 = 0;

			do {
				if (cont01 % 4 == 0) {
					System.out.println("O valor é dividido por 4! " + cont01);
				}
				cont01++;
			} while (cont01 <= 200);

			break;
		case 4:
			System.out.println(
					"Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de \r\n"
							+ "trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de \r\n"
							+ "trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro \r\n"
							+ "quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos), \r\n"
							+ "no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8 \r\n"
							+ "grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o\r\n"
							+ ") quadro. Utilize variáveis do \r\n" + "tipo real como acumuladores.\n");

			double b = 2;
			double c = 1;
			double d = 1;
			double s = 1;
			do {
				d = b;
				c = c + 1;
				s = s + d;
			} while (c < 63);
			System.out.println("A soma é igual a: " + s);

			break;
		case 5:
			System.out.println(
					"Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente o \r\n"
							+ "total do somatório da fatorial de cada valor lido. ");

			double cont001 = 1;
			double contFatorial = 0;
			double n = 0;
			double resultado = 0;
			double fatorial = 0;

			do {
				System.out.println("Digite um número:");
				n = sc.nextDouble();

				contFatorial = 1;
				fatorial = 1;
				do {
					fatorial = fatorial * contFatorial;
					contFatorial = contFatorial + 1;
				} while (contFatorial <= n);
				resultado = resultado + fatorial;
				cont001 = cont001 + 1;
			} while (cont001 <= 15);
			System.out.println("A soma dos fatoriais dos valores fornecidos: " + resultado);

			break;
		case 6:
			System.out.println(
					"Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o \r\n"
							+ "total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras \r\n"
							+ "dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve \r\n"
							+ "parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar \r\n"
							+ "como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da \r\n"
							+ "média.\n");

			double cont00001 = 0;
			double n1 = 0;
			double resultado1 = 0;
			double media = 0;

			do {
				System.out.println("Digite um número");
				n1 = sc.nextDouble();

				if (n1 >= 0) {
					resultado = resultado1 + n1;
					cont00001++;
				}
			} while (n1 >= 0);

			if (cont00001 > 0) {
				media = resultado1 / cont00001;
				System.out.println("Foram lidos: " + cont00001 + " números positivos.");
				System.out.println("A soma dos valores fornecidos é: " + resultado1);
				System.out.println("A média dos valores fornecidos é: " + media);
			}

			break;
		case 7:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares \r\n"
							+ "situados na faixa numérica de 1 a 10.\n");
			double cont2 = 1;
			double contFatorial1 = 0;
			double fatorial1 = 0;

			do {
				contFatorial1 = 1;
				fatorial1 = 1;
				do {
					fatorial1 = fatorial1 * contFatorial1;
					contFatorial1 = contFatorial1 + 1;
				} while (contFatorial1 < cont2);
				System.out.println("O fatorial de " + cont2 + " é " + fatorial1);
				cont2 = cont2 + 2;
			} while (cont2 <= 10);

			break;
		case 8:
			System.out.println(
					"Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, \r\n"
							+ "banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do \r\n"
							+ "nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área \r\n"
							+ "do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar \r\n"
							+ "calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor \r\n"
							+ "total acumulado da área residencial.\n");

			String pergunta;
			String nome;
			double total = 0;
			double largura = 0;
			double comprimento = 0;
			double area = 0;

			do {
				System.out.println("Digite o nome do comôdo:");
				nome = sc.next();

				System.out.println("Digite o comprimento do comôdo:");
				comprimento = sc.nextDouble();

				System.out.println("Digite a largura do comôdo:");
				largura = sc.nextDouble();

				area = comprimento * largura;
				System.out.println("O tamanho da área do comôdo é de: " + area);

				total = total * area;

				System.out.println("Deseja calcular mais algum comôdo?");
				pergunta = sc.nextLine();

			} while (pergunta == "Sim");

			System.out.println("O total de áreas calculadas é de: " + total);
			break;
		case 9:
			System.out.println(
					"Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo \r\n"
							+ "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \r\n"
							+ "usuário.\n");

			double valores = 0;
			double maior = 0;
			double menor = 0;

			do {
				System.out.println("Insira um valor:");
				if (valores >= 0) {
					if (valores > maior) {
						maior = valores;
					} else {
						menor = valores;
					}
				}
			} while (valores >= 0);
			System.out.println("O maior número é: " + maior + " e o menor é: " + menor);

			break;
		case 10:
			System.out.println(
					"Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer. \r\n"
							+ "Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético \r\n"
							+ "DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve \r\n"
							+ ".\n");

			double cont02 = 0;
			double dividendo;
			double divisor;

			System.out.println("Digite um valor pro dividendo:");
			dividendo = sc.nextDouble();

			System.out.println("Digite um valor pro divisor:");
			divisor = sc.nextDouble();

			if (divisor > dividendo) {
				System.out.println("Não é possível efetuar a divisão");
			} else {
				do {
					dividendo = dividendo - divisor;
					cont02++;
				} while (divisor > dividendo);
			}
			System.out.println(dividendo);
			
			break;
		default:

			System.out.println("\nNúmero inválido\n");

			break;
		}
	}
}