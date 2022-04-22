import java.util.Scanner;
public class ListaUmAtividadeTres {
	public static void main(String[] args){
		Scanner ListaUmAtividadeTres = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome = ListaUmAtividadeTres.nextLine();
		System.out.println("Digite o ano de seu nascimento");
		int nasc = ListaUmAtividadeTres.nextInt();
		System.out.println("Digite o ano futuro");
		int fut = ListaUmAtividadeTres.nextInt();
		if(nasc==fut){
			System.out.println(nome+", o ano futuro inserido é o mesmo do nascimento!");
		}else {
			fut = fut - nasc;
			if(nasc>0){
				System.out.println(nome+" Sua idade seria:"+fut);		
			}else {
				nasc = nasc*(-1);
				System.out.println("Você nasceria em:"+nasc+" anos.");
			}
		}
	}
}