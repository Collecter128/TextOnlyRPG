package textonlyrpg;

public class LevelUpData {

	public static int[] LevelData(int Exp, int Currentlv, int Gamemode){
		int[] NewLevel = {0, 1};// Exp, Level
		int[] ExpNext = {0, 5, 10, 0};// Exp, Level 99
		
		if(Gamemode == 0){
			ExpNext = new int[]{0, 0};// Exp, 1 Level
			if(Currentlv < ExpNext.length){
				if(ExpNext[Currentlv] <= Exp){
					NewLevel = new int[]{ExpNext[Currentlv + 1], Currentlv + 1};
				}
			}
		}
		if(Gamemode == 1){//Normal
			ExpNext = new int[]{0, 5, 10, 15, 20, 0};// Exp, Level 99
			if(Currentlv < ExpNext.length){
				if(ExpNext[Currentlv] <= Exp){
					NewLevel = new int[]{ExpNext[Currentlv + 1], Currentlv + 1};
				}
			}
		}
		else{//Other Mode
			ExpNext = new int[]{0, 5, 10, 0};// Exp, Level 99
			if(Currentlv < ExpNext.length){
				if(ExpNext[Currentlv] <= Exp){
					NewLevel = new int[]{ExpNext[Currentlv + 1], Currentlv + 1};
				}
			}
		}
		return NewLevel;
	}
	
	public static int[] LoadStats(int CurrentLevel, int Gamemode){//GetStats?
		//Hp1, Hp2, Hp3, Hp4, Atk1, Atk2, Atk3, Atk4, Def1, Def2, Def3, Def4
		int[] CurrentStats = {0, 1};
		int[][] CutsceneModeLevelData = {{/*Lvl*/0, /*HP*/0, 0, 0, 0, /*Atk*/0, 0, 0, 0, /*Def*/0, 0, 0, 0, /*Speed*/100, /*Luck*/10}, 
				{/*Lvl*/1, /*HP*/0, 0, 3, 0, /*Atk*/0, 0, 1, 3, /*Def*/0, 0, 0, 2, /*Speed*/100, /*Luck*/10}};
		
		int[][] NormalModeLevelData = {{/*Lvl*/0, /*HP*/0, 0, 0, 5, /*Atk*/0, 0, 0, 5, /*Def*/0, 0, 0, 2, /*Speed*/100, /*Luck*/10}, 
										{/*Lvl*/1, /*HP*/0, 0, 2, 5, /*Atk*/0, 0, 1, 5, /*Def*/0, 0, 0, 3, /*Speed*/100, /*Luck*/10}, 
										{/*Lvl*/2, /*HP*/0, 0, 3, 5, /*Atk*/0, 0, 1, 7, /*Def*/0, 0, 0, 5, /*Speed*/100, /*Luck*/10},
										{/*Lvl*/3, /*HP*/0, 0, 5, 0, /*Atk*/0, 0, 2, 0, /*Def*/0, 0, 0, 7, /*Speed*/100, /*Luck*/10},
										{/*Lvl*/4, /*HP*/0, 0, 6, 5, /*Atk*/0, 0, 2, 5, /*Def*/0, 0, 0, 8, /*Speed*/100, /*Luck*/10},
										{/*Lvl*/5, /*HP*/0, 0, 7, 0, /*Atk*/0, 0, 2, 7, /*Def*/0, 0, 0, 9, /*Speed*/100, /*Luck*/10}};
		int[][] OtherModeLevelData = {{/*Lvl*/0, /*HP*/0, 0, 0, 0, /*Atk*/0, 0, 0, 0, /*Def*/0, 0, 0, 0, /*Speed*/100, /*Luck*/10}, 
				{/*Lvl*/1, /*HP*/0, 0, 2, 2, /*Atk*/0, 0, 1, 3, /*Def*/0, 0, 0, 2, /*Speed*/100, /*Luck*/10}, 
				{/*Lvl*/2, /*HP*/0, 0, 3, 3, /*Atk*/0, 0, 1, 5, /*Def*/0, 0, 0, 4, /*Speed*/100, /*Luck*/10},
				{/*Lvl*/3, /*HP*/0, 0, 4, 4, /*Atk*/0, 0, 1, 7, /*Def*/0, 0, 0, 6, /*Speed*/100, /*Luck*/10}};
		
//		if(CurrentLevel == 0){
//			
//		}
		if(Gamemode == 0){
			if(CurrentLevel < CutsceneModeLevelData[CurrentLevel].length){
				CurrentStats = CutsceneModeLevelData[CurrentLevel];
			}
		}
		if(Gamemode == 1){//Normal Mode
			if(CurrentLevel < NormalModeLevelData[CurrentLevel].length){
				CurrentStats = NormalModeLevelData[CurrentLevel];
			}
		}
		else{//Other Mode
			if(CurrentLevel < OtherModeLevelData[CurrentLevel].length){
				CurrentStats = OtherModeLevelData[CurrentLevel];
			}
		}
		return CurrentStats;
	}
	
}
