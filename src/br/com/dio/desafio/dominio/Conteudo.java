package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double VALOR = 10;

    private String titulo;

    private String descricao;

    public static double getVALOR() {
        return VALOR;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
