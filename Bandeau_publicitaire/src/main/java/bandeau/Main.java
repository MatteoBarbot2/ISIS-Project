/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import static java.awt.Color.*;

/**
 *
 * @author mbarbot
 */
public class Main {

    public static void main(String[] args) {

        Bandeau monBandeau = new Bandeau();
        Scenario scenario = new Scenario("DISCO");
        Zoom zoom = new Zoom();
        Rotation rotation = new Rotation();
        ChangerMessage messageRota = new ChangerMessage("On s'echauffe...");
        ChangerMessage messageZoom = new ChangerMessage("Et...");
        ChangerMessage messageDisco = new ChangerMessage("DISCO");
        ForegroundColor texteJaune = new ForegroundColor(YELLOW);
        BackgroundColor fondJaune = new BackgroundColor(YELLOW);
        ForegroundColor texteRouge = new ForegroundColor(RED);
        BackgroundColor fondRouge = new BackgroundColor(RED);
        ForegroundColor texteBleue = new ForegroundColor(BLUE);
        BackgroundColor fondBleue = new BackgroundColor(BLUE);
        ForegroundColor texteVert = new ForegroundColor(GREEN);
        BackgroundColor fondVert = new BackgroundColor(GREEN);
        ForegroundColor texteOrange = new ForegroundColor(ORANGE);
        BackgroundColor fondOrange = new BackgroundColor(ORANGE);
        ForegroundColor texteCyan = new ForegroundColor(CYAN);
        BackgroundColor fondCyan = new BackgroundColor(CYAN);
        ForegroundColor texteMagenta = new ForegroundColor(MAGENTA);
        BackgroundColor fondMagenta = new BackgroundColor(MAGENTA);
        ForegroundColor textePink = new ForegroundColor(PINK);
        BackgroundColor fondPink = new BackgroundColor(PINK);
        
        scenario.ajouterEffet(1, messageRota);
        scenario.ajouterEffet(2, rotation);
        scenario.ajouterEffet(1, messageZoom);
        scenario.ajouterEffet(1, zoom);
        scenario.ajouterEffet(1, messageDisco);
        scenario.ajouterEffet(1, texteJaune);
        scenario.ajouterEffet(1, fondVert);
        scenario.ajouterEffet(1, texteMagenta);
        scenario.ajouterEffet(1, fondCyan);
        scenario.ajouterEffet(1, textePink);
        scenario.ajouterEffet(1, fondJaune);
        scenario.ajouterEffet(1, texteVert);
        scenario.ajouterEffet(1, fondOrange);
        scenario.ajouterEffet(1, texteBleue);
        scenario.ajouterEffet(1, fondRouge);
        scenario.ajouterEffet(1, texteCyan);
        scenario.ajouterEffet(1, fondMagenta);
        scenario.ajouterEffet(1, texteOrange);
        scenario.ajouterEffet(1, fondBleue);
        scenario.ajouterEffet(1, texteRouge);
        scenario.ajouterEffet(1, fondPink);

        scenario.jouerScenario(monBandeau);
    }
}
