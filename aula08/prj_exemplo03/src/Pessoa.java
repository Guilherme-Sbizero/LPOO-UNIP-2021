public class Pessoa {
    private String nome;
    private String fone;

    public Pessoa(String n, String f) {
        this.setNome(n);
        this.setFone(f);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    public void print(){
        System.out.println("Nome: "+this.nome +
                         "\nTelefone: "+this.fone);
    }
}
