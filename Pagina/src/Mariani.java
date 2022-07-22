import java.util.Scanner;

public class Mariani{
	
	String senha = "string";
	int idade = 22;
	
	public void janela() {
		System.out.println("\nCONECTADO\n");
		System.out.println("Status: Aluna");
		System.out.println("Nome: Mariani M. Nesi");
		Scanner in = new Scanner(System.in);
		
		int resp = 2;
		
		while(resp != 0) {
			
			System.out.println("idade: "+idade);
			System.out.println("\nDigite 1 para ficar passar o ano e 0 para sair\n");
			resp = in.nextInt();
			if(resp == 1) {
				idade += 1;
			}
			else if(resp != 0) {
				System.out.println("Resposta invalida");
			}
		}		
	}
}
