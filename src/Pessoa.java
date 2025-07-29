// classe que representa a pessoa
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Setters
    public void setNome(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString(){
        return nome + " " + idade + " Anos";
    }

}
