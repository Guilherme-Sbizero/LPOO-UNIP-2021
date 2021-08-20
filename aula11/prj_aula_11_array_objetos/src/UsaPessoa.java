
import java.util.ArrayList;
import java.util.Scanner;

public class UsaPessoa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        
        char controle = 's';
        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite a idade");
            int i = leia.nextInt();
            Pessoa p = new Pessoa(n, i);
            lista.add(p);
            System.out.println("Deseja cadastrar outra pessoa? (S ou s para sim)");
            controle = leia.next().charAt(0);
        }while(controle == 's' || controle == 'S');
        
        lista.remove(2);
        
        
        for (Pessoa i:lista){
            System.out.println(i);
        }
        
        System.out.println("\nA lista tem o tamanho: " + lista.size());
        
        /*
        String nome1 = lista.get(0).getNome();
        int idade1 = lista.get(0).getIdade();
        System.out.println(nome1);
        System.out.println(idade1);
        
        String nome2 = lista.get(1).getNome();
        int idade2 = lista.get(1).getIdade();
        System.out.println(nome2);
        System.out.println(idade2);
        */
    }
  
}
