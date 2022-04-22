import java.util.Scanner;
public class Pilha{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Digite qual é o tamanho da fila desejada.");
		int qtd = Scan.nextInt();
		int []x = new int [qtd];
		boolean []y = new boolean [qtd];
		for(int i1 = 0; i1<qtd; i1++){
			x[i1] = 0;
			y[i1] = false;
		}
		System.out.println("1 para sair, 2 para ver, 3 para inserir e 4 para tirar.");
		int d = Scan.nextInt();
		while(d != 1){
			if(d == 2){
				for(int i = (qtd-1); i>=0; i--){
					if(y[i]){
						System.out.println((i+1)+"° Andar: "+x[i]+".");
					}else{
						System.out.println((i+1)+"° Andar: Vazio.");
					}
				}
			}
			if(d == 3){
				if(y[qtd-1]){
					System.out.println("A pilha está cheia, sem onde colocar.");		
				}else{
					for(int i = 0; i<qtd; i++){
						if(!y[i]){
							System.out.println("Insira o número.");
							x[i] = Scan.nextInt();
							y[i] = true;
							break;
						}
					}
				}
			}
			if(d == 4){
				if(!y[0]){
					System.out.println("A pilha está vazia, sem nada para retirar.");
				}else{
					if(y[qtd-1]){
						y[qtd-1] = false;
					}else{
						for(int i = (qtd-1); i>=0 ;i--){
							if(!y[i] && y[i-1]){
								y[i-1] = false;
								break;
							}
						}
					}
				}
			}
			if(d<1||d>4){
				System.out.println("Numero Invalido, tente novamente!");
			}
			System.out.println("1 para sair, 2 para ver, 3 para inserir e 4 para tirar.");
			d = Scan.nextInt();
		}
	}
}