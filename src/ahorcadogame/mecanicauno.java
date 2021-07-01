
package ahorcadogame;




public class mecanicauno {
    
    
    private final char[] caracteresPalabra;

    public mecanicauno(char[] caracteresPalabra) {
        this.caracteresPalabra = caracteresPalabra;
    }
    
    public char[] creacionArrayGuiones(){
        char[] palabraUsuario = new char[caracteresPalabra.length];
        
        for(int i = 0; i < palabraUsuario.length;i++){
            palabraUsuario[i] = '_';
        }
        
        return palabraUsuario;
    }
    
    
    public boolean recibirCaracter(char[] palabraUsuario, char caracterUsuario){
        
        boolean existe = false;
        
        for(int letra = 0; letra < palabraUsuario.length; letra++){
            if(caracterUsuario == caracteresPalabra[letra]){
                palabraUsuario[letra] = caracterUsuario;
                existe = true;
            }
        }
        
        
        return existe;
    }
    
    
    public void impresionPalabra(char[] palabraUsuario){
        for(int letra = 0; letra < palabraUsuario.length;letra++){
            System.out.print(palabraUsuario[letra]);
            System.out.print(" ");
        }
    }
    
    public boolean comprobarVictoria(char[] palabraUsuario){
        boolean victoria = false;
        int coincidencias = 0;
        for(int i = 0; i < caracteresPalabra.length; i++){
            if(palabraUsuario[i] == caracteresPalabra[i]){
                coincidencias++;
            }
        }
        
        if(coincidencias == caracteresPalabra.length){
            victoria = true;
        }
    
        return victoria;
    }
    
    
    
}
