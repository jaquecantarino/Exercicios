package antecessor;

import java.util.Scanner;

public class antecessor {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o
		 * seu antecessor
		 */
		
		Scanner read = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println("Digite um número inteio: ");
		x = read.nextInt();
		
		System.out.println("Seu antecessor é: " + (x-1));

	}

}
