package exemplo03_aula08;

public class TestaProdutos {
    public static void main(String[] args) {
        Eletronico e = new Eletronico(1,"Smart TV", 4000.00, 110);
        System.out.println(e.print());
        
        //Vestuario v = new Vestuario(2, "Camiseta Masculina", 100.00, "Hurley","verde","GG");
        //System.out.println(v.print());
        
        Roupa r = new Roupa(3,"Camiseta",30.00,"Hering","Azul","G","Algodão");
        System.out.println(r.print());
        
        Calcado c = new Calcado(4,"Tenis",300.00,"Adidas","Preto","44","Borracha","Couro","Tecido");
        System.out.println(c.print());
    }
}
