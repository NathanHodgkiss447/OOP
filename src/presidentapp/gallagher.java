package presidentapp;

import javax.swing.JOptionPane;


/*
 * @author Piyush sharma, x17342356
 * @author Dylan Murphy, x17506166
 * @author Nathan Hodgkiss, x17381176
 */
public class gallagher extends candidate {

    //Data
    private String policy;
    private Double budget;

    //Constructor
    public gallagher() {
        policy = "";
        budget = 0.0;
    }

    //Super constructor
    public gallagher(String policy, Double budget, String nameU, String ageU, String pps) {
        super(nameU, ageU, pps);
        this.policy = policy;
        this.budget = budget;
    }

    @Override
    public void description() {
        JOptionPane.showMessageDialog(null, "Thank you for voting for Gallagher");
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
