import java.util.Scanner;

public class Menu {
    private final Cadastro cadastro = new Dados();
    private final Scanner scanner = new Scanner(System.in);

    public void exibir(){
        int Opcao;

        do {
            System.out.println("\n************* Menu *************");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas cadastradas");
            System.out.println("0 - Sair");
            System.out.println("*********************************");
            System.out.print("Escolha sua Opção: ");
            Opcao = scanner.nextInt();
            scanner.nextLine();

            switch (Opcao){
                case 0 -> System.out.println("Encerrando....");
                case 1 -> adicionarPessoas();
                case 2 -> listarPessoas();
                default -> System.out.println("Opção Invalida !");
            }
        } while (Opcao != 0);
    }


    private void adicionarPessoas() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        cadastro.adicionar(new Pessoa(nome, idade));
    }

    private void listarPessoas(){
        System.out.println("**********************");
        System.out.println("\nPessoas Cadastradas:");
        for (Pessoa p : cadastro.listar()){
            System.out.println(p);
        }
    }
}
