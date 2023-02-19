import java.util.Random;

public class EjemploCalseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;


        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int  )random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25 - 15 + 1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("colores = " + colores[randomInt]);
    }
}