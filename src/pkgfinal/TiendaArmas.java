
package pkgfinal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TiendaArmas extends javax.swing.JFrame {

    DefaultTableModel modelo1 = new DefaultTableModel();
    TableRowSorter<TableModel> name1 = new TableRowSorter<TableModel>(modelo1);
    
    int tipo;
    String precio;
        ArrayList<Armas> TiendaARMAS= new ArrayList<>();
    
    public TiendaArmas() {
        initComponents();
        this.setLayout(null);
        modelo1.addColumn("No.");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Precio");
        TiendaARMAS.add(new nuevaArma(20, 10, 0, "RPM",50));
        TiendaARMAS.add(new nuevaArma(22, 10, 0, "Storm2",55));
        TiendaARMAS.add(new nuevaArma(25, 8, 0, "Petrus",58));
        lista();
    }
        
    public void lista(){
        removerTabla();
        for(int i=0; i<TiendaARMAS.size();i++){
            setlista(i+1, TiendaARMAS.get(i).nombre, TiendaARMAS.get(i).precio);
        }
    }
    public void removerTabla(){
        //System.out.println(jTable1.getRowCount());
        for(int i=0;i<jTable1.getRowCount();i++){
            modelo1.removeRow(i);
            i-=1;
        }
    }
    private void setlista(int n, String nombre,  int Precio){
        Object [] elementos = new Object[3];
        elementos[0]=n;
        elementos[1]=nombre;
        elementos[2]=Precio;
        modelo1.addRow(elementos);
        jTable1.setModel(modelo1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccion(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 180));

        jButton1.setText("Comprar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));

        jLabel1.setText("Precio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 30));

        jButton2.setText("Regresar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel2.setText("Comprar Arma");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccion
        // TODO add your handling code here:
        tipo=(int) jTable1.getValueAt( jTable1.getSelectedRow(), 0);
        tipo=tipo-1;
        precio=Integer.toString((int) jTable1.getValueAt( jTable1.getSelectedRow(), 2));
        jTextField1.setText(precio);
    }//GEN-LAST:event_seleccion


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
