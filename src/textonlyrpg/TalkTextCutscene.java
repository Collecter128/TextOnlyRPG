package textonlyrpg;

public class TalkTextCutscene {
	
	int CutsceneNo;
	String CutsceneName;
	String CutsceneDesc;
	int[] TextContained;
	int[][] EventsIncluded;
	//1 = find monster
	//2 = find cook
	//3 = unlock note
	//4 = get item
	//5 = find area
	//6 = find money
	//7 = unlock action
	//8 = unlock topic
	//10 = Story Flag
	
	//21 Weapon Recipe
	//22 Armor Recipe
	
	int[] Text1X = {30};
	int[] Text2X = {80};
	//EventData(Areanumber, itemnumber, etc.)
	int CMode;

	public TalkTextCutscene(int CutsceneNo, String CutsceneName, String CutsceneDesc, int[] TextContained, int[][] EventsIncluded, int CMode){//, int[] Text1X, int[] Text2X
		this.CutsceneNo = CutsceneNo;
		this.CutsceneName = CutsceneName;
		this.CutsceneDesc = CutsceneDesc;
		this.TextContained = TextContained;
		this.EventsIncluded = EventsIncluded;
		this.Text1X = Text1X;
		this.Text2X = Text2X;
		this.CMode = CMode;
	}
	
	static TalkTextCutscene NullCutscene = new TalkTextCutscene(0, "NULL", "", new int[]{0}, new int[][]{{0, 0}}, 1); //EventType, EventData
	
