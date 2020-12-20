package org.iogame.model.battle;

import org.iogame.core.GameObject;
import org.iogame.model.planet.Planet;

public class Battle extends GameObject {
    private Planet planet;

    public Battle(Planet planet) {
        this.planet = planet;
        System.out.println("battle started");
    }

    @Override
    public void update(long delta) {

    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}
