
package pkgfinal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pkgfinal.Persona;
public class Principal extends javax.swing.JFrame {
    
    Inicio v = new Inicio();
    //Tablero v1 = new Tablero();
    ventanaingresos v2 = new ventanaingresos();
    Reportes v3 = new Reportes();
    nuevoVehiculo v4 = new nuevoVehiculo();
    seleVehiculos v5 = new seleVehiculos();
    Tienda v6 = new Tienda();
    
    int j1;
    int j2;
    int vv;

    public Principal() {
        //v6.setVisible(true);
        j1=0;
        initComponents();
        setLayout(null);
        this.setLocationRelativeTo(null);
        //setSize(getToolkit().getScreenSize());
        
        
        //jPanel1.setSize(getWidth(),getHeight());
        //jLabel1.setSize(getWidth(),getHeight());
        ImageIcon pri = new ImageIcon("src/imagen/pantalla.jpg");
        Icon iconopri = new ImageIcon(pri.getImage().getScaledInstance(getWidth(),getHeight(),Image.SCALE_SMOOTH));
        jLabel1.setIcon(iconopri);
        
        v2.jButton1.addActionListener((e) -> {
            v3.setNombres(v2.jTextField2.getText());
            v2.setVisible(false);
            v2.limpiar();
        });
        //jMenuBar1.
        v4.jButton9.addActionListener((ActionEvent ec) -> {
            System.out.println("entra jajaja");
        v3.usuario.get(j1).nuevoVehiculo(v4.tp,v4.mg,v4.jTextField1.getText());
        v3.usuario.get(j1).vehiculo.get(vv).arma.add(v3.todasArmas.get(Integer.parseInt(v4.jTextField2.getText())-1));
        v3.usuario.get(j1).vehiculo.get(vv).setObjetos(v3.todasArmas.get(Integer.parseInt(v4.jTextField2.getText())-1).aumento_ataque, 0,v3.todasArmas.get(Integer.parseInt(v4.jTextField2.getText())-1).aumento_defensa, 0, 0);
        v3.usuario.get(j1).verVeh();
        v4.setVisible(false);
        vv++;
        v4.repaint();
        v4.jTextField1.setText("");
        v4.jTextField2.setText("");
        });
        
        v.jButton1.addActionListener((el) -> {
                setVisible(true);
                v.setVisible(false);
        });
        v.jButton2.addActionListener((en) -> {
               System.exit(0);
        });
        treArmas();
        
    }
    private void treArmas(){
        v4.listarArmas(v3.todasArmas.get(0).num, v3.todasArmas.get(0).nombre, v3.todasArmas.get(0).aumento_ataque,v3.todasArmas.get(0).aumento_defensa);
        v4.listarArmas(v3.todasArmas.get(1).num, v3.todasArmas.get(1).nombre, v3.todasArmas.get(1).aumento_ataque,v3.todasArmas.get(1).aumento_defensa);
        v4.listarArmas(v3.todasArmas.get(2).num, v3.todasArmas.get(2).nombre, v3.todasArmas.get(2).aumento_ataque,v3.todasArmas.get(2).aumento_defensa);
    }
    private class accion implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent click){
 
        Escenario escena =new Escenario();
        escena.Escena.setVisible(true);
    }
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Kalimati", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("NUEVO JUGADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(740, 140, 220, 50);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Kalimati", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("BATALLA");
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 150, 240, 50);

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Kalimati", 2, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("TIENDA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 220, 220, 50);

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setFont(new java.awt.Font("Kalimati", 2, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("VEHICULOS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(70, 230, 240, 50);

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setFont(new java.awt.Font("Kalimati", 2, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("ARMAS");
        jPanel1.add(jButton5);
        jButton5.setBounds(70, 310, 240, 50);

        jButton6.setBackground(new java.awt.Color(153, 255, 153));
        jButton6.setFont(new java.awt.Font("Kalimati", 2, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText("REPORETES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(740, 300, 220, 50);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 780);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 780);

        jMenu1.setText("Cambir de Usuario");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        v2.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        v6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        v3.verificacion();
        if(v3.existe==true){
            v4.setVisible(true);
        }else{
            v2.setVisible(true);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        v3.removerTabla();
        v3.verNombre();
        v3.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
