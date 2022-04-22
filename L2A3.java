public class L2A3{
	public static void main(String [] args){
		int k = 0;
		int j;
		for(int i = 1; i<10000;i++){
			for(int n = 1; n < i;n++){
				j = i%n;
				if(j==0){
					k = k+1;
				}
			}
		if(k<2)
			System.out.println(i+" É primo");
			k = 0;
		}
	}
}
		