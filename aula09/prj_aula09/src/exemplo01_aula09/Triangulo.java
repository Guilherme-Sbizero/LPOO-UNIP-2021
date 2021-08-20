package exemplo01_aula09;

public class Triangulo extends Forma{
    private double altura;

    public Triangulo(double b, double a) {
        super(b);
        this.setAltura(a);
    }

    public double area(){
        return (super.getBase() * this.altura)/2;
    }
    
    public void mostra(){
        System.out.println("Base: " + super.getBase() + "\nAltura: "+this.getAltura()+
                "\nArea: "+this.area());
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
