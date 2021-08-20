package exemplo03_aula08;

public class Roupa extends Vestuario{
    private String tecido;

    public Roupa(int c, String d, double v, String n, String co, String t, String te) {
        super(c, d, v, n, co, t);
        this.setTecido(te);
    }
    
    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    
    @Override
    public String print(){
        String saida = super.print();
        saida+= "\nTecido: "+this.getTecido();
        return saida;
    }
}
