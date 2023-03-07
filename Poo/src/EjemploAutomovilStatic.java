public class EjemploAutomovilStatic {
    public static void main(String[] args) {


        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil chevrolet = new Automovil("Chevrolet", "Aveo");
        chevrolet.setCilindrada(2.0);
        chevrolet.setColor(Color.BLANCO);
        chevrolet.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.NARANJO);
        Automovil auto = new Automovil();

        System.out.println(chevrolet.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println();

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("Kilómetros por litros = "+ Automovil.calcularConsumoEstatico(300, 60));

        System.out.println();
        System.out.println("VELOCIDAD_MAX_CARRETERA: " +Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("VELOCIDAD_MAX_CIUDAD: " +Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}
