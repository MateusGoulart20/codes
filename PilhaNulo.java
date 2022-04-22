import java.util.Scanner;
public class PilhaNulo{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Digite qual é o tamanho da fila desejada.");
		int qtd = Scan.nextInt();
		int []x = new int [qtd];
		for(int i = 0; i<qtd; i++){
			x[i] = 0;
		}
		int d = 0;
		while(d != 1){
			if(d == 2){
				for(int i = (qtd-1); i>=0; i--){
					System.out.println((i+1)+"° Andar: "+x[i]+".");
				}
			}
			if(d == 3){
				if(x[qtd-1] != 0){
					System.out.println("A pilha está cheia, sem onde colocar.");		
				}else{
					for(int i = 0; i<qtd; i++){
						if(x[i] == 0){
							System.out.println("Insira o número.");
							x[i] = Scan.nextInt();
							break;
						}
					}
				}
			}
			if(d == 4){
				if(x[0] == 0){
					System.out.println("A pilha está vazia, sem nada para retirar.");
				}else{
					for(int i = (qtd-1); i>=0 ;i--){
						if(x[i] != 0){
							x[i] = 0;
							break;
						}
					}
				}
			}
			System.out.println("1 para sair, 2 para ver, 3 para inserir e 4 para tirar.");
			d = Scan.nextInt();
		}
	}
}