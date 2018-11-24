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
public class presidentGUI extends javax.swing.JFrame {

    /**
     * Creates new form presidentGUI
     */
    
    //Data
    private String name;
    private int age;
    private String sex;
    private String party;
    private String policy;
    private double budget;
    private String advertisement;
    private String nameU;
    private String pps;
    private int ageU;
    
    
    
    //Constructor
    public presidentGUI() {
        initComponents();
        name="";
        age=0;
        sex="";
        party="";
        policy="";
        budget=0.0;
        advertisement="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        ppsL = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        ppsT = new javax.swing.JTextField();
        ageL = new javax.swing.JLabel();
        ageT = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("Voting Form");

        nameL.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        nameL.setText("Name: ");

        ppsL.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        ppsL.setText("PPS-Number: ");

        nameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTActionPerformed(evt);
            }
        });

        ageL.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        ageL.setText("Age:");

        ageT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ppsL)
                            .addComponent(nameL)
                            .addComponent(ageL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ppsT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsL)
                    .addComponent(ppsT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageL)
                    .addComponent(ageT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(submitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTActionPerformed

    private void ageTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //Taking in class
        voter v;
        v=new voter();
        
        //Validating inputs
        if(nameU!=""){
            if(pps.length()==8){
                if(pps.charAt(9)=='A'||pps.charAt(9)=='B'||pps.charAt(9)=='C'||pps.charAt(9)=='D'||pps.charAt(9)=='E'||pps.charAt(9)=='F'||pps.charAt(9)=='G'||pps.charAt(9)=='H'||pps.charAt(9)=='I'||pps.charAt(9)=='J'||pps.charAt(9)=='K'||pps.charAt(9)=='L'||pps.charAt(9)=='M'||
                   pps.charAt(9)=='N'||pps.charAt(9)=='O'||pps.charAt(9)=='P'||pps.charAt(9)=='Q'||pps.charAt(9)=='R'||pps.charAt(9)=='S'||pps.charAt(9)=='T'||pps.charAt(9)=='U'||pps.charAt(9)=='V'||pps.charAt(9)=='W'||pps.charAt(9)=='B'||pps.charAt(9)=='X'||pps.charAt(9)=='Y'||pps.charAt(9)=='B'||pps.charAt(9)=='Z')
                    {
                        if(ageU>=18){
                            JOptionPane.showMessageDialog(null, "Thanks for voting!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Must be 18 or older to vote.");
                        }
                    
                   
                }
                else{
                    JOptionPane.showMessageDialog(null, "Last digit must be a letter.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "PPS must be 8 digits long.");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter your name.");
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(presidentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(presidentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(presidentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(presidentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presidentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageL;
    private javax.swing.JTextField ageT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameT;
    private javax.swing.JLabel ppsL;
    private javax.swing.JTextField ppsT;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
