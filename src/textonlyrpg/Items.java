package textonlyrpg;

public class Items {
	public int ItemNo = 1;//NoteNo ID
	public String ItemName = "TestItem1";
	public String ItemShortname = "TestItem1";
	//Itemtype?
	int MDmg1 = 0;
	int MDmg2 = 0;
	int MDmg3 = 0;
	int MDmg4 = -5;
	public String ItemDisc = "TestItem1";
	public int ItemType = 1;
	public int ItemType2 = 0;
	public int ItemElement = 0;
	double[] Weaknesses = {/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0};
	int Speed = 0;
	int Luck = 0;
	int Dodge;
	int Critical;
	int Cure = 0;
	//0 = Normal
	//1 = Poison															cheese
	//2 = Cursed: Can't Change Weapon										sugar
	//3 = Sticky: Can't Change Weapon, same as curse, but it looks different  water
	//4 = ???   Enemy HP is displayed as ????								blueberries
	//5 = All   Cures all negative statuses (Restore)						meat
	//6 = Cure/Restore  Cures negative status and returns status back to normal	Bad
	int NegStatus = 0;
	//0 = Normal
	//1 = Poison
	//2 = Cursed: Can't Change Weapon
	//3 = Sticky: Can't Change Weapon, same as curse, but it looks different
	//4 = ???   Enemy HP is displayed as ????
	//5 = All
	//6 = Barrier?  
	int[] StatusResist = new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0};
	//int ItemAmount; 
	static int i = 0;
	
	
	public Items(int ItemNo, String ItemName, String ItemShortName, int MDmg1, int MDmg2, int MDmg3, int MDmg4, String ItemDisc, int ItemType, int ItemType2, int ItemElement, double[] Weaknesses, int Speed, int Luck, int Dodge, int Critical, int Cure, int NegStatus, int[]StatusResist){
		this.ItemNo = ItemNo;
		this.ItemName = ItemName;
		this.ItemShortname = ItemShortName;
		this.MDmg1 = MDmg1;
		this.MDmg2 = MDmg2;
		this.MDmg3 = MDmg3;
		this.MDmg4 = MDmg4;
		this.ItemDisc = ItemDisc;
		this.ItemType = ItemType;
		this.ItemType2 = ItemType2;
		this.ItemElement = ItemElement;
		this.Weaknesses = Weaknesses;
		this.Speed = Speed;
		this.Luck = Luck;
		this.Dodge = Dodge;
		this.Critical = Critical;
		this.Cure = Cure;
		this.NegStatus = NegStatus;
		this.StatusResist = StatusResist;
	}
	
	public int getItemNo(){
		return ItemNo;
	}
	
	public String getItemName(){
		return ItemName;
	}
	
	public int getMDmg1(){
		return MDmg1;
	}
	
	public int getMDmg2(){
		return MDmg2;
	}
	
	public int getMDmg3(){
		return MDmg3;
	}
	
	public int getMDmg4(){
		return MDmg4;
	}
	
	public String getItemDisc(){
		return ItemDisc;
	}
	
	public int getItemType(){
		return ItemType;
	}
	//1 = Potion
	//2 = Food
	//3 = NonEdible Food/Ingredient
	//4 = Metal
	//5 = Alloy
	//6 = Weapon
		//0 = Unarmed
		//1 = Sword
		//2 = Lance
		//3 = Hammer
		//4 = Axe
		//5 = Pole
		//6 = Bomb
	//7 = Weapon(Bomb)
	//8 = Armor
		//0 = Hood
		//1 = Helmet
		//2 = Robe
		//3 = Armor
		//4 = Shirt
		//5 = Gauntlets
		//6 = Gloves
		//7 = Pants
		//8 = Socks
		//9 = Boots
	//9 = Key Item
		//10 = Attack 1 Item
		//11 = Attack All
		//Attack Self?
	
	//SortModes
	//0 = all
	//1 = Potions, Food
	//2 = Ingredients
	//3 = Metal and Alloys
	//4 = Weapons and Armor
	//5 = Key Items
	
	
	//Elements
	//0 = Unarmed
	//1 = Sword
	//2 = Lance
	//3 = Hammer
	//4 = Axe
	//5 = Pole
	//6 = Bomb??
	//7 = Fire
	//8 = Water
	//9 = Wind
	//10 = Earth
	//11 = Electric
	//12 = Ice
	//13 = Light
	//14 = Dark
	//15 = G1(Glitch)
	//16 = G2(Null)
	//17 = G3(Unnamed(MysteryElement)
	//18 = G4(Corrupt-Glitch)
	//19 = G5(Admin)
	//20 = G6(ALL)
	
	//A fireball with the Axe element as a weapon? Reversed Element/physical types?
	
	//Player Defend
	///*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0
	
	public static Items ItemData(int ItemNo, int Var){//, int Var
		
		Items ItemData = new Items(00, "", "", 0, 0, 0, -5, "No Disc", 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});;
