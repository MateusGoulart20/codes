import java.util.Scanner;
public class L3E8{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		int []x = new int [30];
		int in = 0;
		int pa = 0;
		for(int i = 0; i<30; i++){
			System.out.println("Por favor insira o "+(i+1)+"° número");
			x[i] = Scan.nextInt();
			if((x[i]%2)== 0){
				pa = pa+1;
			}else{
				in = in+1;
			}
		}
		System.out.println("Pares: "+pa+"  Impares: "+in);
	}
}