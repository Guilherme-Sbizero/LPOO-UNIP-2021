public class UsaClasses {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.base = 10;
        ret.altura = 8;
        System.out.println("A Área do retangulo é: "+ret.CalcularArea(ret.base, ret.altura));
    }
}
