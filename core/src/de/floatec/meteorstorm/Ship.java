package de.floatec.meteorstorm;


import com.badlogic.gdx.math.Vector2;

public class Ship extends GameObject{


	public Ship(GameScreen screen) {
        super(screen, "spaceship.png", new Vector2(100f,100f));
	}
}
