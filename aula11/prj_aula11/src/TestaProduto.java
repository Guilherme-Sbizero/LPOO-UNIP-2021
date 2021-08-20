public class TestaProduto {
    public static void main(String[] args) {
        Usuario usu = new Usuario("Luiz Lozano",37,"lozano","vip123");
        //usu.formatoSystemOut();
        //System.out.println(usu.formatoString());
        
        if(usu.validar()){
            usu.formatoSystemOut();
            System.out.println(usu.formatoString());
        }

        //Produto prod = new Produto("Macarrao", 10);
        //System.out.println(prod.formatoString());
        //prod.formatoSystemOut();
        
        /*
        if(prod.validar()){
            prod.formatoSystemOut();
            System.out.println("\n" + prod.formatoString());
        }
        */
        
    }
}
