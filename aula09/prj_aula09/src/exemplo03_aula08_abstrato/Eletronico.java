package exemplo03_aula08_abstrato;

import exemplo03_aula08.*;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(int c, String d, double v, int vo) {
        super(c, d, v);
        this.setVoltagem(vo);
    }

    
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    @Override
    public String print(){
        String saida = super.print();
        saida+= "\nVoltagem: "+this.getVoltagem();
        return saida;
    }
}
