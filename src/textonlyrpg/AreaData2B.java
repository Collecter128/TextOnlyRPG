package textonlyrpg;

public class AreaData2B {//Chances before or after? Rarity
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
		
	
		
		//CastleArea
		
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Not much here...", "except monsters."}), //Single time Only Event
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
					new AreaData(36, "Castle Floor 2", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Must be taller inside.", "Looks normal outside."}), //Single time Only Event
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
					new AreaData(37, "Castle Floor 3", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"More stairs.", "A fifth floor?"}), //Single time Only Event
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
					new AreaData(38, "Castle Floor 4", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Whoa!", "That was close."}), //Single time Only Event
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
					new AreaData(39, "Castle Floor 5", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Is this a tower?", "Seems so."}), //Single time Only Event
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
					new AreaData(40, "Castle Floor 6", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Another monster.", "It's stronger."}), //Single time Only Event
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
					new AreaData(41, "Castle Floor 7", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Kind of ruins like.", "Seems sturdy though."}), //Single time Only Event
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
					new AreaData(42, "Castle Floor 8", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Floor nine.", "Are there a hundred?"}), //Single time Only Event
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
					new AreaData(43, "Castle Floor 9", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Another door?", "To where?"}), //Single time Only Event
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
					new AreaData(44, "Castle Floor 10", "Castle Area", 1, "Castle Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Is that the SKY?", "WHERE IS THE FLOOR?"}), //Single time Only Event
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
					new AreaData(45, "Castle Floor 11", "Castle Area", 1, "Castle Area", 
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
						/*ScreenMode*/1, /*RandomText*/new String[] {"Unfinished: You again...", "..."}), //Single time Only Event
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
				new AreaData(46, "Dark Castle", "Dark Area", 1, "Dark Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Ninja: I need to hide.", "Who's this bozo?"}), //Single time Only Event
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
					new AreaData(47, "Dark Area", "Dark Area", 1, "Dark Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Who made this?", "What language is that?"}), //Single time Only Event
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
					new AreaData(48, "Dark Area 2", "Dark Area", 1, "Dark Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"More here than I thought.", "More monsters too."}), //Single time Only Event
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
					new AreaData(49, "Dark Area 3", "Dark Area", 1, "Dark Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Unfinished: ...", "Many possible futures."}), //Single time Only Event
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
					new AreaData(50, "Unfinished Area", "Unfinished Area", 1, "Unfinished Area", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"What a forest!", "It's nice."}),
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
					new AreaData(51, "SecretPath", "SecretArea", 1, "SecretArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Don: Yeah that's me.", "What of it?"}),
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
					new AreaData(52, "Forest", "SecretArea", 1, "SecretArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"I knew it was here.", "It's close."}),
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
					new AreaData(53, "Path", "FieldArea", 1, "FieldArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Guard2: How boring.", ""}),
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
					new AreaData(54, "Gate", "FieldArea", 1, "FieldArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Somewhere up there.", "It is there..."}),
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
					new AreaData(55, "SnowyPath", "SnowMountain", 1, "SnowMountain", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Ah! There it is.", "A way up."}),
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
					new AreaData(56, "SnyMntBase", "SnowMountain", 1, "SnowMountain", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"So much snow.", "I can't move it."}),
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
					new AreaData(57, "SnwyPath1", "SnowMountain", 1, "SnowMountain", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Wait.", "Is it the same?"}),
					//1 = Normal Mode
					new AreaData(58, "SnwyCave", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(58, "SnwyCave", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(58, "SnwyCave", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(58, "SnwyCave", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(58, "SnwyCave", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(58, "SnwyCave", "SnowMountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"I need a pickaxe.", "Maybe later."}),
					//1 = Normal Mode
					new AreaData(59, "Mine", "TestArea1", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(59, "Mine", "TestArea1", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(59, "Mine", "TestArea1", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(59, "Mine", "TestArea1", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(59, "Mine", "TestArea1", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(59, "Mine", "SnowMountain", 1, "SnowMountain",
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"The snow!", ""}),
					//1 = Normal Mode
					new AreaData(60, "SnwyPath2", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//2 = Easy Mode
					new AreaData(60, "SnwyPath2", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//3 = Hard Mode
					new AreaData(60, "SnwyPath2", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//4 = Other Story
					new AreaData(60, "SnwyPath2", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//5 = Glitch
					new AreaData(60, "SnwyPath2", "TestArea1", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
					//6 = Beta
					new AreaData(60, "SnwyPath2", "SnowMountain", 1, "SnowMountain", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{5}, new int[]{33}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, 
							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"A ghost!", "In a... device?"}),
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
					new AreaData(61, "Cabin", "SnowMountain", 1, "SnowMountain", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"SO much snow...", ""}),
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
					new AreaData(62, "SnwyPath3", "SnowMountain", 1, "SnowMountain", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"What the?", "Here it comes!"}),
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
					new AreaData(63, "SnowyPeak", "SnowMountain", 1, "SnowMountain", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"machinery?", "This is a field!"}),
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
					new AreaData(64, "TestArea1", "TestArea", 1, "TestArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"It looks...", "half man made."}),
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
					new AreaData(65, "TestArea2", "TestArea", 1, "TestArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"What!", "New monsters!"}),
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
					new AreaData(66, "TestArea3", "TestArea", 1, "TestArea", 
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
							/*ScreenMode*/1, /*RandomText*/new String[] {"Wha...", "the Sky!"}),
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
					new AreaData(67, "TestArea4", "TestArea", 1, "TestArea", 
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
					new AreaData(68, "Title Area", "A Title Screen", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//1 = Normal Mode
					new AreaData(68, "Title Area", "a strange place", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//2 = Easy Mode
					new AreaData(68, "Title Area", "Has no sky", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//3 = Hard Mode
					new AreaData(68, "Title Area", "Password Screen", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//4 = Other Story
					new AreaData(68, "Title Area", "White with letters", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//5 = Glitch
					new AreaData(68, "Title Area", "What's a new game?", 0, "Screen Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
					//6 = Beta
					new AreaData(68, "Password Area", "Screen Area", 0, "Screen Area", 
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
					new AreaData(69, "Forbiddon Area", "The sky is red", 1, "Forbiddon Area", 
							/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
							/*BattleChance*/new int[]{11}, new int[]{66}, 
							/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
							/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, 
							/*ScreenMode*/4, /*RandomText*/new String[] {"How did I get here?", "What is this place?"}), //Single time Only Event
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
					new AreaData(69, "Forbiddon Area", "Forbiddon Area", 1, "Forbiddon Area", 
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
				new AreaData(70, "Admin Area", "Admin Area", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}), //Single time Only Event
				//6 = Beta
				new AreaData(70, "Admin Area", "Admin Area", 1, "Admin Area", 
						/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
						/*BattleChance*/new int[]{11}, new int[]{66}, 
						/*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
						/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},
						/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, 
						/*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
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
