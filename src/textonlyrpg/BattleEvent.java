package textonlyrpg;

public class BattleEvent {
	
	int EventNo;
	String EventName;
	String EventDesc;
	int[] TextContained;
	int[] EventType;
		//1 = Summon
			//BattleEventData{Summoned Enemy, Summoned Enemy Var??? (gamemode?)}
		//2 = Prism Def
		//3 = Multi Attacks
		//4 = Special Attack
			//Special Attack Data Structure
			//BattleEventData{MAtk1, MAtk2, MAtk3, MAtk4, Type, MSpeed, MStatus, MStatusChance, MAttack Element1, MAttack Element2, SpecialAttackText Critical, SpecialAttackText Normal}
			//BattleEventData{MAtk1 0, MAtk2 1, MAtk3 2, MAtk4 3, AttackDigitMax 4, Type 5, MSpeed 6, CriticalChance 7, MStatus 8, MStatusChance 9, MAttack Element1 10, MAttack Element2 11, AttackTextNorm 12, AttackTextCritical! 13}
		//5 = Recover
		//6 = Special Recover
		//7 = Vampire Recover
			//BattleEventData{MAtk1 0, MAtk2 1, MAtk3 2, MAtk4 3, DigetMax 4, Type 5, MSpeed 6, CriticalChance 7, MStatus 8, MStatusChance 9, MAttack Element1 10, MAttack Element2 11, AttackTextNorm 12, AttackTextCritical! 13}
		//8 = Snowstorm
			//Snowstorm Attack Data Structure
			//BattleEventData{MAtk1 0, MAtk2 1, MAtk3 2, MAtk4 3, Type 4, MSpeed 5, MStatus 6, MStatusChance 7, MAttack Element1 8, MAttack Element2 9, AttackTextNorm 10, AttackTextCritical! 11, AttackTextMissed! 12, Recover 13, CriticalChance 14}
		//9 = Inflict Negative Status
		   //BattleEventData[StatusType 0, StatusTurns 1, StatushasEffectText 2, StatusDoesn'tEffect Text 3]
			//0 = Normal
			//1 = Poison
			//2 = Cursed: Can't Change Weapon
			//3 = Sticky: Can't Change Weapon, same as curse, but it looks different
			//4 = ???   Enemy HP is displayed as ????
    		//5 = All
			//6 = Barr
		//10 = Change Current Weapon Element
			//BattleEventData[Changetype 0, WeaponChangeText 1, GauntletsChange Text 2]
		//11 = Break Current Weapon
			//BattleEventData[Changetype 0, WeaponBrokeText 1, GauntletsBroke Text 2]
		//12 = Disarm
			//BattleEventData[DisarmWeapon 0, DisarmGauntlets 1, DisarmFailed Text 2]
		//13 = Escape
			//BattleEventData[Event 0 , Drop 1, DropPercentChange 2, ExpRemoved 3, MoneyLost 4, MoneychanceChange 5, EscapeIncrease 6, End Event 7, NewScreenMode 8, LoadedText 9]
				//ScreenMode
					//Nothingness = 0
					//Normal = 1
					//Mirror = 2
					//Negative = 3
					//Forbiddon Area! = 4
		    		//Glitch! = 5
		    		//Mystery = 6
		    		//Midnight = 7
		//14 = Drop Money
		//15 = Activate Cutscene
	int[][] EventData;
	//int[] AttackDmg;
	//int AttackType;
	//int AttackElement;
	//int SpecialEffect;
	//int SpecialEffect2;
	

	
	public BattleEvent(int EventNo, String EventName, String EventDesc, int[] EventType, int[][] EventData, int[] TextContained){
		this.EventNo = EventNo;
		this.EventName = EventName;
		this.EventDesc = EventDesc;
		this.EventType = EventType;
		this.EventData = EventData;
		this.TextContained = TextContained;
	}
	
