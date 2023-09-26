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
						new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},
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
//			
////			//000 Coded Edge Form2
////			if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Coded Edge Form X
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//010 Giant Jell
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				// Blue Giant Jell
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//020 Grand Phantasm
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Cursed Phantom
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//030 Statue
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Durable Statue
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//040 Mail
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Spiked Mail
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			//0*0<Doppleganger>
////			else  if(MonsterNo == 15){
////				MInfo  = new MonsterData[]{
////					//0 = Cutscene Quest
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//1 = Normal Mode
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//2 = Easy Mode
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//3 = Hard Mode
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//4 = Other Story
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//5 = Glitch
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//6 = Beta
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//7 = 7th   
////					new MonsterData(15, "13", "13", new String[]{"????????????"}, new String[]{"??????????"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Test
////				};
////			}
////				//Doppleganger
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////					//0 = Cutscene Quest
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//1 = Normal Mode
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//2 = Easy Mode
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//3 = Hard Mode
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//4 = Other Story
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//5 = Glitch
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//6 = Beta
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Test
////					//7 = 7th    
////					new MonsterData(15, "13S", "13S", new String[]{"Doppleganger"}, new String[]{"Dopplgangr"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"A black reflection!", "Defeat Thy shadow!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Test
////				};
////			}
////			
////			//100 Elec Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Lightning Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//110 Jell (Orange)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////				};
////			}
////				//Blue Jell (Dark Blue)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//120 Ghost Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Misty Ghost Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//130 Hard Golem Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Icy Golem Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//140 Metal Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Hard Metal Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//1*0 Recover/Healing Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Draining/Vampire Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//200 Wraith
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Light Wraith
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//210 Water Wrath
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Boiling Wrath
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//220 Specter
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Wight
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//230 Solid Shade
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				//Solid Air Shade
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////				};
////			}
////			
////			//240 Armored Shade
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////				// Time Shadow
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//2 = Easy Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//3 = Hard Mode
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//4 = Other Story
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//5 = Glitch
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//6 = Beta
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//7 = 7th    
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////				};
////			}
////			
////			//2*0 Tresspasser
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Invader
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//300 Steam Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Multi-Element Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//310 Slime Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Elec Slime Golem (Charged Slime golem?)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//320 Specter Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Shadey Golem   Beta Green Specter Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//330 Hard Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Harder Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//340 Heavy Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Dense Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//3*0 Hammer Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				// Double Hammer Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//400 Quick Plate
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Quicker Plate
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//410 Liquid Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Poison Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//420 Phantom Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Cursed Phantom Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//430 Heavy Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Heavy Earth Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//440 Dark Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//D. Armor (can summon Time Shadow?)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//4*0 E Guard
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//E Guardian (Defends others?)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*00 Pancaker
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Pancaker W. Syrup (Syrup Armor)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*10 Token Generator
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Token Multiplier
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*20 Static
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Mist
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*30 7 15 12 5 13
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Wall
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*40 M Guard
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//M Blocker
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//**0 Null Edge
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Erase Edge
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////TODO Start Here
//			//001 Coded Edge
//			else if(MonsterNo == 0){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "A Large Sword", new String[]{"A large metal sword", "contains two blue gems"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//1 = Normal Mode
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "floating point down"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//2 = Easy Mode
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "It's metallic gray"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//3 = Hard Mode
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "Has a W shaped guard"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//4 = Other Story
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"It's a sword?", "This is the boss?"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//5 = Glitch
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "It has an aura..."}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//6 = Beta
//						new MonsterData(000, "00", "001", new String[]{"Coded Edge"}, new String[]{"Coded Edge"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "contains two red gems"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//7 = 7th    ??? for "what is this" Ending
//						new MonsterData(000, "00", "001", new String[]{"???"}, new String[]{"???"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "It's the final boss?", new String[]{"some kind of object?", ""}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//				};
//				//return MInfo[Var];
//			}
////				//Coded Edge 1.5
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "00", "001", new String[]{"Coded Edge 1.5"}, new String[]{"CdedEdg1.5"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "contains purple gems"}, /*MSpeed*/100, /*ItemDrop?*/281, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//011 Giant Slime
//			else if(MonsterNo == 1){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant green slime", "It's transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//1 = Normal Mode
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant green slime", "It's bigger than me"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//2 = Easy Mode
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant green slime", "Similar to a slime"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//3 = Hard Mode
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant green slime", "Shiny like gelatin"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//4 = Other Story
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"It's a giant slime", "Why is it so big?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//5 = Glitch
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant green slime", "It's #57dd34"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//6 = Beta
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant slime", "It's green"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),//Boss Slime
//						//7 = 7th    
//						new MonsterData(1, "01", "011", new String[]{"Giant Slime"}, new String[]{"GiantSlime"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Larger Slime", new String[]{"A giant green slime", "A Slime Leader"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Boss Slime
//				};
//			}
////				//Giant Water Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(999, "??", "???", new String[]{"Giant Water Slime"}, new String[]{"GtWtrSlime"}, /*MHP*/0, 1, 5, 0, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "No Data", new String[]{"A large metal sword", "contains purple gems"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{1, 20, 1},{1, 20, 1}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////							//Hard Metal Slime
////						//7 = 7th    
////						
////				};
////			}
//			
//			//021 - Lesser Wraith
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Dark Ghost", new String[]{"A dark ghost!", "Like a cloak"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//1 = Normal Mode
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Dark Ghost", new String[]{"A dark Ghost!", "gives off darkness"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//2 = Easy Mode
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Dark Ghost", new String[]{"A dark ghost!", "has long claws"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//3 = Hard Mode
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Dark Ghost", new String[]{"A dark Ghost", "Mostly opaque"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//4 = Other Story
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Dark Ghost", new String[]{"A wraith!", "This is bad"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//5 = Glitch
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A Dark Ghost", new String[]{"A wraith", "It whispers"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//6 = Beta
//						new MonsterData(000, "02", "021", new String[]{"Wraith"}, new String[]{"Wraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A powerful dark spirit!", new String[]{"Cloaked in darkness", "It's blacker than night."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//7 = 7th    
//						new MonsterData(000, "02", "021", new String[]{"Lesser Wraith"}, new String[]{"LssrWraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A dark Ghost", new String[]{"A wraith", "larger than a ghost"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//				};
//			}
////				//Small Wraith
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//
//			//031 - Great Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A huge golem", "Made of brownish stone"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//1 = Normal Mode
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A huge golem", "larger than a golem"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//2 = Easy Mode
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A huge golem", "can lift a boulder"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//3 = Hard Mode
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A huge golem", "Made of uneven rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//4 = Other Story
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A giant golem", "Wait Seriously?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//5 = Glitch
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A huge golem", "made of rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//6 = Beta
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A golem with great strength!", new String[]{"Larger than normal golems", "Made of brownish stone"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
//						//7 = 7th    
//						new MonsterData(000, "03", "031", new String[]{"Great Golem"}, new String[]{"GreatGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A huge golem", new String[]{"A huge golem", "has a face of rocks"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//				};
//			}
////				//Great Earth Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//041 - Plate
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "04", "041", new String[]{"Plate"}, new String[]{"Plate"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "More dangerous than Armor", new String[]{"Sleaker than Armor", "it has no visible aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
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
////				//Gale Plate
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//0*1 - Null
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						//new MonsterData(000, "0*", "0*1", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
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
//						new MonsterData(15, "0*", "0*1", new String[]{"Doppleganger"}, new String[]{"Dpplganger"}, /*MHP*/0, 0, 2, 5, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/5, 0, /*MDef*/0, 0, 0, 3, 1, "NODATA", new String[]{"looks like ... you?", "Defeat Thyself!"}, /*MSpeed*/100, /*ItemDrop?*/281, 30, /*Exp*/0, /*Money*/3, 50, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Test
//						//7 = 7th    
//						
//				};
//			}
////				//<              >
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//101 - Great Slime
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						//new MonsterData(000, "10", "101", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
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
//						new MonsterData(000, "10", "101", new String[]{"Liquid Shadow"}, new String[]{"LquidShdow"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//						//7 = 7th    
//						
//				};
//			}
////				//Greater Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//111 - Slime
//			else if(MonsterNo == 2){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(2, "11", "111", new String[]{"Slime"}, new String[]{"Slime"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "A Normal Slime", new String[]{"A common green slime", "likes eating potions"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Slime
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
//				};
//			}
////				//Water Slime
////			else if(MonsterNo == 77){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(2, "11", "111", new String[]{"Water Slime"}, new String[]{"WaterSlime"}, /*MHP*/0, 0, 1, 7, 9, 1, /*MAtk*/0, 0, 0, 10, 1, /*MAtkElements*/1, 8, /*MDef*/0, 0, 0, 7, 1, "A blue Slime", new String[]{"the inside looks like", "flowing water"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Water Slime
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////							//Super Slime
////						//7 = 7th    
////						
////				};
////			}
//
//			//121 - Water Wraith
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "12", "121", new String[]{"Water Wraith"}, new String[]{"Wtr Wraith"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Living water monster", new String[]{"Dragon like in shape", "the eyes glow!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Raging Lake
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//131 - Golem Slime
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "13", "131", new String[]{"Golem Slime"}, new String[]{"GolemSlime"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A slime made of rocks!", new String[]{"Looks like rocks?", "looks brownish."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Molten Golem Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//141 - Armored Slime
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "14", "141", new String[]{"Armored Slime"}, new String[]{"ArmorSlime"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Covered with armor plates.", new String[]{"The armor is shiny,", "the slime is grey"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
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
////				//Armored Heat Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//1*1 - Sl1me
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "1*", "1*1", new String[]{"Sl1me"}, new String[]{"Sl1me"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Something is odd...", new String[]{"Looks almost normal", "almost..."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Potion
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//201 - Ghoul
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "20", "201", new String[]{"Ghoul"}, new String[]{"Ghoul"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Can eat poisonous things.", new String[]{"Similar to a ghost,", "it's covered with chains."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
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
////				//Dark Ghoul
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0),
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//
//			//211 - Ectoplasm
//			else if(MonsterNo == 3){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(3, "21", "211", new String[]{"Ectoplasm"}, new String[]{"Ectoplasm"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MAtk*/0, 0, 0, 5, 1, /*MAtkElements*/2, 0, /*MDef*/0, 0, 0, 5, 1, "A Low Level Ghost", new String[]{"floating blue/green energy", "looks like fire/mist"}, /*MSpeed*/100, /*ItemDrop?*/86, 40, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Ectplasm
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
//				};
//			}
////				//Will o Wisp
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//221 - Ghost
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "22", "221", new String[]{"Ghost"}, new String[]{"Ghost"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Beware it's long reach!", new String[]{"A tattered white robe", "filled with blackness"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Fire Ghost
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//231 - Possesed Earth
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "23", "231", new String[]{"Possesed Earth"}, new String[]{"PosesdEarth"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A ghost possesing rocks", new String[]{"Floating brownish rocks", "it looks like a storm."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Haunted Earth
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//241 - Possessed Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "24", "241", new String[]{"Possesed Armor"}, new String[]{"PosesdArmor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Animated by a ghost!", new String[]{"Less fancy than Armor", "Doesn't have much aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Haunted Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//2*1 - Gh0st
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "2*", "2*1", new String[]{"Gh0st"}, new String[]{"Gh0st"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Looks normal, moves oddly...", new String[]{"Something is different.", "Moves a little strangly"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//GHOST!
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//301 - Sand Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "30", "301", new String[]{"Sand Golem"}, new String[]{"Sand Golem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golem made of sand", new String[]{"Made of sand,", "Still golem shaped"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Pyramid Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//311 - Liquid Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "31", "311", new String[]{"Liquid Golem"}, new String[]{"Lqd Golem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Dangerous darkness enemy", new String[]{"Flows like water", "Shiny"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Mud Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//321 - Ghost Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "32", "321", new String[]{"Ghost Golem"}, new String[]{"GhostGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Golem made of misty material", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Wind Ghost Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//331 - Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "33", "331", new String[]{"Golem"}, new String[]{"Golem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A monster made of rocks.", new String[]{"Eats rocks/minerals", "Made of brownish rocks."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Earth Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//341 - Armored Golem
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "34", "341", new String[]{"ArmoredGolem"}, new String[]{"ArmrdGolem"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Re-enforced with metal armor!", new String[]{"A golem with armor", "It's brown and silvery"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Wind Armored Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//3*1 - G0l3m
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "3*", "3*1", new String[]{"G0l3m"}, new String[]{"G0l3m"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Has longer reach?", new String[]{"Looks like a golem?", "Looks strange somehow"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Golem Pieces
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//401 - Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "40", "401", new String[]{"Armor"}, new String[]{"Armor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Has an aura", new String[]{"Powerful silvery armor", "Has a purple aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Wind Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//411 - Slime Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						//new MonsterData(000, "41", "411", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
//						new MonsterData(000, "41", "411", new String[]{"Liquid Armor"}, new String[]{"LquidArmor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Slime like Armor", new String[]{"Shiny grey Armor", "Solid, but transparent"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//						//7 = 7th    
//						
//				};
//			}
////				//Water Slime Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//421 - Ghost Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "42", "421", new String[]{"Ghost Armor"}, new String[]{"GhostArmor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor with ghost power!", new String[]{"Transparent white armor", "Has ghostly powers!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Fire Ghost Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//431 - Golem Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "43", "431", new String[]{"Golem Armor"}, new String[]{"GolemArmor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor with golem toughness", new String[]{"Rock like armor", "brownish colored"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Earth Golem Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//441 - Armor Lv.0
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "44", "441", new String[]{"Armor Lv.0"}, new String[]{"Armor Lv.0"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Low powered Armor enemy", new String[]{"Same as Armor", "less powerful aura"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Normal Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//4*1 - Or Armor
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						//new MonsterData(000, "4*", "4*1", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
//						new MonsterData(000, "4*", "4*1", new String[]{"Armored Armor"}, new String[]{"ArmrdArmor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Armor wearing armor?", new String[]{"Surprisingly powerful!", "Wears armor."}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//						//7 = 7th    
//						
//				};
//			}
////				//Z Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//*01 - RNdm
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						//new MonsterData(000, "*0", "*01", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
//						new MonsterData(000, "*0", "*01", new String[]{"Pancaker"}, new String[]{"Pancaker"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "A... pancake golem?", new String[]{"It's a large golem", "made of pancakes?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//						//7 = 7th    
//						
//				};
//			}
////				//?????
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//*11 - Token Generator
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "*1", "*11", new String[]{"Token Generator"}, new String[]{"TknGenratr"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Generates Slimes", new String[]{"Machine like monster", "Sliver with green light"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Slime Presser
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//*21 - Pltrghst
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "*2", "*21", new String[]{"Pltrghst"}, new String[]{"Pltrghst"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Powerful Ghost monster!", new String[]{"Looks like...", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Strange Candle
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//*31 - G l m 
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "*3", "*31", new String[]{"G l m"}, new String[]{"G l m"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "Has longer reach than normal", new String[]{"Parts are missing?", "Some of it floats"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//Green GoLeM
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//*41 - R Arm
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						//new MonsterData(000, "*4", "*41", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
//						new MonsterData(000, "*4", "*41", new String[]{"Rusty Armor"}, new String[]{"RustyArmor"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
//						//7 = 7th    
//						
//				};
//			}
////				//Left Guantlet
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
//			//**1 - Glitch
//			else if(MonsterNo == 99){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(000, "**", "**1", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
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
////				//<Glitch>
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
////			//002 Ice Dragon
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Red Ice Dragon
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//012 Cold Jam
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Amber Cold Jam
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//022 Frozen Curse
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Freezing Curse
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//032 Gaint Statue
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Frozen Titan Statue
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//042 Coded Knight
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Coded Knight R
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//0*2 Frost Edge
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Frozen Edge
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//102 Liquid Shadow
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Dark Matter
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//112 Extra Rare Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Very Extra Rare Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//122 Transparent Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Stealth Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//132 Icicle Slime
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////							//Popsicle Slime?
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Purple Icicle Slime (Poison!)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//142 Armor Jell
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Jell Armored Jell
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//1*2 Jelly!
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				// Sticky Jelly! (sticky Curse)
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//202 Frozen Wraith
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Lich
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//212 Ectoplasm - Lv.9
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Will o Wisp Lv.9
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//222 Lingering Grudge
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Following Grudge
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//232 Ice Shadow
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Frozen Shadow
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//242 Cursed Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Forbiddon Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//2*2 Radio Static
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Wight Noise
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//302 Ice Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Black Ice Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//312 Magma Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Volcano Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//322 Chaotic Possesed Earth
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Chaotic Haunted Earth
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//332 Shiny Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Sparkling Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//342 Ore Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Crystal Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//3*2 Broken Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Breaker Golem
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//402 Coded Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Coded Armor S
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//412 River Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Lake Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//422 Mist Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Fog Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//432 Mountian Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Chasm Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//442 Money Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Treasure Armor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//4*2 Prototype Mech
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Prototype Mrk.2
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*02 Broken Sword
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Ruined Sword
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*12 Mad Subtractor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Poison Adder
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*22 Negative Image
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Mirror Image
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*32 Terra Cotta Warrier
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Super Fighting Terra Cotta
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//*42 D. A[]m[]r
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//DisArmor
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			
////			//**2 Unknown Enemy
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////				//Mystery Enemy
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			//TODO Test enemies are here
//			//TestSlime
//			else if(MonsterNo == 4){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(4, "01", "01", new String[]{"TestSlime"}, new String[]{"TestSlime"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster1", new String[]{"looks like a slime", "contains mechanics?"}, /*MSpeed*/100, /*ItemDrop?*/278, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestSlime
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
//				};
//			}
//			//Beta Enemy 01
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
//			
//			else if(MonsterNo == 5){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(5, "02", "02", new String[]{"TestGhost"}, new String[]{"TestGhost"}, /*MHP*/0, 0, 0, 2, 9, 1, /*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/2, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster2", new String[]{"looks like a ghost", "contains mechanics?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestGhost
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
//				};
//			}
//			
//			//
//			
//			
//			else if(MonsterNo == 6){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(6, "03", "03", new String[]{"TestGolem"}, new String[]{"TestGolem"}, /*MHP*/0, 0, 0, 3, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, /*MDef*/0, 0, 0, 8, 1, "TestMonster3", new String[]{"looks like a golem", "contains mechanics?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestGolem
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
//				};
//			}
//			
//			//
//			
//			else if(MonsterNo == 7){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(7, "04", "04", new String[]{"TestArmor"}, new String[]{"TestArmor"}, /*MHP*/0, 0, 0, 7, 9, 1, /*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/4, 0, /*MDef*/0, 0, 1, 0, 1, "TestMonster4", new String[]{"looks like armor", "contains mechanics?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestArmor
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
//				};
//			}
//			
//			//
//			
//			else if(MonsterNo == 8){//TestBoss
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(8, "05", "05", new String[]{"TestBoss"}, new String[]{"TestBoss"}, /*MHP*/0, 0, 1, 0, 9, 1, /*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 7, 1, "TestMonster5", new String[]{"Looks like...", "It's a boss!"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestBoss
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
//				};
//			}
//			else if(MonsterNo == 9){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(9, "06", "06", new String[]{"TestMonster6"}, new String[]{"TestMonster6"}, /*MHP*/0, 0, 5, 0, 15, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster6", new String[]{"Supposidly has", "HP powers"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{3, 10, 5},{3, 10, 5}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestEnemyHP Recover
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
//				};
//			}
//			else if(MonsterNo == 10){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(10, "07", "07", new String[]{"TestMonster7"}, new String[]{"TestMonster7"}, /*MHP*/0, 0, 0, 5, 15, 1, /*MAtk*/0, 0, 1, 8, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster7", new String[]{"Supposidly has", "Attack powers"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/0.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/1, /*StatusC*/50)//TestEnemyAttack Poison
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
//				};
//			}
//			else if(MonsterNo == 11){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(11, "08", "08", new String[]{"TestMonster8"}, new String[]{"TestMonster8"}, /*MHP*/0, 0, 0, 5, 15, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 1, 6, 1, "TestMonster8", new String[]{"Supposidly has", "Defence powers"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestEnemyDef and Weakness
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
//						//7 = 7th   //TestEnemy??
//				};
//			}
//			else if(MonsterNo == 12){
//				MInfo  = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(12, "09", "09", new String[]{"TestMonster9"}, new String[]{"TestMonster9"}, /*MHP*/0, 0, 0, 5, 15, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster9", new String[]{"Supposidly has", "Boss powers?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestBoss2 Prismatic Defence
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
//				};
//			}
//			else if(MonsterNo == 13){
//				MInfo = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(13, "10", "10", new String[]{"TestMonster10"}, new String[]{"TestMonster10"}, /*MHP*/0, 5, 0, 4, 15, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster10", new String[]{"A secret boss?", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//TestSecretBoss Power of Change
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
//				};
//			}
//			
////			//Defaulter?
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						new MonsterData(0, "[]", "[]", new String[]{"Defaulter"}, new String[]{"Defaulter"},/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks like a ... ", "black box?"},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)// 
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
////			//FF
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			else if(MonsterNo == 14){
//				MInfo  = new MonsterData[]{
//						//0 = Cutscene Quest
//						new MonsterData(14, "12", "12", new String[]{"Dummy"}, new String[]{"Dummy"}, /*MHP*/1, 1, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 0, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 0, 1, "TestMonster11?", new String[]{"Used for testing", "Is it white or brown?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/5.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/5.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0)//Dummy
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
//				};
//			}
////			//Scarecrow
////			else if(MonsterNo == 99){
////				MInfo = new MonsterData[]{
////						//0 = Cutscene Quest
////						
////						//1 = Normal Mode
////						
////						//2 = Easy Mode
////						
////						//3 = Hard Mode
////						
////						//4 = Other Story
////						
////						//5 = Glitch
////						
////						//6 = Beta
////						
////						//7 = 7th    
////						
////				};
////			}
//			
//			//Red Armor
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
//						new MonsterData(13, "", "", new String[]{"ForbiddonArmor"}, new String[]{"FrbdnArmor"}, /*MHP*/0, 5, 0, 4, 15, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 6, 1, "A dangeorus foe!", new String[]{"Red colored armor", "Has evil powers"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/5, /*StatusC*/100)
//						//7 = 7th    
//						
//				};
//			}
//			
//			else
//				MInfo  = new MonsterData[]{
//					//0 = Cutscene Quest
//					new MonsterData(000, "NULL", "", new String[]{"Nameless"}, new String[]{"Nameless"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDef*/0, 0, 0, 6, 1, "No Data", new String[]{"looks like mist maybe?", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/30, /*Status*/0, /*StatusC*/0)
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
//			};
//			//Shapeless
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