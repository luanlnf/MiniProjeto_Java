public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + energiaGerada + " MW de energia renovável gerada.");
    }
}
