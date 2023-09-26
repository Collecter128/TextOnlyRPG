package textonlyrpg;

public class Movement {//RPG
	int XPosLoc = 0;
	int YPosLoc = 0;
	int ScreenData = 0;
	int StuffFound = 0;
	int CurrentPage = 0;
	
	public static int[] CurserMoveUp(int XPosLoc, int YPosLoc, int ScreenData,int StuffFound,int CurrentPage){
		int[] MoveData = new int[2];{
			MoveData[0] = YPosLoc;//Y
			MoveData[1] = XPosLoc;//X
			//MoveData[0] = 0;//Y Glitch
			//MoveData[1] = 0;//X Glitch
		}
		
		//Examine, Battle, ItemsScreen  Up
		
		if(ScreenData == 5){//NoteScreen Up
			if(XPosLoc == 30){//Notescreen Up X = 30
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
			}//Notescreen Up X = 30 End
			if(YPosLoc == 190 && XPosLoc == 5){//Notescreen Up X = 190, Y = 5
				if(StuffFound == ((CurrentPage - 1)*10) + 1){//YPosLoc == 190 && XPosLoc == 5 && StuffFound == ((CurrentPage - 1)*10) + 1
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
			}//Notescreen Up Y = 190 , X = 5 End
			if(XPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 5){//Notescreen Up X = 120
				if(YPosLoc == 60){//YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 5
					MoveData[0] = 30;
					MoveData[1] = 120;
				}
				if(YPosLoc == 90){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(YPosLoc == 120){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
			}//Notescreen Up X = 120 End
			if(YPosLoc == 190 && XPosLoc == 140){//Notescreen Up X = 190
				if(StuffFound == ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 5){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 30;
					MoveData[1] = 120;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
				if(StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 150;
					MoveData[1] = 120;
				}
			}//Notescreen Up Y = 190 , X = 140 End
		}//Notescreen Up End
		
		//Password Screen Up
		
		if(ScreenData == 7){//MoveScreen UP
			//AreaData Update Code & List Scroll Code
			if(YPosLoc == 190 && StuffFound == 1){//AreasFound
				MoveData[0] = 30;
				MoveData[1] = 30;
			}
			if(YPosLoc == 45 && StuffFound > 1){
				MoveData[0] = 30;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 2){
				MoveData[0] = 45;
				MoveData[1] = 30;
			}
			if(YPosLoc == 60 && StuffFound > 2){
				MoveData[0] = 45;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 3){
				MoveData[0] = 60;
				MoveData[1] = 30;
			}
			if(YPosLoc == 75 && StuffFound > 3){
				MoveData[0] = 60;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 4){
				MoveData[0] = 75;
				MoveData[1] = 30;
			}
			if(YPosLoc == 90 && StuffFound > 4){
				MoveData[0] = 75;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 5){
				MoveData[0] = 90;
				MoveData[1] = 30;
			}
			if(YPosLoc == 105 && StuffFound > 5){
				MoveData[0] = 90;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 6){
				MoveData[0] = 105;
				MoveData[1] = 30;
			}
			if(YPosLoc == 120 && StuffFound > 6){
				MoveData[0] = 105;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 7){
				MoveData[0] = 120;
				MoveData[1] = 30;
			}
			if(YPosLoc == 135 && StuffFound > 7){
				MoveData[0] = 120;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 8){
				MoveData[0] = 135;
				MoveData[1] = 30;
			}
			if(YPosLoc == 150 && StuffFound > 8){
				MoveData[0] = 135;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound == 9){
				MoveData[0] = 150;
				MoveData[1] = 30;
			}
			if(YPosLoc == 165 && StuffFound > 9){
				MoveData[0] = 150;
				MoveData[1] = 30;
			}
			if(YPosLoc == 190 && StuffFound > 9){
				MoveData[0] = 165;
				MoveData[1] = 30;
			}
			
		}//Movescreen Up End
		
		//CookScreen Up
		
		//Inventor Up
		if(ScreenData == 14){//Inventor UP
			//UpdateData and List Scroll
			if(YPosLoc == 190 && StuffFound == 1){
				MoveData[0] = 30;
				MoveData[1] = 15;
			}
			if(YPosLoc == 45 && StuffFound > 1){
				MoveData[0] = 30;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 2){
				MoveData[0] = 45;
				MoveData[1] = 15;
			}
			if(YPosLoc == 60 && StuffFound > 2){
				MoveData[0] = 45;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 3){
				MoveData[0] = 60;
				MoveData[1] = 15;
			}
			if(YPosLoc == 75 && StuffFound > 3){
				MoveData[0] = 60;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 4){
				MoveData[0] = 75;
				MoveData[1] = 15;
			}
			if(YPosLoc == 90 && StuffFound > 4){
				MoveData[0] = 75;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 5){
				MoveData[0] = 90;
				MoveData[1] = 15;
			}
			if(YPosLoc == 105 && StuffFound > 5){//IStuffFound
				MoveData[0] = 90;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 6){
				MoveData[0] = 105;
				MoveData[1] = 15;
			}
			if(YPosLoc == 120 && StuffFound > 6){
				MoveData[0] = 105;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 7){
				MoveData[0] = 120;
				MoveData[1] = 15;
			}
			if(YPosLoc == 135 && StuffFound > 7){
				MoveData[0] = 120;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 8){
				MoveData[0] = 135;
				MoveData[1] = 15;
			}
			if(YPosLoc == 150 && StuffFound > 8){
				MoveData[0] = 135;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound == 9){
				MoveData[0] = 150;
				MoveData[1] = 15;
			}
			if(YPosLoc == 165 && StuffFound > 9){
				MoveData[0] = 150;
				MoveData[1] = 15;
			}
			if(YPosLoc == 190 && StuffFound > 9){
				MoveData[0] = 165;
				MoveData[1] = 15;//30?
			}
		}//Inventor UP End
		
		//ElderScreen Up
		
		//Topics Screen Up
		if(ScreenData == 9){
			if(XPosLoc == 30){
				if(YPosLoc == 60 && StuffFound > 1 + (CurrentPage - 1)*10){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound > 2 + (CurrentPage - 1)*10){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound > 3 + (CurrentPage - 1)*10){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 150 && StuffFound > 4 + (CurrentPage - 1)*10){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
			}
			if(YPosLoc == 190 && XPosLoc == 5){
					if(StuffFound == 1 + (CurrentPage - 1)*10){
						MoveData[0] = 30;
						MoveData[1] = 30;
					}
					if(StuffFound == 2 + (CurrentPage - 1)*10){
						MoveData[0] = 60;
						MoveData[1] = 30;
					}
					if(StuffFound == 3 + (CurrentPage - 1)*10){
						MoveData[0] = 90;
						MoveData[1] = 30;
					}
					if(StuffFound == 4 + (CurrentPage - 1)*10){
						MoveData[0] = 120;
						MoveData[1] = 30;
					}
					if(StuffFound > 4 + (CurrentPage - 1)*10){
						MoveData[0] = 150;
						MoveData[1] = 30;
					}
			}
			if(XPosLoc == 120 && StuffFound > 5 + (CurrentPage - 1)*10){
				if(YPosLoc == 60 && StuffFound > 6 + (CurrentPage - 1)*10){
					MoveData[0] = 30;
					MoveData[1] = 120;
				}
				if(YPosLoc == 90 && StuffFound > 7 + (CurrentPage - 1)*10){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(YPosLoc == 120 && StuffFound > 8 + (CurrentPage - 1)*10){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150 && StuffFound > 9 + (CurrentPage - 1)*10){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
			}
			if(YPosLoc == 190 && XPosLoc == 140){
				if(StuffFound == 1 + (CurrentPage - 1)*10){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(StuffFound == 2 + (CurrentPage - 1)*10){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(StuffFound == 3 + (CurrentPage - 1)*10){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(StuffFound == 4 + (CurrentPage - 1)*10){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(StuffFound == 5 + (CurrentPage - 1)*10){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				if(StuffFound == 6 + (CurrentPage - 1)*10){
					MoveData[0] = 30;
					MoveData[1] = 120;
				}
				if(StuffFound == 7 + (CurrentPage - 1)*10){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(StuffFound == 8 + (CurrentPage - 1)*10){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(StuffFound == 9 + (CurrentPage - 1)*10){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
				if(StuffFound > 9 + (CurrentPage - 1)*10){
					MoveData[0] = 150;
					MoveData[1] = 120;
				}
			}
		}//Topics Screen Up End
		
		//Monster List Up
		if(ScreenData == 12){
			if(XPosLoc == 30){
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
			}
			if(YPosLoc == 190 && XPosLoc == 5){
				if(StuffFound == ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
			}
			if(XPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 5){
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 30;
					MoveData[1] = 120;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
			}
			
			if(YPosLoc == 190 && XPosLoc == 140){
				if(StuffFound == ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 5){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 30;
					MoveData[1] = 120;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(StuffFound == ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
				if(StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 150;
					MoveData[1] = 120;
				}
			}
		}//Monster List Up End
		
		//Shop, WeaponSmith, Armorsmith, Tavern Up??
		
		return MoveData;
	}//CurserMove Up End
	
	public static int[] CurserMoveDown(int XPosLoc, int YPosLoc, int ScreenData,int StuffFound,int CurrentPage){
		int[] MoveData = new int[2];{
			MoveData[0] = YPosLoc;//Y
			MoveData[1] = XPosLoc;//X
			//MoveData[0] = 0;//Y Glitch
			//MoveData[1] = 0;//X Glitch
		}
		
		//ExamineScreen, BattleScreen, ItemScreen
		
		if(ScreenData == 5){//NoteScreen Down
			if(XPosLoc == 30){
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 4 && StuffFound > ((CurrentPage - 1)*10) + 10){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 4 && StuffFound <= ((CurrentPage - 1)*10) + 10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound == ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound == ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 60 && StuffFound == ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 30 && StuffFound > ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 30 && StuffFound == ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
			}
			if(XPosLoc == 120 && StuffFound > 5){
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 150;
					MoveData[1] = 120;
				}
				if(YPosLoc == 120 && StuffFound == ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
				if(YPosLoc == 90 && StuffFound == ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(YPosLoc == 60 && StuffFound == ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 30 && StuffFound > ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(YPosLoc == 30 && StuffFound == ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
			}
		}//NoteScreen Down End
		
		//Password Screen? Down
		
		if(ScreenData == 7){//Movescreen Down
			if(YPosLoc == 150 && StuffFound > 9){
				MoveData[0] = 165;
				MoveData[1] = 30;
			}
			if(YPosLoc == 150 && StuffFound == 9){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 135 && StuffFound > 8){
				MoveData[0] = 150;
				MoveData[1] = 30;
			}
			if(YPosLoc == 135 && StuffFound == 8){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 120 && StuffFound > 7){
				MoveData[0] = 135;
				MoveData[1] = 30;
			}
			if(YPosLoc == 120 && StuffFound == 7){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 105 && StuffFound > 6){
				MoveData[0] = 120;
				MoveData[1] = 30;
			}
			if(YPosLoc == 105 && StuffFound == 6){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 90 && StuffFound > 5){
				MoveData[0] = 105;
				MoveData[1] = 30;
			}
			if(YPosLoc == 90 && StuffFound == 5){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 75 && StuffFound > 4){
				MoveData[0] = 90;
				MoveData[1] = 30;
			}
			if(YPosLoc == 75 && StuffFound == 4){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 60 && StuffFound > 3){
				MoveData[0] = 75;
				MoveData[1] = 30;
			}
			if(YPosLoc == 60 && StuffFound == 3){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 45 && StuffFound > 2){
				MoveData[0] = 60;
				MoveData[1] = 30;
			}
			if(YPosLoc == 45 && StuffFound == 2){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 30 && StuffFound > 1){
				MoveData[0] = 45;
				MoveData[1] = 30;
			}
			if(YPosLoc == 30 && StuffFound == 1){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
		}//Movescreen Down End
		
		//CookScreen Down
		
		if(ScreenData == 14){//Inventor Screen Down
			//Update data and other stuff
			if(YPosLoc == 150 && StuffFound > 9){
				MoveData[0] = 165;
				MoveData[1] = 15;//30
			}
			if(YPosLoc == 150 && StuffFound == 9){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 135 && StuffFound > 8){
				MoveData[0] = 150;
				MoveData[1] = 15;
			}
			if(YPosLoc == 135 && StuffFound == 8){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 120 && StuffFound > 7){
				MoveData[0] = 135;
				MoveData[1] = 15;
			}
			if(YPosLoc == 120 && StuffFound == 7){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 105 && StuffFound > 6){
				MoveData[0] = 120;
				MoveData[1] = 15;
			}
			if(YPosLoc == 105 && StuffFound == 6){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 90 && StuffFound > 5){
				MoveData[0] = 105;
				MoveData[1] = 15;
			}
			if(YPosLoc == 90 && StuffFound == 5){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 75 && StuffFound > 4){
				MoveData[0] = 90;
				MoveData[1] = 15;
			}
			if(YPosLoc == 75 && StuffFound == 4){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 60 && StuffFound > 3){
				MoveData[0] = 75;
				MoveData[1] = 15;
			}
			if(YPosLoc == 60 && StuffFound == 3){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 45 && StuffFound > 2){
				MoveData[0] = 60;
				MoveData[1] = 15;
			}
			if(YPosLoc == 45 && StuffFound == 2){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
			if(YPosLoc == 30 && StuffFound > 1){
				MoveData[0] = 45;
				MoveData[1] = 15;
			}
			if(YPosLoc == 30 && StuffFound == 1){
				MoveData[0] = 190;
				MoveData[1] = 140;
			}
		}//Inventor Screen Down End
		
		//Elder Down
		
		//Topics Down (Topix)
		if(ScreenData == 9){
			if(XPosLoc == 30){
				if(YPosLoc == 150 && StuffFound > 4 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
				if(YPosLoc == 120 && StuffFound > 4 + (CurrentPage - 1)*10){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound == 4 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 90 && StuffFound > 3 + (CurrentPage - 1)*10){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound == 3 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 60 && StuffFound > 2 + (CurrentPage - 1)*10){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 60 && StuffFound == 2 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 30 && StuffFound > 1 + (CurrentPage - 1)*10){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 30 && StuffFound == 1 + (CurrentPage - 1)*10){//TODO Topics Down
					//if(StuffFound < 11){
						MoveData[0] = 190;
						MoveData[1] = 140;
					//}
					//if(StuffFound >= 11){
					//	Ypos = 190;
					//	Xpos = 5;
					//}
				}
			}//Topics Down: Xpos == 30
			if(XPosLoc == 120 && StuffFound > 5 + (CurrentPage - 1)*10){
				if(YPosLoc == 150 && StuffFound > 9 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 120 && StuffFound > 9 + (CurrentPage - 1)*10){
					MoveData[0] = 150;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150 && StuffFound == 9 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 90 && StuffFound > 8 + (CurrentPage - 1)*10){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150 && StuffFound == 8 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 60 && StuffFound > 7 + (CurrentPage - 1)*10){
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150 && StuffFound == 7 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 30 && StuffFound > 6 + (CurrentPage - 1)*10){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(YPosLoc == 150 && StuffFound == 6 + (CurrentPage - 1)*10){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
			}//Topics Down: Xpos == 120
			if(StuffFound <= 10 && YPosLoc == 190 && XPosLoc == 5){
				MoveData[1] = 140;
			}
		}//Topic Screen Down
		
		if(ScreenData == 12){//Monster List Down
			if(XPosLoc == 30){
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound == ((CurrentPage - 1)*10) + 4){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound == ((CurrentPage - 1)*10) + 3){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 60 && StuffFound == ((CurrentPage - 1)*10) + 2){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
				if(YPosLoc == 30 && StuffFound > ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 30 && StuffFound == ((CurrentPage - 1)*10) + 1){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
			}//Monster List Down X = 30
			if(XPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 5){
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 150;
					MoveData[1] = 120;
				}
				if(YPosLoc == 120 && StuffFound == ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 120;
					MoveData[1] = 120;
				}
				if(YPosLoc == 90 && StuffFound == ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 7){//MCurrentPage
					MoveData[0] = 90;
					MoveData[1] = 120;
				}
				if(YPosLoc == 60 && StuffFound == ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
				if(YPosLoc == 30 && StuffFound > ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 60;
					MoveData[1] = 120;
				}
				if(YPosLoc == 30 && StuffFound == ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 190;
					MoveData[1] = 140;
				}
			}//Monster List Down X = 120
		}//Monster List Down End
		
		//Shop Weaponsmith Armorsmih Tavern Down
		
		return MoveData;
	}//CurseMove Down End
	
	public static int[] CurserMoveLeft(int XPosLoc, int YPosLoc, int ScreenData,int StuffFound,int CurrentPage){
		int[] MoveData = new int[2];{
			MoveData[0] = YPosLoc;//Y
			MoveData[1] = XPosLoc;//X
			//MoveData[0] = 0;//Y Glitch
			//MoveData[1] = 0;//X Glitch
		}
		
		//Battle Screen, Examine Screen Left
		
		if(ScreenData == 5){//NoteScreen Left
			if(XPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 5){
			if(YPosLoc == 30){
				MoveData[0] = 30;
				MoveData[1] = 30;
			}
			if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 6){
				MoveData[0] = 60;
				MoveData[1] = 30;
			}
			if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 7){
				MoveData[0] = 90;
				MoveData[1] = 30;
			}
			if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 8){
				MoveData[0] = 120;
				MoveData[1] = 30;
			}
			if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
				MoveData[0] = 150;
				MoveData[1] = 30;
			}
			}
			if(YPosLoc == 190 && XPosLoc == 140 && StuffFound > 10){
				MoveData[0] = 190;
				MoveData[1] = 5;
			}
		}//NoteScreen Left End
		
		//Movescreen Left
		
		//Inventor Left, Elder Left
		
		if(ScreenData == 9){//TOpics Left
			if(XPosLoc == 120 && StuffFound > 5){
				if(YPosLoc == 30){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(YPosLoc == 60 && StuffFound > 6){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound > 7){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound > 8){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(YPosLoc == 150 && StuffFound > 9){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				}
				if(YPosLoc == 190 && XPosLoc == 140 && StuffFound > 10){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
		}//Topics Left End
		
		if(ScreenData == 12){//Monster List Left
			if(XPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 5){
				if(YPosLoc == 30){
					MoveData[0] = 30;
					MoveData[1] = 30;
				}
				if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 6){
					MoveData[0] = 60;
					MoveData[1] = 30;
				}
				if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 7){
					MoveData[0] = 90;
					MoveData[1] = 30;
				}
				if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 8){
					MoveData[0] = 120;
					MoveData[1] = 30;
				}
				if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
					MoveData[0] = 150;
					MoveData[1] = 30;
				}
				}
				if(YPosLoc == 190 && XPosLoc == 140){
					MoveData[0] = 190;
					MoveData[1] = 5;
				}
		}//Monster List Left End
		
		return MoveData;
	}//CurserMove Left End
	
	public static int[] CurserMoveRight(int XPosLoc, int YPosLoc, int ScreenData,int StuffFound,int CurrentPage){
		int[] MoveData = new int[2];{
			MoveData[0] = YPosLoc;//Y
			MoveData[1] = XPosLoc;//X
			//MoveData[0] = 0;//Y Glitch
			//MoveData[1] = 0;//X Glitch
		}
		
		//NoteScreen Right
		//Only if Notes on page more than 5 or next/back
		if(ScreenData == 5 && StuffFound != 0){
			if(XPosLoc == 30 && StuffFound > ((CurrentPage - 1)*10) + 5){
			if(YPosLoc == 30){
				MoveData[0] = 30;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 6){
				MoveData[0] = 60;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 7){
				MoveData[0] = 90;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 8){
				MoveData[0] = 120;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
				MoveData[0] = 150;//Y
				MoveData[1] = 120;//X
			}
			}
			if(YPosLoc == 190 && XPosLoc == 5){
				MoveData[0] = 190;//Y
				MoveData[1] = 140;//X
			}
		}//NoteScreen Right End
		
		//Topics Screen Right
		if(ScreenData == 9){
			if(XPosLoc == 30 && StuffFound > 5 + (CurrentPage - 1)*10){
				if(YPosLoc == 30){
					MoveData[0] = 30;//y
					MoveData[1] = 120;//X
				}
				if(YPosLoc == 60 && StuffFound > 6 + (CurrentPage - 1)*10){
					MoveData[0] = 60;//Y
					MoveData[1] = 120;
				}
				if(YPosLoc == 90 && StuffFound > 7 + (CurrentPage - 1)*10){
					MoveData[0] = 90;//Y
					MoveData[1] = 120;//X
				}
				if(YPosLoc == 120 && StuffFound > 8 + (CurrentPage - 1)*10){
					MoveData[0] = 120;//Y
					MoveData[1] = 120;//X
				}
				if(YPosLoc == 150 && StuffFound > 9 + (CurrentPage - 1)*10){
					MoveData[0] = 150;//Y
					MoveData[1] = 120;//X
				}
			}
			if(YPosLoc == 190 && XPosLoc == 5){
				MoveData[0] = 190;//Y
				MoveData[1] = 140;//X
			}
		}//Topics Right End
		
		//Monster List Right
		if(ScreenData == 12 && StuffFound != 0){
			if(XPosLoc == 30 && StuffFound > ((CurrentPage - 1)*10) + 5){
			if(YPosLoc == 30){
				MoveData[0] = 30;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 60 && StuffFound > ((CurrentPage - 1)*10) + 6){
				MoveData[0] = 60;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 90 && StuffFound > ((CurrentPage - 1)*10) + 7){
				MoveData[0] = 90;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 120 && StuffFound > ((CurrentPage - 1)*10) + 8){
				MoveData[0] = 120;//Y
				MoveData[1] = 120;//X
			}
			if(YPosLoc == 150 && StuffFound > ((CurrentPage - 1)*10) + 9){
				MoveData[0] = 150;//Y
				MoveData[1] = 120;//X
			}
			}
			if(YPosLoc == 190 && XPosLoc == 5){
				MoveData[0] = 190;//Y
				MoveData[1] = 140;//X
			}
		}//Monster List Right End
		
		return MoveData;
	}//CurserMove Right End
}
