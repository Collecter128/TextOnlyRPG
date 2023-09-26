package textonlyrpg;

public class Inventor {
	public int MonsterID = 000;
	public String MonsterName = "TestMonster1";
	public int MonsterUnlocked = 0;
	public int BattleNo = 1;
	static int i = 0;
	
	
	public Inventor(int MonsterID, String MonsterName, int MonsterUnlocked, int BattleNo){
		this.MonsterID = MonsterID;
		this.MonsterName = MonsterName;
		this.MonsterUnlocked = MonsterUnlocked;
		this.BattleNo = BattleNo;//Order?
	}
	
	public int getMonsterID(){
		return MonsterID;
	}
	
	public String getMonsterName(){
		return MonsterName;
	}

	public static Inventor[] InvList(int[] InvEventFound, int[] NoDefeated){//List?
		int InvTotal = InvTotal(InvEventFound);
		Inventor[] IData = new Inventor[InvTotal];{
			int i = 0;
			while(i < (InvTotal - 1)){
				IData[i] = new Inventor(000, "No Data", 0, 1);
				i = i + 1;
			}
			int Total = 0;
			if(InvEventFound[0] == 1){
				IData[Total] = new Inventor(4, "TstMonster1", 1, 7);//TestSlime
				Total = Total + 1;
			}
			if(InvEventFound[1] == 1){
				IData[Total]  = new Inventor(5, "TstMonster2", 1, 8);//TestGhost
				Total = Total + 1;
			}
			if(InvEventFound[2] == 1){
				IData[Total]  = new Inventor(6, "TstMonster3", 1, 9);//TestGolem
				Total = Total + 1;
			}
			if(InvEventFound[3] == 1){
				IData[Total]  = new Inventor(7, "TstMonster4", 1, 10);//TestArmor
				Total = Total + 1;
			}
			if(InvEventFound[4] == 1){
				IData[Total]  = new Inventor(8, "TstMonster5", 1, 11);//TestBoss
				Total = Total + 1;
			}
			if(InvEventFound[5] == 1){
				IData[Total]  = new Inventor(9, "TstMonster6", 1, 12);//TestHP
				Total = Total + 1;
			}
			if(InvEventFound[6] == 1){
				IData[Total]  = new Inventor(10, "TstMonster7", 1, 13);//TestAtk
				Total = Total + 1;
			}
			if(InvEventFound[7] == 1){
				IData[Total]  = new Inventor(11, "TstMonster8", 1, 14);//TestDef
				Total = Total + 1;
			}
			if(InvEventFound[8] == 1){
				IData[Total]  = new Inventor(12, "TstMonster9", 1, 15);//TestBoss2
				Total = Total + 1;
			}
			if(InvEventFound[9] == 1){
				IData[Total]  = new Inventor(13, "TstMonstr10", 1, 16);//TestSecretBoss
				Total = Total + 1;
			}
			if(InvEventFound[10] == 1){
				IData[Total]  = new Inventor(1, "????", 1, 17);//TestBigBattle
				Total = Total + 1;
			}
			if(InvEventFound[11] == 1){
				IData[Total]  = new Inventor(1, "Test", 1, 18);//Test Test
				Total = Total + 1;
			}
		}
		return IData;
	}
	
	public static int InvNo(int[] Monster1Found, int MNo){
		int Index = 0;
		int i = 0;
		while(i < MNo - 1){
			Index = Index + Monster1Found[i];
			i = i + 1;
		}
		return Index;
	}
	public static int InvTotal(int[] InvEventFound){
		int Total = 0;
		int i = 0;
		while(i < InvEventFound.length){
			Total = Total + InvEventFound[i];
			i = i + 1;
		}
		return Total;
	}
}
