package textonlyrpg;

public class MonsterData02X {
	

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
			
			//000 Coded Edge Form2
				//Coded Edge Form X
			if(MonsterNo == 110){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(110, "36X", "110", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A new form", new String[]{"Powered up sword", "has red gems"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(110, "00?X", "001X", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A new form", new String[]{"Powered up sword", "has rainbow aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(110, "00?X", "001X", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A new form", new String[]{"Powered up sword", "the guard is open"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(110, "00?X", "001X", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A new form", new String[]{"Powered up sword", "has aura shards?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(110, "BBX", "BB2X", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Glows rainbow", new String[]{"has a rainbow glow", "that's probably bad!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(110, "00?X", "001X", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A new form", new String[]{"Powered up sword", "the sword is silver"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(110, "???X", "000X", new String[]{"Coded Edge Form X"}, new String[]{"CdedEdgFmX"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A new form", new String[]{"Powered up sword", "the gaurd is sharp"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//010 Giant Jell
				// Blue Giant Jell
			else if(MonsterNo == 113){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(113, "37X", "113", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A blue jell?", new String[]{"A giant jell...", "It's dark blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(113, "01?X", "011X", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A blue jell?", new String[]{"A giant jell...", "Pretty large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(113, "01?X", "011X", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A blue jell?", new String[]{"A giant jell...", "similar to slime?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(113, "01?X", "011X", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A blue jell?", new String[]{"A giant jell...", "More powerful than usual"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(113, "BSlX", "BSl2X", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Strangely colored", new String[]{"A blue slime?", "How odd..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(113, "01?X", "011X", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A blue jell?", new String[]{"A giant jell...", "tastes odd"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(113, "???X", "010X", new String[]{"Blue Giant Jell"}, new String[]{"BluGntJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A blue jell?", new String[]{"A giant jell...", "May be a boss?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//020 Grand Phantasm
				//Cursed Phantom
			else if(MonsterNo == 116){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(116, "38X", "116", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's Cursed!!!", new String[]{"A cursed ghost!", "It's wearing black"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/10),
						//1 = Normal Mode
						new MonsterData(116, "02?X", "021X", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's Cursed!!!", new String[]{"A cursed ghost!", "Has a fancy hat?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/10),
						//2 = Easy Mode
						new MonsterData(116, "02?X", "021X", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's Cursed!!!", new String[]{"A cursed ghost!", "whispers constantly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(116, "02?X", "021X", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's Cursed!!!", new String[]{"A cursed ghost!", "mutters incoharently"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/30),
						//4 = Other Story
						new MonsterData(116, "BGhX", "BGh2X", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's scary!", new String[]{"Makes scary noises", "looks creepy too"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/10),
						//5 = Glitch
						new MonsterData(116, "02?X", "021X", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's Cursed!!!", new String[]{"A cursed ghost!", "sometimes walks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/10),
						//6 = Beta
						new MonsterData(116, "???X", "020X", new String[]{"Cursed Phantom"}, new String[]{"CrsdPhantm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's Cursed!!!", new String[]{"A cursed ghost!", "Has a cutlass"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/10)
				};
			}
			
			//030 Statue
				//Durable Statue
			else if(MonsterNo == 119){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(119, "39X", "119", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger statue", new String[]{"Has high HP", "dark golem brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(119, "03?X", "031X", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger statue", new String[]{"Has high HP", "sort of humanoid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(119, "03?X", "031X", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger statue", new String[]{"Has high HP", "has strange markings"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(119, "03?X", "031X", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger statue", new String[]{"Has high HP", "It's pretty large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(119, "BGoX", "BGo2X", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Tough looking", new String[]{"Looks... tough!", "and strange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(119, "03?X", "031X", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger statue", new String[]{"Has high HP", "has rough shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(119, "???X", "030X", new String[]{"Durable Statue"}, new String[]{"DrblStatue"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger statue", new String[]{"Has high HP", "powerful!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//040 Mail
				//Spiked Mail
			else if(MonsterNo == 122){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(122, "40X", "122", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Covered with spikes", new String[]{"Covered with spikes", "It's silverish"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(122, "04?X", "041X", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Covered with spikes", new String[]{"Covered with spikes", "has dangerous aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(122, "04?X", "041X", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Covered with spikes", new String[]{"Covered with spikes", "dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(122, "04?X", "041X", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Covered with spikes", new String[]{"Covered with spikes", "has a sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(122, "BAX", "BA2X", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So spiky!", new String[]{"Covered with spikes", "dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(122, "04?X", "041X", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Covered with spikes", new String[]{"Covered with spikes", "looks formitable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(122, "???X", "040X", new String[]{"Spiked Mail"}, new String[]{"SpikedMail"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Covered with spikes", new String[]{"Covered with spikes", "has large horns"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//0*0<Doppleganger>
				//Doppleganger
			else if(MonsterNo == 125){
				MInfo = new MonsterData[]{ //13S ???
					//0 = Cutscene Quest
					new MonsterData(125, "41X", "125", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A dark reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
					//1 = Normal Mode
					new MonsterData(125, "0*?X", "0*1X", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A dark reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
					//2 = Easy Mode
					new MonsterData(125, "0*?X", "0*1X", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A dark reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
					//3 = Hard Mode
					new MonsterData(125, "0*?X", "0*1X", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A dark reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
					//4 = Other Story
					new MonsterData(125, "B?X", "B?2X", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A dark reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
					//5 = Glitch
					new MonsterData(125, "0*?X", "0*1X", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A dark reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
					//6 = Beta //Unpronouncible
					new MonsterData(125, "???X", "0*0X", new String[]{"UXs*J@XDdz"}, new String[]{"UXs*J@XDdz"}, 
							/*MHP*/0, 0, 2, 5, 9, 1, 
							/*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, 
							/*MDef*/0, 0, 0, 3, 1, "It looks like letters", new String[]{"It looks like...", "random letters?"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
							/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Test
				};
			}
			
			//100 Elec Slime
				//Lightning Slime
			else if(MonsterNo == 128){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(128, "42X", "128", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime with elec powers!", new String[]{"Lighting slime", "It's dark yellow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(128, "10?X", "101X", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime with elec powers!", new String[]{"Lighting slime", "lightining everywhere"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(128, "10?X", "101X", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime with elec powers!", new String[]{"Lighting slime", "shoots lighting"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(128, "10?X", "101X", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime with elec powers!", new String[]{"Lighting slime", "moves slowly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(128, "SlBX", "SlB2X", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "It shoots lighting!", new String[]{"It can SHOOT lighting!", "How dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(128, "10?X", "101X", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime with elec powers!", new String[]{"Lighting slime", "doesn't move much"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(128, "???X", "100X", new String[]{"Lightning Slime"}, new String[]{"Ltng Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime with elec powers!", new String[]{"Lighting slime", "slime sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//110 Jell (Orange)
				//Blue Jell (Dark Blue)
			else if(MonsterNo == 131){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(131, "43X", "131", new String[]{"Blue Jell"}, new String[]{"Blue Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Next level jell", new String[]{"A type of slime", "It's dark blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(131, "11?X", "111X", new String[]{"Blue Jell"}, new String[]{"Blue Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Next level jell", new String[]{"A type of slime", "Average sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(131, "11?X", "111X", new String[]{"Blue Jell"}, new String[]{"Blue Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Next level jell", new String[]{"A type of slime", "bouncy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(131, "11?X", "111X", new String[]{"Blue Jell"}, new String[]{"Blue Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Next level jell", new String[]{"A type of slime", "Pretty strong"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(131, "SlSlX", "SlSl2X", new String[]{"Blue Jell"}, new String[]{"Blue Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's... blue", new String[]{"Rare color monsters", "are powerful right?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(131, "11?X", "111X", new String[]{"Blue Jell"}, new String[]{"Blue Jell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Next level jell", new String[]{"A type of slime", "It's transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(131, "???X", "110X", new String[]{"Drk Blue Jell"}, new String[]{"DrkBluJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Next level jell", new String[]{"A type of slime", "It's dark blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//120 Ghost Slime
				//Misty Ghost Slime
			else if(MonsterNo == 134){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(134, "44X", "134", new String[]{"Misty Ghost Slime"}, new String[]{"MstGhstSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "surounded by mist", new String[]{"Covered in mist", "It's white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(134, "12?X", "121X", new String[]{"Misty Ghost Slime"}, new String[]{"MstGhstSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "surounded by mist", new String[]{"Covered in mist", "seems to make more"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(134, "12?X", "121X", new String[]{"Misty Ghost Slime"}, new String[]{"MstGhstSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "surounded by mist", new String[]{"Covered in mist", "similar to ghost slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(134, "12?X", "121X", new String[]{"Misty Ghost Slime"}, new String[]{"MstGhstSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "surounded by mist", new String[]{"Covered in mist", "harder to hit"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(134, "SlGhX", "SlGh2X", new String[]{"Misty Ghost Slime"}, new String[]{"MstGhstSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's in mist", new String[]{"All this mist!", "Where's the slime?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(134, "12?X", "121X", new String[]{"Misty Ghost Slime"}, new String[]{"MstGhstSlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "surounded by mist", new String[]{"Covered in mist", "moves slowly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(134, "???X", "120X", new String[]{"Ghostly Slime"}, new String[]{"GhstlySlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "harder to hit", new String[]{"harder to hit", "it's ghostly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//130 Hard Golem Slime
				//Icy Golem Slime
			else if(MonsterNo == 137){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(137, "45X", "137", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "It has ice element", new String[]{"A golem slime", "light gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(137, "13?X", "131X", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "It has ice element", new String[]{"A golem slime", "looks like rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(137, "13?X", "131X", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "It has ice element", new String[]{"A golem slime", "has rough shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(137, "13?X", "131X", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "It has ice element", new String[]{"A golem slime", "has icy aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(137, "SlGoX", "SlGo2X", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "A pile of rocks", new String[]{"Looks like rocks", "icy rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(137, "13?X", "131X", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "It has ice element", new String[]{"A golem slime", "attacks with ice"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(137, "???X", "130X", new String[]{"Icy Golem Slime"}, new String[]{"IcyGlmSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "It has ice element", new String[]{"A golem slime", "sounds of rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//140 Metal Slime
				//Hard Metal Slime
			else if(MonsterNo == 140){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(140, "46X", "140", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger metal slime", new String[]{"Strong metal slime", "It's dark silver"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(140, "14?X", "141X", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger metal slime", new String[]{"Strong metal slime", "Shiny"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(140, "14?X", "141X", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger metal slime", new String[]{"Strong metal slime", "more dangerous"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(140, "14?X", "141X", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger metal slime", new String[]{"Strong metal slime", "Very hard!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(140, "SlAX", "SlA2X", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems heavy", new String[]{"It's heavy!", "Look at the ground!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(140, "14?X", "141X", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger metal slime", new String[]{"Strong metal slime", "makes slime sounds?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(140, "???X", "140X", new String[]{"Hard Metal Slime"}, new String[]{"HrdMtlSlme"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Stronger metal slime", new String[]{"Strong metal slime", "reflective"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//1*0 Recover/Healing Slime
				//Draining/Vampire Slime
			else if(MonsterNo == 143){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(143, "47X", "143", new String[]{"Vamp Slime", "DrainSlime"}, new String[]{"Vamp Slime", "DrainSlime"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Drainslime/VampSlime", new String[]{"Drain slime", "It's maroon"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(143, "1*?X", "1*1X", new String[]{"Vamp Slime", "DrainSlime"}, new String[]{"Vamp Slime", "DrainSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Drainslime/VampSlime", new String[]{"Vamp slime", "beware it's touch!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(143, "1*?X", "1*1X", new String[]{"Vamp Slime", "DrainSlime"}, new String[]{"Vamp Slime", "DrainSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Drainslime/VampSlime", new String[]{"Drain slime", "It's pink"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(143, "1*?X", "1*1X", new String[]{"Vamp Slime", "DrainSlime"}, new String[]{"Vamp Slime", "DrainSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Drainslime/VampSlime", new String[]{"Vamp slime", "It's transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(143, "Sl?X", "Sl?2X", new String[]{"Vamp Slime", "DrainSlime"}, new String[]{"Vamp Slime", "DrainSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A draining slime!", new String[]{"What an odd color", "It can drain?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(143, "1*?X", "1*1X", new String[]{"Vamp Slime", "DrainSlime"}, new String[]{"Vamp Slime", "DrainSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Drainslime/VampSlime", new String[]{"Drain slime", "normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(143, "???X", "1*0X", new String[]{"S 1 ME"}, new String[]{"S 1 ME"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Unstable slime", new String[]{"Very unstable!", "looks odd"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//200 Wraith
				//Light Wraith
			else if(MonsterNo == 146){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(146, "48X", "146", new String[]{"Light Wraith"}, new String[]{"LghtWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Has light element", new String[]{"Has light element?", "White and black"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(146, "20?", "201X", new String[]{"Light Wraith"}, new String[]{"LghtWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Has light element", new String[]{"Has light element?", "odd for a wraith"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(146, "20?X", "201X", new String[]{"Light Wraith"}, new String[]{"LghtWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Has light element", new String[]{"Has light element?", "has wierd aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(146, "20?X", "201X", new String[]{"Light Wraith"}, new String[]{"LghtWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Has light element", new String[]{"Has light element?", "pretty large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(146, "GhBX", "GhB2X", new String[]{"Light Wraith"}, new String[]{"LghtWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A light wraith?", new String[]{"Light element?", "On a wraith?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(146, "20?X", "201X", new String[]{"Light Wraith"}, new String[]{"LghtWraith"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Has light element", new String[]{"Has light element?", "Attacks with light!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(146, "???X", "200X", new String[]{"Black Litch"}, new String[]{"Blk Litch"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/12, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Has light element", new String[]{"Has light element?", "Has red eyes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//210 Water Wrath
				//Boiling Wrath
			else if(MonsterNo == 149){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(149, "49X", "149", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Boiling water ghost", new String[]{"Boiling water ghost", "It's blue, white, and red"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(149, "21?X", "211X", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Boiling water ghost", new String[]{"Boiling water ghost", "Has glowing eyes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(149, "21?X", "211X", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Boiling water ghost", new String[]{"Boiling water ghost", "Person shaped"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(149, "21?X", "211X", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Boiling water ghost", new String[]{"Boiling water ghost", "Steaming hot!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(149, "GhSlX", "GhSl2X", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Literally boiling", new String[]{"Boiling water?", "Yikes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(149, "21?X", "211X", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Boiling water ghost", new String[]{"Boiling water ghost", "Bubbles like crazy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(149, "???X", "210X", new String[]{"Boiling Wrath"}, new String[]{"BoilgWrath"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Boiling water ghost", new String[]{"Boiling water ghost", "Seems enraged"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//220 Specter
				//Wight
			else if(MonsterNo == 152){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(152, "50X", "152", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster", new String[]{"Strong ghost monster", "It's white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(152, "22?X", "221X", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster", new String[]{"Strong ghost monster", "Has fuzzy appearance"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(152, "22?X", "221X", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster", new String[]{"Strong ghost monster", "has red eyes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(152, "22?X", "221X", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster", new String[]{"Strong ghost monster", "hard to see"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(152, "GhGhX", "GhGh2X", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "YEARG GHOST!", new String[]{"EEEEAAAH!", "Ghost!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(152, "22?X", "221X", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster", new String[]{"Strong ghost monster", "warps the air"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(152, "???X", "220X", new String[]{"Wight"}, new String[]{"Wight"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster", new String[]{"Strong ghost monster", "humanoid?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//230 Solid Shade
				//Solid Air Shade
			else if(MonsterNo == 155){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(155, "51X", "155", new String[]{"Solid Air Shade"}, new String[]{"SldArShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Surprisingly solid", new String[]{"Wind element monster", "It's pale green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(155, "23?X", "231X", new String[]{"Solid Air Shade"}, new String[]{"SldArShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Surprisingly solid", new String[]{"Wind element monster", "surpisingly opaque"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(155, "23?X", "231X", new String[]{"Solid Air Shade"}, new String[]{"SldArShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Surprisingly solid", new String[]{"Wind element monster", "durable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(155, "23?X", "231X", new String[]{"Solid Air Shade"}, new String[]{"SldArShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Surprisingly solid", new String[]{"Wind element monster", "Pretty big"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(155, "GhGoX", "GhGo2X", new String[]{"Solid Air Shade"}, new String[]{"SldArShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems oddly solid", new String[]{"It's solid?", "Has air element?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(155, "23?X", "231X", new String[]{"Solid Air Shade"}, new String[]{"SldArShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Surprisingly solid", new String[]{"Wind element monster", "surounded by wind"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(155, "???X", "230X", new String[]{"Golem Shade"}, new String[]{"GolemShade"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Both solid and not", new String[]{"A golem ghost", "Both solid and not"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//240 Armored Shade
				// Time Shadow
			else if(MonsterNo == 158){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(158, "52X", "158", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "time anomoly ghost", new String[]{"A time anomoly", "It's darkly colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(158, "24?X", "241X", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "time anomoly ghost", new String[]{"A time anomoly", "like a hole in space"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(158, "24?X", "241X", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "time anomoly ghost", new String[]{"A time anomoly", "type of monster?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(158, "24?X", "241X", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "time anomoly ghost", new String[]{"A time anomoly", "has a sword?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(158, "GhAX", "GhA2X", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Like a rip in time", new String[]{"A rip in time?", "Seems dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(158, "24?X", "241X", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "time anomoly ghost", new String[]{"A time anomoly", "part ghost?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(158, "???X", "240X", new String[]{"Time Shadow"}, new String[]{"TimeShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "time anomoly ghost", new String[]{"A time anomoly", "Armor shaped"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//2*0 Tresspasser
				//Invader
			else if(MonsterNo == 161){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(161, "53X", "161", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster?", new String[]{"Actually a ghost", "Silver and green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(161, "2*?X", "2*1X", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster?", new String[]{"Actually a ghost", "tries to break in"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(161, "2*?X", "2*1X", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster?", new String[]{"Actually a ghost", "it's fast!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(161, "2*?X", "2*1X", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster?", new String[]{"Actually a ghost", "tries to go places"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(161, "Gh?X", "Gh?2X", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Wearing armor?", new String[]{"It's wearing armor", "wierd round armor"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(161, "2*?X", "2*1X", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster?", new String[]{"Actually a ghost", "humanoid-ish?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(161, "???X", "2*0X", new String[]{"Invader"}, new String[]{"Invader"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "A ghost monster?", new String[]{"Actually a ghost", "mostly smooth"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//300 Steam Golem
				//Multi-Element Golem
			else if(MonsterNo == 164){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(164, "54X", "164", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has many elements!?", new String[]{"Has elements!", "Many colors"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(164, "30?X", "301X", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has many elements!?", new String[]{"Has elements!", "glows with power!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(164, "30?X", "301X", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has many elements!?", new String[]{"Has elements!", "Looks almost normal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(164, "30?X", "301X", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has many elements!?", new String[]{"Has elements!", "What ones though?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(164, "GoBX", "GoB2X", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Glows colors", new String[]{"It's colorful", "That's probably bad!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(164, "30?X", "301X", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has many elements!?", new String[]{"Has elements!", "Strong resistance?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(164, "???X", "300X", new String[]{"Multi-Element Golem"}, new String[]{"MltElmtGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has many elements!?", new String[]{"Has elements!", "Made of rock"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//310 Slime Golem
				//Elec Slime Golem (Charged Slime golem?)
			else if(MonsterNo == 167){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(167, "55X", "167", new String[]{"Elec Slime Golem"}, new String[]{"ElcSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Electric element", new String[]{"Has electric element", "It's yellow-orange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(167, "31?X", "311X", new String[]{"Elec Slime Golem"}, new String[]{"ElcSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Electric element", new String[]{"Has electric element", "inedible"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(167, "31?X", "311X", new String[]{"Elec Slime Golem"}, new String[]{"ElcSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Electric element", new String[]{"Has electric element", "Golem sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(167, "31?X", "311X", new String[]{"Elec Slime Golem"}, new String[]{"ElcSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Electric element", new String[]{"Has electric element", "a little bouncy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(167, "GoSlX", "GoSl2X", new String[]{"Elec Slime Golem"}, new String[]{"ElcSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Gives off electric", new String[]{"Gives off electricity", "Seems dangerous"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(167, "31?X", "311X", new String[]{"Elec Slime Golem"}, new String[]{"ElcSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Electric element", new String[]{"Has electric element", "stretches"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(167, "???X", "310X", new String[]{"Charged Slime golem"}, new String[]{"ChdSlmeGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 11, 
								/*MDEF*/0, 0, 0, 6, 1, "Charged with electric", new String[]{"Charged with electricity", "It's yellow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//320 Specter Golem
				//Shadey Golem   Beta Green Specter Golem
			else if(MonsterNo == 170){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(170, "56X", "170", new String[]{"Shadey Golem"}, new String[]{"ShadyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems dark", new String[]{"Seems shadowed oddly", "It's blue-gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(170, "32?X", "321X", new String[]{"Shadey Golem"}, new String[]{"ShadyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems dark", new String[]{"Seems shadowed oddly", "Seems to be opaque"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(170, "32?X", "321X", new String[]{"Shadey Golem"}, new String[]{"ShadyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems dark", new String[]{"Seems shadowed oddly", "Part ghost?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(170, "32?X", "321X", new String[]{"Shadey Golem"}, new String[]{"ShadyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems dark", new String[]{"Seems shadowed oddly", "made of rocks?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(170, "GoGhX", "GoGh2X", new String[]{"Shadey Golem"}, new String[]{"ShadyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Unsettling", new String[]{"Unsettling looking", "It's part ghost!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(170, "32?X", "321X", new String[]{"Shadey Golem"}, new String[]{"ShadyGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems dark", new String[]{"Seems shadowed oddly", "mostly tangible"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(170, "???X", "320X", new String[]{"Green Specter Golem"}, new String[]{"GrnSptrGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "It's green", new String[]{"An odd color", "it's green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//330 Hard Golem
				//Harder Golem
			else if(MonsterNo == 173){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(173, "57X", "173", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Higher level golem", new String[]{"Higher level golem", "It's dark gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(173, "33?X", "331X", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Higher level golem", new String[]{"Higher level golem", "Its very hard"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(173, "33?X", "331X", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Higher level golem", new String[]{"Higher level golem", "pretty strong"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(173, "33?X", "331X", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Higher level golem", new String[]{"Higher level golem", "same size as golem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(173, "GoGoX", "GoGo2X", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's tougher!", new String[]{"Definitely tougher", "It's strong!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(173, "33?X", "331X", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Higher level golem", new String[]{"Higher level golem", "still the same speed?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(173, "???X", "330X", new String[]{"Harder Golem"}, new String[]{"HrdrGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Higher level golem", new String[]{"Higher level golem", "eats any rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//340 Heavy Golem
				//Dense Golem
			else if(MonsterNo == 176){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(176, "58X", "176", new String[]{"Dense Golem"}, new String[]{"Dns Golem"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "heavier than normal", new String[]{"Dense and heavy", "Darkly colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(176, "34?X", "341X", new String[]{"Dense Golem"}, new String[]{"Dns Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "heavier than normal", new String[]{"Dense and heavy", "Made of ore stone?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(176, "34?X", "341X", new String[]{"Dense Golem"}, new String[]{"Dns Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "heavier than normal", new String[]{"Dense and heavy", "breaks the ground!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(176, "34?X", "341X", new String[]{"Dense Golem"}, new String[]{"Dns Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "heavier than normal", new String[]{"Dense and heavy", "partly metal?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(176, "GoAX", "GoA2X", new String[]{"Dense Golem"}, new String[]{"Dns Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's too tough!", new String[]{"It's really tough!", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(176, "34?X", "341X", new String[]{"Dense Golem"}, new String[]{"Dns Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "heavier than normal", new String[]{"Dense and heavy", "Looks like rock"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(176, "???X", "340X", new String[]{"Dense Golem"}, new String[]{"DenseGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "heavier than normal", new String[]{"Dense and heavy", "Normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//3*0 Hammer Golem
				// Double Hammer Golem
			else if(MonsterNo == 179){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(179, "59X", "179", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "Carries hammers", new String[]{"Has two hammers", "It's blue and pink"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(179, "3*?X", "3*1X", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "Carries hammers", new String[]{"Has two hammers", "It's big"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(179, "3*?X", "3*1X", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "Carries hammers", new String[]{"Has two hammers", "Looks like a golem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(179, "3*?X", "3*1X", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "Carries hammers", new String[]{"Has two hammers", "They are large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(179, "Go?X", "Go?2X", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "It has two?", new String[]{"Has two hammers", "they are two handers"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(179, "3*?X", "3*1X", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "Carries hammers", new String[]{"Has two hammers", "The hammers are metal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(179, "???X", "3*0X", new String[]{"Double Hammer Golem"}, new String[]{"DblHmr Glm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 3, 
								/*MDEF*/0, 0, 0, 6, 1, "Carries hammers", new String[]{"Has two hammers", "made of rock"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//400 Quick Plate
				//Quicker Plate
			else if(MonsterNo == 182){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(182, "60X", "182", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A faster armor", new String[]{"It's faster", "It's light blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(182, "40?X", "401X", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A faster armor", new String[]{"It's faster", "Aerodynamic"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(182, "40?X", "401X", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A faster armor", new String[]{"It's faster", "Has a dagger"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(182, "40?X", "401X", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A faster armor", new String[]{"It's faster", "faster than normal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(182, "ABX", "AB2X", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's really fast!", new String[]{"Where did it go!", "It's too quick"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(182, "40?X", "401X", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A faster armor", new String[]{"It's faster", "less aura than armor"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(182, "???X", "400X", new String[]{"Quicker Plate"}, new String[]{"Qckr Plate"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A faster armor", new String[]{"It's faster", "has speed blur aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//410 Liquid Armor
				//Poison Armor
			else if(MonsterNo == 185){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(185, "61X", "185", new String[]{"Poison Armor"}, new String[]{"Psn Armor"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison type armor", new String[]{"Poisonous", "It's purple"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/30),
						//1 = Normal Mode
						new MonsterData(185, "41?X", "411X", new String[]{"Poison Armor"}, new String[]{"Psn Armor"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison type armor", new String[]{"Poisonous", "non-solid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/30),
						//2 = Easy Mode
						new MonsterData(185, "41?X", "411X", new String[]{"Poison Armor"}, new String[]{"Psn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison type armor", new String[]{"Poisonous", "can liquify"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/10),
						//3 = Hard Mode
						new MonsterData(185, "41?X", "411X", new String[]{"Poison Armor"}, new String[]{"Psn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison type armor", new String[]{"Poisonous", "Wields a blade"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/40),
						//4 = Other Story
						new MonsterData(185, "ASlX", "ASl2X", new String[]{"Poison Armor"}, new String[]{"Psn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison!", new String[]{"It's poisonous!", "No antidote..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/30),
						//5 = Glitch
						new MonsterData(185, "41?X", "411X", new String[]{"Poison Armor"}, new String[]{"Psn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison type armor", new String[]{"Poisonous", "Has unique design"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/30),
						//6 = Beta
						new MonsterData(185, "???X", "410X", new String[]{"Poison Armor"}, new String[]{"Psn Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Poison type armor", new String[]{"Poisonous", "very dangerous!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/30)
				};
			}
			
			//420 Phantom Armor
				//Cursed Phantom Armor
			else if(MonsterNo == 188){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(188, "62X", "188", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems cursed!", new String[]{"Has a curse!", "Blue/Purple"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/20),
						//1 = Normal Mode
						new MonsterData(188, "42?X", "421X", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"},
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems cursed!", new String[]{"Has a curse!", "Has afterimages"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/20),
						//2 = Easy Mode
						new MonsterData(188, "42?X", "421X", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems cursed!", new String[]{"Has a curse!", "Has odd patterns"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/10),
						//3 = Hard Mode
						new MonsterData(188, "42?X", "421X", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems cursed!", new String[]{"Has a curse!", "a kind of script?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/40),
						//4 = Other Story
						new MonsterData(188, "AGhX", "AGh2X", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Bears ill will", new String[]{"It's cursed!!!", "Seems malicious"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/20),
						//5 = Glitch
						new MonsterData(188, "42?X", "421X", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems cursed!", new String[]{"Has a curse!", "partly mist"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/20),
						//6 = Beta
						new MonsterData(188, "???X", "420X", new String[]{"Cursed Phantom Armor"}, new String[]{"CdPtmArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems cursed!", new String[]{"Has a curse!", "levitates"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/2, /*StatusC*/20)
				};
			}
			
			//430 Heavy Armor
				//Heavy Earth Armor
			else if(MonsterNo == 191){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(191, "63X", "191", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A heavy earth armor", new String[]{"Type of armor", "Silver and brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(191, "43?X", "431X", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A heavy earth armor", new String[]{"Type of armor", "has less spikes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(191, "43?X", "431X", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A heavy earth armor", new String[]{"Type of armor", "Broad"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(191, "43?X", "431X", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A heavy earth armor", new String[]{"Type of armor", "looks fancy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(191, "AGoX", "AGo2X", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "An earth armor", new String[]{"An earth armor", "seems bulky"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(191, "43?X", "431X", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A heavy earth armor", new String[]{"Type of armor", "Has an axe"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(191, "???X", "430X", new String[]{"Heavy Earth Armor"}, new String[]{"HvyEthArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A heavy earth armor", new String[]{"Type of armor", "Its earth element"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//440 Dark Armor
				//D. Armor (can summon Time Shadow?)
			else if(MonsterNo == 194){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(194, "64X", "194", new String[]{"D.Armor"}, new String[]{"D.Armor"},  
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Warps space", new String[]{"It warps space", "Darkly colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(194, "44?X", "441X", new String[]{"D.Armor"}, new String[]{"D.Armor"},  
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Warps space", new String[]{"It warps space", "Has an afterimage"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(194, "44?X", "441X", new String[]{"D.Armor"}, new String[]{"D.Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Warps space", new String[]{"It warps space", "maybe time?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(194, "44?X", "441X", new String[]{"D.Armor"}, new String[]{"D.Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Warps space", new String[]{"It warps space", "Seems unstable?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(194, "AAX", "AA2X", new String[]{"D.Armor"}, new String[]{"D.Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "It's REALLY wierd", new String[]{"Has some kinda...", "warping effect"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(194, "44?X", "441X", new String[]{"D.Armor"}, new String[]{"D.Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Warps space", new String[]{"It warps space", "Has strong aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(194, "???X", "440X", new String[]{"D.Armor"}, new String[]{"D.Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 14, 
								/*MDEF*/0, 0, 0, 6, 1, "Warps space", new String[]{"It warps space", "Normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//4*0 E Guard
				//E Guardian (Defends others?)
			else if(MonsterNo == 197){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(197, "65X", "197", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Armor with shield", new String[]{"It's armor", "It's blue and red"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(197, "4*?X", "4*1X", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Armor with shield", new String[]{"It's armor", "Weilds a shield"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(197, "4*?X", "4*1X", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Armor with shield", new String[]{"It's armor", "Moves slowly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(197, "4*?X", "4*1X", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Armor with shield", new String[]{"It's armor", "Has no weapon"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(197, "A?X", "A?2X", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An odd armor", new String[]{"What a weird kind", "It's so different"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(197, "4*?X", "4*1X", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Armor with shield", new String[]{"It's armor", "It's large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(197, "???X", "4*0X", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Armor with shield", new String[]{"It's armor", "Attacks with shield"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*00 Pancaker
				//Pancaker W. Syrup (Syrup Armor)
			else if(MonsterNo == 200){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(200, "66X", "200", new String[]{"Pancaker W. Syrup"}, new String[]{"PnckrWSyrp"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has syrup armor", new String[]{"A golem?", "Golden brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/3, /*StatusC*/10),
						//1 = Normal Mode
						new MonsterData(200, "*0?X", "*01X", new String[]{"Pancaker W. Syrup"}, new String[]{"PnckrWSyrp"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has syrup armor", new String[]{"A golem?", "Looks tasty"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/3, /*StatusC*/10),
						//2 = Easy Mode
						new MonsterData(200, "*0?X", "*01X", new String[]{"Pancaker W. Syrup"}, new String[]{"PnckrWSyrp"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has syrup armor", new String[]{"A golem?", "Pancakes W Syrup"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(200, "*0?X", "*01X", new String[]{"Pancaker W. Syrup"}, new String[]{"PnckrWSyrp"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has syrup armor", new String[]{"A golem?", "Makes me hungry"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/3, /*StatusC*/40),
						//4 = Other Story
						new MonsterData(200, "?BX", "?B2X", new String[]{"Pancaker W. Syrup"}, new String[]{"PnckrWSyrp"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ew! Syrup covered", new String[]{"So sticky!", "Yuck!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/3, /*StatusC*/10),
						//5 = Glitch
						new MonsterData(200, "*0?X", "*01X", new String[]{"Pancaker W. Syrup"}, new String[]{"PnckrWSyrp"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has syrup armor", new String[]{"A golem?", "Stacks of food"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/3, /*StatusC*/10),
						//6 = Beta
						new MonsterData(200, "???X", "*00X", new String[]{"Static Bar"}, new String[]{"Static Bar"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An object? Monster?", new String[]{"An object? Monster?", "It's monochrome"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/3, /*StatusC*/10)
				};
			}
			
			//*10 Token Generator
				//Token Multiplier
			else if(MonsterNo == 203){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(203, "67X", "203", new String[]{"Token Multiplier"}, new String[]{"TknMltiplr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A slime maker", new String[]{"A slime maker", "It's Silver"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(203, "*1?X", "*11X", new String[]{"Token Multiplier"}, new String[]{"TknMltiplr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A slime maker", new String[]{"A slime maker", "Roundish shaped"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(203, "*1?X", "*11X", new String[]{"Token Multiplier"}, new String[]{"TknMltiplr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A slime maker", new String[]{"A slime maker", "Has green goo"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(203, "*1?X", "*11X", new String[]{"Token Multiplier"}, new String[]{"TknMltiplr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A slime maker", new String[]{"A slime maker", "Works quickly!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(203, "?SlX", "?Sl2X", new String[]{"Token Multiplier"}, new String[]{"TknMltiplr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Slime machine?", new String[]{"A slime machine", "How does it work??"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(203, "*1?X", "*11X", new String[]{"Token Multiplier"}, new String[]{"TknMltiplr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A slime maker", new String[]{"A slime maker", "Makes slimes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(203, "???X", "*10X", new String[]{"Another one"}, new String[]{"AnotherOne"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A strange monster", new String[]{"Strange monster", "It's gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*20 Static
				//Mist
			else if(MonsterNo == 206){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(206, "68X", "206", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A cloud of mist", new String[]{"A cloud of mist", "It's white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(206, "*2?X", "*21X", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A cloud of mist", new String[]{"A cloud of mist", "Medium sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(206, "*2?X", "*21X", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A cloud of mist", new String[]{"A cloud of mist", "Seems indistinct"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(206, "*2?X", "*21X", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A cloud of mist", new String[]{"A cloud of mist", "floats around"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(206, "?GhX", "?Gh2X", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Just mist?", new String[]{"It's just mist?", "How wierd!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(206, "*2?X", "*21X", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A cloud of mist", new String[]{"A cloud of mist", "makes no noise"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(206, "???X", "*20X", new String[]{"Mist"}, new String[]{"Mist"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "A cloud of mist", new String[]{"A cloud of mist", "Seems stable?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*30 7 15 12 5 13
				//Wall
			else if(MonsterNo == 209){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(209, "69X", "209", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall type monster", new String[]{"A wall?", "It's brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(209, "*3?X", "*31X", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall type monster", new String[]{"A wall?", "Seems to move?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(209, "*3?X", "*31X", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall type monster", new String[]{"A wall?", "rotates to face me"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(209, "*3?X", "*31X", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall type monster", new String[]{"A wall?", "tall as a person"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(209, "?GoX", "?Go2X", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall that moves!", new String[]{"Just a wall?", "How does it move?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(209, "*3?X", "*31X", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall type monster", new String[]{"A wall?", "made of bricks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(209, "???X", "*30X", new String[]{"Wall"}, new String[]{"Wall"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A wall type monster", new String[]{"A wall?", "wide as it is tall"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*40 M Guard
				//M Blocker
			else if(MonsterNo == 212){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(212, "70X", "212", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor monster", new String[]{"Armor with shield", "It's monochrome"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(212, "*4?X", "*41X", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor monster", new String[]{"Armor with shield", "Sheild is square"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(212, "*4?X", "*41X", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor monster", new String[]{"Armor with shield", "Looks plain"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(212, "*4?X", "*41X", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor monster", new String[]{"Armor with shield", "Has a faceguard"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(212, "?AX", "?A2X", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor foe!", new String[]{"What a sheild!", "I really need one"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(212, "*4?X", "*41X", new String[]{"M Blocker"}, new String[]{"M Blocker"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor monster", new String[]{"Armor with shield", "It's eyes glow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(212, "???X", "*40X", new String[]{"E Guardian"}, new String[]{"E Guardian"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Elemental Guardian", new String[]{"Has a sheild", "It's colorful"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//**0 Null Edge
				//Erase Edge
			else if(MonsterNo == 215){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(215, "71X", "215", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A too white sword", new String[]{"A white sword", "Almost Colorless"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(215, "**?X", "**1X", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A too white sword", new String[]{"A white sword", "Has curved guard"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(215, "**?X", "**1X", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A too white sword", new String[]{"A white sword", "it's large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(215, "**?X", "**1X", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A too white sword", new String[]{"A white sword", "Has a gray gem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(215, "??X", "??2X", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A sword monster", new String[]{"Sword monsters.", "they are rare here"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(215, "**?X", "**1X", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A too white sword", new String[]{"A white sword", "Can erase things!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(215, "???", "**0X", new String[]{"Erase Edge"}, new String[]{"Erase Edge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "A too white sword", new String[]{"A white sword", "Has Null Aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
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
				//Nameless
					//Shapeless
				MInfo  = new MonsterData[]{
					new MonsterData(000, "NULL", "", new String[]{"Shapeless"}, new String[]{"Shapeless"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDef*/0, 0, 0, 6, 1, "No Data", new String[]{"looks like mist maybe?", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/30, /*Status*/0, /*StatusC*/0)

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