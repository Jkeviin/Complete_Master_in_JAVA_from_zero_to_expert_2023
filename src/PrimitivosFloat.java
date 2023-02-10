public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 3.4028235E38F; // = 15000F
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para Float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para Float = " + Float.MIN_VALUE);

        double realDoble = 1.7976931348623157E308D;
        System.out.println("realDoble = " + realDoble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para Double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para Double = " + Double.MIN_VALUE);
    }
}
