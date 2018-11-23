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

public class riada extends candidate{
    //Data
    private String policy;
    private String advertisement;
    
    //Constructor
    public riada(){
        policy="";
        advertisement="";
    }
    
    //Super Constructor
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
