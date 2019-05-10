
package pkgfinal;

import com.sun.glass.events.MouseEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tablero extends javax.swing.JFrame {

    Principal p1 = new Principal();
    JButton tablero[][] = null;
    Genera_Enemigos en= new Genera_Enemigos();
    
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
    int total;
    double porcentaje;
    int Defensa;
    int Ataque;
    boolean turno;
    
    int a;
    int b;
    int c;
    int y;
    int x;
    int z;
    int filaVehiculos;
    int columnaVehiculo;
    int vidacas;
    double danioooo;
    
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
                
        jButton4.addActionListener((ec) -> {
        p1.setVisible(true);
        setVisible(false);

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
                                   
                p1.v5.removerTabla();                    
                for(int i=0; i<p1.v3.usuario.get(p1.j1).vehiculo.size();i++){
                    p1.v5.sel=3;
                    p1.v5.listarVehiculos(i+1, p1.v3.usuario.get(p1.j1).vehiculo.get(i).nickName);                
                }
                setVisible(false);
                p1.v5.setVisible(true);
                
            }
            ventanatamnio();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error no existen Vehiculos");
        }
        });
        p1.v5.jButton1.addActionListener((ll) -> {
            p1.setVisible(false);
        a= Integer.parseInt(p1.v5.jTextField1.getText());
        b= Integer.parseInt(p1.v5.jTextField2.getText());
        c= Integer.parseInt(p1.v5.jTextField3.getText());
        z=a-1;
            p1.v5.setVisible(false);
           
            tamanyo.setVisible(true);
            
            jTextField9.setText(p1.v3.usuario.get(p1.j1).vehiculo.get(a-1).nickName);
            jTextField10.setText(p1.v3.usuario.get(p1.j1).vehiculo.get(b-1).nickName);
            jTextField11.setText(p1.v3.usuario.get(p1.j1).vehiculo.get(c-1).nickName);
            
        }); 
        
    }
    private void setTurno(){
        int t= (int) (Math.random()+10);
        if(t<5){
            turno=true;
        }else{
            turno=false;
        }
    }
    private void estado(){
        jTextField15.setText(Integer.toString(en.rev[0].vida));
        jTextField16.setText(Integer.toString(en.rev[1].vida));
        jTextField17.setText(Integer.toString(en.rev[2].vida));
        jTextField18.setText(Integer.toString(p1.v3.usuario.get(p1.j1).vehiculo.get(a-1).HP));
        jTextField19.setText(Integer.toString(p1.v3.usuario.get(p1.j1).vehiculo.get(b-1).HP));
        jTextField20.setText(Integer.toString(p1.v3.usuario.get(p1.j1).vehiculo.get(c-1).HP));
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
        posisiones(z, largo, alto);
        setTurno();
        estado();
        
    }
    
        
    private void generarTablero(int h,int v) {
        tablero = new JButton[h][v];
        juego = new int[h][v];

        for (int fila = 0; fila < h; fila++) {
            for (int columna = 0; columna < v; columna++) {

                int r1 = (int) ((Math.random()*3)+1);
                //int r2 = (int) ((Math.random()*2)+1);
                System.out.println(r1);
                switch (r1) {
                    case 1:
                        juego[fila][columna] = 1;
                        tablero[fila][columna] = new JButton();
                        tablero[fila][columna].setBounds(fila * 100, columna * 100, 100, 100);
                        tablero[fila][columna].setBackground(Color.GREEN);
                        break;
                    case 2:
                        juego[fila][columna] = 2;
                        tablero[fila][columna] = new JButton();
                        tablero[fila][columna].setBounds(fila * 100, columna * 100, 100, 100);
                        tablero[fila][columna].setBackground(Color.BLUE);
                        break;
                    case 3:
                        juego[fila][columna] = 3;
                        tablero[fila][columna] = new JButton();
                        tablero[fila][columna].setBounds(fila * 100, columna * 100, 100, 100);
                        tablero[fila][columna].setBackground(Color.RED);
                        break;
                    default:
                        break;
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
                        switch(juego[fila1][columna]){
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:          
                                tablero[en.rev[0].fila][en.rev[0].columna].addActionListener((edo) -> {
                                    AtacarEnemigo(0, en.rev[0].fila, en.rev[0].columna, filaVehiculos, columnaVehiculo);
                                }); 
                                break;
                            case 5:
                                tablero[en.rev[1].fila][en.rev[1].columna].addActionListener((edo) -> {
                                AtacarEnemigo(1, en.rev[1].fila, en.rev[1].columna, filaVehiculos, columnaVehiculo);
                                }); 
                                break;
                            case 6:
                                tablero[en.rev[2].fila][en.rev[2].columna].addActionListener((edo) -> {
                                AtacarEnemigo(2, en.rev[2].fila, en.rev[2].columna, filaVehiculos, columnaVehiculo);
                                }); 
                                break;
                            case 7:
                                
                                break;
                            case 8:
                                
                                break;
                        }
                        System.out.println(tablero[fila1][columna].getColorModel());
                        System.out.println("Fila " + fila1 + " Columna " + columna);
                        System.out.println(juego[fila1][columna]);
                        estado();
                    }
                }
            }
        }
    }
    
    private void posisiones(int tpp,int largo, int alto){
        // Enemigos
        
        //Vehiculo
        int r1 = (int) ((Math.random()*largo));
        int r2 = (int) ((Math.random()*alto));
        System.out.println(r1+", "+r2);
        filaVehiculos=r1;
        columnaVehiculo=r2;
        juego[r1][r2] = 7;
        tablero[r1][r2].setBackground(Color.GREEN);
        tablero[r1][r2].setIcon(p1.v3.usuario.get(p1.j1).vehiculo.get(tpp).veht);
        
        posicionEne1(tpp,largo,alto);
        posicionEne2(tpp,largo,alto);
        posicionEne3(tpp,largo,alto);

    }
    private void posicionEne1(int tpp,int largo, int alto){
        int r1 = (int) ((Math.random()*largo));
        int r2 = (int) ((Math.random()*alto));
        en.rev[0].fila=r1;
        en.rev[0].columna=r2;
        if(juego[r1][r2] ==7 ){
            posicionEne1(tpp,largo,alto);
        }else{
            juego[r1][r2] = 4;
            tablero[r1][r2].setBackground(Color.GREEN);
            tablero[r1][r2].setIcon(en.rev[0].veht);
           /* 
            tablero[en.rev[0].fila][en.rev[0].columna].addActionListener((ao) -> {
                AtacarEnemigo(0, en.rev[0].fila, en.rev[0].columna, filaVehiculos, columnaVehiculo);
            }); */
        }
    }
        
    private void posicionEne2(int tpp,int largo, int alto){
        int r1 = (int) ((Math.random()*largo));
        int r2 = (int) ((Math.random()*alto));
        en.rev[1].fila=r1;
        en.rev[1].columna=r2;
        if(juego[r1][r2] ==7 && juego[r1][r2] ==4){
            posicionEne2(tpp,largo,alto);
        }else{
            juego[r1][r2] = 5;
            tablero[r1][r2].setBackground(Color.GREEN);
            tablero[r1][r2].setIcon(en.rev[1].veht);
            /*
            tablero[en.rev[1].fila][en.rev[1].columna].addActionListener((eso) -> {
                AtacarEnemigo(1, en.rev[1].fila, en.rev[1].columna, filaVehiculos, columnaVehiculo);
            }); */
        }
        
    }
       
    private void posicionEne3(int tpp,int largo, int alto){
        int r1 = (int) ((Math.random()*largo));
        int r2 = (int) ((Math.random()*alto));
        en.rev[2].fila=r1;
        en.rev[2].columna=r2;
        if(juego[r1][r2] ==7 && juego[r1][r2] ==4 && juego[r1][r2] ==5){
            posicionEne3(tpp,largo,alto);
        }else{
            juego[r1][r2] = 6;
            tablero[r1][r2].setBackground(Color.GREEN);
            tablero[r1][r2].setIcon(en.rev[2].veht);
         /*   
            tablero[en.rev[2].fila][en.rev[2].columna].addActionListener((edo) -> {
                AtacarEnemigo(2, en.rev[2].fila, en.rev[2].columna, filaVehiculos, columnaVehiculo);
            }); 
*/
        }
    }
    private void AtacarJugador(){
        
    }
    private void AtacarEnemigo(int e, int fe, int ce, int fv, int cv){
        Distancia(fe, ce, fv, cv);
        Danio(e, total);
        System.out.println(total);
        if (danioooo<=0) {
            System.out.println("Fallaste");
        }else{
            en.rev[e].vida=(int) (en.rev[e].vida-danioooo);
            System.out.println("Bien danio: "+danioooo);
            System.out.println("Bien vida: "+en.rev[e].vida);
        }
    }
    private void Danio(int E,long d){
        
        dado2();
        Ataque=(int) p1.v3.usuario.get(p1.j1).vehiculo.get(z).ataque;
        Defensa=en.rev[E].defensa;
        porcentaje= (0.01*dadode100);
        
        System.out.println("\n"+dadode100);
        System.out.println("Defensa: "+Defensa);
        System.out.println("Ataque: "+Ataque);
        System.out.println(porcentaje);
        System.out.println(0.04*total);
        System.out.println(Ataque*((porcentaje)-(0.04*total)));
        
        danioooo = ((Ataque + (Ataque*((porcentaje)-(0.04*total))))-Defensa);
    }
    private void Distancia(int fe, int ce, int fv, int cv){
        int hor=ce-cv;
        int ver=fe-fv;
        if(hor<0){
            hor=hor*(-1);
        }else{
        }
        if(ver<0){
            ver=ver*(-1);
        }else{
        }
        total= hor + ver;
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
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
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
        jTextField6.setText("LOKI");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        jTextField7.setEditable(false);
        jTextField7.setText("ASORE");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));

        jTextField8.setEditable(false);
        jTextField8.setText("WESKER");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, -1));

        jTextField9.setEditable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 120, -1));

        jTextField10.setEditable(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 120, -1));

        jTextField11.setEditable(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, -1));

        jTextField15.setEditable(false);
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        jTextField16.setEditable(false);
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 50, -1));

        jTextField17.setEditable(false);
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 50, -1));

        jTextField18.setEditable(false);
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 70, -1));

        jTextField19.setEditable(false);
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 70, -1));

        jTextField20.setEditable(false);
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 70, -1));

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 760, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
