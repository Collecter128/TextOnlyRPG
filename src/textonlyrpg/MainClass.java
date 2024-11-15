package textonlyrpg;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class MainClass extends JApplet{
	
	//Initialize variables
			
			int AppletsizeX = 200;
			int AppletsizeY = 200;
			Image TestImage; //Test Image?
			Graphics IG; //Image Graphics
			//AudioClip AudioS;
			//Image ImageName;
			Random generator = new Random();

				//TODO BattleDataRewrite?
				
				int MPause = 0;
				//Recipes
				
				
				//Tavern Rumors: Note, Sometimes 
				static int[] TavernUnlocked = new int[]{1,1};{
					//TavernUnlocked[1] = 1;
					
//					if(DiscussionsFound >=2){
//						Topic2 = TopicList[1];}
				}
				//x;
				static int[] TavernTopics = new int[]{21,22};{
					//TavernUnlocked[1] = 1;
					
//					if(DiscussionsFound >=2){
//						Topic2 = TopicList[1];}
				}

				static int[] SEventFlag = new int[]{
						//New Game Cutscene
						0,//0 = Fight TestBoss
						0,//1 = Find TestArea3
						0,//2 = Find TestArea4
						0,//3 = Field on Fire
						1,//4 = First Meeting with the Elder
						1,//5 = The First Slime
						0,//6 = The Second Slime
						0,//7 = The Third Slime
						0,//8 = The Fourth Slime
						0,//9 = The Fifth Slime
						0,//10 = Giant Slime
						0,//11 = Talking to the Elder after fighting Giant Slime
						0//12 = Conversation with ???
						};{//Story Event Flag
				}
				static int SEventSecond = 1;
				
				int[] Updater;
				
				static int XBattleMode = 0;//Xtra, Xtreme? Maybe just X...
					//0 = No XMode Enemies
					//1 = XMode enemies can happen at random Chance, sometimes bosses too.
					//2 = X Bosses always happen!
					//3 = XEnemies, but no XBosses
					//4 = XBosses, No X Enemies
					//5 = All Enemies are always in XMode!
					//6 = X Enemies always happen, X Bosses not around...
					//7 = Mode X (Both enemies and bosses always X)
					//8 = Bosses always show up in XForm, but enemies are normal
					//9 = Enemies are Always X Form, Bosses Only Randomly
				
					//10 = Rare enemies can happen at random Chance
					//11 = R Bosses always happen!
					//12 = REnemies, but no RBosses
					//13 = RBosses, No R Enemies
					//14 = All Enemies are always Rare!
					//15 = R Enemies always happen, R Bosses not around...
					//16 = Mode R (Both Bosses and enemies are always R Mode)
					//17 = Bosses always show up in Rare, but enemies are normal
					//18 = Enemies are Always rare From, Bosses Only Randomly
				
					//19 All three types of enemies happen randomly!
					//20 All enemies are rare, sometimes XMode
					//21 All Enemies are XMode, sometimes Rare
				
					//22 Bosses are sometimes X or sometimes R
					//23 Bosses are always rare, sometimes X
					//24 Bosses are sometimes R or always X
				
					//25 Bosses are always Rare, Enemies always X
					//26 Bosses are always X, enemies are always R
					//27 Bosses sometimes X, enemies always R
					//28 Bosses sometimes R, enemies sometimes X
				
					//29 Bosses and enemies sometimes happen R or X randomly
				
					//30	Bosses sometimes rare			Enemies always X
					//31   	Bosses sometimes X				Enemies sometimes R
					//32    Bosses Always X					enemies sometimes R
					//33    Bosses always rare				Enemies sometimes X
				
					//Or
					//0 Enemies are always normal
					//1 Enemies are sometimes Xmode
					//2 Enemies are sometimes rare
					//3 Enemies are sometimes XMode or Rare
					//4 Enemies are always rare
					//5 Enemies are always X Mode
					//6 Enemies are Rare, sometimes Xmode
					//7 Enemies are Xmode, sometimes rare
				
				int XModifier = 0;
				
				public void init() {
					JFrame Window = new JFrame();
					Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Window.setResizable(true);
					Window.setTitle("Text Only RPG");
					
					GamePanel gamepanel = new GamePanel();
					Window.add(gamepanel);
					
					Window.pack();
				
					Window.setLocationRelativeTo(null);
					Window.setVisible(true);
					
					gamepanel.Startgamethread();
				}
	
	public static void main (String[] args) {

		JFrame Window = new JFrame();
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.setResizable(true);
		Window.setTitle("Text Only RPG");
		
		GamePanel gamepanel = new GamePanel();
		Window.add(gamepanel);
		
		Window.pack();
	
		Window.setLocationRelativeTo(null);
		Window.setVisible(true);
		
		gamepanel.Startgamethread();
		
	}//Main End
	
//	public static void drawSmallBitofStuff(Graphics maing) {
//		maing.drawString("Hp:" + GlitchHPString(DisplayM.MHp1, DisplayM.MHp2, DisplayM.MHp3, DisplayM.MHp4, HpType), 150, 90);
//	}
	
//	public static void PlayerPressedUp() {
//		
//	}//Player Pressed Up End
//	
//	public static void PlayerPressedDown() {
//		
//	}//Player Pressed Down End
//	
//	public static void PlayerPressedLeft() {
//		
//	}//Player Pressed Left End
	
//	public static void PlayerPressedRight() {
//		//Password Screen Right
//		if(ScreenType == 0){
//			if(Ypos == 190 && Xpos == 55){
//				Xpos = 130;
//			}
//			if(Ypos == 190 && Xpos == 7){
//				Xpos = 55;
//			}
//		}
//	}//Player Pressed Right End
//	
//	public static void PlayerPressedEnter() {
//		
//	}//Player Pressed Enter End
	
	public static String GlitchHPString(int D1, int D2, int D3, int D4, int HPType){
		String Value = "";
		String Digit1 = "";
		String Digit2 = "";
		String Digit3 = "";
		String Digit4 = "";

		if((D1 < 10 && D1 != 0)|| (HPType == 3 && D1 != 0)){
			Digit1 = Integer.toString(D1);
		}
		else if((D1 >= 10 || D1 <= 25) && HPType != 3){
			Digit1 = Character.toString((char)(D1 + 55));
		}
//		else if(D1 == 0 ){//&& HPType != 2
//			Digit1 = " ";
//			//System.out.println("Here it is?");
//		}
		else //if(D1 != 0){
			Digit1 = Integer.toString(D1);
		//}
			//Something else like "!" ?
		
		if((D2 < 10 && D2 != 0) || (D2 == 0 && D1 != 0 && HPType != 2)|| HPType == 3){//|| (D2 == 0 && D1 != 0 && HPType != 2
			Digit2 = Integer.toString(D2);
		}
		else if((D2 >= 10 || D2 <= 35) && HPType != 3){
			Digit2 = Character.toString((char)(D2 + 55));
		}
//		else if(D1 == 0 && D2 == 0 && HPType != 2){
//			Digit2 = " ";
//		}
		else //if(D1 != 0 || D2 != 0){
			Digit2 = Integer.toString(D2);
		//}
			//Something else like "!" ?
		
		if((D3 < 10 && D3 != 0) || (D3 == 0 && (D1 != 0 || D2 != 0) && HPType != 2)|| HPType == 3){
			Digit3 = Integer.toString(D3);
		}
		else if((D3 >= 10 || D3 <= 25) && HPType != 3){
			Digit3 = Character.toString((char)(D3 + 55));
		}
//		else if(D1 == 0 && D2 == 0 && D3 == 0 && HPType != 2){
//			Digit3 = " ";
//		}
		else
			Digit3 = Integer.toString(D3);
			//Something else like "!" ?
		
		if(D4 < 10 || HPType == 3){
			Digit4 = Integer.toString(D4);
		}
		else if((D4 >= 10 || D4 <= 25) && HPType != 3){
			Digit4 = Character.toString((char)(D4 + 55));
		}
		else
			Digit4 = Integer.toString(D4);
			//Something else like "!" ?
		
		if(HPType == 0){//HP Type is Null
			Value = "    ";
		}
		else if(GamePanel.ScreenMode !=2){
			if(D1 != 0 || HPType == 2){
				Value = Digit1 + Digit2 + Digit3 + Digit4;
			}
			else if(D1 == 0 && D2 != 0){
				Value = Digit2 + Digit3 + Digit4;
			}
			else if(D1 == 0 && D2 == 0 && D3 != 0){
				Value = Digit3 + Digit4;
			}
			else {
				Value = Digit4;
			}
		}
		else if(GamePanel.ScreenMode ==2){
			if(D1 != 0 || HPType == 2){
				Value = Digit4 + Digit3 + Digit2 + Digit1;
			}
			else if(D1 == 0 && D2 != 0){
				Value = Digit4 + Digit3 + Digit2;
			}
			else if(D1 == 0 && D2 == 0 && D3 != 0){
				Value = Digit4 + Digit3;
			}
			else{
				Value = Digit4;
			}
		}
		else {
			Value = Digit4;
		}
		
		//Value = Digit1 + Digit2 + Digit3 + Digit4;
		
		return Value;
	}//DrawGlitched HP End
	
	
	
	
	
	
	//Update Cook?
	
	//Weapon?
	
	//Armor?
	
	
}//Main Class End
