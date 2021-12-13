package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg51AJ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios Manzano 1 ao 13");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println("Apresentar os quadrados dos n�meros inteiros de 15 a 200. \n");

			double cont = 15;
			double quadrado;
			do {
				quadrado = cont * cont;
				System.out.println("O quadrado de " + cont + " � " + quadrado);
				cont++;
			} while (cont <= 200);

			break;
		case 2:
			System.out.println(
					"Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de \r\n"
							+ "1 at� 500.\n");

			double cont1 = 0;
			double soma = 0;

			do {
				if (cont1 % 2 == 0) {
					soma = soma + cont1;
				}
				cont1++;
			} while (cont1 <= 500);
			System.out.println("A soma dos valores pares � de: " + soma);

			break;
		case 3:
			System.out.println(
					"Apresentar todos os n�meros divis�veis por 4 que sejam menores que 200. Para verificar se o \r\n"
							+ "n�mero � divis�vel por 4, efetuar dentro da malha a verifica��o l�gica desta condi��o com a \r\n"
							+ "instru��o se, perguntando se o n�mero � divis�vel; sendo, mostre-o; n�o sendo, passe para o \r\n"
							+ "pr�ximo passo. A vari�vel que controlar� o contador deve ser iniciada com o valor 1.\n");

			double cont01 = 0;

			do {
				if (cont01 % 4 == 0) {
					System.out.println("O valor � dividido por 4! " + cont01);
				}
				cont01++;
			} while (cont01 <= 200);

			break;
		case 4:
			System.out.println(
					"Elaborar um programa que efetue o c�lculo e no final apresente o somat�rio do n�mero de gr�os de \r\n"
							+ "trigo que se pode obter num tabuleiro de xadrez, obedecendo � seguinte regra: colocar um gr�o de \r\n"
							+ "trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro \r\n"
							+ "quadro coloca-se 1 gr�o, no segundo quadro colocam-se 2 gr�os (neste momento t�m-se 3 gr�os), \r\n"
							+ "no terceiro quadro colocam-se 4 gr�os (tendo neste momento 7 gr�os), no quarto colocam-se 8 \r\n"
							+ "gr�os (tendo-se ent�o 15 gr�os) at� atingir o sexag�simo quarto (64o\r\n"
							+ ") quadro. Utilize vari�veis do \r\n" + "tipo real como acumuladores.\n");

			double b = 2;
			double c = 1;
			double d = 1;
			double s = 1;
			do {
				d = b;
				c = c + 1;
				s = s + d;
			} while (c < 63);
			System.out.println("A soma � igual a: " + s);

			break;
		case 5:
			System.out.println(
					"Elaborar um programa que efetue a leitura de 15 valores num�ricos inteiros e no final apresente o \r\n"
							+ "total do somat�rio da fatorial de cada valor lido. ");

			double cont001 = 1;
			double contFatorial = 0;
			double n = 0;
			double resultado = 0;
			double fatorial = 0;

			do {
				System.out.println("Digite um n�mero:");
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
					"Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o \r\n"
							+ "total do somat�rio, a m�dia aritm�tica e o total de valores lidos. O programa deve fazer as leituras \r\n"
							+ "dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o programa deve \r\n"
							+ "parar quando o usu�rio fornecer um valor negativo. N�o se esque�a que o usu�rio pode entrar \r\n"
							+ "como primeiro n�mero um n�mero negativo, portanto, cuidado com a divis�o por zero no c�lculo da \r\n"
							+ "m�dia.\n");

			double cont00001 = 0;
			double n1 = 0;
			double resultado1 = 0;
			double media = 0;

			do {
				System.out.println("Digite um n�mero");
				n1 = sc.nextDouble();

				if (n1 >= 0) {
					resultado = resultado1 + n1;
					cont00001++;
				}
			} while (n1 >= 0);

			if (cont00001 > 0) {
				media = resultado1 / cont00001;
				System.out.println("Foram lidos: " + cont00001 + " n�meros positivos.");
				System.out.println("A soma dos valores fornecidos �: " + resultado1);
				System.out.println("A m�dia dos valores fornecidos �: " + media);
			}

			break;
		case 7:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor do fatorial dos valores �mpares \r\n"
							+ "situados na faixa num�rica de 1 a 10.\n");
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
				System.out.println("O fatorial de " + cont2 + " � " + fatorial1);
				cont2 = cont2 + 2;
			} while (cont2 <= 10);

			break;
		case 8:
			System.out.println(
					"Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha, \r\n"
							+ "banheiro, quartos, �rea de servi�o, quintal, garagem, etc.). O programa deve solicitar a entrada do \r\n"
							+ "nome, a largura e o comprimento de um determinado c�modo. Em seguida, deve apresentar a �rea \r\n"
							+ "do c�modo lido e tamb�m uma mensagem solicitando do usu�rio a confirma��o de continuar \r\n"
							+ "calculando novos c�modos. Caso o usu�rio responda �NAO�, o programa deve apresentar o valor \r\n"
							+ "total acumulado da �rea residencial.\n");

			String pergunta;
			String nome;
			double total = 0;
			double largura = 0;
			double comprimento = 0;
			double area = 0;

			do {
				System.out.println("Digite o nome do com�do:");
				nome = sc.next();

				System.out.println("Digite o comprimento do com�do:");
				comprimento = sc.nextDouble();

				System.out.println("Digite a largura do com�do:");
				largura = sc.nextDouble();

				area = comprimento * largura;
				System.out.println("O tamanho da �rea do com�do � de: " + area);

				total = total * area;

				System.out.println("Deseja calcular mais algum com�do?");
				pergunta = sc.nextLine();

			} while (pergunta == "Sim");

			System.out.println("O total de �reas calculadas � de: " + total);
			break;
		case 9:
			System.out.println(
					"Elaborar um programa que efetue a leitura de valores positivos inteiros at� que um valor negativo \r\n"
							+ "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \r\n"
							+ "usu�rio.\n");

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
			System.out.println("O maior n�mero �: " + maior + " e o menor �: " + menor);

			break;
		case 10:
			System.out.println(
					"Elaborar um programa que apresente o resultado inteiro da divis�o de dois n�meros quaisquer. \r\n"
							+ "Para a elabora��o do programa, n�o utilizar em hip�tese alguma o conceito do operador aritm�tico \r\n"
							+ "DIV. A solu��o deve ser alcan�ada com a utiliza��o de looping. Ou seja, o programa deve \r\n"
							+ ".\n");

			double cont02 = 0;
			double dividendo;
			double divisor;

			System.out.println("Digite um valor pro dividendo:");
			dividendo = sc.nextDouble();

			System.out.println("Digite um valor pro divisor:");
			divisor = sc.nextDouble();

			if (divisor > dividendo) {
				System.out.println("N�o � poss�vel efetuar a divis�o");
			} else {
				do {
					dividendo = dividendo - divisor;
					cont02++;
				} while (divisor > dividendo);
			}
			System.out.println(dividendo);
			
			break;
		default:

			System.out.println("\nN�mero inv�lido\n");

			break;
		}
	}
}