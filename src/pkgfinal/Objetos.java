
package pkgfinal;

public class Objetos {
    
    int tipo;
    int precio;
    String nombre;
    
    int ataque, defensa, hp,pp;
    
    public Objetos(int tipo, int precio, String Nombre){
        this.tipo=tipo;
        this.precio=precio;
        this.nombre=Nombre;
    }
    
    public void setCantidades(int ataque, int defensa, int hp,int pp){
        this.ataque=ataque;
        this.defensa=defensa;
        this.hp=hp;
        this.pp=pp;
    }
    
}

