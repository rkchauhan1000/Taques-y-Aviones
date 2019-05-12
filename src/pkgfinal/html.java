
package pkgfinal;


public class html {
    
    String usuarios;
    String vehiculos;
    
    
    
    public static String generarEncabezado(String titulo){
        String salida = " <caption>Listado de estudiantes ingresados</caption> \n<tr >";
        salida+="<th>Carné</th>";
        salida+="<th>Nombres</th>";
        salida+="<th>Zona</th>";
        salida+="<th>Falto</th>";
        salida+="</tr>\n";
        return salida;
    }

    public String generarFilaHTML(){
        String salida = "<tr class=\""+(posibilidadGanar?"correct":"wrong")+"\">";
            salida+="<td>"+carne+"</td>";
            salida+="<td>"+nombre +" "+apellido+"</td>";
            salida+="<td>"+zona+"</td>";
            salida+="<td>"+falta+"</td>";
        salida +="</tr>\n";
        return  salida;
    }
}
