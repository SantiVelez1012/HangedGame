
package ahorcadogame;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class AhorcadoGame {

    
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        lectorPalabras objetoPalabras = new lectorPalabras();
        
        int dificultad = 0;
        
        
        do{
            System.out.println("Ingrese la dificultad (1 - Facil -- 2 - Normal -- 3 - Dificil): ");
            dificultad = teclado.nextInt();
        }while(dificultad < 1 || dificultad > 3);
        
        ArrayList<String> listaPalabras = objetoPalabras.lecturaArchivo(dificultad);
        
        String palabraElegida = objetoPalabras.eleccionPalabra(listaPalabras);
        
        System.out.println("La palabra elegida es: " + palabraElegida);
        
        
        
        do{
            
            
            
        }while();
        
        
        
        
        
        
        
    }
    
}
