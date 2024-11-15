package textonlyrpg;

public class BattleDataX {
	int BattleNo;
	MonsterData[] MonsterD;
	int Event;//(occures during battle)
	int Drop1;
	int Drop1Percent;
	//Monster?
	int Exp;
	int MoneyDrop;
	int MoneyChance;
	int EscapeChance;
	int EndEvent; //(happens after battle)
		//1 = After exits battle screen
	int BattleScreenMode = 1;//Mode in which the player fights the enemy
	String[] RandomText = new String[]{"", ""};
	
	public BattleDataX(int BattleNo, MonsterData[] MonsterD, int Event, int Drop1, int Drop1Percent, int Exp, int MoneyDrop, int MoneyChance, int EscapeChance, int EndEvent, int BattleScreenMode, String[] RandomText){
		this.BattleNo = BattleNo;
		this.MonsterD = MonsterD;
		this.Event = Event;
		this.Drop1 = Drop1;
		this.Drop1Percent = Drop1Percent;
		this.Exp = Exp;
		this.MoneyDrop = MoneyDrop;
		this.MoneyChance = MoneyChance;
		this.EscapeChance = EscapeChance;
		this.EndEvent = EndEvent;
		this.BattleScreenMode = BattleScreenMode;
		this.RandomText = RandomText;
	}
	
