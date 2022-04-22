import java.util.Scanner;
public class L3E7{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		int []x = new int [30];
		int ma = -273;
		int me = 23456;
		for(int i = 0; i<30; i++){
			System.out.println("Insira a temperatura do dia "+(i+1));
			x[i] = Scan.nextInt();
			if(x[i]>ma){
				ma=x[i];
			}
			if(x[i]<me){
				me=x[i];
			}
		}
		System.out.println("A maior temperatura registrada foi: "+ma+" A menor temperatura registrada: "+me);
		for(int o = 0; o<30; o++){
			System.out.println("Dia "+(o+1)+" : "+x[o]);
		}
	}
}
