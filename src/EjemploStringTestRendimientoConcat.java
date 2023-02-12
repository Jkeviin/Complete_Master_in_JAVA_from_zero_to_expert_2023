public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);  // Es mutable el StringBuilder

        long inicio = System.currentTimeMillis();

        for (int i = 0 ; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n");  // 500 => 2ms, 1000 => 3ms, 10000 => 81ms, 100000 => 4573ms
            // c += a + b + "\n";  // 500 => 11ms, 1000 => 11ms, 10000 => 51ms, 100000 => 1621ms
            // sb.append(a).append(b).append("\n");  // 500 => 0ms, 1000 => 0ms, 10000 => 1ms, 100000 => 8ms
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());  // Se necesita toString


    }
}
