package controller;

import model.Aluno;
import java.util.Scanner;
import model.Aluno;

public class UsaClasses {
    public static void main(String[] args) {
        Aluno obj_aluno1 = new Aluno();
        Scanner obj_leia = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        obj_aluno1.setNome(obj_leia.nextLine());
        System.out.println("Digite o Ra do aluno: ");
        obj_aluno1.setRa(obj_leia.nextLine());
        System.out.println("Digite a Idade do aluno: ");
        obj_aluno1.setIdade(obj_leia.nextInt());
        System.out.println("Digite a primeira nota do aluno: ");
        obj_aluno1.setN1(obj_leia.nextDouble());
        System.out.println("Digite a segunda nota do aluno: ");
        obj_aluno1.setN2(obj_leia.nextDouble());
        double resultado = obj_aluno1.calcularMedia(obj_aluno1.getN1(), obj_aluno1.getN2());
        
        
        System.out.println("Nome: ..................." + obj_aluno1.getNome());
        System.out.println("RA: ....................." + obj_aluno1.getRa());
        System.out.println("Idade: .................." + obj_aluno1.getIdade());
        System.out.println("Nota 1: ................." + obj_aluno1.getN1());
        System.out.println("Nota 2: ................." + obj_aluno1.getN2());
        System.out.println("Media: .................." + resultado);
        System.out.println("O aluno está: ..........." + obj_aluno1.verificarAprovacao(resultado));
    }
}
