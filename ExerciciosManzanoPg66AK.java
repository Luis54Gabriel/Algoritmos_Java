package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg66AK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Manzano 1 ao 11");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println("Apresentar os quadrados dos números inteiros de 15 a 200.\n");

			double result;
			for (double cont = 15; cont <= 200; cont++) {
				result = cont * cont;
				System.out.println(cont + " x " + cont + " = " + result);
			}

			break;
		case 2:
			System.out.println(
					"Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer,\n");

			double num = 0;
			double resultado;
			int i;
			for (i = 1; i <= 10; i++) {
				resultado = num * i;
				System.out.println(num + " * " + i + " = " + resultado);
			}

			break;
		case 3:
			System.out.println(
					"Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).\n");

			double contador = 1;
			double somatorio = 0;
			for (double cont = 0; cont <= 100; cont++) {
				somatorio = somatorio + contador;
				contador = contador + 1;
			}
			System.out.println("A soma dos 100 primeiros números é de: " + somatorio);

			break;
		case 4:
			System.out.println(
					"Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de \r\n"
							+ "1 até 500.\n");

			double soma = 0;

			for (double cont1 = 0; cont1 <= 500; cont1++) {
				if (cont1 % 2 == 0) {
					soma = soma + cont1;
				}
				cont1++;
			}
			System.out.println("A soma dos valores pares é de: " + soma);

			break;
		case 5:
			System.out.println(
					"Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar \r\n"
							+ "se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução \r\n"
							+ "se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.\n");

			for (double cont01 = 0; cont01 <= 20; cont01++) {
				if (cont01 % 3 == 0) {
					System.out.println(cont01);
				}
				cont01++;
			}

			break;
		case 6:
			System.out.println(
					"Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o \r\n"
							+ "número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a \r\n"
							+ "instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o \r\n"
							+ "próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.\n");

			for (double cont001 = 0; cont001 <= 200; cont001++) {
				if (cont001 % 4 == 0) {
					System.out.println(cont001 + " é divisível por 4!");
				}
			}

			break;
		case 7:
			System.out.println(
					"Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser \r\n"
							+ "considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que \r\n"
							+ "neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).\n");
			double result1 = 3;

			for (double cont0001 = 0; cont0001 <= 15; cont0001++) {
				result1 = 3 * result1;
				System.out.println(result1);
				cont0001++;
			}
			break;
		case 8:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor de uma potência de uma base \r\n"
							+ "qualquer elevada a um expoente qualquer, ou seja, de BE\r\n"
							+ ", em que B é o valor da base e E o valor \r\n"
							+ "do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do \r\n"
							+ "portuguol (^).\n");

			double base, expo, potencia;

			System.out.println("Digite um valor para base:");
			base = sc.nextDouble();

			System.out.println("Digite um valor para o expoente:");
			expo = sc.nextDouble();

			potencia = 1;

			for (double cont = 0; cont < expo; cont++) {
				potencia = potencia * expo;
			}
			System.out.println(base + " elevado a " + expo + " = " + potencia);

			break;
		case 9:
			System.out.println(
					"Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de \r\n"
							+ "Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza \r\n"
							+ "pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo \r\n"
							+ "valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo \r\n"
							+ "é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.\n");

			double v1 = -1;
			double v2 = 1;
			double v3 = 0;

			for (double cont = 0; cont <= 15; cont++) {
				v3 = v1 + v2;
				v1 = v2;
				v2 = v3;
				System.out.println(v3);
			}

			break;
		case 10:
			System.out.println(
					"Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de \r\n"
							+ "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \r\n"
							+ "programa deve apresentar os valores das duas temperaturas.\n");
			
			  double fahrenheit = 0;

		        for(double celsius = 10;celsius <= 100; celsius = celsius + 10) {
		            fahrenheit = (9*celsius+160)/5;
		            System.out.println("O resultado da conversão de "+celsius+" graus celsius para "+fahrenheit+" graus fahrenheit.");
		        }
		        
			break;
		case 11:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares \r\n"
							+ "situados na faixa numérica de 1 a 10.\n");
			
			double contFatorial = 0;
	        double fatorial = 0;

	        for(double cont = 1; cont<= 10; cont = cont +2){
	            contFatorial = 1;
	            fatorial = 1;
	            do {
	                fatorial = fatorial*contFatorial;
	                contFatorial = contFatorial + 1;
	            } while(contFatorial<cont);
	            System.out.println("O fatorial de "+cont+" é "+fatorial);
	        }
	        
			break;
		default:

			System.out.println("\nNúmero inválido\n");

			break;
		}
	}
}
