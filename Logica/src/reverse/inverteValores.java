package reverse;

public class inverteValores {

	public static void main(String[] args) {

		/* EXERCICIO PROPOSTO:
		 * Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20
		 * em uma variável B. A seguir (utilizando apenas atribuições entre variáveis)
		 * troque os seus conteúdos fazendo com que o valor que está em A passe para B e
		 * vice-versa. Ao final, escrever os valores que ficaram armazenados nas
		 * variáveis.
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
		
		
		System.out.println("Pós Inverter:");
		System.out.println(A);
		System.out.println(B);

	}

}
