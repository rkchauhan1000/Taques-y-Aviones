
package pkgfinal;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Tanque extends Vehiculos {


    //Constructor
    public Tanque(){
        nivel=1;
        ide = 8;
    }
    //Para crear un vehiculo es necesario asignarle un nombre
    @Override
    public void nick_name(String nick){
        ///Pregunta el nombres y el usuario le asigna
        System.out.println("Que nickname deseas asignarle");
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
        ataque= 8+2*nivel+aumentoT;
    }
    //Punteria inicial mas el aumento define la probabilidad que se tiene de acertar
    @Override
    public void cantidad_Punteria(){
        punteria= 59.5+0.5*nivel+aumentoP;
    }
    //defensa que tiene el vehiculo este es ek porcentaje para reducir la posibilidad de que el enemigo no haga da;o
    @Override
    public void cantidad_Defensa(){
        defensa=5+nivel;
    }
    //Atrivuto especial que tiene cada enemigo de hacer danyo consume  de puntos de poder
    @Override
    public void movimiento_especial(){
        movesp=2*ataque+aumentoD;
        PP= PP-4;
    }
    // los datos del vehiculo
    @Override
    public String verDatos(){
        return "Ataque: "+ataque+"\nDefensa: "+defensa+"\nPunteria: "+punteria;
    }
    //Analiza la ecperiencia que tiene el vehiculo para si subirle de nivel y aumentar sus atributos
    @Override
    public void subida(){
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
        
            //tanque
            if(icono==1){
                vehh=new ImageIcon("src/imagen/Tanques/tanque1.jpg");
            }else if(icono==2){
                vehh=new ImageIcon("src/imagen/Tanques/tanque2.jpg");
            }else if(icono==3){
                vehh=new ImageIcon("src/imagen/Tanques/tanque3.jpg");
            }else if(icono==4){
                vehh=new ImageIcon("src/imagen/Tanques/tanque4.jpg");
            }else if(icono==5){
                vehh=new ImageIcon("src/imagen/Tanques/tanque5.jpg");
            }else if(icono==6){
                vehh=new ImageIcon("src/imagen/Tanques/tanque6.png");
            }else {
                vehh=new ImageIcon("src/imagen/Tanques/tanque7.jpg");
            } 
          
            veht = new ImageIcon(vehh.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));
    }

}
