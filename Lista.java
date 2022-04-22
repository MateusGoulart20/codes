import java.util.Scanner;
public class Lista{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Digite qual é o tamanho da lista desejada.");
		int qtd = Scan.nextInt();
		int []x = new int [qtd];
		for(int i = 0; i<qtd; i++){
			System.out.println("Digite o "+(i+1)+"° número.");
			x[i] = Scan.nextInt();
		}
		int t;
		for(int i2 = 0; i2<qtd; i2++){
			for(int i3 = i2;i3<qtd;i3++){
				if(x[i2] > x[i3]){
					t = x[i2];
					x[i2] = x[i3];
					x[i3] = t;
				}
			}
		}
		System.out.println("Organizando de forma Crescente!");
		for(int i = 0; i<qtd; i++){
			System.out.println("O "+(i+1)+"° numero é: "+x[i]);
		}
	}
}