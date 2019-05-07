
package pkgfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Reportes extends javax.swing.JFrame {

    DefaultTableModel modelo1 = new DefaultTableModel();
    TableRowSorter<TableModel> name1 = new TableRowSorter<TableModel>(modelo1);
    DefaultTableModel modelo2 = new DefaultTableModel();
    TableRowSorter<TableModel> name2 = new TableRowSorter<TableModel>(modelo2);
    
    Persona user;
    ArrayList<Persona> usuario= new ArrayList<>();
    boolean existe;
    boolean existeVehiculos;
            
    
    public Reportes() {
        initComponents();
        modelo1.addColumn("Nombre");
        
        modelo2.addColumn("Usuario");
        modelo2.addColumn("Nick");
        modelo2.addColumn("Partidas");
        modelo2.addColumn("Ganados");
        modelo2.addColumn("Destruidos");
        
    }
    
    public void NuevoUsuario(Persona p){
        usuario.add(p);
        removerTabla();
        verNombre();
        
        
    }
    public void setNombres(String name){
        user = new Persona(name);
        NuevoUsuario(user);
    }
    private void verNombre (){
        for(int i = 0; i<usuario.size();i++){
            //System.out.println(i+": "+usuario.get(i).nombre);
            agregarNombre(usuario.get(i).nombre);
        }
    }
    
    public void verificacion(){
        if(usuario.size()==0){
            JOptionPane.showMessageDialog(null, "No Existe Ningun Usuario");
            existe = false;
        }else{
            existe = true;
        }
    }
    public void verificacionVehiculos(int j){
        if(usuario.get(j).vehiculo.size()==0){
            JOptionPane.showMessageDialog(null, "No Existe Ningun vehiculo, Necesitas crear 3 Vehiculso");
            existeVehiculos = false;
        }else if(usuario.get(j).vehiculo.size()==1){
            JOptionPane.showMessageDialog(null, "Necesitas crear 2 Vehiculso mas");
            existeVehiculos = false;
        }else if(usuario.get(j).vehiculo.size()==2){
            JOptionPane.showMessageDialog(null, "Necesitas crear 1 Vehiculso mas");
            existeVehiculos = false;
        }else{
            existeVehiculos = true;
        }
    }
    public void agregarNombre(String Nombre){
        String [] elementos = new String[1];
        elementos[0]=Nombre;
        modelo1.addRow(elementos);
        jTable1.setModel(modelo1);
    }
    public void agregarTodo(String Nombre,String Nick,String partidas, String ganados, String destruidos){
        String [] elementos = new String[5];
        elementos[0]=Nombre;
        elementos[1]=Nick;
        elementos[2]=partidas;
        elementos[3]= ganados;
        elementos[4]=  destruidos;
        
        modelo2.addRow(elementos);
        jTable1.setModel(modelo2);
    }
    private void removerTabla(){
        System.out.println(jTable1.getRowCount());
        for(int i=0;i<jTable1.getRowCount();i++){
            modelo1.removeRow(i);
            i-=1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
