package textonlyrpg;

public class Passwords {
	
	public static String NewGame(int GameMode){
		String PasswordCode = "";
//		if(GameMode == 0){//Cutscene
//			PasswordCode = "";
//		}
		if(GameMode == 1){//Normal
			PasswordCode = ""; 
			GamePanel.CHP1 = 0; 
			GamePanel.CHP2 = 1; 
			GamePanel.CHP3 = 1; 
			GamePanel.CHP4 = 5;
			GamePanel.CHP1Max = 0;//Not sure if this is a good name
			GamePanel.CHP2Max = 0;
			GamePanel.CHP3Max = 2;
			GamePanel.CHP4Max = 5;
			GamePanel.Money = 0;
		}
		if(GameMode == 2){//Easy
			PasswordCode = "";
		}
		if(GameMode == 3){//Hard
			PasswordCode = "";
		}
		if(GameMode == 4){//Easy
			PasswordCode = "";
		}
		if(GameMode == 5){//Glitch
			PasswordCode = "";
		}
		if(GameMode == 6){//Beta
			PasswordCode = "";
		}

//		MainClass.Money = 0;
//		
//		MainClass.Area1Found = new int[16];{
//			MainClass.Area1Found[0] = 1;//Market/Town
//			MainClass.Area1Found[1] = 1;//Elder's Ofice/Town
//			MainClass.Area1Found[2] = 1;//Cook's Kitchen/Town
//			MainClass.Area1Found[3] = 1;//Weaponsmith's Shop/Town
//			MainClass.Area1Found[4] = 1;//Armorsmith's Shop/Town
//			MainClass.Area1Found[5] = 1;//Tavern/Town
//			MainClass.Area1Found[6] = 1;//Inventor's Shop/Town
//			MainClass.Area1Found[7] = 1;//Town Gate/Town
//			MainClass.Area1Found[8] = 1;//Field1/Field
//			MainClass.Area1Found[9] = 1;//Field2/Field
//			MainClass.Area1Found[10] = 1;//Haunted Field/Field
//			
//			MainClass.Area1Found[11] = 1;//TestArea1/Test Area
//			MainClass.Area1Found[12] = 1;//TestArea2/Test Area
//			MainClass.Area1Found[13] = 0;//TestArea3/Test Area
//			MainClass.Area1Found[14] = 0;//TestArea4/Test Area
//			MainClass.Area1Found[15] = 1;//Password/Password Screen
//		}//Area1Found End
		
		//Gamemode = GameMode;
		//0
		//1 = Normal Mode
		//2 = Easy Mode
		//3 = Hard Mode
		//4 = Other Mode
		
		return PasswordCode;
		
	}//NewGame End

	public void Initialize(){
	}
	
	public static int[] Cheat(int keyPressed, int Var1, int VarM){
		int[] CheatValue = new int[]{Var1,VarM};
		
		// /Cheat
		
		// Key: /
		if(keyPressed == 47){
			if(Var1 == 0){
				CheatValue[0] = 1;
			}
		}
		// Key: a
		else if(keyPressed == 97){
			if(Var1 == 4){
				CheatValue[0] = 5;
			}
		}
		
		// Key: c
		else if(keyPressed == 99){
			if(Var1 == 1){
				CheatValue[0] = 2;
			}
		}
		
		// Key: e
		else if(keyPressed == 101){
			if(Var1 == 3){
				CheatValue[0] = 4;
			}
		}
		
		// Key: h
		else if(keyPressed == 104){
			if(Var1 == 2){
				CheatValue[0] = 3;
			}
		}
		
		// Key: t
		else if(keyPressed == 116){
			if(Var1 == 5){
				CheatValue[0] = 6;;
			}
		}
		
		
		
		return CheatValue;
	}
	
}