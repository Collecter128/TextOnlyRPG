package textonlyrpg;

public class AreaData {//Chances before or after? Rarity
	public int AreaNo = 000;
	public String AreaName = "TestArea1";
	public String ADescription = "TestArea1";//Description?
	public int ScreenType = 1;
	String AreaType = "TestArea";
	int[] Drop1 = {1}; //after description? -?
	int[] Drop1Percent = {10}; //-?
	int[] MoneyDrop = {3}; //-?
	int[] MoneyChance = {33}; //- ?
	int[] Battle = {1};//BattleData[50]
	int[] BattleChance = {33};//66;//? not actually the chance
	int[][]Events = {/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}};
//	int[] EventType1;
//		//1 = One Time Event
//		//2 = Multiple chances to happen
//		//3 = Key Event (One Time, Key Used)
//		//4 = Key Event (Multiple Times, Key Used)
//		//5 = Key Event (One Time, Key Not Used)
//		//6 = Key Event (Multiple Times, Key Not Used)
//	int[] EventType2;//KeyItem
//	int[] EventData; //Cutscene Event
//	int[] EventFlag;//Used to tell if an event has triggered or not
//	int[] EventChance;
	int Ypos;
	int Xpos;
	int[][] EnterCutscene = {{0, 0}};//SFlag, CutsceneNumber
		//Might add some things to allow for more specific requirements
		// Required Flags/flag Values {0,0}, Cutscene Played, Flags set, Flags value
		//	{0,0},0,{0,0}   example  {{0,0}, {0,0}}, 0,{{0,0}, {0,0}}
		//Or maybe
		// {Requirements}, Flag    like this???   {{0,0}, {0,0}}, 0
	static int i = 0;
	int ScreenMode = 1;
	String[] RandomText;
	int[] XChance = {10};
	int[] XBattle = {1};
	int[] RChance = {5};
	int[] RBattle = {1};
	
	
	public AreaData(int AreaNo, String AreaName, String ADescription, int ScreenType, String AreaType, int[] Drop1, int[] Drop1Percent, int[] MoneyDrop, int[] MoneyChance, int[] Battle, int[] BattleChance, int[] XBattle, int[] XChance, int[] RBattle, int[] RChance, int[][] Events, int Ypos, int Xpos, int[][] Cutscene, int ScreenMode, String[] RandomText){//EventData? 
		this.AreaNo = AreaNo;
		this.AreaName = AreaName;
		this.ADescription = ADescription;
		this.ScreenType = ScreenType;
		this.AreaType = AreaType;
		this.Drop1 = Drop1;
		this.Drop1Percent = Drop1Percent;
		this.MoneyDrop = MoneyDrop;
		this.MoneyChance = MoneyChance;
		this.Battle = Battle;
		this.BattleChance = BattleChance;
		this.XBattle = XBattle;
		this.XChance = XChance;
		this.RBattle = RBattle;
		this.RChance = RChance;
		this.Events = Events;
		this.Ypos = Ypos;
		this.Xpos = Xpos;
		this.EnterCutscene = Cutscene;
		this.ScreenMode = ScreenMode;
		this.RandomText = RandomText;
	}
	
	public int getAreaNo(){
		return AreaNo;
	}
	
	public String getAreaName(){
		return AreaName;
	}
	
	public String getADescription(){
		return ADescription;
	}
	
	public int getScreenType(){
		return ScreenType;
	}
	
	public String getAreaType(){
		return AreaType;
	}
	

//	public int getDrop1(){
//		return Drop1;
//	}
//	public int getDrop1Percent(){
//		return Drop1Percent;
//	}
	
