//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;

class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos;

    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList();
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        this.listaProjetos.add(projeto);
    }

    public List<ProjetoSustentavel> listarProjetos() {
        return this.listaProjetos;
    }

    public String getNome() {
        return this.nome;
    }
}
