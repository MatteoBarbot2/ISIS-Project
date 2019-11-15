package FFSSM;

import java.util.Calendar;

public class Plongeur extends Personne {
	
    public GroupeSanguin sang;
    public int niveau;

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
    }
    
}
