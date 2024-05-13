import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese el ejercicio que desea ejecutar 1 o 2");
        int opcion = scanner.nextInt();

        if(opcion == 1)
        {
            ejercicio1();
        }
        else if(opcion == 2){
            ejecicio2();
        }
        else
        {
            System.out.println("esa opcion no existe");
        }
    }

    private static void ejercicio1(){

    }

    private static void ejecicio2(){

    }
}
