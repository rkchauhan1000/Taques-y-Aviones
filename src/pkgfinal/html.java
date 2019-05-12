
package pkgfinal;


public class html {
    
    String usuarios;
    String vehiculos;
    
    
    private String nombre;
    private String apellido;
    private int carne;
    private int zona;
    private int falta;
    private static final int proyecto = 40;
    private boolean posibilidadGanar;



    public html(String nom, String per, int carn, int zon){
        nombre = nom;
        apellido = per;
        carne =carn;
        zona = zon;
        posibilidadGanar = true;
        if (zona >60)
            falta = 0;
        else{
            falta = 61 - zona;
            if (falta > proyecto)
                posibilidadGanar = false;
        }


    }

    public static String generarEncabezado(String titulo){
        String salida = " <caption>Lista"+titulo+"</caption> \n<tr >";
        salida+="<th>No.</th>";
        salida+="<th>Nombre</th>";
        salida+="<th>Vehiculos</th>";
        //salida+="<th>Falto</th>";
        salida+="</tr>\n";
        return salida;
    }

    public String generarFilaHTML(){
        String salida = "<tr class=\""+(posibilidadGanar?"correct":"wrong")+"\">";
            salida+="<td>"+carne+"</td>";
            salida+="<td>"+nombre +" "+apellido+"</td>";
            salida+="<td>"+zona+"</td>";
            //salida+="<td>"+falta+"</td>";
        salida +="</tr>\n";
        return  salida;
    }
}
