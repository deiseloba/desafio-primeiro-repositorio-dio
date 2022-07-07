package com.dio;

import java.util.Scanner;

public class Mediadenotas {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    double nota1, nota2, nota3,nota4,media;
    Scanner entrada = new Scanner(System.in);
     System.out.println("Digite a nota 1 : ");
     nota1= entrada.nextDouble();
     
     System.out.println("Digite a nota 2 : ");
     nota2= entrada.nextDouble();
     
     System.out.println("Digite a nota 3 : ");
     nota3= entrada.nextDouble();
     
     System.out.println("Digite a nota 4: ");
     nota4= entrada.nextDouble();
     
     media= (nota1+nota2+nota3+nota4)/4;
     System.out.println("A média do aluno é : "+media);
     
     if(media>70) {
    	 System.out.println("Aluno aprovado");}
     else if(media>50) {
    	 System.out.println("Aluno em recuperação");}
     else {System.out.println("Aluno reprovado");}
     
    	 
     
	}

}
