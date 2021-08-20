package model;

public class Aluno {
    private String nome,ra;
    private int idade;
    private double n1, n2; 
    private double media;

    public Aluno(String nome, String ra, int idade, double n1, double n2) {
        //this.nome = nome;
        //this.ra = ra;
        //this.idade = idade;
        //this.n1 = n1;
        //this.n2 = n2;
        this.setNome(nome);
        this.setRa(ra);
        this.setIdade(idade);
        this.setN1(n1);
        this.setN2(n2);
    }
    
    
    
    private void setNome(String nome){
        if(nome.length() <= 2)
            System.out.println("Nome precisa ter mais de 2 caracteres");
        else
            this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    private void setRa(String ra){
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

    private void setIdade(int idade) {
        if (idade >= 18)
            this.idade = idade;
        else
            System.out.println("Aluno menor de idade");
    }
    
    private void setN1 (double N1){
        if (N1 >= 0 && N1<=10)
            this.n1 = N1;
        else
            System.out.println("Primeira nota inválida!!!");
    }
    
    public double getN1(){
        return this.n1;
    }
    
    private void setN2 (double N2){
        if (N2 >= 0 && N2<=10)
            this.n2 = N2;
        else
            System.out.println("Segunda nota inválida!!!");
    }
    
    public double getN2(){
        return this.n2;
    }
    
    public void calcularMedia(double pN1, double pN2){
        this.setMedia((pN1 + pN2)/2);
        
    }
    
    public String verificarAprovacao(double pMedia){
        if (pMedia >= 5)
            return "APROVADO";
        else{
            return "REPROVADO";
        }
    }

    public double getMedia() {
        return media;
    }

    private void setMedia(double media) {
        this.media = media;
    }
    
    public void imprimirDados(){
        System.out.println("Nome: ..................." + this.getNome());
        System.out.println("RA: ....................." + this.getRa());
        System.out.println("Idade: .................." + this.getIdade());
        System.out.println("Nota 1: ................." + this.getN1());
        System.out.println("Nota 2: ................." + this.getN2());
        System.out.println("Media: .................." + this.getMedia());
        System.out.println("O aluno está: ..........." + this.verificarAprovacao(this.getMedia()));
    }
}