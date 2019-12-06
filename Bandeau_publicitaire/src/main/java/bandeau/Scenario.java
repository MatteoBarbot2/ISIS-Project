/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.*;

public class Scenario {
    public String nom;
    public List<Liste_effet> effets = new LinkedList<>();
    
    public Scenario (String nom){
        this.nom = nom;
    }
    public void ajouterEffet (int repetitions, Effet effet){
        Liste_effet nouvelleListeEffets = new Liste_effet(effet,repetitions,this);
        effets.add(nouvelleListeEffets);
    }
}
