package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg46AL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Manzano 1 ao 12");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println(
					"Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.\n");

			double num, calc, result;

			num = 5;
			calc = 1;
			result = 0;

			while (calc < 11) {
				result = num * calc;
				System.out.println(num + " x " + calc + " = " + result);
				calc++;
			}
			break;
		case 2:
			System.out.println(
					"Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).\n");

			double contador = 1, somatorio = 0;

			while (contador <= 100) {
				somatorio = somatorio + contador;
				contador++;
			}
			System.out.println("A soma dos 100 primeiros números é de: " + somatorio);

			break;
		case 3:
			System.out.println(
					"Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de \r\n"
							+ "1 até 500.\n");

			double cont = 1, somatorio1 = 0;

			while (cont <= 500) {
				if (cont % 2 == 0) {
					somatorio1 = somatorio1 + cont;
				}
				cont++;
			}
			System.out.println("A soma dos números pares de 1 a 500 é de: " + somatorio1);

			break;
		case 4:
			System.out.println(
					"Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar \r\n"
							+ "se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução \r\n"
							+ "se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.\n");

			double n1, n2, n3, n4, mediaNota, notaExame, novaMedia;

			System.out.println("Digite a primeira nota:");
			n1 = sc.nextDouble();

			System.out.println("Digite a segunda nota:");
			n2 = sc.nextDouble();

			System.out.println("Digite a terceira nota:");
			n3 = sc.nextDouble();

			System.out.println("Digite a quarta nota:");
			n4 = sc.nextDouble();

			mediaNota = (n1 + n2 + n3 + n4) / 4;

			if (mediaNota >= 7) {
				System.out.println("O aluno foi aprovado! Com uma média de: " + mediaNota);
			} else if (mediaNota < 7) {
				System.out.println("A nota está abaixo de 7.");

				System.out.println("Digite a nota do exame:");
				notaExame = sc.nextDouble();

				novaMedia = (mediaNota + notaExame) / 2;
				if (novaMedia >= 5) {
					System.out.println("O aluno foi aprovado no examo! Com uma média de: " + novaMedia);
				} else if (novaMedia < 5) {
					System.out.println("O aluno foi reprovado no exame com uma média de: " + novaMedia);
				}
			}

			break;
		case 5:
			System.out.println(
					"Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser \r\n"
							+ "considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que \r\n"
							+ "neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).\n");

			double cont1 = 0;
			double result1 = 3;

			while (cont1 <= 15) {
				result = 3 * result1;
				System.out.println(result1);
				cont1++;
			}

			break;
		case 6:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor de uma potência de uma base \r\n"
							+ "qualquer elevada a um expoente qualquer, ou seja, de BE\r\n"
							+ ", em que B é o valor da base e E o valor \r\n"
							+ "do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do \r\n"
							+ "portuguol (^).\n");

			double base, expo, potencia = 1, cont01 = 0;

			System.out.println("Digite um valor para a base:");
			base = sc.nextDouble();

			System.out.println("Digite um valor para o expoente:");
			expo = sc.nextDouble();

			while (cont01 < expo) {
				potencia = potencia * expo;
				cont01++;
			}
			System.out.println(base + " elevado a " + expo + " = " + potencia);

			break;
		case 7:
			System.out.println(
					"Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de \r\n"
							+ "Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza \r\n"
							+ "pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo \r\n"
							+ "valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo \r\n"
							+ "é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.\n");

			double cont001 = 0, v1 = 0, v2 = 0, v3;

			while (cont001 <= 15) {
				v3 = v1 + v2;
				v1 = v2;
				v2 = v3;
				System.out.println(v3);
				cont001++;
			}
			break;
		case 8:
			System.out.println(
					" Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de \r\n"
							+ "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \r\n"
							+ "programa deve apresentar os valores das duas temperaturas.\n");

			double celsius = 10, fahrenheit;

			while (celsius <= 100) {
				fahrenheit = (9 * celsius + 160) / 5;
				System.out.println("O resultado da conversão de " + celsius + " graus celsius para " + fahrenheit
						+ " graus fahrenheit.");
				celsius = celsius + 10;
			}

			break;
		case 9:
			System.out.println(
					"Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do \r\n"
							+ "somatório e a média aritmética dos valores lidos.\n");

			double cont0001 = 0, soma = 0, media = 0;

			while (cont0001 <= 10) {
				double numero;
				System.out.println("Digite um número:");
				numero = sc.nextDouble();
				;

				soma = soma + numero;
				cont0001++;
			}
			media = soma / 10;
			System.out.println("Soma total dos valores: " + soma);
			System.out.println("Média dos valores lidos: " + media);

			break;
		case 10:
			System.out.println(
					"Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores \r\n"
							+ "pares situados na faixa numérica de 50 a 70.\n");

			double soma1 = 0, cont2 = 0, media1 = 0;

			while (cont2 <= 70) {
				if (cont2 % 2 == 0) {
					soma1 = soma1 + cont2;
				}
				cont2++;
			}

			media1 = soma1 / 20;
			System.out.println("O total da soma dos valores: " + soma1);
			System.out.println("A média dos valores: " + media1);

			break;
		case 11:
			System.out.println(
					"Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, \r\n"
							+ "banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do \r\n"
							+ "nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar \r\n"
							+ "calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor \r\n"
							+ "total acumulado da área residencial.\n");

			String pergunta = null;
			double total = 0;

			do {
				String nome;
				double comprimento, largura, area;

				System.out.println("Digite o nome do comôdo:");
				nome = sc.next();

				System.out.println("Digite o comprimento do comôdo:");
				comprimento = sc.nextDouble();

				System.out.println("Digite a largura do comôdo:");
				largura = sc.nextDouble();

				area = comprimento * largura;
				System.out.println("O tamanho da área ddo comôdo é de: " + area);

				total = total + area;

				System.out.println("Deseja calcular mais algum comôdo?");
				pergunta = sc.next();

			} while (pergunta == "sim");

			System.out.println("O total das áreas calculadas é: " + total);

			break;
		case 12:
			System.out.println(
					"Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo \r\n"
							+ "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \r\n"
							+ "usuário.\n");

			double valores = 0, maior = 0, menor = 0;

			while (valores >= 0) {
				System.out.println("Insira um valor:");
				valores = sc.nextDouble();

				if (valores >= 0) {
					if (valores > maior) {
						maior = valores;
					} else {
						menor = valores;
					}
				}
			}
			System.out.println("O maior número é: " + maior + " e o menor é: " + menor);

			break;
		default:

			System.out.println("\nNúmero inválido\n");

			break;

		}
	}
}
