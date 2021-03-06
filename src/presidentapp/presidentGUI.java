package presidentapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Piyush sharma, x17342356
 * @author Dylan Murphy, x17506166
 * @author Nathan Hodgkiss, x17381176
 */
public class presidentGUI extends javax.swing.JFrame {

    /**
     * Creates new form presidentGUI
     */
    //Data
    protected String name;
    public String age;
    private String sex;
    private String party;
    private String policy;
    private double budget;
    private String advertisement;
    public String nameU;
    public String pps;
    public int ageU;

    //Constructor
    public presidentGUI() {
        initComponents();
        name = "";
        age = "";
        sex = "";
        party = "";
        policy = "";
        budget = 0.0;
        advertisement = "";
        nameU = "Blank";
        pps = "********";
        ageU = 0;

    }

    //Super Constructor/array
    public presidentGUI(String nameU, String pps, String age) {
        this.nameU = nameU;
        this.age = age;
        this.pps = pps;
    }

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

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("User Information");

        nameL.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        nameL.setText("Name: ");

        ppsL.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        ppsL.setText("PPS-Number: ");

        nameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTActionPerformed(evt);
            }
        });

        ageL.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        ageL.setText("Age:");

        ageT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Franklin Gothic Book", 0, 15)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(51, 255, 51));
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ppsL)
                    .addComponent(ageL, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameL, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(186, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ppsT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameL))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppsL)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageL))
                .addContainerGap(73, Short.MAX_VALUE))
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
        candidate c = new candidate();
        //Taking in input from text field and storing it to the variable.
        nameU = nameT.getText();
        pps = ppsT.getText();
        ageU = Integer.parseInt(ageT.getText());
        age = Integer.toString(ageU);

        //Validating inputs
        if (nameU.length() > 0) {
            if (pps.length() == 8) {
                if (pps.charAt(7) == 'A' || pps.charAt(7) == 'B' || pps.charAt(7) == 'C' || pps.charAt(7) == 'D' || pps.charAt(7) == 'E' || pps.charAt(7) == 'F' || pps.charAt(7) == 'G' || pps.charAt(7) == 'H' || pps.charAt(7) == 'I' || pps.charAt(7) == 'J' || pps.charAt(7) == 'K' || pps.charAt(7) == 'L' || pps.charAt(7) == 'M'
                        || pps.charAt(7) == 'N' || pps.charAt(7) == 'O' || pps.charAt(7) == 'P' || pps.charAt(7) == 'Q' || pps.charAt(7) == 'R' || pps.charAt(7) == 'S' || pps.charAt(7) == 'T' || pps.charAt(7) == 'U' || pps.charAt(7) == 'V' || pps.charAt(7) == 'W' || pps.charAt(7) == 'X' || pps.charAt(7) == 'Y' || pps.charAt(7) == 'Z') {

                    if (ageU >= 18 && ageU <= 200) {

                        /*
                         *@reference https://www.youtube.com/watch?v=GAl1FSKvoFY&t=380s
                         */
                        //arraylist
                        ArrayList<presidentGUI> list = new ArrayList<>();
                        presidentGUI p1 = new presidentGUI(nameU, pps, age);
                        list.add(p1);

                        new showGUI(list).setVisible(true);

                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Enter valid age");

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Last digit must be a letter.");

                }
            } else {
                JOptionPane.showMessageDialog(null, "PPS must be 8 digits long.");

            }

        } else {
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
