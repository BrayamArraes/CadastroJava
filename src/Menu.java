import java.util.Scanner;

public class Menu {
    private final Cadastro cadastro = new Dados();
    private final Scanner scanner = new Scanner(System.in);


    // Menu feito com do/while e switch
    public void exibir() {
        int opcao;

        do {
            System.out.println("\n************* Menu *************");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas cadastradas");
            System.out.println("3 - Localizar pessoa pelo CPF");
            System.out.println("0 - Sair");
            System.out.println("*********************************");
            System.out.print("Escolha sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 0 -> System.out.println("Encerrando....");
                case 1 -> adicionarPessoa();
                case 2 -> listarPessoas();
                case 3 -> buscarPessoaPorCpf();
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Metodo para adicionar pessoas no cadastro
    private void adicionarPessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        cadastro.adicionar(new Pessoa(nome, idade, cpf));
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    //Listando pessoas cadastradas
    private void listarPessoas() {
        System.out.println("\n--- Pessoas Cadastradas ---");
        for (Pessoa p : cadastro.listar()) {
            System.out.println(p);
        }
    }

    // Metodo para bucar por cpf
    private void buscarPessoaPorCpf() {
        System.out.print("Digite o CPF para buscar: ");
        String cpf = scanner.nextLine();
        Pessoa encontrada = cadastro.buscarPorCpf(cpf);

        if (encontrada != null) {
            System.out.println("Pessoa encontrada: " + encontrada);
        } else {
            System.out.println("Pessoa com CPF " + cpf + " não encontrada.");
        }
    }
}
