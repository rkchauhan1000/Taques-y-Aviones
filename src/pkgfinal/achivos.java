
package pkgfinal;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class achivos {
    String cadena;
    Reportes ar = new Reportes();
    
    private String src;
    
     public achivos(String sr) {
        try {
            src = sr;
            setHtml();
        } catch (IOException ex) {
            Logger.getLogger(achivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void setHtml() throws IOException{
        File htmlJugadores = new File("report_Jugadores.html");
        
        try{
           FileWriter jugadores= new FileWriter(htmlJugadores);
           BufferedWriter bw = new BufferedWriter(jugadores);
          String salida = " <caption>Lista hola</caption> \n<tr >";
        salida+="<th>No.</th>";
        salida+="<th>Nombre</th>";
        salida+="<th>Vehiculos</th>";
        salida+="<th>Falto</th>";
        salida+="</tr>\n";
        bw.write(salida);
        bw.newLine();
        String mas = "<tr class=\n true correctwrong\n>";
            mas+="<td>201733163</td>";
            mas+="<td>Yefer Alvarado</td>";
            mas+="<td>100</td>";
            mas+="<td>NO</td>";
        salida +="</tr>\n";
           bw.write(mas);
           bw.newLine();
           
           bw.close();
           jugadores.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            //return true;
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
     
     
    public boolean writeTxtFile(String nombre,String texto, boolean sobreescribir){
        File mf = new File(src + nombre);
        PrintWriter pw = null;

        try {
            //FileOutputStream modo -> append -> true
            pw = new PrintWriter(new DataOutputStream(new FileOutputStream(mf, sobreescribir)));
            pw.print(texto);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return true;
        } finally {
            pw.close();
        }

        return false;
    }

    public String readTxtFile(String nombre){
        String salida = "";
        File f;
        BufferedReader bf = null;
        String cadena;
        f = new File(src + nombre);
        if (f.exists()) {
            try {
                bf = new BufferedReader(new FileReader(f));
                while ((cadena = bf.readLine()) != null)
                    salida +=cadena+"\n";
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
            finally {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else
            return null;
        return salida;
    }




/*
    public boolean writeSerializationList(ArrayList<persona> t, String nombre, JTextField tex){
        try {
            FileOutputStream fos = new FileOutputStream(src+nombre);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.close();
            fos.close();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            return true;
        }
        tex.setText("");
        nombre = "";

        return false;
    }

    public ArrayList readSerializationList(String nombre){
        ArrayList<persona> personas = new ArrayList<>();

        try
        {
            FileInputStream fis = new FileInputStream(src+nombre);
            ObjectInputStream ois = new ObjectInputStream(fis);

            personas = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }

        return personas;

    }





    public void writeSerialization(persona p,String nombre) throws FileNotFoundException {
        ObjectOutputStream tmp = null;
        try {
            tmp = new ObjectOutputStream
                        (new FileOutputStream(src+nombre+".bin"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            tmp.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                tmp.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public persona readSerialization(String nombre) throws IOException, ClassNotFoundException {
        ObjectInputStream tm = new
                ObjectInputStream(new FileInputStream(src+nombre+".bin"));
        persona tmp = (persona)tm.readObject();
        return tmp;

    }
*/
}
