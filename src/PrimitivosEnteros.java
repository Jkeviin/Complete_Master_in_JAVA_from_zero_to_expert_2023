public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("NumeroByte = " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un Short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un Short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo Int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo Int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un Int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un Int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;  // Hay que agregar la letra "L" en Mayúscula
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un Long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un Long: " + Long.MIN_VALUE);



    }
}
