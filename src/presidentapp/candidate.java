package presidentapp;

import javax.swing.JOptionPane;


/*
 * @author Piyush sharma, x17342356
 * @author Dylan Murphy, x17506166
 * @author Nathan Hodgkiss, x17381176
 */
public class candidate {

    //Data
    public String nameU;
    public String ageU;
    public String pps;

    //Constructor
    public candidate() {

        nameU = "a";
        ageU = "";
        pps = "12";
    }

    //Super constructor
    public candidate(String nameU, String ageU, String pps) {
        this.nameU = nameU;
        this.ageU = ageU;
        this.pps = pps;
    }

    //polymorphism
    public void description() {
        JOptionPane.showMessageDialog(null, "You are now entering the voting page!");
    }

    //Set and Get methods
    public String getNameU() {
        return nameU;
    }

    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    public String getAgeU() {
        return ageU;
    }

    public void setAgeU(String ageU) {
        this.ageU = ageU;
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

}
