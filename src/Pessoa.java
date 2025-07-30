public class Pessoa {
    private final String nome;
    private final int idade;
    private final String cpf;


    // Construtores da class
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //getters
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos - CPF: " + cpf;
    }
}
