import java.util.Scanner;
public class Fila{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Esse sistema, foi projetado, para mostrar em primeio lugar, o item mais recente!");
		System.out.println("Digite qual é o tamanho da fila desejada.");
		int qtd = Scan.nextInt();
		int []x = new int [qtd];
		boolean []y = new boolean [qtd];
		for(int i1 = 0; i1<qtd; i1++){
			x[i1] = 0;
			y[i1] = false;
		}
		System.out.println("1 para sair, 2 para ver e 3 para inserir");
		int d = Scan.nextInt();
		while(d != 1){
			if(d == 2){
				for(int i = 0; i<qtd; i++){
					if(y[i]){
						System.out.println((i+1)+"° lugar: "+x[i]);
					}else{
						System.out.println((i+1)+"° lugar: Vazio");
					}
				}
			}
			if(d == 3){
				for(int i = (qtd-1); i>0; i--){
					x[i] = x[i-1];
					y[i] = y[i-1];
				}
				System.out.println("Que número deseja colocar na fila?");
				x[0] = Scan.nextInt();
				y[0] = true;
			}
			if(d<1||d>3){
				System.out.println("Numero Invalido, tente novamente!");
			}
			System.out.println("1 para sair, 2 para ver e 3 para inserir");
			d = Scan.nextInt();
		}
	}
}