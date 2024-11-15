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
	//11 = Unlock Inventor Battle
	//12 = Unlock tavern rumors flag
	//13 = Change Screentype
	//14 = Change Screenmode
	//15 = Load a different Cutscene
	//16 = Move player to another area
	//17 = ??? X Mode Cutscene
	//18 = Change Gamemode
	//19 = Change Current Player Level
	//20 =  Change Player Level Cap
	//21 = Weapon Recipe
	//22 = Armor Recipe
	
	int XChance = -100;
	int RChance = -100;
	int[] Text1X = {30};
	int[] Text2X = {80};
	//EventData(Areanumber, itemnumber, etc.)
	int CMode;
	boolean isBossCutscene = false;

	public TalkTextCutscene(int CutsceneNo, String CutsceneName, String CutsceneDesc, 
			int[] TextContained, int[][] EventsIncluded, 
			int XChance, int RChance,
			int CMode, boolean isBossCutscene){//, int[] Text1X, int[] Text2X
		this.CutsceneNo = CutsceneNo;
		this.CutsceneName = CutsceneName;
		this.CutsceneDesc = CutsceneDesc;
		this.TextContained = TextContained;
		this.EventsIncluded = EventsIncluded;
		//this.Text1X = Text1X;
		//this.Text2X = Text2X;
		this.XChance = XChance;
		this.RChance = RChance;
		this.CMode = CMode;
		this.isBossCutscene = isBossCutscene;
	}
	
	static TalkTextCutscene NullCutscene = new TalkTextCutscene(0, "NULL", "", new int[]{0}, new int[][]{{0, 0}}, 
			/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false); //EventType, EventData
	
	public static TalkTextCutscene CutsceneList(int LoadNo){
		TalkTextCutscene LoadedCutscene = NullCutscene;
		
		if(LoadNo == 0){
			LoadedCutscene = new TalkTextCutscene(0, "NULL", "", new int[]{0}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 26){//Intro Scene
			LoadedCutscene = new TalkTextCutscene(26, "Intro Scene", "Starting a normal new game", new int[]{33, 34, 35, 36, 37, 38, 39}, new int[][]{{0, 0}, {0, 0}, {13, 1}, {7, 3}, {3, 16}, {7, 2}, {3, 15}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 1){//Topics1
			LoadedCutscene = new TalkTextCutscene(1, "TestTopic1", "", new int[]{101, 14, 15}, new int[][]{{0, 0}, {0, 0}, {0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 2){//Topics2
			LoadedCutscene = new TalkTextCutscene(2, "TestTopic2", "", new int[]{2}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 3){//Topics3
			LoadedCutscene = new TalkTextCutscene(3, "TestTopic3", "", new int[]{3}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 4){//Topics4
			LoadedCutscene = new TalkTextCutscene(4, "TestTopic4", "", new int[]{4}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 5){//Topics5
			LoadedCutscene = new TalkTextCutscene(5, "TestTopic5", "", new int[]{5}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 6){//Topics6
			LoadedCutscene = new TalkTextCutscene(6, "TestTopic6", "", new int[]{6}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 7){//Topics7
			LoadedCutscene = new TalkTextCutscene(7, "TestTopic7", "", new int[]{7}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 8){//Topics8
			LoadedCutscene = new TalkTextCutscene(8, "TestTopic8", "", new int[]{8}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 9){//Topics9
			LoadedCutscene = new TalkTextCutscene(9, "TestTopic9", "", new int[]{9}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 10){//Topics10
			LoadedCutscene = new TalkTextCutscene(10, "TestTopic10", "", new int[]{10}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 11){//Topics11
			LoadedCutscene = new TalkTextCutscene(11, "TestTopic11", "", new int[]{11}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 12){
			LoadedCutscene = new TalkTextCutscene(12, "", "", new int[]{0}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 13){//BattleCutscene Test
			LoadedCutscene = new TalkTextCutscene(13, "BattleCutscene", "Tests Find Monsters", new int[]{16, 17}, new int[][]{{0, 0}, {1, 20}}, 
					/*XChance*/20,/*RChance*/30,/*CMode*/1, /*isBoss*/false);
			//LoadedCutscene = new TalkTextCutscene(13, "BattleCutscene", "Tests Find Monsters", new int[]{16, 17}, new int[][]{{0, 0}, {1, 2}});
		}
		if(LoadNo == 14){//RecipeCutscene Test
			LoadedCutscene = new TalkTextCutscene(14, "RecipeCutscene", "Tests Find Recipe", new int[]{18}, new int[][]{{2, 2}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 15){//NoteCutscene Test
			LoadedCutscene = new TalkTextCutscene(15, "NoteCutscene", "Tests Find Note", new int[]{19}, new int[][]{{3, 2}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 16){//ItemCutscene Test
			LoadedCutscene = new TalkTextCutscene(16, "ItemCutscene", "Tests Find Item", new int[]{20}, new int[][]{{4, 290}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);   //{4, 279}
		}
		if(LoadNo == 17){//AreaCutscene Test + Boss Battle
			LoadedCutscene = new TalkTextCutscene(17, "AreaCutscene", "Tests Find Area 3", new int[]{21}, new int[][]{{5, 43}}, 
					/*XChance*/20,/*RChance*/30,/*CMode*/1, /*isBoss*/true); //5 13
		}
		if(LoadNo == 18){//LoseCookItemsScene
			LoadedCutscene = new TalkTextCutscene(18, "CookLoseItems", "Cooked Items, Mistake", new int[]{22}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 19){//CookedItemScene
			LoadedCutscene = new TalkTextCutscene(19, "CookedItem", "CooksItem", new int[]{23}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 20){//CookedBombScene
			LoadedCutscene = new TalkTextCutscene(19, "CookedBomb", "CooksDebugBomb", new int[]{24}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 21){//Tavern1
			LoadedCutscene = new TalkTextCutscene(20, "Tavern1", "TavernText", new int[]{12}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		if(LoadNo == 22){//Tavern2
			LoadedCutscene = new TalkTextCutscene(21, "Tavern2", "TavernTest", new int[]{13}, new int[][]{{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		if(LoadNo == 23){//AreaCutscene Test2 + Boss Battle + TestKey
			LoadedCutscene = new TalkTextCutscene(23, "BossDefeated1", "Find a Strange Item", new int[]{26, 27, 28}, new int[][]{{10, 0},{4, 294},{11, 4}}, 
					/*XChance*/20,/*RChance*/30,/*CMode*/1, /*isBoss*/true); //{4, 283}
		}
		if(LoadNo == 24){//AreaCutscene Test2
			LoadedCutscene = new TalkTextCutscene(24, "AreaCutscene2", "Tests Find Area 4?", new int[]{25}, new int[][]{{5, 45}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false); //5 14
		}
		
		if(LoadNo == 25){//Cook Bread
			LoadedCutscene = new TalkTextCutscene(25, "CookBread", "Cook Bread Dough", new int[]{31, 32}, new int[][]{{0, 0},{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		if(LoadNo == 27){//Field on Fire
			LoadedCutscene = new TalkTextCutscene(27, "OnFireField", "Something is odd...", new int[]{40, 41, 42}, new int[][]{{14, 4},{10, 3},{14, 1}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/3, /*isBoss*/false);
		}
		
//		if(LoadNo == 28){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(28, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}
//		if(LoadNo == 29){//AreaCutscene Test4
//			LoadedCutscene = new TalkTextCutscene(29, "AreaCutscene4", "Tests Find Area 2", new int[]{25}, new int[][]{{5, 13}}, 1);
//		}
		
		if(LoadNo == 28){//  /Hint Potions
			LoadedCutscene = new TalkTextCutscene(28, "Hint Potions", "Player should get some potions...", new int[]{52, 53}, new int[][]{{0, 0},{0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		//Elder, First Time
		if(LoadNo == 29){//  Elder, First Time
			LoadedCutscene = new TalkTextCutscene(29, "Elder First Time", "The Investigation Begins", new int[]{54, 55, 56, 57, 58, 59, 61, 62, 63, 64, 65, 66, 67, 68}, new int[][]{{10, 4}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 9}, {0, 0}, {5, 0}, {5, 3}, {5, 4}, {5, 2}, {5, 5}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		//Field Area 1: The First Slime //Fighting enemies
		if(LoadNo == 30){//Field Area 1: The First Slime
			LoadedCutscene = new TalkTextCutscene(30, "The First Slime", "Feild Area, the first battle", new int[]{73, 74}, new int[][]{{10, 5}, {10, 6}}, 
					/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
		}
		
		//Field Area 1: The Second Slime //Fight 2nd Slime, get a potion
		if(LoadNo == 31){//Field Area 1: The Second Slime
			LoadedCutscene = new TalkTextCutscene(31, "The Second Slime", "Feild Area, A potion appears!", new int[]{75, 76}, new int[][]{{10, 6}, {10, 7}}, 
					/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
		}
		
		//Field Area 1: The Third Slime //Fight 3rd slime, get Metal B, Get Sword Recipe?
		if(LoadNo == 32){//Field Area 1: The Third Slime
			LoadedCutscene = new TalkTextCutscene(32, "The Third Slime", "Feild Area, A plan of attack", new int[]{77, 78, 102}, 
					new int[][]{{10, 7}, //Story Flag
						{10, 8}, 		//Story Flag
						{21, 0}}, 		//WeaponRecipeUnlock
					/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
		}//event 21, recipe 0 sword 77,78,102
		
		//Field Area 1: The Fourth Slime //Fight 4th Slime, Level Up Tutorial
		if(LoadNo == 33){//Field Area 1: The Fourth Slime
			LoadedCutscene = new TalkTextCutscene(33, "The Fourth Slime", "Feild Area, Some Metal", new int[]{79, 80, 103}, new int[][]{{10, 8}, {10, 9}, {4, 103}}, 
					/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
		}//79, 80, 103  4, 103
		
		//Field Area 1: The Fifth Slime //Fight 5th Slime, TOO MANY MONSTERS
		if(LoadNo == 34){//Field Area 1: The Fifth Slime
			LoadedCutscene = new TalkTextCutscene(34, "The Fifth Slime", "Feild Area, The last one", new int[]{81, 82, 104}, new int[][]{{10, 9}, {5, 10}, {10, 10}}, 
					/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
		}
		
		//Fight Boss Slime
		if(LoadNo == 35){//Field Area 1: Giant Slime
			LoadedCutscene = new TalkTextCutscene(35, "Giant Slime", "The First Boss", new int[]{83, 0}, new int[][]{{0, 0}, {1, 23}}, 
					/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/true);
		}
		
		//Giant Slime Defeated!
		if(LoadNo == 36){//Field Area 1: Giant Slime Defeated
			LoadedCutscene = new TalkTextCutscene(36, "Giant Slime Defeated!", "After the First Boss", new int[]{84, 85}, new int[][]{{10, 10}, {10, 11}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		//Talk with Elder after Fighting Boss Slime, The next thing to do...
		if(LoadNo == 37){//Elder after Slime
			LoadedCutscene = new TalkTextCutscene(37, "Elder after Giant Slime", "And the end of the demo", new int[]{86, 87, 88, 89, 90}, new int[][]{{10, 11}, {0, 0}, {0, 0}, {0, 0}, {0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		//   /Hint: Maybe something...
		if(LoadNo == 38){// /Hint Looking for some potions....
			LoadedCutscene = new TalkTextCutscene(38, "/Hint Potion", "A Hint that starts something else", new int[]{52, 53}, new int[][]{{0, 0}, {0, 0}}, 
					/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
		}
		
		//Field Area 1: The First Slime (Finding it)
				if(LoadNo == 39){//Field Area 1: The First Slime (Found)
					LoadedCutscene = new TalkTextCutscene(39, "The First Slime Found", "Feild Area, the first battle Starts", new int[]{72}, new int[][]{{1, 24}}, 
							/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
				}
		//Field Area 1: The Second Slime (Finding it)
				if(LoadNo == 40){//Field Area 1: The Second Slime (Found)
					LoadedCutscene = new TalkTextCutscene(40, "The Second Slime Found", "Feild Area, Another one Comes", new int[]{72}, new int[][]{{1, 25}}, 
							/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
				}
		//Field Area 1: The Third Slime (Finding it)
				if(LoadNo == 41){//Field Area 1: The Third Slime (Found)
					LoadedCutscene = new TalkTextCutscene(41, "The Third Slime Found", "Feild Area, Seriously Again?", new int[]{72}, new int[][]{{1, 26}}, 
							/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
				}
		//Field Area 1: The Fourth Slime (Finding it)
				if(LoadNo == 42){//Field Area 1: The Fourth Slime (Found)
					LoadedCutscene = new TalkTextCutscene(42, "The Fourth Slime Found", "Feild Area, How Many of these...", new int[]{72}, new int[][]{{1, 27}}, 
							/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
				}
		//Field Area 1: The Fifth Slime (Finding it)
				if(LoadNo == 43){//Field Area 1: The Fifth Slime (Found)
					LoadedCutscene = new TalkTextCutscene(43, "The Fifth Slime Found", "Feild Area, This is enough!", new int[]{72}, new int[][]{{1, 28}}, 
							/*XChance*/10,/*RChance*/20,/*CMode*/1, /*isBoss*/false);
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
				
				if(LoadNo == 45){//Cook Normal Food
					LoadedCutscene = new TalkTextCutscene(25, "CookFood", "Cook normal foods", new int[]{31, 105}, new int[][]{{0, 0},{0, 0}}, 
							/*XChance*/-100,/*RChance*/-100,/*CMode*/1, /*isBoss*/false);
				}
				
//				Item1Found[7] = 1; //Thin Pancakes	31 Cook: Here you go!  Cook: Turned out okay			
//				Item1Found[19] = 1; //Meatloaf Stuffed Bread	This is interesting		Cook: It's good right?					Yeah. It is.
//				Item1Found[20] = 1; //Breading Stuffed Meat		This is an odd dish		Cook: <mumble> Will still taste good    Looks good
//				Item1Found[21] = 1; //Meaty Pasta				How did you do this?	Cook: Huh? I just made it.  			Nevermind

//				Item1Found[40] = 1; //Hard Candy		31 Cook: Here you go!     It's kind of hard to eat...
//				Item1Found[44] = 1; //Hard Candies		Cook: There, better?		Yes actually. It is.
//				Item1Found[59] = 1; //Chocolate Caramel Cake  31 Cook: Here you go!	 Wow~! It's... Amazing!
//				Item1Found[68] = 1; //Blueberry Concentrate    It's powder? 		Cook: Tasty powder
//				Item1Found[81] = 1; //Ice Sculpture		Wow! It's nice. 	Cook: Yeah, I'm awesome
//				Item1Found[82] = 1; //Ice Water			You just put the ice in. Cook: What else was I supposed to do?
//				Item1Found[83] = 1; //Crushed Ice		Cook: Hiiiyaaa! <Crash>	Here you go!
//				Item1Found[84] = 1; //Blueberry Icicle  OOOH, what's this?		Cook: It's food. Duh.
//				Item1Found[119] = 1; //Stale Bread		Hmmm	Cook: Well, this is what happened.
//				Item1Found[120] = 1; //Rotten Meat		Cook: Hunting a ghoul?		Something like that
//				Item1Found[121] = 1; //Cursed Meat		Cook: Ew! You take it.		I can't eat this.
//				Item1Found[122] = 1; //Prison Food		Cook: <snicker> Here you go		Okay
//				Item1Found[123] = 1; //Dry Bread		Cook: This is disapointing		I'll still eat it.		Cook: Okay?
//				Item1Found[203] = 1; //Pancake Armor		It's armor!			Cook: Yeah... It is?
//				Item1Found[204] = 1; //Pancake Armor W. Syrup	Cook: There ya go. It's sticky now.		Thanks
//				Item1Found[251] = 1; //Blueberry Armor		It's armor!			Cook: Yeah... It is?
//				Item1Found[284] = 1; //Null Pancakes		Cook: ...			...
//				Item1Found[287] = 1; //Unused Item			Cook: One thing. Here you go.		Okay?
		
		//Meets with ??? Gamemode ?
//		if(LoadNo == 39){//AreaCutscene Test3
//			LoadedCutscene = new TalkTextCutscene(39, "AreaCutscene3", "Tests Find Area 1", new int[]{25}, new int[][]{{5, 12}}, 1);
//		}


		
		return LoadedCutscene;
	}
}

//There are two tales I want to tell, that I may not make much of, but other may.

//In some other game released long ago, during the age of 64, a separate other type of cutscene was found.
//Due to the strange nature of this other cutscene, allowing others to see things from earlier versions, it was called Beta Quest
//This Cutscene Quest allows one to walk around during cutscenes, seeing things as they are in a different way.
//This mode may exist in other games, one other I know of featuring a Bear and Bird. You can move outside a cutscene and see what happens hidden outside of normal sight.

//Another type of odd cutscene can be triggered when one tries to leave the cutscene, and yet text loaded remains.
//In a certain game featuring a blue robot from the future, this type can make odd thing occur.
//The cutscene moves with you into other areas, affecting them in odd ways. If such a type of cutscene exists in other games, maybe the scenes would change if they load in the wrong places?

//What is this strange power? To you maybe it is one thing, but what about those experiencing it firsthand?
