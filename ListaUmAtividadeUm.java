import java.util.Scanner;
public class ListaUmAtividadeUm {
	public static void main (String[] args){		
		int i = 0;
		Scanner ListaUmAtividadeUm = new Scanner (System.in);
		while(i<10){
			i++;
			System.out.println("N�mero:"+i);
			System.out.println("Digite um n�mero:");
			int x = ListaUmAtividadeUm.nextInt();
			if(x%2==0){
				System.out.println("N�mero par.");
			}else{
				System.out.println("N�mero impar.");
			}
		}
	}
}