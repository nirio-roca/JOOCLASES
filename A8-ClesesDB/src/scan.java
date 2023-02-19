import java.util.Scanner;

public class scan {
    public  static void  EscribirLinea(String mensaje){
        System.out.println(mensaje);
    }
    public  static void  Escribir(String mensaje){
        System.out.print(mensaje);
    }
    public static int Leer(String mensaje){
        int e = 0;
        Scanner sc;
        boolean correcto = true;
        do {
            try {
                scan.Escribir(mensaje);
                sc = new Scanner(System.in);
                e = sc.nextInt();
                correcto = false;
            } catch (Exception ex) {
                System.out.println("""
                        \t\t----------------
                        \t\t    ERROR: N°1
                        \t\t   NO ES VALIDO
                        \t\t----------------
                        """);
            }
        } while (correcto);
        return e;
    }
}
