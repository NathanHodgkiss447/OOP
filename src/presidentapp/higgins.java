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
public class higgins extends candidate {
    //Data
    private String policy;
    private Double budget;
    
    //Constructor
    public higgins(){
        policy="";
        budget=0.0;
    }
    
    //Super Constructor
    public higgins(String policy, Double budget, String name, int age, String sex, String party) {
        super(name, age, sex, party);
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
