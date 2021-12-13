package exercicios;

import java.util.Scanner;

public class ExerciciosFaccat7ao13 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios Faccat 7 ao 13");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();
		
		switch (exercicio) {
		
		case 7:
			
			System.out.println("\nExerc�cio 7 - Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade \r\n"
					+ "dessa pessoa expressa apenas em dias.\n");
			
			System.out.println("Digite sua idade em anos de vida:");
			
			byte idadeAnos = sc.nextByte();
			
			System.out.println("Digite sua idade em meses de vida:");
			
			byte idadeMeses = sc.nextByte();
			
			System.out.println("Digite sua idade em dia de vida:");
			
			byte idadeDias = sc.nextByte();
			
			int idadeAnosDias = idadeAnos * 365;
			int idadeMesesDias = idadeMeses * 30;
			int idadeEmDias = idadeAnosDias + idadeMesesDias + idadeDias;
			
			System.out.println("A idade inserida em dias �: " + idadeEmDias);
			
			break;
		case 8:

			System.out.println("\nExerc�cio 8 - Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos \r\n"
					+ "brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total \r\n"
					+ "de eleitores.\n");
			
			System.out.println("Digite o n�mero de votos v�lidos:");
			
			int votosValidos = sc.nextInt();
			
			System.out.println("Digite o n�mero de votos brancos:");
			
			int votosBrancos = sc.nextInt();
			
			System.out.println("Digite o n�mero de votos nulos:");
			
			int votosNulos = sc.nextInt();
			
			int totalEleitores = votosValidos + votosBrancos + votosNulos;
			
			double percentualVotosValidos = (votosValidos * 100) / totalEleitores;
			double percentualVotosBrancos = (votosBrancos * 100) / totalEleitores;
			double percentualVotosNulos = (votosNulos * 100) / totalEleitores;
			
			System.out.println("O percentual de votos v�lidos � de: " + percentualVotosValidos + "%. O percentual de votos brancos � de: \r\n"
			+ percentualVotosBrancos + "%. O percentual de votos nulos � de: " + percentualVotosNulos + "%.");
			
			break;
		case 9:
			
			System.out.println("\nExerc�cio 9 - Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. \r\n"
					+ "Calcular e escrever o valor do novo sal�rio.\n");
			
			System.out.println("Digite o sal�rio mensal:");
			
			double salarioMensal = sc.nextDouble();
			
			System.out.println("Digite o percentual de reajuste:");
			
			double reajuste = sc.nextDouble();
			
			double salarioReajustado = ((salarioMensal / 100) * reajuste) + salarioMensal;
			
			System.out.println("O valor do sal�rio com reajuste � de: R$" + salarioReajustado + ".");
			
			break;
		case 10:
			
			System.out.println("\nExerc�cio 10 - O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do \r\n"
					+ "distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor \r\n"
					+ "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro, \r\n"
					+ "calcular e escrever o custo final ao consumidor.\n");
			
			System.out.println("Digite o custo de f�brica do carro: ");
			
			double custoFabrica = sc.nextDouble();
			
			double custoFinal = custoFabrica + ((custoFabrica/100)*28) + ((custoFabrica/100)*45);
			
			System.out.println("O custo final � de: R$" + custoFinal + ".");
			
			break;
		case 11:

			System.out.println("\nExerc�cio 11 - Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s, \r\n"
					+ "mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele \r\n"
					+ "efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas \r\n"
					+ "vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do \r\n"
					+ "vendedor.\n");
			
			System.out.println("Digite o sal�rio fixo do funcion�rio: ");
			
			double salarioFixo = sc.nextDouble();
			
			System.out.println("Digite o n�mero de carros vendidos: ");
			
			double numeroCarros = sc.nextDouble();
			
			System.out.println("Digite o valor total de suas vendas: ");
			
			double valorTotalVendas = sc.nextDouble();
			
			System.out.println("Digite o valor recebido por carro vendido: ");
			
			double valorCarroVendido = sc.nextDouble();
			
			double salarioFinal = salarioFixo + ((valorTotalVendas/100)*5) + (numeroCarros * valorCarroVendido);
			
			System.out.println("O salario final � : R$" + salarioFinal + ".");
					
			break;
		case 12:
			
			System.out.println("\nExerc�cio 12 - Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor \r\n"
					+ "correspondente em graus Celsius.\n");
			
			System.out.println("Digite a temperatura em graus Fahrenheit: ");
			
			double grausFahrenheit = sc.nextDouble();
			
			double grausCelsius = (grausFahrenheit - 32) * 5/9;
			
			System.out.println("A temperatura " + grausFahrenheit + "� Fahrenheit � igual a : " + grausCelsius + "� Celsius.");
			
			break;
		case 13:
			
			System.out.println("\nExerc�cio 13 - Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno. \r\n"
					+ "Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5.\n");
			
			System.out.println("Digite a primeira nota do aluno: ");
			
			double nota01 = sc.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno: ");
			
			double nota02 = sc.nextDouble();
			
			System.out.println("Digite a terceira nota do aluno: ");
			
			double nota03 = sc.nextDouble();
			
			double mediaPonderada = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)); 
			
			
			System.out.println("A m�dia ponderada das notas � igual a: " + mediaPonderada);
			
			break;
		default:			

			System.out.println("\nN�mero inv�lido\n");
			
			break;
			
		}
		
	}

}
