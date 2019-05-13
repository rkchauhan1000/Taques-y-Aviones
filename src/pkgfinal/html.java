
package pkgfinal;

import java.io.Serializable;


public class html implements Serializable{
    
    int No;
    String usuarios;
    String vehiculos;
    String salida;
    String filaText;
    String cola;
    
    public html(){

    }

    public void generarEncabezado(String titulo){
        salida = "<html>\n";
        salida+="<head><title>"+titulo+"</title></head>\n"+"<body>\n";
        salida+="<h1>"+titulo+"</h1>\n"+"<table>\n";
        salida+="<tr>\n";

    }
    public void pestania(String p1,String p2,String p3){
        salida+="<td><strong>"+p1+"</strong></td>\n";
        salida+="<td><strong>"+p2+"</strong></td>\n";
        salida+="<td><strong>"+p3+"</strong></td>\n";
        salida+="</tr>";
        
    }

    public void generarFilaHTML(String p1,String p2,String p3){
        filaText="";
        filaText="\n<tr>\n";
        filaText+="<td>"+p1+"</td>\n";
        filaText+="<td>"+p2+"</td>\n";
        filaText+="<td>"+p3+"</td>\n";
        filaText+="</tr>\n";
    }
    public void generarcola(){
        cola="\n</table>\n";
        cola+="</body>\n";
        cola+="</html>\n";
        
    }
}
