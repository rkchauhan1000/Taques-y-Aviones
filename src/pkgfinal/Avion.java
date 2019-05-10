
package pkgfinal;
//Vehiculo de Tipo avion que hereda de Vehiculos

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Avion extends Vehiculos {



    //Constructor
    public Avion(){
        nivel=1;
        ide = 9;
    }
    //Para crear un vehiculo es necesario asignarle un nombre
    @Override
    public void nick_name(String nick){
        ///Pregunta el nombres y el usuario le asigna
        nickName= nick;
    }
    //Vida inicial del vehiculo tipo avion
    @Override
    public void hp(){
        HP=50*nivel;
    }
    //Puntos de poder estos son usados para los ataques especiales
    @Override
    public void pp(){
        PP=3+2*nivel;
    }
    //Cuando gana el jugador se genera una experiencia aleatoria la cual por esta se define el nivel que tenga
    @Override
    public void setExperiencia(){
        experiencia1=Math.random()*50*nivel;
        experiencia=experiencia+experiencia1;
        subida();
    }
    //el atque inicual mas el aumento que le proporcionaa el arma . es el danyo que hace el vehiculo
    @Override
    public void cantidad_Ataque(){
        ataque=5+2*nivel+aumentoT;
    }
    //Punteria inicial mas el aumento define la probabilidad que se tiene de acertar
    @Override
    public void cantidad_Punteria(){
        punteria=69.5+05*nivel+aumentoP;
    }
    //defensa que tiene el vehiculo este es ek porcentaje para reducir la posibilidad de que el enemigo no haga da;o
    @Override
    public void cantidad_Defensa(){
        defensa=2+nivel+aumentoD;
    }
    //Atrivuto especial que tiene cada enemigo de hacer danyo consume  de puntos de poder
    @Override
    public void movimiento_especial(){

        movesp=ataque/2;
        defensa+=5;
        PP= PP-4;
    }
    // los datos del vehiculo
    public String verDatos(){
        return "Ataque: "+ataque+"\nDefensa: "+defensa+"\nPunteria: "+punteria;
    }
    //Analiza la ecperiencia que tiene el vehiculo para si subirle de nivel y aumentar sus atributos
    @Override
    public void subida(){
        // si es mayor a la eperiencia maxima sube de lo contrario no
        if (experiencia>(100*nivel)){
            System.out.println("Acabas de subir de nivel");
            nivel++;
            System.out.println("Nievel: "+nivel);
        }else {

        }
    }
        
    @Override
    public void setDano(int cantidad){
        HP=HP-cantidad;
        
    }
    @Override
    public void setObjetos(int ataque, int punteria, int defensa, int hp,int pp){
        this.ataque = this.ataque + ataque;
        this.punteria = this.punteria + punteria;
        this.defensa = this.defensa + defensa;
        HP = HP + hp;
        PP = PP+pp;
    }
    @Override
    public void imagen(int icono){
            
            //Avion
            if(icono==1){
                vehh=new ImageIcon("src/imagen/Aviones/Avion1.jpg");
            }else if(icono==2){
                vehh=new ImageIcon("src/imagen/Aviones/Avion2.jpg");
            }else if(icono==3){
                vehh=new ImageIcon("src/imagen/Aviones/Avion3.png");
            }else if(icono==4){
                vehh=new ImageIcon("src/imagen/Aviones/Avion4.jpg");
            }else if(icono==5){
                vehh=new ImageIcon("src/imagen/Aviones/Avion5.jpg");
            }else if(icono==6){
                vehh=new ImageIcon("src/imagen/Aviones/Avion6.jpg");
            }else {
                vehh=new ImageIcon("src/imagen/Aviones/Avion7.jpg");
            }
            veht = new ImageIcon(vehh.getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH));
              
    }
}