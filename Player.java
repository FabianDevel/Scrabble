/**
 * Scrabble game (APO project)
 * Player.java 
 * This class represents a player, with his name, his score and his tiles's rack
 * 
 * @author Fabian Devel, Valentin Perignon
 */
public class Player {
	//  Attributs
	private String name;
	private int score;
	private Rack rack;
	
	//builders
	
	// Methods
	toString(){
        Ecran.afficherln(name);
    }
	
}