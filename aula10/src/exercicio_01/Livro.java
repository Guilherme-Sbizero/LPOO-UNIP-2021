package exercicio_01;

public class Livro extends Publicacao{
    private String editora;

    public Livro(String t, String d, String e) {
        super(t, d);
        this.setEditora(e);
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    @Override
    public void imprimir(){
        String saida = "Titulo: " + super.getTitulo();
        saida += "\nData de Publicação: " + super.getDataPublicacao();
        saida += "\nEditora: " + this.getEditora();
        System.out.println(saida);
    }
    
}
