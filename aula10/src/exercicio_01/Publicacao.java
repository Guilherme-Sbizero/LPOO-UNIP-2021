package exercicio_01;

public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;

    public Publicacao(String t, String d) {
        this.setTitulo(t);
        this.setDataPublicacao(d);
    }
    
    public abstract void imprimir();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    
}
