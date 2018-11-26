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
    private String name;
    private int age;
    private String sex;
    private String party;
    protected String caseyS;
    protected String gallagherS;
    protected String higginsS;
    protected String riadaS;

    //Constructor
    public candidate() {
        name = "";
        age = 0;
        sex = "";
        party = "";
        riadaS = "6";
        gallagherS = "2";
        higginsS = "8";
        caseyS = "5";
    }

    //Super constructor
    public candidate(String name, int age, String sex, String party, String caseyS, String gallagherS, String higginsS, String riadaS) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.party = party;
        this.caseyS = caseyS;
        this.gallagherS = gallagherS;
        this.higginsS = higginsS;
        this.riadaS = riadaS;
    }

    //polymorphism
    public void description(){
        JOptionPane.showMessageDialog(null,"now you are entering the vote page");
    }
    

    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setParty(String party) {
        this.party = party;
    }

    //get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getParty() {
        return party;
    }

    public String getCaseyS() {
        return caseyS;
    }

    public void setCaseyS(String caseyS) {
        this.caseyS = caseyS;
    }

    public String getGallagherS() {
        return gallagherS;
    }

    public void setGallagherS(String gallagherS) {
        this.gallagherS = gallagherS;
    }

    public String getHigginsS() {
        return higginsS;
    }

    public void setHigginsS(String higginsS) {
        this.higginsS = higginsS;
    }

    public String getRiadaS() {
        return riadaS;
    }

    public void setRiadaS(String riadaS) {
        this.riadaS = riadaS;
    }

}
