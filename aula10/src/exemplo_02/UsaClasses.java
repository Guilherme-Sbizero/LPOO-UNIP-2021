package exemplo_02;

public class UsaClasses {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa("Lozano","35353535");
        //p.print();
        
        //Cliente c = new Cliente("Luiz", "35353535", 10000);
        //c.print();
        
        Fornecedor f = new Fornecedor("Empresa XX", "353633536",-8000.00);
        f.validar();
        f.print();
    }
}
