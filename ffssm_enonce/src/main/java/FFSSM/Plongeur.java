package FFSSM;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Plongeur extends Personne {
	
    public GroupeSanguin sang;
    public int niveau;
    private List<Licence> licences = new LinkedList<>();

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
    }
    
    public void ajouteLicence(Licence L){
        this.licences.add(L);
    }
    
    public Licence derniereLicence (){
        return this.licences.get(licences.size()-1);
    }
    
    public int getNiveau (){
        return this.niveau;
    }
    
    public void setNiveau (int niveau){
        this.niveau = niveau;
    }
    
    public GroupeSanguin getGroupeSanguin (){
        return this.sang;
    }
    
    public void setGroupeSanguin (GroupeSanguin sang) {
        this.sang = sang;
    }
}
