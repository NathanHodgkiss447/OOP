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
public class candidate {

    //Data
    private String name;
    private int age;
    private String sex;
    private String party;
    
    //Constructor
    public candidate(){
        name="";
        age=0;
        sex="";
        party="";
    }
    
    //Super constructor
    public candidate(String name, int age, String sex, String party) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.party = party;
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

}
