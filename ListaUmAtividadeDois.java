import java.util.Scanner;
public class ListaUmAtividadeDois {
	public static void main(String[] args){
		Scanner ListaUmAtividadeDois = new Scanner (System.in);
		System.out.println("Priemiro n�mero:");
		int x = ListaUmAtividadeDois.nextInt();
		System.out.println("Segundo n�mero:");
		int y = ListaUmAtividadeDois.nextInt();
		x = (x+y)/2;
		System.out.println("E a m�dia foi:"+x);
	}
}