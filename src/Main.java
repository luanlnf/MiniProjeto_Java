public class Main {
    public static void main(String[] args) {
        // Criando uma organização
        Organizacao ongVerde = new Organizacao("ONG Verde");

        // Criando projetos sustentáveis das novas subclasses
        ProjetoReflorestamento projetoReflorestamento = new ProjetoReflorestamento("Reflorestamento", "Plantar árvores", 500);
        ProjetoReciclagem projetoReciclagem = new ProjetoReciclagem("Reciclagem Urbana", "Redução de resíduos", 2.5);
        ProjetoEnergiaRenovavel projetoEnergia = new ProjetoEnergiaRenovavel("Energia Solar", "Placas solares em comunidades", 120.0);

        // Adicionando projetos à organização
        ongVerde.adicionarProjeto(projetoReflorestamento);
        ongVerde.adicionarProjeto(projetoReciclagem);
        ongVerde.adicionarProjeto(projetoEnergia);

        // Criando voluntários
        Voluntario voluntario1 = new Voluntario("Ana Souza", "ana@email.com");
        Voluntario voluntario2 = new Voluntario("Carlos Lima", "carlos@email.com");

        // Associando voluntários aos projetos
        projetoReflorestamento.adicionarVoluntario(voluntario1);
        projetoReflorestamento.adicionarVoluntario(voluntario2);
        projetoReciclagem.adicionarVoluntario(voluntario1);
        projetoEnergia.adicionarVoluntario(voluntario2);

        // Exibindo dados cadastrados
        System.out.println("\nOrganização: " + ongVerde.getNome());
        System.out.println("Projetos cadastrados:");

        for (ProjetoSustentavel p : ongVerde.listarProjetos()) {
            System.out.println("  - " + p.getNome() + ": " + p.getDescricao());

            // Exibir voluntários do projeto
            System.out.println("    Voluntários:");
            for (Voluntario v : p.getVoluntarios()) {
                System.out.println("      - " + v.getNome() + " (" + v.getEmail() + ")");
            }
        }

        System.out.println("\nCalculando impacto ambiental dos projetos:");
        for (ProjetoSustentavel p : ongVerde.listarProjetos()) {
            p.calcularImpacto();
        }
    }
}
