import java.util.Scanner;

// CLASE 2 - 29 DE JUNIO DE 2021 
public class clase2_29junio {
    public static void main(String[] args) throws Exception {
        // Como recibir una entrada por el usuario. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
    //    String entrada = scanner.nextLine();
    //    System.out.println(entrada);

    //    int resultado = scanner.nextInt();
    //    System.out.println("El mensaje fue " + resultado);

        if(5>7){
            System.out.println("Nein");
        } else if (8>3){
            System.out.println("Ja!");
        }else{
            System.out.println("Bitches");
        }

        System.out.println("Ingresa un animal: ");
        String animal = scanner.nextLine();
        if(animal.equals("Perro")){
            System.out.println("woff");
        } else if (animal.equals("Gato")){
            System.out.println("Miau!");
        }

        // EN JAVA EXISTE UNA ESTRUCTURA LLAMADA SWITCH 
        switch(animal){
            case "Perro":
                System.out.println("woff");
                break;
            case "Gato":
                System.out.println("Miau");
                break;
            case "Loro": 
                System.out.println("Gonorrea"); 
                break;
            default: 
                System.out.println("No se encontro");
        }


        
        int contador = 1; 
        while(true){
            System.out.println(":)");
            if(contador==5){
                break;
            }
            contador++; 
        }

        // HAGA ESTO - MIENTRAS QUE "ESTO" SEA CIERTO ------> Entra al menos una vez y despues hace el while y pregunta ..... hace por lo menos una vez
        int numero = 5; 
        do{
            System.out.println("woff");
        }while(numero>7);


        for(int i = 0;i<=5;i++){
            System.out.println("Esta es la i multiplicada por dos: " + (i*2));
        }


    }    
}
