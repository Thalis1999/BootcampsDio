package br.com.dio.desafiociet.dominio;

import java.util.*;

//Comparar apenas com outros consultores
abstract class Consultor implements Comparable<Consultor> {
    public String nome;
    public String nivel;
    public String especialidade;

    public Consultor(String nome, String nivel, String especialidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.especialidade = especialidade;
    }

    @Override
    public int compareTo(Consultor outro) {
        return this.nome.compareTo(outro.nome);
    }
}
class ConsultorBackend extends Consultor {
    public ConsultorBackend(String nome, String nivel) {
        super(nome, nivel, "Backend");
    }
}
class ConsultorFrontend extends Consultor {
    public ConsultorFrontend(String nome, String nivel) {
        super(nome, nivel, "Frontend");
    }
}
class ConsultorDados extends Consultor {
    public ConsultorDados(String nome, String nivel) {
        super(nome, nivel, "Dados");
    }
}
class Equipe {
    public String nome;
    public List<Consultor> consultores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }
    public void adicionar(Consultor c) {
        consultores.add(c);
    }
    public List<Consultor> ordenados() {
        List<Consultor> lista = new ArrayList<>(consultores);
        Collections.sort(lista);
        return lista;
    }
}
public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Equipe> equipes = new HashMap<>();

        Equipe alpha = new Equipe("Alpha");
        alpha.adicionar(new ConsultorBackend("Bruno", "Senior"));
        alpha.adicionar(new ConsultorDados("Lucas", "Pleno"));
        alpha.adicionar(new ConsultorFrontend("Maria", "Junior"));
        equipes.put("Alpha", alpha);

        Equipe beta = new Equipe("Beta");
        beta.adicionar(new ConsultorDados("Ana", "Senior"));
        beta.adicionar(new ConsultorBackend("Joao", "Junior"));
        equipes.put("Beta", beta);

        String nomeEquipe = sc.nextLine();
        Equipe equipeSelec = equipes.get(nomeEquipe);

        if (equipeSelec != null) {
            for (Consultor listagem : equipeSelec.ordenados()) {
                System.out.println(listagem.nome + " " + listagem.especialidade + " " + listagem.nivel);
            }
        }else {
            System.out.println("Equipe não encontrada.");
        }
    }
}
