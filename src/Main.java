public class Main {
    public static void main(String[] args) {
        // Criando uma organização
        Organizacao ongVerde = new Organizacao("ONG Verde");

        // Criando projetos sustentáveis
        ProjetoSustentavel projetoReflorestamento = new ProjetoSustentavel("Reflorestamento", "Plantar árvores para restaurar áreas desmatadas");
        ProjetoSustentavel projetoReciclagem = new ProjetoSustentavel("Reciclagem Urbana", "Incentivar a coleta seletiva e reciclagem de resíduos");

        // Adicionando projetos à organização
        ongVerde.adicionarProjeto(projetoReflorestamento);
        ongVerde.adicionarProjeto(projetoReciclagem);

        // Criando voluntários
        Voluntario voluntario1 = new Voluntario("Ana Souza", "ana@email.com");
        Voluntario voluntario2 = new Voluntario("Carlos Lima", "carlos@email.com");

        // Associando voluntários aos projetos
        projetoReflorestamento.adicionarVoluntario(voluntario1);
        projetoReflorestamento.adicionarVoluntario(voluntario2);
        projetoReciclagem.adicionarVoluntario(voluntario1);

        // Criando relatório de impacto para um projeto
        projetoReflorestamento.gerarRelatorioImpacto(500, 120.5);

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

            // Exibir relatório de impacto (se existir)
            if (p.getRelatorioImpacto() != null) {
                p.getRelatorioImpacto().exibirRelatorio(); // Correção: removemos a linha extra
            }
        }

        System.out.println("\nCalculando impacto ambiental dos projetos:");
        for (ProjetoSustentavel p : ongVerde.listarProjetos()) {
            p.calcularImpacto();
        }
    }
}
