/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Plongeur {

    public int numeroDiplome;
    
    public List<Embauche> employeurs = new LinkedList<>();

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    public Club employeurActuel() {
        Club result;
        if(employeurs.isEmpty()){
            result = null;
        }
        if (employeurs.get(employeurs.size()-1).estTerminee()){
            result = null;
        }
        else {
            result = employeurs.get(employeurs.size()-1).getEmployeur();
        }
        return result;
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) { 
        if (!employeurs.isEmpty()){
            if (! employeurs.get(employeurs.size()-1).estTerminee()){
                employeurs.get(employeurs.size()-1).setFin(debutNouvelle);
            }
        }
        Embauche nouvelleembauche = new Embauche(debutNouvelle,this,employeur);
        employeurs.add(nouvelleembauche);
    }

    public List<Embauche> emplois() {
        
        return employeurs;
    }

}
