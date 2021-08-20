package exercicio06;

public class UsaVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(3000,1100,"Luiz",2);
        v1.calcularSalario();
        v1.imprimirDados();
    }
}
