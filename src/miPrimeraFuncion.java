import java.util.Scanner;

public class miPrimeraFuncion {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        String perro = scanner.nextLine(); 
        System.out.println(saludar(perro));

    }

    public static String saludar(String nombre){
        return "Hola " + nombre; 
    }
    
}
