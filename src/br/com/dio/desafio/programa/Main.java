package br.com.dio.desafio.programa;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Java","Curso de Java",4);
        Curso curso2 = new Curso("C","Curso de C",4);
        Mentoria mentoria1 = new Mentoria("Como estudar Programação","Mentoria de Programação");
        Dev dev1 = new Dev("Wesley");
        Dev dev2 = new Dev("Maria");
        Bootcamp bootcamp1 = new Bootcamp("Empresa X","Bootcamp para a contratação na Empresa X");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println(dev1.calcularTotalXp());
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());

    }
}
