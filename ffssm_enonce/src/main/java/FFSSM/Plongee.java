/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;
    
    public Set<Licence> licences = new HashSet<>();

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
    }

    public void ajouteParticipant(Plongeur participant) {
        
        licences.add(participant.derniereLicence());
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
        boolean result = true;
        for (Licence l : licences){
            if (! l.estValide(this.date)){
                result = false;
                break;
            }
        }
        return result;
    }

}
