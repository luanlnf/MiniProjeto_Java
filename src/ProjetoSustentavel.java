import java.util.ArrayList;
import java.util.List;

public class ProjetoSustentavel {
    private String nome;
    private String descricao;
    private List<Voluntario> voluntarios;
    private RelatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
    }

    public RelatorioImpacto getRelatorioImpacto() {
        return this.relatorioImpacto;
    }

    // **Adicionando os métodos que faltavam**
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }
}
