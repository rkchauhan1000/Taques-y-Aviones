
package pkgfinal;

import java.util.ArrayList;

public class Armas extends javax.swing.JFrame {

    int aumento_ataque;
    int aumento_defensa;
    int aumento_punteria;
    int num;
    
    String nombre;
    
    public Armas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
//Primera arma basica
class Arma1 extends Armas{

    //Construcctor de la arma
    public Arma1(){
        //Atributos
        num=1;
        nombre="Storm";
        aumento_ataque=15;
        aumento_defensa=5;
        aumento_punteria=3;
    }
}
//Segunda arma basica
class Arma2 extends Armas{

    //Construcctor de la arma
    public Arma2(){
        num=2;
        nombre="Destructor";
        aumento_ataque=10;
        aumento_defensa=5;
        aumento_punteria=5;
    }
}
//Tercera arma basica
class Arma3 extends Armas{

    //Construcctor de la arma
    public Arma3(){
        num=3;
        nombre="M83-7";
        aumento_ataque=8;
        aumento_defensa=2;
        aumento_punteria=8;
    }

}
//Tercera arma basica
class nuevaArma extends Armas{

    //Construcctor de la arma
    public nuevaArma(int ataque, int defensa, int punteria,String nombre){
        this.nombre=nombre;
        aumento_ataque=ataque;
        aumento_defensa=defensa;
        aumento_punteria=punteria;
    }

}
