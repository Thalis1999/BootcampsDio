package org.bootcampciet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Consultant {
    protected String name;
    protected String role;

    public Consultant(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public String present() {
        return role + ": " + name;
    }
}
class Developer extends Consultant {
    public Developer(String name) {
        super(name, "Dev");
    }
}
class Analyst extends Consultant {
    public Analyst(String name) {
        super(name, "Analyst");
    }
}
class Manager extends Consultant {
    public Manager(String name) {
        super(name, "Manager");
    }
}

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o cargo e nome: ");
        String inputLine = scanner.nextLine().trim();   //Tira espaços

        List<Consultant> consultantList = new ArrayList<>();   //Lista que recebe somente tipos Consultant
        String[] entries = inputLine.split(";");   //tira ";"

        for (String entry : entries) {
            entry = entry.trim();
            if (entry.isEmpty()) continue;

            String[] parts = entry.split(" ", 2);   //Separa cargo do nome pelo espaço que havia
            String jobTitle = parts[0];   //cargo na posição 1
            String personName = parts[1];   //nome na posição 2

            switch (jobTitle) {
                case "Developer":
                    consultantList.add(new Developer(personName));
                    break;
                case "Analyst":
                    consultantList.add(new Analyst(personName));
                    break;
                case "Manager":
                    consultantList.add(new Manager(personName));
            }
        }
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }
    }
}

