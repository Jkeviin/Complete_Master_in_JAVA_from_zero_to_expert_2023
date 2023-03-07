package co.kevorg.appfacturas;

import co.kevorg.appfacturas.modelo.Cliente;
import co.kevorg.appfacturas.modelo.Factura;
import co.kevorg.appfacturas.modelo.ItemFactura;
import co.kevorg.appfacturas.modelo.Producto;

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
        String nombre;
        float precio;
        int cantidad;

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto N°"+producto.getCodigo() + ": ");
            nombre = sc.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(cantidad,producto);
            factura.addItemFactura(item);

            System.out.println();
        }

        System.out.println(factura.generarDetalle());
    }
}
