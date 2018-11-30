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
    public void description(){
        JOptionPane.showMessageDialog(null,"You are now entering the voting page!");
    }
    
    //set and get
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
