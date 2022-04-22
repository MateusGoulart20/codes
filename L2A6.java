import java.util.Scanner;
public class L2A6{
	public static void main(String [] args){
		Scanner L2A6 = new Scanner (System.in);
		System.out.println("Envie o número. ");
		int n = L2A6.nextInt();
		int s;
		s = ++n;
		System.out.println(s);
		n = --n;
		n = --n;
		System.out.println(n);
		
	}
}