package textonlyrpg;

public class MonsterData03 {
	

	public static MonsterData MData(int MonsterNo, int Var){
		//MonsterData[] AllMData = new MonsterData[] {new MonsterData(0, "", "Defaulter", /*MHP*/9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MDef*/9, 9, 9, 9, 1, "...", /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.5}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{0, 0, 0},{0, 0, 0}})};
		MonsterData MInfo[] = new MonsterData[]{new MonsterData(0, "", "", new String[]{"Defaulter"}, new String[]{"Defaulter"},/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)};// 
		{
//			switch(MonsterNo){
//			case 0:
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//1 = Normal Mode
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//2 = Easy Mode
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//3 = Hard Mode
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//4 = Other Story
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//5 = Glitch
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//6 = Beta
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}}),
//						//7 = 7th    ??? for funny cutscene 
//						new MonsterData(000, "00", "Coded Edge", /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MDef*/0, 0, 0, 7, 1, "No Data", /*ItemDrop?*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 20, 1},{1, 20, 1}})
//				};
//				break;
//			}
			
//			//Defaulter?
//			if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//002 Ice Dragon
			if(MonsterNo == 217){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(217, "72", "000", new String[]{"Ice Dragon"}, new String[]{"IceDragon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice dtagon", new String[]{"The ice dragon", "It's ice clear"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(217, "000", "002", new String[]{"Ice Dragon"}, new String[]{"IceDragon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice dtagon", new String[]{"The ice dragon", "Finally found it"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(217, "000", "002", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice dtagon", new String[]{"The ice dragon", "not a normal dragon"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(217, "000", "002", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice dtagon", new String[]{"The ice dragon", "I saw it before"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(217, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A dragon! Yikes!", new String[]{"It's a dragon!", "Made of ice?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(217, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice dtagon", new String[]{"The ice dragon", "It attacked a town"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(217, "000", "000", new String[]{"Ice Dragon"}, new String[]{"IceDragon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice dtagon", new String[]{"The ice dragon", "has breath attacks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Red Ice Dragon
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//012 Cold Jam
			else if(MonsterNo == 220){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(220, "73", "000", new String[]{"Cold Jam"}, new String[]{"Cold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A cold slime boss!", new String[]{"A cold slime", "It's blue-purple"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(220, "000", "012", new String[]{"Cold Jam"}, new String[]{"Cold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A cold slime boss!", new String[]{"A cold slime", "It's large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(220, "000", "012", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A cold slime boss!", new String[]{"A cold slime", "less bouncy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(220, "000", "012", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A cold slime boss!", new String[]{"A cold slime", "gives off cold"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(220, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's... cold!", new String[]{"It's so cold", "It should freeze"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(220, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A cold slime boss!", new String[]{"A cold slime", "It moves less"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(220, "000", "000", new String[]{"Cold Jam"}, new String[]{"Cold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A cold slime boss!", new String[]{"A cold slime", "A slime boss"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Amber Cold Jam
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//022 Frozen Curse
			else if(MonsterNo == 223){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(223, "74", "000", new String[]{"Frozen Curse"}, new String[]{"FroznCurse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Ice element ghost", new String[]{"An Icy ghost", "It's icy blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(223, "000", "022", new String[]{"Frozen Curse"}, new String[]{"FroznCurse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Ice element ghost", new String[]{"An Icy ghost", "It doesn't move"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(223, "000", "022", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Ice element ghost", new String[]{"An Icy ghost", "Has no features"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(223, "000", "022", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Ice element ghost", new String[]{"An Icy ghost", "It glows"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(223, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A creepy ghost", new String[]{"It doesn't move", "Spooky!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(223, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Ice element ghost", new String[]{"An Icy ghost", "It floats"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(223, "000", "000", new String[]{"Frozen Curse"}, new String[]{"FroznCurse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Ice element ghost", new String[]{"An Icy ghost", "Gives off mist"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
						
				};
			}
//				//Freezing Curse
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//032 Gaint Statue
			else if(MonsterNo == 226){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(226, "75", "000", new String[]{"Giant Statue"}, new String[]{"Gnt Statue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A giant monster", new String[]{"A giant monster!", "It's icy brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(226, "000", "032", new String[]{"Giant Statue"}, new String[]{"Gnt Statue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A giant monster", new String[]{"A giant monster!", "Has strange features"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(226, "000", "032", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A giant monster", new String[]{"A giant monster!", "It's very big"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(226, "000", "032", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A giant monster", new String[]{"A giant monster!", "has odd porpotions"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(226, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's smile is wierd", new String[]{"has a strange face", "It's creepy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(226, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A giant monster", new String[]{"A giant monster!", "Stares ominously"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(226, "000", "000", new String[]{"Frost Statue"}, new String[]{"FrstStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A giant monster", new String[]{"A giant monster!", "Has big shoulders"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Frozen Titan Statue
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//042 Coded Knight
			else if(MonsterNo == 229){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(229, "76", "000", new String[]{"Coded Knight"}, new String[]{"CodedKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Upgraded armor monster", new String[]{"It's changed!", "Its Silver Blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(229, "000", "042", new String[]{"Coded Knight"}, new String[]{"CodedKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Upgraded armor monster", new String[]{"It's changed!", "It's thinner"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(229, "000", "042", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Upgraded armor monster", new String[]{"It's changed!", "It's become taller"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(229, "000", "042", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Upgraded armor monster", new String[]{"It's changed!", "It has a shield"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(229, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's different!", new String[]{"Coded Armor...", "It's back!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(229, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Upgraded armor monster", new String[]{"It's changed!", "The swird is thinner"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(229, "000", "000", new String[]{"Coded Armor"}, new String[]{"CodedArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Upgraded armor monster", new String[]{"It's changed!", "Is it more powerful?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Coded Knight R
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//0*2 Frost Edge
			else if(MonsterNo == 232){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(232, "77", "000", new String[]{"Frost Edge"}, new String[]{"Frost Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy Sword monster", new String[]{"An Icy sword", "It's light blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(232, "000", "0*2", new String[]{"Frost Edge"}, new String[]{"Frost Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy Sword monster", new String[]{"An Icy sword", "Floats tip down"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(232, "000", "0*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy Sword monster", new String[]{"An Icy sword", "Has a blue gem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(232, "000", "0*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy Sword monster", new String[]{"An Icy sword", "covered with ice"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(232, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Another sword?", new String[]{"Another one?", "Sword monsters..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(232, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy Sword monster", new String[]{"An Icy sword", "It's curved"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(232, "000", "000", new String[]{"Frost Edge"}, new String[]{"Frost Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy Sword monster", new String[]{"An Icy sword", "It's large!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Frozen Edge
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//102 Liquid Shadow
			else if(MonsterNo == 235){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(235, "78", "000", new String[]{"Liquid Shadow"}, new String[]{"Lqd Shadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A puddle of shadow", new String[]{"A puddle of shadow", "It's pitch black!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(235, "000", "102", new String[]{"Liquid Shadow"}, new String[]{"Lqd Shadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A puddle of shadow", new String[]{"A puddle of shadow", "slides around"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(235, "000", "102", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A puddle of shadow", new String[]{"A puddle of shadow", "more liquid than slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(235, "000", "102", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A puddle of shadow", new String[]{"A puddle of shadow", "attacks with tendrils"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(235, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's unsettling", new String[]{"The way it moves", "creeps me out!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(235, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A puddle of shadow", new String[]{"A puddle of shadow", "amorphous"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(235, "000", "000", new String[]{"Stealth Slime"}, new String[]{"StlthSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Hidden Slime", new String[]{"A Stealth Slime", "Hard to see"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Dark Matter
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//112 Extra Rare Slime
			else if(MonsterNo == 238){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(238, "79", "000", new String[]{"Extra Rare Slime"}, new String[]{"ExRareSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A rare slime monster", new String[]{"A rare slime", "It's lime green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(238, "000", "112", new String[]{"Extra Rare Slime"}, new String[]{"ExRareSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A rare slime monster", new String[]{"A rare slime", "normally hard to find"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(238, "000", "112", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A rare slime monster", new String[]{"A rare slime", "what a lucky time!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(238, "000", "112", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A rare slime monster", new String[]{"A rare slime", "similar to normal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(238, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "How lucky!", new String[]{"It's rare!", "How lucky!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(238, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A rare slime monster", new String[]{"A rare slime", "rarer than rare"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(238, "000", "000", new String[]{"Extra Rare Slime"}, new String[]{"ExRareSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A rare slime monster", new String[]{"A rare slime", "very valuable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Very Extra Rare Slime
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//122 Transparent Slime
			else if(MonsterNo == 241){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(241, "80", "000", new String[]{"Transparent Slime"}, new String[]{"TrnspntSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A transparent slime", new String[]{"Transparent Slime", "It's gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(241, "000", "122", new String[]{"Transparent Slime"}, new String[]{"TrnspntSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A transparent slime", new String[]{"Transparent Slime", "It's clear"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(241, "000", "122", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A transparent slime", new String[]{"Transparent Slime", "It's not shiny"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(241, "000", "122", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A transparent slime", new String[]{"Transparent Slime", "Bouncy as slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(241, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to see", new String[]{"More transparent?", "It's hard to see!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(241, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A transparent slime", new String[]{"Transparent Slime", "Slime Sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(241, "000", "000", new String[]{"Transparent Slime"}, new String[]{"TrnspntSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A transparent slime", new String[]{"Transparent Slime", "Uses stealth"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Stealth Slime
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//132 Icicle Slime
			else if(MonsterNo == 244){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(244, "81", "000", new String[]{"Icicle Slime"}, new String[]{"IciclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An ice spike slime", new String[]{"a spiky slime", "It's faintly blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(244, "000", "132", new String[]{"Icicle Slime"}, new String[]{"IciclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An ice spike slime", new String[]{"a spiky slime", "made of ice"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(244, "000", "132", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An ice spike slime", new String[]{"a spiky slime", "like golem slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(244, "000", "132", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An ice spike slime", new String[]{"it has icicles", "they are large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(244, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's so spiky!", new String[]{"Its spiky!", "So dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(244, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An ice spike slime", new String[]{"a spiky slime", "Is there a middle?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(244, "000", "000", new String[]{"Icicle Slime"}, new String[]{"IciclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An ice spike slime", new String[]{"a spiky slime", "beware it's counter!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Purple Icicle Slime (Poison!)
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//142 Armor Jell
			else if(MonsterNo == 247){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(247, "82", "000", new String[]{"Armor Jell"}, new String[]{"Armor Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armored Jell", new String[]{"An Armored Jell", "It is orange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(247, "000", "142", new String[]{"Armor Jell"}, new String[]{"Armor Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armored Jell", new String[]{"An Armored Jell", "The armor is green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(247, "000", "142", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armored Jell", new String[]{"An Armored Jell", "the armor is plates"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(247, "000", "142", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armored Jell", new String[]{"An Armored Jell", "there are gaps"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(247, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Now it has armor!", new String[]{"More armor!", "How is it so common?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(247, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armored Jell", new String[]{"An Armored Jell", "The plates move"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(247, "000", "000", new String[]{"Armor Jell"}, new String[]{"Armor Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armored Jell", new String[]{"An Armored Jell", "like armored slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				//Jell Armored Jell
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//1*2 Jelly!
			else if(MonsterNo == 250){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(250, "83", "000", new String[]{"Jelly!"}, new String[]{"Jelly!"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Jelly Monster?", new String[]{"Is it slime?", "It's red"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(250, "000", "1*2", new String[]{"Jelly!"}, new String[]{"Jelly!"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Jelly Monster?", new String[]{"Is it slime?", "It smells nice"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(250, "000", "1*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Jelly Monster?", new String[]{"Is it slime?", "It tastes good?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(250, "000", "1*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Jelly Monster?", new String[]{"Is it slime?", "It's bouncy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(250, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Smells like fruit?", new String[]{"Looks like slime.", "Is it food?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(250, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Jelly Monster?", new String[]{"Is it slime?", "It is..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(250, "000", "000", new String[]{"Jelly!"}, new String[]{"Jelly!"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Jelly Monster?", new String[]{"Is it slime?", "Slightly smaller."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)

				};
			}
//				// Sticky Jelly! (sticky Curse)
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//202 Frozen Wraith
			else if(MonsterNo == 253){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(253, "84", "000", new String[]{"Frozen Wraith"}, new String[]{"FrznWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy wraith", new String[]{"An icy wraith", "It's dark blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(253, "000", "202", new String[]{"Frozen Wraith"}, new String[]{"FrznWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy wraith", new String[]{"An icy wraith", "Has an icy aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(253, "000", "202", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy wraith", new String[]{"An icy wraith", "makes cracking sounds"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(253, "000", "202", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy wraith", new String[]{"An icy wraith", "surprisingly thin"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(253, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A wraith but cold", new String[]{"It's cold!", "It's really cold"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(253, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy wraith", new String[]{"An icy wraith", "wears a tattered cloak"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(253, "000", "000", new String[]{"Frozen Wraith"}, new String[]{"FrznWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Icy wraith", new String[]{"An icy wraith", "floats up high"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Lich
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//212 Ectoplasm - Lv.9
			else if(MonsterNo == 256){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(256, "85", "000", new String[]{"Ectoplasm Lv.9"}, new String[]{"EctplsmLv9"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "high level ectoplasm", new String[]{"It's high level", "It's orange and blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(256, "000", "212", new String[]{"Ectoplasm Lv.9"}, new String[]{"EctplsmLv9"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "high level ectoplasm", new String[]{"It's high level", "it's a little bigger?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(256, "000", "212", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "high level ectoplasm", new String[]{"It's high level", "still looks firey"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
								/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(256, "000", "212", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "high level ectoplasm", new String[]{"It's high level", "it's still small"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(256, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's orange?", new String[]{"It's orange?", "How odd"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(256, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "high level ectoplasm", new String[]{"It's high level", "it floats around"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(256, "000", "000", new String[]{"Extoplasm Lv.9"}, new String[]{"ExtplsmLv9"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "high level ectoplasm", new String[]{"It's high level", "has faint aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Will o Wisp Lv.9
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//222 Lingering Grudge
			else if(MonsterNo == 259){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(259, "86", "000", new String[]{"Lingering Grudge"}, new String[]{"LngrgGrudg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A type of ghost", new String[]{"A type of ghost", "It's monochrome"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(259, "000", "222", new String[]{"Lingering Grudge"}, new String[]{"LngrgGrudg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A type of ghost", new String[]{"A type of ghost", "Looks like a person"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(259, "000", "222", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A type of ghost", new String[]{"A type of ghost", "moves slowly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(259, "000", "222", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A type of ghost", new String[]{"A type of ghost", "doesn't stop"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(259, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It follows", new String[]{"It's creepy", "Why does it stare?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(259, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A type of ghost", new String[]{"A type of ghost", "black smoke?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(259, "000", "000", new String[]{"Lingering Grudge"}, new String[]{"LngrgGrudg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A type of ghost", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Following Grudge
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//232 Ice Shadow
			else if(MonsterNo == 262){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(262, "87", "000", new String[]{"Ice Shadow"}, new String[]{"IceShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An icy ghost", new String[]{"A shadow ghost", "It's light blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(262, "000", "232", new String[]{"Ice Shadow"}, new String[]{"IceShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An icy ghost", new String[]{"A shadow ghost", "has no shading"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(262, "000", "232", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An icy ghost", new String[]{"A shadow ghost", "has a weapon"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(262, "000", "232", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An icy ghost", new String[]{"A shadow ghost", "Its large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(262, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's bulky", new String[]{"surprisingly large", "it moves too quick!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(262, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An icy ghost", new String[]{"A shadow ghost", "a warrior?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(262, "000", "000", new String[]{"Ice Shadow"}, new String[]{"IceShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An icy ghost", new String[]{"A shadow ghost", "not tranparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Frozen Shadow
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//242 Cursed Armor
			else if(MonsterNo == 265){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(265, "88", "000", new String[]{"Cursed Armor"}, new String[]{"Crsd Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possessed armor", new String[]{"Possessed armor", "Blueish"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(265, "000", "242", new String[]{"Cursed Armor"}, new String[]{"Crsd Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possessed armor", new String[]{"Possessed armor", "has odd markings"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(265, "000", "242", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possessed armor", new String[]{"Possessed armor", "it shambles"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(265, "000", "242", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possessed armor", new String[]{"Possessed armor", "the armor is gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(265, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Moves oddly", new String[]{"Not undead but...", "looks like it"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(265, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possessed armor", new String[]{"Possessed armor", "has a sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(265, "000", "000", new String[]{"Cursed Armor"}, new String[]{"Crsd Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possessed armor", new String[]{"Possessed armor", "has no faceplate"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Forbiddon Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//2*2 Radio Static
			else if(MonsterNo == 268){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(268, "89", "000", new String[]{"Radio Static"}, new String[]{"RadioStatc"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost and device", new String[]{"A ghost and box", "The box is brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(268, "000", "2*2", new String[]{"Radio Static"}, new String[]{"RadioStatc"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost and device", new String[]{"A ghost and box", "Black and white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(268, "000", "2*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost and device", new String[]{"A ghost and box", "the box has metal parts"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(268, "000", "2*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost and device", new String[]{"A ghost and box", "The ghost is cloudish"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(268, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It came from a box!", new String[]{"Such noise!", "It's unpleasent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(268, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost and device", new String[]{"A ghost and box", "Can almost hear talking"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(268, "000", "000", new String[]{"Radio Static"}, new String[]{"RadioStatc"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost and device", new String[]{"A ghost and box", "It moves fluidly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Wight Noise
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//302 Ice Golem
			else if(MonsterNo == 271){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(271, "90", "000", new String[]{"Ice Golem"}, new String[]{"Ice Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice Golem", new String[]{"A golem of ice", "It's sort of clear"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(271, "000", "302", new String[]{"Ice Golem"}, new String[]{"Ice Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice Golem", new String[]{"A golem of ice", "It's frosted over"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(271, "000", "302", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice Golem", new String[]{"A golem of ice", "It's transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(271, "000", "302", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice Golem", new String[]{"A golem of ice", "It's large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(271, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's big!", new String[]{"It's huge.", "What the heck?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(271, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice Golem", new String[]{"A golem of ice", "Slightly spiky"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(271, "000", "000", new String[]{"Ice Golem"}, new String[]{"Ice Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An Ice Golem", new String[]{"A golem of ice", "Made of ice?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Black Ice Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//312 Magma Golem
			else if(MonsterNo == 274){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(274, "91", "000", new String[]{"Magma Golem"}, new String[]{"MagmaGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem of magma", new String[]{"A magma golem", "It's red"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(274, "000", "312", new String[]{"Magma Golem"}, new String[]{"MagmaGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem of magma", new String[]{"A magma golem", "It's hot!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(274, "000", "312", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem of magma", new String[]{"A magma golem", "It's golem sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(274, "000", "312", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem of magma", new String[]{"A magma golem", "It's liquidy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(274, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's super hot!", new String[]{"Yeouch!", "It's hot!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(274, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem of magma", new String[]{"A magma golem", "It's thick"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(274, "000", "000", new String[]{"Magma Golem"}, new String[]{"MagmaGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem of magma", new String[]{"A magma golem", "It's dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Volcano Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//322 Chaotic Possesed Earth
			else if(MonsterNo == 277){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(277, "92", "000", new String[]{"Chaotic Possesed Earth"}, new String[]{"CtcPssdEth"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possesed rocks", new String[]{"Possesed rocks", "They're brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(277, "000", "322", new String[]{"Chaotic Possesed Earth"}, new String[]{"CtcPssdEth"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possesed rocks", new String[]{"Possesed rocks", "They're sharp!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(277, "000", "322", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possesed rocks", new String[]{"Possesed rocks", "They're random"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(277, "000", "322", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possesed rocks", new String[]{"Possesed rocks", "They're floating"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(277, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Rocks everywhere!", new String[]{"It's too random!", "It's just rocks!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(277, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possesed rocks", new String[]{"Possesed rocks", "They're small"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(277, "000", "000", new String[]{"Chaotic Possesed Earth"}, new String[]{"CtcPssdEth"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Possesed rocks", new String[]{"Possesed rocks", "a ghost monster"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Chaotic Haunted Earth
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//332 Shiny Golem
			else if(MonsterNo == 280){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(280, "93", "000", new String[]{"Shiny Golem"}, new String[]{"ShinyGolem"},
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of a metal", new String[]{"Made of a metal", "It's off gold"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(280, "000", "332", new String[]{"Shiny Golem"}, new String[]{"ShinyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of a metal", new String[]{"Made of a metal", "It's useless"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(280, "000", "332", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of a metal", new String[]{"Made of a metal", "It's worthless"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(280, "000", "332", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of a metal", new String[]{"Made of a metal", "It's golem sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(280, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of metal?", new String[]{"This stuff...", "Is it worth anything?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(280, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of a metal", new String[]{"Made of a metal", "It's crumbly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(280, "000", "000", new String[]{"Shiny Golem"}, new String[]{"ShinyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Made of a metal", new String[]{"Made of a metal", "It's heavy!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Sparkling Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//342 Ore Golem
			else if(MonsterNo == 283){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(283, "94", "000", new String[]{"Ore Golem"}, new String[]{"Ore Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem made of metal", new String[]{"Made of metsl", "It's silvery"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(283, "000", "342", new String[]{"Ore Golem"}, new String[]{"Ore Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem made of metal", new String[]{"Made of metsl", "Is's durable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(283, "000", "342", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem made of metal", new String[]{"Made of metsl", "It's heavy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(283, "000", "342", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem made of metal", new String[]{"Made of metsl", "It's good quality"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(283, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's a metal golem", new String[]{"It's made of metal", "good metal too."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(283, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem made of metal", new String[]{"Made of metsl", "Golem sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(283, "000", "000", new String[]{"Ore Golem"}, new String[]{"Ore Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem made of metal", new String[]{"Made of metsl", "Looks normal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
						
				};
			}
//				//Crystal Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//3*2 Broken Golem
			else if(MonsterNo == 286){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(286, "95", "000", new String[]{"Broken Golem"}, new String[]{"BrknGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "parts are floating", new String[]{"An odd golem", "It's brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(286, "000", "3*2", new String[]{"Broken Golem"}, new String[]{"BrknGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "parts are floating", new String[]{"An odd golem", "Parts float oddly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(286, "000", "3*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "parts are floating", new String[]{"An odd golem", "It moves wierd"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(286, "000", "3*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "parts are floating", new String[]{"An odd golem", "golem sized?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(286, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It looks damaged", new String[]{"Parts move oddly", "It's strange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(286, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "parts are floating", new String[]{"An odd golem", "It shambles"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(286, "000", "000", new String[]{"GLM"}, new String[]{"GLM"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "parts are floating", new String[]{"An odd golem", "It can stretch?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
						
				};
			}
//				//Breaker Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//402 Coded Armor
			else if(MonsterNo == 289){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(289, "96", "000", new String[]{"Coded Armor"}, new String[]{"CodedArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Superior armor monster", new String[]{"Powerful armor", "It's silver"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(289, "000", "402", new String[]{"Coded Armor"}, new String[]{"CodedArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Superior armor monster", new String[]{"Powerful armor", "It's tall"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(289, "000", "402", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Superior armor monster", new String[]{"Powerful armor", "Has different desigh"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(289, "000", "402", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Superior armor monster", new String[]{"Powerful armor", "Has a thin sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(289, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's an armor...", new String[]{"Is this the boss?", "It seems tough"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(289, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Superior armor monster", new String[]{"Powerful armor", "Makes little noise"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(289, "000", "000", new String[]{"Coded Knight"}, new String[]{"CodedKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Superior armor monster", new String[]{"Powerful armor", "It's thin"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
						
				};
			}
//				//Coded Armor S
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//412 River Armor
			else if(MonsterNo == 292){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(292, "97", "000", new String[]{"River Armor"}, new String[]{"RiverArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of Water", new String[]{"Water Armor", "It's blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(292, "000", "412", new String[]{"River Armor"}, new String[]{"RiverArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of Water", new String[]{"Water Armor", "has flowing pattern"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(292, "000", "412", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of Water", new String[]{"Water Armor", "Has water sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(292, "000", "412", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of Water", new String[]{"Water Armor", "the pattern moves"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(292, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Has a water sword?", new String[]{"The sword is water?", "How?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(292, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of Water", new String[]{"Water Armor", "trails water"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(292, "000", "000", new String[]{"Icy Armor"}, new String[]{"Icy Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Coated in Ice", new String[]{"Coated in Ice", "has icicle sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Lake Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//422 Mist Armor
			else if(MonsterNo == 295){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(295, "98", "000", new String[]{"Mist Armor"}, new String[]{"Mist Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered in mist", new String[]{"Armor of mist", "It's white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(295, "000", "422", new String[]{"Mist Armor"}, new String[]{"Mist Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered in mist", new String[]{"Armor of mist", "has a pattern"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(295, "000", "422", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered in mist", new String[]{"Armor of mist", "makes mist."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(295, "000", "422", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered in mist", new String[]{"Armor of mist", "Has mist sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(295, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "gives off mist", new String[]{"Makes mist?", "Somehow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(295, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered in mist", new String[]{"Armor of mist", "Spreads mist"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(295, "000", "000", new String[]{"Mist Armor"}, new String[]{"Mist Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered in mist", new String[]{"Armor of mist", "not transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Fog Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//432 Mountian Armor
			else if(MonsterNo == 298){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(298, "99", "000", new String[]{"Mountian Armor"}, new String[]{"Mtn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of mountain", new String[]{"A rocky armor", "It's brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(298, "000", "432", new String[]{"Mountian Armor"}, new String[]{"Mtn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of mountain", new String[]{"A rocky armor", "Has rocky exterior"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(298, "000", "432", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of mountain", new String[]{"A rocky armor", "Has a bulky shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(298, "000", "432", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of mountain", new String[]{"A rocky armor", "It's wide"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(298, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's rocky", new String[]{"Its stone like", "A hard foe!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(298, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of mountain", new String[]{"A rocky armor", "bigger than armor"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(298, "000", "000", new String[]{"Mountian Armor"}, new String[]{"Mtn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor of mountain", new String[]{"A rocky armor", "A sturdy foe!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Chasm Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//442 Money Armor
			else if(MonsterNo == 301){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(301, "100", "000", new String[]{"Money Armor"}, new String[]{"MoneyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golden Armor", new String[]{"Golden Armor", "It's gold colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(301, "000", "442", new String[]{"Money Armor"}, new String[]{"MoneyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golden Armor", new String[]{"Golden Armor", "It's fancy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(301, "000", "442", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golden Armor", new String[]{"Golden Armor", "It's blocky"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(301, "000", "442", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golden Armor", new String[]{"Golden Armor", "It's armor sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(301, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Looks expensive!", new String[]{"If this were money", "I could buy a lot!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(301, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golden Armor", new String[]{"Golden Armor", "It gleams"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(301, "000", "000", new String[]{"Money Armor"}, new String[]{"MoneyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golden Armor", new String[]{"Golden Armor", "Looks expensive!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Treasure Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//4*2 Prototype Mech
			else if(MonsterNo == 304){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(304, "101", "000", new String[]{"Prototype Mech"}, new String[]{"ProtoMech"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An automaton", new String[]{"A machine!", "It's mostly gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(304, "000", "4*2", new String[]{"Prototype Mech"}, new String[]{"ProtoMech"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An automaton", new String[]{"A machine!", "Shaped like a person"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(304, "000", "4*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An automaton", new String[]{"A machine!", "Has one lense eye"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(304, "000", "4*2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An automaton", new String[]{"A machine!", "how does it move?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(304, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's a robot!", new String[]{"An automaton?", "Where'd it come from?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(304, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An automaton", new String[]{"A machine!", "Who made it?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(304, "000", "000", new String[]{"Type E Type"}, new String[]{"TypeEType"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's electric-y", new String[]{"It's square", "made of lighting"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Prototype Mrk.2
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//*02 Broken Sword
			else if(MonsterNo == 307){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(307, "102", "000", new String[]{"Broken Sword"}, new String[]{"Brkn Sword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword Monster", "Darkly colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(307, "000", "*02", new String[]{"Broken Sword"}, new String[]{"Brkn Sword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword Monster", "Not actually broken?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(307, "000", "*02", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword Monster", "It looks broken"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(307, "000", "*02", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword Monster", "in three parts"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(307, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's broken?", new String[]{"Looks broken", "How strange..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(307, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword Monster", "It's floating"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(307, "000", "000", new String[]{"Broken Sword"}, new String[]{"Brkn Sword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword Monster", "A short sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Ruined Sword
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//*12 Mad Subtractor
			else if(MonsterNo == 310){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(310, "103", "000", new String[]{"Mad Subtractor"}, new String[]{"MadSbtrctr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Snake Monster", new String[]{"Snake monster", "!dVXY colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(310, "000", "*12", new String[]{"Mad Subtractor"}, new String[]{"MadSbtrctr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Snake Monster", new String[]{"Snake monster", "It's medium sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(310, "000", "*12", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Snake Monster", new String[]{"Snake monster", "Eyes move like crazy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(310, "000", "*12", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Snake Monster", new String[]{"Snake monster", "310.desc.long"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(310, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's a snake?", new String[]{"Snake!", "Is it poisonous?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(310, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Snake Monster", new String[]{"Snake monster", "Unstable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(310, "000", "000", new String[]{"Mad Subtractor"}, new String[]{"MadSbtrctr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Snake Monster", new String[]{"Snake monster", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Poison Adder
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//*22 Negative Image
			else if(MonsterNo == 313){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(313, "104", "000", new String[]{"Negative Image"}, new String[]{"NgativImag"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monochrome foe", new String[]{"A monster?", "It's monochrome"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(313, "000", "*22", new String[]{"Negative Image"}, new String[]{"NgativImag"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monochrome foe", new String[]{"A monster?", "It's flat"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(313, "000", "*22", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monochrome foe", new String[]{"A monster?", "It's a ghost???"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(313, "000", "*22", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monochrome foe", new String[]{"A monster?", "The eyes glow black"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(313, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hurts my eyes!", new String[]{"Hard to fight", "hurts my eyes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(313, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monochrome foe", new String[]{"A monster?", "Hard to look at"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(313, "000", "000", new String[]{"Megative Image"}, new String[]{"NgativImag"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monochrome foe", new String[]{"A monster?", "has an aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Mirror Image
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//*32 Terra Cotta Warrier
			else if(MonsterNo == 316){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(316, "105", "000", new String[]{"Terra Cotta Warrier"}, new String[]{"TerraCotta"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Human like golem", new String[]{"Living statue", "It's tan"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(316, "000", "*32", new String[]{"Terra Cotta Warrier"}, new String[]{"TerraCotta"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Human like golem", new String[]{"Living statue", "moves jerkily"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(316, "000", "*32", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Human like golem", new String[]{"Living statue", "Ornamental armor"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(316, "000", "*32", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Human like golem", new String[]{"Living statue", "Moves slowly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(316, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It can move?", new String[]{"Human like statue", "It moves though."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(316, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Human like golem", new String[]{"Living statue", "The face is uncanny"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(316, "000", "000", new String[]{"Super Fighting Terra Cotta"}, new String[]{"SpFtgTCtta"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Human like golem", new String[]{"Living statue", "Has super aura!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Super Fighting Terra Cotta
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//*42 D. A[]m[]r
			else if(MonsterNo == 319){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(319, "106", "000", new String[]{"D. A[]m[]r"}, new String[]{"D. A[]m[]r"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armor enemy", new String[]{"Powerful armor", "Colored darkly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(319, "000", "*42", new String[]{"D. A[]m[]r"}, new String[]{"D. A[]m[]r"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armor enemy", new String[]{"Powerful armor", "Has a shield"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(319, "000", "*42", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armor enemy", new String[]{"Powerful armor", "Has dark aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(319, "000", "*42", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armor enemy", new String[]{"Powerful armor", "Has a sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(319, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's an armor", new String[]{"Has a shield?", "jeez"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(319, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armor enemy", new String[]{"Powerful armor", "Has horns"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(319, "000", "000", new String[]{"D. A[]m[]r"}, new String[]{"D. A[]m[]r"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "An armor enemy", new String[]{"Powerful armor", "clanks loudly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//DisArmor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			//**2 Unknown Enemy
			else if(MonsterNo == 322){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(322, "107", "000", new String[]{"Unknown Enemy"}, new String[]{"UnknwnEnmy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to describe", new String[]{"It's unfamiliar", "Is it gray?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(322, "000", "**2", new String[]{"Unknown Enemy"}, new String[]{"UnknwnEnmy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to describe", new String[]{"It's unfamiliar", "Is it big?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(322, "000", "**2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to describe", new String[]{"It's unfamiliar", "Is it floating?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(322, "000", "**2", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to describe", new String[]{"It's unfamiliar", "What is it?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(322, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "It's... odd", new String[]{"It can float", "And it's gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(322, "000", "000", new String[]{""}, new String[]{""}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to describe", new String[]{"It's unfamiliar", "Very strange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(322, "000", "000", new String[]{"Lesser Unknown"}, new String[]{"LssrUnknwn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Hard to describe", new String[]{"A huge something", "It's wierd"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
//				//Mystery Enemy
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
//			//Defaulter?
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
//			//FF
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						
//						//1 = Normal Mode
//						
//						//2 = Easy Mode
//						
//						//3 = Hard Mode
//						
//						//4 = Other Story
//						
//						//5 = Glitch
//						
//						//6 = Beta
//						
//						//7 = 7th    
//						
//				};
//			}
			
			else
				MInfo  = new MonsterData[]{
					//0 = Cutscene Quest
					new MonsterData(000, "NULL", "", new String[]{"Nameless"}, new String[]{"Nameless"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDef*/0, 0, 0, 6, 1, "No Data", new String[]{"looks like mist maybe?", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/30, /*Status*/0, /*StatusC*/0)
					//1 = Normal Mode
					
					//2 = Easy Mode
					
					//3 = Hard Mode
					
					//4 = Other Story
					
					//5 = Glitch
					
					//6 = Beta
					
					//7 = 7th   
			};

		}
		return MInfo[Var];
	}
	public static MonsterData[] MInfo(int[] Monster1){
		int MTotal = MTotal(Monster1);
		MonsterData[] MData = new MonsterData[MTotal];{
			int i = 0;
			int Total = 0;
			while(i < Monster1.length){
				//MData[i] = new MonsterData(0, "", "", new String[]{"Defaulter"}, new String[]{"Defaulter"}, /*MHP*/9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"looks like a black box?", ""}, /*MSpeed*/100, /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);// 
				if(Monster1[i] == 1){
					MData[Total] = MData(i, 0); 
					Total = Total + 1;
//					if(){
//						Special Conditions
//					}
				}
//				if(){
//					Special Unknown Enemy type conditions
//				}
				i = i + 1;
			}
			
			
			//if(Monster1[0] == 0){ Sword -> Blade -> Coded Edge
			//	MData[Total] = new MonsterData(000, "00", "001", new String[]{"Blade"}, new String[]{"Blade"}, /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large blade", "contains a red gem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);
			//}


		}
		return MData;
	}

	
	public static int MNo(int[] Monster1Found, int MNo){
		int Index = 0;
		int i = 0;
		while(i < MNo - 1){
			Index = Index + Monster1Found[i];
			i = i + 1;
		}
		return Index;
	}
	public static int MTotal(int[] Monster1Found){
		int Total = 0;
		int i = 0;
		while(i < Monster1Found.length){
			Total = Total + Monster1Found[i];
			i = i + 1;
		}
		return Total;
	}
	
	public static int XTotal(int[] Monster1Found){
		int Total = 0;
		int i = 0;
		while(i < Monster1Found.length){
			if(i%2 != 0){//If I is not an even number
				Total = Total + Monster1Found[i];
			}
			i = i + 1;
		}
		return Total;
	}
	
}