
package pkgfinal;


public class boton{
    

    int numAtaques;
    boolean ataquescero;
    
    public boton(){
        numAtaques =3;
    }
    private void verificacion(){
        
        if(numAtaques==0){
            ataquescero=true;
        }else{
            ataquescero=false;
        }
    }
            

}
