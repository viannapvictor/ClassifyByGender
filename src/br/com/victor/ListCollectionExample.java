package br.com.victor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCollectionExample  {

    public static void main(String[] args) {
        String i = "";
        Scanner s = new Scanner(System.in);
        List<Person> lista = new ArrayList<Person>();
        List<String> masculino = new ArrayList<String>();
        List<String> feminino = new ArrayList<String>();

        while (!i.equals("SIM")) {
            System.out.println("****** Digite o nome e o genero de alguem ******");
            System.out.println("Digite um Nome: ");
            String name = s.next();
            System.out.println("Digite o genero (Masculino/Feminino): ");
            String gender = s.next().toUpperCase();
            Person person = new Person(name.toString(), gender.toString());
            lista.add(person);
            System.out.println("Deseja parar (Sim/Nao): ");
            i = s.next().toUpperCase();
        }

        lista.forEach( person -> {
            if(person.getGender().equals("MASCULINO")) {
                masculino.add(person.getName());
            } else {
                System.out.println(person.getGender());
                feminino.add(person.getName());
            }
        });
        System.out.println("Feminino: " + feminino + "\n" + "Masculino: " + masculino);
    }

}
