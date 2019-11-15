/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Personne {

    public int numeroDiplome;
    //----------- List : interface -------------- LinkedList : choix de l'implémentation
    private final List<Embauche> employeurs = new LinkedList<>();

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    public Club employeurActuel() {
        return employeurs.isEmpty() ? // Si vide on renvoie null
                null : // Sinon  
                employeurs.get(employeurs.size() - 1).estTerminee() ? // Si la dernière embauche est terminée
			null : // Pas d'employeur
			employeurs.get(employeurs.size() - 1).getEmployeur(); // Le dernier employeur
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {
        if (! employeurs.isEmpty()) { // On termine la dernière embauche si nécessaire
            Embauche derniereEmbauche = employeurs.get(employeurs.size() - 1);
            if (null == derniereEmbauche.getFin()) // Pas de date de fin -> embauche pas terminée
                derniereEmbauche.setFin(debutNouvelle); // On met fin à la dernière embauche            
        }
        
        Embauche nouvelle = new Embauche(debutNouvelle, this, employeur);
        employeurs.add(nouvelle);
    }

    public List<Embauche> emplois() {
	// ne pas faire :
	// return employeurs; // Fuite de référence
        // Renvoi d'une "vue non-modifiable" : pourquoi ?
        return Collections.unmodifiableList(employeurs);
    }

}
