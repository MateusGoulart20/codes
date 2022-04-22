import java.util.Scanner;
public class CPF {
	public static void main(String[] args){
		int x,y;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		int a10 = 0;
		int a11 = 0;
		x = 0;
		y = 0;
		Scanner lala = new Scanner(System.in);
		while(a1 == a2 && a1 == a3 && a1 == a4 && a1 == a5 && a1 == a6 && a1 == a7 && a1 == a8 && a1 == a9 && a1 == a10 && a1 == a11){
		System.out.println("Escreva seu CPF, corretamente,para a verificação.");
		System.out.println("1° número"); 
			a1 = lala.nextInt();
			if((a1 < 0) || (a1 > 10)){
			continue;
			}	
			x = x + a1*10;
			y = y + a1*11;
		System.out.println("2° número");
			a2 = lala.nextInt();
			if((a2 < 0) || (a2 > 10)){
			continue;
			}
			x = x + a1*9;
			y = y + a1*10;
		System.out.println("3° número");
			a3 = lala.nextInt();
			if((a3 < 0 || a3 > 10)){
			continue;
			}
			x = x + a1*8;
			y = y + a1*9;
		System.out.println("4° número");
			a4 = lala.nextInt();
			if((a4 < 0 || a4 > 10)){
			continue;
			}
			x = x + a1*7;
			y = y + a1*8;
		System.out.println("5° número");
			a5 = lala.nextInt();
			if((a5 < 0 || a5 > 10)){
			continue;
			}
			x = x + a1*6;
			y = y + a1*7;
		System.out.println("6° número");
			a6 = lala.nextInt();
			if((a6 < 0) || (a6 > 10)){
			continue;
			}
			x = x + a1*5;
			y = y + a1*6;
		System.out.println("7° número");
			a7 = lala.nextInt();
			if((a7 < 0) || (a7 > 10)){
			continue;
			}
			x = x + a1*4;
			y = y + a1*5;
		System.out.println("8° número");
			a8 = lala.nextInt();
			if((a8 < 0) || (a8 > 10)){
			continue;
			}
			x = x + a1*3;
			y = y + a1*4;
		System.out.println("9° número");
			a9 = lala.nextInt();
			if((a9 < 0) || (a9 > 10)){
			continue;
			}
			x = x + a1*2;
			y = y + a1*3;
		System.out.println("10° número");
			a10 = lala.nextInt();
			if((a10 < 0) || (a10 > 10)){
			continue;
			}
			y = y + a1*2;
		System.out.println("11° número");
			a11 = lala.nextInt();
			if((a11 < 0) || (a11 > 10)){
			continue;
			}
		}
		y = y % 11;
		if(y<2){
			y = 0;
		}else{
		   y = 11-y;
		}
		x = x % 11;
		if(x<2){
			x=0;
		}else{
		   x = 11-x;
		}
		if((x == a10) && (y == a11)){
			System.out.println("Válido");
		}else{
			System.out.println("InVálido");
		}
	}
}