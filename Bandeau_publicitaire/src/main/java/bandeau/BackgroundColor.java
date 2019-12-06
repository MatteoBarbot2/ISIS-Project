/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

public class BackgroundColor extends Effet{
    public BackgroundColor (Bandeau bandeau, Color c){
        bandeau.setBackground(c);
        bandeau.sleep(1000);
    }
}
