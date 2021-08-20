package exemplo01_aula09;

public abstract class Forma {
    private double base;

    public Forma(double b) {
        this.setBase(b);
    }
    
    public abstract double area();
    
    public abstract void mostra();
    
    public double perimetro(){
        return 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}
