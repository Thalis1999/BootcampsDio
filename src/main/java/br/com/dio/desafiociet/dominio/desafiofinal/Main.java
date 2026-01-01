package br.com.dio.desafiociet.dominio.desafiofinal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.getData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThalis = new Dev();
        devThalis.setNome("Thalis");
        devThalis.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Thalis " + devThalis.getConteudosInscritos());
        devThalis.progredir();
        devThalis.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Thalis " + devThalis.getConteudosInscritos());
        System.out.println("Conteudos concluidos Thalis " + devThalis.getConteudosConcluidos());
        System.out.println("XP: " + devThalis.calcularTotalXP());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devThalis.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

    }
}
