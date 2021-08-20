package exemplo01_aula09;

public class Quadrado extends Forma{

    public Quadrado(double b) {
        super(b);
    }
    
    @Override
    public double perimetro(){
        return super.getBase() * 4;
    }
    
    public double area(){
        return (super.getBase() * super.getBase());
    }
    
    public void mostra(){
        System.out.println("Base: " + super.getBase() + "\nPerímetro: "+this.perimetro()+
                "\nArea: "+this.area());
    }
}
