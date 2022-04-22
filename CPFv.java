import java.util.Scanner;
public class CPFv{ 
	public static void main(String[] args){
		Scanner Scan = new Scanner (System.in);
		int []x = new int [11];
		int m = 1;
		int n = 1;
		for (int z = 0; z < 11; z++){
			System.out.println(z+1+"° número");
			x[z] = Scan.nextInt();
			if((x[z] < 0) || (x[z] > 10)){
			break;
			}
			if(z<10){
			m = m + (10-z)*x[z];
			}
			if(z<11){
			n = n + (11-z)*x[z];
			}
		}
		m = m % 11;
		if(m<2){
			m = 0;
		}else{
			m = 11-m;
		}
		n = n % 11;
		if(n<2){
			n=0;
		}else{
			n = 11-n;
		}
		if((m == x[9]) && (n == x[10])){
			int e;
			if(x[0] == x[1] && x[0] == x[2] && x[0] == x[3] && x[0] == x[4] && x[0] == x[5] && x[0] == x[6] && x[0] == x[7] && x[0] == x[8] && x[0] == x[9] && x[0] == x[10] ){//conferir se todos os números são iguais
				System.out.println("InVálido");
			}else{
			System.out.println("Válido");
			}
		}else{
				System.out.println("InVálido");
		}
	}
}