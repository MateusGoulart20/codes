import java.util.Scanner;
public class L3E5{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		double []x = new double [20];
		double []y = new double [20];
		for(int i = 0; i<20;i++){
			System.out.println("Insira o número "+(i+1)+"°/20");
			x[i] = Scan.nextDouble();
			y[19-i] = x[i];
		}
		for(int o = 0; o<20; o++){
			System.out.println((o+1)+"°/20. A: "+x[o]+" B: "+y[o]);
		}
	}
}