	public static TalkTextCutscene CutsceneList(int LoadNo){
		TalkTextCutscene LoadedCutscene = NullCutscene;
		
		if(LoadNo == 0){
			LoadedCutscene = new TalkTextCutscene(0, "NULL", "", new int[]{0}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 26){//Intro Scene
			LoadedCutscene = new TalkTextCutscene(26, "Intro Scene", "Starting a normal new game", new int[]{33, 34, 35, 36, 37, 38, 39}, new int[][]{{0, 0}, {0, 0}, {13, 1}, {7, 3}, {3, 16}, {7, 2}, {3, 15}}, 1);
		}
		if(LoadNo == 1){//Topics1
			LoadedCutscene = new TalkTextCutscene(1, "TestTopic1", "", new int[]{101, 14, 15}, new int[][]{{0, 0}, {0, 0}, {0, 0}}, 1);
		}
		if(LoadNo == 2){//Topics2
			LoadedCutscene = new TalkTextCutscene(2, "TestTopic2", "", new int[]{2}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 3){//Topics3
			LoadedCutscene = new TalkTextCutscene(3, "TestTopic3", "", new int[]{3}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 4){//Topics4
			LoadedCutscene = new TalkTextCutscene(4, "TestTopic4", "", new int[]{4}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 5){//Topics5
			LoadedCutscene = new TalkTextCutscene(5, "TestTopic5", "", new int[]{5}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 6){//Topics6
			LoadedCutscene = new TalkTextCutscene(6, "TestTopic6", "", new int[]{6}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 7){//Topics7
			LoadedCutscene = new TalkTextCutscene(7, "TestTopic7", "", new int[]{7}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 8){//Topics8
			LoadedCutscene = new TalkTextCutscene(8, "TestTopic8", "", new int[]{8}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 9){//Topics9
			LoadedCutscene = new TalkTextCutscene(9, "TestTopic9", "", new int[]{9}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 10){//Topics10
			LoadedCutscene = new TalkTextCutscene(10, "TestTopic10", "", new int[]{10}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 11){//Topics11
			LoadedCutscene = new TalkTextCutscene(11, "TestTopic11", "", new int[]{11}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 12){
			LoadedCutscene = new TalkTextCutscene(12, "", "", new int[]{0}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 13){//BattleCutscene Test
			LoadedCutscene = new TalkTextCutscene(13, "BattleCutscene", "Tests Find Monsters", new int[]{16, 17}, new int[][]{{0, 0}, {1, 20}}, 1);
			//LoadedCutscene = new TalkTextCutscene(13, "BattleCutscene", "Tests Find Monsters", new int[]{16, 17}, new int[][]{{0, 0}, {1, 2}});
		}
		if(LoadNo == 14){//RecipeCutscene Test
			LoadedCutscene = new TalkTextCutscene(14, "RecipeCutscene", "Tests Find Recipe", new int[]{18}, new int[][]{{2, 2}}, 1);
		}
		if(LoadNo == 15){//NoteCutscene Test
			LoadedCutscene = new TalkTextCutscene(15, "NoteCutscene", "Tests Find Note", new int[]{19}, new int[][]{{3, 2}}, 1);
		}
		if(LoadNo == 16){//ItemCutscene Test
			LoadedCutscene = new TalkTextCutscene(16, "ItemCutscene", "Tests Find Item", new int[]{20}, new int[][]{{4, 290}}, 1);   //{4, 279}
		}
		if(LoadNo == 17){//AreaCutscene Test + Boss Battle
			LoadedCutscene = new TalkTextCutscene(17, "AreaCutscene", "Tests Find Area 3", new int[]{21}, new int[][]{{5, 43}}, 1); //5 13
		}
		if(LoadNo == 18){//LoseCookItemsScene
			LoadedCutscene = new TalkTextCutscene(18, "CookLoseItems", "Cooked Items, Mistake", new int[]{22}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 19){//CookedItemScene
			LoadedCutscene = new TalkTextCutscene(19, "CookedItem", "CooksItem", new int[]{23}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 20){//CookedBombScene
			LoadedCutscene = new TalkTextCutscene(19, "CookedBomb", "CooksDebugBomb", new int[]{24}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 21){//Tavern1
			LoadedCutscene = new TalkTextCutscene(20, "Tavern1", "TavernText", new int[]{12}, new int[][]{{0, 0}}, 1);
		}
		if(LoadNo == 22){//Tavern2
			LoadedCutscene = new TalkTextCutscene(21, "Tavern2", "TavernTest", new int[]{13}, new int[][]{{0, 0}}, 1);
		}
		
		if(LoadNo == 23){//AreaCutscene Test2 + Boss Battle + TestKey
			LoadedCutscene = new TalkTextCutscene(23, "BossDefeated1", "Find a Strange Item", new int[]{26, 27, 28}, new int[][]{{10, 0},{4, 294},{11, 4}}, 1); //{4, 283}
		}
		if(LoadNo == 24){//AreaCutscene Test2
			LoadedCutscene = new TalkTextCutscene(24, "AreaCutscene2", "Tests Find Area 4?", new int[]{25}, new int[][]{{5, 45}}, 1); //5 14
		}
		
		if(LoadNo == 25){//Cook Bread
			LoadedCutscene = new TalkTextCutscene(25, "CookBread", "Cook Bread Dough", new int[]{31, 32}, new int[][]{{0, 0},{0, 0}}, 1);
		}
		
		if(LoadNo == 27){//Field on Fire
			LoadedCutscene = new TalkTextCutscene(27, "OnFireField", "Something is odd...", new int[]{40, 41, 42}, new int[][]{{14, 4},{10, 3},{14, 1}}, 3);
		}
		
//		if(LoadNo == 28){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(28, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
//		if(LoadNo == 29){//AreaCutscene Test4
//			LoadedCutscene = new TalkTextCutscene(29, "AreaCutscene4", "Tests Find Area 2", new int[]{25}, new int[][]{{5, 13}}, 1);
//		}
		
		if(LoadNo == 28){//  /Hint Potions
			LoadedCutscene = new TalkTextCutscene(28, "Hint Potions", "Player should get some potions...", new int[]{52, 53}, new int[][]{{0, 0},{0, 0}}, 1);
		}
		
		//Elder, First Time
		if(LoadNo == 29){//  Elder, First Time
			LoadedCutscene = new TalkTextCutscene(29, "Elder First Time", "The Investigation Begins", new int[]{54, 55, 56, 57, 58, 59, 61, 62, 63, 64, 65, 66, 67, 68}, new int[][]{{10, 4}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 9}, {0, 0}, {5, 0}, {5, 3}, {5, 4}, {5, 2}, {5, 5}}, 1);
		}
		
		//Field Area 1: The First Slime //Fighting enemies
		if(LoadNo == 30){//Field Area 1: The First Slime
			LoadedCutscene = new TalkTextCutscene(30, "The First Slime", "Feild Area, the first battle", new int[]{73, 74}, new int[][]{{10, 5}, {10, 6}}, 1);
		}
		
		//Field Area 1: The Second Slime //Fight 2nd Slime, get a potion
		if(LoadNo == 31){//Field Area 1: The First Slime
			LoadedCutscene = new TalkTextCutscene(31, "The Second Slime", "Feild Area, A potion appears!", new int[]{75, 76}, new int[][]{{10, 6}, {10, 7}}, 1);
		}
		
		//Field Area 1: The Third Slime //Fight 3rd slime, get Metal B, Get Sword Recipe?
		if(LoadNo == 32){//Field Area 1: The Third Slime
			LoadedCutscene = new TalkTextCutscene(32, "The Third Slime", "Feild Area, A plan of attack", new int[]{77, 78, 102}, new int[][]{{10, 7}, {10, 8}, {21, 0}}, 1);
		}//event 21, recipe 0 sword 77,78,102
		
		//Field Area 1: The Fourth Slime //Fight 4th Slime, Level Up Tutorial
		if(LoadNo == 33){//Field Area 1: The Fourth Slime
			LoadedCutscene = new TalkTextCutscene(33, "The Fourth Slime", "Feild Area, Some Metal", new int[]{79, 80, 103}, new int[][]{{10, 8}, {10, 9}, {4, 103}}, 1);
		}//79, 80, 103  4, 103
		
		//Field Area 1: The Fifth Slime //Fight 5th Slime, TOO MANY MONSTERS
		if(LoadNo == 34){//Field Area 1: The Fifth Slime
			LoadedCutscene = new TalkTextCutscene(34, "The Fifth Slime", "Feild Area, The last one", new int[]{81, 82, 104}, new int[][]{{10, 9}, {5, 10}, {10, 10}}, 1);
		}
		
		//Fight Boss Slime
		if(LoadNo == 35){//Field Area 1: Giant Slime
			LoadedCutscene = new TalkTextCutscene(35, "Giant Slime", "The First Boss", new int[]{83, 0}, new int[][]{{0, 0}, {1, 23}}, 1);
		}
		
		//Giant Slime Defeated!
		if(LoadNo == 36){//Field Area 1: Giant Slime Defeated
			LoadedCutscene = new TalkTextCutscene(36, "Giant Slime Defeated!", "After the First Boss", new int[]{84, 85}, new int[][]{{10, 10}, {10, 11}}, 1);
		}
		
		//Talk with Elder after Fighting Boss Slime, The next thing to do...
		if(LoadNo == 37){//Elder after Slime
			LoadedCutscene = new TalkTextCutscene(37, "Elder after Giant Slime", "And the end of the demo", new int[]{86, 87, 88, 89, 90}, new int[][]{{10, 11}, {0, 0}, {0, 0}, {0, 0}, {0, 0}}, 1);
		}
		
		//   /Hint: Maybe something...
		if(LoadNo == 38){// /Hint Looking for some potions....
			LoadedCutscene = new TalkTextCutscene(38, "/Hint Potion", "A Hint that starts something else", new int[]{52, 53}, new int[][]{{0, 0}, {0, 0}}, 1);
		}
		
		//Field Area 1: The First Slime (Finding it)
				if(LoadNo == 39){//Field Area 1: The First Slime (Found)
					LoadedCutscene = new TalkTextCutscene(39, "The First Slime Found", "Feild Area, the first battle Starts", new int[]{72}, new int[][]{{1, 24}}, 1);
				}
		//Field Area 1: The Second Slime (Finding it)
				if(LoadNo == 40){//Field Area 1: The Second Slime (Found)
					LoadedCutscene = new TalkTextCutscene(40, "The Second Slime Found", "Feild Area, Another one Comes", new int[]{72}, new int[][]{{1, 25}}, 1);
				}
		//Field Area 1: The Third Slime (Finding it)
				if(LoadNo == 41){//Field Area 1: The Third Slime (Found)
					LoadedCutscene = new TalkTextCutscene(41, "The Third Slime Found", "Feild Area, Seriously Again?", new int[]{72}, new int[][]{{1, 26}}, 1);
				}
		//Field Area 1: The Fourth Slime (Finding it)
				if(LoadNo == 42){//Field Area 1: The Fourth Slime (Found)
					LoadedCutscene = new TalkTextCutscene(42, "The Fourth Slime Found", "Feild Area, How Many of these...", new int[]{72}, new int[][]{{1, 27}}, 1);
				}
		//Field Area 1: The Fifth Slime (Finding it)
				if(LoadNo == 43){//Field Area 1: The Fifth Slime (Found)
					LoadedCutscene = new TalkTextCutscene(43, "The Fifth Slime Found", "Feild Area, This is enough!", new int[]{72}, new int[][]{{1, 28}}, 1);
				}
				
//		//Field Area 1: Giant Slime: The First Boss!
//				if(LoadNo == 44){//Field Area 1: Giant Slime (Found)
//					LoadedCutscene = new TalkTextCutscene(44, "Giant Slime: Found!", "The First Boss!", new int[]{83}, new int[][]{{1, 23}}, 1);
//				}
//				
//		//Field Area 1: Giant Slime: Defeated!
//				if(LoadNo == 44){//Field Area 1: Giant Slime (Found)
//					LoadedCutscene = new TalkTextCutscene(44, "Giant Slime: Defeated", "After Giant Slime", new int[]{83}, new int[][]{{10, }}, 1);
//				}
		
		//Meets with ??? Gamemode 0
//		if(LoadNo == 39){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(39, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
		//Meets with ??? Gamemode 1
//		if(LoadNo == 40){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(40, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
		//Meets with ??? Gamemode 2
//		if(LoadNo == 41){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(41, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
		//Meets with ??? Gamemode 3
//		if(LoadNo == 42){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(42, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
		//Meets with ??? Gamemode 4
//		if(LoadNo == 43){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(43, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
		//Meets with ??? Gamemode 5
//		if(LoadNo == 44){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(44, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
		//Meets with ??? Gamemode 6
//		if(LoadNo == 45){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(45, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
				
//				Item1Found[2] = 1; //Bread
//				Item1Found[3] = 1; //Toast
//				Item1Found[6] = 1; //Pancakes
//				Item1Found[7] = 1; //Thin Pancakes
//				Item1Found[9] = 1; //Cheese Fondue
//				Item1Found[10] = 1; //Cheese Sandwitch
//				Item1Found[11] = 1; //Cheese Toast
//				Item1Found[12] = 1; //Cheese Pancakes
//				Item1Found[13] = 1; //Grilled Cheese
//				Item1Found[15] = 1; //Chopped Steak
//				Item1Found[16] = 1; //Meat Bread
//				Item1Found[17] = 1; //Meat Bun
//				Item1Found[18] = 1; //Burger Bytes
//				Item1Found[19] = 1; //Meatloaf Stuffed Bread
//				Item1Found[20] = 1; //Breading Stuffed Meat
//				Item1Found[21] = 1; //Meaty Pasta
//				Item1Found[22] = 1; //Stuffed Sandwitch
//				Item1Found[23] = 1; //Hamburger
//				Item1Found[24] = 1; //Boiled Meat
//				Item1Found[25] = 1; //SteakBurger
//				Item1Found[26] = 1; //SteakHouse Burger
//				Item1Found[27] = 1; //Cheese Steak
//				Item1Found[28] = 1; //Cheeseburger
//				Item1Found[29] = 1; //SteakBurgerW.Cheese
//				Item1Found[30] = 1; //Cheesesteak Sandwitch
//				Item1Found[32] = 1; //Caramel
//				Item1Found[33] = 1; //Sweet Rolls
//				Item1Found[34] = 1; //Syrup
//				Item1Found[35] = 1; //Sticky Buns
//				Item1Found[36] = 1; //Pancakes W. Syrup
//				Item1Found[37] = 1; //Thin Pancakes W. Syrup
//				Item1Found[38] = 1; //Cheese Pancakes W Syrup
//				Item1Found[39] = 1; //Caramels
//				Item1Found[40] = 1; //Hard Candy
//				Item1Found[41] = 1; //Jelly Candy
//				Item1Found[42] = 1; //Sugar Frosted Caramels
//				Item1Found[43] = 1; //Caramel Syrup
//				Item1Found[44] = 1; //Hard Candies
//				Item1Found[45] = 1; //Jelly Beans
//				Item1Found[47] = 1; //Chocolate Fondue
//				Item1Found[48] = 1; //Hot Chocolate
//				Item1Found[50] = 1; //Chocolate Bar
//				Item1Found[51] = 1; //Chocolate Caramels
//				Item1Found[52] = 1; //Chocolate Syrup
//				Item1Found[53] = 1; //Caramel Hot chocolate
//				Item1Found[54] = 1; //Pancakes W. Chocolate Syrup
//				Item1Found[55] = 1; //Thin Pancakes W. Chocolate Syrup
//				Item1Found[56] = 1; //Cheese Pancakes W. Chocolate Syrup
//				Item1Found[57] = 1; //Chocolate Pancakes W. Syrup
//				Item1Found[58] = 1; //Chocolate Pancakes W. Chocolate Syrup
//				Item1Found[59] = 1; //Chocolate Caramel Cake
//				Item1Found[61] = 1; //Blueberry Bread
//				Item1Found[62] = 1; //Blueberry Juice
//				Item1Found[63] = 1; //Blueberry Pancakes
//				Item1Found[64] = 1; //Blueberry Steak
//				Item1Found[65] = 1; //Blueberry Syrup
//				Item1Found[66] = 1; //Chocolate Covered Blueberries
//				Item1Found[67] = 1; //Cheese Dipped Blueberries
//				Item1Found[68] = 1; //Blueberry Concentrate
//				Item1Found[69] = 1; //Blueberry Jelly
//				Item1Found[70] = 1; //Blueberry Jelly Candy
//				Item1Found[71] = 1; //Blueberry Jelly Beans
//				Item1Found[72] = 1; //Pancakes W. Blueberry Syrup
//				Item1Found[73] = 1; //Thin Pancakes W. Blueberry Syrup
//				Item1Found[74] = 1; //Cheese Pancakes W. Blueberry Syrup
//				Item1Found[75] = 1; //Chocolate Pancakes W. Blueberry Syrup
//				Item1Found[76] = 1; //Blueberry Pancakes W. Syrup
//				Item1Found[77] = 1; //Blueberry Pancakes W. Chocolate Syrup
//				Item1Found[78] = 1; //Blueberry Pancakes W. Blueberry Syrup
//				Item1Found[79] = 1; //Toast W. Blueberry Jelly
//				Item1Found[81] = 1; //Ice Sculpture
//				Item1Found[82] = 1; //Ice Water
//				Item1Found[83] = 1; //Crushed Ice
//				Item1Found[84] = 1; //Blueberry Icicle
//				Item1Found[85] = 1; //Shaved Ice
//				Item1Found[86] = 1; //Blueberry Shaved Ice
//				Item1Found[87] = 1; //Refreshing Chocolate Drink
//				Item1Found[88] = 1; //Caramel Pancakes
//				Item1Found[89] = 1; //Caramel Bread
//				Item1Found[90] = 1; //Caramel Chocolate Bar
//				Item1Found[91] = 1; //Caramel Pancakes W. Syrup
//				Item1Found[92] = 1; //Caramel Pancakes W. Chocolate Syrup
//				Item1Found[93] = 1; //Caramel Pancakes W. Blueberry Syrup
//				Item1Found[119] = 1; //Stale Bread
//				Item1Found[120] = 1; //Rotten Meat
//				Item1Found[121] = 1; //Cursed Meat
//				Item1Found[122] = 1; //Prison Food
//				Item1Found[123] = 1; //Dry Bread
//				Item1Found[203] = 1; //Pancake Armor
//				Item1Found[204] = 1; //Pancake Armor W. Syrup
//				Item1Found[251] = 1; //Blueberry Armor
//				Item1Found[284] = 1; //Null Pancakes
//				Item1Found[287] = 1; //Unused Item
		
		return LoadedCutscene;
	}
}

//There are two tales I want to tell, that I may not make much of, but other may.

//In some other game released long ago, during the age of 64, a seperate other type of cutscene was found.
//Due to the strange nature of this other cutscene, allowing others to see things from earlier versions, it was called Beta Quest
//This Cutscene Quest allows one to walk around during cutscenes, seeing things as they are in a different way.
//This mode may exist in other games, one other I know of featuring a Bear and Bird. You can move outside a cutscene and see what happens hidden outside of normal sight.

//Another type of odd cutscene can be triggered when one tries to leave the cutscene, and yet text loaded remains.
//In a certain game featuring a blue robot from the future, this type can make odd thing occur.
//The cutscene moves with you into other areas, affecting them in odd ways. If such a type of cutscene exists in other games, maybe the scenes would change if they load in the wrong places?

//As with other uses of this strange power, it may change and take yet more undiscovered forms depending on where it is found.
//Maybe it would one day appear as described above? Only time will tell.