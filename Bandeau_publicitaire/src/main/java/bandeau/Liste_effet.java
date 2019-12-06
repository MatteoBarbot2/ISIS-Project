/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;



public class Liste_effet {
    public Effet effets;
    public int repetitions;
    public Scenario scenarios;

    public Liste_effet(Effet effets, int repetitions, Scenario scenarios) {
        this.effets = effets;
        this.repetitions = repetitions;
        this.scenarios = scenarios;
    }
}