//	public int getMONEYDROP(){
//		return MoneyDrop;
//	}
//	public int getMONEYCHANCE(){
//		return MoneyChance;
//	}
	
	public int getYpos(){
		return Ypos;
	}
	public int getXpos(){
		return Xpos;
	}

	//Remeber, PasswordData Loading Events!!!, Init CurrentArea, and other areadata things
	
	//AreaData(AreaNo, AreaName, ADescription, ScreenType, AreaType, Drop1, Drop1Percent, MoneyDrop, MoneyChance, Battle, BattleChance, Event, EventChance, Ypos, Xpos)
	public static AreaData AData(int Area, int Gamemode, int second){
		AreaData AData[] = new AreaData[] {new AreaData(000, "", "No Data", 1, "AdminArea", /*ItemChance*/new int[]{1}, new int[]{10}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{33}, /*XBattleChance*/new int[]{11}, new int[]{0}, /*RBattleChance*/new int[]{11}, new int[]{0}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/ 70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})};
		
		//if(second = 0){//Second Set Not Activated
			if(Area >= 0 && Area <=35){
				AData = AreaData1A.AData1(Area, 0, 0); 
			}
			else
				AData = AreaData1B.AData1(Area, 0, 0);
		//}
		//else{//Second Set Activated
			//if(Area >= 0 && Area <=35){
			//	AData = new AreaData[]{AreaData2A.AData2(Area, Gamemode, 0)};
			//}
			//else
			//	AData = new AreaData[]{AreaData2B.AData2(Area, Gamemode, 0)};
		//}
		
