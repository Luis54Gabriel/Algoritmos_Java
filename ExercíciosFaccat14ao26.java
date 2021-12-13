package exercicios;

import java.util.Scanner;

public class ExercíciosFaccat14ao26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Faccat 14 ao 26");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 14:

			System.out.println(
					"\nExercício 14 - Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso \r\n"
							+ "contrário escrever NÃO É MAIOR QUE 10!\n");

			System.out.println("Digite um valor: ");

			double valor01 = sc.nextDouble();

			if (valor01 > 10) {

				System.out.println("É maior que 10!");

			} else if (valor01 == 10) {

				System.out.println("É igual a 10!");

			} else {

				System.out.println("Não é maior que 10!");

			}

			break;
		case 15:

			System.out.println(
					"\nExercício 15 - Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).\n");

			System.out.println("Digite um valor: ");

			double valor02 = sc.nextDouble();

			if (valor02 > 0) {

				System.out.println("É positivo!");

			} else if (valor02 < 0) {

				System.out.println("É negativo!");

			} else {

				System.out.println("É igual a 0!");

			}

			break;
		case 16:

			System.out.println(
					"\nExercício 16 - As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem \r\n"
							+ "compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e \r\n"
							+ "escreva o custo total da compra.\n");

			System.out.println("Digite o número de maças compradas: ");

			int quantidadeMacas = sc.nextInt();

			if (quantidadeMacas < 1) {

				System.out.println("Número inválido");

			} else if (quantidadeMacas < 12) {

				double precoMacas = quantidadeMacas * 1.30;

				System.out.println("O preço das maças é de: R$" + precoMacas + ".");

			} else if (quantidadeMacas > 12) {

				System.out.println("O preço das maças é de: R$" + quantidadeMacas + ".");

			}

			break;
		case 17:

			System.out.println(
					"\nExercício 17 - Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever \r\n"
							+ "uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o \r\n"
							+ "aluno é aprovado). Escrever também a média calculada.\n");

			System.out.println("Digite a primeira nota da avaliação: ");

			double nota01 = sc.nextDouble();

			System.out.println("Digite a segunda nota da avaliação: ");

			double nota02 = sc.nextDouble();

			double mediaAluno = (nota01 + nota02) / 2;

			if (mediaAluno > 6) {

				System.out.println("O aluno foi aprovado! \nA média do aluno foi de: " + mediaAluno + ".");

			} else {

				System.out.println("O aluno foi Reprovado! \nA média do aluno foi de: " + mediaAluno + ".");

			}

			break;
		case 18:

			System.out.println(
					"\nExercício 18 - Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela \r\n"
							+ "poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).\n");

			System.out.println("Digite o ano atual: ");

			short anoAtual = sc.nextShort();

			System.out.println("Digite o ano de nascimento: ");

			short anoNascimento = sc.nextShort();

			int idade = anoAtual - anoNascimento;

			if (idade > 16) {

				System.out.println("Você já pode votar!");

			} else {

				System.out.println("Você ainda não pode votar!");

			}

			break;
		case 19:

			System.out.println(
					"\nExercício 19 - Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.\n");

			System.out.println("Digite o primeiro valor: ");

			double valorA01 = sc.nextDouble();

			System.out.println("Digite o segundo valor: ");

			double valorA02 = sc.nextDouble();

			if (valorA01 > valorA02) {

				System.out.println("O valor " + valorA01 + " é maior que o valor " + valorA02 + ".");

			} else {

				System.out.println("O valor " + valorA02 + " é maior que o valor " + valorA01 + ".");

			}

			break;
		case 20:

			System.out.println(
					"\nExercício 19 - Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.\n");

			System.out.println("Digite o primeiro valor: ");

			double valorB01 = sc.nextDouble();

			System.out.println("Digite o segundo valor: ");

			double valorB02 = sc.nextDouble();

			if (valorB01 > valorB02) {

				System.out.println("Valores em ordem crescente: " + valorB02 + ", " + valorB01 + ".");

			} else {

				System.out.println("Valores em ordem crescente: " + valorB01 + ", " + valorB02 + ".");

			}

			break;
		case 21:

			System.out.println(
					"\nExercício 21 - Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os \r\n"
							+ "minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é \r\n"
							+ "de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.\n");

			System.out.println("Digite o horário de início do jogo: ");

			int horarioInicio = sc.nextInt();

			System.out.println("Digite o horário de término do jogo: ");

			int horarioTermino = sc.nextInt();

			break;
		case 22:

			System.out.println(
					"\nExercício 22 - A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais \r\n"
							+ "de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. \r\n"
							+ "Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva \r\n"
							+ "o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas \r\n"
							+ "(considere que o mês possua 4 semanas exatas).\n");

			System.out.println("Digite o número de horas trabalhadas em um mês: ");

			int horasTrabalhadasMes = sc.nextInt();

			System.out.println("Digite o salário por hora: ");

			int salarioHoras = sc.nextInt();

			int horasTrabalhadasSemana = horasTrabalhadasMes / 4;

			if (horasTrabalhadasSemana > 40) {

				int horaExtra = salarioHoras + (salarioHoras / 2);

				int salarioTotal = (40 * salarioHoras) + ((horasTrabalhadasSemana - 40) * horaExtra);

				System.out.println("O salário total do funcionário é de: R$" + salarioTotal + ".");

			} else {

				int salarioTotal = 40 * salarioHoras;

				System.out.println("O salário total do funcionário é de: R$" + salarioTotal + ".");

			}

			break;
		case 23:

			System.out.println(
					"\nExercícios 23 -  Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém \r\n"
							+ "erros, identifique os erros no algoritmo apresentado abaixo:\r\n"
							+ "Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule \r\n"
							+ "e mostre seu peso ideal, utilizando as seguintes fórmulas: \r\n"
							+ " - para sexo masculino: peso ideal = (72.7 * altura) - 58 \r\n"
							+ " - para sexo feminino: peso ideal = (62.1 * altura) - 44.7 \r\n");

			System.out.println("Digite seu sexo (1 para Masculino e 2 para Feminino): ");

			byte sexo = sc.nextByte();

			System.out.println("Digite sua altura: ");

			double altura = sc.nextDouble();

			if (sexo == 1) {

				double pesoIdeal = (72.7 * altura) - 58;

				System.out.println("O seu peso ideal é: " + pesoIdeal + "kg.");

			} else {

				double pesoIdeal = (62.1 * altura) - 44.7;

				System.out.println("O seu peso ideal é: " + pesoIdeal + "kg.");

			}

			break;
		case 24:

			System.out.println(
					"\nExercício 24 - Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que \r\n"
							+ "ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que \r\n"
							+ "ultrapassar este valor, calcular e escrever o seu salário total.\n");

			System.out.println("Digite o seu salário: ");

			double salarioFixo = sc.nextDouble();

			System.out.println("Digite o valor de vendas efetuadas: ");

			double valorVendas = sc.nextDouble();

			if (valorVendas < 1500) {

				double salarioTotal = salarioFixo + ((valorVendas / 100) * 3);

				System.out.println("O salário total é igual a: R$" + salarioTotal + ".");

			} else if (salarioFixo > 1500) {

				double salarioTotal3Porcento = salarioFixo + ((valorVendas / 100) * 3);

				valorVendas = valorVendas - 1500;

				double salarioTotal = salarioTotal3Porcento + (salarioFixo + ((valorVendas / 100) * 5));

				System.out.println("O salário total é igual a: R$" + salarioTotal + ".");

			}

			break;
		case 25:
			
			System.out.println("Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e \r\n"
					+ "escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior \r\n"
					+ "ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.\n");
			
			double numeroConta, saldo, debito, credito, saldoAtual;

			System.out.println("Insira o número da sua conta:");
			numeroConta = sc.nextDouble();

			System.out.println("Insira o seu saldo:");
			saldo = sc.nextDouble();

			System.out.println("Insira seu débito:");
			debito = sc.nextDouble();

			System.out.println("Insira o seu crédito:");
			credito = sc.nextDouble();

			saldoAtual = saldo - debito - credito;

			if (saldoAtual >= 0) {

				System.out.println("Saldo positivo!");

			} else {

				System.out.println("Saldo negativo!");

			}

			break;
		case 26:
			System.out.println("Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e \r\n"
					+ "quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade \r\n"
					+ "média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual \r\n"
					+ "a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar \r\n"
					+ "compra'.\n");
			
			
			 double qatAtual, qatMax, qatMin, qatMedia;

		        System.out.println("Digite a quantidade atual de produtos no estoque:");
		        qatAtual = sc.nextDouble();

		        System.out.println("Digite a quantidade máxima de produtos no estoque:");
		        qatMax = sc.nextDouble();

		        System.out.println("Digite a quantidade miníma de produtos no estoque:");
		        qatMin = sc.nextDouble();

		        qatMedia = (qatMax+qatMin)/2;
		        if(qatAtual>=qatMedia) {
		            System.out.println("Não efetuar compra!");
		        } else {
		            System.out.println("Efetuar compra!");
		        }
				break;
			default:

				System.out.println("\nNúmero inválido\n");

			}
		}

	}

