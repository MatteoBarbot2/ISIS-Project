/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSM;

import java.util.Calendar;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mbarbot
 */
public class Test_FFSSM {
    Personne p;
    Club c;
    Moniteur m;
	
    @Before
    public void setUp() {
        m = new Moniteur("2 21 25 65", "Barbot", "Mattéo", null, null, null,1254);
        p = new Personne("2 21 25 65", "Barbot", "Mattéo", null, null, null);
        c = new Club(m, "Toulouse", null);
    }
	
    @Test
    public void testLicenceValide() {
        
    Calendar delivrance = Calendar.getInstance();
    Licence l = new Licence(p, "10", delivrance, 0, c);
    assertTrue( l.estValide(delivrance));
    
    Calendar unMoisApres = (Calendar) delivrance.clone();
    unMoisApres.add(Calendar.MONTH, 1);             
    assertTrue( l.estValide(unMoisApres) );
    
    Calendar unAnApres = (Calendar) delivrance.clone();
    unAnApres.add(Calendar.YEAR, 1);             
    assertTrue( l.estValide(unAnApres) );     
    }
	
    @Test
    public void testLicenceInvalide() {
        
    Calendar delivrance = Calendar.getInstance();
    Licence l = new Licence(p, "10", delivrance, 0, c);
    Calendar d = (Calendar) delivrance.clone();
    d.add(Calendar.YEAR, 1);
    d.add(Calendar.DAY_OF_YEAR, 1);
    assertFalse( l.estValide(d) );
    
    Calendar d2 = (Calendar) delivrance.clone();
    d2.add(Calendar.DAY_OF_YEAR, -1);
    assertFalse( l.estValide(d2) );
    }
    
    @Test
    public void testplongeesconforme() {
    
    Calendar delivrance = Calendar.getInstance();
    Calendar unAnAvant = (Calendar) delivrance.clone();
    unAnAvant.add(Calendar.YEAR, -2);
    Licence l = new Licence(p, "10", delivrance, 0, c);
    Licence l2 = new Licence(p, "10", unAnAvant, 0, c);
    Site s = new Site("Martinique","Trinité");
    Plongee p2 = new Plongee(s,m,delivrance,20,30);
    Plongeur n1 = new Plongeur("2 21 25 65", "Barbot", "Mattéo", null, null, null);
    Plongeur n2 = new Plongeur("2 21 25 65", "Barbot", "Mattéo", null, null, null);
    n1.ajouteLicence(l);
    n2.ajouteLicence(l2);
    p2.ajouteParticipant(n1);
    assertTrue(p2.estConforme());
    p2.ajouteParticipant(n2);
    assertFalse(p2.estConforme());
    c.organisePlongee(p2);
    assertTrue(c.plongeesNonConformes().contains(p2));
    }
}
