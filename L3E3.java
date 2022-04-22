import java.util.Scanner;
public class L3E3{
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		String []x = new String [10];
		for(int i = 0; i <10; i++){
			System.out.println("Insira o "+(i+1)+"° nome, de 10");
			x[i] = Scan.nextLine();
		}
		for(int o = 0; o <10; o++){
			System.out.println(o+"° nome: "+x[o]);
		}
	}
}