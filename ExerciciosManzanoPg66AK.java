package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg66AK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios Manzano 1 ao 11");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println("Apresentar os quadrados dos n�meros inteiros de 15 a 200.\n");

			double result;
			for (double cont = 15; cont <= 200; cont++) {
				result = cont * cont;
				System.out.println(cont + " x " + cont + " = " + result);
			}

			break;
		case 2:
			System.out.println(
					"Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer,\n");

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
					"Apresentar o total da soma obtida dos cem primeiros n�meros inteiros (1+2+3+4+...+98+99+100).\n");

			double contador = 1;
			double somatorio = 0;
			for (double cont = 0; cont <= 100; cont++) {
				somatorio = somatorio + contador;
				contador = contador + 1;
			}
			System.out.println("A soma dos 100 primeiros n�meros � de: " + somatorio);

			break;
		case 4:
			System.out.println(
					"Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de \r\n"
							+ "1 at� 500.\n");

			double soma = 0;

			for (double cont1 = 0; cont1 <= 500; cont1++) {
				if (cont1 % 2 == 0) {
					soma = soma + cont1;
				}
				cont1++;
			}
			System.out.println("A soma dos valores pares � de: " + soma);

			break;
		case 5:
			System.out.println(
					"Apresentar todos os valores num�ricos inteiros �mpares situados na faixa de 0 a 20. Para verificar \r\n"
							+ "se o n�mero � �mpar, efetuar dentro da malha a verifica��o l�gica desta condi��o com a instru��o \r\n"
							+ "se, perguntando se o n�mero � �mpar; sendo, mostre-o; n�o sendo, passe para o pr�ximo passo.\n");

			for (double cont01 = 0; cont01 <= 20; cont01++) {
				if (cont01 % 3 == 0) {
					System.out.println(cont01);
				}
				cont01++;
			}

			break;
		case 6:
			System.out.println(
					"Apresentar todos os n�meros divis�veis por 4 que sejam menores que 200. Para verificar se o \r\n"
							+ "n�mero � divis�vel por 4, efetuar dentro da malha a verifica��o l�gica desta condi��o com a \r\n"
							+ "instru��o se, perguntando se o n�mero � divis�vel; sendo, mostre-o; n�o sendo, passe para o \r\n"
							+ "pr�ximo passo. A vari�vel que controlar� o contador deve ser iniciada com o valor 1.\n");

			for (double cont001 = 0; cont001 <= 200; cont001++) {
				if (cont001 % 4 == 0) {
					System.out.println(cont001 + " � divis�vel por 4!");
				}
			}

			break;
		case 7:
			System.out.println(
					"Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. Deve ser \r\n"
							+ "considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Observe que \r\n"
							+ "neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).\n");
			double result1 = 3;

			for (double cont0001 = 0; cont0001 <= 15; cont0001++) {
				result1 = 3 * result1;
				System.out.println(result1);
				cont0001++;
			}
			break;
		case 8:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor de uma pot�ncia de uma base \r\n"
							+ "qualquer elevada a um expoente qualquer, ou seja, de BE\r\n"
							+ ", em que B � o valor da base e E o valor \r\n"
							+ "do expoente. Observe que neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do \r\n"
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
					"Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. A s�rie de \r\n"
							+ "Fibonacci � formada pela seq��ncia: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta s�rie se caracteriza \r\n"
							+ "pela soma de um termo atual com o seu anterior subseq�ente, para que seja formado o pr�ximo \r\n"
							+ "valor da seq��ncia. Portanto come�ando com os n�meros 1, 1 o pr�ximo termo � 1+1=2, o pr�ximo \r\n"
							+ "� 1+2=3, o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc.\n");

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
					"Elaborar um programa que apresente os valores de convers�o de graus Celsius em Fahrenheit, de \r\n"
							+ "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \r\n"
							+ "programa deve apresentar os valores das duas temperaturas.\n");
			
			  double fahrenheit = 0;

		        for(double celsius = 10;celsius <= 100; celsius = celsius + 10) {
		            fahrenheit = (9*celsius+160)/5;
		            System.out.println("O resultado da convers�o de "+celsius+" graus celsius para "+fahrenheit+" graus fahrenheit.");
		        }
		        
			break;
		case 11:
			System.out.println(
					"Elaborar um programa que apresente como resultado o valor do fatorial dos valores �mpares \r\n"
							+ "situados na faixa num�rica de 1 a 10.\n");
			
			double contFatorial = 0;
	        double fatorial = 0;

	        for(double cont = 1; cont<= 10; cont = cont +2){
	            contFatorial = 1;
	            fatorial = 1;
	            do {
	                fatorial = fatorial*contFatorial;
	                contFatorial = contFatorial + 1;
	            } while(contFatorial<cont);
	            System.out.println("O fatorial de "+cont+" � "+fatorial);
	        }
	        
			break;
		default:

			System.out.println("\nN�mero inv�lido\n");

			break;
		}
	}
}
