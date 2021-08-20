public class Pessoa {
    String nome;  //atributo de nome nome e tipo String
    int idade;    //atributo de nome idade e tipo inteiro  
    double salario; //atributo de nome salario e tipo double
    double reajuste; //atributo de nome reajuste e tipo double
    
    public void imprimirDados(){
        System.out.println("Nome:................"+nome);
        System.out.println("Idade:..............."+idade);
        System.out.println("Salario:............."+salario);
        System.out.println("Reajuste:............"+reajuste);        
    }
    
    public void calcularReajuste(double pSalario){
        this.reajuste = pSalario * 0.15;
        reajustarSalario(reajuste);
    }
    
    public void reajustarSalario (double pReajuste){
        this.salario = this.salario + this.reajuste;
    }
}

