import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//lista usando Map/HashMap
public class Dados implements Cadastro {
    private final Map<String, Pessoa> pessoas = new HashMap<>();

    //metodo put para adicionar na lista
    @Override
    public void adicionar(Pessoa pessoa) {
        pessoas.put(pessoa.getCpf(), pessoa);
    }

    // metodo values para percorrer a lista para ver as pessoas cadastradas
    @Override
    public List<Pessoa> listar() {
        return new ArrayList<>(pessoas.values());
    }

    // metodo get para fazer busca
    @Override
    public Pessoa buscarPorCpf(String cpf) {
        return pessoas.get(cpf);
    }

    // atualizando ....
    //public Pessoa RemoverCpf(String cpf) {
      //  return pessoas.remove(cpf);
}
