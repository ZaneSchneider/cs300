/*----------------------------------------
 * Class: Map
 * This class will contain an array of tiles to be used for the game
 * Frupal.  Class is not abstract, and needs to be customizable by 
 * the player.
 *
 * ------------------------------------*/

package company;

public class Map {
	
	protected int xSize;
	protected int ySize;
	private Tile[][] area;

	//Standard map constructor
	public Map(){
		this.area = new Tile[10][30];
		this.xSize = 30;
		this.ySize = 10;
		for (int i = 0; i < ySize; i++){
			for (int j = 0; j < xSize; j++){
				this.area[i][j] = new Basic('O', "Plains", 2, 1);
			}
		}
	}

	public void printMap(){
		for (int i = 0; i < this.ySize; i++){
			for (int j = 0; j < this.xSize; j++){
				System.out.print(area[i][j].get_id());
			}
			System.out.println();
		}
	}
}	
