/**
 * Scrabble (APO Project - CMI L1)
 * TilesBag.java - Represents the bag from where we randomly draw the tiles
 * 
 * @author Fabian Devel, Valentin Perignon
 */

public class TilesBag {

	// ---------- Attributs ----------

	/** Array of all letters present in the bag */
	private Tiles[] letters = new Tiles[100];

	// ---------- Constructors ----------

	// TODO: Vérifier s'il existe une méthode plus optimisée

	TilesBag() {
		char letter;
		int value;
		for(int i=0; i<letters.length; i++) {
			// Letters and values
			if(i>=95) { // K, W, X, Y, Z
				value = 10;
				if(i == 99)
					letter = 'Z';
				else if(i==98)
					letter = 'Y';
				else if(i==97)
					letter = 'X';
				else if(i==96)
					letter = 'W';	
				else
					letter = 'K';
			} else if(i >= 93) { // J, Q
				value = 8;
				if(i==94)
					letter = 'Q';
				else
					letter = 'J';
			} else if(i >= 87) { // F, H, V
				value = 4;
				if(i>=91)
					letter = 'V';
				else if(i>=89)
					letter = 'H';
				else
					letter = 'F';
			} else if(i>=81) { // B, C, P
				value = 3;
				if(i>=85)
					letter = 'P';
				else if(i>=83)
					letter = 'C';
				else
					letter = 'B';
			} else if(i>=73) { // D, G, M
				value = 2;
				if(i>=78)
					letter = 'M';
				else if(i>=76)
					letter = 'G';
				else
					letter = 'D';
			} else { // A, E, I, N, O, R, S, T, U, L
				value = 1;
				if(i>=68)
					letter = 'L';
				else if(i>=62)
					letter = 'U';
				else if(i>=56)
					letter = 'T';
				else if(i>=50)
					letter = 'S';
				else if(i>=44)
					letter = 'R';
				else if(i>=38)
					letter = 'O';
				else if(i>=32)
					letter = 'N';
				else if(i>=24)
					letter = 'I';
				else if(i>=15)
					letter = 'A';
				else
					letter = 'E';
			}
			/* Letters and values
			if(i == 46 || (i>=96 && i<= 99)) { // K, W, X, Y, Z
				value = 1;
				if(i == 46)
					letter = 'K';
				else if(i==96)
					letter = 'W';
				else if(i==97)
					letter = 'X';
				else if(i==98)
					letter = 'Y';	
				else
					letter = 'Z';
			} else if((i>=13 && i<=15) || (i==33 || i==34) || (i>=52 && i<=54)) { // D, G, M
				value = 2;
				if(i>=13 && i<=15)
					letter = 'D';
				else if(i==33 || i==34)
					letter = 'G';
				else
					letter = 'M';
			} else if((i>=9 && i<= 12) || (i==67 || i==68)) { // B, C, P
				value = 3;
				if(i>=9 && i<= 10)
					letter = 'B';
				else if(i==11 || i== 12)
					letter = 'C';
				else
					letter = 'P';
			} else if((i==31 || i==32) || (i==35 || i==36) || (i==94 || i==95)) { // F, H, V
				value = 4;
				if(i==31 || i==32)
					letter = 'F';
				else if(i==35 || i==36)
					letter = 'H';
				else
					letter = 'V';
			} else if(i==45 || i==69) { // J, Q
				value = 8;
				if(i==45)
					letter = 'J';
				else
					letter = 'Q';
			} else { // A, E, I, N, O, R, S, T, U, L
				value = 10;
				if(i>=16 && i<=30)
					letter = 'E';
				else if(i>=37 && i<=44)
					letter = 'I';
				else if(i>=47 && i<= 51)
					letter = 'L';
				else if(i>=55 && i<= 60)
					letter = 'N';
				else if(i>=61 && i<= 66)
					letter = 'O';
				else if(i>=70 && i<= 75)
					letter = 'R';
				else if(i>=76 && i<= 81)
					letter = 'S';
				else if(i>=82 && i<= 87)
					letter = 'T';
				else if(i>=88 && i<= 93)
					letter = 'U';
			}*/

			// Put letter in the array
			this.letters[i] = new Tiles(letter, value);
		}
	}

	// ---------- Methods ----------
	/**
	 * Get one tile of the bag
	 * 
	 * @return The tile
	 */
	public Tiles getTile(int numLetters) {
		return this.letters[numLetters];
	}

	/**
	 * Get the array of tiles of the bag
	 * 
	 * @return The array with all the tiles
	 */
	public Tiles[] getTiles() {
		return this.letters;
	}
}