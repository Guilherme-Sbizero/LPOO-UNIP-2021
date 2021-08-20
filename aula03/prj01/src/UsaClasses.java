
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsaClasses {
    public static void main(String[] args) {
        Aluno obj_aluno1 = new Aluno();
        obj_aluno1.nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        obj_aluno1.ra = JOptionPane.showInputDialog("Digite o ra do aluno: ");
        obj_aluno1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade do aluno: "));
        obj_aluno1.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno: "));
        obj_aluno1.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno: "));
        
        
        JOptionPane.showMessageDialog(null,"O nome do aluno é: "+obj_aluno1.nome);
        JOptionPane.showMessageDialog(null,"O Ra do aluno é: "+obj_aluno1.ra);
        JOptionPane.showMessageDialog(null,"A Idade do aluno é: "+obj_aluno1.idade);
        JOptionPane.showMessageDialog(null,"A nota 1 do aluno é: "+obj_aluno1.n1);
        JOptionPane.showMessageDialog(null,"A nota 2 do aluno é: "+obj_aluno1.n2);
        double media = obj_aluno1.calcularMedia(obj_aluno1.n1, obj_aluno1.n2);
        JOptionPane.showMessageDialog(null,"A média é: "+media);
        JOptionPane.showMessageDialog(null,"O aluno está: "+obj_aluno1.verificarAprovacao(media));
        
        
        /*parte 2
        Scanner obj_leia = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        obj_aluno1.nome = obj_leia.nextLine();
        System.out.println("Digite o RA do aluno:   ");
        obj_aluno1.ra = obj_leia.nextLine();
        System.out.println("Digite a idade do aluno: ");
        obj_aluno1.idade = obj_leia.nextInt();
        System.out.println("Digite a primeira nota: ");
        obj_aluno1.n1 = obj_leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        obj_aluno1.n2 = obj_leia.nextDouble();
        
        
        System.out.println("Nome   : ........... "+obj_aluno1.nome);
        System.out.println("RA     : ........... "+obj_aluno1.ra);
        System.out.println("Idade  : ........... "+obj_aluno1.idade);  
        System.out.println("N1     : ........... "+obj_aluno1.n1);
        System.out.println("N2     : ........... "+obj_aluno1.n2);
        System.out.println("A média é: "+obj_aluno1.calcularMedia(obj_aluno1.n1, obj_aluno1.n2));
       
        */
        
        /* parte 1
        obj_aluno1.nome = "Maycon";
        obj_aluno1.ra = "B278350";
        obj_aluno1.idade = 20;
        obj_aluno1.n1 = 5.5;
        obj_aluno1.n2 = 8.5;
        System.out.println("A média é: "+obj_aluno1.calcularMedia(obj_aluno1.n1, obj_aluno1.n2));
        double media = obj_aluno1.calcularMedia(obj_aluno1.n1, obj_aluno1.n2);
        System.out.println("A média é: "+media);
        boolean status = obj_aluno1.verificarAprovacao(media);
        System.out.println(status);
        */
        
        //JOptionPane.showMessageDialog(null,"Nome do aluno: "+obj_aluno1.nome);   
    }
}
