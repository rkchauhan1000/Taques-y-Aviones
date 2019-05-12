
package pkgfinal;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Vehiculos {
   
    ArrayList<Armas> arma = new ArrayList<>();
    
    char simbolo;
    int nivel;
    double experiencia1;
    double experiencia;
    double ataque;
    double defensa;
    double punteria;
    double movesp;
    int ide;
    String ruta;

    double aumentoT;
    double aumentoP;
    double aumentoD;
    int HP;
    int PP;
    String nickName;
    
    ImageIcon vehh;
    Icon veht;

    //Metodos abstractos
    public abstract void nick_name(String nick);
    public abstract void cantidad_Ataque();
    public abstract void cantidad_Punteria();
    public abstract void cantidad_Defensa();
    public abstract void movimiento_especial();

    public abstract String verDatos();
    public abstract void hp();
    public abstract void pp();
    public abstract void setExperiencia();
    public abstract void subida();
    
    public abstract void setDano(int cantidad);
    public abstract void setObjetos(int ataque, int punteria, int defensa, int hp,int pp);
    public abstract void imagen(int icono);
}
