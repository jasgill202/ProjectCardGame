package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {
	private String _name;
	public Game _unnamed_Game_1;

	/**
	 * A constructor that allows you to set the player's unique ID
	 * @param aName the unique ID to assign to this player.
	 */
	public Player(String aName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
	 * with logic to play your game.
	 */
	public abstract void play();

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}
}