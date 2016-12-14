package Dificuldade3;

import java.util.Scanner;

public class exercicio10 {

	public exercicio10() {
		double num1=0,
				  num2 = 0,
				  result=0;
		 int op=0 ;
			
			do{
			System.out.println("Insira um numero:");
			num1 = (new Scanner(System.in)).nextInt();

			//Escolha do operador pelo utilizador
			System.out.println("Insira operador:  \n "
					+ "1. +\n"
					+ "2. - \n"
					+ "3. / \n"
					+ "4. * \n"
					+ "0. Sair \n");
			op = (new Scanner(System.in)).nextInt();
			
			
			
		// Ver qual é o  operador
		switch (op)
		{
			case 1:
			{

			System.out.println("Insira o segundo numero:");
			num2 = (new Scanner(System.in)).nextInt();	
			result =num1+num2;
			System.out.println("Conta: "+ num1 + " +" +num2 +" = " + result);continue;
			}
			case 2:
			{

			System.out.println("Insira o segundo numero:");
			num2 = (new Scanner(System.in)).nextInt();	
					if (num1>num2 && num1==num2)
					{
						result =num1-num2;
						System.out.println("Conta: "+ num1 + " - " +num2 +" = " + result);continue;
					}
					else 
					{
						result = num2-num1;
						System.out.println("Conta: "+ num2 + " - " +num1 +" = " + result);continue;
					}
				
			}
			case 3:
			{

			System.out.println("Insira o segundo numero:");
			num2 = (new Scanner(System.in)).nextInt();	
			result =num1/num2;
			System.out.println("Conta: "+ num1 + " / " +num2 +" = " + result);continue;
			}
			case 4:
			{

			System.out.println("Insira o segundo numero:");
			num2 = (new Scanner(System.in)).nextInt();	
			result =num1*num2;
			System.out.println("Conta: "+ num1 + " * " +num2 +" = " + result);	continue;
			}
			
		
			
			
			}while(op=='0');break;
			
			
			}			
	}
	}

