
package pkgfinal;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Persona {
    
    String nombre;
    int oro;
    int numVehiculos;
    Vehiculos vehTanque = new Tanque();
    Vehiculos vehAvion  = new Avion();
    int tipoveh;
    int tipoIcono;
    //Arraylis de vehiculos
    ArrayList<Vehiculos> vehiculo= new ArrayList<>();
    //Arraylist de objetos
    
            
    public Persona(String Nombre){
        nombre=Nombre;
        oro=50;
        numVehiculos=0;

    }
    public int Oro(int aume){
        oro=oro+aume;
        System.out.print("Oro: ");
        return oro;
    }
    public void Compra(int precio){
        oro = oro-precio;
    }
    public void Ver(){
        if (nombre==""){
            System.out.println("Debe de ingresar su nombre");
            //nombre = s.nextLine();
            System.out.println("Tu nombre a sido agregado");
        }else {
            System.out.println("Ya tines un nombre agregado");
        }
    }
    public void nuevoVehiculo(int tipo,int icono, String nick){
        
        if(tipo==1){
            //Avion
            vehAvion.nick_name(nick);
            vehAvion.imagen(icono);
            vehiculo.add(vehAvion);
            
        }else{
            //tanque
            vehTanque.nick_name(nick);
            vehTanque.imagen(icono);
            vehiculo.add(vehTanque);
            
        }
        numVehiculos++;
        
    }
}

