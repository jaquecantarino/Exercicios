package reverse;

public class inverteValores {

	public static void main(String[] args) {

		/* EXERCICIO PROPOSTO:
		 * Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20
		 * em uma vari�vel B. A seguir (utilizando apenas atribui��es entre vari�veis)
		 * troque os seus conte�dos fazendo com que o valor que est� em A passe para B e
		 * vice-versa. Ao final, escrever os valores que ficaram armazenados nas
		 * vari�veis.
		 */

		int A = 10;
		int B = 20;
		int x = 0; //usando uma terceira variavel para armazenar um dos valores antes de substituir.
		
		System.out.println("Valores primarios:");
		System.out.println(A);
		System.out.println(B);
		
		x = A;
		A = B;
		B = x;
		
		
		System.out.println("P�s Inverter:");
		System.out.println(A);
		System.out.println(B);

	}

}
