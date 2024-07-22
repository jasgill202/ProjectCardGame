package ca.sheridancollege.project;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {
	private final String _name;
	public Player _unnamed_Player_5;
	public Result _unnamed_Result_6;
	public DeckOfCards _unnamed_DeckOfCards_7;

	/**
	 * the players of the game
	 */
	public Game(String aName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public abstract void play();

	/**
	 * When the game is over, use this method to declare and display a winning player.
	 */
	public abstract void declareWinner();

	public String getName() {
		return this._name;
	}
}