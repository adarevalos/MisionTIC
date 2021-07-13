// CLASE 1 - 28 DE JUNIO DE 2021

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int variable = 8; 
        //LAS VARIABLES TIPO INT TIENEN DIFERENTE TAMAÑOS PARA CUIDAR LA MEMORIA
        /*
        byte=2^8 = 256 [-128, 127] - 
        short=2^16 - 
        int = 2^32 - 
        long = 2^64
        */
        byte numero_pequeno = 12; //si es > 127 ya no se puede 
        boolean variable2 = true;
        String variable3 = "Milán es el más bonito <3";
        float variable4 = 1.2f; //Java te obliga que el flotante termine con "f" -> Flotante te permite almacenar hasta 2^32 decimales 
        double variable5 = 1.84; // guarda hasta 2^64
        char variable6 = 'D';
        System.out.println(numero_pequeno);
        // ------------------------------------------------
        int [] lista = {5,6,2,65,7,2,1,-4,2}; //Lista de números enteros -> pero en java esto es un ARREGLO 
        System.out.println(lista[0]);
        String [] lista2 = {"Hola", "como", "van las perras"}; //ESTO EN REALIDAD ES UN ARRAY -> El nombre de lista es para pensar en python jajja 
        //-------------------------------------------------
        var variable_lo_que_sea = "Hola"; //Es una variable que le asigna el tipo dependiendo de la igualdad 
        System.out.println(variable_lo_que_sea);
    }
}


