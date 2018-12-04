package presidentapp;

import javax.swing.JOptionPane;


/*
 * @author Piyush sharma, x17342356
 * @author Dylan Murphy, x17506166
 * @author Nathan Hodgkiss, x17381176
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
    public void description() {
        JOptionPane.showMessageDialog(null, "Thank you for voting for Casey");
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
