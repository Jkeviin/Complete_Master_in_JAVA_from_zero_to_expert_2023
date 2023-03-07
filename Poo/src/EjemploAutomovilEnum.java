public class EjemploAutomovilEnum {
    public static void main(String[] args) {


        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaro = new Automovil("Subaro", "Impreza");
        subaro.setCilindrada(2.0);
        subaro.setColor(Color.BLANCO);
        subaro.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipo = subaro.getTipo();
        System.out.println("Tipo subaru: "+tipo.getNombre());
        System.out.println("Tipo desc. subaru: "+tipo.getDescripcion());


        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y de 2 puertas");
            case COUPE -> System.out.println("El automovil pequeño de 2 puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());

            System.out.println();

        }

    }
}
