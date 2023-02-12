public class SentenciaSwitchCase {
    public static void main(String[] args) {
        char num = 'a';

        switch (num) {
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("El character es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }


        String nombre = "Kevin";

        switch (nombre) {
            case "Kevin":
                System.out.println("Hola Kevin, bienvenido!");
                break;
            case "admin":
                System.out.println("Hola Admin!!");
                break;
            case "pepe":
                System.out.println("Hola Pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }

    }
}
