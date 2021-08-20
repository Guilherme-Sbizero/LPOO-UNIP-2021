public class Fornecedor extends Pessoa{
    private double valorCompra; 

    public Fornecedor(String n, String f, double vc) {
        super(n, f);
        this.setValorCompra(vc);
    }
    
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
   
    @Override
    public void print(){
        super.print();
        System.out.println("Valor da Compra: "+this.valorCompra);
    }
    
    public double calcularImpostos(double imposto){
        return this.valorCompra * imposto /100;
    }
}
