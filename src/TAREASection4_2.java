import java.util.InputMismatchException;
import java.util.Scanner;

public class TAREASection4_2 {
    public static void main(String[] args) {
        /*
            Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

            La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

                    Si la capacidad actual es 70 litros: imprimir Estanque lleno

                    Si está entre 60 y menor a 70: imprimir Estanque casi lleno

                    Si está entre 40 y menor a 60: imprimir Estanque 3/4

                    Si está entre 35 y menor a 40: imprimir Medio Estanque

                    Si está entre 20 y menor a 35: imprimir Suficiente

                    Si está entre 1 y menor a 20: imprimir Insuficiente
         */

        Scanner scanner = new Scanner(System.in);  // Inicialización para el uso de Scanner

        double litro = 0;
        String mensaje = "";

        try{
            System.out.println("Digite la media actual en litros: ");
            litro = scanner.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("ERROR\n");
            main(args);
            System.exit(0);
        }

        if (litro >= 70){
            mensaje = "Estanque lleno";
        } else if( litro >= 60 ){
            mensaje = "Estanque casi lleno";
        } else if ( litro >= 40 ){
            mensaje = "Estanque 3/4";
        } else if ( litro >= 35 ){
            mensaje = "Medio Estanque";
        } else if ( litro >= 20 ){
            mensaje = "Suficiente";
        } else if ( litro >= 1 ) {
            mensaje = "Insuficiente";
        }else{
            mensaje = "No tiene gasolina (gas)";
        }

        System.out.println(mensaje);

    }
}
