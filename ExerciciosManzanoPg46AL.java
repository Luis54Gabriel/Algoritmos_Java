package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg46AL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios Manzano 1 ao 12");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println(
					"Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer.\n");

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
					"Apresentar o total da soma obtida dos cem primeiros n�meros inteiros (1+2+3+4+...+98+99+100).\n");

			double contador = 1, somatorio = 0;

			while (contador <= 100) {
				somatorio = somatorio + contador;
				contador++;
			}
			System.out.println("A soma dos 100 primeiros n�meros � de: " + somatorio);

			break;
		case 3:
			System.out.println(
					"Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de \r\n"
							+ "1 at� 500.\n");

			double cont = 1, somatorio1 = 0;

			while (cont <= 500) {
				if (cont % 2 == 0) {
					somatorio1 = somatorio1 + cont;
				}
				cont++;
			}
			System.out.println("A soma dos n�meros pares de 1 a 500 � de: " + somatorio1);

			break;
		case 4:
			System.out.println(
					"Apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20. Para verificar \r\n"
							+ "se o n�mero � �mpar, efetuar dentro da malha a verifica��o l�gica desta condi��o com a instru��o \r\n"
							+ "se, perguntando se o n�mero � �mpar; sendo, mostre-o; n�o sendo, passe para o pr�ximo passo.\n");

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
				System.out.println("O aluno foi aprovado! Com uma m�dia de: " + mediaNota);
			} else if (mediaNota < 7) {
				System.out.println("A nota est� abaixo de 7.");

				System.out.println("Digite a nota do exame:");
				notaExame = sc.nextDouble();

				novaMedia = (mediaNota + notaExame) / 2;
				if (novaMedia >= 5) {
					System.out.println("O aluno foi aprovado no examo! Com uma m�dia de: " + novaMedia);
				} else if (novaMedia < 5) {
					System.out.println("O aluno foi reprovado no exame com uma m�dia de: " + novaMedia);
				}
			}

			break;
		case 5:
			System.out.println(
					"Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser \r\n"
							+ "considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Observe que \r\n"
							+ "neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).\n");

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
					"Elaborar um programa que apresente como resultado o valor de uma pot�ncia de uma base \r\n"
							+ "qualquer elevada a um expoente qualquer, ou seja, de BE\r\n"
							+ ", em que B � o valor da base e E o valor \r\n"
							+ "do expoente. Observe que neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do \r\n"
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
					"Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. A s�rie de \r\n"
							+ "Fibonacci � formada pela seq��ncia: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta s�rie se caracteriza \r\n"
							+ "pela soma de um termo atual com o seu anterior subseq�ente, para que seja formado o pr�ximo \r\n"
							+ "valor da seq��ncia. Portanto come�ando com os n�meros 1, 1 o pr�ximo termo � 1+1=2, o pr�ximo \r\n"
							+ "� 1+2=3, o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc.\n");

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
					" Elaborar um programa que apresente os valores de convers�o de graus Celsius em Fahrenheit, de \r\n"
							+ "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \r\n"
							+ "programa deve apresentar os valores das duas temperaturas.\n");

			double celsius = 10, fahrenheit;

			while (celsius <= 100) {
				fahrenheit = (9 * celsius + 160) / 5;
				System.out.println("O resultado da convers�o de " + celsius + " graus celsius para " + fahrenheit
						+ " graus fahrenheit.");
				celsius = celsius + 10;
			}

			break;
		case 9:
			System.out.println(
					"Elaborar um programa que efetue a leitura de 10 valores num�ricos e apresente no final o total do \r\n"
							+ "somat�rio e a m�dia aritm�tica dos valores lidos.\n");

			double cont0001 = 0, soma = 0, media = 0;

			while (cont0001 <= 10) {
				double numero;
				System.out.println("Digite um n�mero:");
				numero = sc.nextDouble();
				;

				soma = soma + numero;
				cont0001++;
			}
			media = soma / 10;
			System.out.println("Soma total dos valores: " + soma);
			System.out.println("M�dia dos valores lidos: " + media);

			break;
		case 10:
			System.out.println(
					"Elaborar um programa que apresente os resultados da soma e da m�dia aritm�tica dos valores \r\n"
							+ "pares situados na faixa num�rica de 50 a 70.\n");

			double soma1 = 0, cont2 = 0, media1 = 0;

			while (cont2 <= 70) {
				if (cont2 % 2 == 0) {
					soma1 = soma1 + cont2;
				}
				cont2++;
			}

			media1 = soma1 / 20;
			System.out.println("O total da soma dos valores: " + soma1);
			System.out.println("A m�dia dos valores: " + media1);

			break;
		case 11:
			System.out.println(
					"Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha, \r\n"
							+ "banheiro, quartos, �rea de servi�o, quintal, garagem, etc.). O programa deve solicitar a entrada do \r\n"
							+ "nome, a largura e o comprimento de um determinado c�modo. Em seguida, deve apresentar a �rea do c�modo lido e tamb�m uma mensagem solicitando do usu�rio a confirma��o de continuar \r\n"
							+ "calculando novos c�modos. Caso o usu�rio responda �NAO�, o programa deve apresentar o valor \r\n"
							+ "total acumulado da �rea residencial.\n");

			String pergunta = null;
			double total = 0;

			do {
				String nome;
				double comprimento, largura, area;

				System.out.println("Digite o nome do com�do:");
				nome = sc.next();

				System.out.println("Digite o comprimento do com�do:");
				comprimento = sc.nextDouble();

				System.out.println("Digite a largura do com�do:");
				largura = sc.nextDouble();

				area = comprimento * largura;
				System.out.println("O tamanho da �rea ddo com�do � de: " + area);

				total = total + area;

				System.out.println("Deseja calcular mais algum com�do?");
				pergunta = sc.next();

			} while (pergunta == "sim");

			System.out.println("O total das �reas calculadas �: " + total);

			break;
		case 12:
			System.out.println(
					"Elaborar um programa que efetue a leitura de valores positivos inteiros at� que um valor negativo \r\n"
							+ "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \r\n"
							+ "usu�rio.\n");

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
			System.out.println("O maior n�mero �: " + maior + " e o menor �: " + menor);

			break;
		default:

			System.out.println("\nN�mero inv�lido\n");

			break;

		}
	}
}
