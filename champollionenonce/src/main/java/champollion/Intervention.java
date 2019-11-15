/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.time.LocalDate;
import java.util.*;

public class Intervention {
    public LocalDate date;
    public double duree;
    public boolean annulee = false;
    public TypeIntervention type;
    public Salle lieu;
    public UE matiere;

    public Intervention(LocalDate date, double duree, TypeIntervention type, Salle lieu, UE matiere) {
        this.date = date;
        this.duree = duree;
        this.type = type;
        this.lieu = lieu;
        this.matiere = matiere;
    }
}
