public class Voluntario {
    private String nome;
    private String email;

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void participarProjeto(ProjetoSustentavel projeto) {
        projeto.adicionarVoluntario(this);
    }

    // Métodos corretos (removendo duplicação)
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
