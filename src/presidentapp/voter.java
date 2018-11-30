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
public class voter {

    //Data
    public String nameU;
    public String pps;
    public int ageU;

    //Constructor
    public voter() {
        nameU = "";
        pps = "";
        ageU = 0;
    }

    public voter(String nameU, String pps, int ageU) {
        this.nameU = nameU;
        this.pps = pps;
        this.ageU = ageU;
    }

    //Set & Get methods
    public String getNameU() {
        return nameU;
    }

    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public int getAgeU() {
        return ageU;
    }

    public void setAgeU(int ageU) {
        this.ageU = ageU;
    }

}
