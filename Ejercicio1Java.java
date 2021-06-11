import java.util.Random;
import java.util.Scanner;

public class Ejercicio1Java{

    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Random aleatorio = new Random();
        int var1 = 0;
        int pares = 0;
        int impares = 0;
        int random = 0;
        var1 = getInt("Ingrese el número");

        for(int i = 0; i < var1; i++){
            random = aleatorio.nextInt(100 - 1);
            System.out.println(random);
            while(random > 1){
                random = random - 2;
            }
            if(random == 0){
                System.out.println("Es par");
                pares++;
            }
            else {
                System.out.println("Es impar");
                impares++;
            }
        }
        System.out.println("Son"+pares+" números pares y "+impares+" número impares");
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}
