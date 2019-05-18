package com.br.media;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class AppMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float primeiraNota = 0;
		float segundaNota = 0;
		float terceiraNota = 0;
		float quartanota = 0;
		float mediaNota = 0;
		
		System.out.println("Vamos ver se você foi aprovado");
		System.out.println("");
		
		System.out.println("Digite a primeira nota:");
		primeiraNota = scan.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		segundaNota = scan.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		terceiraNota = scan.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		quartanota = scan.nextFloat();
		
		mediaNota = (primeiraNota + segundaNota + terceiraNota + quartanota)/4;
		
		if (mediaNota >= 7) {
			System.out.println("Parabéns você foi aprovado com a media: " + mediaNota);
			
		}else {
			
			System.out.println("Você foi reprovado, estude mais na proxima: " + mediaNota);
			
		}
		
		
		
		
		
		
	}

}
