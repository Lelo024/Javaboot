package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("curso básico Java");
        curso1.setCargaHoraria(8);
    
        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("curso básico Js");
        curso2.setCargaHoraria(8);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria aos alunos do curso Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Incritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Incritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());

    }
}
