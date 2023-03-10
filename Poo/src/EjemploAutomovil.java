import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil chevrolet = new Automovil("Chevrolet", "Aveo");
        chevrolet.setCilindrada(2.0);
        chevrolet.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil.setColorPatente(Color.NARANJO);

        Automovil auto = new Automovil();

        Date fecha = new Date();

        System.out.println("Son iguales? == " + nissan.equals(nissan2));

        System.out.println(chevrolet.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println();

        System.out.println(auto.equals(fecha));

        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(chevrolet.acelerar(3000));
        System.out.println(chevrolet.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println();
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 0.75f));
        System.out.println("Kilómetros por litro " + chevrolet.calcularConsumo(300, 75));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 75));
    }
}
