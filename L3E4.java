import java.util.Scanner;
public class L3E4{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		int []x = new int [8];
		int []y = new int [8];
		for(int i = 0; i <8; i++){
			System.out.println("Insira o número "+(i+1)+"°/8");
			x[i] = Scan.nextInt();
			y[i] = x[i]*3;
		}
		for(int o = 0; o <8; o++){
			System.out.println((o+1)+"°/8: "+y[o]);
		}
	}
}