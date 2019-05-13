
package pkgfinal;

import java.io.Serializable;


public class partidas implements Serializable{
    
    String escenario;
    String fecha;
    String resul;
    boolean resultado;
    public partidas(String escenario, String fecha, boolean resultaados){
        resultado();
        this.escenario=escenario;
        this.fecha=fecha;
    }

    public void resultado(){
        if(resultado==true){
            resul="Gano";
        }else{
            resul="Perdio";
        }
    }
    
    
}
