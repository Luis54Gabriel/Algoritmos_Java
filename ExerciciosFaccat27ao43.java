package exercicios;

import java.util.Scanner;

public class ExerciciosFaccat27ao43 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Faccat 27 ao 43");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 27:
			System.out.println("Ler um valor e escrever se é positivo, negativo ou zero.\n");

			double valor;

			System.out.println("Digite um valo:");
			valor = sc.nextDouble();

			if (valor < 0) {
				System.out.println(valor + " é negativo!");
			} else if (valor > 0) {
				System.out.println(valor + " é positivo!");
			} else {
				System.out.println("O valor é igual a 0!");
			}
			break;
		case 28:
			System.out.println(
					"Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.\n");
			double v1, v2, v3;

			System.out.println("Digite um valor que não seja zero:");
			v1 = sc.nextDouble();

			System.out.println("Digite um segundo valor que não seja zero:");
			v2 = sc.nextDouble();

			System.out.println("Digite um terceiro valor que não seja zero:");
			v3 = sc.nextDouble();

			if (v1 > v2 && v1 > v3) {
				System.out.println("O maior valor é: " + v1);
			} else if (v2 > v1 && v2 > v3) {
				System.out.println("O maior valor é: " + v2);
			} else {
				System.out.println("O maior valor é: " + v3);
			}
			break;
		case 29:
			System.out.println(
					"Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles\n");
			double va1, va2, va3, somaValores;

			System.out.println("Digite um valor que não seja zero:");
			va1 = sc.nextDouble();

			System.out.println("Digite um segundo valor que não seja zero:");
			va2 = sc.nextDouble();

			System.out.println("Digite um terceiro valor que não seja zero:");
			va3 = sc.nextDouble();

			if (va1 > va2 && va1 > va3) {
				if (va2 > va3) {
					somaValores = va1 + va2;
					System.out.println("A soma do primeiro e segundo valor é de: " + somaValores);
				} else if (va3 > va2) {
					somaValores = va1 + va3;
					System.out.println("A soma do primeiro e terceiro valor é de: " + somaValores);
				}
			} else if (va2 > va1 && va2 > va3) {
				if (va1 > va3) {
					somaValores = va2 + va1;
					System.out.println("A soma do segundo e primeiro valor é de: " + somaValores);
				} else if (va3 > va1) {
					somaValores = va2 + va3;
					System.out.println("A soma do segundo e terceiro valor é de: " + somaValores);
				}
			} else if (va3 > va1 && va3 > va2) {
				if (va2 > va1) {
					somaValores = va3 + va2;
					System.out.println("A soma do terceiro valor com o segundo é de: " + somaValores);
				} else if (va1 > va2) {
					somaValores = va3 + va1;
					System.out.println("A soma do terceiro valor com o primeiro é de: " + somaValores);
				}
			}
			break;
		case 30:
			System.out.println(
					"Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 \r\n"
							+ "maiores.\n");

			double val1, val2, val3, somaValores2 = 0;

			System.out.println("Digite um valor que não seja zero:");
			val1 = sc.nextDouble();

			System.out.println("Digite um segundo valor que não seja zero:");
			val2 = sc.nextDouble();

			System.out.println("Digite um terceiro valor que não seja zero:");
			val3 = sc.nextDouble();

			if (val1 > val2 && val1 > val3) {
				if (val2 > val3) {
					somaValores = val1 + val2;
					System.out.println("A soma do primeiro e segundo valor é de: " + somaValores2);
				} else if (val3 > val2) {
					somaValores = val1 + val3;
					System.out.println("A soma do primeiro e terceiro valor é de: " + somaValores2);
				}
			} else if (val2 > val1 && val2 > val3) {
				if (val1 > val3) {
					somaValores = val2 + val1;
					System.out.println("A soma do segundo e primeiro valor é de: " + somaValores2);
				} else if (val3 > val1) {
					somaValores = val2 + val3;
					System.out.println("A soma do segundo e terceiro valor é de: " + somaValores2);
				}
			} else if (val3 > val1 && val3 > val2) {
				if (val2 > val1) {
					somaValores = val3 + val2;
					System.out.println("A soma do terceiro valor com o segundo é de: " + somaValores2);
				} else if (val1 > val2) {
					somaValores = val3 + val1;
					System.out.println("A soma do terceiro valor com o primeiro é de: " + somaValores2);
				}
			}
			break;
		case 31:
			System.out.println(
					"Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem \r\n"
							+ "crescente.\n");
			double valor1, valor2, valor3;

			System.out.println("Digite um valor que não seja zero:");
			valor1 = sc.nextDouble();

			System.out.println("Digite um segundo valor que não seja zero:");
			valor2 = sc.nextDouble();

			System.out.println("Digite um terceiro valor que não seja zero:");
			valor3 = sc.nextDouble();

			if (valor1 > valor2 && valor2 > valor3) {
				System.out.println("A ordem crescente é: " + valor3 + ", " + valor2 + ", " + valor1);
			} else if (valor1 > valor3 && valor3 > valor2) {
				System.out.println("A ordem crescente é: " + valor2 + ", " + valor3 + ", " + valor1);
			} else if (valor2 > valor1 && valor1 > valor3) {
				System.out.println("A ordem crescente é: " + valor3 + ", " + valor1 + ", " + valor2);
			} else if (valor2 > valor3 && valor3 > valor1) {
				System.out.println("A ordem crescente é: " + valor1 + ", " + valor3 + ", " + valor2);
			} else if (valor3 > valor1 && valor1 > valor2) {
				System.out.println("A ordem crescente é: " + valor2 + ", " + valor1 + ", " + valor3);
			} else if (valor3 > valor2 && valor2 > valor1) {
				System.out.println("A ordem crescente é: " + valor1 + ", " + valor2 + ", " + valor3);
			}
			break;
		case 32:
			System.out.println(
					"Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam \r\n"
							+ "ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma \r\n"
							+ "dos outros 2 lados.\n");
			double A, B, C;

			System.out.println("Digite um valor para A:");
			A = sc.nextDouble();

			System.out.println("Digite um valor para B:");
			B = sc.nextDouble();

			System.out.println("Digite um valor para C:");
			C = sc.nextDouble();

			if (A < B + C) {
				System.out.println("Forma um triângulo!");
			} else if (B < A + C) {
				System.out.println("Forma um triângulo");
			} else if (C < A + B) {
				System.out.println("Forma um triângulo!");
			} else {
				System.out.println("Não forma um triângulo!");
			}
			break;
		case 33:
			System.out.println(
					"Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome \r\n"
							+ "do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.\n");
			String timeA, timeB;
			int golsTimeA, golsTimeB;

			System.out.println("Digite o nome do time A:");
			timeA = sc.next();

			System.out.println("Digite o nome do time B:");
			timeB = sc.next();

			System.out.println("Digite a quantidade de gols do time " + timeA + ":");
			golsTimeA = sc.nextInt();

			System.out.println("Digite a quantidade de gols do time " + timeB + ":");
			golsTimeB = sc.nextInt();

			if (golsTimeA > golsTimeB) {
				System.out.println(
						"O time " + timeA + " Ganhou do time " + timeB + " com um total de " + golsTimeA + " gols!");
			} else if (golsTimeB > golsTimeA) {
				System.out.println(
						"O time " + timeB + " Ganhou do time " + timeA + " com um total de " + golsTimeB + " gols!");
			} else {
				System.out.println("Empate!");
			}
			break;
		case 34:
			System.out.println("Ler dois valores e imprimir uma das três mensagens a seguir: \r\n"
					+ "‘Números iguais’, caso os números sejam iguais \r\n"
					+ "‘Primeiro é maior’, caso o primeiro seja maior que o segundo; \r\n"
					+ "‘Segundo maior’, caso o segundo seja maior que o primeiro.\n");

			double valor01, valor02;

			System.out.println("Insira o primeiro valor:");
			valor01 = sc.nextDouble();

			System.out.println("Insira o segundo valor:");
			valor02 = sc.nextDouble();

			if (valor01 == valor02) {
				System.out.println("Os valores são iguais!");
			} else if (valor01 > valor02) {
				System.out.println("O primeiro valor é maior!");
			} else if (valor02 > valor01) {
				System.out.println("O segundo valor é maior!");
			}
			break;
		case 35:
			System.out.println("Até 20 litros, desconto de 3% por litro Álcool \r\n"
					+ "acima de 20 litros, desconto de 5% por litro \r\n"
					+ "até 20 litros, desconto de 4% por litro Gasolina \r\n"
					+ "acima de 20 litros, desconto de 6% por litro\n"
					+ "Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da \r\n"
					+ "seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se \r\n"
					+ "que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.\n");

			double litrosVendidos, totalAPagar;
			String tipoCombustivel;

			System.out.println("Digite a quantidade de litros vendidos:");
			litrosVendidos = sc.nextDouble();

			System.out.println("Digite o tipo de combustível:");
			tipoCombustivel = sc.next();

			if (tipoCombustivel == "A") {
				if (litrosVendidos <= 20) {
					totalAPagar = (litrosVendidos * (3 / 100)) * 2.90;
					System.out.println("O total a pagar é de: R$" + totalAPagar);
				} else if (litrosVendidos > 20) {
					totalAPagar = (litrosVendidos * (5 / 100)) * 2.90;
					System.out.println("O total a pagar é de: R$" + totalAPagar);
				}
			} else if (tipoCombustivel == "G") {
				if (litrosVendidos <= 20) {
					totalAPagar = (litrosVendidos * (4 / 100)) * 3.30;
					System.out.println("O total a pagar é de: R$" + totalAPagar);
				} else if (litrosVendidos > 20) {
					totalAPagar = (litrosVendidos * (6 / 100)) * 3.30;
					System.out.println("O total a pagar é de? R$" + totalAPagar);
				}
			}
			break;
		case 36:
			System.out.println(
					"Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades \r\n"
							+ "dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma \r\n"
							+ "das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais \r\n"
							+ "novo com a mulher mais velha.\n");

			int idadeHomemVel, idadeHomemNov, idadeMulherVel, idadeMulherNov, auxiliar, homemVelMulherNov,
					homemNovMulherVel;

			System.out.println("Digite a idade do primeiro homem:");
			idadeHomemVel = sc.nextInt();

			System.out.println("Digite a idade do segundo homem:");
			idadeHomemNov = sc.nextInt();

			System.out.println("Digite a idade da primeira mulher:");
			idadeMulherVel = sc.nextInt();

			System.out.println("Digite a idade da segunda mulher:");
			idadeMulherNov = sc.nextInt();

			homemVelMulherNov = idadeHomemVel + idadeMulherNov;
			homemNovMulherVel = idadeHomemNov + idadeMulherVel;

			if (idadeHomemVel < idadeMulherNov) {
				auxiliar = idadeHomemVel;
				idadeMulherVel = idadeHomemNov;
				idadeHomemNov = auxiliar;
			}

			if (idadeMulherVel < idadeMulherNov) {
				auxiliar = idadeMulherVel;
				idadeMulherVel = idadeMulherNov;
				idadeMulherNov = auxiliar;
			}

			System.out.println("A soma das idades do homem mais velho com a mulher mais nova: " + homemVelMulherNov);
			System.out.println("A soma das idades do homem mais novo com a mulher mais velha: " + homemNovMulherVel);
			break;
		case 37:
			System.out.println("Uma fruteira está vendendo frutas com a seguinte tabela de preços: \r\n"
					+ "Até 5 Kg Acima de 5 Kg \r\n" + "Morango R$ 2,50 por Kg R$ 2,20 por Kg \r\n"
					+ "Maçã R$ 1,80 por Kg R$ 1,50 por Kg \r\n"
					+ "Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá \r\n"
					+ "ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de \r\n"
					+ "morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.\n");

			double precoMorango = 2.50;
			double precoMaca = 1.80;

			double kgMorango, kgMaca, kgFrutas, totalMorangos, totalMacas, valorPagar;

			System.out.println("Digite a quantidade em quilos de morangos:");
			kgMorango = sc.nextDouble();

			System.out.println("Digite a quantidade em quilos de maçãs:");
			kgMaca = sc.nextDouble();

			kgFrutas = kgMorango + kgMaca;

			if (kgMorango > 5) {
				totalMorangos = (precoMorango - 0.3) * kgMorango;
			} else {
				totalMorangos = precoMorango * kgMorango;
			}
			if (kgMaca > 5) {
				totalMacas = (precoMaca - 0.3) * kgMaca;
			} else {
				totalMacas = precoMaca * kgMaca;
			}

			if ((totalMorangos + totalMacas > 25) && (kgMorango + kgMaca > 8)) {
				valorPagar = (totalMorangos + totalMacas) * 0.1;
			} else {
				valorPagar = totalMorangos + totalMacas;
			}

			System.out.println("O total a pagar é de: R$" + valorPagar);
			break;
		case 38:
			System.out.println(
					"Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja \r\n"
							+ "diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a \r\n"
							+ "mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se \r\n"
							+ "esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a \r\n"
							+ "senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.\n");

			int idUser;

			System.out.println("Digite seu número de usuário:");
			idUser = sc.nextInt();

			if (idUser == 1234) {
				System.out.println("Usuário válido!");
				int senha;

				System.out.println("Digite sua senha:");
				senha = sc.nextInt();

				if (senha == 9999) {
					System.out.println("Acesso permitido!");
				} else {
					System.out.println("Senha incorreta!");
				}
			} else {
				System.out.println("Usuário inválido!");
			}
			break;
		case 39:
			System.out.println("Exercício Indisponivel.");
			break;
		case 40:
			System.out.println(
					"Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço \r\n"
							+ "unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total \r\n"
							+ "a pagar (total a pagar = total - desconto), sabendo-se que: \r\n"
							+ " - Se quantidade <= 5 o desconto será de 2% \r\n"
							+ " - Se quantidade > 5 e quantidade <=10 o desconto será de 3% \r\n"
							+ " - Se quantidade > 10 o desconto será de 5%");

			String nome;
			double quantidadeAdquirida, precoUnitario, total, desconto = 0, totalaPagar;

			System.out.println("Digite o nome do produto:");
			nome = sc.next();

			System.out.println("Digite a quantidade adquirida de produtos:");
			quantidadeAdquirida = sc.nextDouble();

			System.out.println("Digite o preço unitário:");
			precoUnitario = sc.nextDouble();

			total = quantidadeAdquirida * precoUnitario;

			if (quantidadeAdquirida <= 5) {
				desconto = 0.02;
			} else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
				desconto = 0.03;
			} else if (quantidadeAdquirida > 10) {
				desconto = 0.05;
			}

			totalaPagar = total - (total * (desconto / 100));
			System.out.println("O total a pagar pelo produto " + nome + " é de: R$" + totalaPagar);
			break;
		case 41:
			System.out.println(
					" Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos \r\n"
							+ "exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo \r\n"
							+ "e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo: \r\n"
							+ "                            N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios\r\n"
							+ "Média_de_Aproveitamento = ---------------------------------------------------------\r\n"
							+ "                                                   7 \r\n"
							+ "A atribuição de conceitos obedece a tabela abaixo: \r\n"
							+ "Média de Aproveitamento Conceito \r\n" + "> = 9,0 A \r\n" + "> = 7,5 e < 9,0 B \r\n"
							+ "> = 6,0 e < 7,5 C \r\n" + "< 6,0 D\n");

			double nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;

			System.out.println("Digite a primeira nota:");
			nota1 = sc.nextDouble();

			System.out.println("Digite a segunda nota:");
			nota2 = sc.nextDouble();

			System.out.println("Digite a terceira nota:");
			nota3 = sc.nextDouble();

			System.out.println("Digite a média dos exercícios:");
			mediaExercicios = sc.nextDouble();

			mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

			if (mediaAproveitamento >= 9) {
				System.out.println("O aluno está com a nota A!");
			} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
				System.out.println("O aluno está com a nota B!");
			} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
				System.out.println("O aluno está com a nota C!");
			} else if (mediaAproveitamento < 6) {
				System.out.println("O aluno está com  nota D!");
			}
			break;
		case 42:
			System.out.println(
					"Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para \r\n"
							+ "estar em condições, um dos seguintes requisitos deve ser satisfeito: \r\n"
							+ " - Ter no mínimo 65 anos de idade. \r\n" + " - Ter trabalhado no mínimo 30 anos. \r\n"
							+ " - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos. \r\n"
							+ "Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano \r\n"
							+ "de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo \r\n"
							+ "de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.\n");

			int idade, tempoTrab, codigoEmp;

			System.out.println("Digite sua idade:");
			idade = sc.nextInt();

			System.out.println("Digite o tempo trabalhado:");
			tempoTrab = sc.nextInt();

			System.out.println("Qual cod. empregado:");
			codigoEmp = sc.nextInt();

			if (idade >= 60 && tempoTrab >= 25) {
				System.out.println("O funcionário " + codigoEmp + " precisa se aposentar, pois tem " + idade
						+ " anos de idade e " + tempoTrab + " anos de trabalho.");
			} else if (idade >= 65) {
				System.out.println(
						"O funcionário " + codigoEmp + " precisa se aposentar, pois tem " + idade + " anos de idade.");
			} else if (tempoTrab >= 30) {
				System.out.println("O funcionário " + codigoEmp + " precisa se aposentar, pois tem " + tempoTrab
						+ " anos de trabalho.");
			} else {
				System.out.println("não requer aposentadoria");
			}
			break;
		case 43:
			System.out.println("Exercício Indisponivel.");
			break;
		default:
			System.out.println("\nNúmero inválido\n");
			break;
		}
	}
}
