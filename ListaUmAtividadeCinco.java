import java.util.Scanner;
public class ListaUmAtividadeCinco {
	public static void main(String[] args){
		Scanner ListaUmAtividadeCinco = new Scanner (System.in);
		System.out.println("Porfavor a medida do raio:");
		int r = ListaUmAtividadeCinco.nextInt();
		r = 314*r*r/100;
		System.out.println("A área do seu circulo é:"+r);
	}
}