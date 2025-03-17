import java.util.ArrayList;
import java.util.List;

public class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos;

    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        this.listaProjetos.add(projeto);
    }

    public List<ProjetoSustentavel> listarProjetos() {
        return listaProjetos;
    }

    public String getNome() {
        return nome;
    }
}
