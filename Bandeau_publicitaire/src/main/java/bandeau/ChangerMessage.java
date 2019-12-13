/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;



public class ChangerMessage extends Effet{
    
    public String monMessage;
    
    public ChangerMessage(String message){
        this.monMessage = message;
    }
    
    @Override
    public void jouerEffet (Bandeau bandeau){
        bandeau.setMessage(this.monMessage);
    }
}
