
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentapp;

import javax.swing.JOptionPane;

/**
 *
 * @author x17381176
 */
public class casey extends candidate {

    private String policy;
    private String budget;

    //Constructor
    public casey() {
        policy = "";
        budget = "";
    }

    //Super Constructor
 
    public casey(String policy, String budget, String nameU, String ageU, String pps) {
        super(nameU, ageU, pps);
        this.policy = policy;
        this.budget = budget;
    }

   
    
   

       @Override
    public void description(){
        JOptionPane.showMessageDialog(null,"Thank you for voting for Casey");
    }

    //Set & Get Methods
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getEthnicity() {
        return budget;
    }

    public void setEthnicity(String ethnicity) {
        this.budget = ethnicity;
    }

}
