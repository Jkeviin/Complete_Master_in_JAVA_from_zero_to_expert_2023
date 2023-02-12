import java.util.InputMismatchException;
import java.util.Scanner;

public class TAREASection4_1 {
    public static void main(String[] args) {
        /*
                El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

                Podría ser utilizando operador ternario.
         */

        Scanner scanner = new Scanner(System.in);  // Inicialización para el uso de Scanner

        double num1 = 0, num2 = 0;

        try{
            System.out.println("Digite el primer numero: ");
            num1 = scanner.nextDouble();

            System.out.println("Digite el segundo numero: ");
            num2 = scanner.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("ERROR\n");
            main(args);
            System.exit(0);
        }

        String mensaje = num1 >= num2 ? (num1 + " " + num2) : (num2 + " " + num1);

        System.out.println("Orden = " + mensaje);

    }
}
