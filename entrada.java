import java.util.scanner;
public class entrada {
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("O nome digitado foi: " + nome + ".");
    }
}