//		if(Area == 1){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(1, "Market", "Market", 13, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{0}, /*RBattleChance*/new int[]{22}, new int[]{0}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/30, 30, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//1 = Normal Mode
//					new AreaData(1, "Market", "Market", 13, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{0}, /*RBattleChance*/new int[]{22}, new int[]{0}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/30, 30, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 2){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(2, "Elder", "Elder's Office", 11, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{1}, new int[]{10}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{4, 29},{11, 37}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//1 = Normal Mode
//					new AreaData(2, "Elder", "Elder's Office", 11, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{1}, new int[]{10}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
//							/*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, 
//							/*Cutscene*/new int[][]{{4, 29},{11, 37}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 3){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(3, "Cook", "Cooks Kitchen", 4, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22},new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/30, 5, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//1 = Normal Mode
//					new AreaData(3, "Cook", "Cooks Kitchen", 4, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22},new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/30, 5, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 4){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(4, "WeaponSmith", "WeaponSmith's Shop", 10, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//1 = Normal Mode
//					new AreaData(4, "WeaponSmith", "WeaponSmith's Shop", 10, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 5){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(5, "ArmorSmith", "ArmorSmith's Shop", 16, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//1 = Normal Mode
//					new AreaData(5, "ArmorSmith", "ArmorSmith's Shop", 16, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 6){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(6, "Tavern", "Tavern", 17, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}),
//					//1 = Normal Mode
//					new AreaData(6, "Tavern", "Tavern", 17, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 7){
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(7, "Inventor", "Inventor's Shop", 14, "TownArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 140, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Alley 
//		if(Area == 8){ //8
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(8, "Alley", "A place off the normal path.", 1, "Town Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//							
//					//2 = Easy Mode
//							
//					//3 = Hard Mode
//							
//					//4 = Other Story
//							
//					//5 = Glitch
//						
//					//6 = Beta
//							
//					//7 = 7th   
//							
//			};
//		}
//			
//		if(Area == 9){ //9
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(9, "Town Gate", "The North Town Gate", 1, "TownArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{1}, new int[]{10}, /*BattleChance*/new int[]{11}, new int[]{00}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		
//		
//		if(Area == 10){ //10
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
////					new AreaData(10, "Field Area1", "A Grassy Field", 1, "FieldArea", /*ItemChance*/new int[]{5}, new int[]{30}, /*MoneyChance*/new int[]{3}, new int[]{50}, /*BattleChance*/new int[]{1}, new int[]{25}, /*XBattleChance*/new int[]{22}, 50, 1, 
////							/*Events*/new int[][]{
////									/*Slime1*/
////									/*EventType1*/{7, 7, 7, 7, 7},/*EventType2*/{1, 1, 1, 1, 1},/*EventData*/{39, 40, 41, 42, 43},/*EventFlag*/{5, 6, 7, 8, 9},/*EventChance*/{100, 100, 100, 100, 100}},
////									/*Slime2*/
////									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{40},/*EventFlag*/{6},/*EventChance*/{100},
////									/*Slime3*/
////									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{41},/*EventFlag*/{7},/*EventChance*/{100},
////									/*Slime4*/
////									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{42},/*EventFlag*/{8},/*EventChance*/{100},
////									/*Slime5*/
////									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{43},/*EventFlag*/{9},/*EventChance*/{100}}, 
////							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{3, 27}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					new AreaData(10, "Field Area1", "A Grassy Field", 1, "FieldArea", /*ItemChance*/new int[]{5}, new int[]{30}, /*MoneyChance*/new int[]{3}, new int[]{50}, /*BattleChance*/new int[]{1}, new int[]{25}, /*XBattleChance*/new int[]{22}, new int[]{50}, /*RBattleChance*/new int[]{22}, new int[]{-100}, 
//							/*Events*/new int[][]{
//									/*Slime1*/
//									/*EventType1*/{7, 7, 7, 7, 7, 7},/*EventType2*/{1, 1, 1, 1, 1, 1},/*EventData*/{39, 40, 41, 42, 43, 35},/*EventFlag*/{5, 6, 7, 8, 9, 10},/*EventChance*/{100, 100, 100, 100, 100, 100}},
//									/*Slime2*/
//									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{40},/*EventFlag*/{6},/*EventChance*/{100},
//									/*Slime3*/
//									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{41},/*EventFlag*/{7},/*EventChance*/{100},
//									/*Slime4*/
//									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{42},/*EventFlag*/{8},/*EventChance*/{100},
//									/*Slime5*/
//									///*EventType1*/{7},/*EventType2*/{1},/*EventData*/{43},/*EventFlag*/{9},/*EventChance*/{100}}, 
//							/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0,0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 11){ //11
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(11, "Field Area2", "A Grassy Field", 1, "FieldArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{77}, /*BattleChance*/new int[]{3}, new int[]{20}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{7},/*EventType2*/{1},/*EventData*/{35},/*EventFlag*/{10},/*EventChance*/{100}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		//Grassy Feild
//		if(Area == 12){//12
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(12, "Grassy Feild", "Has taller grass", 1, "Feild Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//							
//					//2 = Easy Mode
//							
//					//3 = Hard Mode
//							
//					//4 = Other Story
//							
//					//5 = Glitch
//							
//					//6 = Beta
//							
//					//7 = 7th   
//							
//			};
//		}
//		
//		if(Area == 13){ //13
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(13, "Haunted Field", "Dark Foggy Field", 1, "FieldArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{77}, /*BattleChance*/new int[]{2, 4}, new int[]{30, 30}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//			//CastleRuins
//		//12
//		if(Area == 14){ //14
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(14, "Castle Ruins", "Only some walls remain.", 1, "Feild Castle", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//			//Wide Field
//		//13
//		if(Area == 15){ //15
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(15, "Wide Feild", "Wide open area", 1, "Feild Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//			//RockyField
//		//14
//		if(Area == 16){ //16
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(16, "Rocky Field", "A feild near a cliff", 1, "Feild Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Cave
//		if(Area == 17){ //17
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(17, "Cave", "A small dark cave", 1, "Cave Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//*Endless Feild
//		if(Area == 18){ //18
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(18, "Endless Feild", "Stretches on and on?", 1, "Feild Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Null Area
//		if(Area == 19){ //19
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(19, "NULL Area", "White empty area", 1, "Null Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/0, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Null Area 2
//	if(Area == 20){ //20
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(20, "NULL Area 2", "Contains mystical carvings in too white stone", 1, "NULL Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/0, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//
//		//Dark Feild
//	if(Area == 21){ //21
//		AData = new AreaData[]{
//			//0 = Cutscene Quest
//			new AreaData(21, "Dark Field", "Black rocky area", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//			//1 = Normal Mode
//			
//			//2 = Easy Mode
//			
//			//3 = Hard Mode
//			
//			//4 = Other Story
//			
//			//5 = Glitch
//			
//			//6 = Beta
//			
//			//7 = 7th   
//			
//	};
//}
//
//		
//		//Mountain Area
//			//Mountain Trail1
//		if(Area == 22){ //22
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(22, "Mountain Trail1", "The stone is reddish", 1, "Mountain Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Mountain Stream
//	if(Area == 23){ //23
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(23, "Mountain Stream", "A little down from the regular path", 1, "Mountain Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//		
//			//Mountain Trail2
//		if(Area == 24){ //24
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(24, "Mountain Trail2", "Higher up the mountain", 1, "Mountain Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//			//Mountain Top
//		if(Area == 25){ //25
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(25, "Mountain Top", "The top of the mountain", 1, "Mountain Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Under the Mountain
//		if(Area == 26){ //26
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(26, "Under the Mountain", "You can see the mountain above you?", 1, "Mountain Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Dark Mountain
//	if(Area == 27){ //27
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(27, "Dark Mountain", "Black rocky area", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//	
//		
//		//Desert Area
//			//DesertArea1
//		if(Area == 28){ //28
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(28, "Desert Area 1", "Mostly just sand", 1, "Desert Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//			//Wide Desert
//		if(Area == 29){ //29
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(29, "Desert Area 2", "Still mostly sand", 1, "Desert Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//			//DesertOasis
//		if(Area == 30){//30
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(30, "DesertOasis", "Contains trees, plants, and water!", 1, "Desert Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		//Pyramid
//	if(Area == 31){//31
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(31, "Pyramid", "Suprisingly open inside", 1, "Desert Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//			//*Midnight Desert Area
//		if(Area == 32){//32
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(32, "Midnight Desert", "Always nighttime?", 1, "Desert Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/7, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Dark Desert
//	if(Area == 33){ //33
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(33, "Dark Desert", "Filled with black sand", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//		
//		//CastleArea
//			//*Castle Floor 0
//		if(Area == 34){//34
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(34, "Castle Floor 0", "A secret place?", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//			//Castle Floor1
//		if(Area == 35){ //35
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(35, "Castle Floor 1", "A large castle", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor2
//		if(Area == 36){ //36
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(36, "Castle Floor 2", "Floor 2nd", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor3
//		if(Area == 37){ //37
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(37, "Castle Floor 3", "3rd Floor", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor4
//		if(Area == 38){ //38
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(38, "Castle Floor 4", "4rd Floor", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor5
//		if(Area == 39){ //39
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(39, "Castle Floor 5", "5th Floor", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor6
//		if(Area == 40){ //40
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(40, "Castle Floor 6", "6th Floor", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor7
//		if(Area == 41){ //41
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(41, "Castle Floor 7", "7th Floor", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor8
//		if(Area == 42){ //42
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(42, "Castle Floor 8", "8th", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor9
//		if(Area == 43){ //43
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(43, "Castle Floor 9", "9th Floor", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Castle Floor10
//		if(Area == 44){ //44
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(44, "Castle Floor 10", "Castle Roof", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//*Castle Floor11
//		if(Area == 45){ //45
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(45, "Castle Floor 11", "???", 1, "Castle Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Dark Castle
//	if(Area == 46){ //46
//		AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(46, "Dark Castle", "Password Screen", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//				
//				//2 = Easy Mode
//				
//				//3 = Hard Mode
//				
//				//4 = Other Story
//				
//				//5 = Glitch
//				
//				//6 = Beta
//				
//				//7 = 7th   
//				
//		};
//	}
//		
//		//Dark Area
//			//Dark Area1
//		if(Area == 47){ //47
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(47, "Dark Area", "The sky looks strange here", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Dark Area2
//		if(Area == 48){ //48
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(48, "Dark Area 2", "Has strange structures", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//
//
//			//Dark Area 3
//		if(Area == 49){ //49
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(49, "Dark Area 3", "Password Screen", 1, "Dark Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Unfinished Area
//		if(Area == 50){ //50
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(50, "Unfinished Area", "AreaDescription", 1, "Unfinished Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		//Secret Path?
//		if(Area == 51){ //51
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(51, "SecretPath", "A Path leading to ???", 1, "SecretArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		//Forest?
//		if(Area == 52){ //52
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(52, "Forest", "A Large Forest", 1, "SecretArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Snowy Mountain
//			//Path
//		if(Area == 53){ //53
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(53, "Path", "Path to Snowy Mountain", 1, "FieldArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Gate
//		if(Area == 54){ //54
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(54, "Gate", "Gate to snowy mountain", 1, "FieldArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Path
//		if(Area == 55){ //55
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(55, "SnowyPath", "A snow covered pathway", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snow Mountain Base
//		if(Area == 56){ //56
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(56, "SnyMntBase", "Foot of snowy mountain", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Path1
//		if(Area == 57){//57
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(57, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Cave
//		if(Area == 58){//58
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(58, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Mine (Coded Armor)
//		if(Area == 59){//59
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(59, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Path2
//		if(Area == 60){//60
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(60, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Cabin (Radeo Static) Negative Image?
//		if(Area == 61){//61
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(61, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Path3
//		if(Area == 62){//62
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(62, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Snowy Mountain Peak (Ice Dragon)
//		if(Area == 63){//63
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(63, "TestArea1", "TestArea1", 1, "SnowMountain", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			//Other Snowy Peak?
//			
//		if(Area == 64){//64
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(64, "TestArea1", "TestArea1", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 65){//65
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(65, "TestArea2", "TestArea2", 1, "TestArea", /*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{6}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 66){//66
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(66, "TestArea3", "TestArea3", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{10}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		if(Area == 67){//67
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(67, "TestArea4", "TestArea4", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{19}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""})
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//			
//		if(Area == 68){//68
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(68, "Password Area", "Password Screen", 0, "Screen Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Forbiddon Area
//		if(Area == 69){//70
//			AData = new AreaData[]{
//					//0 = Cutscene Quest
//					new AreaData(69, "Forbiddon Area", "A dangerous area!", 1, "Forbiddon Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/3, 16, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/4, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//					//1 = Normal Mode
//					
//					//2 = Easy Mode
//					
//					//3 = Hard Mode
//					
//					//4 = Other Story
//					
//					//5 = Glitch
//					
//					//6 = Beta
//					
//					//7 = 7th   
//					
//			};
//		}
//		
//		//Admin Area
//		if(Area == 70){//0
//			AData = new AreaData[]{
//				//0 = Cutscene Quest
//				new AreaData(70, "Admin Area", "Admin Screen", 1, "Admin Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{66}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}) //Single time Only Event
//				//1 = Normal Mode
//								
//				//2 = Easy Mode
//								
//				//3 = Hard Mode
//											
//				//4 = Other Story
//											
//				//5 = Glitch
//											
//				//6 = Beta
//										
//				//7 = 7th   
//									
//			};
//		}
		
		return AData[Gamemode];
	}
	
	//AreaList
	public static AreaData[] AList(int[] Area1, int CurrentAreaNo, int[][] AreaAccess){
		int ATotal = ATotal(Area1, CurrentAreaNo, AreaAccess);
		AreaData[] AData = new AreaData[ATotal];{
			int i = 0;

			while(i < (ATotal - 1)){
				AData[i] = new AreaData(000, "", "No Data", 1, "AdminArea", /*ItemChance*/new int[]{1}, new int[]{10}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{11}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/ 70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
				i = i + 1;
			}
			int Total = 0;
			
			int i2 = 0;
			
//			while (i2 < (ATotal - 1)){
//				if(Area1[i2] == 1 && AreaAccess[CurrentAreaNo - 1][i2] != 0){
//					AData[Total] = AData(i2 + 1, 0);
//					Total = Total + 1;
//				}
//				i2 = i2 + 1;
//			}
			//TODO AData(i2 + 1, 0, ???)
			while (i2 < (Area1.length)){
				if(Area1[i2] == 1 && AreaAccess[CurrentAreaNo - 1][i2] != 0){
					AData[Total] = AData(i2 + 1, 0, 0);
					Total = Total + 1;
				}
				i2 = i2 + 1;
				System.out.println("i2: " + i2 + "   ATotal: " + ATotal + "   Total: " + Total + "   AData: " + AData.length);
			}
//			if(Area1[0] == 1 && AreaAccess[CurrentAreaNo-1][0] != 0){
//				AData[Total] = AData(1, 0); //Market  Old Number5
//				Total = Total + 1;
//			}
//			if(Area1[1] == 1 && AreaAccess[CurrentAreaNo-1][1] != 0){
//				AData[Total] = AData(2, 0); //Elder  Old Number3
//				Total = Total + 1;
//			}
//			if(Area1[2] == 1 && AreaAccess[CurrentAreaNo-1][2] != 0){
//				AData[Total] = AData(3, 0); //Cook  Old Number 2
//				Total = Total + 1;
//			}
//			if(Area1[3] == 1 && AreaAccess[CurrentAreaNo-1][3] != 0){
//				AData[Total] = AData(4, 0); //Weapnsmith Old Number 7
//				Total = Total + 1;
//			}
//			if(Area1[4] == 1 && AreaAccess[CurrentAreaNo-1][4] != 0){
//				AData[Total] = AData(5, 0); //Armorsmith Old Number 7
//				Total = Total + 1;
//			}
//			if(Area1[5] == 1 && AreaAccess[CurrentAreaNo-1][5] != 0){
//				AData[Total] = AData(6, 0); //Tavern Old Number 8
//				Total = Total + 1;
//			}
//			if(Area1[6] == 1 && AreaAccess[CurrentAreaNo-1][6] != 0){
//				AData[Total] = AData(7, 0); //Inventor Old Number 4
//				Total = Total + 1;
//			}
//			
//			if(Area1[7] == 1 && AreaAccess[CurrentAreaNo-1][7] != 0){
//				AData[Total] = AData(8, 0); //Town Gate Old Number 8
//				Total = Total + 1;
//			}
//			if(Area1[8] == 1 && AreaAccess[CurrentAreaNo-1][8] != 0){
//				AData[Total] = AData(9, 0); //Field Area1 Old Number 9
//				Total = Total + 1;
//			}
//			if(Area1[9] == 1 && AreaAccess[CurrentAreaNo-1][9] != 0){
//				AData[Total] = AData(10, 0); //Field Area2 Old Number 10
//				Total = Total + 1;
//			}
//			if(Area1[10] == 1 && AreaAccess[CurrentAreaNo-1][10] != 0){
//				AData[Total] = AData(11, 0); //Haunted Field Old Number 11
//				Total = Total + 1;
//			}
//			
//			if(Area1[11] == 1 && AreaAccess[CurrentAreaNo-1][11] != 0){
//				AData[Total] = new AreaData(12, "TestArea1", "TestArea1", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{5}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
//				Total = Total + 1;
//			}
//			if(Area1[12] == 1 && AreaAccess[CurrentAreaNo-1][12] != 0){
//				AData[Total] = new AreaData(13, "TestArea2", "TestArea2", 1, "TestArea", /*ItemChance*/new int[]{9}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{6}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{1},/*EventType2*/{0},/*EventData*/{17},/*EventFlag*/{1},/*EventChance*/{40}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
//				Total = Total + 1;
//			}
//			if(Area1[13] == 1 && AreaAccess[CurrentAreaNo-1][13] != 0){
//				AData[Total] = new AreaData(14, "TestArea3", "TestArea3", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{10}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{5,7},/*EventType2*/{13,0},/*EventData*/{24,13},/*EventFlag*/{2,0},/*EventChance*/{100,30}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
//				Total = Total + 1;
//			}
//			if(Area1[14] == 1 && AreaAccess[CurrentAreaNo-1][14] != 0){
//				AData[Total] = new AreaData(15, "TestArea4", "TestArea4", 1, "TestArea", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{19}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}}, /*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
//				Total = Total + 1;
//			}
//			
//			if(Area1[15] == 1 && AreaAccess[CurrentAreaNo-1][15] != 0){
//				AData[Total] = new AreaData(16, "Password Area", "Password Screen", 0, "Screen Area", /*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{33}, /*XBattleChance*/new int[]{22}, new int[]{-100}, /*RBattleChance*/new int[]{22}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/190, 7, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""}); //Single time Only Event
//				Total = Total + 1;
//			}
		}
		return AData;
	}
	
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
