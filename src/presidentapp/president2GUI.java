/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author x17381176
 */
public class president2GUI extends javax.swing.JFrame {

    //vars
    public int casey = 5;
    public int gallagher = 2;
    public int higgins = 8;
    public int riada = 6;
    public String caseyS = "";
    public String higginsS = "";
    public String riadaS = "";
    public String gallagherS = "";
    public String nameU;
    public String pps;
    public String ageU;

    //linking intangible/subclassed
    candidate c = new candidate();
    casey c2 = new casey();
    riada r = new riada();
    higgins h = new higgins();
    gallagher g = new gallagher();
   

    public president2GUI() {

        initComponents();

    }
    
    

    public president2GUI(String nameU, String pps, String ageU) {
        this.nameU = nameU;
        this.pps = pps;
        this.ageU = ageU;
        
    }
    
    

 
    
    
    
    

   

  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        caseyBT = new javax.swing.JButton();
        higginsBT = new javax.swing.JButton();
        riadaBT = new javax.swing.JButton();
        gallagherBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateBT = new javax.swing.JButton();
        higginsLB = new javax.swing.JLabel();
        caseyLB = new javax.swing.JLabel();
        riadaLB = new javax.swing.JLabel();
        gallagherLB = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel1.setText("Vote Form");

        caseyBT.setText("Casey");
        caseyBT.setPreferredSize(new java.awt.Dimension(60, 30));
        caseyBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseyBTActionPerformed(evt);
            }
        });

        higginsBT.setText("Higgins");
        higginsBT.setPreferredSize(new java.awt.Dimension(60, 30));
        higginsBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higginsBTActionPerformed(evt);
            }
        });

        riadaBT.setText("Riada");
        riadaBT.setPreferredSize(new java.awt.Dimension(60, 30));
        riadaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riadaBTActionPerformed(evt);
            }
        });

        gallagherBT.setText("Gallagher");
        gallagherBT.setPreferredSize(new java.awt.Dimension(60, 30));
        gallagherBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gallagherBTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("     Vote for :");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Riada    =");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Higgins     =");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Gallagher    =");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Casey    =");

        updateBT.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        updateBT.setText("Update vote count");
        updateBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTActionPerformed(evt);
            }
        });

        higginsLB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        higginsLB.setText("8");

        caseyLB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        caseyLB.setText("5");

        riadaLB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        riadaLB.setText("6");

        gallagherLB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        gallagherLB.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(higginsBT, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(riadaBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseyBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gallagherBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(higginsLB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gallagherLB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caseyLB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(riadaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(updateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(caseyBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(riadaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gallagherBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(higginsBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(higginsLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caseyLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(riadaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gallagherLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(updateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gallagherBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallagherBTActionPerformed
        //takig vote in and converting it to string
        gallagher = gallagher + 1;
        gallagherS = Integer.toString(gallagher);
        caseyS = Integer.toString(casey);
        riadaS = Integer.toString(riada);
        higginsS = Integer.toString(higgins);

        //example ogf polymorphism
        g.description();

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);

        //scanner
        Scanner s = new Scanner(System.in);

        //writing to a file
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        outFile = new File("vote.txt");

        try {
            fw = new FileWriter(outFile);
            bw = new BufferedWriter(fw);
            fw.write(gallagherS);
            fw.write(caseyS);
            fw.write(higginsS);
            fw.write(riadaS);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(president2GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "opps didnt work");
        }


    }//GEN-LAST:event_gallagherBTActionPerformed

    private void caseyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseyBTActionPerformed
        //takig votes in and converting it to string
        casey = casey + 1;
        gallagherS = Integer.toString(gallagher);
        caseyS = Integer.toString(casey);
        riadaS = Integer.toString(riada);
        higginsS = Integer.toString(higgins);
        //example ogf polymorphism
        c2.description();

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);

        //writing to a file
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        outFile = new File("vote.txt");

        try {
            fw = new FileWriter(outFile);
            bw = new BufferedWriter(fw);
            fw.write(gallagherS);
            fw.write(caseyS);
            fw.write(higginsS);
            fw.write(riadaS);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(president2GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "opps didnt work");
        }


    }//GEN-LAST:event_caseyBTActionPerformed

    private void riadaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riadaBTActionPerformed
        //takig vote in and converting it to string
        riada = riada + 1;
        gallagherS = Integer.toString(gallagher);
        caseyS = Integer.toString(casey);
        riadaS = Integer.toString(riada);
        higginsS = Integer.toString(higgins);

        //example ogf polymorphism
        r.description();

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);

        //writing to a file
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        outFile = new File("vote.txt");

        try {
            fw = new FileWriter(outFile);
            bw = new BufferedWriter(fw);
            fw.write(gallagherS);
            fw.write(caseyS);
            fw.write(higginsS);
            fw.write(riadaS);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(president2GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "opps didnt work");
        }


    }//GEN-LAST:event_riadaBTActionPerformed

    private void higginsBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higginsBTActionPerformed
        //takig vote in and converting it to string
        higgins = higgins + 1;
        gallagherS = Integer.toString(gallagher);
        caseyS = Integer.toString(casey);
        riadaS = Integer.toString(riada);
        higginsS = Integer.toString(higgins);

        //example ogf polymorphism
        h.description();

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);

        //writing to a file
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        outFile = new File("vote.txt");

        try {
            fw = new FileWriter(outFile);
            bw = new BufferedWriter(fw);
            fw.write(gallagherS);
            fw.write(caseyS);
            fw.write(higginsS);
            fw.write(riadaS);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(president2GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "opps didnt work");
        }


    }//GEN-LAST:event_higginsBTActionPerformed

    private void updateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTActionPerformed
        //need to read from the file
        File outFile;
        FileReader fr;
        BufferedReader br;

        //file is being read this time
        outFile = new File("vote.txt");
        try {
            fr = new FileReader(outFile);
            br = new BufferedReader(fr);

            gallagherS = br.readLine();

            caseyS = br.readLine();

            higginsS = br.readLine();

            riadaS = br.readLine();

            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(president2GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(president2GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        gallagherLB.setText(gallagherS);
        caseyLB.setText(caseyS);
        higginsLB.setText(higginsS);
        riadaLB.setText(riadaS);
        
      

    }//GEN-LAST:event_updateBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(president2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(president2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(president2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(president2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new president2GUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caseyBT;
    private javax.swing.JLabel caseyLB;
    private javax.swing.JButton gallagherBT;
    private javax.swing.JLabel gallagherLB;
    private javax.swing.JButton higginsBT;
    private javax.swing.JLabel higginsLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton riadaBT;
    private javax.swing.JLabel riadaLB;
    private javax.swing.JButton updateBT;
    // End of variables declaration//GEN-END:variables
}
