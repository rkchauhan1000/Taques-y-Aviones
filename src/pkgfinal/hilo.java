
package pkgfinal;
        
import java.io.Serializable;

public class hilo implements Runnable, Serializable{
    
    private Tablero tab = new Tablero();
    
    public void seetTest(Tablero tab){
        this.tab=tab;
    }
    
    @Override
    public void run(){
        
    }
}
