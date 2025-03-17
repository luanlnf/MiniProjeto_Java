import java.util.ArrayList;
import java.util.List;

public abstract class ProjetoSustentavel implements ImpactoAmbiental { // Agora é abstrata
    private String nome;
    private String descricao;
    private List<Voluntario> voluntarios;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    // Método abstrato que será implementado pelas subclasses
    @Override
    public abstract void calcularImpacto();
}
