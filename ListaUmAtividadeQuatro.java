import java.util.Scanner;
public class ListaUmAtividadeQuatro {
	public static void main(String[] args){
		Scanner ListaUmAtividadeQuatro = new Scanner (System.in);
		System.out.println("Altura, em centimetros:");
		int altu = ListaUmAtividadeQuatro.nextInt();
		System.out.println("Seu peso:");
		int peso = ListaUmAtividadeQuatro.nextInt();
		altu = peso/(altu*altu)/100000;
		if(altu>30){
			System.out.println("OBESO");
		}else {
			if(altu>25){
				System.out.println("ACIMA DO PESO");
			}else {
				if(altu<18.5){
					System.out.println("NORMAL");
				}else {
					System.out.println("ABAIXO DO PESO");
				}
			}
		}
	}
}