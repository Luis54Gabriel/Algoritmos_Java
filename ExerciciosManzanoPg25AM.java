package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg25AM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Manzano 1 ao 13");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {
		
		case 1:
			
			System.out.println("\nExercício 1 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de \r\n"
					+ "conversão é F ← (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.\n");
			
			System.out.println("Digite a temperatura em graus Celsius: ");
			
			double temperaturaCelsius1 = sc.nextDouble();
			
			double temperaturaFahrenheit1 = (9 * temperaturaCelsius1 + 160) / 5;
			
			System.out.println("A temperatura " + temperaturaCelsius1 + "° Celsius é igual a: " + temperaturaFahrenheit1 + "° Fahrenheit.");

			break;
		case 2:
		
			System.out.println("\nExercício 2 - Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de \r\n"
					+ "conversão é C ← (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.\n");
			
			System.out.println("Digite a temperatura em graus Celsius: ");
			
			double temperaturaFahrenheit2 = sc.nextDouble();
			
			double temperaturaCelsius2 = (temperaturaFahrenheit2 - 32) * (5 / 9);
			
			System.out.println("A temperatura " + temperaturaFahrenheit2 + "° Fahrenheit é igual a: " + temperaturaCelsius2 + "° Celsius.");
			
			break;
		case 3:
			
			System.out.println("\nExercício 3 - Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:\r\n"
					+ "Volume <- PI * Raio^2 * Altura.\n");
			
			System.out.println("Digite a altura da lata: ");
			
			double alturaLata = sc.nextDouble();
			
			System.out.println("Digite o raio da lata: ");
			
			double raioLata = sc.nextDouble();
			
			double volumeLata = Math.PI * Math.pow(raioLata, 2) * alturaLata;
			
			System.out.println("O volume da lata é igual a: " + volumeLata + ".");
			
			break;
		case 4:
			
			System.out.println("\nExercício 4 - Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um \r\n"
					+ "automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto \r\n"
					+ "(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a \r\n"
					+ "distância percorrida com a fórmula DISTANCIA ← TEMPO * VELOCIDADE. Possuindo o valor da \r\n"
					+ "distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula \r\n"
					+ "LITROS_USADOS ← DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade \r\n"
					+ "média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a \r\n"
					+ "quantidade de litros (LITROS_USADOS) utilizada na viagem.\r\n");
			
			System.out.println("Digite o tempo gasto na viagem: ");
			
			double tempoViagem = sc.nextDouble();
			
			System.out.println("Digite a velocidade média durante a viagem: ");
			
			double velocidadeViagem = sc.nextDouble();
			
			double distanciaPercorrida = tempoViagem * velocidadeViagem;
			
			double litrosUsados = distanciaPercorrida / 12;
			
			System.out.println("A velocidade média foi de: " + velocidadeViagem + "Km/h. O tempo gasto na viagem foi de: " + tempoViagem + " \r\n"
					+ " horas. A distância percorrida foi de: " + distanciaPercorrida + " km. A quantidade de litros utilizados na viagem foi de: " + litrosUsados + " litros. ");
			
			break;
		case 5:
			
			System.out.println("\nExercício 5 - Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula \r\n"
					+ "PRESTACAO ← VALOR + (VALOR * TAXA/100) * TEMPO.\n");
			
			System.out.println("Digite o valor da prestação: ");
			
			double valorPrestacao = sc.nextDouble();
			
			System.out.println("Digite o valor da taxa: ");
			
			double valorTaxa = sc.nextDouble();
			
			System.out.println("Digite o tempo de atraso: ");
			
			double tempoAtraso = sc.nextDouble();
			
			double prestacao = valorPrestacao + (valorPrestacao * valorTaxa / 100) * tempoAtraso;
			
			System.out.println("O valor da prestação em atraso é de: R$" + prestacao + ".");
			
			break;
		case 6:
			
			System.out.println("\nExercício 6 - Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de \r\n"
					+ "forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da \r\n"
					+ "variável A. Apresentar os valores trocados.\n");
			
			System.out.println("Digite o primeiro valor: ");
			
			double valor01 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			
			double valor02 = sc.nextDouble();
			
			System.out.println("O primeiro valor é igual a: " + valor01 + ". O segundo valor é igual a: " + valor02 + ".");
			
			double valorArmazenado;
			
			System.out.println("Trocando valores...");
			
			valorArmazenado = valor02;
			
			valor02 = valor01;
			
			valor01 = valorArmazenado;
			
			System.out.println("O primeiro valor agora é igual a: " + valor01 + ". O segundo valor agora é igual a: " + valor02 + ".");
			
			break;
		case 7:
			
			System.out.println("\nExercício 7 - Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na \r\n"
					+ "utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, \r\n"
					+ "devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim \r\n"
					+ "C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de \r\n"
					+ "multiplicação e apresentar doze resultados de saída.\r\n");
			
			System.out.println("Digite o primeiro valor: ");
			
			double A = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			
			double B = sc.nextDouble();
			
			System.out.println("Digite o terceiro valor: ");
			
			double C = sc.nextDouble();
			
			System.out.println("Digite o quarto valor: ");
			
			double D = sc.nextDouble();
			
			double resultado01 = A + B;
			double resultado02 = A + C;
			double resultado03 = A + D;
			double resultado04 = B + C;
			double resultado05 = B + D;
			double resultado06 = C + D;
			
			double resultado07 = A * B;
			double resultado08 = A * C;
			double resultado09 = A * D;
			double resultado10 = B * C;
			double resultado11 = B * D;
			double resultado12 = C * D;
			
			System.out.println("Resultado 01: " + resultado01 + ".\n"
					+ "Resultado 02: " + resultado02 + ".\n"
					+ "Resultado 03: " + resultado03 + ".\n" 
					+ "Resultado 04: " + resultado04 + ".\n" 
					+ "Resultado 05: " + resultado05 + ".\n" 
					+ "Resultado 06: " + resultado06 + ".\n"
					
					+ "Resultado 07: " + resultado07 + ".\n" 
					+ "Resultado 08: " + resultado08 + ".\n" 
					+ "Resultado 09: " + resultado09 + ".\n" 
					+ "Resultado 10: " + resultado10 + ".\n" 
					+ "Resultado 11: " + resultado11 + ".\n" 
					+ "Resultado 12: " + resultado12 + ".\n" );
			
			break;
		case 8:
			
			System.out.println("\nExercício 8 - Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula \r\n"
					+ "VOLUME ← COMPRIMENTO * LARGURA * ALTURA.\r\n");
			
			System.out.println("Digite o comprimento da caixa: ");
			
			double comprimentoCaixa = sc.nextDouble();
			
			System.out.println("Digite a largura da caixa: ");
			
			double larguraCaixa = sc.nextDouble();
			
			System.out.println("Digite a altura da caixa: ");
			
			double alturaCaixa = sc.nextDouble();
			
			double volumeCaixa = comprimentoCaixa * larguraCaixa * alturaCaixa;
			
			System.out.println("O volume da caixa é igual a: " + volumeCaixa + ".");
			
			break;
		case 9:
			
			System.out.println("\nExercício 9 - Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo \r\n"
					+ "segundo.\n");
			
			System.out.println("Digite o primeiro valor: ");
			
			double primeiroValor = sc.nextDouble();
			
			System.out.println("DIgite o segundo valor: ");
			
			double segundoValor = sc.nextDouble();
			
			double resultadoQuadradoDiferenca = Math.pow(primeiroValor - segundoValor, 2);
			
			System.out.println("O quadrado da diferença dos valores digitados é igual a: " + resultadoQuadradoDiferenca + ".");
			
			break;
		case 10:
			
			System.out.println("\nExercício 10 - Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em \r\n"
					+ "dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares \r\n"
					+ "disponível com o usuário, para que seja apresentado o valor em moeda brasileira\n");
			
			System.out.println("Digite o valor da cotação do dólar: ");
			
			double valorDolar = sc.nextDouble();
			
			System.out.println("Digite o valor em dólar para conversão: ");
			
			double dolar = sc.nextDouble();
			
			double valorRealConvertido = dolar * valorDolar;
			
			System.out.println("O valor: $" + dolar + " convertido em reais é de: R$" + valorRealConvertido + ".");
			
			break;
		case 11:
			
			System.out.println("\nExercício 11 - Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em \r\n"
					+ "real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível \r\n"
					+ "com o usuário, para que seja apresentado o valor em moeda americana.\r\n");
			
			System.out.println("Digite o valor da cotação do dólar: ");
			
			double valorReal = sc.nextDouble();
			
			System.out.println("Digite o valor em dólar para conversão: ");
			
			double real = sc.nextDouble();
			
			double valorDolarConvertido = real / valorReal;
			
			System.out.println("O valor: R$" + real + " convertido em reais é de: $" + valorDolarConvertido + ".");
			
			break;
		case 12:
			
			System.out.println("\nExercício 12 - Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à \r\n"
					+ "soma dos quadrados dos três valores lidos.\r\n");
			
			System.out.println("Digite o primeiro valor: ");
			
			double valorA01 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			
			double valorB01 = sc.nextDouble();
			
			System.out.println("Digite o terceiro valor: ");
			
			double valorC01 = sc.nextDouble();
			
			double resultadoSomaQuadrado = Math.pow(valorA01, 2) + Math.pow(valorB01, 2) + Math.pow(valorC01, 2);
			
			System.out.println("A soma dos quadrados dos valores digitados é igual a: " + resultadoSomaQuadrado + ".");
			
			break;
		case 13:
			
			System.out.println("\nExercício 13 - Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o \r\n"
					+ "quadrado da soma dos três valores lidos.\r\n");
			
			System.out.println("Digite o primeiro valor: ");
			
			double valorA02 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			
			double valorB02 = sc.nextDouble();
			
			System.out.println("Digite o terceiro valor: ");
			
			double valorC02 = sc.nextDouble();
			
			double resultadoQuadradoSoma = Math.pow(valorA02 + valorB02 + valorC02, 2);
			
			System.out.println("O quadrado da soma dos valores digitados é igual a: " + resultadoQuadradoSoma + ".");
			
			break;
		default:
			
			System.out.println("\nNúmero inválido\n");
			
			break;
				
		}
	}
}
