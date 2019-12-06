/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;



public class Liste_effet {
    private Effet effets;
    private int repetitions;
    private Scenario scenarios;

    public Liste_effet(Effet effets, int repetitions, Scenario scenarios) {
        this.effets = effets;
        this.repetitions = repetitions;
        this.scenarios = scenarios;
    }

    public Effet getEffets() {
        return effets;
    }

    public void setEffets(Effet effets) {
        this.effets = effets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public Scenario getScenarios() {
        return scenarios;
    }

    public void setScenarios(Scenario scenarios) {
        this.scenarios = scenarios;
    }
    
}
