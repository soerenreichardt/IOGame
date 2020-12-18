package org.iogame.main;

import org.iogame.model.fleet.Fleet;
import org.iogame.model.planet.Planet;
import org.iogame.model.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GameTest {

    Game game;

    @BeforeEach
    void setup() {
        this.game = new Game("test");
    }

    @Test
    void shouldCreateAndGetGameObjects() {
        Player player = new Player("p1", null);
        Planet planet1 = game.createPlanet(1.0D, 2.0D);
        Planet planet2 = game.createPlanet(5.0D, 7.0D);

        Fleet fleet1 = game.createFleet(1.0D, planet1, player);
        Fleet fleet2 = game.createFleet(2.0D, planet2, player);

        assertThat(game.getFleets().toArray()).containsExactlyInAnyOrder(List.of(fleet1, fleet2).toArray());
        assertThat(game.getPlanets().toArray()).containsExactlyInAnyOrder(List.of(planet1, planet2).toArray());
    }
}