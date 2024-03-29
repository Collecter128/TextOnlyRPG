package textonlyrpg;

public class MonsterData {
	public int MonsterID = 000;
	public String DisplayNo1 = "00";
	public String DisplayNo2 = "000";
	public String[] MonsterName = {"TestMonster1"};
	public String[] MonsterShortName = {"TestMnstr1"};
	int MHp1 = 0;
	int MHp2 = 0;
	int MHp3 = 0;
	int MHp4 = 5;
	int MHpMax = 9;
	int HpType = 1;
		//0 = Null HP
		//1 = Normal
		//2 = Glitch HP
		//3 = NORMAL HP
		//4 = Corrosion HP
		//5 = Mystery/Unknown HP
	int MAtk1 = 0;
	int MAtk2 = 0;
	int MAtk3 = 0;
	int MAtk4 = 8;
	int AtkType = 1;
		//1 = Normal
		//Pierce
		//Speed Attacks X2
	int AttackElement1 = 0;//Physical Type
	int AttackElement2 = 0;//Element Type
	int MDef1 = 0;
	int MDef2 = 0;
	int MDef3 = 0;
	int MDef4 = 6;
	int DefType = 1;
		//1 = Normal
	public String MDescription = "TestMonster1";//Description?
	String[] AdminText = {"Kind of like...", "a slime?"};
	//String MType = "TypeA/TypeB";//? Like, type "Slime Golem" or type Normal/Flying...
	int MSpeed = 100;
	int Drop1; //after description?
	int Drop1Percent;
	int Exp;
	int MoneyDrop;
	int MoneyChance;
	static int i = 0;
	double[] Weakness;
		//0 Unarmed
		//1 Weapon
		//2 Bomb
	
		//0 = Unarmed
		//1 = Sword
		//2 = Lance
		//3 = Hammer
		//4 = Axe
		//5 = Pole
		//6 = Bomb??
		//7 = Fire
		//8 = Water
		//9 = Wind
		//10 = Earth
		//11 = Electric
		//12 = Ice
		//13 = Light
		//14 = Dark
		//15 = G1(Glitch)
		//16 = G2(Null)
		//17 = G3(Unnamed(MysteryElement)
		//18 = G4(Corrupt-Glitch)
		//19 = G5(Admin)
		//20 = G6(ALL)
	int[] WeaknessType;
		//0 Multiply Regular type
		//1 Physical Only attacks
		//2 Elemental Only attacks
		//3 Absorb: Absorbs all attack as health!
		//4 Pierce 
		//5 Add/Subtract "Bonus Damage/Recover"
		//6 Deflect
		//7 Counter!
	
		//Physical Attacks only (Non Elemental)
		//Elemental Attacks Only
		//Peirce! Avoids Defence
		//Absorb Recovers Health depending on how much damage dealt
		//Counter! Counterattacks the player after recieving damage
		//Deflect: Bounces damage back at the player without damaging the monster
	String[] WeaknessDisplay = {"", ""};
	int[][] BattleEventChanceType; //Type, Chance, ExtraData
		//0 No Event/Null Event
		//1 Summon another enemy
		//2 Special Attack
		//3 Recover Health
		//4 Poison Player
	
	//0 = No Event/Null Event
	//1 = Summon Enemy
	//Prismatic Def
	//Attack Twice
	//Special Attack
	//Recover
	//Inflict Negative Status
	//Erase Element
	//Break Weapon
	//Snow Storm
	//Drop Money
	//Activate Cutscene
	//Escape
	int[] BattleEventInfo2;
	int CriticalChance = 0;
	int DodgeChance = 0;
	int NegativeStatus = 0;
	int StatusChance = 0;
	
	int[] DefendPowers; //OtherMonster, Power, Target
	
