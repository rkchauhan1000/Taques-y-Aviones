
package pkgfinal;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Enemigo {

    int vida;
    int fila;
    int columna;
    int danyo;
    int probabilidad;
    int Aleatorio;
    
    ImageIcon vehh;
    Icon veht;

    //Constructor
    public Enemigo(int vida,int danio){
        //Se inicializa los atributos que tien cada enemigo
        this.vida=vida;
        danyo=danio;
        probabilidad=100;
    }

    //Genera la cordenada que tendra el enemigo
    public void Cordenada(){
        fila= (int) (Math.random()*5)+1;
        columna= (int) (Math.random()*5)+1;
    }
    //Genera el ramdom que se comparara con el acierto
    public void AleAtanque(){
        Aleatorio = (int) (Math.random()*probabilidad);

       /* if (Aleatorio<probabilidad-defesaa){

        }*/
    }
    public void setDano(int cantidad){
        vida=vida-cantidad;
    }
        
        
}