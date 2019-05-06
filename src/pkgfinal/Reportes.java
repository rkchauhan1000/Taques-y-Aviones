
package pkgfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reportes extends javax.swing.JFrame {

    
    Persona user;
    ArrayList<Persona> usuario= new ArrayList<>();
    boolean existe;
            
    
    public Reportes() {
        initComponents();
    }
    
    public void NuevoUsuario(Persona p){
        usuario.add(p);
        verNombre();
    }
    public void setNombres(String name){
        user = new Persona(name);
        NuevoUsuario(user);
    }
    private void verNombre (){
        for(int i = 0; i<usuario.size();i++){
            System.out.println(i+": "+usuario.get(i).nombre);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
