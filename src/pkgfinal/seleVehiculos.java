
package pkgfinal;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class seleVehiculos extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter<TableModel> name = new TableRowSorter<TableModel>(modelo);
    int sel;
    
    public seleVehiculos() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo.addColumn("No.");
        modelo.addColumn("NickName");
    }
    public void listarVehiculos(int pos, String nombre){
        String [] elementos = new String[2];
        elementos[0]=Integer.toString(pos);
        elementos[1]=nombre;
        
        modelo.addRow(elementos);
        jTable1.setModel(modelo);
    }
    
    public void removerTabla(){
        System.out.println(jTable1.getRowCount());
        for(int i=0;i<jTable1.getRowCount();i++){
            modelo.removeRow(i);
            i-=1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(102, 102, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agragar(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 278, 424));

        label1.setText("Selecciona tus tres vehiculos de batalla");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 30));

        label2.setText("Coloca la Posicion de tus vehiculos");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        label3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label3.setText("A");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label4.setText("B");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        label5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label5.setText("C");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 50, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 50, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 50, -1));

        jButton1.setText("Listo");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void agragar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agragar
        // TODO add your handling code here:
        if (sel==3) {
            jTextField1.setText((String) jTable1.getValueAt( jTable1.getSelectedRow(), 0));
        }else if(sel==2){
            jTextField2.setText((String) jTable1.getValueAt( jTable1.getSelectedRow(), 0));
        }else if(sel==1){
            jTextField3.setText((String) jTable1.getValueAt( jTable1.getSelectedRow(), 0));
        }
        sel--;
    }//GEN-LAST:event_agragar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables

}
