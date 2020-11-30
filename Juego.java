
public class Juego
{
    public boolean inicio = true;
    public int sum;
    public int punto;
        
    public int iniciar(Dado dado1,Dado dado2)           
    {
        sum = dado1.valor() + dado2.valor();
                
        if(inicio)
        {
            inicio = false;
            punto = sum;
            
            if(sum == 2 || sum == 3 || sum == 12)
                {
                    return 0;
                }
            
            else if(sum == 7 || sum == 11)
            {
                return 1;
            }
        }else
        {
            if(sum == 7)
            {
                return 0;
            }else
            {
                if(sum == punto)
                {
                    return 1;
                }
            }
        }   
       return 3; 
    }
}
    
