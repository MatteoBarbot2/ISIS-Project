/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

public class BackgroundColor extends Effet{
    
    public Color color;
    
    public BackgroundColor(Color color){
        this.color = color;
    }
    
    @Override
    public void jouerEffet (Bandeau bandeau){
        bandeau.setBackground(this.color);
        bandeau.sleep(1000);
    }
}
