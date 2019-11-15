/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Plongee {
	// On mémorise la licence en cours du plongeur au moment de la plongée
	public Set<Licence> palanquee = new HashSet<>();

	public Site lieu;

	public Moniteur chefDePalanquee;

	public Calendar date;

	public int profondeur;

	public int duree;

	public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
		this.lieu = lieu;
		this.chefDePalanquee = chefDePalanquee;
		this.date = date;
		this.profondeur = profondeur;
		this.duree = duree;
	}

	public void ajouteParticipant(Plongeur participant) {
		palanquee.add(participant.derniereLicence());
	}

	public Calendar getDate() {
		return date;
	}

	public boolean estConforme() {
		// 1° ligne on déclare le résultat
		boolean result = true;

		// On calcule le résultat
		// On vérifie que chaque participant avait une licence valide à la date de la plongée
		for (Licence l : palanquee) {
			if (!l.estValide(date)) {
				// Si on trouve une licence invalide la plongée n'est pas conforme
				result = false;
				// Pas la peine d'aller chercher plus loin
				break;
			}
		}

		// Dernière ligne : on renvoie le résulat
		return result;
	}

}
