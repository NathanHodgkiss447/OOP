package presidentapp;

import javax.swing.JOptionPane;


/*
 * @author Piyush sharma, x17342356
 * @author Dylan Murphy, x17506166
 * @author Nathan Hodgkiss, x17381176
 */
public class riada extends candidate {

    //Data
    private String policy;
    private String advertisement;

    //Constructor
    public riada() {
        policy = "";
        advertisement = "";
    }

    //Super Constructor
    public riada(String policy, String advertisement, String nameU, String ageU, String pps) {
        super(nameU, ageU, pps);
        this.policy = policy;
        this.advertisement = advertisement;
    }

    //example of polymorphism
    @Override
    public void description() {
        JOptionPane.showMessageDialog(null, "Thank you for voting for Riada");
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement;
    }

}
