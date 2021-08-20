package exercicio_01;

public class Revista extends Publicacao{
    private String editor;
    private String local;

    public Revista(String t, String d, String e, String l) {
        super(t, d);
        this.setEditor(e);
        this.setLocal(l);
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public void imprimir(){
        System.out.println("Titulo : " + this.getTitulo() +
                         "\nData de Publicação: " + super.getDataPublicacao() +
                         "\nEditor: " + this.getEditor() + 
                         "\nLocal: " + this.getLocal());
    }
    
    @Override
    public String getTitulo() {
        return "hahaha usou o metodo local!!!";
    }  
}
