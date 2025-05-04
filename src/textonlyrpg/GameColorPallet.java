package textonlyrpg;

import java.awt.Color;

public class GameColorPallet {
	Color BGColor;
	Color TextColor;
	Color CurserColor;
	Color CurserCutsceneColor;
	Color CurserCutsceneOutlineColor;
	Color CurserMonster;
	Color PoisonTextColor = new Color(195 , 0, 200);
	Color CursedTextColor = new Color(245 , 133, 10);
	Color StickyTextColor = Color.magenta;
	Color UnknownTextColor = Color.gray;
	Color AllTextColor = Color.orange;
	Color BarrierTextColor = Color.CYAN;
	
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
			Color CurserMonster, Color PoisonTextColor, Color CursedTextColor, Color StickyTextColor, Color UnknownTextColor, Color AllTextColor, Color BarrierTextColor) {
		this.BGColor = BGColor;
		this.TextColor = TextColor;
		this.CurserColor = CurserColor;
		this.CurserCutsceneColor = CurserCutsceneColor;
		this.CurserCutsceneOutlineColor = CurserCutsceneOutlineColor;
		this.CurserMonster = CurserMonster;
		this.PoisonTextColor = PoisonTextColor;
		this.CursedTextColor = CursedTextColor;
		this.StickyTextColor = StickyTextColor;
		this.UnknownTextColor = UnknownTextColor;
		this.AllTextColor = AllTextColor;
		this.BarrierTextColor = BarrierTextColor;
		
	}
	
	public static GameColorPallet GetGameColorPallet(int ColorPalletIDNumber) {
		GameColorPallet NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.BLACK
				, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.BLUE, 
				/*CurserMonster*/Color.gray, /*Poison*/ new Color(195 , 0, 200), /*Curse*/ new Color(245 , 133, 10), /*Sticky*/ Color.magenta, 
				/*Unknown*/ Color.gray, /*All*/ Color.orange, /*Barrier*/Color.CYAN);
		    
		// ,/*Poison*/ , /*Curse*/ , /*Sticky*/ , /*Unknown*/ , /*All*/ , /*Barrier*/
				//Nothingness/Fog
				if(ColorPalletIDNumber == 0) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.GRAY
							, /*Curser*/Color.GRAY, /*CutsceneCurser*/Color.LIGHT_GRAY, /*CutsceneCurserOutline*/Color.black, 
							/*CurserMonster*/Color.LIGHT_GRAY, /*Poison*/new Color(195 , 0, 255), /*Curse*/ new Color(74 , 0, 255), /*Sticky*/ Color.orange, 
							/*Unknown*/ Color.black, /*All*/ Color.red, /*Barrier*/Color.blue);
				}
				//poisonColor	new Color(195 , 0, 255)
				//CursedColor	new Color(74 , 0, 255)
				//StickyColor	Color.orange
				//UnknownColor	Color.black
				//AllColor		Color.magenta
				//BarrierColor	Color.blue
				
				//Normal
				if(ColorPalletIDNumber == 1) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.BLUE, 
							/*CurserMonster*/Color.gray, /*Poison*/ new Color(195 , 0, 200), /*Curse*/ new Color(245 , 133, 10), /*Sticky*/ Color.magenta, 
							/*Unknown*/ Color.gray, /*All*/ Color.orange, /*Barrier*/Color.CYAN);
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
							/*CurserMonster*/Color.gray, /*Poison*/new Color(195 , 0, 200), /*Curse*/ new Color(245 , 133, 10), /*Sticky*/ Color.magenta, 
							/*Unknown*/ Color.gray, /*All*/ Color.orange, /*Barrier*/Color.CYAN);
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
							/*CurserMonster*/Color.lightGray, /*Poison*/Color.yellow, /*Curse*/ Color.cyan, /*Sticky*/ Color.BLUE, 
							/*Unknown*/ Color.LIGHT_GRAY, /*All*/ new Color(195 , 0, 200), /*Barrier*/Color.RED);
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
							/*CurserMonster*/new Color(198 , 59, 59), /*Poison*/Color.BLACK, /*Curse*/ Color.BLACK, /*Sticky*/ Color.BLACK, 
							/*Unknown*/ Color.BLACK, /*All*/ Color.BLACK, /*Barrier*/Color.BLACK);
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
							/*CurserMonster*/Color.gray, /*Poison*/new Color(195 , 0, 200), /*Curse*/ new Color(245 , 133, 10), /*Sticky*/ Color.magenta, 
							/*Unknown*/ Color.gray, /*All*/ Color.orange, /*Barrier*/Color.CYAN);
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
							/*CurserMonster*/Color.GREEN, /*Poison*/Color.WHITE, /*Curse*/ Color.CYAN, /*Sticky*/ Color.YELLOW, 
							/*Unknown*/ Color.BLACK, /*All*/ new Color(255 , 178, 0), /*Barrier*/Color.CYAN);
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
							/*CurserMonster*/new Color(71 , 140, 219), /*Poison*/Color.yellow, /*Curse*/ Color.pink, /*Sticky*/ Color.orange, 
							/*Unknown*/ Color.LIGHT_GRAY, /*All*/ Color.WHITE, /*Barrier*/Color.pink);
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
							/*CurserMonster*/new Color(219 , 71, 154), /*Poison*/new Color(225 , 0, 255), /*Curse*/ Color.GREEN, /*Sticky*/ Color.RED, 
							/*Unknown*/ Color.white, /*All*/ Color.yellow, /*Barrier*/new Color(125 , 255, 0));
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
							/*CurserMonster*/Color.LIGHT_GRAY, /*Poison*/new Color(225 , 0, 255), /*Curse*/ new Color(181 , 196, 154), /*Sticky*/ Color.orange, 
							/*Unknown*/ Color.LIGHT_GRAY, /*All*/ Color.blue, /*Barrier*/Color.BLACK);
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
							/*CurserMonster*/new Color(54, 153, 154), /*Poison*/Color.pink, /*Curse*/ Color.cyan, /*Sticky*/ Color.CYAN, 
							/*Unknown*/ Color.LIGHT_GRAY, /*All*/Color.yellow , /*Barrier*/Color.white);
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
							/*CurserMonster*/new Color(112, 114, 151), /*Poison*/new Color(92, 64, 16), /*Curse*/ new Color(92, 64, 16), /*Sticky*/ new Color(92, 64, 16), 
							/*Unknown*/ new Color(92, 64, 16), /*All*/ new Color(92, 64, 16), /*Barrier*/new Color(92, 64, 16));
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
							/*CurserMonster*/Color.YELLOW, /*Poison*/Color.blue, /*Curse*/ Color.green, /*Sticky*/ Color.orange, 
							/*Unknown*/ Color.red, /*All*/ Color.red, /*Barrier*/Color.LIGHT_GRAY);
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
							/*CurserMonster*/new Color(40, 240, 22), /*Poison*/Color.GREEN, /*Curse*/ Color.blue, /*Sticky*/ new Color(127, 135, 44), 
							/*Unknown*/ Color.white, /*All*/ Color.ORANGE, /*Barrier*/Color.RED);
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
							/*CurserMonster*/Color.RED, /*Poison*/new Color(233, 72, 255), /*Curse*/ new Color(72, 255, 133), /*Sticky*/ Color.YELLOW, 
							/*Unknown*/ Color.WHITE, /*All*/ new Color(148, 132, 50), /*Barrier*/Color.cyan);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Inverted/Pink
				if(ColorPalletIDNumber == 15) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(253, 202, 243), /*TextColor*/new Color(67, 19, 87)
							, /*Curser*/new Color(67, 19, 87), /*CutsceneCurser*/Color.GREEN, /*CutsceneCurserOutline*/Color.GREEN, 
							/*CurserMonster*/Color.MAGENTA, /*Poison*/Color.green, /*Curse*/ Color.blue, /*Sticky*/ Color.orange, 
							/*Unknown*/ Color.BLACK, /*All*/ Color.orange, /*Barrier*/new Color(72, 255, 190));
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
							/*CurserMonster*/new Color(175, 2, 227), /*Poison*/new Color(39, 130, 98), /*Curse*/ new Color(130, 39, 130), /*Sticky*/ Color.orange, 
							/*Unknown*/ Color.BLACK, /*All*/ Color.BLUE, /*Barrier*/Color.red);
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
							/*CurserMonster*/new Color(187, 196, 104), /*Poison*/new Color(130, 39, 130), /*Curse*/ new Color(130, 39, 130), /*Sticky*/ new Color(163, 173, 58), 
							/*Unknown*/ Color.GRAY, /*All*/ Color.blue, /*Barrier*/Color.orange);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Mountain
				if(ColorPalletIDNumber == 18) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(241, 185, 94), /*TextColor*/new Color(48, 39, 17)
							, /*Curser*/new Color(48, 39, 17), /*CutsceneCurser*/Color.GRAY, /*CutsceneCurserOutline*/Color.LIGHT_GRAY, 
							/*CurserMonster*/new Color(185, 160, 123), /*Poison*/new Color(173, 58, 144), /*Curse*/ Color.BLUE, /*Sticky*/ Color.YELLOW, 
							/*Unknown*/ Color.GRAY, /*All*/ Color.GREEN, /*Barrier*/Color.cyan);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Desert
				if(ColorPalletIDNumber == 19) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(250, 249, 211), /*TextColor*/new Color(48, 39, 17)
							, /*Curser*/new Color(48, 39, 17), /*CutsceneCurser*/new Color(157, 136, 192), /*CutsceneCurserOutline*/new Color(157, 136, 192), 
							/*CurserMonster*/new Color(192, 136, 136), /*Poison*/Color.GREEN, /*Curse*/ Color.BLUE, /*Sticky*/new Color(129, 39, 130) , 
							/*Unknown*/ Color.GRAY, /*All*/ Color.MAGENTA, /*Barrier*/Color.blue);
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
							/*CurserMonster*/new Color(192, 136, 136), /*Poison*/new Color(0, 148, 34), /*Curse*/ Color.MAGENTA, /*Sticky*/ new Color(148, 134, 0), 
							/*Unknown*/ Color.black, /*All*/ Color.cyan, /*Barrier*/Color.RED);
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
							/*CurserMonster*/new Color(213, 50, 110), /*Poison*/Color.RED, /*Curse*/ Color.blue, /*Sticky*/ new Color(230, 197, 50), 
							/*Unknown*/ Color.LIGHT_GRAY, /*All*/ Color.white, /*Barrier*/Color.PINK);
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
							/*CurserMonster*/new Color(211, 188, 106), /*Poison*/Color.BLUE, /*Curse*/ new Color(190, 50, 230), /*Sticky*/ Color.ORANGE, 
							/*Unknown*/ Color.WHITE, /*All*/ Color.CYAN, /*Barrier*/Color.YELLOW);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Snowy Mountain
				if(ColorPalletIDNumber == 23) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.WHITE, /*TextColor*/new Color(40, 70, 157)
							, /*Curser*/new Color(40, 70, 157), /*CutsceneCurser*/Color.CYAN, /*CutsceneCurserOutline*/Color.CYAN, 
							/*CurserMonster*/new Color(185, 121, 216), /*Poison*/new Color(141, 50, 230), /*Curse*/new Color(50, 230, 147) , /*Sticky*/Color.ORANGE , 
							/*Unknown*/ Color.GRAY, /*All*/ Color.BLUE, /*Barrier*/new Color(165, 230, 50));
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
							/*CurserMonster*/new Color(185, 121, 216), /*Poison*/Color.BLACK, /*Curse*/ Color.BLACK, /*Sticky*/ Color.yellow, 
							/*Unknown*/ Color.GRAY, /*All*/ Color.BLACK, /*Barrier*/Color.yellow);
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
							/*CurserMonster*/Color.CYAN, /*Poison*/new Color(50, 185, 230), /*Curse*/ Color.BLUE, /*Sticky*/ new Color(0, 148, 67), 
							/*Unknown*/ Color.gray, /*All*/ Color.red , /*Barrier*/Color.orange);
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
							/*CurserMonster*/new Color(209, 37, 252), /*Poison*/new Color(230, 50, 167), /*Curse*/ new Color(230, 50, 167), /*Sticky*/new Color(230, 50, 167) , 
							/*Unknown*/ new Color(230, 50, 167), /*All*/ new Color(230, 50, 167), /*Barrier*/new Color(230, 50, 167));
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//Mixed... This one is eyeburn. Do not use.
				if(ColorPalletIDNumber == 27) {
					NewPallet = new GameColorPallet(/*BGColor*/Color.RED, /*TextColor*/Color.BLUE
							, /*Curser*/Color.GREEN, /*CutsceneCurser*/Color.YELLOW, /*CutsceneCurserOutline*/Color.YELLOW, 
							/*CurserMonster*/Color.GRAY, /*Poison*/Color.cyan, /*Curse*/ Color.magenta, /*Sticky*/ Color.ORANGE, 
							/*Unknown*/ new Color(179, 160, 126), /*All*/ new Color(0, 255, 0), /*Barrier*/new Color(0, 255, 0));
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
							/*CurserMonster*/new Color(148, 214, 226), /*Poison*/Color.red, /*Curse*/ Color.red, /*Sticky*/ Color.red, 
							/*Unknown*/ Color.red, /*All*/ Color.red, /*Barrier*/Color.red);
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
							/*CurserMonster*/new Color(189, 25, 231), /*Poison*/new Color(191, 0, 255), /*Curse*/ new Color(191, 0, 255), /*Sticky*/ new Color(191, 0, 255), 
							/*Unknown*/ new Color(191, 0, 255), /*All*/ new Color(191, 0, 255), /*Barrier*/new Color(191, 0, 255));
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
							/*CurserMonster*/Color.BLUE, /*Poison*/Color.yellow, /*Curse*/ Color.yellow, /*Sticky*/ Color.yellow, 
							/*Unknown*/ Color.yellow, /*All*/ Color.yellow, /*Barrier*/Color.yellow);
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
							/*CurserMonster*/new Color(189, 25, 231), /*Poison*/new Color(83, 255, 151), /*Curse*/ new Color(83, 255, 151), /*Sticky*/new Color(83, 255, 151) , 
							/*Unknown*/ new Color(83, 255, 151), /*All*/ new Color(83, 255, 151), /*Barrier*/new Color(83, 255, 151));
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
							/*CurserMonster*/new Color(192, 136, 136), /*Poison*/Color.RED, /*Curse*/ Color.RED, /*Sticky*/ Color.RED, 
							/*Unknown*/ Color.RED, /*All*/ Color.RED, /*Barrier*/Color.RED);
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
							/*CurserMonster*/new Color(124, 46, 136), /*Poison*/Color.white, /*Curse*/ Color.white, /*Sticky*/ Color.white, 
							/*Unknown*/ Color.white, /*All*/ Color.white, /*Barrier*/Color.white);
				}
				//poisonColor
				//CursedColor
				//StickyColor
				//UnknownColor
				//AllColor
				//BarrierColor
				
				//DOPPLEGANGER/<Redacted>
				if(ColorPalletIDNumber == 34) {
					NewPallet = new GameColorPallet(/*BGColor*/new Color(93, 93, 181), /*TextColor*/Color.BLACK
							, /*Curser*/Color.BLACK, /*CutsceneCurser*/Color.WHITE, /*CutsceneCurserOutline*/Color.WHITE, 
							/*CurserMonster*/Color.RED, /*Poison*/Color.BLACK, /*Curse*/ Color.BLACK, /*Sticky*/ Color.BLACK, 
							/*Unknown*/ Color.BLACK, /*All*/ Color.BLACK, /*Barrier*/Color.BLACK);
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