	public static BattleData GetBattleData(int BattleNo){
		MonsterData[] MBattle = new MonsterData[1];
			MBattle[0] = new MonsterData(0, "", "", new String[]{"Defaulter"}, new String[]{"Defaulter"}, /*MHP*/9, 9, 9, 9, 9, 1, /*MAtk*/9, 9, 9, 9, 1, /*MAtkElements*/5, 19, /*MDef*/9, 9, 9, 9, 1, "...", new String[]{"Looks like a ... ", "black box?"}, /*MSpeed*/100, /*ItemDrop?*/11, 9, /*Exp*/9999, /*Money*/999, 99, /*Weakness*/new double[]{/*Unarmed*/9.0, /*Sword*/9.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/9.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//
			BattleData BattleD = new BattleData(00, MBattle, /*Event*/0, /*ItemDrop*/1, 50, /*Exp*/999, /*Money*/9999, 50, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			
			if(BattleNo == 1){
				MBattle = new MonsterData[1];{
					MBattle[0] = MonsterData.MData(23, 0);//Water Slime
				}
				BattleD = new BattleData(1, MBattle, /*Event*/0, /*ItemDrop*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			}
			if(BattleNo == 2){
				MBattle = new MonsterData[1];{
					MBattle[0] = MonsterData.MData(41, 0);//Will o Wisp
				}
				BattleD = new BattleData(2, MBattle, /*Event*/0, /*ItemDrop*/95, 40, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
				//BattleD = new BattleData(2, MBattle, /*Event*/0, /*ItemDrop*/4, 40, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			}
			if(BattleNo == 3){
				MBattle = new MonsterData[1];{
					MBattle[0] = MonsterData.MData(5, 0);//Giant Water Slime
				}
				BattleD = new BattleData(3, MBattle, /*Event*/0, /*ItemDrop*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			}
			if(BattleNo == 4){
				MBattle = new MonsterData[2];{
					MBattle[0] = MonsterData.MData(41, 0);//Will o Wisp
					MBattle[1] = MonsterData.MData(41, 0);//Will o Wisp
				}
				BattleD = new BattleData(4, MBattle, /*Event*/0, /*ItemDrop*/95, 80, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
				//BattleD = new BattleData(4, MBattle, /*Event*/0, /*ItemDrop*/4, 80, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			}
			
		if(BattleNo == 5){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(326, 0);//BetaSlime
			}
			BattleD = new BattleData(5, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(5, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 6){
			MBattle = new MonsterData[2];{
				//MBattle[0] = new MonsterData(328, "2", "02", new String[]{"TestMonster2"}, new String[]{"TstMonstr2"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/2, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster2", new String[]{"Looks like a ... ", "Ghost?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//TestGhost
				MBattle[0] = MonsterData.MData(329, 0);//BetaGhost
				//MBattle[1] = new MonsterData(331, "3", "03", new String[]{"TestMonster3"}, new String[]{"TstMonstr3"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, /*MDef*/0, 0, 0, 8, 1, "TestMonster3", new String[]{"Looks like a ... ", "Golem?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//TestGolem
				MBattle[1] = MonsterData.MData(332, 0);//BetaGolem
			}
			BattleD = new BattleData(6, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/60, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(6, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/60, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		if(BattleNo == 7){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(326, 0);//BetaSlime
			}
			BattleD = new BattleData(7, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(7, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 8){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(329, 0);//BetaGhost
			}
			BattleD = new BattleData(8, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(8, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 9){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(332, 0);//BetaGolem
			}
			BattleD = new BattleData(9, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(9, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 10){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(335, 0);//BetaArmor
			}
			BattleD = new BattleData(10, MBattle, /*Event*/0, /*ItemDrop*/292, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(10, MBattle, /*Event*/0, /*ItemDrop*/11, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 11){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(338, 0);//BetaBoss
			}
			BattleD = new BattleData(11, MBattle, /*Event*/0, /*ItemDrop*/295, 70, /*Exp*/0, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(11, MBattle, /*Event*/0, /*ItemDrop*/14, 70, /*Exp*/0, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 12){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(341, 0);//BetaMonsterHP 6
			}
			BattleD = new BattleData(12, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(12, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 13){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(344, 0);//BetaMonsterAtk 7
			}
			BattleD = new BattleData(13, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(13, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 14){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(347, 0);//BetaMonsterDef 8
			}
			BattleD = new BattleData(14, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(14, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 15){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(350, 0);//BetaBoss2 9
			}
			BattleD = new BattleData(15, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/80, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(15, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/80, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 16){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(353, 0);//BetaSecretBoss 10
			}
			BattleD = new BattleData(16, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/99, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(16, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/99, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 17){
			MBattle = new MonsterData[4];{
				//MBattle[0] = new MonsterData(325, "1", "01", new String[]{"TestMonster1"}, new String[]{"TstMonstr1"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/1, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster1", new String[]{"Looks like a ... ", "slime?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//TestSlime
				MBattle[0] = MonsterData.MData(326, 0);//BetaSlime
				//MBattle[1] = new MonsterData(328, "2", "02", new String[]{"TestMonster2"}, new String[]{"TstMonstr2"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/2, 0, /*MDef*/0, 0, 0, 6, 1, "TestMonster2", new String[]{"Looks like a ... ", "ghost?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.5, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//TestGhost
				MBattle[1] = MonsterData.MData(329, 0);//BetaGhost
				//MBattle[2] = new MonsterData(331, "3", "03", new String[]{"TestMonster3"}, new String[]{"TstMonstr3"}, /*MHP*/0, 0, 0, 5, 9, 1, /*MAtk*/0, 0, 0, 8, 1, /*MAtkElements*/3, 0, /*MDef*/0, 0, 0, 8, 1, "TestMonster3", new String[]{"Looks like a ... ", "golem?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//TestGolem
				MBattle[2] = MonsterData.MData(332, 0);//BetaGolem
				//MBattle[3] = new MonsterData(334, "4", "04", new String[]{"TestMonster4"}, new String[]{"TstMonstr4"}, /*MHP*/0, 0, 1, 5, 9, 1, /*MAtk*/0, 0, 1, 0, 1, /*MAtkElements*/4, 0, /*MDef*/0, 0, 1, 0, 1, "TestMonster4", new String[]{"Looks like ... ", "armor?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.5, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/0.5, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//TestArmor
				MBattle[3] = MonsterData.MData(335, 0);//BetaArmor
			}
			BattleD = new BattleData(17, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(17, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 18){//Dummy
			MBattle = new MonsterData[1];{
				//MBattle[0] = new MonsterData(355, "", "", new String[]{"Dummy"}, new String[]{"Dummy"}, /*MHP*/1, 1, 1, 9, 9, 1, /*MAtk*/0, 0, 1, 5, 1, /*MAtkElements*/0, 0, /*MDef*/0, 0, 0, 0, 1, "TestMonster11??", new String[]{"Used for testing", ""}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/-1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/3, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, new String[] {"", "", "", ""}, new int[][]{{5, 80}}, /*CriticalC*/50, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//Test
				MBattle[0] = MonsterData.MData(356, 0);//Scarecrow
			}
			BattleD = new BattleData(18, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(18, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 19){
			MBattle = new MonsterData[2];{
				MBattle[0] = MonsterData.MData(344, 0);//BetaMonsterHP
				MBattle[1] = MonsterData.MData(347, 0);//BetaMonsterHP
			}
			BattleD = new BattleData(19, MBattle, /*Event*/0, /*ItemDrop*/289, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(19, MBattle, /*Event*/0, /*ItemDrop*/8, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		if(BattleNo == 20){//TestBoss Battle + Event
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(338, 0);//BetaBoss
			}
			BattleD = new BattleData(20, MBattle, /*Event*/0, /*ItemDrop*/295, 10, /*Exp*/2, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/23, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(20, MBattle, /*Event*/0, /*ItemDrop*/14, 10, /*Exp*/2, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/23, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		if(BattleNo == 21){//??? Doppelganger???
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(16, 0);
			}
			BattleD = new BattleData(21, MBattle, /*Event*/0, /*ItemDrop*/295, 10, /*Exp*/2, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(21, MBattle, /*Event*/0, /*ItemDrop*/14, 10, /*Exp*/2, /*Money*/3, 30, /*Escape*/100, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		if(BattleNo == 22){//XBattle Test Slime -> Water SLime
			MBattle = new MonsterData[1];{
				//MBattle[0] = MonsterData.MData(77, 0);
				MBattle[0] = new MonsterData(22, "11", "111", new String[]{"Water Slime?"}, new String[]{"WatrSlime?"}, /*MHP*/0, 0, 1, 7, 9, 1, /*MAtk*/0, 0, 0, 10, 1, /*MAtkElements*/1, 8, /*MDef*/0, 0, 0, 7, 1, "A blue Slime", new String[]{"the inside looks like?", "flowing water?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/1.0, /*Sword*/1.0, /*Lance*/1.0, /*Hammer*/1.0, /*Axe*/1.0, /*Pole*/1.0, /*Bomb*/2.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0, 0, 0},{0, 0, 0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);//Water Slime
			}
			BattleD = new BattleData(1, MBattle, /*Event*/0, /*ItemDrop*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		if(BattleNo == 23){//Giant Slime Boss Battle
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(5, 0);//Giant Water Slime
			}
			BattleD = new BattleData(23, MBattle, /*Event*/0, /*ItemDrop*/1, 50, /*Exp*/1, /*Money*/3, 30, /*Escape*/40, /*EndEvent*/36, /*ScreenMode*/1, /*RandomText*/new String[]{"Large Transparent Feind:", "Giant Slime"});
		}
		
		//The First Slime
		if(BattleNo == 24){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(23, 0);//Water Slime
			}
			BattleD = new BattleData(24, MBattle, /*Event*/0, /*ItemDrop*/0, 0, /*Exp*/1, /*Money*/0, 0, /*Escape*/100, /*EndEvent*/30, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		//The Second Slime
		if(BattleNo == 25){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(23, 0);//Water Slime
			}
			BattleD = new BattleData(25, MBattle, /*Event*/0, /*ItemDrop*/1, 100, /*Exp*/1, /*Money*/3, 50, /*Escape*/100, /*EndEvent*/31, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		//The Third Slime
		if(BattleNo == 26){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(23, 0);//Water Slime
			}
			BattleD = new BattleData(26, MBattle, /*Event*/0, /*ItemDrop*/1, 20, /*Exp*/1, /*Money*/3, 50, /*Escape*/100, /*EndEvent*/32, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		//The Fourth Slime
		if(BattleNo == 27){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(23, 0);//Water Slime
			}
			BattleD = new BattleData(27, MBattle, /*Event*/0, /*ItemDrop*/103, 100, /*Exp*/1, /*Money*/3, 50, /*Escape*/100, /*EndEvent*/33, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		//The Fifth Slime
		if(BattleNo == 28){
			MBattle = new MonsterData[1];{
				MBattle[0] = MonsterData.MData(23, 0);//Water Slime
			}
			BattleD = new BattleData(28, MBattle, /*Event*/0, /*ItemDrop*/1, 20, /*Exp*/1, /*Money*/0, 0, /*Escape*/100, /*EndEvent*/34, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		if(BattleNo == 29){
			MBattle = new MonsterData[3];{
				MBattle[0] = MonsterData.MData(41, 0);//Will o Wisp
				MBattle[1] = MonsterData.MData(41, 0);//Will o Wisp
				MBattle[2] = MonsterData.MData(41, 0);//Will o Wisp
			}
			BattleD = new BattleData(29, MBattle, /*Event*/0, /*ItemDrop*/95, 80, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
			//BattleD = new BattleData(4, MBattle, /*Event*/0, /*ItemDrop*/4, 80, /*Exp*/1, /*Money*/3, 30, /*Escape*/70, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"Monster Found", ""});
		}
		
		return BattleD;
	}//end of battle data
	
	public static int[] SetMHp(MonsterData[] MonsterD, int HPNumber){
		int[] Hp = new int[MonsterD.length];
		//int[] Hp = 0;
		int i = 0;
		while(i < MonsterD.length){
			if(HPNumber == 1){
				Hp[i] = MonsterD[i].MHp1;
				//Hp = MonsterData.MInfo(Monsters[i]).MHp1;
				//Hp[i] = MonsterData.MInfo(MonsterD[i].MonsterID).MHp1;
			}
			if(HPNumber == 2){
				Hp[i] = MonsterData.MData(MonsterD[i].MonsterID, 0).MHp2;
				//Hp = MonsterData.MInfo(Monsters[i]).MHp2;
			}
			if(HPNumber == 3){
				Hp[i] = MonsterData.MData(MonsterD[i].MonsterID, 0).MHp3;
				//Hp = MonsterData.MInfo(Monsters[i]).MHp3;
			}
			if(HPNumber == 4){
				Hp[i] = MonsterData.MData(MonsterD[i].MonsterID, 0).MHp4;
				//Hp = MonsterData.MInfo(Monsters[i]).MHp4;
			}
			i = i + 1;
		}
		return Hp;
	}
}