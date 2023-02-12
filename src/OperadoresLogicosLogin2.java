import java.util.Scanner;

public class OperadoresLogicosLogin2 {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Kevin";
        passwords[0] = "hola123";
        usernames[1] = "Stiven";
        passwords[1] = "hola123";
        usernames[1] = "Tania";
        passwords[1] = "hola123";*/

        String[] usernames = {
                "Kevin", "Stiven", "Tania"
        };

        String[] passwords = {
                "hola123", "hola123", "hola123"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el USERNAME: ");
        String u = scanner.next();

        System.out.println("Ingrese el PASSWORD: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){

            esAutenticado = (usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p)) ? true : esAutenticado;

            /*if(usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje =  esAutenticado ? "Bienvenido usuario ".concat(u).concat("!")
                                        : "Username o Contraseña incorrectos! \nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
                
        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Username o Contraseña incorrectos!");
            System.out.println("Lo sentimos, requiere autenticación");
        }*/

    }
}
