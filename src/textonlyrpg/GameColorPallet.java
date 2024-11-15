package textonlyrpg;

import java.awt.Color;

public class GameColorPallet {
	Color BGColor;
	Color TextColor;
	Color CurserColor;
	Color CurserCutsceneColor;
	Color CurserCutsceneOutlineColor;
	Color CurserMonster;
	
	//RedOrange new Color(245 , 133, 10)
	
	//poison	new Color(195 , 0, 200)
	//Cursed	new Color(245 , 133, 10)
	//Sticky	Color.magenta
	//???		Color.gray
	//All		Color.orange
	//Barrier	Color.CYAN
	
	//Negative
	//poison	Color.yellow
	//Cursed	Color.cyan
	//Sticky	Color.BLUE
	//???		Color.LIGHT_GRAY
	//All		new Color(195 , 0, 200)
	//Barrier	Color.RED
	
	//poisonColor
	//CursedColor
	//StickyColor
	//UnknownColor
	//AllColor
	//BarrierColor
	
	public GameColorPallet(Color BGColor, Color TextColor, Color CurserColor, Color CurserCutsceneColor, Color CurserCutsceneOutlineColor,
			Color CurserMonster) {
		this.BGColor = BGColor;
		this.TextColor = TextColor;
		this.CurserColor = CurserColor;
		this.CurserCutsceneColor = CurserCutsceneColor;
		this.CurserCutsceneOutlineColor = CurserCutsceneOutlineColor;
		this.CurserMonster = CurserMonster;
	}
	
	public static GameColorPallet GetGameColorPallet(int ColorPalletIDNumber) {
		GameColorPallet NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.BLACK
				, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.BLUE, 
				/*CurserMonster*/Color.gray);
		
