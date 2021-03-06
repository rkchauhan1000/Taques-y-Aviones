
package pkgfinal;

import java.io.Serializable;
import java.util.ArrayList;


public class Persona implements Serializable{
    
    String nombre;
    int oro;
    int numVehiculos;
    Vehiculos vehTanque = null;
    Vehiculos vehAvion  = null;
    int tipoIcono;
    int posicion=1;
    //Arraylis de vehiculos
    ArrayList<Vehiculos> vehiculo= new ArrayList<>();
    //Arraylist de objetos
    ArrayList<Object> compras = new ArrayList<>();
    
    ArrayList<partidas> bat = new ArrayList<>();
     /**Ccostructor
      * 
      * @param Nombre 
      */       
    public Persona(String Nombre){
        nombre=Nombre;
        oro=50;
        numVehiculos=0;

    }
    /**aumenta el oro
     * 
     * @param aume
     * @return 
     */
    public int Oro(int aume){
        oro=oro+aume;
        System.out.print("Oro: ");
        return oro;
    }
    /**reduce el oro
     * 
     * @param precio 
     */
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
    /**Crea un nuevo vehiculo
     * 
     * @param tipo
     * @param icono
     * @param nick 
     */
    public void nuevoVehiculo(int tipo,int icono, String nick){
        
        if(tipo==1){
            //Avion
            vehAvion  = new Avion();
            vehAvion.nick_name(nick);
            vehAvion.imagen(icono);
            vehiculo.add(vehAvion);
            
        }else if(tipo==2){
            //tanque
            vehTanque = new Tanque();
            vehTanque.nick_name(nick);
            vehTanque.imagen(icono);
            vehiculo.add(vehTanque);  
        }else{
            
        }
        numVehiculos++;
        
    }
    /**MUestra los vehiculos en la terminal
     * 
     */
    public void verVeh(){
        System.out.println("vehiculos");
        for(int i = 0; i<vehiculo.size();i++){
            System.out.println(i+": "+vehiculo.get(i).nickName);
        }
    }
    public void setRes(String escenario, String fecha, boolean resultaados){
        bat.add(new partidas(escenario,fecha,resultaados));   
    }
}

