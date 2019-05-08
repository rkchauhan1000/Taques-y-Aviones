
package pkgfinal;

import com.sun.glass.events.MouseEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tablero extends javax.swing.JFrame {

    Principal p1 = new Principal();
    JButton tablero[][] = null;
    
    JFrame tamanyo= new JFrame();
    JPanel sobre = new JPanel();
    JButton tm1 = new JButton();
    JButton tm2 = new JButton();
    JButton tm3 = new JButton();
    JTextField titulo = new JTextField();
    
    int juego[][] = null;
    int largo;
    int alto;
    int pos1;
    int pos2;
    
    int dadode6;
    int dadode100;
    int dadode4;
    
    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        tamanyo.setSize(500,500);
        tamanyo.setDefaultCloseOperation(3); 
        sobre.setLayout(null);
        sobre.setSize(tamanyo.getWidth(), tamanyo.getHeight());
        tamanyo.add(sobre);
        tamanyo.setLocationRelativeTo(null);
        
        titulo.setSize(200, 35);
        titulo.setEditable(false);
        titulo.setText("Eleige el Tamaño del Tablero");
        titulo.setLocation(155, 5);
        tm1.setSize(100, 35);
        tm2.setSize(100, 35);
        tm3.setSize(100, 35);
        tm1.setLocation(200, 100-40);
        tm2.setLocation(200, 230-40);
        tm3.setLocation(200, 360-40);
        tm1.setText("4x4");
        tm2.setText("6x4");
        tm3.setText("8x9");
        
        sobre.add(titulo);
        sobre.add(tm1);
        sobre.add(tm2);
        sobre.add(tm3);
        
        jButton3.addActionListener((e) -> {
            dado1();
            dado2();
            dado3();
        });
        p1.jButton2.addActionListener((e) -> {
         p1.v3.verificacion();
        try {
            p1.v3.verificacionVehiculos(p1.j1);
            if(p1.v3.existeVehiculos==false){
                if(p1.v3.usuario.get(p1.j1).vehiculo.size()==0){
                    p1.v4.setVisible(true);  
                }else if(p1.v3.usuario.get(p1.j1).vehiculo.size()==1){
                    p1.v4.setVisible(true);   
                }else if(p1.v3.usuario.get(p1.j1).vehiculo.size()==2){
                    p1.v4.setVisible(true);   
                }else{
                }
            }else{
                setVisible(false);
                tamanyo.setVisible(true);
                jButton4.addActionListener((ec) -> {
                p1.setVisible(true);
                setVisible(false);
        });
            }
            ventanatamnio();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error no existen Vehiculos");
        }
        });
        //ventanatamnio();
                                     
        
    }
    private void ventanatamnio(){
        tm1.addActionListener((e) -> {
            tamanio(4, 4);
            this.setVisible(true);
            tamanyo.setVisible(false);
        });
        tm2.addActionListener((e) -> {
            tamanio(6, 4);
            this.setVisible(true);
            tamanyo.setVisible(false);
        });
        tm3.addActionListener((e) -> {
            tamanio(8, 9);
            this.setVisible(true);
            tamanyo.setVisible(false);
        });
        
    }
    
    private void tamanio(int largo, int alto){
        jPanel2.removeAll();
        this.largo=largo;
        this.alto=alto;
        setVisible(true);
        generarTablero(largo, alto);
    }
    
        
    private void generarTablero(int h,int v) {
        tablero = new JButton[h][v];
        juego = new int[h][v];

        for (int fila = 0; fila < h; fila++) {
            for (int columna = 0; columna < v; columna++) {

                int r1 = (int) ((Math.random()*3)+1);
                //int r2 = (int) ((Math.random()*2)+1);
                System.out.println(r1);
                if (r1==1) {
                    juego[fila][columna] = 1;
                    tablero[fila][columna] = new JButton();
                    tablero[fila][columna].setBounds(fila * 100, columna * 100, 100, 100);
                    tablero[fila][columna].setBackground(Color.GREEN);
                }else if (r1==2) {
                    juego[fila][columna] = 2;
                    tablero[fila][columna] = new JButton();
                    tablero[fila][columna].setBounds(fila * 100, columna * 100, 100, 100);
                    tablero[fila][columna].setBackground(Color.BLUE);
                }else if (r1==3) {
                    juego[fila][columna] = 3;
                    tablero[fila][columna] = new JButton();
                    tablero[fila][columna].setBounds(fila * 100, columna * 100, 100, 100);
                    tablero[fila][columna].setBackground(Color.RED);
                }else{
                    
                }

                Pieza accion = new Pieza();
                tablero[fila][columna].addActionListener(accion);


                jPanel2.add(tablero[fila][columna]);
                jPanel2.setLayout(new GridLayout(h,v));
                jPanel2.updateUI();
                jPanel2.repaint();
            }
        }
        Tablero();
    }
           
    private void Tablero() {
        
            for (int fila = 0; fila < largo; fila++) {
            System.out.println("");
            for (int columna = 0; columna < alto; columna++) {
                System.out.print(juego[fila][columna] + ", ");
            }
        }
    }

         
    private class Pieza implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent click) {
            for (int fila1 = 0; fila1 < largo; fila1++) {
                for (int columna = 0; columna < alto; columna++) {
                    if (click.getSource().equals(tablero[fila1][columna])) {
                        pos1 = fila1;
                        pos2 = columna;

                        System.out.println(tablero[fila1][columna].getColorModel());
                        System.out.println("Fila " + fila1 + " Columna " + columna);
                        System.out.println(juego[fila1][columna]);
                    }
                }
            }
        }
    }   
        
    private void dado1 (){
        
        for(int i=0;i<25;i++){
            dadode6=(int)((Math.random()*6)+1);
            jTextField12.setText(Integer.toString(dadode6));
        }
        
    }
    private void dado2 (){
        
        for(int i=0;i<25;i++){
            dadode100=(int)((Math.random()*100)+1);
            jTextField13.setText(Integer.toString(dadode100));
        }
        
    }
    private void dado3 (){
        
        for(int i=0;i<25;i++){
            dadode4=(int)((Math.random()*4)+1);
            jTextField14.setText(Integer.toString(dadode4));
        }
        
    }
         
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.setEditable(false);
        jTextField4.setText("Vida Enemigos");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 0, 110, 20));

        jTextField5.setEditable(false);
        jTextField5.setText("Vida Vehiculos");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, 110, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("Enemigo 1");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField7.setEditable(false);
        jTextField7.setText("Enemigo 2");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setText("Enemigo 3");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setText("Vehiculo 1");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTextField10.setEditable(false);
        jTextField10.setText("Vehiculo 2");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        jTextField11.setEditable(false);
        jTextField11.setText("Vehiculo 3");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1000, 110));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 798, 588));

        jPanel3.setLayout(null);

        jButton2.setText("Cambiar Vehiculo");
        jPanel3.add(jButton2);
        jButton2.setBounds(10, 10, 170, 31);

        jButton3.setText("Aplicar Objeto");
        jPanel3.add(jButton3);
        jButton3.setBounds(10, 50, 170, 31);

        jButton4.setText("Rendirse");
        jPanel3.add(jButton4);
        jButton4.setBounds(840, 10, 150, 31);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Dado de 6 caras");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jTextField2.setText("Dado de 100 Caras");
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jTextField3.setText("Dado Comodin");
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jTextField12.setText("6");
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 130));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jTextField13.setText("100");
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 110));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jTextField14.setText("4");
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 150, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 106, 200, 588));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 760, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
