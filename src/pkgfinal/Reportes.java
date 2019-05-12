
package pkgfinal;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Reportes extends javax.swing.JFrame {

    DefaultTableModel modelo1 = new DefaultTableModel();
    TableRowSorter<TableModel> name1 = new TableRowSorter<TableModel>(modelo1);
    DefaultTableModel modelo2 = new DefaultTableModel();
    TableRowSorter<TableModel> name2 = new TableRowSorter<TableModel>(modelo2);
    DefaultTableModel modelo3 = new DefaultTableModel();
    TableRowSorter<TableModel> name3 = new TableRowSorter<TableModel>(modelo3);
    
    int pos;
    int nn;
    Persona user;
    ArrayList<Persona> usuario= new ArrayList<>();
    ArrayList<Armas> todasArmas = new ArrayList<>();
    
    Arma1 ar1= new Arma1();
    Arma2 ar2= new Arma2();
    Arma3 ar3= new Arma3();
    
    boolean existe;
    boolean existeVehiculos;
            
    
    public Reportes() {
        pos=1;
        initComponents();
        this.setLocationRelativeTo(null);
        
        todasArmas.add(ar1);
        todasArmas.add(ar2);
        todasArmas.add(ar3);
        
        modelo1.addColumn("No.");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("No. Vehiculos");
        
        modelo2.addColumn("No.");
        modelo2.addColumn("Usuario");
        modelo2.addColumn("Nick");
        modelo2.addColumn("Partidas");
        modelo2.addColumn("Ganados");
        modelo2.addColumn("Destruidos");
        
        modelo3.addColumn("No.");
        modelo3.addColumn("Nombre");
        modelo3.addColumn("Icono");
        
    }
    
    public void NuevoUsuario(Persona p){
        usuario.add(p);
        removerTabla();
        verNombre();
        pos++;  
    }
    public void setNombres(String name){
        user = new Persona(name);
        user.posicion=pos;
        NuevoUsuario(user);
    }
    public void verNombre (){
        for(int i = 0; i<usuario.size();i++){
            //System.out.println(i+": "+usuario.get(i).nombre);
            agregarNombre(usuario.get(i).posicion,usuario.get(i).nombre,usuario.get(i).numVehiculos);
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
    public void agregarNombre(int ps,String Nombre, int numve){
        String [] elementos = new String[3];
        elementos[0]=Integer.toString(ps);
        elementos[1]=Nombre;
        elementos[2]=Integer.toString(numve);
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
    public void removerTabla(){
        System.out.println(jTable1.getRowCount());
        for(int i=0;i<jTable1.getRowCount();i++){
            modelo1.removeRow(i);
            i-=1;
        }
    }
    public void agregarVehiculo(int n, String nombre,Icon s){
        Object [] elementos = new String[3];
        elementos[0]=Integer.toString(n);
        elementos[1]=nombre;
        elementos[2]= "Yefer";
        modelo3.addRow(elementos);
        jTable1.setModel(modelo3);
    }
    public void listarVehiculos(){
        nn=1;
        removerTabla();
        for(int i=0; i<usuario.size();i++){
            for(int j=0;j<usuario.get(i).vehiculo.size();j++){
                agregarVehiculo(nn, usuario.get(i).vehiculo.get(j).nickName, usuario.get(i).vehiculo.get(j).veht);
                nn++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 550));

        jButton1.setText("Vehiculos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listarVehiculos();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
