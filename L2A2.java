import java.util.Scanner;
public class L2A2{
	public static void main(String [] args){
		Scanner L2A2 = new Scanner (System.in);
		int k = 0;
		for (int i =2000;i<20000;i++){
			k = i%3;
			if(k==0){
				System.out.println(i);
			}
		}
	}
}