	public MonsterData(int MonsterID, String DisplayNo, String DisplayNo2, String[] MonsterName, String[] MonsterShortName, int MHp1, int MHp2, int MHp3, int MHp4, int HPDigetMax, int HpType, int MAtk1, int MAtk2, int MAtk3, int MAtk4, int AtkType, int AtkElement1, int AtkElement2, int MDef1, int MDef2, int MDef3, int MDef4, int DefType, String MDescription, String[] AdminDesc,  int MSpeed, int Drop1, int Drop1Percent, int Exp, int MoneyDrop, int MoneyChance, double[] Weakness, int[] WeaknessType, String[] WeaknessDisp, int[][] BattleEventChanceType, int CriticalC, int DodgeC, int Status, int StatusC){
		this.MonsterID = MonsterID;
		this.DisplayNo1 = DisplayNo;
		this.DisplayNo2 = DisplayNo2;
		this.MonsterName = MonsterName;
		this.MonsterShortName = MonsterShortName;
		this.MHp1 = MHp1;
		this.MHp2 = MHp2;
		this.MHp3 = MHp3;
		this.MHp4 = MHp4;
		this.MHpMax = HPDigetMax;
		this.HpType = HpType;
		this.MAtk1 = MAtk1;
		this.MAtk2 = MAtk2;
		this.MAtk3 = MAtk3;
		this.MAtk4 = MAtk4;
		this.AtkType = AtkType;
		this.AttackElement1 = AtkElement1;
		this.AttackElement2 = AtkElement2;
		this.MDef1 = MDef1;
		this.MDef2 = MDef2;
		this.MDef3 = MDef3;
		this.MDef4 = MDef4;
		this.DefType = DefType;
		this.MDescription = MDescription;
		this.AdminText = AdminDesc;
		this.MSpeed = MSpeed;
		this.Drop1 = Drop1;
		this.Drop1Percent = Drop1Percent;
		this.Exp = Exp;
		this.MoneyDrop = MoneyDrop;
		this.MoneyChance = MoneyChance;
		this.Weakness = Weakness;
		this.WeaknessType = WeaknessType;
		this.WeaknessDisplay = WeaknessDisp;
		this.BattleEventChanceType = BattleEventChanceType;
		this.CriticalChance = CriticalC;
		this.DodgeChance = DodgeC;
		this.NegativeStatus = Status;
		this.StatusChance = StatusC;
	}
	
	public int getMonsterID(){
		return MonsterID;
	}
	
	public String getMonsterName(int Var){
		return MonsterName[Var];
	}
	public String getMonsterShortName(int Var){
		return MonsterShortName[Var];
	}
	
	public String getMDescription(){
		return MDescription;
	}
	
	public int getMHP1(){
		return MHp1;
	}
	public int getMHP2(){
		return MHp2;
	}
	public int getMHP3(){
		return MHp3;
	}
	public int getMHP4(){
		return MHp4;
	}
	public int getHPType(){
		return HpType;
	}
	
	public int getMATK1(){
		return MAtk1;
	}
	public int getMATK2(){
		return MAtk2;
	}
	public int getMATK3(){
		return MAtk3;
	}
	public int getMATK4(){
		return MAtk4;
	}
	public int getATKType(){
		return AtkType;
	}
	
	public int getMDEF1(){
		return MDef1;
	}
	public int getMDEF2(){
		return MDef2;
	}
	public int getMDEF3(){
		return MDef3;
	}
	public int getMDEF4(){
		return MDef4;
	}
	public int getDEFType(){
		return DefType;
	}
	
	public int getDrop1(){
		return Drop1;
	}
	public int getDrop1Percent(){
		return Drop1Percent;
	}
	
	public int getEXP(){
		return Exp;
	}
	
