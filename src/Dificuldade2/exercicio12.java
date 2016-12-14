package Dificuldade2;

import java.util.Scanner;

public class exercicio12 {

	public exercicio12() {
		int []notas = new int [10];
		int nrposi=0;
			 		
		
		notas[0] =0;	//negativa
		notas[1] =1;	//negativa
		notas[2] =10;	//positiva
		notas[3] =13;	//positiva
		notas[4] =1;	//negativa
		notas[5] =18;	//positiva
		notas[6] =19;	//positiva
		notas[7] =8;	//negativa
		notas[8] =5;	//negativa
		notas[9] =3;	//negativa
		
		
		//4 positivas e 6 negativas
		for (int i =0;i<=9;i++)
		{
			if (notas[i]>=10)
			nrposi=nrposi+1;
		}
		System.out.println("Nr de positivas:  " + nrposi);
	}

}
