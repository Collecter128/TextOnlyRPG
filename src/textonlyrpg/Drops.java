package textonlyrpg;

public class Drops {
	
	int DropID = 0;
	int DropType = 0;
		//1 = Item
		//2 = Cook
		//3 = Weapon
		//4 = Armorsmith
	String DropNameA = "";
	String DropNameB = "";
	int ItemRecipeDropped = 0;
	int IdDropped;
	//DropID , DropType, DropName Unknown, DropName Known, Item/RecipeDropped

	public Drops(int DropID, int DropType, String DropNameA, String DropNameB, int ItemRecipeDropped){
		this.DropID = DropID;
		this.DropType = DropType;
		this.DropNameA = DropNameA;
		this.DropNameB = DropNameB;
		this.ItemRecipeDropped = ItemRecipeDropped;
	}
	
	public Drops GetDrop(int DropID){
		Drops DropDroppedFromID = new Drops(0, 0, "", "", 0);
		
		if(DropID == 1){
			DropDroppedFromID = new Drops(1, 1, "Potion", "Potion", 1);
		}
		if(DropID == 2){
			DropDroppedFromID = new Drops(2, 1, "Water", "Water", 5);
		}
		
		return DropDroppedFromID;
	}
	
	
}