	public int getMONEYDROP(){
		return MoneyDrop;
	}
	public int getMONEYCHANCE(){
		return MoneyChance;
	}
	

//TODO Class starts here
	public static MonsterData MData(int MonsterNo, int Var){
		//MonsterData[] AllMData = new MonsterData[] {new MonsterData(0, "", "Defaulter", /*MHP*/9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MDef*/9, 9, 9, 9, 1, "...", /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.5}, /*WeaknessType*/new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{0, 0, 0},{0, 0, 0}})};
			//0 = Cutscene Quest
				MonsterData MInfo[] = new MonsterData[]{
						new MonsterData(0, "[]", "0", new String[]{"Defaulter"}, new String[]{"Defaulter"},
								/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
								"...", new String[]{"A floating cube", "It's blackish"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
								/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
								/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};// 
				if(Var == 1){//Normal
					MInfo = new MonsterData[]{
							new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"...", new String[]{"A black box?", "slightly shiny"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 2){//Easy
					MInfo = new MonsterData[]{
							new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"...", new String[]{"A black box?", "more like a cube"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 3){//Hard
					MInfo = new MonsterData[]{
							new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"...", new String[]{"A black box?", "not reflective"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 4){//Other
					MInfo = new MonsterData[]{
							new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A black cube?", new String[]{"It's a cube?", "What is it?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 5){//Glitch
					MInfo = new MonsterData[]{
							new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"...", new String[]{"A black box?", "It's large"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 6){//Beta
					MInfo = new MonsterData[]{
							new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"...", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
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
			
			if(MonsterNo > 0 && MonsterNo <= 108){
				if(MonsterNo%3 == 1){
					//System.out.println("This is the enemy number" + MonsterNo);
					//System.out.println("This is the enemy value" + MonsterNo%3);
					MInfo = new MonsterData[]{MonsterData01.MData01(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 2){
					MInfo = new MonsterData[]{MonsterData01X.MData01X(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 0){
					MInfo = new MonsterData[]{MonsterData01R.MData01R(MonsterNo, Var),
						};
				}
				
			}//Monsters 0-108
			
			if(MonsterNo > 108 && MonsterNo <= 216){
				if(MonsterNo%3 == 1){
					//System.out.println("This is the enemy number" + MonsterNo);
					//System.out.println("This is the enemy value" + MonsterNo%3);
					MInfo = new MonsterData[]{MonsterData02.MData(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 2){
					MInfo = new MonsterData[]{MonsterData02X.MData(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 0){
					MInfo = new MonsterData[]{MonsterData02R.MData(MonsterNo, Var),
						};
				}
				
			}//Monsters 109-216
			
			if(MonsterNo > 216 && MonsterNo <= 324){
				if(MonsterNo%3 == 1){
					//System.out.println("This is the enemy number" + MonsterNo);
					//System.out.println("This is the enemy value" + MonsterNo%3);
					MInfo = new MonsterData[]{MonsterData03.MData(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 2){
					MInfo = new MonsterData[]{MonsterData03X.MData(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 0){
					MInfo = new MonsterData[]{MonsterData03R.MData(MonsterNo, Var),
						};
				}
				
			}//Monsters 216-324
			
			if(MonsterNo > 324 && MonsterNo <= 357){
				if(MonsterNo%3 == 1){
					//System.out.println("This is the enemy number" + MonsterNo);
					//System.out.println("This is the enemy value" + MonsterNo%3);
					MInfo = new MonsterData[]{MonsterData0Test.MData(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 2){
					MInfo = new MonsterData[]{MonsterData0TestX.MData(MonsterNo, Var),
						};
				}
				if(MonsterNo%3 == 0){
					MInfo = new MonsterData[]{MonsterData0TestR.MData(MonsterNo, Var),
						};
				}
				
			}//Monsters 324-357
			
			if(MonsterNo == 358){
				MInfo = new MonsterData[]{
						new MonsterData(358, "FF", "358", new String[]{"FF"}, new String[]{"FF"},
								/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
								"FFFF", new String[]{"A floating Square", "It's black"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
								/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
								/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};// 
				if(Var == 1){//Normal
					MInfo = new MonsterData[]{
							new MonsterData(358, "FF", "FF", new String[]{"FF"}, new String[]{"FF"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"FFFF", new String[]{"A black box?", "Not shiny"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 2){//Easy
					MInfo = new MonsterData[]{
							new MonsterData(358, "FF", "FF", new String[]{"FF"}, new String[]{"FF"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"FFFF", new String[]{"A black box?", "It's so flat"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 3){//Hard
					MInfo = new MonsterData[]{
							new MonsterData(358, "FF", "FF", new String[]{"FF"}, new String[]{"FF"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"FFFF", new String[]{"A black box?", "not reflective"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 4){//Other
					MInfo = new MonsterData[]{
							new MonsterData(358, "FF", "FF", new String[]{"FF"}, new String[]{"FF"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A black square?", new String[]{"It's a box??", "A monster?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 5){//Glitch
					MInfo = new MonsterData[]{
							new MonsterData(358, "FF", "FF", new String[]{"FF"}, new String[]{"FF"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"FFFF", new String[]{"A black box?", "It's large"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 6){//Beta
					MInfo = new MonsterData[]{
							new MonsterData(358, "FF", "FF", new String[]{"FF"}, new String[]{"FF"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"FFFF", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
			}//End of if Monster 358
			
			if(MonsterNo == 359){
				MInfo = new MonsterData[]{
						new MonsterData(359, "<>", "358", new String[]{"Gamebox"}, new String[]{"Gamebox"},
								/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
								"A boxy machine?", new String[]{"Some kind of box", "It's green and purple"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
								/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
								/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
				};// 
				if(Var == 1){//Normal
					MInfo = new MonsterData[]{
							new MonsterData(359, "<>", "<>", new String[]{"Gamebox"}, new String[]{"Gamebox"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A boxy machine?", new String[]{"Some kind of box", "a puzzle?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 2){//Easy
					MInfo = new MonsterData[]{
							new MonsterData(359, "<>", "<>", new String[]{"Gamebox"}, new String[]{"Gamebox"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A boxy machine?", new String[]{"Some kind of box", "has fancy design"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 3){//Hard
					MInfo = new MonsterData[]{
							new MonsterData(359, "<>", "<>", new String[]{"Gamebox"}, new String[]{"Gamebox"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A boxy machine?", new String[]{"Some kind of box", "rectangular"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 4){//Other
					MInfo = new MonsterData[]{
							new MonsterData(359, "<>", "<>", new String[]{"Gamebox"}, new String[]{"Gamebox"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A box?", new String[]{"It's a box??", "A monster?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 5){//Glitch
					MInfo = new MonsterData[]{
							new MonsterData(359, "<>", "<>", new String[]{"Gamebox"}, new String[]{"Gamebox"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A boxy machine?", new String[]{"Some kind of box", "It's large"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
				if(Var == 6){//Beta
					MInfo = new MonsterData[]{
							new MonsterData(359, "<>", "<>", new String[]{"Gamebox"}, new String[]{"Gamebox"},
									/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, 
									"A boxy machine?", new String[]{"Some kind of box", "No openings?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, 
									/*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, 
									/*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
					};// 
				}
			}//End of if Monster 359
			


		}
		return MInfo[0];//Var
	}
	public static MonsterData[] MInfo(int[] Monster1, int Gamemode){
		int MTotal = MTotal(Monster1);
		MonsterData[] MData = new MonsterData[MTotal];{
			int i = 0;
			int Total = 0;
			while(i < Monster1.length){
				//MData[i] = new MonsterData(0, "", "", new String[]{"Defaulter"}, new String[]{"Defaulter"}, /*MHP*/9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"looks like a black box?", ""}, /*MSpeed*/100, /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);// 
				if(Monster1[i] == 1){
					MData[Total] = MData(i, Gamemode); 
					Total = Total + 1;

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
	}//MInfo End
	
	public static MonsterData[] MInfoList(int[] Monster1, int Gamemode){
		int MTotal = MTotal(Monster1);
		MonsterData[] MData = new MonsterData[MTotal];{
			int i = 0;
			int Total = 0;
			while(i < Monster1.length){
				//MData[i] = new MonsterData(0, "", "", new String[]{"Defaulter"}, new String[]{"Defaulter"}, /*MHP*/9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"looks like a black box?", ""}, /*MSpeed*/100, /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);// 
				if(Monster1[i] == 1){
					MData[Total] = MData(i, Gamemode); 
					Total = Total + 1;
//					//if(i == 0){//Defualter
					//	
					//}
					//if(i >= 1 && i <= limit1){//First Set
//						if(Monster1[]%3 == 1){
//							MonsterData01.MData01(i, 0);
							//Total = Total + 1;
//						}
						//if(Monster1[]%3 == 2){
//							MonsterData01X.MData01X(i, 0);
							//Total = Total + 1;
//						//}
						//if(Monster1[]%3 == 0){
//							MonsterData01R.MData01R(i, 0);
							//Total = Total + 1;
//						}
					//]
					//if(i >= 1 && i <= limit1){//Second Set
//						if(Monster1[]%3 == 1){
//							MonsterData02.MData(i, 0);
							//Total = Total + 1;
//						}
						//if(Monster1[]%3 == 2){
//							MonsterData02X.MData(i, 0);
							//Total = Total + 1;
//						//}
						//if(Monster1[]%3 == 0){
//							MonsterData02R.MData(i, 0);
							//Total = Total + 1;
//						}
					//]
					//if(i >= 1 && i <= limit1){//ThirdSet
//						if(Monster1[]%3 == 1){
//							MonsterData03.MData(i, 0);
						//Total = Total + 1;
//						}
						//if(Monster1[]%3 == 2){
//							MonsterData03X.MData(i, 0);
					//Total = Total + 1;
//						//}
						//if(Monster1[]%3 == 0){
//							MonsterData03R.MData(i, 0);
					//Total = Total + 1;
//						}
					//]
					//if(i >= 1 && i <= limit1){//Test Enemies
//						if(Monster1[]%3 == 1){
//							MonsterData0Test.MData(i, 0);
					//Total = Total + 1;
//						}
						//if(Monster1[]%3 == 2){
//							MonsterData0TestX.MData(i, 0);
					//Total = Total + 1;
//						//}
						//if(Monster1[]%3 == 0){
//							MonsterData0TestR.MData(i, 0);
					//Total = Total + 1;
//						}
					//]
					//if(i >= 1 && i <= limit1){//Extra Enemies
//						if(Monster1[]%3 == 1){
//							MonsterData0X.MData(i, 0);
					//Total = Total + 1;
//						}
						//if(Monster1[]%3 == 2){
//							MonsterData0XX.MData(i, 0);
					//Total = Total + 1;
//						//}
						//if(Monster1[]%3 == 0){
//							MonsterData0XR.MData(i, 0);
					//Total = Total + 1;
//						}
					//]
					//if(i == ???){
					//	
					//}
					//if(i == ???){
					//	
					//}
				i = i + 1;
			}
			
			
			//if(Monster1[0] == 0){ Sword -> Blade -> Coded Edge
			//	MData[Total] = new MonsterData(000, "00", "001", new String[]{"Blade"}, new String[]{"Blade"}, /*MHP*/0, 1, 5, 0, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large blade", "contains a red gem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);
			//}
			}
		}
		return MData;
	}//MInfo End

	
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