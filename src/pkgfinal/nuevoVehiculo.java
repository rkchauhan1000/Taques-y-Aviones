
package pkgfinal;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class nuevoVehiculo extends javax.swing.JFrame {

    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;
    ImageIcon icon5;
    ImageIcon icon6;
    Icon img1;
    Icon img2;
    Icon img3;
    Icon img4;
    Icon img5;
    Icon img6;
    
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter<TableModel> name = new TableRowSorter<TableModel>(modelo);
    int sel;
    
    int tp;
    int mg;

    public nuevoVehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modelo.addColumn("No.");
        modelo.addColumn("Nombre");
        modelo.addColumn("Danio");
        modelo.addColumn("Defensa");
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton9.setVisible(false);
        
        jButton1.addActionListener((e) -> {
            jButton9.setVisible(true);
            mg=1;
        });
        jButton2.addActionListener((e) -> {
            jButton9.setVisible(true);
            mg=2;
        });
        jButton3.addActionListener((e) -> {
            jButton9.setVisible(true);
            mg=3;
        });
        jButton4.addActionListener((e) -> {
            jButton9.setVisible(true);
            mg=4;
        });
        jButton5.addActionListener((e) -> {
            jButton9.setVisible(true);
            mg=5;
        });
        jButton6.addActionListener((e) -> {
            jButton9.setVisible(true);
            mg=6;
        });
        jButton7.addActionListener((e) -> {
            mostrarIcono(1);
            tp=1;
            
        });
        jButton8.addActionListener((e) -> {
            mostrarIcono(2);
            tp=2;
        });
    }
    public void listarArmas(int pos, String nombre,int dani, int defensa){
        String [] elementos = new String[4];
        elementos[0]=Integer.toString(pos);
        elementos[1]=nombre;
        elementos[2]=Integer.toString(dani);
        elementos[3]=Integer.toString(defensa);
        modelo.addRow(elementos);
        jTable1.setModel(modelo);
    }
    
    public void mostrarIcono(int tipo){
        
        if(tipo==1){
            icon1= new ImageIcon("src/imagen/Aviones/Avion1.jpg");
            icon2= new ImageIcon("src/imagen/Aviones/Avion2.jpg");
            icon3= new ImageIcon("src/imagen/Aviones/Avion3.png");
            icon4= new ImageIcon("src/imagen/Aviones/Avion4.jpg");
            icon5= new ImageIcon("src/imagen/Aviones/Avion5.jpg");
            icon6= new ImageIcon("src/imagen/Aviones/Avion6.jpg");
            img1= new ImageIcon(icon1.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img2= new ImageIcon(icon2.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img3= new ImageIcon(icon3.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img4= new ImageIcon(icon4.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img5= new ImageIcon(icon5.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img6= new ImageIcon(icon6.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            jButton1.setIcon(img1);
            jButton2.setIcon(img2);
            jButton3.setIcon(img3);
            jButton4.setIcon(img4);
            jButton5.setIcon(img5);
            jButton6.setIcon(img6);
            
            label3.setText("Selecciona tu Avion");
                        
        }else if(tipo==2){
            icon1= new ImageIcon("src/imagen/Tanques/tanque1.jpg");
            icon2= new ImageIcon("src/imagen/Tanques/tanque2.jpg");
            icon3= new ImageIcon("src/imagen/Tanques/tanque3.jpg");
            icon4= new ImageIcon("src/imagen/Tanques/tanque4.jpg");
            icon5= new ImageIcon("src/imagen/Tanques/tanque5.jpg");
            icon6= new ImageIcon("src/imagen/Tanques/tanque6.png");
            img1= new ImageIcon(icon1.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img2= new ImageIcon(icon2.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img3= new ImageIcon(icon3.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img4= new ImageIcon(icon4.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img5= new ImageIcon(icon5.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            img6= new ImageIcon(icon6.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_SMOOTH));
            jButton1.setIcon(img1);
            jButton2.setIcon(img2);
            jButton3.setIcon(img3);
            jButton4.setIcon(img4);
            jButton5.setIcon(img5);
            jButton6.setIcon(img6);
            label3.setText("Selecciona tu Tanque");
        }else{
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
        }
        
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        //jButton9.setVisible(true);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jButton9 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 444));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 110, 80));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 100, 80));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 110, 80));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 80));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 110, 80));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 100, 80));

        label1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        label1.setText("Nombre");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 290, 40));

        jButton7.setText("Avion");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 80, 40));

        jButton8.setText("Tanque");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, 40));

        label2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        label2.setText("Tipo de Vehiculo");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, 40));

        jButton9.setText("Crear");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 180, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                implementar(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 300, 70));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 40, -1));

        jLabel1.setText("Arma Seleccionada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void implementar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_implementar
        // TODO add your handling code here:
        jTextField2.setText((String) jTable1.getValueAt( jTable1.getSelectedRow(), 0));
    }//GEN-LAST:event_implementar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
