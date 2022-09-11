import java.util.Scanner;

public class JDJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bom dia!");
		
		Scanner leitor = new Scanner(System.in);
		
		String variavel;
		
		System.out.println("Informe seu nome:");
		
		variavel=leitor.nextLine();
		
		int idade;
		
		System.out.println("Informe sua idade:");
		idade=leitor.nextInt();
		
		System.out.println("Olá "+variavel+", sua idade é: "+idade);
		
	}

}
