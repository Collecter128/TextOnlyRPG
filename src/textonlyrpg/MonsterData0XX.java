package textonlyrpg;

public class MonsterData0XX {
	

	public static MonsterData MData(int MonsterNo, int Var){
		//MonsterData[] AllMData = new MonsterData[] {new MonsterData(0, "", "Defaulter", /*MHP*/9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MDef*/9, 9, 9, 9, 1, "...", /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.5}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{0, 0, 0},{0, 0, 0}})};
		MonsterData MInfo[] = new MonsterData[]{new MonsterData(0, "", "", new String[]{"Defaulter"}, new String[]{"Defaulter"},/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)};// 
		{
			
			//Formless
			if(MonsterNo == 361){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(361, "   ", "361", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Has no form?", new String[]{"Has no form", "Grayish"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//1 = Normal Mode
						new MonsterData(361, "   X", "   X", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Has no form?", new String[]{"Has no form", "Changes a lot"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(361, "   X", "   X", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Has no form?", new String[]{"Has no form", "Hard to fight"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(361, "   X", "   X", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Has no form?", new String[]{"Has no form", "attacks wildly"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(361, "???X", "???X", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Keeps changing!", new String[]{"It keeps changing", "Hard to watch"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(361, "   X", "   X", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Has no form?", new String[]{"Has no form", "inconsitant"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(361, "   X", "   X", new String[]{"Formless"}, new String[]{"Formless"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 16, 
								/*MDef*/9, 9, 9, 9, 1, "Has no form?", new String[]{"Has no form", "Isn't normal..."},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//Red Armor
				//Crimson Armor
			if(MonsterNo == 364){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(364, "108X", "364", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Dark red armor", new String[]{"Dark red armor", "It's... Dark red"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//1 = Normal Mode
						new MonsterData(364, "01*X", "01*X", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Dark red armor", new String[]{"Dark red armor", "Has a sheild"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(364, "01*X", "01*X", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Dark red armor", new String[]{"Dark red armor", "has a sword"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(364, "01*X", "01*X", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Dark red armor", new String[]{"Dark red armor", "Has dangerous aura"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(364, "A??X", "A??X", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Seems dangerous!", new String[]{"Seems dangerous!", "Unusual"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(364, "01*X", "01*X", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Dark red armor", new String[]{"Dark red armor", "Normal sized"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(364, "01*X", "01*X", new String[]{"Crimson Armor"}, new String[]{"CrmsnArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Dark red armor", new String[]{"Dark red armor", "Has horns"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
						//7 = 7th    
						
				};
			}
			

			//Pink Master
				//Sakura Don
			else if(MonsterNo == 367){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(367, "109X", "367", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A crime lord", new String[]{"A crime lord!", "Wears pink."}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(367, "02*X", "02*X", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A crime lord", new String[]{"A crime lord!", "wears odd garb"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//2 = Easy Mode
						new MonsterData(367, "02*X", "02*X", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A crime lord", new String[]{"A crime lord!", "has flunkies"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//3 = Hard Mode
						new MonsterData(367, "02*X", "02*X", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A crime lord", new String[]{"A crime lord!", "A human"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//4 = Other Story
						new MonsterData(367, "Human", "Human", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A pink suit?", new String[]{"Wears pink suit?", "Seems mean"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//5 = Glitch
						new MonsterData(367, "02*X", "02*X", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A crime lord", new String[]{"A crime lord!", "About average sized"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//6 = Beta
						new MonsterData(367, "02*X", "02*X", new String[]{"Sakura Don"}, new String[]{"SakuraDon"}, 
								/*MHP*/0, 0, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A crime lord", new String[]{"A crime lord!", "about average weight"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//
						//7 = 7th   
				};
			}
			
			//Enemy Spy
				//Ninja
			else if(MonsterNo == 370){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(370, "110X", "370", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A hidden foe!", new String[]{"A hidden foe!", "Wears black and blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/5),//
						//1 = Normal Mode
						new MonsterData(370, "03*X", "03*X", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A hidden foe!", new String[]{"A hidden foe!", "stealthy"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/5),//
						//2 = Easy Mode
						new MonsterData(370, "03*X", "03*X", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A hidden foe!", new String[]{"A hidden foe!", "has kunai"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//3 = Hard Mode
						new MonsterData(370, "03*X", "03*X", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A hidden foe!", new String[]{"A hidden foe!", "Average build"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/10),//
						//4 = Other Story
						new MonsterData(370, "Human", "Human", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "It's a ninja!", new String[]{"Keeps trying to hide", "Really?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/5),//
						//5 = Glitch
						new MonsterData(370, "03*X", "03*X", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A hidden foe!", new String[]{"A hidden foe!", "moves quickly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/5),//
						//6 = Beta
						new MonsterData(370, "03*X", "03*X", new String[]{"Ninja"}, new String[]{"Ninja"}, 
								/*MHP*/0, 0, 0, 2, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "A hidden foe!", new String[]{"A hidden foe!", "Wears a headband"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//
						//7 = 7th   
				};
			}
			
			//
			
			//Warlock
				//Evil Warlock
			else if(MonsterNo == 373){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(373, "111X", "373", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "An evil person", new String[]{"An evil person", "Wears black"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(373, "04*X", "04*X", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "An evil person", new String[]{"An evil person", "does dark magic!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//2 = Easy Mode
						new MonsterData(373, "04*X", "04*X", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "An evil person", new String[]{"An evil person", "mumbles incantations!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//3 = Hard Mode
						new MonsterData(373, "04*X", "04*X", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "An evil person", new String[]{"An evil person", "even looks evil"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//4 = Other Story
						new MonsterData(373, "Human", "Human", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "Pure Evil!", new String[]{"Pure evil!", "must be stopped"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//5 = Glitch
						new MonsterData(373, "04*X", "04*X", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "An evil person", new String[]{"An evil person", "unnatural skin color"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//6 = Beta
						new MonsterData(373, "04*X", "04*X", new String[]{"Evil Warlock"}, new String[]{"EvilWrlock"}, 
								/*MHP*/0, 0, 0, 3, 9, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/6, 14, 
								/*MDef*/0, 0, 0, 8, 1, "An evil person", new String[]{"An evil person", "they seem... determined"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//
						//7 = 7th   
				};
			}
			
			//
			//Catapult
				//Gatling
			else if(MonsterNo == 376){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(376, "112X", "376", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "Person with weapon", new String[]{"Person with weapon", "wears pink"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(376, "05*X", "05*X", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "Person with weapon", new String[]{"Person with weapon", "A kind of crossbow?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//2 = Easy Mode
						new MonsterData(376, "05*X", "05*X", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "Person with weapon", new String[]{"Person with weapon", "flunkie of Sakura Don"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//3 = Hard Mode
						new MonsterData(376, "05*X", "05*X", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "Person with weapon", new String[]{"Person with weapon", "has a hat"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//4 = Other Story
						new MonsterData(376, "Human", "Human", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "What is that?", new String[]{"A crossbow?", "Sort of?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//5 = Glitch
						new MonsterData(376, "05*X", "05*X", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "Person with weapon", new String[]{"Person with weapon", "seems normal"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//6 = Beta
						new MonsterData(376, "05*X", "05*X", new String[]{"Gatling"}, new String[]{"Gatling"}, 
								/*MHP*/0, 0, 0, 7, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/5, 7, 
								/*MDef*/0, 0, 1, 0, 1, "Person with weapon", new String[]{"Person with weapon", "a criminal?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//
						//7 = 7th   
				};
			}
			
			//
			//Pos Logger
				//Compass Rose
			else if(MonsterNo == 379){//TestBoss
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(379, "113X", "379", new String[]{"Compass Rose"}, new String[]{"CompssRose"}, 
								/*MHP*/0, 0, 1, 0, 9, 1, 
								/*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/0, 0, 
								/*MDef*/0, 0, 0, 7, 1, "Plant like monster", new String[]{"Plant like monster", "Green and gold"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(379, "06*X", "06*X", new String[]{"Compass Rose"}, new String[]{"CompssRose"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Plant like monster", new String[]{"Plant like monster", "part metal?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(379, "06*X", "06*X", new String[]{"Compass Rose"}, new String[]{"CompssRose"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Plant like monster", new String[]{"Plant like monster", "top is a compass"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(379, "06*X", "06*X", new String[]{"Compass Rose"}, new String[]{"CompssRose"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Plant like monster", new String[]{"Plant like monster", "Seems unnatural"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(379, "???X", "???X", new String[]{"Compass Rose"}, new String[]{"CompssRose"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "So many vines!", new String[]{"So many vines!", "gotta not trip!"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(379, "06*X", "06*X", new String[]{"Compass Rose"}, new String[]{"CompssRose"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Plant like monster", new String[]{"Plant like monster", "attacks with vines"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(379, "06*X", "06*X", new String[]{"Compass Rose"}, new String[]{"CompssRose"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Plant like monster", new String[]{"Plant like monster", "Shows direction"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//Victory Sword
				//Victory Blade
			else if(MonsterNo == 382){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(382, "114X", "382", new String[]{"Victory Blade"}, new String[]{"VctryBlade"}, 
								/*MHP*/0, 0, 5, 0, 15, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 0, 6, 1, "weapon monster", new String[]{"weapon monster", "gold and black"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{3, 10, 5},{3, 10, 5}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(382, "07*X", "07*X", new String[]{"Victory Blade"}, new String[]{"VctryBlade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "weapon monster", new String[]{"weapon monster", "has red gem"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(382, "07*X", "07*X", new String[]{"Victory Blade"}, new String[]{"VctryBlade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "weapon monster", new String[]{"weapon monster", "has fancy pommel"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(382, "07*X", "07*X", new String[]{"Victory Blade"}, new String[]{"VctryBlade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "weapon monster", new String[]{"weapon monster", "normal looking guard"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(382, "B??X", "B??X", new String[]{"Victory Blade"}, new String[]{"VctryBlade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "It's goldish", new String[]{"It's golden", "Looks fancy"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(382, "07*X", "07*X", new String[]{"Victory Blade"}, new String[]{"VctryBlade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "weapon monster", new String[]{"weapon monster", "seems curved"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(382, "07*X", "07*X", new String[]{"Victory Blade"}, new String[]{"VctryBlade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "weapon monster", new String[]{"weapon monster", "flies around"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//Blue Candle
				//Green Candle
			else if(MonsterNo == 385){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(385, "115X", "385", new String[]{"Green Candle"}, new String[]{"GreenCandl"}, 
								/*MHP*/0, 0, 0, 5, 15, 1, 
								/*MAtk*/0, 0, 1, 8, 1, /*MAtkElements*/6, 15, 
								/*MDef*/0, 0, 0, 6, 1, "A floating candle", new String[]{"A floating candle", "It's green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/0.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/50),//
						//1 = Normal Mode
						new MonsterData(385, "08*X", "08*X", new String[]{"Green Candle"}, new String[]{"GreenCandl"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 15, 
								/*MDef*/9, 9, 9, 9, 1, "A floating candle", new String[]{"A floating candle", "has black flame"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(385, "08*", "08*X", new String[]{"Green Candle"}, new String[]{"GreenCandl"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 15, 
								/*MDef*/9, 9, 9, 9, 1, "A floating candle", new String[]{"A floating candle", "hovers ominously"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(385, "08*X", "08*X", new String[]{"Green Candle"}, new String[]{"GreenCandl"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 15, 
								/*MDef*/9, 9, 9, 9, 1, "A floating candle", new String[]{"A floating candle", "doesn't drip"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(385, "?Gh?X", "?Gh?X", new String[]{"Green Candle"}, new String[]{"GreenCandl"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 15, 
								/*MDef*/9, 9, 9, 9, 1, "Black fire?", new String[]{"Has black fire?", "That's not good!"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(385, "08*X", "08*X", new String[]{"Green Candle"}, new String[]{"GreenCandl"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 15, 
								/*MDef*/9, 9, 9, 9, 1, "A floating candle", new String[]{"A floating candle", "looks melty"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(385, "08*X", "08*X", new String[]{"Green Candle"}, new String[]{"GreenCandl"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 15, 
								/*MDef*/9, 9, 9, 9, 1, "A floating candle", new String[]{"A floating candle", "Has glitch aura"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//Barrier
				//Aura
			else if(MonsterNo == 388){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(388, "116X", "388", new String[]{"Aura"}, new String[]{"Aura"}, 
								/*MHP*/0, 0, 0, 5, 15, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 1, 6, 1, "Monsterless aura?", new String[]{"Monsterless aura?", "It's blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(388, "09*X", "09*X", new String[]{"Aura"}, new String[]{"Aura"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Monsterless aura?", new String[]{"Monsterless aura?", "How?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(388, "09*X", "09*X", new String[]{"Aura"}, new String[]{"Aura"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Monsterless aura?", new String[]{"Monsterless aura?", "Weird"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(388, "09*X", "09*X", new String[]{"Aura"}, new String[]{"Aura"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Monsterless aura?", new String[]{"Monsterless aura?", "Seems to have power?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(388, "?Gh?X", "?Gh?X", new String[]{"Aura"}, new String[]{"Aura"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "What is it?", new String[]{"I see a glow", "Is that all?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(388, "09*X", "09*X", new String[]{"Aura"}, new String[]{"Aura"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Monsterless aura?", new String[]{"Monsterless aura?", "Protects?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(388, "09*X", "09*X", new String[]{"Aura"}, new String[]{"Aura"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Monsterless aura?", new String[]{"Monsterless aura?", "an odd monster"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//Shield
				//Barricade
			else if(MonsterNo == 391){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(391, "117X", "391", new String[]{"Barricade"}, new String[]{"Barricade"}, 
								/*MHP*/0, 0, 0, 5, 15, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/5, 0, 
								/*MDef*/0, 0, 1, 6, 1, "A wall of wood", new String[]{"A wall of wood", "It's tan"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(391, "10*X", "10*X", new String[]{"Barricade"}, new String[]{"Barricade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "A wall of wood", new String[]{"A wall of wood", "it's rectangular"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(391, "10*X", "10*X", new String[]{"Barricade"}, new String[]{"Barricade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "A wall of wood", new String[]{"A wall of wood", "It's tall"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(391, "10*X", "10*X", new String[]{"Barricade"}, new String[]{"Barricade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "A wall of wood", new String[]{"A wall of wood", "can't see the back"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(391, "?A?X", "?A?X", new String[]{"Barricade"}, new String[]{"Barricade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Just a wall?", new String[]{"Looks like a wall", "Just a wall?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(391, "10*X", "10*X", new String[]{"Barricade"}, new String[]{"Barricade"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "A wall of wood", new String[]{"A wall of wood", "seems to move"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(391, "10*X", "10*X", new String[]{"Wall"}, new String[]{"Wall"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 0, 
								/*MDef*/9, 9, 9, 9, 1, "A wall of wood", new String[]{"A wall of wood", "a monster?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//Hyper Armor
				//Aura Plate
			else if(MonsterNo == 394){
				MInfo  = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(394, "118X", "394", new String[]{"Aura Plate"}, new String[]{"Aura Plate"}, 
								/*MHP*/0, 0, 0, 5, 15, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/4, 0, 
								/*MDef*/0, 0, 0, 6, 1, "Armor like foe", new String[]{"Armor like foe", "It's orange"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(394, "11*X", "11*X", new String[]{"Aura Plate"}, new String[]{"Aura Plate"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Armor like foe", new String[]{"Armor like foe", "Filled with energy"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(394, "11*X", "11*X", new String[]{"Aura Plate"}, new String[]{"Aura Plate"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Armor like foe", new String[]{"Armor like foe", "Has horns"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(394, "11*X", "11*X", new String[]{"Aura Plate"}, new String[]{"Aura Plate"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Armor like foe", new String[]{"Armor like foe", "Has a sword"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(394, "A??X", "A??X", new String[]{"Aura Plate"}, new String[]{"Aura Plate"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Seems powerful!", new String[]{"Seems powerful", "Is it?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(394, "11*X", "11*X", new String[]{"Aura Plate"}, new String[]{"Aura Plate"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Armor like foe", new String[]{"Armor like foe", "Medium sized"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(394, "11*X", "11*X", new String[]{"Aura Plate"}, new String[]{"Aura Plate"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Armor like foe", new String[]{"Armor like foe", "average speed"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			//Arm0r
				//Brittle Armor
			else if(MonsterNo == 397){
				MInfo = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(397, "119X", "397", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"}, 
								/*MHP*/0, 5, 0, 4, 15, 1, 
								/*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/4, 18, 
								/*MDef*/0, 0, 0, 6, 1, "Seems brittle", new String[]{"Seems brittle", "Gray green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(397, "12*X", "12*X", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 18, 
								/*MDef*/9, 9, 9, 9, 1, "Seems brittle", new String[]{"Seems brittle", "has holes"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(397, "12*X", "12*X", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 18, 
								/*MDef*/9, 9, 9, 9, 1, "Seems brittle", new String[]{"Seems brittle", "may not be?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(397, "12*X", "12*X", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 18, 
								/*MDef*/9, 9, 9, 9, 1, "Seems brittle", new String[]{"Seems brittle", "Looks damaged"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(397, "A??X", "A??X", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 18, 
								/*MDef*/9, 9, 9, 9, 1, "Looks corroded?", new String[]{"Looks all...", "corroded looking"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(397, "12*X", "12*X", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 18, 
								/*MDef*/9, 9, 9, 9, 1, "Seems brittle", new String[]{"Seems brittle", "missing bits"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(397, "12*X", "12*X", new String[]{"Brittle Armor"}, new String[]{"BrttlArmor"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/4, 18, 
								/*MDef*/9, 9, 9, 9, 1, "Seems brittle", new String[]{"Seems brittle", "looks corroded"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//01000010 01101001 01101110 01100001 01110010 01111001
				//48 65 78 63 6f 64 65
			else if(MonsterNo == 400){
				MInfo  = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(400, "120X", "400", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"}, 
								/*MHP*/1, 1, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 0, 1, /*MAtkElements*/6, 17, 
								/*MDef*/0, 0, 0, 0, 1, "77 68 61 74", new String[]{"6e 65 78 74", "20 61 6c 6c 79"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/5.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/5.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(400, "13*X", "13*X", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 17, 
								/*MDef*/9, 9, 9, 9, 1, "77 68 61 74", new String[]{"6e 65 78 74", "65 6e 65 6d 79"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(400, "13*X", "13*X", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 17, 
								/*MDef*/9, 9, 9, 9, 1, "77 68 61 74", new String[]{"6e 65 78 74", "71 75 65 73 74"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(400, "13*X", "13*X", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 17, 
								/*MDef*/9, 9, 9, 9, 1, "77 68 61 74", new String[]{"6e 65 78 74", "67 6c 69 74 63 68"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/4, /*StatusC*/10),// 
						//4 = Other Story
						new MonsterData(400, "???X", "???X", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 17, 
								/*MDef*/9, 9, 9, 9, 1, "What is this?", new String[]{"Looks...", "complicated"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(400, "13*X", "13*X", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 17, 
								/*MDef*/9, 9, 9, 9, 1, "77 68 61 74", new String[]{"6e 65 78 74", "70 6c 61 63 65"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(400, "13*X", "13*X", new String[]{"48 65 78 63 6f 64 65"}, new String[]{"48 65 78"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/6, 17, 
								/*MDef*/9, 9, 9, 9, 1, "77 68 61 74", new String[]{"6e 65 78 74", "73 65 61 72 63 68 20"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}
			
			//The Echo
			else if(MonsterNo == 403){
				MInfo  = new MonsterData[]{
						//0 = Cutscene Quest
						new MonsterData(403, "121X", "403", new String[]{"The Echo"}, new String[]{"TheEcho"}, 
								/*MHP*/1, 1, 1, 5, 9, 1, 
								/*MAtk*/0, 0, 0, 0, 1, /*MAtkElements*/0, 0, 
								/*MDef*/0, 0, 0, 0, 1, "Undead monster", new String[]{"It's blue", "lots of blue"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/5.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/5.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//
						//1 = Normal Mode
						new MonsterData(403, "13*X", "13*X", new String[]{"The Echo"}, new String[]{"TheEcho"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Undead monster", new String[]{"Undead? Ghost?", "It's transparent"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//2 = Easy Mode
						new MonsterData(403, "13*X", "13*X", new String[]{"The Echo"}, new String[]{"TheEcho"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Undead monster", new String[]{"Ghost maybe?", "Has an aura"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//3 = Hard Mode
						new MonsterData(403, "13*X", "13*X", new String[]{"The Echo"}, new String[]{"TheEcho"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Undead monster", new String[]{"makes noise", "sounds far away"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//4 = Other Story
						new MonsterData(403, "???X", "???X", new String[]{"The Echo"}, new String[]{"TheEcho"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "It's clearish?", new String[]{"Looks...", "freaky!"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//5 = Glitch
						new MonsterData(403, "13*X", "13*X", new String[]{"The Echo"}, new String[]{"TheEcho"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Undead monster", new String[]{"looks...", "blurry"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),// 
						//6 = Beta
						new MonsterData(403, "13*X", "13*X", new String[]{"Undying"}, new String[]{"Undying"},
								/*MHP*/9, 9, 9, 9, 9, 1, 
								/*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/0, 0, 
								/*MDef*/9, 9, 9, 9, 1, "Undead monster", new String[]{"has a pattern", "of lines"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, 
								/*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
				};
			}


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