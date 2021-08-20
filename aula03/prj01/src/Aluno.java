public class Aluno {
    //atributos
    String nome, ra;
    int idade;
    double n1,n2;
    
    //metodos
    public double calcularMedia(double pN1, double pN2){
        double media = (pN1 + pN2)/2;
        return media;
    }
    
    /*
    public boolean verificarAprovacao(double pMedia){
        if (pMedia >= 7)
            return true;
        else
            return false;
    }
    */
    public String verificarAprovacao(double pMedia){
        if (pMedia >= 7)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
