public class L2A5{
	public static void main(String[] args){
		int k = 0;
		int j = 0;
		for(int i = 1; i <= 30000;i++){
			if(i%4==0){
				k++;
				System.out.println(i+" é o "+k+"º número, divisivel por 4");
			}
			if(i%6==0){
				j++;
				System.out.println(i+" é o "+j+"º número, divisivel por 6");
			}
		}
	}
}