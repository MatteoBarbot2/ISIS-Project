/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;



public class Rotation extends Effet{
    
    @Override
    public void jouerEffet (Bandeau bandeau){
        for (int i = 0; i <= 100; i++) {
		bandeau.setRotation(2*Math.PI*i / 100);
		bandeau.sleep(35);
	}
    }
}
