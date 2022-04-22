import java.util.Scanner;
public class FilaNulo{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Esse sistema, foi projetado, para mostrar em primeio lugar, o item mais recente!");
		System.out.println("Digite qual é o tamanho da fila desejada.");
		int qtd = Scan.nextInt();
		int []x = new int [qtd];
		for(int i = 0; i<qtd; i++){
			x[i] = 0;
		}
		int d = 0;
		while(d != 1){
			if(d == 2){
				for(int i = 0; i<qtd; i++){
						System.out.println((i+1)+"° lugar: "+x[i]);
				}
			}
			if(d == 3){
				for(int i = (qtd-1); i>0; i--){
					x[i] = x[i-1];
				}
				System.out.println("Que número deseja colocar na fila?");
				x[0] = Scan.nextInt();
			}
			if(d<1||d>3){
				System.out.println("Numero Invalido, tente novamente!");
			}
			System.out.println("1 para sair, 2 para ver e 3 para inserir");
			d = Scan.nextInt();
		}
	}
}