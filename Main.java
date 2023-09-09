import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



// Import the Scanner class to read text files


public class Main{
    private String _name;
    private int _dpi;

    public Person(String name, int dpi){


}

public String getName(){return _name;}

public int getdpi(){return _dpi;}

   static void csv()throws FileNotFoundException{
        Scanner input = new Scanner(new File("datos.txt"));
        ArrayList<Person> personas = new ArrayList<>();



   }
    static void menu(){
        try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                /*No hacer nada*/
            }
               /*Introduce tu código desde aquí*/
            char asccii = 65;
            Scanner objeto = new Scanner(System.in);
            System.out.println("Laboratorio 1");
            System.out.println("Walter Herrera 1109722");
            System.out.println("1.Insertar registro");
            System.out.println("2.Eliminar Registro");
            System.out.println("3.Buscar usuario");
            System.out.println("4. salir");
            int opcion = objeto.nextInt();
            switch(opcion){
            case 1:

            break;

            case 2:

            break;

            case 3:

            break;

            case 4:
                System.out.println("Feliz dia");
                System.out.close();
            break;

            default:
                System.out.println("Valor no aceptado intente nuevamente");
                menu();
            break;
        }

    }
    public static void main(String[] args) {
        menu();
    }
}