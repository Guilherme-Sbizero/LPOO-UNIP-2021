package exercicio03;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario(1,20000,"Diretor");
        func2.calcularAumento(10.0);
        func2.calcularAumento(3);
        
        //impressao do objeto func1
        System.out.println("Crachá: "+func1.getCracha());
        System.out.println("Salario: "+func1.getSalario());
        System.out.println("Cargo: "+func1.getCargo());
        
        //impressao do objeto func2
        System.out.println("Crachá: "+func2.getCracha());
        System.out.println("Salario: "+func2.getSalario());
        System.out.println("Cargo: "+func2.getCargo());
    }
}
