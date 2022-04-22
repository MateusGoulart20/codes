import java.util.Scanner;
public class L2A9{
	public static void main(String[] args){
		Scanner L2 = new Scanner (System.in);
		System.out.println("Coloque um número real");
		double rr = L2.nextDouble();
		System.out.println("Coloque um número inteiro");
		int ii = L2.nextInt();
		double ri = ii;
		int ir = (int)rr;
		System.out.println("O real em inteiro: "+ir+"  O inteiro em real: "+ri);
	}
}	