				//Nothingness/Fog
				if(ColorPalletIDNumber == 0) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.GRAY
							, /*Curser*/Color.GRAY, /*CutsceneCurser*/Color.LIGHT_GRAY, /*CutsceneCurserOutline*/Color.black, 
							/*CurserMonster*/Color.LIGHT_GRAY);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Normal
				if(ColorPalletIDNumber == 1) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.BLUE, 
							/*CurserMonster*/Color.gray);
				}
				//poison	new Color(195 , 0, 200)
				//Cursed	new Color(245 , 133, 10)
				//Sticky	Color.magenta
				//???		Color.gray
				//All		Color.orange
				//Barrier	Color.CYAN
				
				//Mirror
				if(ColorPalletIDNumber == 2) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.BLUE, 
							/*CurserMonster*/Color.gray);
				}
				//poison	new Color(195 , 0, 200)
				//Cursed	new Color(245 , 133, 10)
				//Sticky	Color.magenta
				//???		Color.gray
				//All		Color.orange
				//Barrier	Color.CYAN
				
				//Negative
				if(ColorPalletIDNumber == 3) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.BLACK, /*TextColor*/Color.WHITE
							, /*Curser*/Color.WHITE, /*CutsceneCurser*/new Color(245 , 133, 10), /*CutsceneCurserOutline*/Color.YELLOW, 
							/*CurserMonster*/Color.lightGray);
				}
				//poison	Color.yellow
				//Cursed	Color.cyan
				//Sticky	Color.BLUE
				//???		Color.LIGHT_GRAY
				//All		new Color(195 , 0, 200)
				//Barrier	Color.RED
				
				//ForbiddonArea/FIRE!
				if(ColorPalletIDNumber == 4) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.RED, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.BLUE, /*CutsceneCurserOutline*/Color.BLUE, 
							/*CurserMonster*/new Color(198 , 59, 59));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Glitch!
				if(ColorPalletIDNumber == 5) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.BLUE, 
							/*CurserMonster*/Color.gray);
				}
				//poison	new Color(195 , 0, 200)
				//Cursed	new Color(245 , 133, 10)
				//Sticky	Color.magenta
				//???		Color.gray
				//All		Color.orange
				//Barrier	Color.CYAN
				
				//Mystery/Admin
				if(ColorPalletIDNumber == 6) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.LIGHT_GRAY, /*TextColor*/Color.DARK_GRAY
							, /*Curser*/Color.DARK_GRAY, /*CutsceneCurser*/Color.YELLOW, /*CutsceneCurserOutline*/Color.ORANGE, 
							/*CurserMonster*/Color.GREEN);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Midnight
				if(ColorPalletIDNumber == 7) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(10 , 10, 100), /*TextColor*/Color.WHITE
							, /*Curser*/Color.WHITE, /*CutsceneCurser*/Color.YELLOW, /*CutsceneCurserOutline*/Color.ORANGE, 
							/*CurserMonster*/new Color(71 , 140, 219));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Water
				if(ColorPalletIDNumber == 8) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.BLUE, /*TextColor*/Color.CYAN
							, /*Curser*/Color.CYAN, /*CutsceneCurser*/new Color(125 , 218, 88), /*CutsceneCurserOutline*/Color.green, 
							/*CurserMonster*/new Color(219 , 71, 154));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Green
				if(ColorPalletIDNumber == 9) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(48, 252, 1), /*TextColor*/new Color(23, 18, 108)
							, /*Curser*/new Color(23, 18, 108), /*CutsceneCurser*/new Color(204 , 108, 231), /*CutsceneCurserOutline*/new Color(199 , 173, 248), 
							/*CurserMonster*/Color.LIGHT_GRAY);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//CodeX
				if(ColorPalletIDNumber == 10) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(23, 18, 108), /*TextColor*/new Color(48, 252, 1)
							, /*Curser*/new Color(48, 252, 1), /*CutsceneCurser*/new Color(199 , 173, 248), /*CutsceneCurserOutline*/new Color(204 , 108, 231), 
							/*CurserMonster*/new Color(54, 153, 154));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Memory
				if(ColorPalletIDNumber == 11) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(232, 225, 175), /*TextColor*/new Color(92, 64, 16)
							, /*Curser*/new Color(92, 64, 16), /*CutsceneCurser*/Color.ORANGE, /*CutsceneCurserOutline*/Color.ORANGE, 
							/*CurserMonster*/new Color(112, 114, 151));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Skybox
				if(ColorPalletIDNumber == 12) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(188, 252, 253), /*TextColor*/new Color(120, 122, 96)
							, /*Curser*/new Color(120, 122, 96), /*CutsceneCurser*/Color.RED, /*CutsceneCurserOutline*/Color.RED, 
							/*CurserMonster*/Color.YELLOW);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Gold
				if(ColorPalletIDNumber == 13) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(255, 237, 115), /*TextColor*/new Color(127, 104, 56)
							, /*Curser*/new Color(127, 104, 56), /*CutsceneCurser*/Color.RED, /*CutsceneCurserOutline*/Color.RED, 
							/*CurserMonster*/new Color(40, 240, 22));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Arena
				if(ColorPalletIDNumber == 14) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(229, 219, 151), /*TextColor*/new Color(70, 67, 52)
							, /*Curser*/new Color(70, 67, 52), /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/Color.RED);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Inverted
				if(ColorPalletIDNumber == 15) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(253, 202, 243), /*TextColor*/new Color(67, 19, 87)
							, /*Curser*/new Color(67, 19, 87), /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/Color.MAGENTA);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Haunted
				if(ColorPalletIDNumber == 16) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(170, 207, 236), /*TextColor*/new Color(91, 45, 123)
							, /*Curser*/new Color(91, 45, 123), /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/new Color(175, 2, 227));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Field
				if(ColorPalletIDNumber == 17) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(190, 252, 208), /*TextColor*/new Color(128, 132, 84)
							, /*Curser*/new Color(128, 132, 84), /*CutsceneCurser*/Color.GRAY, /*CutsceneCurserOutline*/Color.LIGHT_GRAY, 
							/*CurserMonster*/new Color(187, 196, 104));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Mountain
				if(ColorPalletIDNumber == 18) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(241, 185, 94), /*TextColor*/new Color(147, 142, 98)
							, /*Curser*/new Color(147, 142, 98), /*CutsceneCurser*/Color.GRAY, /*CutsceneCurserOutline*/Color.LIGHT_GRAY, 
							/*CurserMonster*/new Color(185, 160, 123));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Desert
				if(ColorPalletIDNumber == 19) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(250, 249, 211), /*TextColor*/new Color(192, 190, 136)
							, /*Curser*/new Color(192, 190, 136), /*CutsceneCurser*/new Color(157, 136, 192), /*CutsceneCurserOutline*/new Color(157, 136, 192), 
							/*CurserMonster*/new Color(192, 136, 136));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Castle
				if(ColorPalletIDNumber == 20) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.LIGHT_GRAY, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/new Color(192, 136, 136));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Dark Area
				if(ColorPalletIDNumber == 21) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(149, 136, 192), /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/new Color(175, 227, 161), /*CutsceneCurserOutline*/new Color(175, 227, 161), 
							/*CurserMonster*/new Color(213, 50, 110));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Forest
				if(ColorPalletIDNumber == 22) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(157, 211, 106), /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.CYAN, 
							/*CurserMonster*/new Color(211, 188, 106));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Snowy Mountain
				if(ColorPalletIDNumber == 23) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/new Color(121, 182, 216)
							, /*Curser*/new Color(121, 182, 216), /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.CYAN, 
							/*CurserMonster*/new Color(185, 121, 216));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Cave
				if(ColorPalletIDNumber == 24) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(181, 188, 199), /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/new Color(47, 138, 64), /*CutsceneCurserOutline*/new Color(47, 138, 64), 
							/*CurserMonster*/new Color(185, 121, 216));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Cabin
				if(ColorPalletIDNumber == 25) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(239, 226, 168), /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.RED, /*CutsceneCurserOutline*/Color.RED, 
							/*CurserMonster*/Color.CYAN);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Spooky
				if(ColorPalletIDNumber == 26) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.ORANGE, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/new Color(209, 37, 252));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Mixed
				if(ColorPalletIDNumber == 27) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.RED, /*TextColor*/Color.BLUE
							, /*Curser*/Color.GREEN, /*CutsceneCurser*/Color.YELLOW, /*CutsceneCurserOutline*/Color.YELLOW, 
							/*CurserMonster*/Color.GRAY);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Boss
				if(ColorPalletIDNumber == 28) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.lightGray, /*TextColor*/Color.RED
							, /*Curser*/Color.GREEN, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.CYAN, 
							/*CurserMonster*/new Color(148, 214, 226));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Slime
				if(ColorPalletIDNumber == 29) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(187, 250, 171), /*TextColor*/Color.BLUE
							, /*Curser*/Color.BLUE, /*CutsceneCurser*/Color.RED, /*CutsceneCurserOutline*/Color.RED, 
							/*CurserMonster*/new Color(189, 25, 231));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Golem
				if(ColorPalletIDNumber == 30) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(224, 218, 184), /*TextColor*/new Color(136, 108, 61)
							, /*Curser*/new Color(136, 108, 61), /*CutsceneCurser*/Color.RED, /*CutsceneCurserOutline*/Color.RED, 
							/*CurserMonster*/Color.BLUE);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Ghost
				if(ColorPalletIDNumber == 31) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.gray, /*TextColor*/Color.CYAN
							, /*Curser*/Color.BLUE, /*CutsceneCurser*/Color.YELLOW, /*CutsceneCurserOutline*/Color.YELLOW, 
							/*CurserMonster*/new Color(189, 25, 231));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Armor
				if(ColorPalletIDNumber == 32) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.LIGHT_GRAY, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/new Color(192, 136, 136));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//*
				if(ColorPalletIDNumber == 33) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(59, 255, 5), /*TextColor*/new Color(124, 46, 136)
							, /*Curser*/Color.RED, /*CutsceneCurser*/Color.BLUE, /*CutsceneCurserOutline*/Color.BLUE, 
							/*CurserMonster*/new Color(124, 46, 136));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//DOPPLEGANGER
				if(ColorPalletIDNumber == 34) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(93, 93, 181), /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.WHITE, /*CutsceneCurserOutline*/Color.WHITE, 
							/*CurserMonster*/Color.RED);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				
		return NewPallet;
	}
	
}//End of class
