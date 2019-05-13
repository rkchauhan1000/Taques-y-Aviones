
package pkgfinal;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Tienda extends javax.swing.JFrame implements Serializable{

    Objetos [] suministro=new Objetos[4];
    TiendaVehiculos ti1= new TiendaVehiculos();
    TiendaArmas ti2 = new TiendaArmas();
    
    ImageIcon Reparador;
    Icon iconoReparador;
    ImageIcon Botiquin1;
    Icon iconoBotiquin1;
    ImageIcon Botiquin2;
    Icon iconoBotiquin2;
    ImageIcon boot;
    Icon iconoboot;
    
    int tipo;
    DefaultTableModel modelo2 = new DefaultTableModel();
    TableRowSorter<TableModel> name2 = new TableRowSorter<TableModel>(modelo2);
    
    public Tienda() {
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        //torre = new ImageIcon("src/imagen/tienda1.gif");
        //iconoTorre = new ImageIcon(torre.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
        //jLabel1.setIcon(iconoTorre);

        suministro[0]=new Objetos(1, 20, "Reparador");
        suministro[1]=new Objetos(2, 35, "BotiquinMax");
        suministro[2]=new Objetos(3, 15, "Botiquin");
        suministro[3]=new Objetos(4, 20, "Escudo");
        suministro[0].setCantidades(0, 0, 50, 5);
        suministro[1].setCantidades(0, 0, 70, 5);
        suministro[2].setCantidades(0, 0, 15, 5);
        suministro[3].setCantidades(0, 15, 0, 5);
        
        modelo2.addColumn("No.");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Danio");
        
        listArmasTienda();
        listVehiculosTienda();
        initComponents();
        
        ti1.jButton2.addActionListener((bn) -> {
            ti1.setVisible(false);
            this.setVisible(true);
        });
        ti2.jButton2.addActionListener((bn) -> {
            ti2.setVisible(false);
            this.setVisible(true);
        });
    }
    public void listVehiculosTienda(){
                //String [] elementos = new String[3];
        //elementos[0]=Integer.toString(ps);
        //elementos[1]=Nombre;
        //elementos[2]=Integer.toString(numve);
        //modelo1.addRow(elementos);
        //jTable1.setModel(modelo1);
    }
    public void listArmasTienda(){
                //String [] elementos = new String[3];
        //elementos[0]=Integer.toString(ps);
        //elementos[1]=Nombre;
        //elementos[2]=Integer.toString(numve);
        //modelo1.addRow(elementos);
        //jTable1.setModel(modelo2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Reparador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 70));

        jButton2.setText("BotiquinMax");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 70));

        jButton3.setText("Escudo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 110, 70));

        jButton4.setText("Botiquin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, 70));

        jButton5.setText("Armas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jButton6.setText("Vehiculos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jButton7.setText("Comprar");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel2.setText("PRECIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tienda1.gif"))); // NOI18N
        jLabel1.setInheritsPopupMenu(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tipo=0;
        jTextField1.setText(Integer.toString(suministro[tipo].precio));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tipo=1;
        jTextField1.setText(Integer.toString(suministro[tipo].precio));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tipo=3;
        jTextField1.setText(Integer.toString(suministro[tipo].precio));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        tipo=2;
        jTextField1.setText(Integer.toString(suministro[tipo].precio));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ti2.lista();
        ti2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ti1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
