import java.util.Scanner;
public class ListaUmAtividadeDois {
	public static void main(String[] args){
		Scanner ListaUmAtividadeDois = new Scanner (System.in);
		System.out.println("Priemiro número:");
		int x = ListaUmAtividadeDois.nextInt();
		System.out.println("Segundo número:");
		int y = ListaUmAtividadeDois.nextInt();
		x = (x+y)/2;
		System.out.println("E a média foi:"+x);
	}
}