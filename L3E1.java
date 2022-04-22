import java.util.Scanner;
public class L3E1{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		int []v = new int [10];
		int []w = new int [10];
		int m;
		for(int i = 0 ; i <10; i++){
			v[i] = Scan.nextInt();
			m = i%2;
			if(m == 1){
				w[i] = v[i]+5;
			}else{
				w[i] = v[i]*5;
			}
		}
		System.out.println("Escrevendo o vetor V");
		for(int u = 0 ; u <10; u++){
			System.out.println(v[u]);
		}
		System.out.println("Escrevendo o Vetor W");
		for(int u = 0 ; u <10; u++){
			System.out.println(w[u]);
		}
	}
}