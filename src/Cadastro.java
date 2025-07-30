import java.util.List;

// metodos para adicionar, listar e buscar
public interface Cadastro {
    void adicionar(Pessoa pessoa);
    List<Pessoa> listar();
    Pessoa buscarPorCpf(String cpf);
    Pessoa removercpf(String cpf);
}