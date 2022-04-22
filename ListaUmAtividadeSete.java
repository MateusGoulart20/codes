import java.util.Scanner;
public class ListaUmAtividadeSete{
	public static void main(String[] args){
		Scanner Ex = new Scanner (System.in);
		System.out.println("Qual a cor do Semáforo?");
		System.out.println("(1 para Vermelho)");
		System.out.println("(2 para Amarelo)");
		System.out.println("(3 para Verde)");
		int cor = Ex.nextInt();
		if(cor==1){
			System.out.println("É vermelho");
		}else {
			if(cor==2){
				System.out.println("É amarelo");
			}else {
				if(cor==3){
					System.out.println("É verde");
				}else {	
					System.out.println("ERRO");
				}
			}

		}
	}
}