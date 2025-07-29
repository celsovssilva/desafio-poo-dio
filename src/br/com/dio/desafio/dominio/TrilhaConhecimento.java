package br.com.dio.desafio.dominio;

public class TrilhaConhecimento extends Conteudo {
    private String nomeTrilha;

    public TrilhaConhecimento() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 3;
    }

    public String getNomeTrilha() {
        return nomeTrilha;
    }

    public void setNomeTrilha(String nomeTrilha) {
        this.nomeTrilha = nomeTrilha;
    }

    @Override
    public String toString() {
        return "TrilhaDeConhecimento{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nomeTrilha='" + nomeTrilha + '\'' +
                '}';
    }
}