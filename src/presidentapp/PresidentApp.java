/*hi
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentapp;

/**
 *
 * @author x17381176
 */
public class PresidentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        presidentGUI myGUI = new presidentGUI();
        myGUI.setVisible(true);
        
          president2GUI P2=new president2GUI();
    
        P2.setVisible(true);

        casey c2 = new casey();
        riada r = new riada();
        higgins h = new higgins();
        gallagher g = new gallagher();

        candidate list[] = new candidate[3];

        list[0] = c2;
        list[1] = r;
        list[2] = h;
        list[3] = g;
        
       
        

    }

}
