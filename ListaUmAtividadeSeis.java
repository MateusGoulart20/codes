import java.util.Scanner;
public class ListaUmAtividadeSeis{
	public static void main(String[] args){
		Scanner Lista = new Scanner (System.in);
		System.out.println("Insira um número");
		int x = 0;
		int y = Lista.nextInt();
		int z = 0;
		while(y!=0){
			System.out.println("Insira um número");
			x++;
			y = Lista.nextInt();
			z = z+y;
		}
		System.out.println(" Soma:"+z+" Números recebidos:"+x);
	}
}