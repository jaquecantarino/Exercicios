import java.util.Scanner;

public class musicaDosPatinhos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int patinhos=0;
		
		System.out.println("Quantos patinhos v�o ter na musica?");
		patinhos=leia.nextInt();
		
		for(int n=0; n<=patinhos; n++) {
			
			int x = patinhos;
			
			do {
				
				n++;
				n++;
				//pontos para aprimorar: Por que eu preciso somar 2 no N para n�o duplicar
				//
				
				System.out.printf("\n" + x + " patinhos foram passear\r\n"
						+ "Al�m das montanhas\r\n"
						+ "Para brincar\r\n"
						+ "A mam�e gritou: Qu�, qu�, qu�, qu�\r\n"
						+ "Mas s� " + (x-1) +" patinhos voltaram de l�.\n");
				
				x=x-1; //x--;
				
			}while(x!=1);
			
			System.out.printf("\n1 patinhos foram passear\r\n"
					+ "Al�m das montanhas\r\n"
					+ "Para brincar\r\n"
					+ "A mam�e gritou: Qu�, qu�, qu�, qu�\r\n"
					+ "Mas nenhum patinho voltou de l�.\n");
				
		}
		
		System.out.printf("\nA mam�e ficou t�o triste! \nA mam�e patinha foi procurar\r\n"
				+ "Al�m das montanhas\r\n"
				+ "Na beira do mar\r\n"
				+ "A mam�e gritou: Qu�, qu�, qu�, qu�\r\n"
				+ "E os %d patinhos voltaram de l�.", + patinhos);

	}

}