//		MInfo = new MonsterData[]{
//				//0 = Cutscene Quest
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//1 = Normal Mode
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//2 = Easy Mode
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//3 = Hard Mode
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//4 = Other Story
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//5 = Glitch
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//6 = Beta
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//				//7 = 7th    ??? for funny cutscene 
//				new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}})
//		};
		
		if(ItemNo == 0){
			ItemData = new Items(00, "", "", 0, 0, 0, -5, "No Disc", 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
			
		if(ItemNo == 1){
			ItemData = new Items(1, "Potion", "Potion", 0, 0, 0, -5, "A Green Potion", 1, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		if(ItemNo == 2){
			ItemData = new Items(2, "Bread Dough", "BrDough", 0, 0, 0, -1, "Uncooked Dough", 2, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		if(ItemNo == 3){
			ItemData = new Items(3, "Bread", "Bread", 0, 0, 0, -5, "Fresh Bread", 2, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
			
		//Toast
		if(ItemNo == 4){
			ItemData = new Items(4, "Toast", "Toast", 0, 0, 0, -6, "Fresh and crispy", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Water
		if(ItemNo == 5){
			ItemData = new Items(5, "Water", "Water", 0, 0, 0, -1, "It's water", 2, 6, 8, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/30, /*Curse*/50, /*Sticky*/100, /*???*/0, /*All*/20, /*Barrier*/0});
		}
	
		//Pancake Mix
		if(ItemNo == 6){
			ItemData = new Items(6, "Pancake Mix", "PancakeMix", 0, 0, 0, -6, "Not very good as is.", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//	Pancakes
			if(ItemNo == 7){
				ItemData = new Items(7, "Pancakes", "Pancakes", 0, 0, 0, -6, "Light and Fluffy", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		
		//	Pancake Mix + Water = Thin Pancakes
			if(ItemNo == 8){
				ItemData = new Items(8, "Thin Pancakes", "ThinPncakes", 0, 0, 0, -6, "Not as good as usual", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			
		//Cheese
		if(ItemNo == 9){
			ItemData = new Items(9, "Cheese", "Cheese", 0, 0, 0, -6, "Has a creamy taste", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//	Cheese = Cheese Fondue
			if(ItemNo == 10){
				ItemData = new Items(10, "Cheese Fondue", "Chz Fondue", 0, 0, 0, -6, "Looks like cheese soup", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			
		//	Bread + Cheese = Cheese Sandwich
			if(ItemNo == 11){
				ItemData = new Items(11, "Cheese Sandwitch", "ChzSndwtch", 0, 0, 0, -6, "Simple but tasty", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Toast + Cheese = Cheese Toast
			if(ItemNo == 12){
				ItemData = new Items(12, "Cheese Toast", "Chz Toast", 0, 0, 0, -6, "Cheese on toast", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Pancake Mix + Cheese = Cheese Pancakes
			if(ItemNo == 13){
				ItemData = new Items(13, "Cheese Pancakes", "ChzPncakes", 0, 0, 0, -6, "Savory Pancakes", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese Sandwich = Grilled Cheese
			if(ItemNo == 14){
				ItemData = new Items(14, "Grilled Cheese", "GrilledChz", 0, 0, 0, -6, "Melty and good!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//Meat
		if(ItemNo == 15){
			ItemData = new Items(15, "Meat", "Meat", 0, 0, 0, -1, "It's not cooked yet", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//	Meat = Chopped Steak
			if(ItemNo == 16){
				ItemData = new Items(16, "Chopped Steak", "Chpd Steak", 0, 0, 0, -1, "It's well seasoned!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Bread Dough + Meat = Stuffed Sandwich? Or maybe something else.
			//0 Cutscene Quest  Meatbread
			if(ItemNo == 17){
				ItemData = new Items(17, "Meatbread", "Meatbread", 0, 0, 0, -1, "Has peices of meat inside!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//1 Normal
			if(ItemNo == 18){
				ItemData = new Items(18, "Meat Bun", "Meat Bun", 0, 0, 0, -1, "The inside is great!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//2 Easy
			if(ItemNo == 19){
				ItemData = new Items(19, "Burger Bytes", "BurgerBytes", 0, 0, 0, -1, "Like eating small burgers", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//3 Hard
			if(ItemNo == 20){
				ItemData = new Items(20, "Meatloaf Stuffed Bread", "Meatloaf", 0, 0, 0, -1, "It's like bread and meat!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//4 Other Story
			if(ItemNo == 21){
				ItemData = new Items(21, "Breading Stuffed Meat", "StuffdMeat", 0, 0, 0, -1, "Stuffed with seasoned bread", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//5 Glitch
			if(ItemNo == 22){
				ItemData = new Items(22, "Meaty Pasta", "Meat Pasta", 0, 0, 0, -1, "It's not bread?", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//6 Beta
			if(ItemNo == 23){
				ItemData = new Items(23, "Stuffed Sandwitch", "StfdSndwch", 0, 0, 0, -1, "the inside is juicy!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			
		//	Meat + Bread = Hamburger       (Bread + Meat)? Order Syntax
			if(ItemNo == 24){
				ItemData = new Items(24, "Hamburger", "Hamburger", 0, 0, 0, -1, "It's meat between bread", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			
		//	Water + Meat = Boiled Meat             boiled beef???   beef stock?  Stew?    soup?
			if(ItemNo == 25){
				ItemData = new Items(25, "Boiled Meat", "BoiledMeat", 0, 0, 0, -1, "It's tender meat!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Bread + Chopped Steak = Steakburger
			if(ItemNo == 26){
				ItemData = new Items(26, "Steakburger", "Steakburgr", 0, 0, 0, -1, "A fancier Hamburger", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Toast + Chopped Steak = Steakhouse Burger
			if(ItemNo == 27){
				ItemData = new Items(27, "Steakhouse Burger", "StkhouseBgr", 0, 0, 0, -1, "Like from a Steakhouse", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chopped Steak + Cheese = Cheese Steak   or Cheesy Steak?
			if(ItemNo == 28){
				ItemData = new Items(28, "Cheese Steak", "Chz Steak", 0, 0, 0, -1, "A cheesy steak dish", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese + Hamburger = Cheeseburger
			if(ItemNo == 29){
				ItemData = new Items(29, "CheeseBurger", "Chzburger", 0, 0, 0, -1, "A hamburger with cheese", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese + Steak burger = Steakburger W. Cheese (third set)
			if(ItemNo == 30){
				ItemData = new Items(30, "Steakburger W Cheese", "ChzStkBrgr", 0, 0, 0, -1, "A Steakburger with cheese", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Bread + Cheese Steak = Cheese steak Sandwich?
			if(ItemNo == 31){
				ItemData = new Items(31, "Cheesesteak Sandwitch", "ChzStkSndw", 0, 0, 0, -1, "Filled with Cheese and Steak!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//Sugar
		if(ItemNo == 32){
			ItemData = new Items(32, "Sugar", "Sugar", 0, 0, 0, -1, "It's just sugar", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/-10, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//	Sugar = Caramel
			if(ItemNo == 33){
				ItemData = new Items(33, "Caramel", "Caramel", 0, 0, 0, -1, "Kind of sticky", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/15, /*Sticky*/-100, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Bread Dough + Sugar = Sweet Rolls    (or something else?)
			if(ItemNo == 34){
				ItemData = new Items(34, "Sweet Rolls", "SweetRolls", 0, 0, 0, -1, "Covered with sugar", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			} //Look kind of like normal rolls, however they are sweeter and have sugar on top
		//	Sugar + Water = Syrup
			if(ItemNo == 35){
				ItemData = new Items(35, "Syrup", "Syrup", 0, 0, 0, -1, "A sticky sweet liquid", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Bread Dough + Syrup = Sticky Buns
			if(ItemNo == 36){
				ItemData = new Items(36, "Sticky Buns", "StickyBuns", 0, 0, 0, -1, "Great for breakfast!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Pancakes + Syrup = Pancakes W. Syrup
			if(ItemNo == 37){
				ItemData = new Items(37, "Pancakes W. Syrup", "Pncaks&Srp", 0, 0, 0, -1, "Classic breakfast food!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Thin Pancakes + Syrup = Thin Pancakes W. Syrup
			if(ItemNo == 38){
				ItemData = new Items(38, "Thin Pancakes W. Syrup", "SrpThnPnck", 0, 0, 0, -1, "The syrup helps a bit...", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese Pancakes + Syrup = Cheese Pancakes W. Syrup
			if(ItemNo == 39){
				ItemData = new Items(39, "Cheese Pnckes W. Syrup", "SrpChzPnck", 0, 0, 0, -1, "Both Sweet and savory!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Caramel = Caramels 
			if(ItemNo == 40){
				ItemData = new Items(40, "Caramels", "Caramels", 0, 0, 0, -1, "chewy candies", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Syrup = Hard Candy
			if(ItemNo == 41){
				ItemData = new Items(41, "Hard Candy", "Hard Candy", 0, 0, 0, -1, "Kind of hard to eat", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Sugar + Syrup = Jelly Candy (Third Set?)
			if(ItemNo == 42){
				ItemData = new Items(42, "Jelly Candy", "Jelly Candy", 0, 0, 0, -1, "A soft sweet candy", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Sugar + Caramels = Sugar Frosted Caramels
			if(ItemNo == 43){
				ItemData = new Items(43, "Sugar Frosted Caramels", "SgrFrtCrml", 0, 0, 0, -1, "Sweeter chewy candies", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Caramel + Syrup = Caramel Syrup?
			if(ItemNo == 44){
				ItemData = new Items(44, "Caramel Syrup", "Crml Syrup", 0, 0, 0, -1, "Caramel flavored Syrup", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Hard Candy = Hard Candies
			if(ItemNo == 45){
				ItemData = new Items(45, "Hard Candies", "HrdCandies", 0, 0, 0, -1, "Tasty, but kind of sharp", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Sugar + Jelly Candy = Jelly Beans
			if(ItemNo == 46){
				ItemData = new Items(46, "Jelly Beans", "JellyBeans", 0, 0, 0, -1, "Small Chewy Candies", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//Chocolate
		if(ItemNo == 47){
			ItemData = new Items(47, "Chocolate", "Chocolate", 0, 0, 0, -1, "Ordinary Chocolate", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//	Chocolate = Chocolate Fondue
			if(ItemNo == 48){
				ItemData = new Items(48, "Chocolate Fondue", "Chc Fondue", 0, 0, 0, -1, "It's like chocolate soup", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Water + Chocolate = Hot Chocolate
			if(ItemNo == 49){
				ItemData = new Items(49, "Hot Chocolate", "HtChocolat", 0, 0, 0, -1, "A tasty chocolate drink", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chocolate + Pancake Mix = Chocolate Pancakes
			if(ItemNo == 50){
				ItemData = new Items(50, "Chocolate Pancakes", "ChcPncakes", 0, 0, 0, -1, "Chocolate flavored pancakes", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Sugar + Chocolate = Chocolate Bar?
			if(ItemNo == 51){
				ItemData = new Items(51, "Chocolate Bar", "Choco Bar", 0, 0, 0, -1, "A sweet bar of candy", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
//			Chocolate + Caramels = Chocolate Dipped Caramels
			if(ItemNo == 52){
				ItemData = new Items(52, "Chocolate Caramels", "ChocoCarml", 0, 0, 0, -1, "Caramels dipped in Chocolate", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chocolate + Syrup = Chocolate Syrup
			if(ItemNo == 53){
				ItemData = new Items(53, "Chocolate Syrup", "ChocoSyrup", 0, 0, 0, -1, "Chocolate flavored Syrup", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Caramel + Hot Chocolate = Caramel Hot Chocolate
			if(ItemNo == 54){
				ItemData = new Items(54, "Caramel Hot Chocolate", "CrmlHtChoc", 0, 0, 0, -1, "Hot Chocolate with caramel!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Pancakes + Chocolate Syrup = Pancakes W. Chocolate Syrup
			if(ItemNo == 55){
				ItemData = new Items(55, "Pancakes W. Choco Syrup", "Pncks&ChSr", 0, 0, 0, -1, "Chocolate goes well with them!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Thin Pancakes + Chocolate Syrup = Thin Pancakes W. Chocolate Syrup
			if(ItemNo == 56){
				ItemData = new Items(56, "Thn Pncks W. Choco Syrup", "TnPks&ChSr", 0, 0, 0, -1, "Still not as good as pancakes", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese Pancakes + Chocolate Syrup = Cheese Pancakes W. Chocolate Syrup
			if(ItemNo == 57){
				ItemData = new Items(57, "Chz Pncks W. Choco Syrup", "CzPks&ChSr", 0, 0, 0, -1, "Savory pancakes with sweet!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chocolate Pancakes + Syrup = Chocolate Pancakes W. Syrup
			if(ItemNo == 58){
				ItemData = new Items(58, "Choco Pancakes W. Syrup", "ChPncks&Sr", 0, 0, 0, -1, "Syrup goes well with chocolate!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chocolate Pancakes + Chocolate Syrup = Chocolate Pancakes W. Chocolate Syrup
			if(ItemNo == 59){
				ItemData = new Items(59, "Chc Pncks W. Chc Syrup", "ChPks&ChSr", 0, 0, 0, -1, "It's Double the chocolate!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
			//	Sugar Frosted Caramels + Chocolate Dipped Caramels = Chocolate Caramel Cake
			if(ItemNo == 60){
				ItemData = new Items(60, "Chocolate Caramel Cake", "ChcCmlCake", 0, 0, 0, -1, "Cake with Choco and Caramel!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//Blueberries
		if(ItemNo == 61){
			ItemData = new Items(61, "Blueberries", "Blueberrys", 0, 0, 0, -1, "Small round blue berries", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//	Bread Dough + Blueberries = Blueberry Bread
			if(ItemNo == 62){
				ItemData = new Items(62, "Blueberry Bread", "BlbryBread", 0, 0, 0, -1, "Filled with blueberries!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Water + Blueberries = Blueberry Juice
			if(ItemNo == 63){
				ItemData = new Items(63, "Blueberry Juice", "BlbryJuice", 0, 0, 0, -1, "Refreshing fruit juice", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Pancake Mix + Blueberries = Blueberry Pancakes   (or something else?)
			if(ItemNo == 64){
				ItemData = new Items(64, "Blueberry Pancakes", "BlbPncakes", 0, 0, 0, -1, "Blueberry flavored pancakes", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chopped Steak + Blueberries = Blueberry Steak?
			if(ItemNo == 65){
				ItemData = new Items(65, "Blueberry Steak", "BlbrySteak", 0, 0, 0, -1, "Covered in sweet sauce!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Syrup + Blueberries = Blueberry Syrup
			if(ItemNo == 66){
				ItemData = new Items(66, "Blueberry Syrup", "BlbrySyrup", 0, 0, 0, -1, "Blueberry flavored Syrup", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chocolate + Blueberries = Chocolate Covered Blueberries
			if(ItemNo == 67){
				ItemData = new Items(67, "Choco Covered B.berries", "ChocoBlbry", 0, 0, 0, -1, "Chocolate coated Blueberries", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese Fondue + Blueberries = Cheese Dipped Blueberries
			if(ItemNo == 68){
				ItemData = new Items(68, "Cheese Dipped Bberries", "ChzBlbrrys", 0, 0, 0, -1, "Cheese coated Blueberries", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Blueberry Juice = Blueberry Concentrate?  Another game?
			if(ItemNo == 69){
				ItemData = new Items(69, "Blueberry Concentrate?", "BluePowder", 0, 0, 0, -1, "Made from dried blueberries", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Blueberry Juice + Syrup = Blueberry Jelly
			if(ItemNo == 70){
				ItemData = new Items(70, "Blueberry Jelly", "BlbryJelly", 0, 0, 0, -1, "A sticky blueberry snack", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Jelly Candy + Blueberry Juice = Blueberry Jelly Candy
			if(ItemNo == 71){
				ItemData = new Items(71, "Blueberry Jelly Candy", "BbJllyCandy", 0, 0, 0, -1, "Soft Blueberry Candy", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Jelly Beans + Blueberry Juice = Blueberry Jelly Beans
			if(ItemNo == 72){
				ItemData = new Items(72, "Blueberry Jelly Beans", "BbJellyBns", 0, 0, 0, -1, "Small Blueberry Candies", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Pancakes + Blueberry Syrup = Pancakes W. Blueberry Syrup
			if(ItemNo == 73){
				ItemData = new Items(73, "Pancakes W. B.b. Syrup", "Pncks&BbSr", 0, 0, 0, -1, "Pancakes with a fruit boost!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Thin Pancakes + Blueberry Syrup = Thin Pancakes W. Blueberry Syrup
			if(ItemNo == 74){
				ItemData = new Items(74, "Thn Pncks W. B.b. Syrup", "TnPks&BbSr", 0, 0, 0, -1, "It's like sad crepes.", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Cheese Pancakes + Blueberry Syrup = Cheese Pancakes W. Blueberry Syrup
			if(ItemNo == 75){
				ItemData = new Items(75, "Chz Pncks W. B.b. Syrup", "CzPks&BbSr", 0, 0, 0, -1, "A Fruit and cheese breakfast", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Chocolate Pancakes + Blueberry Syrup = Chocolate Pancakes W. Blueberry Syrup
			if(ItemNo == 76){
				ItemData = new Items(76, "Chc Pncks W. B.b. Syrup", "ChPks&BbSr", 0, 0, 0, -1, "Chocolate and fruit pancakes", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Blueberry Pancakes + Syrup = Blueberry Pancakes W. Syrup
			if(ItemNo == 77){
				ItemData = new Items(77, "B.b. Pancakes W. Syrup", "BbPncks&Sr", 0, 0, 0, -1, "Blueberry with a bonus!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Blueberry Pancakes + Chocolate Syrup = Blueberry Pancakes W. Chocolate Syrup
			if(ItemNo == 78){
				ItemData = new Items(78, "B.b. Pncks W. Chc Syrup", "BbPks&ChSr", 0, 0, 0, -1, "It's blueberry and chocolate!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Blueberry Pancakes + Blueberry Syrup = Blueberry Pancakes W. Blueberry Syrup
			if(ItemNo == 79){
				ItemData = new Items(79, "B.b. Pncks W. B.b. Syrup", "BbPks&BbSr", 0, 0, 0, -1, "It's double Blueberry flavor!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Toast + Blueberry Jelly = Toast W. Blueberry Jelly
			if(ItemNo == 80){
				ItemData = new Items(80, "Toast W. Blueberry Jelly", "TstW.BbJly", 0, 0, 0, -1, "Jelly goes great on toast!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//Ice order??
		if(ItemNo == 81){
			ItemData = new Items(81, "Ice", "Ice", 0, 0, 0, -1, "It's really cold", 2, 6, 12, new double[]{/*Normal*/1.0, /*Slime*/0.5, /*Ghost*/1.0, /*Golem*/1.0, /*Armor*/1.0, /*Other*/1.0, /*Glitch*/1.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//	Ice = Ice Sculpture
			if(ItemNo == 82){
				ItemData = new Items(82, "Ice Sculpture", "IceSclptre", 0, 0, 0, -1, "It's a statue of me?", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Water + Ice = Ice Water
			if(ItemNo == 83){
				ItemData = new Items(83, "Ice Water", "Ice Water", 0, 0, 0, -1, "Just normal cold water", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Ice Sculpture = Crushed Ice
			if(ItemNo == 84){
				ItemData = new Items(84, "Crushed Ice", "CrushedIce", 0, 0, 0, -1, "...", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Ice + Blueberry Juice = Blueberry Icicle
			if(ItemNo == 85){
				ItemData = new Items(85, "Blueberry Icicle", "BlubrryIce", 0, 0, 0, -1, "A Cold treat", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Ice + Syrup = Shaved Ice
			if(ItemNo == 86){
				ItemData = new Items(86, "Shaved Ice", "Shaved Ice", 0, 0, 0, -1, "A sweet snowy dessert!", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Ice + Blueberry Syrup = Blueberry Shaved Ice
			if(ItemNo == 87){
				ItemData = new Items(87, "Blueberry Shaved Ice", "BbShavdIce", 0, 0, 0, -1, "It's like blueberry snow!", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//	Ice + Chocolate = Refreshing Chocolate Drink
			if(ItemNo == 88){
				ItemData = new Items(88, "Refreshing Choco Drink", "ChocoDrink", 0, 0, 0, -1, "A cold chocolate beverage!", 2, 6, 12, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//hard mode
		//???Caramel Pancakes
			if(ItemNo == 89){
				ItemData = new Items(89, "Caramel Pancakes", "CmlPncakes", 0, 0, 0, -1, "Caramel flavored pancakes", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//???Caramel Bread
			if(ItemNo == 90){
				ItemData = new Items(90, "Caramel Bread", "CarmlBread", 0, 0, 0, -1, "A dessert like Bread", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//???Caramel Filled Chocolate Bar
			if(ItemNo == 91){
				ItemData = new Items(91, "Caramel Chocolate Bar", "CrmChocBar", 0, 0, 0, -1, "Chocolate filled with Caramel", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//???Caramel Pancakes + Syrup = Caramel Pancakes W. Syrup
			if(ItemNo == 92){
				ItemData = new Items(92, "Crml Pancakes W. Syrup", "ClPncks&Sr", 0, 0, 0, -1, "Caramel and syrup", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//???Caramel Pancakes + Chocolate Syrup = Caramel Pancakes W. Chocolate Syrup
			if(ItemNo == 93){
				ItemData = new Items(93, "Crml Pncks W. Chc Syrup", "ClPks&ChSr", 0, 0, 0, -1, "It's caramel and chocolate!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		//???Caramel Pancakes + Blueberry Syrup = Caramel Pancakes W. Blueberry Syrup
			if(ItemNo == 94){
				ItemData = new Items(94, "Crml Pncks W. B.b. Syrup", "ClPks&BbSr", 0, 0, 0, -1, "It's double sweet flavors!", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
			}
		
		if(ItemNo == 95){
			ItemData = new Items(95, "Cloth", "Cloth", 0, 0, 0, -1, "Plain Cloth", 3, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Ghost Cloth
		if(ItemNo == 96){
			ItemData = new Items(96, "Ghost Cloth", "GhostCloth", 0, 0, 0, -1, "Transparent Cloth", 3, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Dark Cloth/Wraith
		if(ItemNo == 97){
			ItemData = new Items(97, "Dark Cloth", "DarkCloth", 0, 0, 0, -1, "Dark infused Cloth", 3, 0, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Slime Jell
		if(ItemNo == 98){
			ItemData = new Items(98, "Slime Jell", "Slime Jell", 0, 0, 0, -1, "Some use it for potions", 3, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Golem Clay
		if(ItemNo == 99){
			ItemData = new Items(99, "Golem Clay", "Golem Clay", 0, 0, 0, -1, "Tough when hardened", 3, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Chain
		if(ItemNo == 100){
			ItemData = new Items(100, "Chain", "Chain", 0, 0, 0, -1, "Feels strangely cold", 3, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Rubber? Beta Mode Only
		if(ItemNo == 101){
			ItemData = new Items(101, "Rubber", "Rubber", 0, 0, 0, -1, "Springy black material", 3, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Metal A     metal often used in guns. Ranged weapons?
		if(ItemNo == 102){
			ItemData = new Items(102, "Metal A", "MetalA", 0, 0, 0, -5, "Used in ranged weapons?", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		if(ItemNo == 103){
			ItemData = new Items(103, "Metal B", "MetalB", 0, 0, 0, -5, "Often used in blades", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}//Durable metal often used in swords.
			
		//Metal C     Hard metal often used in armor.
		if(ItemNo == 104){
			ItemData = new Items(104, "Metal C", "MetalC", 0, 0, 0, -5, "Metal often used in Armor", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Metal E     Light metal often used in throwing weapons.
		if(ItemNo == 105){
			ItemData = new Items(105, "Metal E", "MetalE", 0, 0, 0, -5, "Metal used in thrown weapons", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Alloy A     Alloy often used in Axes     -Metal A + Metal B = Alloy A
		if(ItemNo == 106){
			ItemData = new Items(106, "Alloy A", "AlloyA", 0, 0, 0, -5, "Alloy often used in Axes", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Alloy B     Alloy often used in Lances   -Metal B + Metal C = Alloy B
		if(ItemNo == 107){
			ItemData = new Items(107, "Alloy B", "AlloyB", 0, 0, 0, -5, "Alloy often used in Lances", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Alloy D     Heavy Alloy often used in Hammers   -Metal A + Metal C = Alloy D
		if(ItemNo == 108){
			ItemData = new Items(108, "Alloy D", "AlloyD", 0, 0, 0, -5, "Alloy often used in Hammers", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Alloy I      Alloy often used in Poles   -Metal C + Metal E = Alloy I
		if(ItemNo == 109){
			ItemData = new Items(109, "Alloy I", "AlloyI", 0, 0, 0, -5, "Alloy often used in Poles", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Shiny Metal
		if(ItemNo == 110){
			ItemData = new Items(110, "Shiny Metal", "ShinyMetal", 0, 0, 0, -5, "Doesn't seem very useful.", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Some of the metals not listed are not very useful for adventurers.

		//Gunpowder 
		if(ItemNo == 111){
			ItemData = new Items(111, "Gunpowder", "Gunpowder", 0, 0, 0, -5, "Some type of gunpowder", 3, 0, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		
		//Fire Energy
		if(ItemNo == 112){
			ItemData = new Items(112, "Fire Energy", "FireEnergy", 0, 0, 0, -5, "Hot to the touch", 3, 0, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Water Energy
		if(ItemNo == 113){
			ItemData = new Items(113, "Water Energy", "WaterEnrgy", 0, 0, 0, -5, "Cool to the touch", 3, 0, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Wind Energy
		if(ItemNo == 114){
			ItemData = new Items(114, "Wind Energy", "WindEnergy", 0, 0, 0, -5, "Surprisingly light", 3, 0, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Earth Energy
		if(ItemNo == 115){
			ItemData = new Items(115, "Earth Energy", "EarthEnrgy", 0, 0, 0, -5, "Surprisingly heavy", 3, 0, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Electric Energy
		if(ItemNo == 116){
			ItemData = new Items(116, "Electric Energy", "ElecEnergy", 0, 0, 0, -5, "Crackles with power", 3, 0, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Ice Energy
		if(ItemNo == 117){
			ItemData = new Items(117, "Ice Energy", "Ice Energy", 0, 0, 0, -5, "It's cold! Handle with care", 3, 0, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Light Energy
		if(ItemNo == 118){
			ItemData = new Items(118, "Light Energy", "LightEnrgy", 0, 0, 0, -5, "Gives off light", 3, 0, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, /*Barrier*/0});
		}
		//Dark Energy
		if(ItemNo == 119){
			ItemData = new Items(119, "Darkness Energy", "DarkEnergy", 0, 0, 0, -5, "Gives off shadow", 3, 0, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//	Darkness Energy + Bread = Stale Bread
			if(ItemNo == 120){
				ItemData = new Items(120, "Stale Bread", "StaleBread", 0, 0, 0, -1, "It's kind of dry...", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
		//	Meat + Darkness Energy = Rotten Meat (Needed to fight Ghoul)
			if(ItemNo == 121){
				ItemData = new Items(121, "Rotten Meat", "RottenMeat", 0, 0, 0, -1, "Useful for hunting ghouls", 2, 6, 14, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
		//	Rotten Meat + Light Energy = Meat
			if(ItemNo == 122){
				ItemData = new Items(122, "Cursed Meat", "CursedMeat", 0, 0, 0, -1, "Useful for hunting ghouls", 2, 6, 14, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
		//	Water + Stale Bread = Prison Food (third set)
			if(ItemNo == 123){
				ItemData = new Items(123, "Prison Food?", "PrisonFood", 0, 0, 0, -1, "Is this even cooking?", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
		//	Dry Bread
			if(ItemNo == 124){
				ItemData = new Items(124, "Dry Bread", "Dry Bread", 0, 0, 0, -1, "A desert like Bread", 2, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/6, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
		
		if(ItemNo == 125){
			ItemData = new Items(125, "Sword", "Sword", 0, 0, 0, 5, "A sharp weapon", 6, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Fire Sword
		if(ItemNo == 126){
			ItemData = new Items(126, "Fire Sword", "Fire Sword", 0, 0, 0, 5, "Sword filled with fire", 6, 1, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}//Radiates with fire, filled with fire
		//Water Sword
		if(ItemNo == 127){
			ItemData = new Items(127, "Water Sword", "WaterSword", 0, 0, 0, 5, "Elemental sword of water", 6, 1, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Wind Sword
		if(ItemNo == 128){
			ItemData = new Items(128, "Wind Sword", "Wind Sword", 0, 0, 0, 5, "Elemental sword of wind", 6, 1, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Earth Sword
		if(ItemNo == 129){
			ItemData = new Items(129, "Earth Sword", "EarthSword", 0, 0, 0, 5, "Elemental sword of earth", 6, 1, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Electric Sword
		if(ItemNo == 130){
			ItemData = new Items(130, "Electric Sword", "Elec Sword", 0, 0, 0, 5, "Elemental sword of lightning", 6, 1, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Ice Sword
		if(ItemNo == 131){
			ItemData = new Items(131, "Ice Sword", "Ice Sword", 0, 0, 0, 5, "Elemental sword of ice", 6, 1, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Light Sword
		if(ItemNo == 132){
			ItemData = new Items(132, "Light Sword", "LightSword", 0, 0, 0, 5, "Radiates with light", 6, 1, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Dark Sword
		if(ItemNo == 133){
			ItemData = new Items(133, "Dark Sword", "DarkSword", 0, 0, 0, 5, "Radiates darkness", 6, 1, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}

		//Glitch Sword
		if(ItemNo == 134){
			ItemData = new Items(134, "Sw0rd", "Sw0rd", 0, 0, 0, 5, "A sword weapon", 6, 1, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Null Sword
		if(ItemNo == 135){
			ItemData = new Items(135, "NULL Sword", "    Sword", 0, 0, 0, 5, "", 6, 1, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Unnamed(mysteryElement) Sword
		if(ItemNo == 136){
			ItemData = new Items(136, "Mysterious Sword", "MystrySwrd", 0, 0, 0, 5, "Faintly glows", 6, 1, 17, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Corrupt(Glitch) Sword
		if(ItemNo == 137){
			ItemData = new Items(137, "Corroded Sword", "CrrddSword", 0, 0, 0, 5, "overly heavy", 6, 1, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Admin Sword
		if(ItemNo == 138){
			ItemData = new Items(138, "Admin Sword", "AdminSword", 0, 0, 0, 0, "DefaultItemText", 6, 1, 19, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//All Element Sword
		if(ItemNo == 139){
			ItemData = new Items(139, "All Sword", "All Sword", 0, 0, 0, 5, "Contains all elements!", 6, 1, 20, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Lance        
		if(ItemNo == 140){
			ItemData = new Items(140, "Lance", "Lance", 0, 0, 0, 5, "A long Weapon", 6, 2, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Fire Lance
		if(ItemNo == 141){
			ItemData = new Items(141, "Fire Lance", "Fire Lance", 0, 0, 0, 5, "Elemental fire lance", 6, 2, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Water Lance
		if(ItemNo == 142){
			ItemData = new Items(142, "Water Lance", "WaterLance", 0, 0, 0, 5, "A lance with water power", 6, 2, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Wind Lance
		if(ItemNo == 143){
			ItemData = new Items(143, "Wind Lance", "Wind Lance", 0, 0, 0, 5, "Elemental wind lance", 6, 2, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Earth Lance
		if(ItemNo == 144){
			ItemData = new Items(144, "Earth Lance", "EarthLance", 0, 0, 0, 5, "Elemental earth lance", 6, 2, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Electric Lance
		if(ItemNo == 145){
			ItemData = new Items(145, "Electric Lance", "Elec Lance", 0, 0, 0, 5, "Lance filled with lightning", 6, 2, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Ice Lance
		if(ItemNo == 146){
			ItemData = new Items(146, "Ice Lance", "Ice Lance", 0, 0, 0, 5, "Elemental ice lance", 6, 2, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Light Lance
		if(ItemNo == 147){//146
			ItemData = new Items(147, "Light Lance", "LightLance", 0, 0, 0, 5, "Elemental light lance", 6, 2, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Dark Lance
		if(ItemNo == 148){
			ItemData = new Items(148, "Dark Lance", "Dark Lance", 0, 0, 0, 5, "Elemental dark lance", 6, 2, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Axe    
		if(ItemNo == 149){
			ItemData = new Items(149, "Axe", "Axe", 0, 0, 0, 5, "A wide Weapon", 6, 4, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Fire Axe  
		if(ItemNo == 150){
			ItemData = new Items(150, "Fire Axe", "Fire Axe", 0, 0, 0, 5, "Elemental fire axe", 6, 4, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Water Axe  
		if(ItemNo == 151){
			ItemData = new Items(151, "Water Axe", "Water Axe", 0, 0, 0, 5, "Elemental water axe", 6, 4, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Wind Axe  
		if(ItemNo == 152){
			ItemData = new Items(152, "Wind Axe", "Wind Axe", 0, 0, 0, 5, "Axe that swings with gale force!", 6, 4, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Earth Axe  
		if(ItemNo == 153){
			ItemData = new Items(153, "Earth Axe", "Earth Axe", 0, 0, 0,-5, "Elemental earth axe", 6, 4, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Electric Axe  
		if(ItemNo == 154){
			ItemData = new Items(154, "Electric Axe", "Elec Axe", 0, 0, 0, 5, "Elemental lightning axe", 6, 4, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Ice Axe  
		if(ItemNo == 155){
			ItemData = new Items(155, "Ice Axe", "Ice Axe", 0, 0, 0, 5, "Elemental ice axe", 6, 4, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Light Axe  
		if(ItemNo == 156){
			ItemData = new Items(156, "Light Axe", "Light Axe", 0, 0, 0, 5, "Elemental light axe", 6, 4, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Dark Axe  
		if(ItemNo == 157){
			ItemData = new Items(157, "Dark Axe", "Dark Axe", 0, 0, 0, 5, "Elemental dark axe", 6, 4, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Hammer    
		if(ItemNo == 158){
			ItemData = new Items(158, "Hammer", "Hammer", 0, 0, 0, 5, "A heavy Weapon", 6, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Fire Hammer  
		if(ItemNo == 159){
			ItemData = new Items(159, "Fire Hammer", "FireHammer", 0, 0, 0, 5, "Elemental fire hammer", 6, 3, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Water Hammer  
		if(ItemNo == 160){
			ItemData = new Items(160, "Water Hammer", "WtrHammer", 0, 0, 0, 5, "Elemental water hammer", 6, 3, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Wind Hammer
		if(ItemNo == 161){
			ItemData = new Items(161, "Wind Hammer", "WindHammer", 0, 0, 0, 5, "Elemental wind hammer", 6, 3, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Earth Hammer  
		if(ItemNo == 162){
			ItemData = new Items(162, "Earth Hammer", "ErthHammer", 0, 0, 0, 5, "It quakes with earth!", 6, 3, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Electric Hammer
		if(ItemNo == 163){
			ItemData = new Items(163, "Lightning Hammer", "ElecHammer", 0, 0, 0, 5, "Elemental lightning hammer", 6, 3, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Ice Hammer  
		if(ItemNo == 164){
			ItemData = new Items(164, "Ice Hammer", "Ice Hammer", 0, 0, 0, 5, "Elemental ice hammer", 6, 3, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Light Hammer  
		if(ItemNo == 165){
			ItemData = new Items(165, "Light Hammer", "LightHammr", 0, 0, 0, 5, "Elemental light hammer", 6, 3, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Dark Hammer  
		if(ItemNo == 166){
			ItemData = new Items(166, "Dark Hammer", "DarkHammer", 0, 0, 0, 5, "Elemental dark hammer", 6, 3, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Pole        
		if(ItemNo == 167){
			ItemData = new Items(167, "Pole", "Pole", 0, 0, 0, 5, "A light Weapon", 6, 5, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Fire Pole  
		if(ItemNo == 168){
			ItemData = new Items(168, "Fire Pole", "Fire Pole", 0, 0, 0, 5, "Elemental fire pole", 6, 5, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Water Pole  
		if(ItemNo == 169){
			ItemData = new Items(169, "Water Pole", "Water Pole", 0, 0, 0, 5, "Elemental water pole", 6, 5, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Wind Pole  
		if(ItemNo == 170){
			ItemData = new Items(170, "Wind Pole", "Wind Pole", 0, 0, 0, 5, "Elemental wind pole", 6, 5, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Earth Pole  
		if(ItemNo == 171){
			ItemData = new Items(171, "Earth Pole", "Earth Pole", 0, 0, 0, 5, "Elemental earth pole", 6, 5, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Electric Pole  
		if(ItemNo == 172){
			ItemData = new Items(172, "Lightning Pole", "Elec Pole", 0, 0, 0, 5, "Elemental lightning pole", 6, 5, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Ice Pole  
		if(ItemNo == 173){
			ItemData = new Items(173, "Ice Pole", "Ice Pole", 0, 0, 0, 5, "Elemental ice pole", 6, 5, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Light Pole  
		if(ItemNo == 174){
			ItemData = new Items(174, "Light Pole", "Light Pole", 0, 0, 0, 5, "Elemental light pole", 6, 5, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Dark Pole  
		if(ItemNo == 175){
			ItemData = new Items(175, "Dark Pole", "Dark Pole", 0, 0, 0, 5, "Elemental dark pole", 6, 5, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Armor
			//Cloth
			//Ghost Cloth
			//Wraith/Dark Cloth
			//Chain
			//Slime
			//Ghost
			//Golem
			//Normal Metal
			//Elemental    includes Shining/Light Armor   and Ice
			//Glitched
			//Pancake
			//Null
			//Blueberry
			//Mystery Armor
			//Corrupt Armor
			//Admin Armor
			//All / Cheat Armor
		
		//Armor: Cloth
		
		//Hood
		if(ItemNo == 176){
			ItemData = new Items(176, "Hood", "Hood", 0, 0, 0, -2, "Sometimes worn over helmets", 8, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Robe
		if(ItemNo == 177){
			ItemData = new Items(177, "Robe", "Robe", 0, 0, 0, -2, "Can be worn like a cape", 8, 2, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Shirt
		if(ItemNo == 178){
			ItemData = new Items(178, "Shirt", "Shirt", 0, 0, 0, -1, "Offers little protection", 8, 4, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		if(ItemNo == 179){
			ItemData = new Items(179, "Gloves", "Glove", 0, 0, 0, -2, "Protective gloves", 8, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Pants
		if(ItemNo == 180){
			ItemData = new Items(180, "Pants", "Pants", 0, 0, 0, -1, "Why wear one pair?", 8, 7, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Socks
		if(ItemNo == 181){
			ItemData = new Items(181, "Socks", "Socks", 0, 0, 0, -1, "May help a little?", 8, 8, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Armor: Ghost Cloth
		
		//Ghost Hood
		if(ItemNo == 182){
			ItemData = new Items(182, "Ghost Hood", "Ghost Hood", 0, 0, 0, -2, "Gives off a ghostly glow", 8, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/2, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Ghost Robe
		if(ItemNo == 183){
			ItemData = new Items(183, "Ghost Robe", "Ghost Robe", 0, 0, 0, -2, "Flutters even without wind", 8, 2, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/2, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Ghost Shirt
		if(ItemNo == 184){
			ItemData = new Items(184, "Ghost Shirt", "GhostShirt", 0, 0, 0, -1, "Surprisingly durable", 8, 4, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/2, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		if(ItemNo == 185){
			ItemData = new Items(185, "GhostGloves", "GhostGlove", 0, 0, 0, -2, "Protective gloves", 8, 6, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/2, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Ghost Pants
		if(ItemNo == 186){
			ItemData = new Items(186, "Ghost Pants", "GhostPants", 0, 0, 0, -1, "Gives off a faint mist", 8, 7, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/2, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Ghost Socks
		if(ItemNo == 187){
			ItemData = new Items(187, "Ghost Socks", "GhostSocks", 0, 0, 0, -1, "Really soft", 8, 8, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/2, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Armor: Dark Cloth
		
		//Dark Hood
		if(ItemNo == 188){
			ItemData = new Items(188, "Dark Hood", "Dark Hood", 0, 0, 0, -2, "obscures the face even in day", 8, 0, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Dark Robe
		if(ItemNo == 189){
			ItemData = new Items(189, "Dark Robe", "Dark Robe", 0, 0, 0, -2, "Doesn't make a sound...", 8, 2, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Dark Shirt
		if(ItemNo == 190){
			ItemData = new Items(190, "Dark Shirt", "Dark Shirt", 0, 0, 0, -1, "Can protect against sunlight", 8, 4, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		if(ItemNo == 191){
			ItemData = new Items(191, "Dark Gloves", "DarkGloves", 0, 0, 0, -2, "gives off a dark mist", 8, 6, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Dark Pants
		if(ItemNo == 192){
			ItemData = new Items(192, "Dark Pants", "DarkPants", 0, 0, 0, -1, "Suprisingly heavy for pants", 8, 7, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Dark Socks
		if(ItemNo == 193){
			ItemData = new Items(193, "Dark Socks", "Dark Socks", 0, 0, 0, -1, "They feel soft and cool", 8, 8, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
				
		//Armor: Chain
		
		//Chain Hood
		if(ItemNo == 194){
			ItemData = new Items(194, "Chain Hood", "Chain Hood", 0, 0, 0, -2, "Choice armor for Rangers", 8, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0});
		}
				
		//Chain Robe
		if(ItemNo == 195){
			ItemData = new Items(195, "Chain Robe", "Chain Robe", 0, 0, 0, -2, "Heavy for light armor...", 8, 2, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Chain Armor
		if(ItemNo == 196){
			ItemData = new Items(196, "Chain Armor", "ChainArmor", 0, 0, 0, -1, "Armor made from chain", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Slime Armor
		if(ItemNo == 197){
			ItemData = new Items(197, "Slime Armor", "SlimeArmor", 0, 0, 0, -1, "Transparent green", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Golem Armor
		if(ItemNo == 198){
			ItemData = new Items(198, "Golem Armor", "GolemArmor", 0, 0, 0, -1, "Sturdy rock-like armor", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Ice?
		if(ItemNo == 199){
			ItemData = new Items(199, "Icy Helmet", "Ice Helmet", 0, 0, 0, -1, "Helmet made of ice", 8, 1, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 200){
			ItemData = new Items(200, "Icy Armor", "Ice Armor", 0, 0, 0, -1, "Armor made of ice", 8, 3, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 201){
			ItemData = new Items(201, "Icy Gauntlets", "IceGauntlt", 0, 0, 0, -1, "Gauntlets made of ice", 8, 5, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 202){
			ItemData = new Items(202, "Icy Boots", "Ice Boots", 0, 0, 0, -1, "Dangerously slippery", 8, 9, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Rubber Armor
		if(ItemNo == 203){
			ItemData = new Items(203, "Rubber Armor", "RubberArmr", 0, 0, 0, -1, "Armor made from rubber", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/2.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}

		//Pancake Armor
		if(ItemNo == 204){
			ItemData = new Items(204, "Pancake Armor", "PncakArmor", 0, 0, 0, -1, "Armor made of pancakes?", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 205){
			ItemData = new Items(205, "Pancake Armor W. Syrup", "PnckArmrSr", 0, 0, 0, -1, "Enhanced with hard coating", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Armor: Normal (It's average armor, not "Normal Armor"
		if(ItemNo == 206){
			ItemData = new Items(206, "Helmet", "Helmet", 0, 0, 0, -1, "Head Armor", 8, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 207){
			ItemData = new Items(207, "Armor", "Armor", 0, 0, 0, -1, "Body Armor", 8, 3, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 208){
			ItemData = new Items(208, "Gauntlets", "Guantlets", 0, 0, 0, -1, "Hand Armor", 8, 5, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 209){
			ItemData = new Items(209, "Boots", "Boots", 0, 0, 0, -1, "Foot Armor", 8, 9, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Fire
		if(ItemNo == 210){
			ItemData = new Items(210, "Fire Helmet", "FireHelmet", 0, 0, 0, -1, "Elemental Fire head armor", 8, 1, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.3, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 211){
			ItemData = new Items(211, "Fire Armor", "Fire Armor", 0, 0, 0, -1, "Elemental Fire body Armor", 8, 3, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.3, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 212){
			ItemData = new Items(212, "Fire Gauntlets", "FireGntlts", 0, 0, 0, -1, "Elemental Fire hand Armor", 8, 5, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.3, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 213){
			ItemData = new Items(213, "Fire Boots", "Fire Boots", 0, 0, 0, -1, "Elemental Fire foot Armor", 8, 9, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.3, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}

		//Water 
		if(ItemNo == 214){
			ItemData = new Items(214, "Water Helmet", "Water Helm", 0, 0, 0, -1, "Elemental Water head armor", 8, 1, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.3, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/2.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/5.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/100, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 215){
			ItemData = new Items(215, "Water Armor", "WaterArmor", 0, 0, 0, -1, "Elemental Water body Armor", 8, 3, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.3, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/2.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/5.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/100, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 216){
			ItemData = new Items(216, "Water Gauntlets", "WaterGnlts", 0, 0, 0, -1, "Elemental Water hand Armor", 8, 5, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.3, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/2.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/5.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/100, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 217){
			ItemData = new Items(217, "Water Boots", "WaterBoots", 0, 0, 0, -1, "Elemental Water foot Armor", 8, 9, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.3, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/2.0, /*Ice*/2.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/5.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/100, /*???*/0, /*All*/0, 0});
		}
		
		//Wind 
		if(ItemNo == 218){
			ItemData = new Items(218, "Wind Helmet", "WindHelmet", 0, 0, 0, -1, "Elemental Wind head armor", 8, 1, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.3, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 219){
			ItemData = new Items(219, "Wind Armor", "Wind Armor", 0, 0, 0, -1, "Elemental Wind body Armor", 8, 3, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.3, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 220){
			ItemData = new Items(220, "Wind Gauntlets", "WindGntlts", 0, 0, 0, -1, "Elemental Wind hand Armor", 8, 5, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.3, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 221){
			ItemData = new Items(221, "Wind Boots", "Wind Boots", 0, 0, 0, -1, "Elemental Wind foot Armor", 8, 9, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.3, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Earth 
		if(ItemNo == 222){
			ItemData = new Items(222, "Earth Helmet", "ErthHelmet", 0, 0, 0, -1, "Elemental Earth head armor", 8, 1, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.3, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 223){
			ItemData = new Items(223, "Earth Armor", "EarthArmor", 0, 0, 0, -1, "Elemental Earth body Armor", 8, 3, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.3, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 224){
			ItemData = new Items(224, "Earth Gauntlets", "ErthGntlts", 0, 0, 0, -1, "Elemental Earth hand Armor", 8, 5, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.3, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 225){
			ItemData = new Items(225, "Earth Boots", "EarthBoots", 0, 0, 0, -1, "Elemental Earth foot Armor", 8, 9, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.3, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Electric 
		if(ItemNo == 226){
			ItemData = new Items(226, "Electric Helmet", "ElecHelmet", 0, 0, 0, -1, "Elemental Electric head armor", 8, 1, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 227){
			ItemData = new Items(227, "Electric Armor", "Elec Armor", 0, 0, 0, -1, "Elemental Electric body Armor", 8, 3, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 228){
			ItemData = new Items(228, "Electric Gauntlets", "ElecGntlts", 0, 0, 0, -1, "Elemental Electric hand Armor", 8, 5, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 229){
			ItemData = new Items(229, "Electric Boots", "Elec Boots", 0, 0, 0, -1, "Elemental Electric foot Armor", 8, 9, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Ice  
		if(ItemNo == 230){
			ItemData = new Items(230, "Ice Helmet", "Ice Helmet", 0, 0, 0, -1, "Elemental Ice head armor", 8, 1, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 231){
			ItemData = new Items(231, "Ice Armor", "Ice Armor", 0, 0, 0, -1, "Elemental Ice body Armor", 8, 3, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 232){
			ItemData = new Items(232, "Ice Gauntlets", "IceGntlts", 0, 0, 0, -1, "Elemental Ice hand Armor", 8, 5, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 233){
			ItemData = new Items(233, "Ice Boots", "Ice Boots", 0, 0, 0, -1, "Elemental Ice foot Armor", 8, 9, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Light Shining armor??
		if(ItemNo == 234){
			ItemData = new Items(234, "Light Helmet", "LghtHelmet", 0, 0, 0, -1, "Elemental Light head armor", 8, 1, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/1.0, /*Dark*/2.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/200, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 235){
			ItemData = new Items(235, "Light Armor", "LightArmor", 0, 0, 0, -1, "Elemental Light body Armor", 8, 3, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/2.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/200, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 236){
			ItemData = new Items(236, "Light Gauntlets", "LghtGntlts", 0, 0, 0, -1, "Elemental Light hand Armor", 8, 5, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/2.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/200, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 237){
			ItemData = new Items(237, "Shining Boots", "LightBoots", 0, 0, 0, -1, "Elemental Light foot Armor", 8, 9, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/2.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/200, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Dark  
		if(ItemNo == 238){
			ItemData = new Items(238, "Dark Helmet", "DarkHelmet", 0, 0, 0, -1, "Elemental Dark head armor", 8, 1, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 239){
			ItemData = new Items(239, "Dark Armor", "Dark Armor", 0, 0, 0, -1, "Elemental Dark body Armor", 8, 3, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 240){
			ItemData = new Items(240, "Dark Gauntlets", "DarkGntlts", 0, 0, 0, -1, "Elemental Dark hand Armor", 8, 5, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 241){
			ItemData = new Items(241, "Dark Boots", "Dark Boots", 0, 0, 0, -1, "Elemental Dark foot Armor", 8, 9, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Glitched
		if(ItemNo == 242){
			ItemData = new Items(242, "Boots", "Boots", 0, 0, 0, -1, "Actually head armor?", 8, 1, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 243){
			ItemData = new Items(243, "Shield", "Shield", 0, 0, 0, -1, "Actually body Armor?", 8, 3, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 244){
			ItemData = new Items(244, "Armor", "Armor", 0, 0, 0, -1, "Actually hand Armor?", 8, 5, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 245){
			ItemData = new Items(245, "Gauntlets", "Gauntlets", 0, 0, 0, -1, "Actually foot Armor?", 8, 9, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 246){
			ItemData = new Items(246, "Helmet", "Helmet", 0, 0, 0, -1, "Actually hand Armor?", 8, 5, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Null
		if(ItemNo == 247){
			ItemData = new Items(247, "NULL Helmet", "NULLHelmet", 0, 0, 0, -1, "Elemental      head armor", 8, 1, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 248){
			ItemData = new Items(248, "NULL Armor", "NULL Armor", 0, 0, 0, -1, "Elemental      body Armor", 8, 3, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 249){
			ItemData = new Items(249, "NULL Gauntlets", "NULLGntlts", 0, 0, 0, -1, "Elemental      hand Armor", 8, 5, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 250){
			ItemData = new Items(250, "NULL Boots", "NULL Boots", 0, 0, 0, -1, "Elemental      foot Armor", 8, 9, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Blueberry
		if(ItemNo == 251){
			ItemData = new Items(251, "Mystery Armor", "MystryArmr", 0, 0, 0, -1, "Faintly glows", 8, 3, 17, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Mystery Armor
		if(ItemNo == 252){
			ItemData = new Items(252, "Blueberry Armor", "BlueBArmor", 0, 0, 0, -1, "Strange blue colored armor", 8, 3, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/10, /*Dodge*/5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Corrupt Armor
		if(ItemNo == 253){
			ItemData = new Items(253, "Corroded Helmet", "CorrHelmet", 0, 0, 0, -1, "Damaged head armor", 8, 1, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/-5, /*Dodge*/-5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}  
		if(ItemNo == 254){
			ItemData = new Items(254, "Corroded Armor", "Corr Armor", 0, 0, 0, -1, "Damaged body Armor", 8, 3, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/-5, /*Dodge*/-5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 255){
			ItemData = new Items(255, "Corroded Gauntlets", "CorrGntlts", 0, 0, 0, -1, "Damaged hand Armor", 8, 5, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/-5, /*Dodge*/-5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 256){
			ItemData = new Items(256, "Corroded Boots", "Corr Boots", 0, 0, 0, -1, "Damaged foot Armor", 8, 9, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/-5, /*Dodge*/-5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Admin Armor
		if(ItemNo == 257){
			ItemData = new Items(257, "Admin Armor", "AdminArmor", 0, 0, 0, -1, "Highly reflective", 8, 3, 19, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//All / Cheat Armor
		if(ItemNo == 258){
			ItemData = new Items(258, "Everything Armor", "All Armor", 0, 0, 0, -1, "Rainbow colored armor", 8, 3, 20, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Key Items
		//0
		if(ItemNo == 259){
			ItemData = new Items(259, "Floor0 Key", "Floor0Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//1
		if(ItemNo == 260){
			ItemData = new Items(260, "Floor1 Key", "Floor1Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//2
		if(ItemNo == 261){
			ItemData = new Items(261, "Floor2 Key", "Floor2Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//3
		if(ItemNo == 262){
			ItemData = new Items(262, "Floor3 Key", "Floor3Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//4
		if(ItemNo == 263){
			ItemData = new Items(263, "Floor4 Key", "Floor4Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//5
		if(ItemNo == 264){
			ItemData = new Items(264, "Floor5 Key", "Floor5Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//6
		if(ItemNo == 265){
			ItemData = new Items(265, "Floor6 Key", "Floor6Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//7
		if(ItemNo == 266){
			ItemData = new Items(266, "Floor7 Key", "Floor7Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//8
		if(ItemNo == 267){
			ItemData = new Items(267, "Floor8 Key", "Floor8Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//9
		if(ItemNo == 268){
			ItemData = new Items(268, "Floor9 Key", "Floor9Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//10
		if(ItemNo == 269){
			ItemData = new Items(269, "Floor10 Key", "Floor10Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//11
		if(ItemNo == 270){
			ItemData = new Items(270, "Floor11 Key", "Floor11Key", 0, 0, 0, 5, "A large key", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Bombs?? Order?
		if(ItemNo == 271){
			ItemData = new Items(271, "Bomb", "Bomb", 0, 0, 0, 5, "An explosive! Damage all foes!", 7, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Fire Bomb
		if(ItemNo == 272){
			ItemData = new Items(272, "Fire Bomb", "Fire Bomb", 0, 0, 0, 5, "Explodes with fire! Hits all foes!", 7, 1, 7, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Water Bomb
		if(ItemNo == 273){
			ItemData = new Items(273, "Water Bomb", "Water Bomb", 0, 0, 0, 5, "Explodes with water! Hits all!", 7, 1, 8, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Wind Bomb
		if(ItemNo == 274){
			ItemData = new Items(274, "Wind Bomb", "Wind Bomb", 0, 0, 0, 5, "Explodes with wind! Hits all!", 7, 1, 9, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Earth Bomb
		if(ItemNo == 275){
			ItemData = new Items(275, "Earth Bomb", "Earth Bomb", 0, 0, 0, 5, "Explodes with earth! Hits all!", 7, 1, 10, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Electric Bomb
		if(ItemNo == 276){
			ItemData = new Items(276, "Electric Bomb", "Elec Bomb", 0, 0, 0, 5, "Explodes with lightning! Hits all!", 7, 1, 11, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Ice Bomb
		if(ItemNo == 277){
			ItemData = new Items(277, "Ice Bomb", "Ice Bomb", 0, 0, 0, 5, "Explodes with ice! Hits all foes!", 7, 1, 12, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Light Bomb
		if(ItemNo == 278){
			ItemData = new Items(278, "Light Bomb", "Light Bomb", 0, 0, 0, 5, "Explodes with light! Hits all!", 7, 1, 13, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		//Dark Bomb
		if(ItemNo == 279){
			ItemData = new Items(279, "Dark Bomb", "Wind Bomb", 0, 0, 0, 5, "Explodes with darkness!", 7, 1, 14, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		
		//Glitch
		if(ItemNo == 280){
			ItemData = new Items(280, "[Glitch]", "Glitch", 0, 0, 0, -5, "What is this?", 3, 0, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Null
		if(ItemNo == 281){
			ItemData = new Items(281, "NULL", "NULL", 0, 0, 0, -5, "", 3, 0, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Beta Corrupt Item
		if(ItemNo == 282){
			ItemData = new Items(282, "RustyMetal", "HvyM3tle", 0, 0, 0, -5, "Looks l+ke R_sted MEt l", 3, 0, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/-5, /*Dodge*/-5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Corrupt Item
		if(ItemNo == 283){
			ItemData = new Items(283, "Item/Corr.Name", "HvyM3tle", 0, 0, 0, -5, "Lo_ks@l+ke R_sted MEt_l", 3, 0, 18, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/-5, /*Dodge*/-5, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Mystery Item
		if(ItemNo == 284){
			ItemData = new Items(284, "?", "?", 0, 0, 0, -5, "?????", 3, 0, 17, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Sparkling?
		//Crystal
		
		
		//	Pancake Mix + Null = Null Pancakes
		if(ItemNo == 285){
			ItemData = new Items(285, "NULL Pancakes", "NullPncakes", 0, 0, 0, -6, "...", 2, 6, 16, new double[]{/*Normal*/0.0, /*Slime*/0.5, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/-0.2, /*Water*/0.2, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.2, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/5, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//???
		if(ItemNo == 286){
			ItemData = new Items(286, "XPotion", "XPotion", 0, 0, 0, -5, "A Green Potion", 1, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/5, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Unfinished Item
		if(ItemNo == 287){
			ItemData = new Items(287, "Unfinished Item", "Unfinished", 0, 0, 0, -5, "", 3, 0, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Unused Item
		if(ItemNo == 288){
			ItemData = new Items(288, "Unused Item", "UnusedItem", 0, 0, 0, -5, "", 3, 0, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Other items// Debug and test stuff
		
		if(ItemNo == 289){//288
			if(Var == 6){
				ItemData = new Items(289, "TestItem1", "TestItem1", 0, 0, 0, -5, "TestPotion", 1, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
			else
				ItemData = new Items(289, "TestPotion", "TestPotion", 0, 0, 0, -5, "TestItem1", 1, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 290){//289
			if(Var == 6){
				ItemData = new Items(290, "TestItem2", "TestItem2", 0, 0, -1, 0, "TestIngredient", 2, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//TestFood1
			}
			else
				ItemData = new Items(290, "TestIngredient", "TstIngrdnt", 0, 0, -1, 0, "TestItem2", 2, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//TestFood1
		}
		if(ItemNo == 291){//290
			if(Var == 6){
				ItemData = new Items(291, "TestItem3", "TestItem3", 0, 0, -1, -5, "TestFood", 2, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//TestFood2
			}
			else
				ItemData = new Items(291, "TestFood", "TestFood", 0, 0, -1, -5, "TestItem3", 2, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//TestFood2
		}
		if(ItemNo == 292){//291
			if(Var == 6){
				ItemData = new Items(292, "TestItem4", "TestItem4",0, 0, 0, -1, "TestMetal", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
			else
				ItemData = new Items(292, "TestMetal", "TestMetal",0, 0, 0, -1, "TestItem4", 4, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 293){//292
			if(Var == 6){
				ItemData = new Items(293, "TestItem5", "TestItem5",0,0, 0, 5, "TestWeapon", 6, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
			else
				ItemData = new Items(293, "TestWeapon", "TstWeapn",0,0, 0, 5, "TestItem5", 6, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 294){//293
			if(Var == 6){
				ItemData = new Items(294, "TestItem6", "TestItem6", 0, 0, 0, -5, "TestArmor", 8, 3, 0, new double[]{/*Normal*/4.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0,new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
			else
				ItemData = new Items(294, "TestArmor", "TestArmor", 0, 0, 0, -5, "TestItem6", 8, 3, 0, new double[]{/*Normal*/4.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0,new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 295){//294
			if(Var == 6){
				ItemData = new Items(295, "TestItem7", "TestItem7", 0, 0, 0, -5, "TestKey", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
			}
			else
				ItemData = new Items(295, "TestKey", "TestKey", 0, 0, 0, -5, "TestItem7", 9, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 296){//295
			ItemData = new Items(296, "TestBomb", "TestBomb", 0, 0, 0, 5, "TestItem8", 7, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});//ItemType2 Pierce
		}
		if(ItemNo == 297){//296
			ItemData = new Items(297, "BigBomb", "BigBomb",0, 0, 1, 0, "", 11, 1, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 298){//297
			ItemData = new Items(298, "BugBomb", "BugBomb",0, 0, 0, 5,"Damage one enemy ahead", 10, 1, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		if(ItemNo == 299){//298
			ItemData = new Items(299, "DebugBomb", "DbgBomb",0, 2, 5, 5,"Deals 255 Damage", 1, 0, 19, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//CookItem Item
		if(ItemNo == 300){//299
			ItemData = new Items(99, "CookItem", "CookItem", 0, 0, 0, -5, "", 3, 0, 15, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		//Sold Out Item
		if(ItemNo == 301){//300
			ItemData = new Items(99, "Sold Out", "Sold Out", 0, 0, 0, -5, "Out of stock", 3, 0, 16, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0, 0});
		}
		
		//Sugar Coated Caramels
		//Slime Candy
		//Chocolate Drizzled Pancakes
		//Chocolate Swirl Pancakes
		//biscuits
		//Blueberry Slushi
		
		//Spy Quest Items
		
		
		//ItemData[Total] = new Items(0, "DebugBomb", 0, 2, 5, 5,"Deals 255 Damage", 1, 0, 0);
		//ItemData[Total] = new Items(0, "Default", -9, -9, -9, -9,"TEXT", 1, 0, 0);

		return ItemData;
	}
	
	public static Items[] ItemList(int[] Item1, int SortMode, int Gamemode){
		int ItemTotal = ItemTotal(Item1);
		Items[] ItemData = new Items[ItemTotal];
		//{
		
		//Should proper Item varation stuff be needed? It does if more Gamemode exclusive stuff comes into play
			int i = 0;
			int Total = 0;
			while(i < Item1.length){
				//ItemData[i] = new Items(00, "", "", 0, 0, 0, -5, "No Disc", 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0});
				if(Item1[i] == 1){
					ItemData[Total] = ItemData(i + 1, /*Var*/Gamemode);
					Total = Total + 1;
				}
				//if special condition
				//	Change Item
				//
				i = i + 1;
			}
			
			//ItemData[Total] = new Items(0, "DebugBomb", 0, 2, 5, 5,"Deals 255 Damage", 1, 0, 0);
			//ItemData[Total] = new Items(0, "Default", -9, -9, -9, -9,"TEXT", 1, 0, 0);
		//}
		return ItemData;
	}
	
	public static int ItemNo(int[] Item1Found, int ItemNo){//Please remember, DO NOT USE DIRECTLY WITH ITEMAMOUNT1 unless glitch items
		int Index = 0;
		int i = 0;
		while(i < ItemNo - 1){
			Index = Index + Item1Found[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int ItemTotal(int[] Item1Found){
		int Total = 0;
		int i = 0;
		while(i < Item1Found.length){
			Total = Total + Item1Found[i];
			i = i + 1;
		}
		return Total;
	}
}
