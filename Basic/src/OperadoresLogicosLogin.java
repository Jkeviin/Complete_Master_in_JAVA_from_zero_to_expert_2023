import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Kevin";
        String password = "hola123";

        String username2 = "Stiven";
        String password2 = "hola123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el USERNAME: ");
        String u = scanner.next();

        System.out.println("Ingrese el PASSWORD");
        String p = scanner.next();

        boolean esAutenticado = false;

        if((username.equalsIgnoreCase(u) && password.equals(p)) ||
                (username2.equalsIgnoreCase(u) && password2.equals(p))
        ){
            esAutenticado = true;
        }else{
            System.out.println("Username o Contraseña incorrectos!");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Lo sentimos, requiere autenticación");
        }

    }
}
