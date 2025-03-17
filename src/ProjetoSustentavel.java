import java.util.ArrayList;
import java.util.List;

public class ProjetoSustentavel implements ImpactoAmbiental { // Implementa a interface
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

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    // **Implementação do método da interface**
    @Override
    public void calcularImpacto() {
        if (relatorioImpacto != null) {
            System.out.println("Impacto ambiental do projeto " + nome + ":");
            relatorioImpacto.exibirRelatorio();
        } else {
            System.out.println("Nenhum relatório de impacto gerado para o projeto " + nome);
        }
    }
}
