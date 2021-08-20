package model;

public class Pessoa {
    private String nome;
    private int idade;
    private double renda;

    public Pessoa(){
        //construtor vazio
    }
    
    public Pessoa(int i){ //construtor que recebe apenas a idade
        this.setIdade(i);
    }
    
    public Pessoa(String n){ //metodo construtor que recebe apenas o nome
        this.setNome(n);
    }
    
    public Pessoa(String n, int i){ //metodo construtor que recebe o nome e a idade
        this.setNome(n);
        this.setIdade(i);
    }
    
    public Pessoa(String n, int i, double r){ //construtor que recebe nome, idade e renda
        this.setNome(n);
        this.setIdade(i);
        this.setRenda(r);
        //this.nome = n;
        //this.idade = i;
        //this.renda = r;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
