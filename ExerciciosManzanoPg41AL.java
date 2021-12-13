package exercicios;

import java.util.Scanner;

public class ExerciciosManzanoPg41AL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exerc�cios Manzano 1 ao 12");
		System.out.println("Digite o n�mero do exerc�cio:");
		byte exercicio = sc.nextByte();

		switch (exercicio) {

		case 1:
			System.out.println(
					"Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do maior pelo menor valor.\n");

			int valor1, valor2, diferenca;

			System.out.println("Digite o primeiro valor:");
			valor1 = sc.nextInt();

			System.out.println("Digite o segundo valor:");
			valor2 = sc.nextInt();

			if (valor1 > valor2) {
				diferenca = valor1 - valor2;
				System.out.println("A difren�a � de: " + diferenca);
			} else if (valor2 > valor1) {
				diferenca = valor2 - valor1;
				System.out.println("A diferen�a � de: " + diferenca);
			}
			break;
		case 2:
			System.out.println(
					"Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o n�mero lido como sendo um \r\n"
							+ "valor positivo, ou seja, o programa dever� apresentar o m�dulo de um n�mero fornecido. Lembre-se \r\n"
							+ "de verificar se o n�mero fornecido � menor que zero; sendo, multiplique-o por -1.\n");

			int valor, auxiliar = 0;

			System.out.println("Digite um valor inteiro:");
			valor = sc.nextInt();

			if (valor < 0) {
				auxiliar = valor * (-1);
			}
			System.out.println("O valor �: " + auxiliar);
			break;
		case 3:
			System.out.println(
					"Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
							+ "dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 5. Se o aluno n�o \r\n"
							+ "foi aprovado, indicar uma mensagem informando esta condi��o. Apresentar junto das mensagens o \r\n"
							+ "valor da m�dia do aluno para qualquer condi��o.\n");

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
				System.out.println("O aluno foi aprovado! Com uma m�dia de: " + mediaNota);
			} else if (mediaNota < 5) {
				System.out.println("O aluno foi reprovado! Com uma m�dia de: " + mediaNota);
			}
			break;
		case 4:
			System.out.println(
					"Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem \r\n"
							+ "dizendo que o aluno foi aprovado, se o valor da m�dia escolar for maior ou igual a 7. Se o valor da \r\n"
							+ "m�dia for menor que 7, solicitar a nota de exame, somar com o valor da m�dia e obter nova m�dia. \r\n"
							+ "Se a nova m�dia for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi \r\n"
							+ "aprovado em exame. Se o aluno n�o foi aprovado, indicar uma mensagem informando esta \r\n"
							+ "condi��o. Apresentar com as mensagens o valor da m�dia do aluno, para qualquer condi��o.\n");

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
				System.out.println("O aluno foi aprovado! Com uma m�dia de: " + mediaNota1);
			} else if (mediaNota1 < 7) {
				System.out.println("A nota est� abaixo de 7.");

				System.out.println("Digite a nota do exame:");
				notaExame = sc.nextDouble();

				novaMedia = (mediaNota1 + notaExame) / 2;
				if (novaMedia >= 5) {
					System.out.println("O aluno foi aprovado no examo! Com uma m�dia de: " + novaMedia);
				} else if (novaMedia < 5) {
					System.out.println("O aluno foi reprovado no exame com uma m�dia de: " + novaMedia);
				}
			}
			break;
		case 5:
			System.out.println(
					"Efetuar a leitura de tr�s valores (vari�veis A, B e C) e efetuar o c�lculo da equa��o completa de \r\n"
							+ "segundo grau, apresentando as duas ra�zes, se para os valores informados for poss�vel efetuar o \r\n"
							+ "referido c�lculo. Lembre-se de que a vari�vel A deve ser diferente de zero.\n");

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
	            System.out.println("As ra�zes s�o: "+x1+ " e "+x2);
	        } else {
	            System.out.println("N�o pode ser calculado!");
	        }

			break;
		case 6:
			System.out.println(
					"Efetuar a leitura de tr�s valores (vari�veis A, B e C) e apresent�-los dispostos em ordem crescente.\n");
			
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
					"Efetuar a leitura de quatro n�meros inteiros e apresentar os n�meros que s�o divis�veis por 2 e 3.\n");
			
			 double n001, n002, n003, n004;

		        System.out.println("Digite o primeiro n�mero");
		        n001 = sc.nextDouble();

		        System.out.println("Digite o segundo n�mero");
		        n002 = sc.nextDouble();

		        System.out.println("Digite o terceiro n�mero");
		        n003 = sc.nextDouble();

		        System.out.println("Digite o quarto n�mero:");
		        n004 = sc.nextDouble();

		        if(n001 % 2 == 0) {
		            System.out.println(n001+" � divis�vel por 2!");
		        } else if(n001 % 3 == 0) {
		            System.out.println(n001+" � divis�vel por 3!");
		        }
		        if(n002 % 2 == 0) {
		            System.out.println(n002+" � divis�vel por 2!");
		        } else if(n002 % 3 == 0) {
		            System.out.println(n002+" � divis�vel por 3!");
		        }
		        if(n003 % 2 == 0) {
		            System.out.println(n003+" � divis�vel por 2!");
		        } else if(n003 % 3 == 0) {
		            System.out.println(n003+" � divis�vel por 3!");
		        }
		        if(n004 % 2 == 0) {
		            System.out.println(n004+" � divis�vel por 2!");
		        } else if(n004 % 3 == 0) {
		            System.out.println(n004+" � divis�vel por 3!");
		        }
			break;
		case 8:
			System.out
					.println("Efetuar a leitura de cinco n�meros inteiros e identificar o maior e o menor valores.\n");
			
			 double nu1, nu2, nu3, nu4, nu5, maior = 0, menor = 0;

		        System.out.println("Digite o primero n�mero:");
		        nu1 = sc.nextDouble();

		        System.out.println("Digite o segundo n�mero:");
		        nu2 = sc.nextDouble();

		        System.out.println("Digite o terceiro n�mero:");
		        nu3 = sc.nextDouble();

		        System.out.println("Digite o quarto n�mero:");
		        nu4 = sc.nextDouble();

		        System.out.println("Digite o quinto n�mero:");
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

		        System.out.println("O maior valor � "+maior+" e o menor � "+menor);
		    
			break;
		case 9:
			System.out.println("Elaborar um programa que efetue a leitura de um n�mero inteiro e apresentar uma mensagem \r\n"
							+ "informando se o n�mero � par ou �mpar.\n");
			
			   double numero;

		        System.out.println("Digite um n�mero:");
		        numero = sc.nextDouble();

		        if(numero % 2 == 0) {
		            System.out.println("O n�mero � par!");
		        } else {
		            System.out.println("O n�mero � �mpar!");
		        }
		        
			break;
		case 10:
			System.out.println(
					"Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Ap�s a \n"
							+ "leitura do valor fornecido pelo usu�rio, o programa dever� indicar uma de duas mensagens: \"O \r\n"
							+ "valor est� na faixa permitida\", caso o usu�rio forne�a o valor nesta faixa, ou a mensagem \"O valor \r\n"
							+ "est� fora da faixa permitida\", caso o usu�rio forne�a valores menores que 1 ou maiores que 9.\n");
			 double numero1;

		        System.out.println("Digite um n�mero na faixa de 1 a 9:");
		        numero1 = sc.nextDouble();

		        if(numero1 > 9 || numero1 < 0){
		            System.out.println("O valor est� fora da faixa permitida!");
		        } else {
		            System.out.println("O valor est� na faixat permitida!");
		        }

			break;
		case 11:
			System.out.println(
					"Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua \r\n"
							+ "apresenta��o, caso o valor n�o seja maior que tr�s.\n");
			 double valor01;

		        System.out.println("Insira um valor:");
		        valor01 = sc.nextDouble();

		        if(valor01 <= 3) {
		            System.out.println("A apresenta��o do valor �: "+valor01);
		        } else {
		            System.out.println("Valor ultrapassa 3!");
		        }
		        
			break;
		case 12:
			System.out.println(
					"Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com \r\n"
							+ "sa�da uma das seguintes mensagens: \"Ilmo Sr.\", se o sexo informado como masculino, ou a \r\n"
							+ "mensagem \"Ilma Sra.\", para o sexo informado como feminino. Apresente tamb�m junto da \r\n"
							+ "mensagem de sauda��o o nome previamente informado. ");
			
			   String nome, sexo;

		        System.out.println("Digite seu nome:");
		        nome = sc.nextLine();

		        System.out.println("Digite seu sexo:");
		        sexo = sc.nextLine();

		        if(sexo == "masculino") {
		            System.out.println("Ol� senhor "+nome+", tubo bem?");
		        } else if(sexo == "feminino") {
		            System.out.println("Ol� senhora "+nome+", tubo bem?");
		        }
			break;
		default:

			System.out.println("\nN�mero inv�lido\n");
			
			break;
		}
	}
}
