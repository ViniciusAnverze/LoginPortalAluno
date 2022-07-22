import java.util.Scanner;

public class Camargo {
	
	int senha = 1136452;
	
	public void janela() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nCONECTADO\n");
		System.out.println("Status: Professor\n");
		System.out.println("Nome: Luiz Carlos Camargo\n");
		
		System.out.println("Digite as notas dos alunos abaixo\nnota1: ");
		float nota1 = in.nextFloat();
		System.out.println("nota 2: ");
		float nota2 = in.nextFloat();
		System.out.println("nota 3: ");
		float nota3 = in.nextFloat();
		System.out.println("media da turma: "+(nota1+nota2+nota3)/3);
	}

}
