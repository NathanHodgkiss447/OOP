/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentapp;


import javax.swing.JOptionPane;

/**
 *
 * @author x17381176
 */
public class president2GUI extends javax.swing.JFrame {

    //vars
    int casey = 5;
    int gallagher = 2;
    int higgins = 8;
    int riada = 6;
    String caseyS = "";
    String higginsS = "";
    String riadaS = "";
    String gallagherS = "";

    //array
    int vote[] = new int[3];
    
    
    casey c2 = new casey();
    riada r = new riada();
    higgins h = new higgins();
    gallagher g = new gallagher();

    
    public president2GUI() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        caseyBT = new javax.swing.JButton();
        higginsBT = new javax.swing.JButton();
        riadaBT = new javax.swing.JButton();
        gallagherBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateBT = new javax.swing.JButton();
        higginsLB = new javax.swing.JLabel();
        caseyLB = new javax.swing.JLabel();
        riadaLB = new javax.swing.JLabel();
        gallagherLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Vote here");

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

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setText("Vote Count");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(higginsBT, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(riadaBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseyBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gallagherBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caseyBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(riadaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(higginsLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(riadaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(caseyLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gallagherBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gallagherLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(higginsBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gallagherBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallagherBTActionPerformed
        //takig vote in and converting it to string
        gallagher = gallagher + 1;
        gallagherS = Integer.toString(gallagher);

        //set
        c2.setCaseyS(caseyS);
        h.setHigginsS(higginsS);
        r.setRiadaS(riadaS);
        g.setGallagherS(gallagherS);

        //showing that vote has been submited
        JOptionPane.showMessageDialog(null, "You have sucessfully voted");

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);

    }//GEN-LAST:event_gallagherBTActionPerformed

    private void caseyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseyBTActionPerformed
        //takig votes in and converting it to string
        casey = casey + 1;
       // caseyS = Integer.toString(casey);
        //higginsS = Integer.toString(higgins);
        //riadaS = Integer.toString(riada);
        //gallagherS = Integer.toString(gallagher);

        //set
        
       
        

        //showing that vote has been submited
        JOptionPane.showMessageDialog(null, "You have sucessfully voted");

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);
        
        
         vote[0] = casey;
        vote[1] = higgins;
        vote[2] = riada;
        vote[3] = gallagher;
    }//GEN-LAST:event_caseyBTActionPerformed

    private void riadaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riadaBTActionPerformed
        //takig vote in and converting it to string
        riada = riada + 1;
        riadaS = Integer.toString(riada);

        //set
        c2.setCaseyS(caseyS);
        h.setHigginsS(higginsS);
        r.setRiadaS(riadaS);
        g.setGallagherS(gallagherS);

        //showing that vote has been submited
        JOptionPane.showMessageDialog(null, "You have sucessfully voted");

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);
    }//GEN-LAST:event_riadaBTActionPerformed

    private void higginsBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higginsBTActionPerformed
        //takig vote in and converting it to string
        higgins = higgins + 1;
        higginsS = Integer.toString(higgins);

        //set
        c2.setCaseyS(caseyS);
        h.setHigginsS(higginsS);
        r.setRiadaS(riadaS);
        g.setGallagherS(gallagherS);

        //showing that vote has been submited
        JOptionPane.showMessageDialog(null, "You have sucessfully voted");

        //making voting pole disapear
        caseyBT.setVisible(false);
        higginsBT.setVisible(false);
        gallagherBT.setVisible(false);
        riadaBT.setVisible(false);
    }//GEN-LAST:event_higginsBTActionPerformed

    private void updateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTActionPerformed
       JOptionPane.showMessageDialog(null,"its working");
       
        caseyLB.setText(Integer.toString(vote[0]));
        higginsLB.setText(Integer.toString(vote[1]));
        riadaLB.setText(Integer.toString(vote[2]));
        gallagherLB.setText(Integer.toString(vote[3]));
        
       
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton riadaBT;
    private javax.swing.JLabel riadaLB;
    private javax.swing.JButton updateBT;
    // End of variables declaration//GEN-END:variables
}
