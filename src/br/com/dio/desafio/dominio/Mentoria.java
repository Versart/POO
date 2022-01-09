package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data;

    public Mentoria(){

    }
    public Mentoria(String nome, String descricao){
        super.setTitulo(nome);
        super.setDescricao(descricao);
        this.data = LocalDate.now();
    }

    @Override
    public double calcularXp() {
        return VALOR + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