	public static BattleEvent LoadEvent(int EventNoLoading){
		BattleEvent NullEvent = new BattleEvent(0, "", "", new int[] {0}, new int[][] {{0}}, new int[] {0});
		BattleEvent LoadedEvent = NullEvent;
		
		switch(EventNoLoading){
		case 1:{//TestSummon Event
			LoadedEvent = new BattleEvent(1, "TestSummon", "Tests Summoning an Enemy", /*Type*/new int[] {1}, /*Data*/new int[][] {{2, 0}}, /*Text*/new int[] {43});
			break;
		}
		case 2:{//Test other types of Battle Events
			LoadedEvent = new BattleEvent(2, "TestOthers", "Tests other battle events", /*Type*/new int[] {8}, /*Data*/new int[][] {{0, 0, 0, 7, 9, 70, 0, 0, 0, 0, 47, 48, 49, 46, 50}}, /*Text*/new int[] {44});
			break;
		}
		case 3:{//Test other types of Battle Events
			LoadedEvent = new BattleEvent(3, "TestMore", "Tests even more battle events", /*Type*/new int[] {9}, /*Data*/new int[][] {{1, 3, 50, 51}}, /*Text*/new int[] {50});
			break;
		}
		case 4:{//Test other types of Battle Events
			LoadedEvent = new BattleEvent(4, "TestFour", "Tests an even 4 battle event", /*Type*/new int[] {12}, /*Data*/new int[][] {{1, 3, 50, 51}}, /*Text*/new int[] {31});
			break;
		}
		case 5:{//Test other types of Battle Events
			LoadedEvent = new BattleEvent(5, "TestEvenMore", "Tests yet more battle event", /*Type*/new int[] {13}, /*Data*/new int[][] {{0, 1, -10, 0, -3, -30, 0, 0, 3, 31}}, /*Text*/new int[] {51});
			break;
		}
		case 6:{//Test other types of Battle Events
			LoadedEvent = new BattleEvent(6, "TestMoreAgain", "Tests another Battle Event", /*Type*/new int[] {14}, /*Data*/new int[][] {{3}}, /*Text*/new int[] {51});
			break;
		}
		case 7:{//Test other types of Battle Events
			//LoadedEvent = new BattleEvent(7, "TestMoreAgainAgain", "Tests another Battle Event Again", /*Type*/new int[] {1, 15}, /*Data*/new int[][] {{2, 0},{27}}, /*Text*/new int[] {43, 51});
			LoadedEvent = new BattleEvent(7, "TestMoreAgainAgain", "Tests another Battle Event Again", /*Type*/new int[] {1, 14}, /*Data*/new int[][] {{2, 0},{4}}, /*Text*/new int[] {43, 51});
			break;
		}
		case 99:{
			//NewData =
			break;
		}
		
		
		}
		
		return LoadedEvent;
	}
	
	public static MonsterData FormChange(int DataID){
		MonsterData NewData = new MonsterData(0, "", "", new String[]{"DefaulterB"}, new String[]{"DefaulterB"},/*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks the same?", "Maybe more red-ish."},/*MSpeed*/100 , /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/2.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);// 
	
		switch(DataID){
		case 1:{
			NewData = new MonsterData(14, "", "", new String[]{"DummyS"}, new String[]{"DummyS"}, /*MHP*/1, 1, 1, 9, 9, 4, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 0, 1, "TestMonster11??", new String[]{"Used for testing", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/-1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/3, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new String[] {"", "", "", ""}, new int[][]{{1, 80}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//Test
			break;
		}
		case 2:{
			//NewData =
			break;
		}
		
		}
		
		return NewData;
	}//Form Change End
	
	public static int[] ChangeCurrentWeapon(int DataChangeType, int CurrentWeapon){
		int[] NewItem = {0, 0};
	if(DataChangeType == 0){//Null
		
	}
	//Test Changetype
	if(DataChangeType == 1){//Changetype, Change elemental weapon into a normal one
		if(CurrentWeapon == 293){ //CurrentWeapon == 282
			NewItem = new int[]{125, 0}; //{116, 0}
		}
//		else if(){
//			//NewItem =
//		}
		
	}
	
		
		return NewItem;
	}//Form Change End
}
