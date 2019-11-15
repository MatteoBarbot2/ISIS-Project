package champollion;

import java.util.*;

public class Enseignant extends Personne {
    
    public Map <UE, ServicePrevu> heureEnseignement = new HashMap<>();
    public List<Intervention> planification = new LinkedList();

    public Enseignant(String nom, String email) {
        super(nom, email);
    }
    
    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant
     * en "heures équivalent TD"
     * Pour le calcul :
     * 1 heure de cours magistral vaut 1,5 h "équivalent TD"
     * 1 heure de TD vaut 1h "équivalent TD"
     * 1 heure de TP vaut 0,75h "équivalent TD"
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant
     **/
    public double heuresPrevues() {
        
        double result=0;
        for (ServicePrevu sp : heureEnseignement.values()) {
            result = result + sp.volumeCM*1.5 + sp.volumeTD + sp.volumeTP*0.75;
        }
        return result ;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée
     * en "heures équivalent TD"
     * Pour le calcul :
     * 1 heure de cours magistral vaut 1,5 h "équivalent TD"
     * 1 heure de TD vaut 1h "équivalent TD"
     * 1 heure de TP vaut 0,75h "équivalent TD"
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant
     **/
    public double heuresPrevuesPourUE(UE ue) {
        return heureEnseignement.get(ue).volumeCM*1.5 + heureEnseignement.get(ue).volumeTD + heureEnseignement.get(ue).volumeTP*0.75;
    }
    
    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral 
     * @param volumeTD le volume d'heures de TD 
     * @param volumeTP le volume d'heures de TP 
     */
    public void ajouteEnseignement(UE ue, double volumeCM, double volumeTD, double volumeTP) {
        
        if (heureEnseignement.containsKey(ue)){
            heureEnseignement.get(ue).AddHeure(volumeCM, volumeTD, volumeTP);    
        }
        else{
            ServicePrevu value = new ServicePrevu(volumeCM,volumeTD,volumeTP);
            heureEnseignement.put(ue,value);
        }
    }
    public void ajouteIntervention(Intervention e){
        planification.add(e);
    }
}