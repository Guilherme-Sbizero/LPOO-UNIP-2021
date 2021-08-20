
public class UsaClasse {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Fulano","222-222",300.00);
        c1.print();
        System.out.println("Juros: "+c1.calcularJuros(1.5));
        
        Fornecedor f1 = new Fornecedor("Empresa XX", "3434-3333", 15000);
        f1.print();
        System.out.println("Imposto: "+f1.calcularImpostos(10));
    }
}
