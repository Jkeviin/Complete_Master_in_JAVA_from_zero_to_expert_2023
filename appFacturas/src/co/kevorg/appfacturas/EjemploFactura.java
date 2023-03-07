package co.kevorg.appfacturas;

import co.kevorg.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setRut("1006052721-8");
        cliente.setNombre("Kevin");


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto N°"+producto.getCodigo() + ": ");
            producto.setNombre(sc.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(sc.nextInt() ,producto));
            System.out.println();
        }

        System.out.println(factura);
    }
}
