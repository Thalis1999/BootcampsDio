package br.com.dio.desafiociet.dominio.desafioFinal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(0);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.getData(LocalDate.now());

        System.out.println();
    }
}
