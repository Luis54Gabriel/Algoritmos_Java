package exercicios;

import java.util.Scanner;

public class Exerc�ciosFaccat14ao26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios Faccat 14 ao 26");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 14:

			System.out.println(
					"\nExerc�cio 14 - Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso \r\n"
							+ "contr�rio escrever N�O � MAIOR QUE 10!\n");

			System.out.println("Digite um valor: ");

			double valor01 = sc.nextDouble();

			if (valor01 > 10) {

				System.out.println("� maior que 10!");

			} else if (valor01 == 10) {

				System.out.println("� igual a 10!");

			} else {

				System.out.println("N�o � maior que 10!");

			}

			break;
		case 15:

			System.out.println(
					"\nExerc�cio 15 - Ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo).\n");

			System.out.println("Digite um valor: ");

			double valor02 = sc.nextDouble();

			if (valor02 > 0) {

				System.out.println("� positivo!");

			} else if (valor02 < 0) {

				System.out.println("� negativo!");

			} else {

				System.out.println("� igual a 0!");

			}

			break;
		case 16:

			System.out.println(
					"\nExerc�cio 16 - As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem \r\n"
							+ "compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e \r\n"
							+ "escreva o custo total da compra.\n");

			System.out.println("Digite o n�mero de ma�as compradas: ");

			int quantidadeMacas = sc.nextInt();

			if (quantidadeMacas < 1) {

				System.out.println("N�mero inv�lido");

			} else if (quantidadeMacas < 12) {

				double precoMacas = quantidadeMacas * 1.30;

				System.out.println("O pre�o das ma�as � de: R$" + precoMacas + ".");

			} else if (quantidadeMacas > 12) {

				System.out.println("O pre�o das ma�as � de: R$" + quantidadeMacas + ".");

			}

			break;
		case 17:

			System.out.println(
					"\nExerc�cio 17 - Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever \r\n"
							+ "uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o \r\n"
							+ "aluno � aprovado). Escrever tamb�m a m�dia calculada.\n");

			System.out.println("Digite a primeira nota da avalia��o: ");

			double nota01 = sc.nextDouble();

			System.out.println("Digite a segunda nota da avalia��o: ");

			double nota02 = sc.nextDouble();

			double mediaAluno = (nota01 + nota02) / 2;

			if (mediaAluno > 6) {

				System.out.println("O aluno foi aprovado! \nA m�dia do aluno foi de: " + mediaAluno + ".");

			} else {

				System.out.println("O aluno foi Reprovado! \nA m�dia do aluno foi de: " + mediaAluno + ".");

			}

			break;
		case 18:

			System.out.println(
					"\nExerc�cio 18 - Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela \r\n"
							+ "poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu).\n");

			System.out.println("Digite o ano atual: ");

			short anoAtual = sc.nextShort();

			System.out.println("Digite o ano de nascimento: ");

			short anoNascimento = sc.nextShort();

			int idade = anoAtual - anoNascimento;

			if (idade > 16) {

				System.out.println("Voc� j� pode votar!");

			} else {

				System.out.println("Voc� ainda n�o pode votar!");

			}

			break;
		case 19:

			System.out.println(
					"\nExerc�cio 19 - Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles.\n");

			System.out.println("Digite o primeiro valor: ");

			double valorA01 = sc.nextDouble();

			System.out.println("Digite o segundo valor: ");

			double valorA02 = sc.nextDouble();

			if (valorA01 > valorA02) {

				System.out.println("O valor " + valorA01 + " � maior que o valor " + valorA02 + ".");

			} else {

				System.out.println("O valor " + valorA02 + " � maior que o valor " + valorA01 + ".");

			}

			break;
		case 20:

			System.out.println(
					"\nExerc�cio 19 - Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los em ordem crescente.\n");

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
					"\nExerc�cio 21 - Ler a hora de in�cio e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os \r\n"
							+ "minutos) e calcule a dura��o do jogo em horas, sabendo-se que o tempo m�ximo de dura��o do jogo � \r\n"
							+ "de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.\n");

			System.out.println("Digite o hor�rio de in�cio do jogo: ");

			int horarioInicio = sc.nextInt();

			System.out.println("Digite o hor�rio de t�rmino do jogo: ");

			int horarioTermino = sc.nextInt();

			break;
		case 22:

			System.out.println(
					"\nExerc�cio 22 - A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais \r\n"
							+ "de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. \r\n"
							+ "Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva \r\n"
							+ "o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas \r\n"
							+ "(considere que o m�s possua 4 semanas exatas).\n");

			System.out.println("Digite o n�mero de horas trabalhadas em um m�s: ");

			int horasTrabalhadasMes = sc.nextInt();

			System.out.println("Digite o sal�rio por hora: ");

			int salarioHoras = sc.nextInt();

			int horasTrabalhadasSemana = horasTrabalhadasMes / 4;

			if (horasTrabalhadasSemana > 40) {

				int horaExtra = salarioHoras + (salarioHoras / 2);

				int salarioTotal = (40 * salarioHoras) + ((horasTrabalhadasSemana - 40) * horaExtra);

				System.out.println("O sal�rio total do funcion�rio � de: R$" + salarioTotal + ".");

			} else {

				int salarioTotal = 40 * salarioHoras;

				System.out.println("O sal�rio total do funcion�rio � de: R$" + salarioTotal + ".");

			}

			break;
		case 23:

			System.out.println(
					"\nExerc�cios 23 -  Para o enunciado a seguir foi elaborado um algoritmo em Portugu�s Estruturado que cont�m \r\n"
							+ "erros, identifique os erros no algoritmo apresentado abaixo:\r\n"
							+ "Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule \r\n"
							+ "e mostre seu peso ideal, utilizando as seguintes f�rmulas: \r\n"
							+ " - para sexo masculino: peso ideal = (72.7 * altura) - 58 \r\n"
							+ " - para sexo feminino: peso ideal = (62.1 * altura) - 44.7 \r\n");

			System.out.println("Digite seu sexo (1 para Masculino e 2 para Feminino): ");

			byte sexo = sc.nextByte();

			System.out.println("Digite sua altura: ");

			double altura = sc.nextDouble();

			if (sexo == 1) {

				double pesoIdeal = (72.7 * altura) - 58;

				System.out.println("O seu peso ideal �: " + pesoIdeal + "kg.");

			} else {

				double pesoIdeal = (62.1 * altura) - 44.7;

				System.out.println("O seu peso ideal �: " + pesoIdeal + "kg.");

			}

			break;
		case 24:

			System.out.println(
					"\nExerc�cio 24 - Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que \r\n"
							+ "ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que \r\n"
							+ "ultrapassar este valor, calcular e escrever o seu sal�rio total.\n");

			System.out.println("Digite o seu sal�rio: ");

			double salarioFixo = sc.nextDouble();

			System.out.println("Digite o valor de vendas efetuadas: ");

			double valorVendas = sc.nextDouble();

			if (valorVendas < 1500) {

				double salarioTotal = salarioFixo + ((valorVendas / 100) * 3);

				System.out.println("O sal�rio total � igual a: R$" + salarioTotal + ".");

			} else if (salarioFixo > 1500) {

				double salarioTotal3Porcento = salarioFixo + ((valorVendas / 100) * 3);

				valorVendas = valorVendas - 1500;

				double salarioTotal = salarioTotal3Porcento + (salarioFixo + ((valorVendas / 100) * 5));

				System.out.println("O sal�rio total � igual a: R$" + salarioTotal + ".");

			}

			break;
		case 25:
			
			System.out.println("Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e \r\n"
					+ "escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior \r\n"
					+ "ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.\n");
			
			double numeroConta, saldo, debito, credito, saldoAtual;

			System.out.println("Insira o n�mero da sua conta:");
			numeroConta = sc.nextDouble();

			System.out.println("Insira o seu saldo:");
			saldo = sc.nextDouble();

			System.out.println("Insira seu d�bito:");
			debito = sc.nextDouble();

			System.out.println("Insira o seu cr�dito:");
			credito = sc.nextDouble();

			saldoAtual = saldo - debito - credito;

			if (saldoAtual >= 0) {

				System.out.println("Saldo positivo!");

			} else {

				System.out.println("Saldo negativo!");

			}

			break;
		case 26:
			System.out.println("Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e \r\n"
					+ "quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade \r\n"
					+ "m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual \r\n"
					+ "a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar \r\n"
					+ "compra'.\n");
			
			
			 double qatAtual, qatMax, qatMin, qatMedia;

		        System.out.println("Digite a quantidade atual de produtos no estoque:");
		        qatAtual = sc.nextDouble();

		        System.out.println("Digite a quantidade m�xima de produtos no estoque:");
		        qatMax = sc.nextDouble();

		        System.out.println("Digite a quantidade min�ma de produtos no estoque:");
		        qatMin = sc.nextDouble();

		        qatMedia = (qatMax+qatMin)/2;
		        if(qatAtual>=qatMedia) {
		            System.out.println("N�o efetuar compra!");
		        } else {
		            System.out.println("Efetuar compra!");
		        }
				break;
			default:

				System.out.println("\nN�mero inv�lido\n");

			}
		}

	}

