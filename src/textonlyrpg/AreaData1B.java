package textonlyrpg;

public class AreaData1B {//Chances before or after? Rarity
	//Areas 36-70

	//Remeber, PasswordData Loading Events!!!, Init CurrentArea, and other areadata things
	
	//AreaData(AreaNo, AreaName, ADescription, ScreenType, AreaType, Drop1, Drop1Percent, MoneyDrop, MoneyChance, Battle, BattleChance, Event, EventChance, Ypos, Xpos)
	public static AreaData[] AData1(int Area, int Gamemode, int var){
		AreaData AData[] = new AreaData[] {new AreaData(000, "", "No Data", 1, "AdminArea", 
				/*ItemChance*/new int[]{1}, new int[]{10}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
				/*BattleChance*/new int[]{11}, new int[]{33}, 
				/*XBattleChance*/new int[]{11}, new int[]{0}, /*RBattleChance*/new int[]{11}, new int[]{0}, 
				/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
				/*Ypos, Xpos*/ 70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
				/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})};
		
		

		
		//Mountain Area
			//Mountain Trail1
		if(Area == 22){ //22
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(22, "Mountain Trail1", "There is a mirror", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(22, "Mountain Trail1", "it sees another dimention", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(22, "Mountain Trail1", "this place is dangerous", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(22, "Mountain Trail1", "it contains powerful foes", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(22, "Mountain Trail1", "the mirror was hidden", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(22, "Mountain Trail1", "it was hidden in the town", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(22, "Mountain Trail1", "behind a locked door", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Mountain Stream
	if(Area == 23){ //23
		AData = new AreaData[]{
				//0 = Cutscene Quest
				new AreaData(23, "Mountain Stream", "There is a baron", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//1 = Normal Mode
				new AreaData(23, "Mountain Stream", "He wants to be powerful", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//2 = Easy Mode
				new AreaData(23, "Mountain Stream", "he found a power", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//3 = Hard Mode
				new AreaData(23, "Mountain Stream", "he waits to use it", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//4 = Other Story
				new AreaData(23, "Mountain Stream", "a hero comes to stop him", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//5 = Glitch
				new AreaData(23, "Mountain Stream", "he is not the one in charge", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//6 = Beta
				new AreaData(23, "Mountain Stream", "something else is", 1, "Mountain Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
				//7 = 7th   
				
		};
	}
		
			//Mountain Trail2
		if(Area == 24){ //24
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(24, "Mountain Trail2", "There is a monster", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(24, "Mountain Trail2", "It looks like someone else", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(24, "Mountain Trail2", "it seems unassuming", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(24, "Mountain Trail2", "it has bigger plans", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(24, "Mountain Trail2", "there are many of them", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(24, "Mountain Trail2", "The one here is the leader", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(24, "Mountain Trail2", "He doesn't go down with one defeat", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
			//Mountain Top
		if(Area == 25){ //25
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(25, "Mountain Top", "There is a Shield", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(25, "Mountain Top", "it has the power of the sword", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(25, "Mountain Top", "it is a dangerous foe", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(25, "Mountain Top", "it is not the leader", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(25, "Mountain Top", "It still needs to be stopped", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(25, "Mountain Top", "it commands the monsters", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(25, "Mountain Top", "just like the sword does", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Under the Mountain
		if(Area == 26){ //26
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(26, "Under the Mountain", "the sword is stronger than you think", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(26, "Under the Mountain", "it has a secret power", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(26, "Under the Mountain", "One it cannot use right now", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(26, "Under the Mountain", "It can hide somewhere devious", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(26, "Under the Mountain", "somewhere you have to fight it", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(26, "Under the Mountain", "you cannot simply attack", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(26, "Under the Mountain", "but it can attack you!", 1, "Mountain Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Dark Mountain
	if(Area == 27){ //27
		AData = new AreaData[]{
				//0 = Cutscene Quest
				new AreaData(27, "Dark Mountain", "there is a mine somewhere", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//1 = Normal Mode
				new AreaData(27, "Dark Mountain", "it is full of treasure", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//2 = Easy Mode
				new AreaData(27, "Dark Mountain", "It is full of foes", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//3 = Hard Mode
				new AreaData(27, "Dark Mountain", "deeper walls are harder", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//4 = Other Story
				new AreaData(27, "Dark Mountain", "but mining will be worth it", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//5 = Glitch
				new AreaData(27, "Dark Mountain", "there is a statue in that cave", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//6 = Beta
				new AreaData(27, "Dark Mountain", "and something else....", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
				//7 = 7th   
				
		};
	}
	
		
		//Desert Area
			//DesertArea1
		if(Area == 28){ //28
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(28, "Desert Area 1", "There is a tower", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(28, "Desert Area 1", "It is full of traps and tricks", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(28, "Desert Area 1", "One cannot simply climb", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(28, "Desert Area 1", "One must solve to advance", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(28, "Desert Area 1", "Beware it's foes!", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(28, "Desert Area 1", "Beware it's tricks!", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(28, "Desert Area 1", "What lies at the top?", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
			//Wide Desert
		if(Area == 29){ //29
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(29, "Desert Area 2", "What is the final secret?", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(29, "Desert Area 2", "Some search for it's lost glory", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(29, "Desert Area 2", "It may not be that big", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(29, "Desert Area 2", "It may not be that small", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(29, "Desert Area 2", "searchers look, theorists plan", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(29, "Desert Area 2", "It may not exist", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(29, "Desert Area 2", "it may exist", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
			//DesertOasis
		if(Area == 30){//30
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(30, "DesertOasis", "A Magic rod, and dangerous foe", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(30, "DesertOasis", "It's powers a secret, not that I know", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(30, "DesertOasis", "Sword, Armor, Shield, Rod", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(30, "DesertOasis", "Are there more? There could be", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),//Single time Only Event
					//4 = Other Story
					new AreaData(30, "DesertOasis", "What would happen if they teamed up?", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(30, "DesertOasis", "A dangerous combo for certain!", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(30, "DesertOasis", "It would take everybody to beat them!", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		//Pyramid
	if(Area == 31){//31
		AData = new AreaData[]{
				//0 = Cutscene Quest
				new AreaData(31, "Pyramid", "Another foe, scary as can be!", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//1 = Normal Mode
				new AreaData(31, "Pyramid", "DATA CORRUPTED", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//2 = Easy Mode
				new AreaData(31, "Pyramid", "Beware the corrosion!", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//3 = Hard Mode
				new AreaData(31, "Pyramid", "It looks like you!", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//4 = Other Story
				new AreaData(31, "Pyramid", "One who fights alongside you, against you!", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//5 = Glitch
				new AreaData(31, "Pyramid", "How do you fight that?", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//6 = Beta
				new AreaData(31, "Pyramid", "A most dangerous foe indeed!", 1, "Desert Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
				//7 = 7th   
				
		};
	}
			//*Midnight Desert Area
		if(Area == 32){//32
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(32, "Midnight Desert", "A laberynthian cave!", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(32, "Midnight Desert", "A maze of rooms", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(32, "Midnight Desert", "A challenge to navigate!", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(32, "Midnight Desert", "What will you find there?", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(32, "Midnight Desert", "The cave was created to be different", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(32, "Midnight Desert", "A random challenge every time", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(32, "Midnight Desert", "What will you find there?", 1, "Desert Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/7, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Dark Desert
	if(Area == 33){ //33
		AData = new AreaData[]{
				//0 = Cutscene Quest
				new AreaData(33, "Dark Desert", "Null Edge didn't come first", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//1 = Normal Mode
				new AreaData(33, "Dark Desert", "Though it is the leader of this raid", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//2 = Easy Mode
				new AreaData(33, "Dark Desert", "Coded Edge came from somewhere else to aid", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//3 = Hard Mode
				new AreaData(33, "Dark Desert", "Where did it come from?", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//4 = Other Story
				new AreaData(33, "Dark Desert", "A long time ago a sword was made", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//5 = Glitch
				new AreaData(33, "Dark Desert", "Using a certain power...", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//6 = Beta
				new AreaData(33, "Dark Desert", "That's where it came from", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
				//7 = 7th   
				
		};
	}
		
		//CastleArea
			//*Castle Floor 0
		if(Area == 34){//34
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(34, "Castle Floor 0", "A certain power", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(34, "Castle Floor 0", "the ability to walk through walls", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(34, "Castle Floor 0", "The ability to summon monsters at will", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(34, "Castle Floor 0", "To wield anything as a weapon", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(34, "Castle Floor 0", "A mysterious power that can do almost anything", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(34, "Castle Floor 0", "A dangerous power", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(34, "Castle Floor 0", "The power of glitch", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
			//Castle Floor1?
		if(Area == 35){ //35
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(35, "Castle Floor 1?", "The sky is green?", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(35, "Castle Floor 1?", "It has blue stone", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(35, "Castle Floor 1?", "there is a large door", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(35, "Castle Floor 1?", "inside a large castle", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(35, "Castle Floor 1?", "It's medium sized", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(35, "Castle Floor 1?", "It seems rather empty", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(35, "Castle Floor 1", "A large castle", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor2
		if(Area == 36){ //36
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(36, "Castle Floor 2", "Taller inside than out", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor3
		if(Area == 37){ //37
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(37, "Castle Floor 3", "3rd Floor?", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor4
		if(Area == 38){ //38
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(38, "Castle Floor 4", "How tall is this place?", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor5
		if(Area == 39){ //39
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(39, "Castle Floor 5", "Not a castle, a tower", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor6
		if(Area == 40){ //40
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(40, "Castle Floor 6", "Still more?", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor7
		if(Area == 41){ //41
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(41, "Castle Floor 7", "No way this is normal", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor8
		if(Area == 42){ //42
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(42, "Castle Floor 8", "It's too tall!", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor9
		if(Area == 43){ //43
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(43, "Castle Floor 9", "Whatever man", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Castle Floor10
		if(Area == 44){ //44
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(44, "Castle Floor 10", "The top floor!", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//*Castle Floor11
		if(Area == 45){ //45
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(45, "Castle Floor 11", "Impossible!", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Dark Castle
	if(Area == 46){ //46
		AData = new AreaData[]{
				//0 = Cutscene Quest
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//1 = Normal Mode
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//2 = Easy Mode
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//3 = Hard Mode
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//4 = Other Story
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//5 = Glitch
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//6 = Beta
				new AreaData(46, "Dark Castle", "Made of black stone", 1, "Dark Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
				//7 = 7th   
				
		};
	}
		
		//Dark Area
			//Dark Area1
		if(Area == 47){ //47
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
			//Dark Area2
		if(Area == 48){ //48
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}


			//Dark Area 3
		if(Area == 49){ //49
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(49, "Dark Area 3", "The stone is black", 1, "Dark Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Unfinished Area
		if(Area == 50){ //50
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		//Secret Path?
		if(Area == 51){ //51
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(51, "SecretPath", "Dark forest path", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
		//Forest?
		if(Area == 52){ //52
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
		
		//Snowy Mountain
			//Path
		if(Area == 53){ //53
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Gate
		if(Area == 54){ //54
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Snowy Path
		if(Area == 55){ //55
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Snow Mountain Base
		if(Area == 56){ //56
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(56, "SnyMntBase", "Foot of a mountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(56, "SnyMntBase", "Covered in snow", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(56, "SnyMntBase", "Foot of snowy mountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(56, "SnyMntBase", "Foot of snowy mountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(56, "SnyMntBase", "Foot of snowy mountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(56, "SnyMntBase", "Foot of snowy mountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(56, "SnyMntBase", "Foot of snowy mountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Path1
		if(Area == 57){//57
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(57, "SnwyPath1", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Cave
		if(Area == 58){//58
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(58, "SnwyCave", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//1 = Normal Mode
					
					//2 = Easy Mode
					
					//3 = Hard Mode
					
					//4 = Other Story
					
					//5 = Glitch
					
					//6 = Beta
					
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Mine (Coded Armor)
		if(Area == 59){//59
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(59, "Mine", "TestArea1", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//1 = Normal Mode
					
					//2 = Easy Mode
					
					//3 = Hard Mode
					
					//4 = Other Story
					
					//5 = Glitch
					
					//6 = Beta
					
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Path2
		if(Area == 60){//60
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(60, "SnwyPath2", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//1 = Normal Mode
					
					//2 = Easy Mode
					
					//3 = Hard Mode
					
					//4 = Other Story
					
					//5 = Glitch
					
					//6 = Beta
					
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Cabin (Radeo Static) Negative Image?
		if(Area == 61){//61
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(61, "Cabin", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Path3
		if(Area == 62){//62
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(62, "SnwyPath3", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Snowy Mountain Peak (Ice Dragon)
		if(Area == 63){//63
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(63, "SnowyPeak", "what a view", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(63, "SnowyPeak", "you can see the town from here", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(63, "SnowyPeak", "the snow is deep enough", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(63, "SnowyPeak", "has rocks and ice", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(63, "SnowyPeak", "What a climb!", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(63, "SnowyPeak", "large pillars of ice", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(63, "SnowyPeak", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			//Other Snowy Peak?
			
		if(Area == 64){//64
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(64, "TestArea1", "Has blue crystals", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(64, "TestArea1", "has ancient plants", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(64, "TestArea1", "partly made of metal", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(64, "TestArea1", "has machinery", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(64, "TestArea1", "How did I get here?", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(64, "TestArea1", "the sky is blue", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(64, "TestArea1", "TestArea1", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
		if(Area == 65){//65
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(65, "TestArea2", "Has red crystals", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(65, "TestArea2", "contains water", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(65, "TestArea2", "is partly made of metal", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(65, "TestArea2", "has machines", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(65, "TestArea2", "Where am I?", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(65, "TestArea2", "has hanging wires", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(65, "TestArea2", "TestArea2", 1, "TestArea", 
							/*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{6}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
		if(Area == 66){//66
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(66, "TestArea3", "what is a circuit board?", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(66, "TestArea3", "It has blue water", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(66, "TestArea3", "has strange machanisms", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(66, "TestArea3", "it's mostly gray", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(66, "TestArea3", "am I lost?", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(66, "TestArea3", "the sky is normal", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(66, "TestArea3", "TestArea3", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{10}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
		if(Area == 67){//67
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(67, "TestArea4", "has green crystals", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//1 = Normal Mode
					new AreaData(67, "TestArea4", "has machinery", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(67, "TestArea4", "it's mostly gray", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(67, "TestArea4", "made partly of metal", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(67, "TestArea4", "What is this place?", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(67, "TestArea4", "the sky is gray", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(67, "TestArea4", "TestArea4", 1, "TestArea", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{19}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
					//7 = 7th   
					
			};
		}
			
		if(Area == 68){//68
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(68, "Password Area", "A Title Screen", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(68, "Password Area", "a strange place", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(68, "Password Area", "Has no sky", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(68, "Password Area", "Password Screen", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(68, "Password Area", "White with letters", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(68, "Password Area", "What's a new game?", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(68, "Password Area", "Password Screen", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Forbiddon Area
		if(Area == 69){//70
			AData = new AreaData[]{
					//0 = Cutscene Quest
					new AreaData(69, "Forbiddon Area", "Has a red Glow", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(69, "Forbiddon Area", "A dangerous area!", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(69, "Forbiddon Area", "Filled with red stone", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(69, "Forbiddon Area", "Looks like an arena", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(69, "Forbiddon Area", "It's all red", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(69, "Forbiddon Area", "There is metal", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(69, "Forbiddon Area", "The sky is red", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"", ""}) //Single time Only Event
					//7 = 7th   
					
			};
		}
		
		//Admin Area
		if(Area == 70){//0
			AData = new AreaData[]{
				//0 = Cutscene Quest
				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//1 = Normal Mode
				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//2 = Easy Mode
				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//3 = Hard Mode
				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//4 = Other Story
				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),//Single time Only Event
				//5 = Glitch
				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
				//6 = Beta
										
				//7 = 7th   
									
			};
		}
		
		return AData;//[Gamemode]
	}
	
//	//AreaList
//	public static AreaData[] AList(int[] Area1, int CurrentAreaNo, int[][] AreaAccess){
//		int ATotal = ATotal(Area1, CurrentAreaNo, AreaAccess);
//		AreaData[] AData = new AreaData[ATotal];{
//			int i = 0;
//
//			while(i < (ATotal - 1)){
//				AData[i] = new AreaData(000, "", "No Data", 1, "AdminArea", 
//						/*ItemChance*/new int[]{1}, new int[]{10}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
//						/*BattleChance*/new int[]{11}, new int[]{33}, 
//						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
//						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
//						/*Ypos, Xpos*/ 70, 60, 
//						/*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
//				i = i + 1;
//			}
//			int Total = 0;
//			
//			int i2 = 0;
//			
////			while (i2 < (ATotal - 1)){
////				if(Area1[i2] == 1 && AreaAccess[CurrentAreaNo - 1][i2] != 0){
////					AData[Total] = AData(i2 + 1, 0);
////					Total = Total + 1;
////				}
////				i2 = i2 + 1;
////			}
//			//TODO AData(i2 + 1, 0, ???)
//			while (i2 < (Area1.length)){
//				if(Area1[i2] == 1 && AreaAccess[CurrentAreaNo - 1][i2] != 0){
//					AData[Total] = AData1(i2 + 1, 0, 0);
//					Total = Total + 1;
//				}
//				i2 = i2 + 1;
//				//System.out.println("i2: " + i2 + "   ATotal: " + ATotal + "   Total: " + Total + "   AData: " + AData.length);
//			}
////			if(Area1[0] == 1 && AreaAccess[CurrentAreaNo-1][0] != 0){
////				AData[Total] = AData(1, 0); //Market  Old Number5
////				Total = Total + 1;
////			}
////			if(Area1[1] == 1 && AreaAccess[CurrentAreaNo-1][1] != 0){
////				AData[Total] = AData(2, 0); //Elder  Old Number3
////				Total = Total + 1;
////			}
////			if(Area1[2] == 1 && AreaAccess[CurrentAreaNo-1][2] != 0){
////				AData[Total] = AData(3, 0); //Cook  Old Number 2
////				Total = Total + 1;
////			}
////			if(Area1[3] == 1 && AreaAccess[CurrentAreaNo-1][3] != 0){
////				AData[Total] = AData(4, 0); //Weapnsmith Old Number 7
////				Total = Total + 1;
////			}
////			if(Area1[4] == 1 && AreaAccess[CurrentAreaNo-1][4] != 0){
////				AData[Total] = AData(5, 0); //Armorsmith Old Number 7
////				Total = Total + 1;
////			}
////			if(Area1[5] == 1 && AreaAccess[CurrentAreaNo-1][5] != 0){
////				AData[Total] = AData(6, 0); //Tavern Old Number 8
////				Total = Total + 1;
////			}
////			if(Area1[6] == 1 && AreaAccess[CurrentAreaNo-1][6] != 0){
////				AData[Total] = AData(7, 0); //Inventor Old Number 4
////				Total = Total + 1;
////			}
////			
////			if(Area1[7] == 1 && AreaAccess[CurrentAreaNo-1][7] != 0){
////				AData[Total] = AData(8, 0); //Town Gate Old Number 8
////				Total = Total + 1;
////			}
////			if(Area1[8] == 1 && AreaAccess[CurrentAreaNo-1][8] != 0){
////				AData[Total] = AData(9, 0); //Field Area1 Old Number 9
////				Total = Total + 1;
////			}
////			if(Area1[9] == 1 && AreaAccess[CurrentAreaNo-1][9] != 0){
////				AData[Total] = AData(10, 0); //Field Area2 Old Number 10
////				Total = Total + 1;
////			}
////			if(Area1[10] == 1 && AreaAccess[CurrentAreaNo-1][10] != 0){
////				AData[Total] = AData(11, 0); //Haunted Field Old Number 11
////				Total = Total + 1;
////			}
////			
////			if(Area1[11] == 1 && AreaAccess[CurrentAreaNo-1][11] != 0){
////				AData[Total] = new AreaData(12, "TestArea1", "TestArea1", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
////				Total = Total + 1;
////			}
////			if(Area1[12] == 1 && AreaAccess[CurrentAreaNo-1][12] != 0){
////				AData[Total] = new AreaData(13, "TestArea2", "TestArea2", 1, "TestArea", /*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{6}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
////				Total = Total + 1;
////			}
////			if(Area1[13] == 1 && AreaAccess[CurrentAreaNo-1][13] != 0){
////				AData[Total] = new AreaData(14, "TestArea3", "TestArea3", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{10}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
////				Total = Total + 1;
////			}
////			if(Area1[14] == 1 && AreaAccess[CurrentAreaNo-1][14] != 0){
////				AData[Total] = new AreaData(15, "TestArea4", "TestArea4", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{19}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
////				Total = Total + 1;
////			}
////			
////			if(Area1[15] == 1 && AreaAccess[CurrentAreaNo-1][15] != 0){
////				AData[Total] = new AreaData(16, "Password Area", "Password Screen", 0, "Screen Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}); //Single time Only Event
////				Total = Total + 1;
////			}
//		}
//		return AData;
//	}
	
	public static int ANo(int[] Area1Found, int ANo){
		int Index = 0;
		int i = 0;
		while(i < ANo - 1){
			Index = Index + Area1Found[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int ATotal(int[] Area1Found, int CurrentAreaNo, int[][] AreaAccessor){
		int Total = 0;
		int i = 0;
		while(i < Area1Found.length){
			if(AreaAccessor[CurrentAreaNo - 1][i] != 0){
				Total = Total + Area1Found[i];
			}
			i = i + 1;
		}
		return Total;
	}
}
