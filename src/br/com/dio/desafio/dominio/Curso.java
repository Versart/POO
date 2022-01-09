package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String nome,String descricao,int cargaHoraria){
        super.setTitulo(nome);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }
    public Curso(){

    }

    @Override
    public double calcularXp() {
        return VALOR * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "Nome:" + this.getTitulo() + " Descrição:"
                + this.getDescricao() +
                " CargaHoraria=" + cargaHoraria +
                '}';
    }

}
