import java.util.Scanner;

public class Eduardo{
	
	String senha = "duda";
	int numCargo = 0;
	String cargo[] = {"Professor", "Diretor da catolicaSC", "Dono da catolicaSC", "Professor de todas as PUCs do Brasil", 
			"Dono de todas as PUCs do Brasil", "Candidato a presidencia", "Presidente do Brasil", 
			"Presidente da Organizacao das Nacoes Unidas", "Lider supremo da humanidade"};
	
	public void janela() {
		
		Scanner in = new Scanner(System.in);
		
		int resp = 2;
		
		System.out.println("\nCONECTADO\n");
		
		while(resp != 0) {
			
			try {
				System.out.println("\nStatus: "+cargo[numCargo]);
				System.out.println("Nome: Eduardo Paterno\n");
			}
			catch(ArrayIndexOutOfBoundsException  e) {
				numCargo -= 1;
				System.out.println("Cargo maximo");
			}
			finally {
				
				System.out.println("Digite 0 para sair ou digite 1 para aumentar de cargo");
				resp = in.nextInt();
				
				if(resp == 1) {

					numCargo += 1;
				}
				else if(resp != 0) {
					
					System.out.println("Resposta invalida");
				}		
			}							
		}	
	}
}


