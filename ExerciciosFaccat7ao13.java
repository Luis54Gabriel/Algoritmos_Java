package exercicios;

import java.util.Scanner;

public class ExerciciosFaccat7ao13 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Faccat 7 ao 13");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();
		
		switch (exercicio) {
		
		case 7:
			
			System.out.println("\nExercício 7 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade \r\n"
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
			
			System.out.println("A idade inserida em dias é: " + idadeEmDias);
			
			break;
		case 8:

			System.out.println("\nExercício 8 - Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos \r\n"
					+ "brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total \r\n"
					+ "de eleitores.\n");
			
			System.out.println("Digite o número de votos válidos:");
			
			int votosValidos = sc.nextInt();
			
			System.out.println("Digite o número de votos brancos:");
			
			int votosBrancos = sc.nextInt();
			
			System.out.println("Digite o número de votos nulos:");
			
			int votosNulos = sc.nextInt();
			
			int totalEleitores = votosValidos + votosBrancos + votosNulos;
			
			double percentualVotosValidos = (votosValidos * 100) / totalEleitores;
			double percentualVotosBrancos = (votosBrancos * 100) / totalEleitores;
			double percentualVotosNulos = (votosNulos * 100) / totalEleitores;
			
			System.out.println("O percentual de votos válidos é de: " + percentualVotosValidos + "%. O percentual de votos brancos é de: \r\n"
			+ percentualVotosBrancos + "%. O percentual de votos nulos é de: " + percentualVotosNulos + "%.");
			
			break;
		case 9:
			
			System.out.println("\nExercício 9 - Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. \r\n"
					+ "Calcular e escrever o valor do novo salário.\n");
			
			System.out.println("Digite o salário mensal:");
			
			double salarioMensal = sc.nextDouble();
			
			System.out.println("Digite o percentual de reajuste:");
			
			double reajuste = sc.nextDouble();
			
			double salarioReajustado = ((salarioMensal / 100) * reajuste) + salarioMensal;
			
			System.out.println("O valor do salário com reajuste é de: R$" + salarioReajustado + ".");
			
			break;
		case 10:
			
			System.out.println("\nExercício 10 - O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do \r\n"
					+ "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor \r\n"
					+ "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, \r\n"
					+ "calcular e escrever o custo final ao consumidor.\n");
			
			System.out.println("Digite o custo de fábrica do carro: ");
			
			double custoFabrica = sc.nextDouble();
			
			double custoFinal = custoFabrica + ((custoFabrica/100)*28) + ((custoFabrica/100)*45);
			
			System.out.println("O custo final é de: R$" + custoFinal + ".");
			
			break;
		case 11:

			System.out.println("\nExercício 11 - Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, \r\n"
					+ "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele \r\n"
					+ "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas \r\n"
					+ "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do \r\n"
					+ "vendedor.\n");
			
			System.out.println("Digite o salário fixo do funcionário: ");
			
			double salarioFixo = sc.nextDouble();
			
			System.out.println("Digite o número de carros vendidos: ");
			
			double numeroCarros = sc.nextDouble();
			
			System.out.println("Digite o valor total de suas vendas: ");
			
			double valorTotalVendas = sc.nextDouble();
			
			System.out.println("Digite o valor recebido por carro vendido: ");
			
			double valorCarroVendido = sc.nextDouble();
			
			double salarioFinal = salarioFixo + ((valorTotalVendas/100)*5) + (numeroCarros * valorCarroVendido);
			
			System.out.println("O salario final é : R$" + salarioFinal + ".");
					
			break;
		case 12:
			
			System.out.println("\nExercício 12 - Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor \r\n"
					+ "correspondente em graus Celsius.\n");
			
			System.out.println("Digite a temperatura em graus Fahrenheit: ");
			
			double grausFahrenheit = sc.nextDouble();
			
			double grausCelsius = (grausFahrenheit - 32) * 5/9;
			
			System.out.println("A temperatura " + grausFahrenheit + "° Fahrenheit é igual a : " + grausCelsius + "° Celsius.");
			
			break;
		case 13:
			
			System.out.println("\nExercício 13 - Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. \r\n"
					+ "Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.\n");
			
			System.out.println("Digite a primeira nota do aluno: ");
			
			double nota01 = sc.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno: ");
			
			double nota02 = sc.nextDouble();
			
			System.out.println("Digite a terceira nota do aluno: ");
			
			double nota03 = sc.nextDouble();
			
			double mediaPonderada = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)); 
			
			
			System.out.println("A média ponderada das notas é igual a: " + mediaPonderada);
			
			break;
		default:			

			System.out.println("\nNúmero inválido\n");
			
			break;
			
		}
		
	}

}
