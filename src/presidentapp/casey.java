
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentapp;

/**
 *
 * @author x17381176
 */
public class casey extends candidate{
    private String policy;
    private String budget;


    //Constructor
    public casey(){
    policy="";
    budget="";
}

    //Super Constructor
    public casey(String policy, String ethnicity, String name, int age, String sex, String party) {
        super(name, age, sex, party);
        this.policy = policy;
        this.budget = ethnicity;
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

