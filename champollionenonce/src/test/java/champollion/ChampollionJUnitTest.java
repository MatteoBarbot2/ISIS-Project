package champollion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rbastideg"'t"t"'t"'
 */
public class ChampollionJUnitTest {
	Enseignant untel;
	UE uml, java;
		
	@Before
	public void setUp() {
		untel = new Enseignant("untel", "untel@gmail.com");
		uml = new UE("UML");
		java = new UE("Programmation en java");		
	}
	

	@Test
	public void testNouvelEnseignantSansService() {
		assertEquals(0, untel.heuresPrevues(),0.1);
	}
	
	@Test
	public void testAjouteHeures() {
		untel.ajouteEnseignement(uml, 0, 10.0, 0);
		// Il a maintenant 10 heures prévues pour cette UE
		assertEquals(10.0, untel.heuresPrevuesPourUE(uml),0.1);
		untel.ajouteEnseignement(uml, 0, 20.0, 0);
		// Il a maintenant 10 + 20 heures prévues pour cette UE
		assertEquals(10.0 + 20.0, untel.heuresPrevuesPourUE(uml),0.1);
	}
}
