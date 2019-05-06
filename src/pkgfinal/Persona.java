
package pkgfinal;


public class Persona {
    
    String nombre;
    int oro;
    int numVehiculos;
    //Arraylis de vehiculos
    
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
}

