package Estrutura_de_Repeticao;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);//criando objeto de leitura.

		int gene, idade, idadeEntre = 0, idadeGeral = 0, idadeMen = 0, other = 0, men = 0, wom = 0;  //Declaracao de variaveis do tipo inteira.
                                                                                                      
		double altura, alturaMedia = 0; //declaracao de variaveis do tipo double para utilizar numeros quebrados.

		for (int i = 0; i < 1000; i++) { //utilizacao da estrutura de repetica for e declarando condicao para inicio do "laco".

			System.out.print(
					"\nComo Gostaria de ser identificado: \n\n0- Mulher \n1- Homen \n2- Outros\n\nDigite o numero:");  //imprimir 1° orientacao ao usuario.
			gene = ler.nextInt(); //scaneando teclado do usuario e guardando dentro da variavel gene.

			System.out.print("\nDigite sua altura: "); //imprimir 2° orientacao ao usuario.
			altura = ler.nextDouble();//scaneando teclado do usuario e guardando dentro da variavel altura.


			System.out.print("\nDigite quantos anos possui: ");//imprimir 3° orientacao ao usuario.
			idade = ler.nextInt();//scaneando teclado do usuario e guardando dentro da variavel idade.


			switch (gene) { //utilizando e estrutura condicional "switch" para que acoes- 
                            //sejam executadas quando o usuario digitar o valor referente a cada "case".
			case 0:
				alturaMedia += altura; //somando os valores que foram scaneados pela variavel "altura" e guardando em "alturaMedia". 
				wom++;//somando +1 a variavel "wom"
				break;
			case 1:
				idadeMen += idade;//somando os valores que foram scaneados pela variavel "idade" e guardando em "idadeMen". 
				men++;//somando +1 a variavel "men"
				break;
			case 2:
				other++; //somando +1 a variavel "other"
				break;
                //utilizamos o "break" para que outras "cases" nao sejam ativadas sequencialmente. 
			}

			if (idade >= 18 && idade <= 35) { //estrutura condicional "if" onde se idade for maior que 18 e menor que 35 a chave sera executada. 
				idadeEntre++;//somando +1 a variavel "idadeEntre"
			}

			idadeGeral += idade; //aqui somamos todas as idades escaneadas e guardamos na variavel idadeGeral
		}

		System.out.print("\nIdade media do grupo: " + idadeGeral / 1000); //aqui dividimos a "idadeGeral" pela quantidade de vezes que o programa repetir e mostramos ao usuario o resultado. 
		
		System.out.print("\nAltura media das mulheres: " + alturaMedia / wom);//aqui dividimos "alturaMedia" por "Won" e mostramos ao usuario.
		
		System.out.print("\nQuantidade de outros:" + other);//aqui mostramos ao usuario a quantidade de pesoas que se identificaram como "outros".
		
		System.out.print("\nPorcentual de pessoas entre 18 e 35 e de:" + (idadeEntre * 100) / 1000);//aqui multiplicamos "idadeEntre" por 100 e dividimos pela quantidade de vezes- 
		                                                                                              //que o programa repetir para obtermos o valor em porcentagem e mostramos ao usuario.
		
		System.out.print("\nIdade media dos homens: " + idadeMen / men);//aqui dividimos "idadeMen" por "men" e mostramos ao usuario.
		
		ler.close();

	}

}
