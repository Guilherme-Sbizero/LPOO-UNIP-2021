package controller;

import java.util.Scanner;
import model.Paciente;

public class UsaPaciente {
    public static void main(String[] args) {
        
        Paciente p1 = new Paciente();
        p1.setNome("Luiz");
        p1.setRg("32323232");
        p1.setEndereco("rua 1 nro 2");
        p1.setTelefone("99999999");
        p1.setDataNascimento("18/02/84");
        p1.setProfissao("Tecnico de informatica");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("RG: " + p1.getRg());
        System.out.println("Endereco: " + p1.getEndereco());
        System.out.println("Telefone: "+ p1.getTelefone());
        System.out.println("Data Nascimento: " + p1.getDataNascimento());
        System.out.println("Profissao: " + p1.getProfissao());
        
        Paciente p2 = new Paciente("João");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("RG: " + p2.getRg());
        System.out.println("Endereco: " + p2.getEndereco());
        System.out.println("Telefone: "+ p2.getTelefone());
        System.out.println("Data Nascimento: " + p2.getDataNascimento());
        System.out.println("Profissao: " + p2.getProfissao());
        
    }    
}
