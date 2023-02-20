import javax.swing.*;

public class TAREASection4_3 {
    public static void main(String[] args) {
        /*
        Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

            Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

            Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

            Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

            Restricción no utilizar loops en el desarrollo de la tarea.

        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
         */

        String persona1 = JOptionPane.showInputDialog("Ingresa (nombre + apellido) de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa (nombre + apellido) de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa (nombre + apellido) de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() > persona2.split(" ")[0].length()) ? persona1 : persona2;
        max = (persona3.split(" ")[0].length() > max.split(" ")[0].length()) ? persona3: max;

        JOptionPane.showMessageDialog(null, max + " tiene el nombre más largo. ");
    }
}
