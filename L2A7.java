import java.util.Scanner;
public class L2A7{
	public static void main(String[] args){
		Scanner L2A7 = new Scanner (System.in);
		System.out.println("Escreva Exit para sair, quando quiser");
		String n = L2A7.nextLine();
		int i = 0;
		while(! n.equals("Exit")){
			i = i++;
			System.out.println("Escreva Exit para sair, quando quiser");
			n = L2A7.nextLine();
		}
	}
}

		