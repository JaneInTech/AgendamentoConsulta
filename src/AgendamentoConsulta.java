import java.util.Scanner;

public class AgendamentoConsulta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Caixa com nomes à cadastrar - |Felipe|Jane|Andre|Ana|Eduardo|
		String[] qtdeNomes;

		int[] qtdeIdade;

		// Quantidade de números cadastrados
		int numeroCadastro;

		System.out.println("====================================");
		System.out.println("       Cadastro de Cliente");
		System.out.println("====================================");

		System.out.print("Quantos usuários você deseja cadastrar: ");
		numeroCadastro = entrada.nextInt();

		qtdeNomes = new String[numeroCadastro];
		qtdeIdade = new int[numeroCadastro];

		entrada.nextLine();

		// ------------------------------------------------------------------------------

		for (int i = 0; i < numeroCadastro; i++) {

			System.out.print("Digite seu nome: ");
			qtdeNomes[i] = entrada.nextLine();

			System.out.print(qtdeNomes[i] + ", digite sua idade: ");
			qtdeIdade[i] = entrada.nextInt();

			entrada.nextLine();

		}

		// ------------------------------------------------------------------------------

		for (int i = 0; i < numeroCadastro; i++) {

			System.out.println("Seu nome é " + qtdeNomes[i] + " e sua idade é " + qtdeIdade[i] + " anos.");

		}

	}
}
