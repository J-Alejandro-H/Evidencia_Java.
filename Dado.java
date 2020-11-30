import java.util.Random;

public class Dado{
    private int resultado;
    
    public Dado (){
        lanzarDado();
        }
    
    public void lanzarDado(){
        Random ran = new Random();
        resultado = ran.nextInt(6) + 1;
    }
     public int valor(){
         return resultado;
     }
}
