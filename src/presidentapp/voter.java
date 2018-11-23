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
    private String nameU;
    private String pps;
    private int ageU;
    
    //Constructor
    public voter(){
        nameU="";
        pps="";
        age=0;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
