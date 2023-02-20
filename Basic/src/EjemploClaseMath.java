public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = 3;
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Redondear hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondear hacia el piso
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // Redondear entero con decimal ejemplo 3.4 = 3
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir radianes a grados = " + grados);

        double radianes = Math.toRadians(90d);
        System.out.println("Convertir grados a radianes = " + radianes);

        System.out.println("sin (90): " + Math.sin(radianes));
        System.out.println("cos (90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos (180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos (0.00): " + Math.cos(radianes));


    }
}
