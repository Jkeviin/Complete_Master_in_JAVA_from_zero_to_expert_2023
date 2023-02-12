import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("Suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        int resta = i - j;
        System.out.println("Resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("Multiplicación = " + multi);
        System.out.println("(i * j) = " + (i * j));

        int div = i / j;
        float div2 = (float) i / (float) j; // (float) Para forzarlo a ser float, de lo contrario daria 1.0 y no 1.25s
        System.out.println("Div = " + div);
        System.out.println("Div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero % 2 == 0){
            System.out.println("Numero PAR: " + numero);
        }else{
            System.out.println("numero IMPAR = " + numero);
        }



    }
}
