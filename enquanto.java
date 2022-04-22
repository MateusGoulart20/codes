public class enquanto {
    public static void main (String[] args) {
        System.out.println("Vamos contar até 100.");
        int i = 0;
        while (i<100) {
            i++;
            System.out.println("Usando enquando " + i);
            if(i%2==0) {
                System.out.println("Numero é par!!!");
            } else {
                System.out.println("Número é impar!!!");
            }
        }
    }
}