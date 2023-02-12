public class OperadoresUnarios {
    public static void main(String[] args) {

        int i = -5;
        int j = +i;
        System.out.println("j = " + j);  // j = (1)*i = -5
        int k = -i;
        System.out.println("k = " + k);  // k = (-1)*i = 5



        i = 6;
        j = +i;
        System.out.println("j = " + j); // 6
        k = -i;
        System.out.println("k = " + k); // -6
        
    }
}
