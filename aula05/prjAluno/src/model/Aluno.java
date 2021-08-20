package model;

public class Aluno {
    private String nome,ra;
    private int idade;
    private double n1, n2; 
    
    public void setNome(String nome){
        if(nome.length() <= 2)
            System.out.println("Nome precisa ter mais de 2 caracteres");
        else
            this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setRa(String ra){
        if (ra.length() <= 7)
            this.ra = ra;
        else
            System.out.println("Ra deve ter até 7 caracteres");
    }
    
    public String getRa(){
        return this.ra;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18)
            this.idade = idade;
        else
            System.out.println("Aluno menor de idade");
    }
    
    public void setN1 (double N1){
        if (N1 >= 0 && N1<=10)
            this.n1 = N1;
        else
            System.out.println("Primeira nota inválida!!!");
    }
    
    public double getN1(){
        return this.n1;
    }
    
    public void setN2 (double N2){
        if (N2 >= 0 && N2<=10)
            this.n2 = N2;
        else
            System.out.println("Segunda nota inválida!!!");
    }
    
    public double getN2(){
        return this.n2;
    }
    
    public double calcularMedia(double pN1, double pN2){
        double media = (pN1 + pN2)/2;
        return media;
    }
    
    public String verificarAprovacao(double pMedia){
        if (pMedia >= 5)
            return "APROVADO";
        else{
            return "REPROVADO";
        }
    }

    
}