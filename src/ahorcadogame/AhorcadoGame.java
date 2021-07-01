
package ahorcadogame;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class AhorcadoGame {

    
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        lectorPalabras objetoPalabras = new lectorPalabras();
        
        int dificultad = 0;
        
        
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO");
        System.out.println("");
        
        do{
            System.out.println("Ingrese la dificultad (1 - Facil -- 2 - Normal -- 3 - Dificil): ");
            dificultad = teclado.nextInt();
        }while(dificultad < 1 || dificultad > 3);
        
        ArrayList<String> listaPalabras = objetoPalabras.lecturaArchivo(dificultad);
        
        String palabraElegida = objetoPalabras.eleccionPalabra(listaPalabras);
        
        char[] caracteresPalabra = objetoPalabras.conversionStringCharArray(palabraElegida);
        
        mecanicauno objetoMecanica = new mecanicauno(caracteresPalabra);
        
        char[] palabraUsuario = objetoMecanica.creacionArrayGuiones();
        
        
        int numeroIntentos = 0, numeroFallos = 0;
        int fallosMaximos = 10;
        char caracterUsuario;
        
        System.out.println("-----------------------------------------------");
        System.out.println("COMIENZA EL JUEGO");
        
        
        do{
            
            boolean victoria = objetoMecanica.comprobarVictoria(palabraUsuario);
            
            if(numeroFallos == fallosMaximos){
                System.out.println(" HA PERDIDO ");
                break;
            }else if(victoria == true){
                objetoMecanica.impresionPalabra(palabraUsuario);
                System.out.println("Usted Ha ganado el juego");
                break;
            }
            
            System.out.println("");
            objetoMecanica.impresionPalabra(palabraUsuario);
            
            System.out.println("Ingrese una letra: ");
            caracterUsuario = teclado.next().charAt(0);
            
            boolean existe = objetoMecanica.recibirCaracter(palabraUsuario, caracterUsuario);
            
            if(existe == false){
                System.out.println("Ha fallado, sigue intentando");
                numeroFallos++;
            }
            
            numeroIntentos++;
            
        }while(palabraUsuario != caracteresPalabra);
        
        
        if(palabraUsuario == caracteresPalabra){
            System.out.println("FELICIDADES POR COMPLETAR EL JUEGO!");
        }
        
        
        
        
    }
    
}
