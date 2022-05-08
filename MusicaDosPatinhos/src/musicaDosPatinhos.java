import java.util.Scanner;

public class musicaDosPatinhos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int patinhos=0;
		
		System.out.println("Quantos patinhos vão ter na musica?");
		patinhos=leia.nextInt();
		
		for(int n=0; n<=patinhos; n++) {
			
			int x = patinhos;
			
			do {
				
				n++;
				n++;
				//pontos para aprimorar: Por que eu preciso somar 2 no N para não duplicar
				//
				
				System.out.printf("\n🦆 " + x + " patinhos foram passear\r\n"
						+ "Além das montanhas\r\n"
						+ "Para brincar\r\n"
						+ "A mamãe gritou: Quá, quá, quá, quá\r\n"
						+ "Mas só " + (x-1) +" patinhos voltaram de lá.\n");
				
				x=x-1; //x--;
				
			}while(x!=1);
			
			System.out.printf("\n\n🦆 1 patinho foi passear\r\n"
					+ "Além das montanhas\r\n"
					+ "Para brincar\r\n"
					+ "A mamãe gritou: Quá, quá, quá, quá\r\n"
					+ "Mas nenhum patinho voltou de lá.\n");
				
		}
		
		System.out.printf("\nA mamãe ficou tão triste! \nA mamãe patinha foi procurar\r\n"
				+ "Além das montanhas\r\n"
				+ "Na beira do mar\r\n"
				+ "A mamãe gritou: Quá, quá, quá, quá\r\n"
				+ "E os %d patinhos voltaram de lá. 🦆🦆🦆🦆🦆", + patinhos);

	}

}
