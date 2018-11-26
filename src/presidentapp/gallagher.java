/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentapp;

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

    public gallagher(String policy, Double budget, String name, int age, String sex, String party, String caseyS, String gallagherS, String higginsS, String riadaS) {
        super(name, age, sex, party, caseyS, gallagherS, higginsS, riadaS);
        this.policy = policy;
        this.budget = budget;
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
