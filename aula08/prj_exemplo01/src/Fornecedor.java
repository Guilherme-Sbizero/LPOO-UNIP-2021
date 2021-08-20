public class Fornecedor extends Pessoa{
    private String cnpj;

    public Fornecedor(String cnpj, String nome) {
        super(nome);
        this.setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
