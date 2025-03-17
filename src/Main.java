import java.util.ArrayList;
import java.util.List;

// Classe Organização
class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos;

    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }

    public List<ProjetoSustentavel> listarProjetos() {
        return listaProjetos;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Projeto Sustentável
class ProjetoSustentavel {
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
        voluntarios.add(voluntario);
    }

    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
    }

    public RelatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;
    }
}

// Classe Voluntário
class Voluntario {
    private String nome;
    private String email;

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void participarProjeto(ProjetoSustentavel projeto) {
        projeto.adicionarVoluntario(this);
    }
}

// Classe Relatório de Impacto
class RelatorioImpacto {
    private int arvoresPlantadas;
    private double reducaoCO2;

    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Impacto:");
        System.out.println("Árvores plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCO2 + " toneladas");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste de execução do sistema!");
    }
}
