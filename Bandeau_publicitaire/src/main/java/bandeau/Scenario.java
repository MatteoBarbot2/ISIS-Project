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
    public Bandeau bandeau;
    
    public Scenario (String nom){
        this.nom = nom;
    }
    public void ajouterEffet (int repetitions, Effet effet){
        Liste_effet nouvelleListeEffets = new Liste_effet(effet,repetitions,this);
        effets.add(nouvelleListeEffets);
    }
    public void jouerScenario (Bandeau bandeau){
        for (Liste_effet l : effets){
            for (int i=0;i<l.getRepetitions();i++){
                l.getEffets().jouerEffet(bandeau);
            }
        }
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Liste_effet> getEffets() {
        return effets;
    }
}
