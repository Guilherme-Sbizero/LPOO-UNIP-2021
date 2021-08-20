package controller;

import java.util.Scanner;
import model.Pessoa;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = leia.nextLine();
        
        System.out.println("Digite a idade: ");
        int idade = leia.nextInt();
        
        System.out.println("Digite a renda: ");
        double renda = leia.nextDouble();
                
        Pessoa p5 = new Pessoa(nome,idade,renda);
        
        System.out.println("Nome da P5:  "+p5.getNome());
        System.out.println("Idade da P5: "+p5.getIdade());
        System.out.println("Renda da P5: "+p5.getRenda());
        System.out.println("\n"); //para pular linh
        
        
        /*
        //instacia de metodo construtor vazio
        Pessoa p1 = new Pessoa();
        p1.setNome("Luiz");
        p1.setIdade(37);
        p1.setRenda(600.00);
        System.out.println("Nome da P1:  "+p1.getNome());
        System.out.println("Idade da P1: "+p1.getIdade());
        System.out.println("Renda da P1: "+p1.getRenda());
        System.out.println("\n"); //para pular linha
        
        //instancia do construtor que recebe apenas a idade
        Pessoa p2 = new Pessoa(20);
        p2.setNome("Luiz Felipe");
        p2.setRenda(5000.00);
        System.out.println("Nome da P2:  "+p2.getNome());
        System.out.println("Idade da P2: "+p2.getIdade());
        System.out.println("Renda da P2: "+p2.getRenda());
        System.out.println("\n"); //para pular linha
        
        //instancia do construtor que recebe o nome e a idade
        Pessoa p3 = new Pessoa("Diogo", 22);
        p3.setRenda(12000.00);
        System.out.println("Nome da P3:  "+p3.getNome());
        System.out.println("Idade da P3: "+p3.getIdade());
        System.out.println("Renda da P3: "+p3.getRenda());
        System.out.println("\n"); //para pular linha
        
        //instancia do construtor que recebe apenas o nome
        Pessoa p4 = new Pessoa("Lucas");
        p4.setIdade(19);
        p4.setRenda(4000.00);
        System.out.println("Nome da P4:  "+p4.getNome());
        System.out.println("Idade da P4: "+p4.getIdade());
        System.out.println("Renda da P4: "+p4.getRenda());
        System.out.println("\n"); //para pular linha
        
        //intancia do construtor que recebe nome, idade e renda
        Pessoa p5 = new Pessoa("Fabio",40, 150000);
        System.out.println("Nome da P5:  "+p5.getNome());
        System.out.println("Idade da P5: "+p5.getIdade());
        System.out.println("Renda da P5: "+p5.getRenda());
        System.out.println("\n"); //para pular linha
        */
    }
}
