import java.util.Scanner;
public class junio29d {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        int perro = scanner.nextInt(); 
        System.out.println("El número de cifras de " + perro + " es " + contadorDigitos(perro));

    }

    public static int contadorDigitos(int numero){
        int cifras = 0; 
        while(numero!=0){
            numero /= 10; 
            cifras++;
        }
        return cifras; 
    }

    
}


