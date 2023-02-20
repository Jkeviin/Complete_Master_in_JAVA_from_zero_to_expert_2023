import java.util.Scanner;

public class TAREASection13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la letra (n): ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            return;
        }

        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    matriz[i][j] = 'X';
                } else {
                    matriz[i][j] = '_';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
