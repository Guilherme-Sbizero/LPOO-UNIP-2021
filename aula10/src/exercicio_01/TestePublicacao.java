package exercicio_01;

import java.util.Scanner;

public class TestePublicacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o título do livro: ");
        String t = leia.nextLine();
        System.out.println("Digite a data de publicação do livro: ");
        String d = leia.nextLine();
        System.out.println("Digite o nome do editor: ");
        String e = leia.nextLine();
        System.out.println("Digite o nome do local: ");
        String l = leia.nextLine();
        Revista r = new Revista(t,d,e,l);
        r.imprimir();
        
        
        
        /*
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o título do livro: ");
        String t = leia.nextLine();
        System.out.println("Digite a data de publicação do livro: ");
        String d = leia.nextLine();
        System.out.println("Digite o nome da editora: ");
        String e = leia.nextLine();
        Livro l = new Livro(t,d,e);
        l.imprimir();
        */
    }
}
