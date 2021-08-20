package exemplo_02;

public class Fornecedor extends Pessoa implements Seguranca{
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
        System.out.println("Valor da Compra: " + this.getValorCompra());
    }
    
    public void calcularImposto(double imposto){
        this.setValorCompra(this.valorCompra + ((this.valorCompra * imposto) / 100));
    }
    
    @Override
    public void validar(){
        if (this.valorCompra < 0){
            System.out.println("Digite um valor de compra válido!!!");
            this.setValorCompra(0);
        }
    }
}
