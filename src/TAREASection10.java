import java.util.Scanner;

public class TAREASection10 {
    /*
    * utilizar la formula:

        area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area;

        double r;
        System.out.println("Introduce el radio del circulo: ");

        r = scanner.nextDouble();

        area = Math.PI * Math.pow(r, 2);

        System.out.println("El área de una circunferencia de radio " + r + " es: " + area);
    }
}