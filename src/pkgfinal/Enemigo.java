
package pkgfinal;

public class Enemigo {

    int vida;
    int fila;
    int columna;
    int danyo;
    int probabilidad;
    int Aleatorio;

    //Constructor
    public Enemigo(){
        //Se inicializa los atributos que tien cada enemigo
        vida=5;
        danyo=5;
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
}