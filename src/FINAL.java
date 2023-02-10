import java.util.InputMismatchException;
import java.util.Scanner;

public class FINAL {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Inicialización para el uso de Scanner

        System.out.println("Ingrese el nombre de la factura o descripción: ");
        String nombreFactura = scanner.nextLine();


        //variables
        double primerProducto = 0D;
        double segundoProducto = 0D;

        try{

            System.out.println("Bien hecho, ingresa el precio del PRIMER producto:");
            primerProducto = scanner.nextDouble();

            System.out.println("Ahora ingresa el precio del SEGUNDO producto:");
            segundoProducto = scanner.nextDouble();


        }catch (InputMismatchException e){
            System.out.println("Ingrese un número valido. (Se reiniciará el proceso)");
            main(args);
            System.exit(0);
        }

        double totalBruto = primerProducto + segundoProducto;

        double impuesto = totalBruto * 0.16F;

        double totalNeto = impuesto + totalBruto;

        System.out.println("La factura" + nombreFactura + "tiene un total bruto de " + totalBruto + ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + totalNeto + ".");

    }
}
