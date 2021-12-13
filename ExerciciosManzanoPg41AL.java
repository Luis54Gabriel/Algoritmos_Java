package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg41AL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exercícios Manzano 1 ao 12");
		System.out.println("Digite o número do exercício:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println(
					"Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.\n");

			int valor1, valor2, diferenca;

			System.out.println("Digite o primeiro valor:");
			valor1 = sc.nextInt();

			System.out.println("Digite o segundo valor:");
			valor2 = sc.nextInt();

			if (valor1 > valor2) {
				diferenca = valor1 - valor2;
				System.out.println("A difrença é de: " + diferenca);
			} else if (valor2 > valor1) {
				diferenca = valor2 - valor1;
				System.out.println("A diferença é de: " + diferenca);
			}
			break;
		case 2:
			System.out.println(
					"Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um \r\n"
							+ "valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se \r\n"
							+ "de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.\n");

			int valor, auxiliar = 0;

			System.out.println("Digite um valor inteiro:");
			valor = sc.nextInt();

			if (valor < 0) {
				auxiliar = valor * (-1);
			}
			System.out.println("O valor é: " + auxiliar);
			break;
		case 3:
			System.out.println(
					"Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
							+ "dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não \r\n"
							+ "foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o \r\n"
							+ "valor da média do aluno para qualquer condição.\n");

			double n1, n2, n3, n4, mediaNota;

			System.out.println("Digite a primeira nota:");
			n1 = sc.nextDouble();

			System.out.println("Digite a segunda nota:");
			n2 = sc.nextDouble();

			System.out.println("Digite a terceira nota:");
			n3 = sc.nextDouble();

			System.out.println("Digite a quarta nota:");
			n4 = sc.nextDouble();

			mediaNota = (n1 + n2 + n3 + n4) / 4;

			if (mediaNota >= 5) {
				System.out.println("O aluno foi aprovado! Com uma média de: " + mediaNota);
			} else if (mediaNota < 5) {
				System.out.println("O aluno foi reprovado! Com uma média de: " + mediaNota);
			}
			break;
		case 4:
			System.out.println(
					"Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
							+ "dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da \r\n"
							+ "média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média. \r\n"
							+ "Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi \r\n"
							+ "aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta \r\n"
							+ "condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.\n");

			double n01, n02, n03, n04, mediaNota1, notaExame, novaMedia;

			System.out.println("Digite a primeira nota:");
			n01 = sc.nextDouble();

			System.out.println("Digite a segunda nota:");
			n02 = sc.nextDouble();

			System.out.println("Digite a terceira nota:");
			n03 = sc.nextDouble();

			System.out.println("Digite a quarta nota:");
			n04 = sc.nextDouble();

			mediaNota1 = (n01 + n02 + n03 + n04) / 4;

			if (mediaNota1 >= 7) {
				System.out.println("O aluno foi aprovado! Com uma média de: " + mediaNota1);
			} else if (mediaNota1 < 7) {
				System.out.println("A nota está abaixo de 7.");

				System.out.println("Digite a nota do exame:");
				notaExame = sc.nextDouble();

				novaMedia = (mediaNota1 + notaExame) / 2;
				if (novaMedia >= 5) {
					System.out.println("O aluno foi aprovado no examo! Com uma média de: " + novaMedia);
				} else if (novaMedia < 5) {
					System.out.println("O aluno foi reprovado no exame com uma média de: " + novaMedia);
				}
			}
			break;
		case 5:
			System.out.println(
					"Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de \r\n"
							+ "segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o \r\n"
							+ "referido cálculo. Lembre-se de que a variável A deve ser diferente de zero.\n");

	        double a, b, c, delta, x1, x2;
	        System.out.println("Digite um valor para A:");
	        a = sc.nextDouble();
	        System.out.println("Digite um valor para B:");
	        b = sc.nextDouble();
	        System.out.println("Digite um valor para C:");
	        c = sc.nextDouble();
	        delta = Math.pow(b, 2)-4*a*c; 
	        if(a == 0) {
	            System.out.println("A tem que ser diferente de 0!");
	        }
	        if(delta > 0) {
	            x1 = (-b + Math.pow(delta, 0.5)) / 2.0 * a;
	            x2 = (-b - Math.pow(delta, 0.5)) / 2.0 * a;
	            System.out.println("As raízes são: "+x1+ " e "+x2);
	        } else {
	            System.out.println("Não pode ser calculado!");
	        }

			break;
		case 6:
			System.out.println(
					"Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.\n");
			
		    double a1, b1, c1;

	        System.out.println("Digite um valor para A:");
	        a1 = sc.nextDouble();

	        System.out.println("Digite um valor para B:");
	        b1 = sc.nextDouble();

	        System.out.println("Digite um valor para C:");
	        c1 = sc.nextDouble();

	        if(a1 > b1 && a1 > c1) {
	            if(b1>c1) {
	                System.out.println(+c1+" "+b1+" "+a1);
	            } else if(c1>b1) {
	                System.out.println(+b1+" "+c1+" "+a1);
	            }
	        } else if(b1>a1 && b1>c1) {
	            if(a1>c1){
	                System.out.println(+c1+" "+a1+" "+b1);
	            } else if(c1>a1) {
	                System.out.println(+a1+" "+c1+" "+b1);
	            }
	        } else if(c1>a1 && c1>b1) {
	            if(a1>b1) {
	                System.out.println(+b1+" "+a1+" "+c1);
	            } else if(b1>a1) {
	                System.out.println(+a1+" "+b1+" "+c1);
	            }
	        }
			break;
		case 7:
			System.out.println(
					"Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.\n");
			
			 double n001, n002, n003, n004;

		        System.out.println("Digite o primeiro número");
		        n001 = sc.nextDouble();

		        System.out.println("Digite o segundo número");
		        n002 = sc.nextDouble();

		        System.out.println("Digite o terceiro número");
		        n003 = sc.nextDouble();

		        System.out.println("Digite o quarto número:");
		        n004 = sc.nextDouble();

		        if(n001 % 2 == 0) {
		            System.out.println(n001+" É divisível por 2!");
		        } else if(n001 % 3 == 0) {
		            System.out.println(n001+" É divisível por 3!");
		        }
		        if(n002 % 2 == 0) {
		            System.out.println(n002+" É divisível por 2!");
		        } else if(n002 % 3 == 0) {
		            System.out.println(n002+" É divisível por 3!");
		        }
		        if(n003 % 2 == 0) {
		            System.out.println(n003+" É divisível por 2!");
		        } else if(n003 % 3 == 0) {
		            System.out.println(n003+" É divisível por 3!");
		        }
		        if(n004 % 2 == 0) {
		            System.out.println(n004+" É divisível por 2!");
		        } else if(n004 % 3 == 0) {
		            System.out.println(n004+" É divisível por 3!");
		        }
			break;
		case 8:
			System.out
					.println("Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.\n");
			
			 double nu1, nu2, nu3, nu4, nu5, maior = 0, menor = 0;

		        System.out.println("Digite o primero número:");
		        nu1 = sc.nextDouble();

		        System.out.println("Digite o segundo número:");
		        nu2 = sc.nextDouble();

		        System.out.println("Digite o terceiro número:");
		        nu3 = sc.nextDouble();

		        System.out.println("Digite o quarto número:");
		        nu4 = sc.nextDouble();

		        System.out.println("Digite o quinto número:");
		        nu5 = sc.nextDouble();

		        if(nu1<nu2 && nu1<nu3 && nu1<nu4 && nu1<nu5) {
		            menor = nu1;
		        } else if(nu2<nu1 && nu2<nu3 && nu2<nu4 && nu2<nu5) {
		            menor = nu2;
		        } else if(nu3<nu1 && nu3<nu2 && nu3<nu4 && nu3<nu5) {
		            menor = nu3;
		        } else if(nu4<nu1 && nu4<nu2 && nu4<nu3 && nu4<nu5) {
		            menor = nu4;
		        } else if(nu5<nu1 && nu5<nu2 && nu5<nu3 && nu5<nu4) {
		            menor = nu5;
		        }

		        if(nu1>nu2 && nu1>nu3 && nu1>nu4 && nu1>nu5) {
		            maior = nu1;
		        } else if(nu2>nu1 && nu2>nu3 && nu2>nu4 && nu2>nu5) {
		            maior = nu2;
		        } else if(nu3>nu1 && nu3>nu2 && nu3>nu4 && nu3>nu5) {
		            maior = nu3;
		        } else if(nu4>nu1 && nu4>nu2 && nu4>nu3 && nu4>nu5) {
		            maior = nu4;
		        } else if(nu5>nu1 && nu5>nu2 && nu5>nu3 && nu5>nu4) {
		            maior = nu5;
		        }

		        System.out.println("O maior valor é "+maior+" e o menor é "+menor);
		    
			break;
		case 9:
			System.out.println("Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem \r\n"
							+ "informando se o número é par ou ímpar.\n");
			
			   double numero;

		        System.out.println("Digite um número:");
		        numero = sc.nextDouble();

		        if(numero % 2 == 0) {
		            System.out.println("O número é par!");
		        } else {
		            System.out.println("O número é ímpar!");
		        }
		        
			break;
		case 10:
			System.out.println(
					"Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a \n"
							+ "leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens: \"O \r\n"
							+ "valor está na faixa permitida\", caso o usuário forneça o valor nesta faixa, ou a mensagem \"O valor \r\n"
							+ "está fora da faixa permitida\", caso o usuário forneça valores menores que 1 ou maiores que 9.\n");
			 double numero1;

		        System.out.println("Digite um número na faixa de 1 a 9:");
		        numero1 = sc.nextDouble();

		        if(numero1 > 9 || numero1 < 0){
		            System.out.println("O valor está fora da faixa permitida!");
		        } else {
		            System.out.println("O valor está na faixat permitida!");
		        }

			break;
		case 11:
			System.out.println(
					"Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua \r\n"
							+ "apresentação, caso o valor não seja maior que três.\n");
			 double valor01;

		        System.out.println("Insira um valor:");
		        valor01 = sc.nextDouble();

		        if(valor01 <= 3) {
		            System.out.println("A apresentação do valor é: "+valor01);
		        } else {
		            System.out.println("Valor ultrapassa 3!");
		        }
		        
			break;
		case 12:
			System.out.println(
					"Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com \r\n"
							+ "saída uma das seguintes mensagens: \"Ilmo Sr.\", se o sexo informado como masculino, ou a \r\n"
							+ "mensagem \"Ilma Sra.\", para o sexo informado como feminino. Apresente também junto da \r\n"
							+ "mensagem de saudação o nome previamente informado. ");
			
			   String nome, sexo;

		        System.out.println("Digite seu nome:");
		        nome = sc.nextLine();

		        System.out.println("Digite seu sexo:");
		        sexo = sc.nextLine();

		        if(sexo == "masculino") {
		            System.out.println("Olá senhor "+nome+", tubo bem?");
		        } else if(sexo == "feminino") {
		            System.out.println("Olá senhora "+nome+", tubo bem?");
		        }
			break;
		default:

			System.out.println("\nNúmero inválido\n");
			
			break;
		}
	}
}
