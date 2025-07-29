import java.util.ArrayList;
import java.util.List;

// classe que armazena os dados
public class Dados implements Cadastro {
    private List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionar(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> listar(){
        return pessoas;
    }
}
