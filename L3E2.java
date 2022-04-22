import java.util.Scanner;
public class L3E2{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		int []x = new int [5];
		int y = 0;
		int m = 0;
		for(int i = 0; i<5; i++){
			System.out.println("Coloque o numero: "+(i+1));
			x[i] = Scan.nextInt();
			m = (i+1)%2;
			if(m == 1){
				y = y+x[i];
			}
		}
		System.out.println(y);
	}
}