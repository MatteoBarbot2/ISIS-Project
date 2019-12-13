/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

public class Zoom extends Effet{
    
    @Override
    public void jouerEffet (Bandeau bandeau){
        for (int i = 5; i < 60 ; i+=5) {
		bandeau.setFont(new Font("Arial", Font.BOLD, 5+i));
		bandeau.sleep(50);
	}
    }
}