
import javax.swing.JOptionPane;

public class Usuario extends Pessoa implements Imprimivel, Seguranca{
    private String nomeusuario;
    private String senha;

    public Usuario(String nc, int i, String nu, String s) {
        super(nc, i);
        this.setNomeusuario(nu);
        this.setSenha(s);
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String formatoString(){
        String dados = "Nome Completo: " + super.getNomecompleto() + NLIN 
                     + "Idade: " +super.getIdade() + NLIN 
                     + "Usuario: " + this.getNomeusuario() + NLIN 
                     + "Senha: " + this.getSenha();
        return dados;
    }
    
    @Override
    public void formatoSystemOut(){
        String dados = "Nome Completo: " + super.getNomecompleto() + NLIN 
                     + "Idade: " +super.getIdade() + NLIN 
                     + "Usuario: " + this.getNomeusuario() + NLIN 
                     + "Senha: " + this.getSenha();
        JOptionPane.showMessageDialog(null, dados);
    }
    
    @Override
    public boolean validar(){
        if (this.senha.equals("")){
            JOptionPane.showMessageDialog(null, "Digite uma senha");
            return false;
        }
        else if(this.nomeusuario.equals("")){
            JOptionPane.showMessageDialog(null, "Digite um usuario");
            return false;
        }
        else
            return true;
    }
}
