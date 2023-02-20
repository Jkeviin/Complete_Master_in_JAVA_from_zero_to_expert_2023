public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil chevrolet = new Automovil();
        chevrolet.setFabricante("Chevrolet");
        chevrolet.setModelo("Aveo");
        chevrolet.setCilindrada(2.0);
        chevrolet.setColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        System.out.println(chevrolet.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println();

        System.out.println(chevrolet.acelerar(3000));
        System.out.println(chevrolet.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println();
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 0.75f));
        System.out.println("Kilómetros por litro " + chevrolet.calcularConsumo(300, 75));

    }
}
