package textonlyrpg;

public class MonsterData03R {
	

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
//			//FF
//			if(MonsterNo == 99){
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
			
			//002 Ice Dragon
				//Red Ice Dragon
			//Pink Ice Dragon
			if(MonsterNo == 219){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(219, "72R", "219", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An Ice Dragon?", new String[]{"An ice dragon?", "It's clear pink"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(219, "00?R", "002R", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An Ice Dragon?", new String[]{"An ice dragon?", "It's different than..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(219, "00?R", "002R", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An Ice Dragon?", new String[]{"An ice dragon?", "Not a dragon?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(219, "00?R", "002R", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An Ice Dragon?", new String[]{"An ice dragon?", "Where is the other one?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(219, "BBS", "BB3S", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pink Ice?", new String[]{"What is Pink Ice?", "Magic or something"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(219, "00?R", "002R", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An Ice Dragon?", new String[]{"An ice dragon?", "Still dangerous"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(219, "???T", "002T", new String[]{"Pink Ice Dragon"}, new String[]{"PnkIcDrgon"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "An Ice Dragon?", new String[]{"An ice dragon?", "Has breath attacks?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//012 Cold Jam
				//Amber Cold Jam
			//Gold Jam
			else if(MonsterNo == 222){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(222, "73R", "222", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A rare slime boss", new String[]{"A rare slime", "It's golden"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(222, "01?R", "012R", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A rare slime boss", new String[]{"A rare slime", "Very opaque"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(222, "01?R", "012R", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A rare slime boss", new String[]{"A rare slime", "sparkly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(222, "01?R", "012R", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A rare slime boss", new String[]{"A rare slime", "slightly dark"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(222, "BSlS", "BSl3S", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's golden", new String[]{"Must be rare", "It's golden"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(222, "01?R", "012R", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A rare slime boss", new String[]{"A rare slime", "It moves normally"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(222, "???T", "012T", new String[]{"Gold Jam"}, new String[]{"Gold Jam"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A rare slime boss", new String[]{"A rare slime", "Also a boss"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//022 Frozen Curse
				//Freezing Curse
			//No curse
			else if(MonsterNo == 225){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(225, "74R", "225", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ghostly monster?", new String[]{"Ghost monster?", "It's white and black"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/10),
						//1 = Normal Mode
						new MonsterData(225, "02?R", "022R", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ghostly monster?", new String[]{"Ghost monster?", "Doesn't move?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/10),
						//2 = Easy Mode
						new MonsterData(225, "02?R", "022R", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ghostly monster?", new String[]{"Ghost monster?", "Seems odd..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/30),
						//3 = Hard Mode
						new MonsterData(225, "02?R", "022R", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ghostly monster?", new String[]{"Ghost monster?", "Seems to glow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/10),
						//4 = Other Story
						new MonsterData(225, "BGhS", "BGh3S", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Not scary?", new String[]{"It's a ghost but...", "It doesn't scare me?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/10),
						//5 = Glitch
						new MonsterData(225, "02?R", "022R", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ghostly monster?", new String[]{"Ghost monster?", "Lacks presense"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/10),
						//6 = Beta
						new MonsterData(225, "???T", "022T", new String[]{"No curse"}, new String[]{"No curse"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Ghostly monster?", new String[]{"Ghost monster?", "lacks aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/6, /*StatusC*/10)
				};
			}
			
			//032 Gaint Statue
				//Frozen Titan Statue
			//TitanStatue
			else if(MonsterNo == 228){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(228, "75R", "228", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So large it towers", new String[]{"Titan sized monster", "It's gray/brown"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(228, "03?R", "032R", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So large it towers", new String[]{"Titan sized monster", "odd looking face"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(228, "03?R", "032R", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So large it towers", new String[]{"Titan sized monster", "biger than most"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(228, "03?R", "032R", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So large it towers", new String[]{"Titan sized monster", "human like proportions"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(228, "BGoS", "BGo3S", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's HUGE!", new String[]{"So big!", "How do I fight this?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, 
								/*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(228, "03?R", "032R", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So large it towers", new String[]{"Titan sized monster", "Has angry eyes"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(228, "???T", "032T", new String[]{"Titan Statue"}, new String[]{"TitanStatu"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "So large it towers", new String[]{"Titan sized monster", "looks carved"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//042 Coded Knight
				//Coded Knight R
			//Silver Knight
			else if(MonsterNo == 231){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(231, "76R", "231", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pure silver armor", new String[]{"It's different!", "silver colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(231, "04?R", "042R", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pure silver armor", new String[]{"It's different!", "bulky"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(231, "04?R", "042R", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pure silver armor", new String[]{"It's different!", "same hieght"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(231, "04?R", "042R", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pure silver armor", new String[]{"It's different!", "has shield"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(231, "BAS", "BA3S", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's gleaming", new String[]{"Super reflective", "it's fancy!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(231, "04?R", "042R", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pure silver armor", new String[]{"It's different!", "has silver sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(231, "???T", "042T", new String[]{"Silver Knight"}, new String[]{"SilvrKnght"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pure silver armor", new String[]{"It's different!", "stronger though?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//0*2 Frost Edge
				//Frozen Edge
			//Ice Cleavor
			else if(MonsterNo == 234){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(234, "77R", "234", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Oddly shaped sword", new String[]{"Odd sword", "Dark gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(234, "0*?R", "0*2R", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Oddly shaped sword", new String[]{"Odd sword", "waves around wildly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(234, "0*?R", "0*2R", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Oddly shaped sword", new String[]{"Odd sword", "has a blue gem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(234, "0*?R", "0*2R", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Oddly shaped sword", new String[]{"Odd sword", "covered with frost"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(234, "B?S", "B?3S", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Has wierd shape", new String[]{"Still sword like", "has an odd shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(234, "0*?R", "0*2R", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Oddly shaped sword", new String[]{"Odd sword", "it's curved"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(234, "???T", "0*2T", new String[]{"Ice Cleavor"}, new String[]{"IceCleavor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Oddly shaped sword", new String[]{"Odd sword", "It's very large"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//102 Liquid Shadow
				//Dark Matter
			//Light Matter
			else if(MonsterNo == 237){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(237, "78R", "237", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Strange light substance", new String[]{"Light substance", "It's white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(237, "10?R", "102R", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Strange light substance", new String[]{"Light substance", "seems to glide"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(237, "10?R", "102R", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Strange light substance", new String[]{"Light substance", "liquid energy?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(237, "10?R", "102R", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Strange light substance", new String[]{"Light substance", "Shoots light"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(237, "SlBS", "SlB3S", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of light?", new String[]{"Made of light?", "It's stuff?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(237, "10?R", "102R", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Strange light substance", new String[]{"Light substance", "swirls"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(237, "???T", "102T", new String[]{"Light Matter"}, new String[]{"LghtMatter"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 13, 
								/*MDEF*/0, 0, 0, 6, 1, "Strange light substance", new String[]{"Light substance", "shines with color"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//112 Extra Rare Slime
				//Very Extra Rare Slime
			//XXR Slime
			else if(MonsterNo == 240){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(240, "79R", "240", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Impossibly rare slime", new String[]{"Impossibly rare", "It's lime green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(240, "11?R", "112R", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Impossibly rare slime", new String[]{"Impossibly rare", "sparkles"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(240, "11?R", "112R", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Impossibly rare slime", new String[]{"Impossibly rare", "reflective"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(240, "11?R", "112R", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Impossibly rare slime", new String[]{"Impossibly rare", "similar as slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(240, "SlSlS", "SlSl3S", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "What is this?", new String[]{"Never seen one", "Is it that rare?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(240, "11?R", "112R", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Impossibly rare slime", new String[]{"Impossibly rare", "almost unseen"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(240, "???T", "112T", new String[]{"XXR Slime"}, new String[]{"XXR Slime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Impossibly rare slime", new String[]{"Impossibly rare", "How valuable?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//122 Transparent Slime
				//Stealth Slime
			//Polka Slime
			else if(MonsterNo == 243){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(243, "80R", "243", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Polka dotted slime", new String[]{"Odd colored slime", "It's green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(243, "12?R", "122R", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Polka dotted slime", new String[]{"Odd colored slime", "Has red dots"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(243, "12?R", "122R", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Polka dotted slime", new String[]{"Odd colored slime", "It's opaque"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(243, "12?R", "122R", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Polka dotted slime", new String[]{"Odd colored slime", "not shiny"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(243, "SlGhS", "SlGh3S", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Wierd colored", new String[]{"Weird colored", "How does it hide?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(243, "12?R", "122R", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Polka dotted slime", new String[]{"Odd colored slime", "jumps around a lot"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(243, "???T", "122T", new String[]{"Polka Slime"}, new String[]{"PolkaSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Polka dotted slime", new String[]{"Odd colored slime", "oddly stealthy?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//132 Icicle Slime
				//Purple Icicle Slime (Poison!)
			//Popsicle Slime
			else if(MonsterNo == 246){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(246, "81R", "246", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ice pops?", new String[]{"Made of ice pops?", "It's orange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(246, "13?R", "132R", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ice pops?", new String[]{"Made of ice pops?", "tastes good?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(246, "13?R", "132R", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ice pops?", new String[]{"Made of ice pops?", "Similar to icicle slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(246, "13?R", "132R", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ice pops?", new String[]{"Made of ice pops?", "they stick out the top"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(246, "SlGoS", "SlGo3S", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Weirdly shaped", new String[]{"Shaped wierdly", "made of food?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(246, "13?R", "132R", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ice pops?", new String[]{"Made of ice pops?", "seems solid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(246, "???T", "132T", new String[]{"Popsicle Slime"}, new String[]{"PopsclSlime"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ice pops?", new String[]{"Made of ice pops?", "is it edible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//142 Armor Jell
				//Jell Armored Jell
			//GrnArmorJell
			else if(MonsterNo == 249){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(249, "82R", "249", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare armored jell", new String[]{"Rare armored jell", "It is green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(249, "14?R", "142R", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare armored jell", new String[]{"Rare armored jell", "The armor is gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(249, "14?R", "142R", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare armored jell", new String[]{"Rare armored jell", "has plates as armor"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(249, "14?R", "142R", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare armored jell", new String[]{"Rare armored jell", "armor is metal?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(249, "SlAS", "SlA3S", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "It's greenish", new String[]{"It's greenish", "A rare type?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(249, "14?R", "142R", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare armored jell", new String[]{"Rare armored jell", "seems pretty solid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(249, "???T", "142T", new String[]{"GrnArmorJell"}, new String[]{"GnArmrJell"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare armored jello", new String[]{"Rare armored jell", "has transparent slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//1*2 Jelly!
				// Sticky Jelly! (sticky Curse)
			//Blue Jelly
			else if(MonsterNo == 252){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(252, "83R", "252", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare colored slime", new String[]{"A type of slime", "It's blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(252, "1*?R", "1*2R", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare colored slime", new String[]{"A type of slime", "smells of blueberry"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(252, "1*?R", "1*2R", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare colored slime", new String[]{"A type of slime", "Made of food?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(252, "1*?R", "1*2R", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare colored slime", new String[]{"A type of slime", "looks melty"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(252, "Sl?S", "Sl?3S", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's blue", new String[]{"It's blue", "It's jelly?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(252, "1*?R", "1*2R", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare colored slime", new String[]{"A type of slime", "Edible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(252, "???T", "1*2T", new String[]{"Blue Jelly"}, new String[]{"Blue Jelly"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Rare colored slime", new String[]{"A type of slime", "slime sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//202 Frozen Wraith
				//Lich
			//Chili Lich
			else if(MonsterNo == 255){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(255, "84R", "255", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Fire element lich", new String[]{"A fire lich?", "Red and blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(255, "20?R", "202R", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Fire element lich", new String[]{"A fire lich?", "Has fire aura?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(255, "20?R", "202R", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Fire element lich", new String[]{"A fire lich?", "crackles and cackles"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(255, "20?R", "202R", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Fire element lich", new String[]{"A fire lich?", "lich sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(255, "GhBS", "GhB3S", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Smells spicy?", new String[]{"Smells of...", "spicy meat?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(255, "20?R", "202R", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Fire element lich", new String[]{"A fire lich?", "smells of spices"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(255, "???T", "202T", new String[]{"Chili Lich"}, new String[]{"Chili Lich"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Fire element lich", new String[]{"A fire lich?", "how odd!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//212 Ectoplasm - Lv.9
				//Will o Wisp Lv.9
			//GrnEctopsm
			else if(MonsterNo == 258){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(258, "85R", "258", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Odd color ectoplasm", new String[]{"It's an odd color", "It's green and yellow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(258, "21?R", "212R", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Odd color ectoplasm", new String[]{"It's an odd color", "About the same size"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(258, "21?R", "212R", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Odd color ectoplasm", new String[]{"It's an odd color", "but looks the same"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(258, "21?R", "212R", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Odd color ectoplasm", new String[]{"It's an odd color", "moves the same"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(258, "GhSlS", "GhSl3S", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "It's off color", new String[]{"Slightly off color", "might be rare?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(258, "21?R", "212R", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Odd color ectoplasm", new String[]{"It's an odd color", "May be rare?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(258, "???T", "212T", new String[]{"GrnEctopsm"}, new String[]{"GrnEctopsm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "Odd color ectoplasm", new String[]{"It's an odd color", "Stronger or not?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//222 Lingering Grudge
				//Following Grudge
			//LazyGrudge
			else if(MonsterNo == 261){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(261, "86R", "261", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A lazy ghost", new String[]{"It's lazy", "also monochrome"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(261, "22?R", "222R", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A lazy ghost", new String[]{"It's lazy", "Looks like a person"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(261, "22?R", "222R", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A lazy ghost", new String[]{"It's lazy", "likes to lay there"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(261, "22?R", "222R", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A lazy ghost", new String[]{"It's lazy", "not as scary..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(261, "GhGhS", "GhGh3S", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It lays there", new String[]{"It's just...", "laying there"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(261, "22?R", "222R", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A lazy ghost", new String[]{"It's lazy", "still dangerous"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(261, "???T", "222T", new String[]{"Lazy Grudge"}, new String[]{"LazyGrudge"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A lazy ghost", new String[]{"It's lazy", "no aura?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//232 Ice Shadow
				//Frozen Shadow
			//GoldShadow
			else if(MonsterNo == 264){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(264, "87R", "264", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A gold ghost", new String[]{"A shadow ghost", "It's golden"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(264, "23?R", "232R", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A gold ghost", new String[]{"A shadow ghost", "reflective"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(264, "23?R", "232R", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A gold ghost", new String[]{"A shadow ghost", "fights unarmed"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(264, "23?R", "232R", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A gold ghost", new String[]{"A shadow ghost", "Normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(264, "GhGoS", "GhGo3S", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's rare!", new String[]{"A golden ghost", "How rare!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(264, "23?R", "232R", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A gold ghost", new String[]{"A shadow ghost", "has no features"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(264, "???T", "232T", new String[]{"Gold Shadow"}, new String[]{"GoldShadow"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/2, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A gold ghost", new String[]{"A shadow ghost", "seems solid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//242 Cursed Armor
				//Forbiddon Armor
			//SealedArmor
			else if(MonsterNo == 267){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(267, "88R", "267", new String[]{"Sealed Armor"}, new String[]{"SealdArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems locked up", new String[]{"Seems locked up", "Gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(267, "24?R", "242R", new String[]{"Sealed Armor"}, new String[]{"SealdArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems locked up", new String[]{"Seems locked up", "Has locks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(267, "24?R", "242R", new String[]{"Sealed Armor"}, new String[]{"SealdArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems locked up", new String[]{"Seems locked up", "shambles slowly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(267, "24?R", "242R", new String[]{"Sealed Armor"}, new String[]{"SealdArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems locked up", new String[]{"Seems locked up", "has ominous aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(267, "GhAS", "GhA3S", new String[]{"Sealed Armor"}, new String[]{"SealdArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Lots of chains", new String[]{"So many chains", "Like a ghoul"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(267, "24?R", "242R", new String[]{"Sealed Armor"}, new String[]{"SealdArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems locked up", new String[]{"Seems locked up", "Has chained sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(267, "???T", "242T", new String[]{"Sealed Armor"}, new String[]{"SealdArmor."}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems locked up", new String[]{"Seems locked up", "has horns"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//2*2 Radio Static
				//Wight Noise
			//BlueScreen
			else if(MonsterNo == 270){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(270, "89R", "270", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 18, 
								/*MDEF*/0, 0, 0, 6, 1, "It's square", new String[]{"A square", "It's blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(270, "2*?R", "2*2R", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 18, 
								/*MDEF*/0, 0, 0, 6, 1, "It's square", new String[]{"A square", "Has white text"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(270, "2*?R", "2*2R", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's square", new String[]{"A square", "Seems flat"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(270, "2*?R", "2*2R", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 18, 
								/*MDEF*/0, 0, 0, 6, 1, "It's square", new String[]{"A square", "A monster?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(270, "Gh?S", "Gh?3S", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 18, 
								/*MDEF*/0, 0, 0, 6, 1, "It's a picture?", new String[]{"A picture?", "Mostly blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(270, "2*?R", "2*2R", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 18, 
								/*MDEF*/0, 0, 0, 6, 1, "It's square", new String[]{"A square", "has odd sound"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(270, "???T", "2*2T", new String[]{"Blue Screen"}, new String[]{"BlueScreen"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "It's square", new String[]{"A square", "moves jerkily"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//302 Ice Golem
				//Black Ice Golem
			//Shaved Ice Golem
			else if(MonsterNo == 273){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(273, "90R", "273", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Shaved ice?", new String[]{"Made of shaved ice", "It's white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(273, "30?R", "302R", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Shaved ice?", new String[]{"Made of shaved ice", "Looks like snow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(273, "30?R", "302R", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Shaved ice?", new String[]{"Made of shaved ice", "It's bulky"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(273, "30?R", "302R", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Shaved ice?", new String[]{"Made of shaved ice", "Rounded appearance"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(273, "GoBS", "GoB3S", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks like snow", new String[]{"Looks like snow", "Shaved ice?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(273, "30?R", "302R", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Shaved ice?", new String[]{"Made of shaved ice", "nas no face?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(273, "???T", "302T", new String[]{"Shaved Ice Golem"}, new String[]{"ShvdIceGlm"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 12, 
								/*MDEF*/0, 0, 0, 6, 1, "Shaved ice?", new String[]{"Made of shaved ice", "Has ice power?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//312 Magma Golem
				//Volcano Golem
			//AshGolem
			else if(MonsterNo == 276){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(276, "91R", "276", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A golem of ash", new String[]{"A golem of ash", "It's dark gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(276, "31?R", "312R", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A golem of ash", new String[]{"A golem of ash", "Seems to be loose"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(276, "31?R", "312R", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A golem of ash", new String[]{"A golem of ash", "Average sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(276, "31?R", "312R", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "A golem of ash", new String[]{"A golem of ash", "Not very solid..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(276, "GoSlS", "GoSl3S", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It tracks ash", new String[]{"It tracks ash", "ash everywhere."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(276, "31?R", "312R", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A golem of ash", new String[]{"A golem of ash", "Golem shaped"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(276, "???T", "312T", new String[]{"Ash Golem"}, new String[]{"Ash Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A golem of ash", new String[]{"A golem of ash", "Not elemental?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//322 Chaotic Possesed Earth
				//Chaotic Haunted Earth
			//Pebbles
			else if(MonsterNo == 279){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(279, "92R", "279", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pile of rocks", new String[]{"Pile of rocks", "Gray rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(279, "32?R", "322R", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pile of rocks", new String[]{"Pile of rocks", "smooth rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(279, "32?R", "322R", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pile of rocks", new String[]{"Pile of rocks", "hop together?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(279, "32?R", "322R", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pile of rocks", new String[]{"Pile of rocks", "Throws rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(279, "GoGhS", "GoGh3S", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "small rocks?", new String[]{"Small pile of rocks", "but evil"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(279, "32?R", "322R", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pile of rocks", new String[]{"Pile of rocks", "small rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(279, "???T", "322T", new String[]{"Pebbles"}, new String[]{"Pebbles"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Pile of rocks", new String[]{"Pile of rocks", "part golem?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//332 Shiny Golem
				//Sparkling Golem
			//Dull Golem
			else if(MonsterNo == 282){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(282, "93R", "282", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of stone?", new String[]{"Made of stone?", "It's bronze colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(282, "33?R", "332R", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of stone?", new String[]{"Made of stone?", "Is it rare?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(282, "33?R", "332R", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of stone?", new String[]{"Made of stone?", "looks like metal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(282, "33?R", "332R", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of stone?", new String[]{"Made of stone?", "seems normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(282, "GoGoS", "GoGo3S", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "sort of... bronze?", new String[]{"Bronze colored", "Seems like stone?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(282, "33?R", "332R", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of stone?", new String[]{"Made of stone?", "has no luster"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(282, "???T", "332T", new String[]{"Dull Golem"}, new String[]{"Dull Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of stone?", new String[]{"Made of stone?", "Lighter than golem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//342 Ore Golem
				//Crystal Golem
			//Ruby Golem
			else if(MonsterNo == 285){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(285, "94R", "285", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ruby?", new String[]{"Made of ruby?", "It's red"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(285, "34?R", "342R", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ruby?", new String[]{"Made of ruby?", "Seems fragile?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(285, "34?R", "342R", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ruby?", new String[]{"Made of ruby?", "Is it fragile?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(285, "34?R", "342R", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ruby?", new String[]{"Made of ruby?", "It's transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(285, "GoAS", "GoA3S", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Bright red!", new String[]{"It's red?", "Looks like ruby"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(285, "34?R", "342R", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ruby?", new String[]{"Made of ruby?", "normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(285, "???T", "342T", new String[]{"Ruby Golem"}, new String[]{"Ruby Golem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of ruby?", new String[]{"Made of ruby?", "similar to golem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//3*2 Broken Golem
				//Breaker Golem
			//FixedGolem
			else if(MonsterNo == 288){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(288, "95R", "288", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks Normal?", new String[]{"Looks Normal?", "Slightly odd colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(288, "3*?R", "3*2R", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks Normal?", new String[]{"Looks Normal?", "Parts float a bit?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(288, "3*?R", "3*2R", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks Normal?", new String[]{"Looks Normal?", "Moves oddly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(288, "3*?R", "3*2R", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks Normal?", new String[]{"Looks Normal?", "Average sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(288, "Go?S", "Go?3S", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Just golem?", new String[]{"Just a golem?", "Seems odd..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(288, "3*?R", "3*2R", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks Normal?", new String[]{"Looks Normal?", "seems unstable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(288, "???T", "3*2T", new String[]{"Fixed Golem"}, new String[]{"FixedGolem"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks Normal?", new String[]{"Looks Normal?", "Seems to stretch!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//402 Coded Armor
				//Coded Armor S
			//Codeword
			else if(MonsterNo == 291){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(291, "96R", "291", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor enemy?", new String[]{"An armor enemy?", "It's black and white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(291, "40?R", "402R", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor enemy?", new String[]{"Cheat?", "What does that mean?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(291, "40?R", "402R", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor enemy?", new String[]{"An armor enemy?", "Has writing on it."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(291, "40?R", "402R", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 17, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor enemy?", new String[]{"An armor enemy?", "carries a wide sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(291, "ABS", "AB3S", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "What's written there?", new String[]{"Something is written", "What is it?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(291, "40?R", "402R", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor enemy?", new String[]{"An armor enemy?", "Normal sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(291, "???T", "402T", new String[]{"Codeword"}, new String[]{"Codeword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 15, 
								/*MDEF*/0, 0, 0, 6, 1, "An armor enemy?", new String[]{"An armor enemy?", "Has a shield?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//412 River Armor
				//Lake Armor
			//SteamArmor
			else if(MonsterNo == 294){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(294, "97R", "294", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Smokey white armor", new String[]{"Smokey white armor", "Gives off steam"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(294, "41?R", "412R", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Smokey white armor", new String[]{"Smokey white armor", "seems hot!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(294, "41?R", "412R", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Smokey white armor", new String[]{"Smokey white armor", "Water element?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(294, "41?R", "412R", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Smokey white armor", new String[]{"Smokey white armor", "Fire element?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(294, "ASlS", "ASl3S", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Gives off steam?", new String[]{"Must be hot...", "It gives off steam"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(294, "41?R", "412R", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Smokey white armor", new String[]{"Smokey white armor", "Has steam sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(294, "???T", "412T", new String[]{"Steam Armor"}, new String[]{"SteamArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 7, 
								/*MDEF*/0, 0, 0, 6, 1, "Smokey white armor", new String[]{"Smokey white armor", "Seems solid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//422 Mist Armor
				//Fog Armor
			//SkyArmor
			else if(MonsterNo == 297){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(297, "98R", "297", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 9, 
								/*MDEF*/0, 0, 0, 6, 1, "Has sky pattern", new String[]{"Sky armor", "Blue and white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(297, "42?R", "422R", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 9, 
								/*MDEF*/0, 0, 0, 6, 1, "Has sky pattern", new String[]{"Sky armor", "has cloud pattern"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(297, "42?R", "422R", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has sky pattern", new String[]{"Sky armor", "it's pattern moves"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(297, "42?R", "422R", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 9, 
								/*MDEF*/0, 0, 0, 6, 1, "Has sky pattern", new String[]{"Sky armor", "Has blue sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(297, "AGhS", "AGh3S", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 9, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks nice", new String[]{"It looks nice", "like the sky!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(297, "42?R", "422R", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 9, 
								/*MDEF*/0, 0, 0, 6, 1, "Has sky pattern", new String[]{"Sky armor", "Has an element?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(297, "???T", "422T", new String[]{"Sky Armor"}, new String[]{"SkyArmor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 9, 
								/*MDEF*/0, 0, 0, 6, 1, "Has sky pattern", new String[]{"Sky armor", "not tranparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//432 Mountian Armor
				//Chasm Armor
			//FlowerArmor
			else if(MonsterNo == 300){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(300, "99R", "300", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has flower design?", new String[]{"Flower armor?", "Green and yellow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(300, "43?R", "432R", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has flower design?", new String[]{"Flower armor?", "Smooth shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(300, "43?R", "432R", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has flower design?", new String[]{"Flower armor?", "Has flower pattern"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(300, "43?R", "432R", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 10, 
								/*MDEF*/0, 0, 0, 6, 1, "Has flower design?", new String[]{"Flower armor?", "Has a sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(300, "AGoS", "AGo3S", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "... Really?", new String[]{"Really now.", "Flowers?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(300, "43?R", "432R", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has flower design?", new String[]{"Flower armor?", "has basic shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(300, "???T", "432T", new String[]{"Flower Armor"}, new String[]{"FlowerArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Has flower design?", new String[]{"Flower armor?", "average sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//442 Money Armor
				//Treasure Armor
			//Fortune Armor
			else if(MonsterNo == 303){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(303, "100R", "303", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of coins", new String[]{"Made of coins", "It's gold"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(303, "44?R", "442R", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of coins", new String[]{"Made of coins", "Such workmanship!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(303, "44?R", "442R", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of coins", new String[]{"Made of coins", "Must be valuable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(303, "44?R", "442R", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of coins", new String[]{"Made of coins", "Average sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(303, "AAS", "AA3S", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks like money?", new String[]{"It's made of loot!", "Too bad it's evil"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(303, "44?R", "442R", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of coins", new String[]{"Made of coins", "It's shiny"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(303, "???T", "442T", new String[]{"Fortune Armor"}, new String[]{"FortunArmr"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Made of coins", new String[]{"Made of coins", "Fancy design"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//4*2 Prototype Mech
				//Prototype Mrk.2
			//Golden Automaton
			else if(MonsterNo == 306){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(306, "101R", "306", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Golden Automaton", new String[]{"A machine?", "Mostly gold"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(306, "4*?R", "4*2R", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Golden Automaton", new String[]{"A machine?", "Sort of humanoid"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(306, "4*?R", "4*2R", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Golden Automaton", new String[]{"A machine?", "Has an eye lense"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(306, "4*?R", "4*2R", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Golden Automaton", new String[]{"A machine?", "How does it work?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(306, "A?S", "A?3S", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's gold.", new String[]{"Made of gold", "Why?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(306, "4*?R", "4*2R", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Golden Automaton", new String[]{"A machine?", "Looks expensive"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(306, "???T", "4*2T", new String[]{"Golden Automaton"}, new String[]{"GldAutomatn"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Golden Automaton", new String[]{"A machine?", "Why gold?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*02 Broken Sword
				//Ruined Sword
			//Fixed Sword
			else if(MonsterNo == 309){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(309, "102R", "309", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Repaired sword", new String[]{"Repaired sword", "Varying grays"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(309, "*0?R", "*02R", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Repaired sword", new String[]{"Repaired sword", "looks cobbled"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(309, "*0?R", "*02R", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Repaired sword", new String[]{"Repaired sword", "Was broken?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(309, "*0?R", "*02R", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Repaired sword", new String[]{"Repaired sword", "one peice?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(309, "?BS", "?B3S", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Looks repaired?", new String[]{"Looks repaired?", "Was it broken?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(309, "*0?R", "*02R", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Repaired sword", new String[]{"Repaired sword", "Hovers there"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(309, "???T", "*02T", new String[]{"Fixed Sword"}, new String[]{"FixedSword"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Repaired sword", new String[]{"Repaired sword", "It's short"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*12 Mad Subtractor
				//Poison Adder
			//Null Viper
			else if(MonsterNo == 312){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(312, "103R", "312", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Has Null Power", new String[]{"Viper monster", "      Colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(312, "*1?R", "*12R", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1,
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Has Null Power", new String[]{"Viper monster", "??? Sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(312, "*1?R", "*12R", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Has Null Power", new String[]{"Viper monster", "Has eyes that..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(312, "*1?R", "*12R", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Has Null Power", new String[]{"Viper monster", "Has Null power"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(312, "?SlS", "?Sl3S", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems empty?", new String[]{"Seems empty", "Filled with ???"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(312, "*1?R", "*12R", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Has Null Power", new String[]{"Viper monster", "Seems unstable"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(312, "???T", "*12T", new String[]{"Null Viper"}, new String[]{"NullViper"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 16, 
								/*MDEF*/0, 0, 0, 6, 1, "Has Null Power", new String[]{"Viper monster", "Viper monster"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*22 Negative Image
				//Mirror Image
			//Drawing
			else if(MonsterNo == 315){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(315, "104R", "315", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A large drawing", new String[]{"A large drawing", "Gray on white"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(315, "*2?R", "*22R", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A large drawing", new String[]{"A large drawing", "It has trees?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(315, "*2?R", "*22R", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A large drawing", new String[]{"A large drawing", "Depicts a house"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(315, "*2?R", "*22R", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A large drawing", new String[]{"A large drawing", "Somewhere near?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(315, "?GhS", "?Gh3S", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "It's paper?", new String[]{"Just a drawing", "Some paper?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(315, "*2?R", "*22R", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A large drawing", new String[]{"A large drawing", "Floats there."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(315, "???T", "*22T", new String[]{"Drawing"}, new String[]{"Drawing"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/6, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A large drawing", new String[]{"A large drawing", "What's on the back?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*32 Terra Cotta Warrier
				//Super Fighting Terra Cotta
			//Stone Leg
			else if(MonsterNo == 318){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(318, "105R", "318", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A stone leg", new String[]{"A stone leg", "It's gray"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(318, "*3?R", "*32R", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A stone leg", new String[]{"A stone leg", "Looks ready to kick"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(318, "*3?R", "*32R", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A stone leg", new String[]{"A stone leg", "Jumps to move"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(318, "*3?R", "*32R", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A stone leg", new String[]{"A stone leg", "kicks to attack"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(318, "?GoS", "?Go3S", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "Just a leg", new String[]{"Just a leg?", "What?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(318, "*3?R", "*32R", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A stone leg", new String[]{"A stone leg", "Clacks as it moves"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(318, "???T", "*32T", new String[]{"Stone Leg"}, new String[]{"Stone Leg"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, 
								/*MDEF*/0, 0, 0, 6, 1, "A stone leg", new String[]{"A stone leg", "Medium sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			//*42 D. A[]m[]r
				//DisArmor
			//All Armor
			else if(MonsterNo == 321){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(321, "106R", "321", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has All power", new String[]{"Has All power", "Light colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/20),
						//1 = Normal Mode
						new MonsterData(321, "*4?R", "*42R", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has All power", new String[]{"Has All power", "Aura is rainbow!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/20),
						//2 = Easy Mode
						new MonsterData(321, "*4?R", "*42R", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has All power", new String[]{"Has All power", "Has a sword"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(321, "*4?R", "*42R", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has All power", new String[]{"Has All power", "Has all aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/40),
						//4 = Other Story
						new MonsterData(321, "?AS", "?A3S", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems powerful!", new String[]{"Has all elements!", "NO WAY!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/20),
						//5 = Glitch
						new MonsterData(321, "*4?R", "*42R", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has All power", new String[]{"Has All power", "Wields all elements"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/20),
						//6 = Beta
						new MonsterData(321, "???T", "*42T", new String[]{"All Armor"}, new String[]{"All Armor"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/4, 20, 
								/*MDEF*/0, 0, 0, 6, 1, "Has All power", new String[]{"Has All power", "makes humming noise"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/20)
				};
			}
			
			//**2 Unknown Enemy
				//Mystery Enemy
			//Known Enemy
			else if(MonsterNo == 324){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(324, "107R", "324", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems familiar?", new String[]{"Seems familiar?", "It's blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//1 = Normal Mode
						new MonsterData(324, "**?R", "**2R", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems familiar?", new String[]{"Seems familiar?", "Some kind of shape"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//2 = Easy Mode
						new MonsterData(324, "**?R", "**2R", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems familiar?", new String[]{"Seems familiar?", "Moves oddly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//3 = Hard Mode
						new MonsterData(324, "**?R", "**2R", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems familiar?", new String[]{"Seems familiar?", "Average sized"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//4 = Other Story
						new MonsterData(324, "??S", "??3S", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "What is this?", new String[]{"What is it?", "Do I know?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//5 = Glitch
						new MonsterData(324, "**?R", "**2R", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems familiar?", new String[]{"Seems familiar?", "I don't know it."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
						//6 = Beta
						new MonsterData(324, "???T", "**2T", new String[]{"Known Enemy"}, new String[]{"KnownEnemy"}, 
								/*MHP*/0, 0, 0, 5, 9, 1, 
								/*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/5, 19, 
								/*MDEF*/0, 0, 0, 6, 1, "Seems familiar?", new String[]{"Seems familiar?", "How though?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};
			}
			
			
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