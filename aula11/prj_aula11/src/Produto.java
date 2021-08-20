
import javax.swing.JOptionPane;

public class Produto implements Imprimivel, Seguranca{
    private String descricao;
    private int quantidade;

    public Produto(String d, int q) {
        this.setDescricao(d);
        this.setQuantidade(q);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String formatoString(){
        String resp = "Descrição: " + this.getDescricao();
        resp += NLIN + "Qtde: " + this.getQuantidade();
        return resp;
    }
    
    public void formatoSystemOut(){
        String resp = "Descrição: " + this.getDescricao();
        resp += NLIN + "Qtde: " + this.getQuantidade();
        System.out.println(resp);
    }
    
    public boolean validar(){
        if (this.quantidade < 0){
            JOptionPane.showMessageDialog(null, "Digite uma quantidade valida");
            return false;
        }
        else if(this.descricao.equals("") || this.descricao.length()<3){
            JOptionPane.showMessageDialog(null, "Informe uma descricao valida");
            return false;
        }
        else
            return true;
    }
}
