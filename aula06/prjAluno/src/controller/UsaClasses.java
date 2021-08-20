package controller;

import model.Aluno;
import java.util.Scanner;
import model.Aluno;

public class UsaClasses {
    public static void main(String[] args) {
      
        Scanner obj_leia = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String aluno = obj_leia.nextLine();
        System.out.println("Digite o Ra do aluno: ");
        String ra = obj_leia.nextLine();
        System.out.println("Digite a Idade do aluno: ");
        int idade = obj_leia.nextInt();
        System.out.println("Digite a primeira nota do aluno: ");
        double n1 = obj_leia.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double n2 = obj_leia.nextDouble();
        
        Aluno obj_aluno1 = new Aluno(aluno,ra,idade,n1,n2);
        obj_aluno1.calcularMedia(obj_aluno1.getN1(), obj_aluno1.getN2());
        obj_aluno1.imprimirDados();
        
        
    }
}
