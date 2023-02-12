public class ProcedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = ( i + j + k ) / 3D;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // 140.0
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;  // Pre y Post Incremento tienen prioridad
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
     }
}
