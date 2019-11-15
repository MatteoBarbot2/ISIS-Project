package FFSSM;

import java.util.Calendar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LicencePlongeurTest {
	// quelques objets utilitaires pour le test
	Personne p;
	Club c;
	
	@Before
	public void setUp() {
		p = new Personne("1 61 03 34", "Bastide", "Rémi", null, null, null);
		c = new Club(null, "Biarritz", null);
	}
	
	@Test
	public void testLicenceValide() {
		// Date de la licence
		Calendar delivrance = Calendar.getInstance();
		// L'objet à tester
		Licence l = new Licence(p, "10", delivrance, 0, c);
                // La licence est valide au jour de la délivrance
 		assertTrue( l.estValide(delivrance) );
                
		// Date à tester
		// Un mois après la date de délivrance
		Calendar unMoisApres = (Calendar) delivrance.clone();
		unMoisApres.add(Calendar.MONTH, 1);             
		// La licence doit être valide un mois 
		assertTrue( l.estValide(unMoisApres) );
                
		// Date à tester
		// Un an après la date de délivrance
		Calendar unAnApres = (Calendar) delivrance.clone();
		unAnApres.add(Calendar.YEAR, 1);             
		// La licence doit être valide un an 
		assertTrue( l.estValide(unAnApres) );
                
	}
	
	@Test
	public void testLicenceInvalide() {
		// Date de la licence
		Calendar delivrance = Calendar.getInstance();
		// L'objet à tester
		Licence l = new Licence(p, "10", delivrance, 0, c);
		// La licence doit être invalide à cette date
		// Date à tester
		// Un an et un jour après la date de délivrance
		Calendar d = (Calendar) delivrance.clone();
		d.add(Calendar.YEAR, 1);
		d.add(Calendar.DAY_OF_YEAR, 1);
		assertFalse( l.estValide(d) );
                // Date à tester
		// Un jour avant la date de délivrance
		Calendar d2 = (Calendar) delivrance.clone();
		d2.add(Calendar.DAY_OF_YEAR, -1);
		assertFalse( l.estValide(d2) );
	}
}
