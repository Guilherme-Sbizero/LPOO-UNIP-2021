public class UsaClasses {
    public static void main(String[] args) {
        Pessoa obj_pessoa1 = new Pessoa(); //criei um objeto chamado obj_pessoa da classe Pessoa. Isso gera a instancia da classe Pessoa
        obj_pessoa1.nome = "Luiz";
        obj_pessoa1.idade = 37;
        obj_pessoa1.salario = 600.00;
        obj_pessoa1.calcularReajuste(obj_pessoa1.salario);
        
        //obj_pessoa1.reajuste = obj_pessoa1.salario * 0.15;
        
        Pessoa obj_pessoa2 = new Pessoa();
        obj_pessoa2.nome = "Caique";
        obj_pessoa2.idade = 26;
        obj_pessoa2.salario = 15000.00;
        obj_pessoa2.calcularReajuste(obj_pessoa2.salario);
        //obj_pessoa2.reajuste = obj_pessoa2.salario * 0.15;
        
        //System.out.println(obj_pessoa.nome);
        //System.out.println(obj_pessoa.idade);
        
        obj_pessoa1.imprimirDados();
        obj_pessoa2.imprimirDados();
    }
}
