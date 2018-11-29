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
public class gallagher extends candidate {
    //Data
    private String policy;
    private Double budget;
    
    //Constructor
    public gallagher(){
        policy="";
        budget=0.0;
    }

    //Super constructor

    public gallagher(String policy, Double budget, String nameU, String ageU, String pps) {
        super(nameU, ageU, pps);
        this.policy = policy;
        this.budget = budget;
    }

  
    
    
    @Override
    public void description(){
        JOptionPane.showMessageDialog(null,"Thank you for voting for Gallagher");
    }
    
   
    
    //Set & Get Methods
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
    
    
    
    
    
}
