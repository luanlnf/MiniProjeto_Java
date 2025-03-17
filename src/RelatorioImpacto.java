//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class RelatorioImpacto {
    private int arvoresPlantadas;
    private double reducaoCO2;

    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Impacto:");
        System.out.println("Árvores plantadas: " + this.arvoresPlantadas);
        System.out.println("Redução de CO2: " + this.reducaoCO2 + " toneladas");
    }
}
