import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Eduardo a1 = new Eduardo();
		Mariani a2 = new Mariani();
		Manfred a3 = new Manfred();
		Edicarsia a4 = new Edicarsia();
		Camargo a5 = new Camargo();
		
		Scanner in = new Scanner(System.in);
		String user, senha;
		int resp = 1;

		while(resp != 0) {
			
			System.out.println("\nOla. Esse e o portal da CatolicaSC, digite o nome de usuario para continuar");
			user = new Scanner(System.in).nextLine();
			System.out.println("Digite a senha do usuario "+user);
			senha = new Scanner(System.in).nextLine();
			
			if(user.equals("manfred") || user.equals("Manfred") || user.equals("MANFRED")) {
				
				if(senha.equals("hackear")) {
					for(int b = 0; b <= 9999999; b++) {
						
						System.out.println(b);
						
						if(b == a3.senha) {
							a3.janela();
							break;
						}
					}
				}
				else {
					System.out.println("SENHA INCORRETA");
				}
			}
			
			else if(user.equals("mariani") || user.equals("Mariani") || user.equals("MARIANI")) {
				if(senha.equals(a2.senha)) {
					a2.janela();
				}
				else {
					System.out.println("SENHA INCORRETA");
				}
			}
			
			else if(user.equals("eduardo") || user.equals("Eduardo") || user.equals("EDUARDO")) {
				
				if(senha.equals(a1.senha)) {
					a1.janela();
				}
				
				else {					
					System.out.println("SENHA INCORRETA");
				}
			}
			
			else if(user.equals("edicarsia") || user.equals("Edicarsia") || user.equals("EDICARSIA")) {
				
				if(senha.equals("hackear")) {
					
					for(int b = 0; b <= 9999999; b++) {
						
						System.out.println(b);
						if(b == a4.senha) {
							a4.janela();
							break;
						}
					}
				}
				else {
					System.out.println("SENHA INCORRETA");
				}
			}
			
			else if(user.equals("camargo") || user.equals("Camargo") || user.equals("CAMARGO")) {
				if(senha.equals("hackear")) {
					for(int b = 0; b <= 9999999; b++) {
						System.out.println(b);
						if(b == a5.senha) {
							a5.janela();
							break;
						}
					}
				}
				else {
					System.out.println("SENHA INCORRETA");
				}
			}
			
			else {
				System.out.println("usuario invalido");
			}
			
			System.out.println("Digite 0 para sair do programa");
			resp = in.nextInt();		
		}
	}
}
