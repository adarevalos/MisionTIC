public class junio29b {
    public static void main(String[] args){
        System.out.println(5+5);
        System.out.println(5-5);
        System.out.println(5*5);
        System.out.println(5/5);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-29));

        int contador = 0;
        contador += 1; 
        contador -= 3; 
        contador *= 7; 
        contador /= 5; // Aqui como contador es INT solo toma la parte entera del ejercicio  
        System.out.println(contador);

        int numero = 1; 
        System.out.println(numero++); //Aqui me imprime 1, porque primero muestra "numero" luego aumenta "++"

        int otro_numero = 1; 
        System.out.println(++otro_numero); //Aquí si me mostraría 2 porque pimero aumenta luego muestra el numero 

        String resultado = 5>2 ? ":)" : ":("; //Similar a lambda de python. Es un if else en una linea 
        System.out.println(resultado);

        if(!(5==2)){
            System.out.println("negado de algo negativo da True :D ");
        }

        // AND &&     -    OR || -         OR EXCLUSIVO ^   O uno o el otro, pero si los dos son verdaderos paila ! 
        if(5>3 ^ 10>7){
            System.out.println("Entro al or exclusivo");
        }else{
            System.out.println("Paila mi perro - Estoy con un or exclusivo ");
        }








    }
    
}
