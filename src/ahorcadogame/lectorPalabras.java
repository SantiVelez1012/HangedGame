/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user
 */
public class lectorPalabras {
    
    
    
        
    
    public ArrayList<String> lecturaArchivo(int dificultadSeleccionada) throws IOException {
            // SELECCION DE DIFICULTAD Y ASIGNACION DE RUTA
            String rutaArchivo = null;
        
        switch (dificultadSeleccionada) {
            case 1:
                rutaArchivo = "C:\\Users\\user\\Desktop\\Practicas de programación\\Java\\ahorcadoGame\\src\\ahorcadogame\\palabrasfacil.txt";
                break;
            case 2:
                rutaArchivo = "C:\\Users\\user\\Desktop\\Practicas de programación\\Java\\ahorcadoGame\\src\\ahorcadogame\\palabrasnormal.txt";
                break;
            case 3:
                rutaArchivo = "C:\\Users\\user\\Desktop\\Practicas de programación\\Java\\ahorcadoGame\\src\\ahorcadogame\\palabrasdificil.txt";
                break;
        }
                
        // LECTURA DEL ARCHIVO
        
            FileReader lector = null;
            
            BufferedReader lectorBf = null;
            
            String linea;
            
            ArrayList<String> palabras = new ArrayList<>();
    
            try{
                File archivo = new File(rutaArchivo);
                lector = new FileReader(archivo);
                lectorBf = new BufferedReader(lector);
                while((linea=lectorBf.readLine()) != null){
                    palabras.add(linea);
                }
            }catch(FileNotFoundException ex){
                System.out.println("No sirve pa culo esto...");
            }
            return palabras;
        }
    
    
    public String eleccionPalabra(ArrayList<String>palabras){
        Random aleatorio = new Random();
        
        int posPalabra = aleatorio.nextInt(palabras.size()-1);
        
        String palabra = palabras.get(posPalabra);
        
        return palabra;
    }

    
}
