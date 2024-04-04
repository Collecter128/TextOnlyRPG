package textonlyrpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	final int Tilesize = 16;
	final int scale = 3;
	
	final int TilesizeInUse = Tilesize * scale;
	final int MaximumScreenTileHieght = 12;
	final int MaximumScreenTileWidth = 16;
	final int screenpixelHieght = TilesizeInUse * MaximumScreenTileHieght;
	final int screenpixelWidth = TilesizeInUse * MaximumScreenTileWidth;
	
	Keyhandler keyHandler = new Keyhandler();
	Thread gamethread;
	passwordRW PasswordRW = new passwordRW(this);
	static int Ypos = 190; //CurserPosY
	static int Xpos = 7; //CurserPosX
	//int Ypos = 70; //CurserPosY
	//int Xpos = 60; //CurserPosX
	static int Radius = 5; //CurserRadius
	static String Text1 = "";
	static String Text2 = "";
	static int Text1X = 30;
	//int Text1Y = 100;//? does not change as much as X
	static int Text2X = 30;
	//int Text2Y = 115;//?
	int Gamemode = 1;//Normal Mode
	//0 = Cutscene Quest
	//1 = Normal Mode
	//2 = Easy Mode
	//3 = Hard Mode
	//4 = Other Story
	//5 = Glitch
	//6 = Beta
	
	String OldPassword = "OldPassword";//Password being loaded from file
	String Password = "EmptyPassword";
	String FuturePassword = "??";//Random Password displayed at the end
	static int PasswordMode = 1;//TODO Password Only in active Mode for testing ourposes
	//0 = Normal Mode, Password screen is only a title screen...
	//1 = "Active Mode" (During "Normal Gameplay" Cheats?) password screen Accessible from gameplay
	
	static int PasswordToggle = 0;
	int ATurns = 0;//Action Turns
	int BTurns = 0;//Battle Turns

	int ScreenType = 0;//Password Screen
	static int ScreenMode = 1;
		//Nothingness = 0
		//Normal = 1
		//Mirror = 2
		//Negative = 3
		//Forbiddon Area! = 4
	    //Glitch! = 5
	    //Mystery = 6
	    //Midnight = 7
	static int AreaScreenMode = 1;
	static boolean RainbowAll = false;
	static int EnterOK = 0;
		static int MoneyToggle = 0;
		static int ExpToggle = 0;
		static int ExpToggleOK = 1;
		static int BattleToggle = 0;
	
	static int CHP1 = 0; static int CHP2 = 1; static int CHP3 = 1; static int CHP4 = 5;
	static int CHP1Max = 0;//Not sure if this is a good name
	static int CHP2Max = 0;
	static int CHP3Max = 2;
	static int CHP4Max = 5;
	static int Money = 0;
	static int CAtk1 = 0;
	static int CAtk2 = 0;
	static int CAtk3 = 1;
	static int CAtk4 = 5;
	static int CDef1 = 0;
	static int CDef2 = 0;
	static int CDef3 = 0;
	static int CDef4 = 3;
	static int CDmg1;
	static int CDmg2;
	static int CDmg3;
	static int CDmg4;
	static int Speed = 100;
	static int Luck = 10;
	static int AntiLuck = 0;
	static int Exp = 0;
	static int Next = 5;
	static int Level = 1;
	static int LevelMAX = 5;
	int PlayerCritical = 0;
	int PlayerDodge = 0;
	static int Status = 0;
	//0 = Normal
	//1 = Poison
	//2 = Cursed: Can't Change Weapon
	//3 = Sticky: Can't Change Weapon, same as curse, but it looks different
	//4 = ???   Enemy HP is displayed as ????
    //5 = All
	static int StatusTurns = 0; //Duration of Status Effect, Turns Remaining\

	static int[] StatusResist = new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0};

	int PoisonDamage = 5;
	static int CursedLuck = -7;
	
	static double[] PlayerWeaknesses = {/*Normal*/1.0, /*Slime*/1.0, /*Ghost*/1.0, /*Golem*/1.0, /*Armor*/1.0, /*Other*/1.0, /*Glitch*/1.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0};
	int[] PlayerWeaknessTypes = {/*Normal*/1, /*Slime*/1, /*Ghost*/1, /*Golem*/1, /*Armor*/1, /*Other*/1, /*Glitch*/1, /*Fire*/1, /*Water*/1, /*Wind*/1, /*Earth*/1, /*Electric*/1, /*Ice*/1, /*Light*/1, /*Dark*/1, /*Glitch*/1, /*Null*/1, /*Mystery*/1, /*Corrupt*/1, /*Admin*/1, /*All*/1};
	
	static int CurrentElement = 0;//None
	static int ItemElement = 0;
	static int ItemAmount = 5;//Quantity? if negative MItems?
	
	int[] ItemAmount1 = new int[301];{//Quantity? if negative MItems?
		ItemAmount1[0] = 1; //Potion
		ItemAmount1[1] = 1; //Bread Dough
		ItemAmount1[2] = 0; //Bread
		ItemAmount1[3] = 0; //Toast
		ItemAmount1[4] = 0; //Water
		ItemAmount1[5] = 0; //Pancake Mix
		ItemAmount1[6] = 0; //Pancakes
		ItemAmount1[7] = 0; //Thin Pancakes
		ItemAmount1[8] = 0; //Cheese
		ItemAmount1[9] = 0; //Cheese Fondue
		ItemAmount1[10] = 0; //Cheese Sandwitch
		ItemAmount1[11] = 0; //Cheese Toast
		ItemAmount1[12] = 0; //Cheese Pancakes
		ItemAmount1[13] = 0; //Grilled Cheese
		ItemAmount1[14] = 0; //Meat
		ItemAmount1[15] = 0; //Chopped Steak
		ItemAmount1[16] = 0; //Meat Bread
		ItemAmount1[17] = 0; //Meat Bun
		ItemAmount1[18] = 0; //Burger Bytes
		ItemAmount1[19] = 0; //Meatloaf Stuffed Bread
		ItemAmount1[20] = 0; //Breading Stuffed Meat
		ItemAmount1[21] = 0; //Meaty Pasta
		ItemAmount1[22] = 0; //Stuffed Sandwitch
		ItemAmount1[23] = 0; //Hamburger
		ItemAmount1[24] = 0; //Boiled Meat
		ItemAmount1[25] = 0; //SteakBurger
		ItemAmount1[26] = 0; //SteakHouse Burger
		ItemAmount1[27] = 0; //Cheese Steak
		ItemAmount1[28] = 0; //Cheeseburger
		ItemAmount1[29] = 0; //SteakBurgerW.Cheese
		ItemAmount1[30] = 0; //Cheesesteak Sandwitch
		ItemAmount1[31] = 0; //Sugar
		ItemAmount1[32] = 0; //Caramel
		ItemAmount1[33] = 0; //Sweet Rolls
		ItemAmount1[34] = 0; //Syrup
		ItemAmount1[35] = 0; //Sticky Buns
		ItemAmount1[36] = 0; //Pancakes W. Syrup
		ItemAmount1[37] = 0; //Thin Pancakes W. Syrup
		ItemAmount1[38] = 0; //Cheese Pancakes W Syrup
		ItemAmount1[39] = 0; //Caramels
		ItemAmount1[40] = 0; //Hard Candy
		ItemAmount1[41] = 0; //Jelly Candy
		ItemAmount1[42] = 0; //Sugar Frosted Caramels
		ItemAmount1[43] = 0; //Caramel Syrup
		ItemAmount1[44] = 0; //Hard Candies
		ItemAmount1[45] = 0; //Jelly Beans
		ItemAmount1[46] = 0; //Chocolate
		ItemAmount1[47] = 0; //Chocolate Fondue
		ItemAmount1[48] = 0; //Hot Chocolate
		ItemAmount1[50] = 0; //Chocolate Bar
		ItemAmount1[51] = 0; //Chocolate Caramels
		ItemAmount1[52] = 0; //Chocolate Syrup
		ItemAmount1[53] = 0; //Caramel Hot chocolate
		ItemAmount1[54] = 0; //Pancakes W. Chocolate Syrup
		ItemAmount1[55] = 0; //Thin Pancakes W. Chocolate Syrup
		ItemAmount1[56] = 0; //Cheese Pancakes W. Chocolate Syrup
		ItemAmount1[57] = 0; //Chocolate Pancakes W. Syrup
		ItemAmount1[58] = 0; //Chocolate Pancakes W. Chocolate Syrup
		ItemAmount1[59] = 0; //Chocolate Caramel Cake
		ItemAmount1[60] = 0; //Blueberries
		ItemAmount1[61] = 0; //Blueberry Bread
		ItemAmount1[62] = 0; //Blueberry Juice
		ItemAmount1[63] = 0; //Blueberry Pancakes
		ItemAmount1[64] = 0; //Blueberry Steak
		ItemAmount1[65] = 0; //Blueberry Syrup
		ItemAmount1[66] = 0; //Chocolate Covered Blueberries
		ItemAmount1[67] = 0; //Cheese Dipped Blueberries
		ItemAmount1[68] = 0; //Blueberry Concentrate
		ItemAmount1[69] = 0; //Blueberry Jelly
		ItemAmount1[70] = 0; //Blueberry Jelly Candy
		ItemAmount1[71] = 0; //Blueberry Jelly Beans
		ItemAmount1[72] = 0; //Pancakes W. Blueberry Syrup
		ItemAmount1[73] = 0; //Thin Pancakes W. Blueberry Syrup
		ItemAmount1[74] = 0; //Cheese Pancakes W. Blueberry Syrup
		ItemAmount1[75] = 1; //Chocolate Pancakes W. Blueberry Syrup
		ItemAmount1[76] = 1; //Blueberry Pancakes W. Syrup
		ItemAmount1[77] = 1; //Blueberry Pancakes W. Chocolate Syrup
		ItemAmount1[78] = 1; //Blueberry Pancakes W. Blueberry Syrup
		ItemAmount1[79] = 1; //Toast W. Blueberry Jelly
		ItemAmount1[80] = 1; //Ice
		ItemAmount1[81] = 1; //Ice Sculpture
		ItemAmount1[82] = 1; //Ice Water
		ItemAmount1[83] = 1; //Crushed Ice
		ItemAmount1[84] = 1; //Blueberry Icicle
		ItemAmount1[85] = 1; //Shaved Ice
		ItemAmount1[86] = 1; //Blueberry Shaved Ice
		ItemAmount1[87] = 1; //Refreshing Chocolate Drink
		ItemAmount1[88] = 1; //Caramel Pancakes
		ItemAmount1[89] = 1; //Caramel Bread
		ItemAmount1[90] = 1; //Caramel Chocolate Bar
		ItemAmount1[91] = 1; //Caramel Pancakes W. Syrup
		ItemAmount1[92] = 1; //Caramel Pancakes W. Chocolate Syrup
		ItemAmount1[93] = 1; //Caramel Pancakes W. Blueberry Syrup

		ItemAmount1[94] = 2; //Cloth  //3
		ItemAmount1[95] = 1; //Ghost Cloth
		ItemAmount1[96] = 1; //Dark Cloth
		
		ItemAmount1[97] = 1; //Slime Jell
		ItemAmount1[98] = 1; //Golem Clay
		ItemAmount1[99] = 1; //Chain
		ItemAmount1[100] = 1; //Rubber
		
		ItemAmount1[101] = 1; //Metal A   
		ItemAmount1[102] = 2; //Metal B  //4
		ItemAmount1[103] = 1; //Metal C   
		ItemAmount1[104] = 1; //Metal E
		ItemAmount1[105] = 1; //Alloy A   
		ItemAmount1[106] = 1; //Alloy B
		ItemAmount1[107] = 1; //Alloy D   
		ItemAmount1[108] = 1; //Alloy I
		ItemAmount1[109] = 1; //Shiny Metal
		
		ItemAmount1[110] = 1; //Gunpowder
		
		ItemAmount1[111] = 1; //Fire Energy  
		ItemAmount1[112] = 1; //Water Energy
		ItemAmount1[113] = 1; //Wind Energy  
		ItemAmount1[114] = 1; //Earth Energy
		ItemAmount1[115] = 1; //Electric Energy  
		ItemAmount1[116] = 1; //Ice Energy
		ItemAmount1[117] = 1; //Light Energy  
		ItemAmount1[118] = 1; //Darkness Energy
		
		ItemAmount1[119] = 1; //Stale Bread
		ItemAmount1[120] = 1; //Rotten Meat
		ItemAmount1[121] = 1; //Cursed Meat
		ItemAmount1[122] = 1; //Prison Food
		ItemAmount1[123] = 1; //Dry Bread
		
		ItemAmount1[124] = 1; //Sword 5
		ItemAmount1[125] = 1; //Fire Sword
		ItemAmount1[126] = 1; //Water Sword
		ItemAmount1[127] = 1; //Wind Sword
		ItemAmount1[128] = 1; //Earth Sword
		ItemAmount1[129] = 1; //Electric Sword
		ItemAmount1[130] = 1; //Ice Sword
		ItemAmount1[131] = 1; //Light Sword
		ItemAmount1[132] = 1; //Dark Sword
		ItemAmount1[133] = 1; //Glitch Sword
		ItemAmount1[134] = 1; //Null Sword
		ItemAmount1[135] = 1; //Mystery Sword
		ItemAmount1[136] = 1; //Corrupt Sword
		ItemAmount1[137] = 2; //Admin Sword
		ItemAmount1[138] = 1; //All Sword
		
		ItemAmount1[139] = 1; //Lance
		ItemAmount1[140] = 1; //Fire Lance
		ItemAmount1[141] = 1; //Water Lance
		ItemAmount1[142] = 1; //Wind Lance
		ItemAmount1[143] = 1; //Earth Lance
		ItemAmount1[144] = 1; //Electric Lance
		ItemAmount1[145] = 1; //Ice Lance
		ItemAmount1[146] = 1; //Light Lance
		ItemAmount1[147] = 1; //Dark Lance
		
		ItemAmount1[148] = 1; //Axe
		ItemAmount1[149] = 1; //Fire Axe
		ItemAmount1[150] = 1; //Water Axe
		ItemAmount1[151] = 1; //Wind Axe
		ItemAmount1[152] = 1; //Earth Axe
		ItemAmount1[153] = 1; //Electric Axe
		ItemAmount1[154] = 1; //Ice Axe
		ItemAmount1[155] = 1; //Light Axe
		ItemAmount1[156] = 1; //Dark Axe
		
		ItemAmount1[157] = 1; //Hammer
		ItemAmount1[158] = 1; //Fire Hammer
		ItemAmount1[159] = 1; //Water Hammer
		ItemAmount1[160] = 1; //Wind Hammer
		ItemAmount1[161] = 1; //Earth Hammer
		ItemAmount1[162] = 1; //Electric Hammer
		ItemAmount1[163] = 1; //Ice Hammer
		ItemAmount1[164] = 1; //Light Hammer
		ItemAmount1[165] = 1; //Dark Hammer
		
		ItemAmount1[166] = 1; //Pole
		ItemAmount1[167] = 1; //Fire Pole
		ItemAmount1[168] = 1; //Water Pole
		ItemAmount1[169] = 1; //Wind Pole
		ItemAmount1[170] = 1; //Earth Pole
		ItemAmount1[171] = 1; //Electric Pole
		ItemAmount1[172] = 1; //Ice Pole/ Ice Bar
		ItemAmount1[173] = 1; //Light Pole
		ItemAmount1[174] = 1; //Dark Pole
		
		ItemAmount1[175] = 1; //Hood
		ItemAmount1[176] = 1; //Robe
		ItemAmount1[177] = 1; //Shirt
		ItemAmount1[178] = 1; //Gloves 6
		ItemAmount1[179] = 1; //Pants
		ItemAmount1[180] = 1; //Socks
		
		ItemAmount1[181] = 1; //Ghost Hood
		ItemAmount1[182] = 1; //Ghost Robe
		ItemAmount1[183] = 1; //Ghost Shirt
		ItemAmount1[184] = 1; //Ghost Gloves
		ItemAmount1[185] = 1; //Ghost Pants
		ItemAmount1[186] = 1; //Ghost Socks
		
		ItemAmount1[187] = 1; //Dark Hood
		ItemAmount1[188] = 1; //Dark Robe
		ItemAmount1[189] = 1; //Dark Shirt
		ItemAmount1[190] = 1; //Dark Gloves
		ItemAmount1[191] = 1; //Dark Pants
		ItemAmount1[192] = 1; //Dark Socks
		
		ItemAmount1[193] = 1; //Chain Hood
		ItemAmount1[194] = 1; //Chain Robe
		ItemAmount1[195] = 1; //Chain Armor
		
		ItemAmount1[196] = 1; //Slime Armor
		ItemAmount1[197] = 1; //Golem Armor
		
		ItemAmount1[198] = 1; //Ice Helmet
		ItemAmount1[199] = 1; //Ice Armor
		ItemAmount1[200] = 1; //Ice Gauntlets
		ItemAmount1[201] = 1; //Ice Boots
		
		ItemAmount1[202] = 1; //Rubber Armor
		
		ItemAmount1[203] = 1; //Pancake Armor
		ItemAmount1[204] = 1; //Pancake Armor W. Syrup
		
		ItemAmount1[205] = 1; //Helmet
		ItemAmount1[206] = 1; //Armor
		ItemAmount1[207] = 1; //Gauntlets
		ItemAmount1[208] = 1; //Boots
		
		ItemAmount1[209] = 1; //Fire Helmet
		ItemAmount1[210] = 1; //Fire Armor
		ItemAmount1[211] = 1; //Fire Gauntlets
		ItemAmount1[212] = 1; //Fire Boots
		
		ItemAmount1[213] = 1; //Water Helmet
		ItemAmount1[214] = 1; //Water Armor
		ItemAmount1[215] = 1; //Water Gauntlets
		ItemAmount1[216] = 1; //Water Boots
		
		ItemAmount1[217] = 1; //Wind Helmet
		ItemAmount1[218] = 1; //Wind Armor
		ItemAmount1[219] = 1; //Wind Gauntlets
		ItemAmount1[220] = 1; //Wind Boots
		
		ItemAmount1[221] = 1; //Earth Helmet
		ItemAmount1[222] = 1; //Earth Armor
		ItemAmount1[223] = 1; //Earth Gauntlets
		ItemAmount1[224] = 1; //Earth Boots
		
		ItemAmount1[225] = 1; //Electric Helmet
		ItemAmount1[226] = 1; //Electric Armor
		ItemAmount1[227] = 1; //Electric Gauntlets
		ItemAmount1[228] = 1; //Electric Boots
		
		ItemAmount1[229] = 1; //Ice Helmet
		ItemAmount1[230] = 1; //Ice Armor
		ItemAmount1[231] = 1; //Ice Gauntlets
		ItemAmount1[232] = 1; //Ice Boots
		
		ItemAmount1[233] = 1; //Light Helmet
		ItemAmount1[234] = 1; //Light Armor
		ItemAmount1[235] = 1; //Light Gauntlets
		ItemAmount1[236] = 1; //Light Boots
		
		ItemAmount1[237] = 1; //Dark Helmet
		ItemAmount1[238] = 1; //Dark Armor
		ItemAmount1[239] = 1; //Dark Gauntlets
		ItemAmount1[240] = 1; //Dark Boots
		
		ItemAmount1[241] = 1; //Boots?
		ItemAmount1[242] = 1; //Sheild?
		ItemAmount1[243] = 1; //Armor?
		ItemAmount1[244] = 1; //Gauntlets?
		ItemAmount1[245] = 1; //Helmet?
		
		ItemAmount1[246] = 1; //NULL Helmet
		ItemAmount1[247] = 1; //NULL Armor
		ItemAmount1[248] = 1; //NULL Gauntlets
		ItemAmount1[249] = 1; //NULL Boots
		
		ItemAmount1[250] = 1; //Mystery Armor
		ItemAmount1[251] = 1; //Blueberry Armor
		
		ItemAmount1[252] = 1; //Corrupt Helmet
		ItemAmount1[253] = 1; //Corrupt Armor
		ItemAmount1[254] = 1; //Corrupt Gauntlets
		ItemAmount1[255] = 1; //Corrupt Boots
		
		ItemAmount1[256] = 1; //Admin Armor
		ItemAmount1[257] = 1; //All Armor
		
		ItemAmount1[258] = 1; //Floor 0 Key
		ItemAmount1[259] = 1; //Floor 1 Key
		ItemAmount1[260] = 1; //Floor 2 Key
		ItemAmount1[261] = 1; //Floor 3 Key
		ItemAmount1[262] = 1; //Floor 4 Key
		ItemAmount1[263] = 1; //Floor 5 Key
		ItemAmount1[264] = 1; //Floor 6 Key
		ItemAmount1[265] = 1; //Floor 7 Key
		ItemAmount1[266] = 1; //Floor 8 Key
		ItemAmount1[267] = 1; //Floor 9 Key
		ItemAmount1[268] = 1; //Floor 10 Key
		ItemAmount1[269] = 1; //Floor 11 Key
		
		ItemAmount1[270] = 1; //Bomb
		ItemAmount1[271] = 1; //Fire Bomb
		ItemAmount1[272] = 1; //Water Bomb
		ItemAmount1[273] = 1; //Wind Bomb
		ItemAmount1[274] = 1; //Earth Bomb
		ItemAmount1[275] = 1; //Electric Bomb
		ItemAmount1[276] = 1; //Ice Bomb
		ItemAmount1[277] = 1; //Light Bomb
		ItemAmount1[278] = 1; //Dark Bomb
		
		ItemAmount1[279] = 1; //GLITCH
		ItemAmount1[280] = 1; //NULL
		ItemAmount1[281] = 1; //Beta Corrupt Item
		ItemAmount1[282] = 1; //Corrupt Item
		ItemAmount1[283] = 1; //?
		ItemAmount1[284] = 1; //Null Pancakes
		ItemAmount1[285] = 1; //X Potion
		ItemAmount1[286] = 1; //Unfinished Item
		ItemAmount1[287] = 1; //Unused Item
		
		ItemAmount1[288] = 4;//TestItem1   TestPotion 7
		ItemAmount1[289] = 5;//TestItem2	 TestIngredient 8
		ItemAmount1[290] = 1;//TestItem3	 TestFood 9
		ItemAmount1[291] = 5;//TestItem4	 TestMetal 10
		ItemAmount1[292] = 1;//TestItem5	 TestWeapon 11
		ItemAmount1[293] = 1;//TestItem6	 TestArmor 12
		ItemAmount1[294] = 1;//TestItem7	 TestKey 13
		ItemAmount1[295] = 1;//TestItem8	 TestBomb 14
		ItemAmount1[296] = 5;//TestItem9	 BigBomb 15
		ItemAmount1[297] = 5;//TestItem10   BugBomb 16
		ItemAmount1[298] = 5;//TestItem11   DebugBomb 17
		
		ItemAmount1[299] = 0; //CookItem
		ItemAmount1[300] = 0; //Sold Out
	}
	
	int[] Item1Found = new int[301];{
		Item1Found[0] = 1; //Potion
		Item1Found[1] = 1; //Bread Dough
		Item1Found[2] = 1; //Bread
		Item1Found[3] = 1; //Toast
		Item1Found[4] = 1; //Water
		Item1Found[5] = 1; //Pancake Mix
		Item1Found[6] = 1; //Pancakes
		Item1Found[7] = 1; //Thin Pancakes
		Item1Found[8] = 1; //Cheese
		Item1Found[9] = 1; //Cheese Fondue
		Item1Found[10] = 1; //Cheese Sandwitch
		Item1Found[11] = 1; //Cheese Toast
		Item1Found[12] = 1; //Cheese Pancakes
		Item1Found[13] = 1; //Grilled Cheese
		Item1Found[14] = 1; //Meat
		Item1Found[15] = 1; //Chopped Steak
		Item1Found[16] = 1; //Meat Bread
		Item1Found[17] = 1; //Meat Bun
		Item1Found[18] = 1; //Burger Bytes
		Item1Found[19] = 1; //Meatloaf Stuffed Bread
		Item1Found[20] = 1; //Breading Stuffed Meat
		Item1Found[21] = 1; //Meaty Pasta
		Item1Found[22] = 1; //Stuffed Sandwitch
		Item1Found[23] = 1; //Hamburger
		Item1Found[24] = 1; //Boiled Meat
		Item1Found[25] = 1; //SteakBurger
		Item1Found[26] = 1; //SteakHouse Burger
		Item1Found[27] = 1; //Cheese Steak
		Item1Found[28] = 1; //Cheeseburger
		Item1Found[29] = 1; //SteakBurgerW.Cheese
		Item1Found[30] = 1; //Cheesesteak Sandwitch
		Item1Found[31] = 1; //Sugar
		Item1Found[32] = 1; //Caramel
		Item1Found[33] = 1; //Sweet Rolls
		Item1Found[34] = 1; //Syrup
		Item1Found[35] = 1; //Sticky Buns
		Item1Found[36] = 1; //Pancakes W. Syrup
		Item1Found[37] = 1; //Thin Pancakes W. Syrup
		Item1Found[38] = 1; //Cheese Pancakes W Syrup
		Item1Found[39] = 1; //Caramels
		Item1Found[40] = 1; //Hard Candy
		Item1Found[41] = 1; //Jelly Candy
		Item1Found[42] = 1; //Sugar Frosted Caramels
		Item1Found[43] = 1; //Caramel Syrup
		Item1Found[44] = 1; //Hard Candies
		Item1Found[45] = 1; //Jelly Beans
		Item1Found[46] = 1; //Chocolate
		Item1Found[47] = 1; //Chocolate Fondue
		Item1Found[48] = 1; //Hot Chocolate
		Item1Found[50] = 1; //Chocolate Bar
		Item1Found[51] = 1; //Chocolate Caramels
		Item1Found[52] = 1; //Chocolate Syrup
		Item1Found[53] = 1; //Caramel Hot chocolate
		Item1Found[54] = 1; //Pancakes W. Chocolate Syrup
		Item1Found[55] = 1; //Thin Pancakes W. Chocolate Syrup
		Item1Found[56] = 1; //Cheese Pancakes W. Chocolate Syrup
		Item1Found[57] = 1; //Chocolate Pancakes W. Syrup
		Item1Found[58] = 1; //Chocolate Pancakes W. Chocolate Syrup
		Item1Found[59] = 1; //Chocolate Caramel Cake
		Item1Found[60] = 1; //Blueberries
		Item1Found[61] = 1; //Blueberry Bread
		Item1Found[62] = 1; //Blueberry Juice
		Item1Found[63] = 1; //Blueberry Pancakes
		Item1Found[64] = 1; //Blueberry Steak
		Item1Found[65] = 1; //Blueberry Syrup
		Item1Found[66] = 1; //Chocolate Covered Blueberries
		Item1Found[67] = 1; //Cheese Dipped Blueberries
		Item1Found[68] = 1; //Blueberry Concentrate
		Item1Found[69] = 1; //Blueberry Jelly
		Item1Found[70] = 1; //Blueberry Jelly Candy
		Item1Found[71] = 1; //Blueberry Jelly Beans
		Item1Found[72] = 1; //Pancakes W. Blueberry Syrup
		Item1Found[73] = 1; //Thin Pancakes W. Blueberry Syrup
		Item1Found[74] = 1; //Cheese Pancakes W. Blueberry Syrup
		Item1Found[75] = 1; //Chocolate Pancakes W. Blueberry Syrup
		Item1Found[76] = 1; //Blueberry Pancakes W. Syrup
		Item1Found[77] = 1; //Blueberry Pancakes W. Chocolate Syrup
		Item1Found[78] = 1; //Blueberry Pancakes W. Blueberry Syrup
		Item1Found[79] = 1; //Toast W. Blueberry Jelly
		Item1Found[80] = 1; //Ice
		Item1Found[81] = 1; //Ice Sculpture
		Item1Found[82] = 1; //Ice Water
		Item1Found[83] = 1; //Crushed Ice
		Item1Found[84] = 1; //Blueberry Icicle
		Item1Found[85] = 1; //Shaved Ice
		Item1Found[86] = 1; //Blueberry Shaved Ice
		Item1Found[87] = 1; //Refreshing Chocolate Drink
		Item1Found[88] = 1; //Caramel Pancakes
		Item1Found[89] = 1; //Caramel Bread
		Item1Found[90] = 1; //Caramel Chocolate Bar
		Item1Found[91] = 1; //Caramel Pancakes W. Syrup
		Item1Found[92] = 1; //Caramel Pancakes W. Chocolate Syrup
		Item1Found[93] = 1; //Caramel Pancakes W. Blueberry Syrup
		
		Item1Found[94] = 1; //Cloth
		Item1Found[95] = 1; //Ghost Cloth
		Item1Found[96] = 1; //Dark Cloth
		
		Item1Found[97] = 1; //Slime Jell
		Item1Found[98] = 1; //Golem Clay
		Item1Found[99] = 1; //Chain
		Item1Found[100] = 1; //Rubber
		
		Item1Found[101] = 1; //Metal A
		Item1Found[102] = 1; //Metal B
		Item1Found[103] = 1; //Metal C
		Item1Found[104] = 1; //Metal E
		Item1Found[105] = 1; //Alloy A
		Item1Found[106] = 1; //Alloy B
		Item1Found[107] = 1; //Alloy D
		Item1Found[108] = 1; //Alloy I
		Item1Found[109] = 1; //Shiny Metal
		
		Item1Found[110] = 1; //Gunpowder
		
		Item1Found[111] = 1; //Fire Energy
		Item1Found[112] = 1; //Water Energy
		Item1Found[113] = 1; //Wind Energy
		Item1Found[114] = 1; //Earth Energy
		Item1Found[115] = 1; //Electric Energy
		Item1Found[116] = 1; //Ice Energy
		Item1Found[117] = 1; //Light Energy
		Item1Found[118] = 1; //Darkness Energy
		
		Item1Found[119] = 1; //Stale Bread
		Item1Found[120] = 1; //Rotten Meat
		Item1Found[121] = 1; //Cursed Meat
		Item1Found[122] = 1; //Prison Food
		Item1Found[123] = 1; //Dry Bread
		
		Item1Found[124] = 1; //Sword
		Item1Found[125] = 1; //Fire Sword
		Item1Found[126] = 1; //Water Sword
		Item1Found[127] = 1; //Wind Sword
		Item1Found[128] = 1; //Earth Sword
		Item1Found[129] = 1; //Electric Sword
		Item1Found[130] = 1; //Ice Sword
		Item1Found[131] = 1; //Light Sword
		Item1Found[132] = 1; //Dark Sword
		Item1Found[133] = 1; //Glitch Sword
		Item1Found[134] = 1; //Null Sword
		Item1Found[135] = 1; //Mystery Sword
		Item1Found[136] = 1; //Corrupt Sword
		Item1Found[137] = 1; //Admin Sword
		Item1Found[138] = 1; //All Sword
		
		Item1Found[139] = 1; //Lance
		Item1Found[140] = 1; //Fire Lance
		Item1Found[141] = 1; //Water Lance
		Item1Found[142] = 1; //Wind Lance
		Item1Found[143] = 1; //Earth Lance
		Item1Found[144] = 1; //Electric Lance
		Item1Found[145] = 1; //Ice Lance
		Item1Found[146] = 1; //Light Lance
		Item1Found[147] = 1; //Dark Lance
		
		Item1Found[148] = 1; //Axe
		Item1Found[149] = 1; //Fire Axe
		Item1Found[150] = 1; //Water Axe
		Item1Found[151] = 1; //Wind Axe
		Item1Found[152] = 1; //Earth Axe
		Item1Found[153] = 1; //Electric Axe
		Item1Found[154] = 1; //Ice Axe
		Item1Found[155] = 1; //Light Axe
		Item1Found[156] = 1; //Dark Axe
		
		Item1Found[157] = 1; //Hammer
		Item1Found[158] = 1; //Fire Hammer
		Item1Found[159] = 1; //Water Hammer
		Item1Found[160] = 1; //Wind Hammer
		Item1Found[161] = 1; //Earth Hammer
		Item1Found[162] = 1; //Electric Hammer
		Item1Found[163] = 1; //Ice Hammer
		Item1Found[164] = 1; //Light Hammer
		Item1Found[165] = 1; //Dark Hammer
		
		Item1Found[166] = 1; //Pole
		Item1Found[167] = 1; //Fire Pole
		Item1Found[168] = 1; //Water Pole
		Item1Found[169] = 1; //Wind Pole
		Item1Found[170] = 1; //Earth Pole
		Item1Found[171] = 1; //Electric Pole
		Item1Found[172] = 1; //Ice Pole/ Ice Bar
		Item1Found[173] = 1; //Light Pole
		Item1Found[174] = 1; //Dark Pole
		
		Item1Found[175] = 1; //Hood
		Item1Found[176] = 1; //Robe
		Item1Found[177] = 1; //Shirt
		Item1Found[178] = 1; //Gloves
		Item1Found[179] = 1; //Pants
		Item1Found[180] = 1; //Socks
		
		Item1Found[181] = 1; //Ghost Hood
		Item1Found[182] = 1; //Ghost Robe
		Item1Found[183] = 1; //Ghost Shirt
		Item1Found[184] = 1; //Ghost Gloves
		Item1Found[185] = 1; //Ghost Pants
		Item1Found[186] = 1; //Ghost Socks
		
		Item1Found[187] = 1; //Dark Hood
		Item1Found[188] = 1; //Dark Robe
		Item1Found[189] = 1; //Dark Shirt
		Item1Found[190] = 1; //Dark Gloves
		Item1Found[191] = 1; //Dark Pants
		Item1Found[192] = 1; //Dark Socks
		
		Item1Found[193] = 1; //Chain Hood
		Item1Found[194] = 1; //Chain Robe
		Item1Found[195] = 1; //Chain Armor
		
		Item1Found[196] = 1; //Slime Armor
		Item1Found[197] = 1; //Golem Armor
		
		Item1Found[198] = 1; //Ice Helmet
		Item1Found[199] = 1; //Ice Armor
		Item1Found[200] = 1; //Ice Gauntlets
		Item1Found[201] = 1; //Ice Boots
		
		Item1Found[202] = 1; //Rubber Armor
		
		Item1Found[203] = 1; //Pancake Armor
		Item1Found[204] = 1; //Pancake Armor W. Syrup
		
		Item1Found[205] = 1; //Helmet
		Item1Found[206] = 1; //Armor
		Item1Found[207] = 1; //Gauntlets
		Item1Found[208] = 1; //Boots
		
		Item1Found[209] = 1; //Fire Helmet
		Item1Found[210] = 1; //Fire Armor
		Item1Found[211] = 1; //Fire Gauntlets
		Item1Found[212] = 1; //Fire Boots
		
		Item1Found[213] = 1; //Water Helmet
		Item1Found[214] = 1; //Water Armor
		Item1Found[215] = 1; //Water Gauntlets
		Item1Found[216] = 1; //Water Boots
		
		Item1Found[217] = 1; //Wind Helmet
		Item1Found[218] = 1; //Wind Armor
		Item1Found[219] = 1; //Wind Gauntlets
		Item1Found[220] = 1; //Wind Boots
		
		Item1Found[221] = 1; //Earth Helmet
		Item1Found[222] = 1; //Earth Armor
		Item1Found[223] = 1; //Earth Gauntlets
		Item1Found[224] = 1; //Earth Boots
		
		Item1Found[225] = 1; //Electric Helmet
		Item1Found[226] = 1; //Electric Armor
		Item1Found[227] = 1; //Electric Gauntlets
		Item1Found[228] = 1; //Electric Boots
		
		Item1Found[229] = 1; //Ice Helmet
		Item1Found[230] = 1; //Ice Armor
		Item1Found[231] = 1; //Ice Gauntlets
		Item1Found[232] = 1; //Ice Boots
		
		Item1Found[233] = 1; //Light Helmet
		Item1Found[234] = 1; //Light Armor
		Item1Found[235] = 1; //Light Gauntlets
		Item1Found[236] = 1; //Light Boots
		
		Item1Found[237] = 1; //Dark Helmet
		Item1Found[238] = 1; //Dark Armor
		Item1Found[239] = 1; //Dark Gauntlets
		Item1Found[240] = 1; //Dark Boots
		
		Item1Found[241] = 1; //Boots?
		Item1Found[242] = 1; //Sheild?
		Item1Found[243] = 1; //Armor?
		Item1Found[244] = 1; //Gauntlets?
		Item1Found[245] = 1; //Helmet?
		
		Item1Found[246] = 1; //NULL Helmet
		Item1Found[247] = 1; //NULL Armor
		Item1Found[248] = 1; //NULL Gauntlets
		Item1Found[249] = 1; //NULL Boots
		
		Item1Found[250] = 1; //Mystery Armor
		Item1Found[251] = 1; //Blueberry Armor
		
		Item1Found[252] = 1; //Corrupt Helmet
		Item1Found[253] = 1; //Corrupt Armor
		Item1Found[254] = 1; //Corrupt Gauntlets
		Item1Found[255] = 1; //Corrupt Boots
		
		Item1Found[256] = 1; //Admin Armor
		Item1Found[257] = 1; //All Armor
		
		Item1Found[258] = 1; //Floor 0 Key
		Item1Found[259] = 1; //Floor 1 Key
		Item1Found[260] = 1; //Floor 2 Key
		Item1Found[261] = 1; //Floor 3 Key
		Item1Found[262] = 1; //Floor 4 Key
		Item1Found[263] = 1; //Floor 5 Key
		Item1Found[264] = 1; //Floor 6 Key
		Item1Found[265] = 1; //Floor 7 Key
		Item1Found[266] = 1; //Floor 8 Key
		Item1Found[267] = 1; //Floor 9 Key
		Item1Found[268] = 1; //Floor 10 Key
		Item1Found[269] = 1; //Floor 11 Key
		
		Item1Found[270] = 1; //Bomb
		Item1Found[271] = 1; //Fire Bomb
		Item1Found[272] = 1; //Water Bomb
		Item1Found[273] = 1; //Wind Bomb
		Item1Found[274] = 1; //Earth Bomb
		Item1Found[275] = 1; //Electric Bomb
		Item1Found[276] = 1; //Ice Bomb
		Item1Found[277] = 1; //Light Bomb
		Item1Found[278] = 1; //Dark Bomb
		
		Item1Found[279] = 1; //GLITCH
		Item1Found[280] = 1; //NULL
		Item1Found[281] = 1; //Beta Corrupt Item
		Item1Found[282] = 1; //Corrupt Item
		Item1Found[283] = 1; //?
		Item1Found[284] = 1; //Null Pancakes
		Item1Found[285] = 1; //X Potion
		Item1Found[286] = 1; //Unfinished Item
		Item1Found[287] = 1; //Unused Item
		
		Item1Found[288] = 1;//TestItem1 TestPotion
		Item1Found[289] = 1;//TestItem2 TestIngredient
		Item1Found[290] = 1;//TestItem3 TestFood
		Item1Found[291] = 1;//TestItem4 TestMetal
		Item1Found[292] = 1;//TestItem5 TestWeapon
		Item1Found[293] = 1;//TestItem6 TestArmor
		Item1Found[294] = 1;//TestItem7 Testkey
		Item1Found[295] = 1;//TestItem8 TestBomb
		Item1Found[296] = 1;//TestItem9 BigBomb
		Item1Found[297] = 1;//TestItem10 BugBomb
		Item1Found[298] = 1;//TestItem11 DebugBomb
		
		Item1Found[299] = 1;//CookItem
		Item1Found[300] = 1;//SoldOut
	}
	static int[] ItemAmount2 = new int[300];{//Quantity? if negative MItems?
		int i1 = 0;
		int i2 = 0;
		while(i1 < Item1Found.length){
		if(Item1Found[i1] == 1){
			ItemAmount2[i2] = ItemAmount1[i1];
			i2 = i2 + 1;
		}
		i1 = i1 + 1;
		}
	}
	int ItemsFound = Items.ItemTotal(Item1Found);//10;//----------
	
	Items NullItem = new Items(00, "", "", 0, 0, 0, 0, "No Disc", 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0});
	Items Item1 = NullItem;
	Items Item2 = NullItem;
	Items Item3 = NullItem;
	Items Item4 = NullItem;
	Items Item5 = NullItem;
	Items Item6 = NullItem;
	Items Item7 = NullItem;
	int ItemSortMode = 0;
	
	Items[] ItemList = Items.ItemList(Item1Found, ItemSortMode, Gamemode);{
		if(ItemsFound >=1){
			Item1 = ItemList[0];}
		if(ItemsFound >=2){
			Item2 = ItemList[1];}
		if(ItemsFound >=3){
			Item3 = ItemList[2];}
		if(ItemsFound >=4){
			Item4 = ItemList[3];}
		if(ItemsFound >=5){
			Item5 = ItemList[4];}
		if(ItemsFound >=6){
			Item6 = ItemList[5];}
		if(ItemsFound >=7){
			Item7 = ItemList[6];}
	}
	int RecipeNo = 0;
	int ItemTurns = 0;
	int EquipmentTurns = 0;
	int BombTurns = 1;
	int BombCounter = 0;
	
	int CurrentM = 0;
	//TODO TargetM and Current M?
	int FocusToggle = 1;//Determines iF you FocuS on the attacking monster
	int TargetToggle = 1;//Important Targeting for the main character
	int TargetM = 0;
	//TODO displayM rewrite
	int DisplayMN = 0; //DisplayMN
	//MonsterData[] = {No,Name,HP,HPType,Atk,AtkType,Def,DefType,Drop1,Drop1%,Drop2,Drop2%,Exp,MType,Description,Weaknesses};
	static int MNo = 0;
	static String MName = "EnemyName";
	int Turn = 0;
	int MTurn = 0;
	
	static int Hp1 = 0; static int Hp2 = 0; static int Hp3 = 1; static int Hp4 = 5;
	static int HpType = 1;
	static int MAtk1 = 0;
	static int MAtk2 = 0;
	static int MAtk3 = 0;
	static int MAtk4 = 8;
	static int AtkType = 1;
	static int MDef1 = 0;
	static int MDef2 = 0;
	static int MDef3 = 0;
	static int MDef4 = 6;
	static int DefType = 1;
	static int MDmg1;
	static int MDmg2;
	static int MDmg3;
	static int MDmg4;
	static int MSpeed;
	static int MItemDrop1 = 1;
	static int MItemPercent1 = 50; //may rename? percentdrop?
	static int CriticalChance = 0;
	static int DodgeChance = 0;
	//MItemDrop2
	//MItemPercent2
	static int ExpGained = 1;
	static int MoneyDrop = 3;
	static int MoneyChance = 30;
	
	int[][] ItemDrops = {
			{/*DropID*/0, /*DropName*/}
			};
	
	Random MNameRandom = new Random();
	static int[] CurrentRandoName = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	//Heal/Recover Slime
	//Doppleganger?
	///Drain/Vampire Slime
	
	int[] Monster1Found = new int[360];{
		Monster1Found[0] = 1; //Defaulter 0
		Monster1Found[1] = 1; //00 Coded Edge 1
		Monster1Found[2] = 1; //CodedEdge 1.5 2
		Monster1Found[3] = 1; //Gold Edge 3
		
		Monster1Found[4] = 1; //01 Giant Slime 4
		Monster1Found[5] = 1; //Giant WaterSlime 5
		Monster1Found[6] = 1; //Emerald Slime 6
		
		Monster1Found[7] = 1; //02 lesser wraith/Wraith 3
		Monster1Found[8] = 1; //Small Wraith
		Monster1Found[9] = 1; //Silver Wraith
		
		Monster1Found[10] = 1; //03 Great Golem 4
		Monster1Found[11] = 1; //Great Earth Golem
		Monster1Found[12] = 1; //Big Golem
		
		Monster1Found[13] = 1; //04 Plate 5
		Monster1Found[14] = 1; //GalePlate 
		Monster1Found[15] = 1; //Wind Plate
		
		Monster1Found[16] = 1; //0* Null/Doppleganger 6
		Monster1Found[17] = 1; //               
		Monster1Found[18] = 1;//Nothing
		
		Monster1Found[19] = 1; //10 Great Slime/Liquid Shadow 7
		Monster1Found[20] = 1;//Greater Slime
		Monster1Found[21] = 1; //Honey Slime
		
		Monster1Found[22] = 1; //11 Slime 8
		Monster1Found[23] = 1; //Water Slime
		Monster1Found[24] = 1; //Gold Slime
		
		Monster1Found[25] = 1; //12 Water Wraith 9
		Monster1Found[26] = 1; //Raging Lake
		Monster1Found[27] = 1; //Little Pond
		
		Monster1Found[28] = 1; //13 Golem Slime 10
		Monster1Found[29] = 1; //Molten Golem Slime
		Monster1Found[30] = 1; //Slimy Golem
		
		Monster1Found[31] = 1; //14 Armored Slime 11
		Monster1Found[32] = 1; //Armored Heat Slime
		Monster1Found[33] = 1; //Gilded Slime
		
		Monster1Found[34] = 1; //1* Sl1me 12
		Monster1Found[35] = 1; //Potion
		Monster1Found[36] = 1; //AllSlime
		
		Monster1Found[37] = 1; //20 Ghoul 13
		Monster1Found[38] = 1; //Dark Ghoul
		Monster1Found[39] = 1; //Mini Ghoul
		
		Monster1Found[40] = 1; //21 Ectoplasm 14
		Monster1Found[41] = 1;//Will o Wisp
		Monster1Found[42] = 1; //Pnk Ectoplasm
		
		Monster1Found[43] = 1; //22 Ghost 15
		Monster1Found[44] = 1;//Fire Ghost
		Monster1Found[45] = 1;//Gold Ghost
		
		Monster1Found[46] = 1; //23 Possesed Earth 16
		Monster1Found[47] = 1;//Haunted Earth
		Monster1Found[48] = 1;//Haunted Gold
		
		Monster1Found[49] = 1; //24 Possesed Armor 17
		Monster1Found[50] = 1;//Haunted Armor
		Monster1Found[51] = 1;//SpookyArmor
		
		Monster1Found[52] = 1; //2* Gh0st 18
		Monster1Found[53] = 1;//GHOST!
		Monster1Found[54] = 1;//NullGhost
		
		Monster1Found[55] = 1; //30 Sand Golem 19
		Monster1Found[56] = 1;//PyramidGolem
		Monster1Found[57] = 1;//CastleGolem
		
		Monster1Found[58] = 1; //31 Liquid Golem 20
		Monster1Found[59] = 1;//Mud Golem
		Monster1Found[60] = 1;//Water Golem
		
		Monster1Found[61] = 1; //32 Ghost Golem 21
		Monster1Found[62] = 1;//Wind Ghost Golem
		Monster1Found[63] = 1;//ElecZGhostGolem
		
		Monster1Found[64] = 1; //33 Golem 22
		Monster1Found[65] = 1;//Earth Golem
		Monster1Found[66] = 1;//Gold Golem
		
		Monster1Found[67] = 1; //34 Armored Golem 23
		Monster1Found[68] = 1;//Wind Armored Golem
		Monster1Found[69] = 1;//FireArmoredGolem
		
		Monster1Found[70] = 1; //3* G0l3m 24
		Monster1Found[71] = 1;//Golem Pieces
		Monster1Found[72] = 1;//Gld Brick Golem
		
		Monster1Found[73] = 1; //40 Armor 25
		Monster1Found[74] = 1;//Wind Armor
		Monster1Found[75] = 1;//Gold Armor
		
		Monster1Found[76] = 1; //41 slimearmor/Liquid Armor 26
		Monster1Found[77] = 1;//Water Slime Armor
		Monster1Found[78] = 1;//Gold Slime Armor
		
		Monster1Found[79] = 1; //42 Ghost Armor 27
		Monster1Found[80] = 1;//Fire Ghost Armor
		Monster1Found[81] = 1;//WindGhostArmor
		
		Monster1Found[82] = 1; //43 Golem Armor 28
		Monster1Found[83] = 1;//Earth Golem Armor
		Monster1Found[84] = 1;//FireGolemArmor
		
		Monster1Found[85] = 1; //44 Armor Lv.0 29
		Monster1Found[86] = 1;//Normal Armor
		Monster1Found[87] = 1;//Golden Armor
		
		Monster1Found[88] = 1; //4* Or Armor/Armored Armor 30
		Monster1Found[89] = 1;//z Armor
		Monster1Found[90] = 1;//AdminArmor
		
		Monster1Found[91] = 1; //*0 RNdm /Pancaker 31
		Monster1Found[92] = 1;//?????
		Monster1Found[93] = 1;//Lottery
		
		Monster1Found[94] = 1; //*1 Token Generator 32
		Monster1Found[95] = 1;//Slime Presser
		Monster1Found[96] = 1;//AdminSlime
		
		Monster1Found[97] = 1; //*2 Pltrghst 33
		Monster1Found[98] = 1;//Strange Candle
		Monster1Found[99] = 1;//AdminGhost
		
		Monster1Found[100] = 1; //*3 G l m 34
		Monster1Found[101] = 1;//Green GoLeM
		Monster1Found[102] = 1;//AdminGolem
		
		Monster1Found[103] = 1; //*4 RArm/Rusty Armor 35
		Monster1Found[104] = 1;//Left Gauntlet
		Monster1Found[105] = 1;//Body
		
		Monster1Found[106] = 1; //** Glitch/Null 36
		Monster1Found[107] = 1;//<Glitch>
		Monster1Found[108] = 1;//ERROR
		
		//--------------------------------------------------
		
		Monster1Found[109] = 1;// 00 Coded Edge Form2
		Monster1Found[110] = 1;//Coded Edge FormX
		Monster1Found[111] = 1;//Treasure Edge
		
		Monster1Found[112] = 1;// 01 Giant Jell
		Monster1Found[113] = 1;//BlueGiant Jell
		Monster1Found[114] = 1;//Gold Jell
		
		Monster1Found[115] = 1;//02 Grand Phantasm
		Monster1Found[116] = 1;// Cursed Phantom
		Monster1Found[117] = 1;// Blue Phantasm
		
		Monster1Found[118] = 1;//03 Statue
		Monster1Found[119] = 1;// Durable Statue
		Monster1Found[120] = 1;//Gold Statue
		
		Monster1Found[121] = 1;//04 Mail
		Monster1Found[122] = 1;// Spiked Mail
		Monster1Found[123] = 1;//Gilded Mail
		
		Monster1Found[124] = 1;//0* <Doppleganger>
		Monster1Found[125] = 1;//Doppleganger
		Monster1Found[126] = 1;//BodyDouble
		
		Monster1Found[127] = 1;//10 Elec Slime
		Monster1Found[128] = 1;//Lightning Slime
		Monster1Found[129] = 1;//LightSlime
		
		Monster1Found[130] = 1;//11 Jell
		Monster1Found[131] = 1;// Drk Blue Jell
		Monster1Found[132] = 1;// Silver Jell
		
		Monster1Found[133] = 1;//12 Ghost Slime
		Monster1Found[134] = 1;//Misty Ghost Slime
		Monster1Found[135] = 1;//MistSlime
		
		Monster1Found[136] = 1;//13 Hard Golem Slime
		Monster1Found[137] = 1;//Icy Golem Slime
		Monster1Found[138] = 1;//WindGolemSlime
		
		Monster1Found[139] = 1;//14 Metal Slime
		Monster1Found[140] = 1;//Hard Metal Slime
		Monster1Found[141] = 1;//Mag Slime
		
		Monster1Found[142] = 1;//1* Recov/heal Slime
		Monster1Found[143] = 1;//Drain/Vamp Slime
		Monster1Found[144] = 1;//Barr/Prot Slime
		
		Monster1Found[145] = 1;//20 Wraith
		Monster1Found[146] = 1;//Light Wraith
		Monster1Found[147] = 1;//Gold Wraith
		
		Monster1Found[148] = 1;//21 Water Wrath
		Monster1Found[149] = 1;//Boiling Wrath
		Monster1Found[150] = 1;//Snowcone
		
		Monster1Found[151] = 1;//22 Specter
		Monster1Found[152] = 1;//Wight
		Monster1Found[153] = 1;//Gold Specter
		
		Monster1Found[154] = 1;//23 Solid Shade
		Monster1Found[155] = 1;//Solid Air Shade
		Monster1Found[156] = 1;//EarthShade
		
		Monster1Found[157] = 1;//24 Armored Shade
		Monster1Found[158] = 1;//Time Shadow
		Monster1Found[159] = 1;//MetalShade
		
		Monster1Found[160] = 1;//2* Tresspasser
		Monster1Found[161] = 1;//Invader
		Monster1Found[162] = 1;//Seeker
		
		Monster1Found[163] = 1;//30 Steam Golem	
		Monster1Found[164] = 1;//Multi-Element Golem
		Monster1Found[165] = 1;//NullGolem
		
		Monster1Found[166] = 1;//31 Slime Golem	
		Monster1Found[167] = 1;//Elec Slime Golem
		Monster1Found[168] = 1;//WaterGolem
		
		Monster1Found[169] = 1;//32 Specter Golem
		Monster1Found[170] = 1;//Shadey Golem
		Monster1Found[171] = 1;//Cold Golem
		
		Monster1Found[172] = 1;//33 Hard Golem
		Monster1Found[173] = 1;//Harder Golem
		Monster1Found[174] = 1;//Soft Golem
		
		Monster1Found[175] = 1;//34 Heavy Golem	
		Monster1Found[176] = 1;//Dense Golem
		Monster1Found[177] = 1;//IronGolem
		
		Monster1Found[178] = 1;//3* Hammer Golem
		Monster1Found[179] = 1;// Double Hammer Golem
		Monster1Found[180] = 1;//Earth Hammer Golem
		
		Monster1Found[181] = 1;//40 Quick Plate	
		Monster1Found[182] = 1;//Quicker Plate
		Monster1Found[183] = 1;//Water Plate
		
		Monster1Found[184] = 1;//41 Liquid Armor
		Monster1Found[185] = 1;//Poison Armor
		Monster1Found[186] = 1;//Water Armor
		
		Monster1Found[187] = 1;//42 Phantom Armor
		Monster1Found[188] = 1;//Cursed Phantom Armor
		Monster1Found[189] = 1;//coolArmor
		
		Monster1Found[190] = 1;//43 Heavy Armor	
		Monster1Found[191] = 1;//Heavy Earth Armor
		Monster1Found[192] = 1;//LightArmor
		
		Monster1Found[193] = 1;//44 Dark Armor
		Monster1Found[194] = 1;//D.Armor
		Monster1Found[195] = 1;//Null Armor
		
		Monster1Found[196] = 1;//4* E Guard
		Monster1Found[197] = 1;//E Guardian
		Monster1Found[198] = 1;//Blocker
		
		Monster1Found[199] = 1;//*0 Pancaker
		Monster1Found[200] = 1;//Pancaker W. Syrup
		Monster1Found[201] = 1;//Cherry Cake
		
		Monster1Found[202] = 1;//*1 Token Generator
		Monster1Found[203] = 1;//Token Multiplier
		Monster1Found[204] = 1;//SlotMchine
		
		Monster1Found[205] = 1;//*2 Static
		Monster1Found[206] = 1;//Mist
		Monster1Found[207] = 1;//Cloud
		
		Monster1Found[208] = 1;//*3 30 7 15 12 5 13
		Monster1Found[209] = 1;//Wall
		Monster1Found[210] = 1;//Forcefield
		
		Monster1Found[211] = 1;//*4 M Guard
		Monster1Found[212] = 1;//M Blocker
		Monster1Found[213] = 1;//Spooky Bones
		
		Monster1Found[214] = 1;//** Null Edge
		Monster1Found[215] = 1;//Erase Edge
		Monster1Found[216] = 1;//Empty Blade
		
		//--------------------------------------------------
		
		Monster1Found[217] = 1;//00 Ice Dragon
		Monster1Found[218] = 1;//Red Ice Dragon
		Monster1Found[219] = 1;//Pink Ice Dragon
		
		Monster1Found[220] = 1;//01 Cold Jam 
		Monster1Found[221] = 1;//Amber Cold Jam
		Monster1Found[222] = 1;//Gold Jam
		
		Monster1Found[223] = 1;//02 Frozen Curse 
		Monster1Found[224] = 1;//Freezing Curse
		Monster1Found[225] = 1;//No curse
		
		Monster1Found[226] = 1;//03 Gaint Statue
		Monster1Found[227] = 1;//Frozen TitanStatue
		Monster1Found[228] = 1;//TitanStatue
		
		Monster1Found[229] = 1;//04 Coded Knight 
		Monster1Found[230] = 1;//Coded Knight R
		Monster1Found[231] = 1;//Silver Knight
		
		Monster1Found[232] = 1;//0* Frost Edge 
		Monster1Found[233] = 1;//Frozen Edge
		Monster1Found[234] = 1;//Ice Cleavor
		
		Monster1Found[235] = 1;//10 Liquid Shadow
		Monster1Found[236] = 1;//Dark Matter
		Monster1Found[237] = 1;//Light Matter
		
		Monster1Found[238] = 1;//11 Extra Rare Slime
		Monster1Found[239] = 1;//Very Extra Rare Slime
		Monster1Found[240] = 1;//XXR Slime
		
		Monster1Found[241] = 1;//12 Transparent Slime
		Monster1Found[242] = 1;//Stealth Slime
		Monster1Found[243] = 1;//Polka Slime
		
		Monster1Found[244] = 1;//13 Icicle Slime
		Monster1Found[245] = 1;//Purple Icicle Slime
		Monster1Found[246] = 1;//Popsicle Slime
		
		Monster1Found[247] = 1;//14 Armor Jell
		Monster1Found[248] = 1;//Jell Armored Slime
		Monster1Found[249] = 1;//GrnArmorJell
		
		Monster1Found[250] = 1;//1* Jelly!
		Monster1Found[251] = 1;//Sticky Jelly!
		Monster1Found[252] = 1;//Blue Jelly
		
		Monster1Found[253] = 1;//20 Frozen Wraith
		Monster1Found[254] = 1;//Lich
		Monster1Found[255] = 1;//Chili Lich
		
		Monster1Found[256] = 1;//21 Ectoplasm Lv.9
		Monster1Found[257] = 1;//Will o Wisp Lv.9
		Monster1Found[258] = 1;//GrnEctopsm
		
		Monster1Found[259] = 1;//22 Lingering Grudge
		Monster1Found[260] = 1;//Following Grudge
		Monster1Found[261] = 1;//LazyGrudge
		
		Monster1Found[262] = 1;//23 Ice Shadow
		Monster1Found[263] = 1;//Frozen Shadow
		Monster1Found[264] = 1;//GoldShadow
		
		Monster1Found[265] = 1;//24 Cursed Armor
		Monster1Found[266] = 1;//Forbiddon Armor
		Monster1Found[267] = 1;//SealedArmor
		
		Monster1Found[268] = 1;//2* Radio Static
		Monster1Found[269] = 1;//Wight Noise
		Monster1Found[270] = 1;//BlueScreen
		
		Monster1Found[271] = 1;//30 Ice Golem
		Monster1Found[272] = 1;//Black Ice Golem
		Monster1Found[273] = 1;//Shaved Ice Golem
		
		Monster1Found[274] = 1;//31 Magma Golem
		Monster1Found[275] = 1;//Volcano Golem
		Monster1Found[276] = 1;//AshGolem
		
		Monster1Found[277] = 1;//32 Chaotic Possesed Earth
		Monster1Found[278] = 1;//Chaotic Haunted Earth
		Monster1Found[279] = 1;//Pebbles
		
		Monster1Found[280] = 1;//33 Shiny Golem	
		Monster1Found[281] = 1;//Sparkling Golem
		Monster1Found[282] = 1;//Dull Golem
		
		Monster1Found[283] = 1;//34 Ore Golem
		Monster1Found[284] = 1;//Crystal Golem
		Monster1Found[285] = 1;//Ruby Golem
		
		Monster1Found[286] = 1;//3* Broken Golem
		Monster1Found[287] = 1;//Breaker Golem
		Monster1Found[288] = 1;//FixedGolem
		
		Monster1Found[289] = 1;//40 Coded Armor
		Monster1Found[290] = 1;//Coded Armor S
		Monster1Found[291] = 1;//Codeword
	
		Monster1Found[292] = 1;//41 River Armor
		Monster1Found[293] = 1;//Lake Armor
		Monster1Found[294] = 1;//SteamArmor
		
		Monster1Found[295] = 1;//42 Mist Armor
		Monster1Found[296] = 1;//Fog Armor
		Monster1Found[297] = 1;//SkyArmor
		
		Monster1Found[298] = 1;//43 Mountian Armor
		Monster1Found[299] = 1;//Chasm Armor
		Monster1Found[300] = 1;//FlowerArmor
		
		Monster1Found[301] = 1;//44 Money Armor	
		Monster1Found[302] = 1;//Treasure Armor
		Monster1Found[303] = 1;//Fortune Armor
		
		Monster1Found[304] = 1;//4* Prototype Mech
		Monster1Found[305] = 1;//Prototype Mrk.2
		Monster1Found[306] = 1;//Golden Automaton
		
		Monster1Found[307] = 1;//*0 Broken Sword
		Monster1Found[308] = 1;//Ruined Sword
		Monster1Found[309] = 1;//Fixed Sword
		
		Monster1Found[310] = 1;//*1 Mad Subtractor
		Monster1Found[311] = 1;//Poison Adder
		Monster1Found[312] = 1;//Null Viper
		
		Monster1Found[313] = 1;//*2 Negative Image
		Monster1Found[314] = 1;//Mirror Image
		Monster1Found[315] = 1;//Drawing
		
		Monster1Found[316] = 1;//*3 Terra Cotta Warrier
		Monster1Found[317] = 1;//Super Fighting Terra Cotta
		Monster1Found[318] = 1;//Stone Leg
		
		Monster1Found[319] = 1;//*4 D. A[]m[]r
		Monster1Found[320] = 1;//DisArmor
		Monster1Found[321] = 1;//All Armor
		
		Monster1Found[322] = 1;//** Unknown Enemy
		Monster1Found[323] = 1;//Mystery Enemy
		Monster1Found[324] = 1;//Known Enemy
		
		//--------------------------------------------------
		
		Monster1Found[325] = 1; //TestSlime 37
		Monster1Found[326] = 1;//BetaSlime
		Monster1Found[327] = 1;//RareSlime
		
		Monster1Found[328] = 1; //TestGhost 38
		Monster1Found[329] = 1;//BetaGhost
		Monster1Found[330] = 1;//RareGhost
		
		Monster1Found[331] = 1; //TestGolem 39
		Monster1Found[332] = 1;//BetaGolem
		Monster1Found[333] = 1;//RareGolem
		
		Monster1Found[334] = 1; //TestArmor 40
		Monster1Found[335] = 1;//BetaArmor
		Monster1Found[336] = 1;//RareArmor
		
		Monster1Found[337] = 1; //TestBoss 41
		Monster1Found[338] = 1;//BetaBoss
		Monster1Found[339] = 1;//RareBoss
		
		Monster1Found[340] = 1; //TestMonster6 42
		Monster1Found[341] = 1;//BetaMonster6
		Monster1Found[342] = 1;//Secret6
		
		Monster1Found[343] = 1; //TestMonster7 43
		Monster1Found[344] = 1;//BetaMonster7
		Monster1Found[345] = 1;//Secret7
		
		Monster1Found[346] = 1; //TestMonster8 44
		Monster1Found[347] = 1;//BetaMonster8
		Monster1Found[348] = 1;//Secret8
		
		Monster1Found[349] = 1; //TestMonster9 45
		Monster1Found[350] = 1;//BetaMonster9
		Monster1Found[351] = 1;//Secret9
		
		Monster1Found[352] = 1; //TestMonster10 46
		Monster1Found[353] = 1;//BetaMonster10
		Monster1Found[354] = 1;//Secret10
		
		Monster1Found[355] = 1; //Dummy 47
		Monster1Found[356] = 1;//Scarecrow
		Monster1Found[357] = 1;//Target
		
		Monster1Found[358] = 1; //FF
		Monster1Found[359] = 1; //Gamebox
		
		//Monster1Found[360] = 0; //Nameless
		//Monster1Found[361] = 0; //Shapeless
		//Monster1Found[362] = 0; //Formless
		
		//Monster1Found[363] = 0; //Red Armor 51
		//Monster1Found[364] = 0; //Crimson Armor
		//Monster1Found[365] = 0; //Cookie Armor
		
		//Monster1Found[366] = 0;//Pink Master
		//Monster1Found[367] = 0;//Sakura Don
		//Monster1Found[368] = 0;//Fusia Fighter
		
		//Monster1Found[369] = 0;//Enemy Spy
		//Monster1Found[370] = 0;//Ninja
		//Monster1Found[371] = 0;//Thief
		
		//Monster1Found[372] = 0;//Warlock	
		//Monster1Found[373] = 0;//Evil Warlock
		//Monster1Found[374] = 0;//Magician
		
		//Monster1Found[375] = 0;//Catapult
		//Monster1Found[376] = 0;//Gatling
		//Monster1Found[377] = 0;//Cannon
		
		//Monster1Found[378] = 0;//Pos Logger
		//Monster1Found[379] = 0;//Compass Rose
		//Monster1Found[380] = 0;//Comp Lost
		
		//Monster1Found[381] = 0;//Victory Sword
		//Monster1Found[382] = 0;//Victory Blade
		//Monster1Found[383] = 0;//Victory Dagger
		
		//Monster1Found[384] = 0;//Blue Candle
		//Monster1Found[385] = 0;//Green Candle
		//Monster1Found[386] = 0;//Gold Candle
		
		//Monster1Found[387] = 0;//Barrier	
		//Monster1Found[388] = 0;//Aura
		//Monster1Found[389] = 0;//Bubble
		
		//Monster1Found[390] = 0;//Shield	
		//Monster1Found[391] = 0;//Barricade
		//Monster1Found[392] = 0;//Buckler
		
		//Monster1Found[393] = 0;//Hyper Armor
		//Monster1Found[394] = 0;//Aura Plate
		//Monster1Found[395] = 0;//H Aura Mail
		
		//Monster1Found[396] = 0;//Arm0r
		//Monster1Found[397] = 0;//Brittle Armor
		//Monster1Found[398] = 0;//Mystery Armor
		
		//Monster1Found[399] = 0;//01000010 01101001 01101110 01100001 01110010 01111001
		//Monster1Found[400] = 0;//48 65 78 63 6f 64 65
		//Monster1Found[401] = 0;//Safxoh
	}
	
	
	static int[] Monster1Defeated = new int[360];{//NoDefeated
		Monster1Defeated[0] = 0; //Defaulter 0
		
		Monster1Defeated[1] = 0;//Coded Edge 1
		Monster1Defeated[2] = 0;//Coded Edge 1.5
		Monster1Defeated[3] = 0;//Gold Edge
		
		Monster1Defeated[4] = 0;//Giant Slime 2
		Monster1Defeated[5] = 0;//Giant Water Slime
		Monster1Defeated[6] = 0;//Emerald Slime
		
		Monster1Defeated[7] = 0; //02 lesser wraith/Wraith 3
		Monster1Defeated[8] = 0;//Small Wraith
		Monster1Defeated[9] = 0;//Silver Wraith
		
		Monster1Defeated[10] = 0; //03 Great Golem 4
		Monster1Defeated[11] = 0;//Great Earth Golem
		Monster1Defeated[12] = 0;//Big Golem
		
		Monster1Defeated[13] = 0; //04 Plate 5
		Monster1Defeated[14] = 0;//Gale Plate
		Monster1Defeated[15] = 0;//Wind Plate
		
		Monster1Defeated[16] = 0; //0* null/Doppleganger 6
		Monster1Defeated[17] = 0;//              
		Monster1Defeated[18] = 0;//Nothing
		
		Monster1Defeated[19] = 0; //10 Great Slime/Liquid Shadow 7
		Monster1Defeated[20] = 0;//Greater Slime
		Monster1Defeated[21] = 0;//Honey Slime
		
		Monster1Defeated[22] = 0;//Slime 8
		Monster1Defeated[23] = 0;//Water Slime
		Monster1Defeated[24] = 0;//Gold Slime
		
		Monster1Defeated[25] = 0; //12 Water Wraith 9
		Monster1Defeated[26] = 0;//Raging Lake
		Monster1Defeated[27] = 0;//Little Pond
		
		Monster1Defeated[28] = 0; //13 Golem Slime 10
		Monster1Defeated[29] = 0;//Molten Slime Golem
		Monster1Defeated[30] = 0;//Slimy Golem
		
		Monster1Defeated[31] = 0; //14 Armored Slime 11
		Monster1Defeated[32] = 0;//Armored Heat Slime
		Monster1Defeated[33] = 0;//Gilded Slime
		
		Monster1Defeated[34] = 0; //1* Sl1me 12
		Monster1Defeated[35] = 0;//Potion
		Monster1Defeated[36] = 0;//AllSlime
		
		Monster1Defeated[37] = 0; //20 Ghoul 13
		Monster1Defeated[38] = 0;//Dark Ghoul
		Monster1Defeated[39] = 0;//Mini Ghoul
		
		Monster1Defeated[40] = 0;//Ectoplasm 14
		Monster1Defeated[41] = 0;//Will O Wisp
		Monster1Defeated[42] = 0;//Pnk Ectoplasm
		
		Monster1Defeated[43] = 0; //22 Ghost 15
		Monster1Defeated[44] = 0;//Fire Ghost
		Monster1Defeated[45] = 0;//Gold Ghost
		
		Monster1Defeated[46] = 0; //23 Possesed Earth 16
		Monster1Defeated[47] = 0;//Haunted Earth
		Monster1Defeated[48] = 0;//Haunted Gold
		
		Monster1Defeated[49] = 0; //24 Possesed Armor 17
		Monster1Defeated[50] = 0;//Haunted Armor
		Monster1Defeated[51] = 0;//SpookyArmor
		
		Monster1Defeated[52] = 0; //2* Gh0st 18
		Monster1Defeated[53] = 0;//GHOST!
		Monster1Defeated[54] = 0;//NullGhost

		Monster1Defeated[55] = 0; //30 Sand Golem 19
		Monster1Defeated[56] = 0;//Pyramid Golem
		Monster1Defeated[57] = 0;//CastleGolem
		
		Monster1Defeated[58] = 0; //31 Liquid Golem 20
		Monster1Defeated[59] = 0;//Mud Golem
		Monster1Defeated[60] = 0;//Water Golem
		
		Monster1Defeated[61] = 0; //32 Ghost Golem 21
		Monster1Defeated[62] = 0;//Wind Ghost Golem
		Monster1Defeated[63] = 0;//ElecZGhost Golem
		
		Monster1Defeated[64] = 0; //33 Golem 22
		Monster1Defeated[65] = 0;//Earth Golem
		Monster1Defeated[66] = 0;//Gold Golem
		
		Monster1Defeated[67] = 0; //34 Armored Golem 23
		Monster1Defeated[68] = 0;//Wind Armored Golem
		Monster1Defeated[69] = 0;//Fire Armored Golem
		
		Monster1Defeated[70] = 0; //3* G0l3m 24
		Monster1Defeated[71] = 0;//Golem Pieces
		Monster1Defeated[72] = 0;//Gld Brick Golem
		
		Monster1Defeated[73] = 0; //40 Armor 25
		Monster1Defeated[74] = 0;//Wind Armor
		Monster1Defeated[75] = 0;//Gold Armor
		
		Monster1Defeated[76] = 0; //41 SlimeArmor/Liquid Armor 26
		Monster1Defeated[77] = 0;//Water Slime Armor
		Monster1Defeated[78] = 0;//Gold Slime Armor
		
		Monster1Defeated[79] = 0; //42 Ghost Armor 27
		Monster1Defeated[80] = 0;//Fire Ghost Armor
		Monster1Defeated[81] = 0;//WindGhostArmor
		
		Monster1Defeated[82] = 0; //43 Golem Armor 28
		Monster1Defeated[83] = 0;//Earth Golem Armor
		Monster1Defeated[84] = 0;//FireGolemArmor
		
		Monster1Defeated[85] = 0; //44 Armor Lv.0 29
		Monster1Defeated[86] = 0;//Normal Armor
		Monster1Defeated[87] = 0;//Golden Armor
		
		Monster1Defeated[88] = 0; //4* Or Armor/Armored Armor 30
		Monster1Defeated[89] = 0;//z Armor
		Monster1Defeated[90] = 0;//AdminArmor
		
		Monster1Defeated[91] = 0; //*0 RNdm/ Pancaker 31
		Monster1Defeated[92] = 0;//?????
		Monster1Defeated[93] = 0;//Lottery
		
		Monster1Defeated[94] = 0; //*1 Token Generator 32
		Monster1Defeated[95] = 0;//Slime Presser
		Monster1Defeated[96] = 0;//AdminSlime
		
		Monster1Defeated[97] = 0; //*2 Pltrghst 33
		Monster1Defeated[98] = 0;//Strange Candle
		Monster1Defeated[99] = 0;//AdminGhost
		
		Monster1Defeated[100] = 0; //*3 G l m 34
		Monster1Defeated[101] = 0;//Green GoLeM
		Monster1Defeated[102] = 0;//AdminGolem
		
		Monster1Defeated[103] = 0; //*4 R Arm/Rusty Armor 35
		Monster1Defeated[104] = 0;//Left Gauntlet
		Monster1Defeated[105] = 0;//Body
		
		Monster1Defeated[106] = 0; //** Glitch/Null 36
		Monster1Defeated[107] = 0;//<Glitch>
		Monster1Defeated[108] = 0;//ERROR
		
		//------------------------------------------------
		
		Monster1Defeated[109] = 0; //000 Coded Edge Form2
		Monster1Defeated[110] = 0; //Coded Edge FormX
		Monster1Defeated[111] = 0; //TreasureEdge
		
		Monster1Defeated[112] = 0; //01 Giant Jell
		Monster1Defeated[113] = 0; //Blue Giant Jell
		Monster1Defeated[114] = 0; //Cold jell
		
		Monster1Defeated[115] = 0; //02 Grand Phantasm
		Monster1Defeated[116] = 0; //Cursed Phantom
		Monster1Defeated[117] = 0; //Blue Phantasm
		
		Monster1Defeated[118] = 0; //03 Statue
		Monster1Defeated[119] = 0; //Durable Statue
		Monster1Defeated[120] = 0; //Gold Statue
		
		Monster1Defeated[121] = 0; //04 Mail
		Monster1Defeated[122] = 0; //Spiked Mail
		Monster1Defeated[123] = 0; //Gilded Mail
		
		Monster1Defeated[124] = 0; //0* <Doppleganger>
		Monster1Defeated[125] = 0; //Doppleganger
		Monster1Defeated[126] = 0; //BodyDouble
		
		Monster1Defeated[127] = 0; //10 Elec Slime
		Monster1Defeated[128] = 0; //Lightning Slime
		Monster1Defeated[129] = 0; //Light Slime
		
		Monster1Defeated[130] = 0; //11 Jell
		Monster1Defeated[131] = 0; //Drk Blue Jell
		Monster1Defeated[132] = 0; //Silver Jell
		
		Monster1Defeated[133] = 0; //12 Ghost Slime
		Monster1Defeated[134] = 0; //Misty Ghost Slime
		Monster1Defeated[135] = 0; //Mist Slime
		
		Monster1Defeated[136] = 0; //13 Hard Golem Slime
		Monster1Defeated[137] = 0; //Icy Golem Slime
		Monster1Defeated[138] = 0; //Wind Golem Slime
		
		Monster1Defeated[139] = 0; //14 Metal Slime
		Monster1Defeated[140] = 0; //Hard Metal Slime
		Monster1Defeated[141] = 0; //Mag Slime
		
		Monster1Defeated[142] = 0; //1* Recov/Heal Slime
		Monster1Defeated[143] = 0; //Drain/Vamp Slime
		Monster1Defeated[144] = 0; //Barr/Prot Slime
		
		Monster1Defeated[145] = 0; //20 Wraith
		Monster1Defeated[146] = 0; //Light Wraith
		Monster1Defeated[147] = 0; //Gold Wraith
		
		Monster1Defeated[148] = 0; //21 Water Wrath
		Monster1Defeated[149] = 0; //Boiling Wrath
		Monster1Defeated[150] = 0; //Snowcone
		
		Monster1Defeated[151] = 0; //22 Specter
		Monster1Defeated[152] = 0; //Wight
		Monster1Defeated[153] = 0; //Gold Specter
		
		Monster1Defeated[154] = 0; //23 Solid Shade
		Monster1Defeated[155] = 0; // Solid Air Shade
		Monster1Defeated[156] = 0; // Earth Shade
		
		Monster1Defeated[157] = 0; //24 Armored Shade
		Monster1Defeated[158] = 0; //Time Shadow
		Monster1Defeated[159] = 0; //MetalShade
		
		Monster1Defeated[160] = 0; //2* Tresspasser	
		Monster1Defeated[161] = 0; //Invader
		Monster1Defeated[162] = 0; //Seeker
		
		Monster1Defeated[163] = 0; //30 Steam Golem
		Monster1Defeated[164] = 0; //Multi-Element Golem
		Monster1Defeated[165] = 0; //NullGolem
		
		Monster1Defeated[166] = 0; //31 Slime Golem
		Monster1Defeated[167] = 0; //Elec Slime Golem
		Monster1Defeated[168] = 0; //WaterGolem
		
		Monster1Defeated[169] = 0; //32 Specter Golem
		Monster1Defeated[170] = 0; //Shadey Golem
		Monster1Defeated[171] = 0; //Cold Golem
		
		Monster1Defeated[172] = 0; //33 Hard Golem
		Monster1Defeated[173] = 0; //Harder Golem
		Monster1Defeated[174] = 0; //Soft Golem
		
		Monster1Defeated[175] = 0; //34 Heavy Golem
		Monster1Defeated[176] = 0; //Dense Golem
		Monster1Defeated[177] = 0; //IronGolem
		
		Monster1Defeated[178] = 0; //3* Hammer Golem
		Monster1Defeated[179] = 0; //Double Hammer Golem
		Monster1Defeated[180] = 0; //Earth Hammer Golem
		
		Monster1Defeated[181] = 0; //40 Quick Plate
		Monster1Defeated[182] = 0; //Quicker Plate
		Monster1Defeated[183] = 0; //Water Plate
		
		Monster1Defeated[184] = 0; //41 Liquid Armor
		Monster1Defeated[185] = 0; //Poison Armor
		Monster1Defeated[186] = 0; //Water Armor
		
		Monster1Defeated[187] = 0; //42 Phantom Armor
		Monster1Defeated[188] = 0; //Cursed Phantom Armor
		Monster1Defeated[189] = 0; //coolArmor
		
		Monster1Defeated[190] = 0; //43 Heavy Armor
		Monster1Defeated[191] = 0; //Heavy Earth Armor
		Monster1Defeated[192] = 0; //LightArmor
		
		Monster1Defeated[193] = 0; //44 Dark Armor
		Monster1Defeated[194] = 0; //D.Armor
		Monster1Defeated[195] = 0; //Null Armor
		
		Monster1Defeated[196] = 0; //4* E Guard
		Monster1Defeated[197] = 0; // E Guardian
		Monster1Defeated[198] = 0; //Blocker
		
		Monster1Defeated[199] = 0; //*0 Pancaker
		Monster1Defeated[200] = 0; //Pancaker W. Syrup
		Monster1Defeated[201] = 0; //Cherry Cake
		
		Monster1Defeated[202] = 0; //*1 Token Generator
		Monster1Defeated[203] = 0; //Token Multiplier
		Monster1Defeated[204] = 0; //SlotMchine
		
		Monster1Defeated[205] = 0; //*2 Static
		Monster1Defeated[206] = 0; //Mist
		Monster1Defeated[207] = 0; //Cloud
		
		Monster1Defeated[208] = 0; //*3 30 7 15 12 5 13
		Monster1Defeated[209] = 0; //Wall
		Monster1Defeated[210] = 0; //Forcefield
		
		Monster1Defeated[211] = 0; //*4 M Guard
		Monster1Defeated[212] = 0; //M Blocker
		Monster1Defeated[213] = 0; //Spooky Bones
		
		Monster1Defeated[214] = 0; //** Null Edge
		Monster1Defeated[215] = 0; //Erase Edge
		Monster1Defeated[216] = 0; //Empty Blade
		
		//------------------------------------------------
		
		Monster1Defeated[217] = 0; //00 Ice Dragon 
		Monster1Defeated[218] = 0; //Red Ice Dragon
		Monster1Defeated[219] = 0; //Pink Ice Dragon
		
		Monster1Defeated[220] = 0; //01 Cold Jam 
		Monster1Defeated[221] = 0; //Amber Cold Jam
		Monster1Defeated[222] = 0; //Gold Jam
		
		Monster1Defeated[223] = 0; //02 Frozen Curse 
		Monster1Defeated[224] = 0; //Freezing Curse
		Monster1Defeated[225] = 0; //No curse
		
		Monster1Defeated[226] = 0; //03 Gaint Statue
		Monster1Defeated[227] = 0; //Frozen TitanStatue
		Monster1Defeated[228] = 0; //TitanStatue
		
		Monster1Defeated[229] = 0; //04 Coded Knight
		Monster1Defeated[230] = 0; //Coded Knight R
		Monster1Defeated[231] = 0; //Silver Knight
		
		Monster1Defeated[232] = 0; //0* Frost Edge 
		Monster1Defeated[233] = 0; //Frozen Edge
		Monster1Defeated[234] = 0; //Ice Cleavor
		
		Monster1Defeated[235] = 0; //10 Liquid Shadow
		Monster1Defeated[236] = 0; //Dark Matter
		Monster1Defeated[237] = 0; //Light Matter
		
		Monster1Defeated[238] = 0; //11 Extra Rare Slime
		Monster1Defeated[239] = 0; //Very Extra Rare Slime
		Monster1Defeated[240] = 0; //XXR Slime
		
		Monster1Defeated[241] = 0; //12 Transparent Slime
		Monster1Defeated[242] = 0; //Stealth Slime
		Monster1Defeated[243] = 0; //Polka Slime
		
		Monster1Defeated[244] = 0; //13 Icicle Slime
		Monster1Defeated[245] = 0; //Purple Icicle Slime
		Monster1Defeated[246] = 0; //Popsicle Slime
		
		Monster1Defeated[247] = 0; //14 Armor Jell
		Monster1Defeated[248] = 0; //Jell Armored Slime
		Monster1Defeated[249] = 0; //GrnArmorJell
		
		Monster1Defeated[250] = 0; //1* Jelly!
		Monster1Defeated[251] = 0; //Sticky Jelly!
		Monster1Defeated[252] = 0; //Blue Jelly
		
		Monster1Defeated[253] = 0; //20 Frozen Wraith
		Monster1Defeated[254] = 0; //Lich
		Monster1Defeated[255] = 0; //Chili Lich
		
		Monster1Defeated[256] = 0; //21 Ectoplasm Lv.9
		Monster1Defeated[257] = 0; //Will o Wisp Lv.9
		Monster1Defeated[258] = 0; //GrnEctopsm
		
		Monster1Defeated[259] = 0; //22 Lingering Grudge
		Monster1Defeated[260] = 0; //Following Grudge
		Monster1Defeated[261] = 0; //LazyGrudge
		
		Monster1Defeated[262] = 0; //23 Ice Shadow
		Monster1Defeated[263] = 0; //Frozen Shadow
		Monster1Defeated[264] = 0; //GoldShadow
		
		Monster1Defeated[265] = 0; //24 Cursed Armor
		Monster1Defeated[266] = 0; //Forbiddon Armor
		Monster1Defeated[267] = 0; //SealedArmor
		 
		Monster1Defeated[268] = 0; //2* Radio Static
		Monster1Defeated[269] = 0; //Wight Noise
		Monster1Defeated[270] = 0; //BlueScreen
		
		Monster1Defeated[271] = 0; //30 Ice Golem
		Monster1Defeated[272] = 0; //Black Ice Golem
		Monster1Defeated[273] = 0; //Shaved Ice Golem
		
		Monster1Defeated[274] = 0; //31 Magma Golem
		Monster1Defeated[275] = 0; //Volcano Golem
		Monster1Defeated[276] = 0; //AshGolem
		
		Monster1Defeated[277] = 0; //32  Chaotic Possesed Earth
		Monster1Defeated[278] = 0; //Chaotic Haunted Earth
		Monster1Defeated[279] = 0; //Pebbles
		
		Monster1Defeated[280] = 0; //33 Shiny Golem
		Monster1Defeated[281] = 0; //Sparkling Golem
		Monster1Defeated[282] = 0; //Dull Golem
		
		Monster1Defeated[283] = 0; //34 Ore Golem
		Monster1Defeated[284] = 0; //Crystal Golem
		Monster1Defeated[285] = 0; //Ruby Golem
		
		Monster1Defeated[286] = 0; //3* Broken Golem
		Monster1Defeated[287] = 0; //Breaker Golem
		Monster1Defeated[288] = 0; //FixedGolem
		
		Monster1Defeated[289] = 0; //40 Coded Armor	
		Monster1Defeated[290] = 0; //Coded Armor S
		Monster1Defeated[291] = 0; //Codeword
		
		Monster1Defeated[292] = 0; //41 River Armor
		Monster1Defeated[293] = 0; //Lake Armor
		Monster1Defeated[294] = 0; //SteamArmor
		
		Monster1Defeated[295] = 0; //42 Mist Armor
		Monster1Defeated[296] = 0; //Fog Armor
		Monster1Defeated[297] = 0; //SkyArmor
		
		Monster1Defeated[298] = 0; //43 Mountian Armor
		Monster1Defeated[299] = 0; //Chasm Armor
		Monster1Defeated[300] = 0; //FlowerArmor
		
		Monster1Defeated[301] = 0; //44 Money Armor	
		Monster1Defeated[302] = 0; //Treasure Armor
		Monster1Defeated[303] = 0; //Fortune Armor
		
		Monster1Defeated[304] = 0; //4* Prototype Mech
		Monster1Defeated[305] = 0; //Prototype Mrk.2
		Monster1Defeated[306] = 0; //Golden Automaton
		
		Monster1Defeated[307] = 0; //*0 Broken Sword
		Monster1Defeated[308] = 0; //Ruined Sword
		Monster1Defeated[309] = 0; //Fixed Sword
		
		Monster1Defeated[310] = 0; //*1 Mad Subtractor
		Monster1Defeated[311] = 0; //Poison Adder
		Monster1Defeated[312] = 0; //Null Viper
		
		Monster1Defeated[313] = 0; //*2 Negative Image
		Monster1Defeated[314] = 0; //Mirror Image
		Monster1Defeated[315] = 0; //Drawing
		
		Monster1Defeated[316] = 0; //*3 Terra Cotta Warrier
		Monster1Defeated[317] = 0; //Super Fighting Terra Cotta
		Monster1Defeated[318] = 0; //Stone Leg
		
		Monster1Defeated[319] = 0; //*4 D. A[]m[]r
		Monster1Defeated[320] = 0; //DisArmor
		Monster1Defeated[321] = 0; //All Armor
		
		Monster1Defeated[322] = 0; //** Unknown Enemy
		Monster1Defeated[323] = 0; //Mystery Enemy
		Monster1Defeated[324] = 0; //Known Enemy
		
		//------------------------------------------------
		
		Monster1Defeated[325] = 0;//TestSlime 37
		Monster1Defeated[326] = 0;//BetaSlime
		Monster1Defeated[327] = 0;//RareSlime
		
		Monster1Defeated[328] = 0;//TestGhost 38
		Monster1Defeated[329] = 0;//BetaGhost
		Monster1Defeated[330] = 0;//RareGhost
		
		Monster1Defeated[331] = 0;//TestGolem 39
		Monster1Defeated[332] = 0;//BetaGolem
		Monster1Defeated[333] = 0;//RareGolem
		
		Monster1Defeated[334] = 0;//TestArmor 40
		Monster1Defeated[335] = 0;//BetaArmor
		Monster1Defeated[336] = 0;//RareArmor
		
		Monster1Defeated[337] = 0;//TestBoss 41
		Monster1Defeated[338] = 0;//BetaBoss
		Monster1Defeated[339] = 0;//RareBoss
		
		Monster1Defeated[340] = 0;//TestMonster6 42
		Monster1Defeated[341] = 0;//BetaMonster6
		Monster1Defeated[342] = 0;//Secret6
		
		Monster1Defeated[343] = 0;//TestMonster7 43
		Monster1Defeated[344] = 0;//BetaMonster7
		Monster1Defeated[345] = 0;//Secret7
		
		Monster1Defeated[346] = 0;//TestMonster8 44
		Monster1Defeated[347] = 0;//BetaMonster8
		Monster1Defeated[348] = 0;//Secret8
		
		Monster1Defeated[349] = 0;//TestMonster9 45
		Monster1Defeated[350] = 0;//BetaMonster9
		Monster1Defeated[351] = 0;//Secret9
		
		Monster1Defeated[352] = 0;//TestMonster10 46
		Monster1Defeated[353] = 0;//BetaMonster10
		Monster1Defeated[354] = 0;//Secret10
		
		Monster1Defeated[355] = 0;//Dummy 47
		Monster1Defeated[356] = 0;//Scarecrow
		Monster1Defeated[357] = 0;//Target
		
		Monster1Defeated[358] = 0; //FF
		Monster1Defeated[359] = 0; //Gamebox
		
		//Monster1Defeated[360] = 0; //Nameless
		//Monster1Defeated[361] = 0; //Shapeless
		//Monster1Defeated[362] = 0; //Formless
		
		//Monster1Defeated[363] = 0; //Red Armor
		//Monster1Defeated[364] = 0; //Crimson Armor
		//Monster1Defeated[365] = 0; //Cookie Armor

		//Monster1Defeated[366] = 0; //Pink Master
		//Monster1Defeated[367] = 0; //Sakura Don
		//Monster1Defeated[368] = 0; //Fusia Fighter
		
		//Monster1Defeated[369] = 0; //Enemy Spy
		//Monster1Defeated[370] = 0; //Ninja
		//Monster1Defeated[371] = 0; //Thief
		
		//Monster1Defeated[372] = 0; //Warlock	
		//Monster1Defeated[373] = 0; //Evil Warlock
		//Monster1Defeated[374] = 0; //Magician
		
		//Monster1Defeated[375] = 0; //Catapult
		//Monster1Defeated[376] = 0; //Gatling
		//Monster1Defeated[377] = 0; //Cannon
		
		//Monster1Defeated[378] = 0; //Pos Logger
		//Monster1Defeated[379] = 0; //Compass Rose
		//Monster1Defeated[380] = 0; //Comp Lost
		
		//Monster1Defeated[381] = 0; //Victory Sword
		//Monster1Defeated[382] = 0; //Victory Blade
		//Monster1Defeated[383] = 0; //Victory Dagger
		
		//Monster1Defeated[384] = 0; //Blue Candle
		//Monster1Defeated[385] = 0; //Green Candle
		//Monster1Defeated[386] = 0; //Gold Candle
		
		//Monster1Defeated[387] = 0; //Barrier
		//Monster1Defeated[388] = 0; //Aura
		//Monster1Defeated[389] = 0; //Bubble
		
		//Monster1Defeated[390] = 0; //Shield
		//Monster1Defeated[391] = 0; //Barricade
		//Monster1Defeated[392] = 0; //Buckler
		
		//Monster1Defeated[393] = 0; //Hyper Armor
		//Monster1Defeated[394] = 0; //Aura Plate
		//Monster1Defeated[395] = 0; //H Aura Mail
		
		//Monster1Defeated[396] = 0; //Arm0r
		//Monster1Defeated[397] = 0; //Brittle Armor
		//Monster1Defeated[398] = 0; //Mystery Armor
		
		//Monster1Defeated[399] = 0; //01000010 01101001 01101110 01100001 01110010 01111001
		//Monster1Defeated[400] = 0; //48 65 78 63 6f 64 65
		//Monster1Defeated[401] = 0; //Safxoh

	}
	
	static MonsterData NullData = new MonsterData(000, "000", "000", new String[]{""}, new String[]{""}, /*MHP*/0, 0, 0, 5, 9, 1, /*MATK*/0, 0, 0, 8, 1, /*MAtkElements*/0, 16, /*MDEF*/0, 0, 0, 6, 1, "No Data", new String[]{"Nothing there?", "Is it invisible?"}, /*MSpeed*/100, /*ItemDrop?*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Weakness*/new double[]{/*Unarmed*/0.0, /*Sword*/0.0, /*Lance*/0.0, /*Hammer*/0.0, /*Axe*/0.0, /*Pole*/0.0, /*Bomb*/0.0, /*Fire*/1.0, /*Water*/1.0, /*Wind*/1.0, /*Earth*/1.0, /*Electric*/1.0, /*Ice*/1.0, /*Light*/1.0, /*Dark*/1.0, /*Glitch*/1.0, /*Null*/1.0, /*Mystery*/1.0, /*Corrupt*/1.0, /*Admin*/1.0, /*All*/1.0}, /*WeaknessType*/new int[]{/*Unarmed*/0, /*Sword*/0, /*Lance*/0, /*Hammer*/0, /*Axe*/0, /*Pole*/0, /*Bomb*/0, /*Fire*/0, /*Water*/0, /*Wind*/0, /*Earth*/0, /*Electric*/0, /*Ice*/0, /*Light*/0, /*Dark*/0, /*Glitch*/0, /*Null*/0, /*Mystery*/0, /*Corrupt*/0, /*Admin*/0, /*All*/0}, /*Weak/Resist Text*/new String[] {"", "", "", ""}, new int[][]{{0,0,0},{0,0,0}}, /*CriticalC*/0, /*DodgeC*/0, /*Status*/0, /*StatusC*/0);
	static MonsterData Monster1 = NullData;
	static MonsterData Monster2 = NullData;
	static MonsterData Monster3 = NullData;
	static MonsterData Monster4 = NullData;
	static MonsterData Monster5 = NullData;
	static MonsterData Monster6 = NullData;
	static MonsterData Monster7 = NullData;
	static MonsterData Monster8 = NullData;
	static MonsterData Monster9 = NullData;
	static MonsterData Monster10 = NullData;
	
	int MonstersFound = MonsterData.MTotal(Monster1Found);
	MonsterData[] MonsterD = MonsterData.MInfo(Monster1Found, Gamemode);{
		if(MonstersFound >=1){
			Monster1 = MonsterD[0];}
		if(MonstersFound >=2){
			Monster2 = MonsterD[1];}
		if(MonstersFound >=3){
			Monster3 = MonsterD[2];}
		if(MonstersFound >=4){
			Monster4 = MonsterD[3];}
		if(MonstersFound >=5){
			Monster5 = MonsterD[4];}
		if(MonstersFound >=6){
			Monster6 = MonsterD[5];}
		if(MonstersFound >=7){
			Monster7 = MonsterD[6];}
		if(MonstersFound >=8){
			Monster8 = MonsterD[7];}
		if(MonstersFound >=9){
			Monster9 = MonsterD[8];}
		if(MonstersFound >=10){
			Monster10 = MonsterD[9];}
	}
	
	int[] MHP1 = new int[1];{
		MHP1[0] = 0;
	}
	int[] MHP2 = new int[1];{
		MHP2[0] = 0;
	}
	int[] MHP3 = new int[1];{
		MHP3[0] = 0;
	}
	int[] MHP4 = new int[1];{
		MHP4[0] = 0;
	}
	MonsterData[] MBattle = new MonsterData[1];{
		MBattle[0] = MonsterData.MData(1, Gamemode);//TestMonster1, CutsceneMode
	}
	BattleData BattleM = new BattleData(01, MBattle, /*Event*/0, /*ItemDrop*/1, 50, /*Exp*/0, /*Money*/3, 30, /*Escape*/50, /*EndEvent*/0, /*ScreenMode*/1, /*RandomText*/new String[]{"", ""});
	MonsterData DisplayM = NullData;
	
	String TestItem = "TestItem1";
	int ItemAmountC1 = 0;
	int ItemAmountC2 = 0;
	//int ItemAmount1 = 5;//Quantity? if negative MItems?
	int ItemType = 1;//recovery?
	int ItemType2 = 0;
	int ItemToggle = 0;
	int ItemPlacement = 0;//rename? Item Position
	int ItemNo = 0;
	String ItemName = "";
	Items NullItemV0 = new Items(00, "", "", 0, 0, 0, -5, "No Disc", 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0});
	
	Items CurrentItem = NullItem;
	
	int[] CookRecipe = new int[96];{
		CookRecipe[0] = 1;//Bread
		CookRecipe[1] = 1;//TestItem3
		CookRecipe[2] = 1;//DebugBomb
		CookRecipe[3] = 1;//Toast
		//CookRecipe[4] = 0;//TestItem5
		//CookRecipe[5] = 0;//TestItem6
		//CookRecipe[6] = 0;//TestItem7
		//CookRecipe[7] = 0;//TestItem8
		//CookRecipe[8] = 0;//TestItem9
		//CookRecipe[9] = 0;//TestItem10
		//CookRecipe[10] = 0;//TestItem11
		CookRecipe[4] = 1;//Pancakes
		CookRecipe[5] = 1;//Thin Pancakes
		CookRecipe[6] = 1;//Cheese Fondue
		CookRecipe[7] = 1;//Cheese Sandwitch
		CookRecipe[8] = 1;//Cheese Toast
		CookRecipe[9] = 1;//Cheese pancakes
		CookRecipe[10] = 1;//Grilled Cheese
		CookRecipe[11] = 1;//Chopped Steak
		CookRecipe[12] = 1;//MeatBread
		CookRecipe[13] = 1;//Meat Bun
		CookRecipe[14] = 1;//Burger Bytes
		CookRecipe[15] = 1;//Meatloaf stuffed Bread
		CookRecipe[16] = 1;//Breading Stuffed Meat
		CookRecipe[17] = 1;//Meaty Pasta
		CookRecipe[18] = 1;//Stuffed Sandwitch
		CookRecipe[19] = 1;//Hamburger
		CookRecipe[20] = 1;//Boiled Meat
		CookRecipe[21] = 1;//Steakburger
		CookRecipe[22] = 1;//Steakhouse Burger
		CookRecipe[23] = 1;//Cheese Steak
		CookRecipe[24] = 1;//Cheeseburger
		CookRecipe[25] = 1;//Steakburger W.Cheese
		CookRecipe[26] = 1;//Cheesesteak Sandwitch
		CookRecipe[27] = 1;//Caramel
		CookRecipe[28] = 1;//Sweet Rolls
		CookRecipe[29] = 1;//Syrup
		CookRecipe[30] = 1;//Sticky Buns
		CookRecipe[31] = 1;//Pancakes w Syrup
		CookRecipe[32] = 1;//Thin Pancakes with syrup
		CookRecipe[33] = 1;//Cheese pancakes w syrup
		CookRecipe[34] = 1;//caramels
		CookRecipe[35] = 1;//hard candy
		CookRecipe[36] = 1;//jelly candy
		CookRecipe[37] = 1;//sugar frosted caramels
		CookRecipe[38] = 1;//caramel syrup
		CookRecipe[39] = 1;//hard candies
		CookRecipe[40] = 1;//jelly beans
		CookRecipe[41] = 1;//chocolate fondue
		CookRecipe[42] = 1;//hot chocolate
		CookRecipe[43] = 1;//chocolate pancakes
		CookRecipe[44] = 1;//chocolate bar
		CookRecipe[45] = 1;//chocolate caramels
		CookRecipe[46] = 1;//chocolate syrup
		CookRecipe[47] = 1;//caramel hotchocolate
		CookRecipe[48] = 1;//pancakes w ChocoSyrup
		CookRecipe[47] = 1;//Thin Pancakes w choco syrup
		CookRecipe[48] = 1;//Cheese pancakes w choco syrup
		CookRecipe[49] = 1;//Choco pancakes w syrup
		CookRecipe[50] = 1;//Choco pancakes w choco syrup
		CookRecipe[51] = 1;//Choco caramel cake
		CookRecipe[52] = 1;//Blueberry Bread
		CookRecipe[53] = 1;//blueberry juice
		CookRecipe[54] = 1;//Blueberry pancakes
		CookRecipe[55] = 1;//blueberry steak
		CookRecipe[56] = 1;//blueberry syrup
		CookRecipe[57] = 1;//Choco covered blueberries
		CookRecipe[58] = 1;//Cheese dipped blueberries
		CookRecipe[59] = 1;//blueberry concentrate
		CookRecipe[60] = 1;//bluberry jelly
		CookRecipe[61] = 1;//blueberry jelly candy
		CookRecipe[62] = 1;//blueberry jelly beans
		CookRecipe[63] = 1;//pancakes w blueberry syrup
		CookRecipe[64] = 1;//Thin pancakes w blueberry syrup
		CookRecipe[65] = 1;//Cheese pancakes w blueberry syrup
		CookRecipe[66] = 1;//choco pancakes w blueberry syrup
		CookRecipe[67] = 1;//blueberry pancakes w syrup
		CookRecipe[68] = 1;//blueberry pancakes w choco syrup
		CookRecipe[69] = 1;//blueberry pancakes w blueberry syrup
		CookRecipe[70] = 1;//toast w blueberry jelly
		CookRecipe[71] = 1;//Ice sculpture
		CookRecipe[72] = 1;//Ice water
		CookRecipe[73] = 1;//crushed ice
		CookRecipe[74] = 1;//blueberry icicle
		CookRecipe[75] = 1;//shaved ice
		CookRecipe[76] = 1;//blueberry shaved ice
		CookRecipe[77] = 1;//refreshing choco drink
		CookRecipe[78] = 1;//Caramel Pancakes
		CookRecipe[79] = 1;//Caramel Bread
		CookRecipe[80] = 1;//Caramel Choco bar
		CookRecipe[81] = 1;//Caramel Pancakes w syrup
		CookRecipe[82] = 1;//caramel pancakes w choco syrup
		CookRecipe[83] = 1;//Caramel pancakes w blueberry syrup
		CookRecipe[84] = 1;//Stale Bread
		CookRecipe[85] = 1;//rotten Meat
		CookRecipe[86] = 1;//Cursed Meat
		CookRecipe[87] = 1;//Prison Food
		CookRecipe[88] = 1;//Dry Bread
		CookRecipe[89] = 1;//Pancake Armor
		CookRecipe[90] = 1;//Pancake Armor w Syrup
		CookRecipe[91] = 1;//Blueberry Armor
		CookRecipe[92] = 1;//NULL Pancakes
		CookRecipe[93] = 1;//Unused Item
		CookRecipe[94] = 1;//CookItem
		CookRecipe[95] = 1;//Potion
	}
	int[] CookMade = new int[96];{
		CookMade[0] = 0;//Bread
		CookMade[1] = 0;//TestItem3
		CookMade[2] = 0;//DebugBomb
		CookMade[3] = 1;//Toast
		//CookMade[4] = 1;//TestItem5
		//CookMade[5] = 1;//TestItem6
		//CookMade[6] = 1;//TestItem7
		//CookMade[7] = 1;//TestItem8
		//CookMade[8] = 1;//TestItem9
		//CookMade[9] = 1;//TestItem10
		//CookMade[10] = 1;//TestItem11
		//CookMade[4] = 1;//Pancakes
		CookMade[4] = 1;//Pancakes
		CookMade[5] = 1;//Thin Pancakes
		CookMade[6] = 1;//Cheese Fondue
		CookMade[7] = 1;//Cheese Sandwitch
		CookMade[8] = 1;//Cheese Toast
		CookMade[9] = 1;//Cheese pancakes
		CookMade[10] = 1;//Grilled Cheese
		CookMade[11] = 1;//Chopped Steak
		CookMade[12] = 1;//MeatBread
		CookMade[13] = 1;//Meat Bun
		CookMade[14] = 1;//Burger Bytes
		CookMade[15] = 1;//Meatloaf stuffed Bread
		CookMade[16] = 1;//Breading Stuffed Meat
		CookMade[17] = 1;//Meaty Pasta
		CookMade[18] = 1;//Stuffed Sandwitch
		CookMade[19] = 1;//Hamburger
		CookMade[20] = 1;//Boiled Meat
		CookMade[21] = 1;//Steakburger
		CookMade[22] = 1;//Steakhouse Burger
		CookMade[23] = 1;//Cheese Steak
		CookMade[24] = 1;//Cheeseburger
		CookMade[25] = 1;//Steakburger W.Cheese
		CookMade[26] = 1;//Cheesesteak Sandwitch
		CookMade[27] = 1;//Caramel
		CookMade[28] = 1;//Sweet Rolls
		CookMade[29] = 1;//Syrup
		CookMade[30] = 1;//Sticky Buns
		CookMade[31] = 1;//Pancakes w Syrup
		CookMade[32] = 1;//Thin Pancakes with syrup
		CookMade[33] = 1;//Cheese pancakes w syrup
		CookMade[34] = 1;//caramels
		CookMade[35] = 1;//hard candy
		CookMade[36] = 1;//jelly candy
		CookMade[37] = 1;//sugar frosted caramels
		CookMade[38] = 1;//caramel syrup
		CookMade[39] = 1;//hard candies
		CookMade[40] = 1;//jelly beans
		CookMade[41] = 1;//chocolate fondue
		CookMade[42] = 1;//hot chocolate
		CookMade[43] = 1;//chocolate pancakes
		CookMade[44] = 1;//chocolate bar
		CookMade[45] = 1;//chocolate caramels
		CookMade[46] = 1;//chocolate syrup
		CookMade[47] = 1;//caramel hotchocolate
		CookMade[48] = 1;//pancakes w ChocoSyrup
		CookMade[47] = 1;//Thin Pancakes w choco syrup
		CookMade[48] = 1;//Cheese pancakes w choco syrup
		CookMade[49] = 1;//Choco pancakes w syrup
		CookMade[50] = 1;//Choco pancakes w choco syrup
		CookMade[51] = 1;//Choco caramel cake
		CookMade[52] = 1;//Blueberry Bread
		CookMade[53] = 1;//blueberry juice
		CookMade[54] = 1;//Blueberry pancakes
		CookMade[55] = 1;//blueberry steak
		CookMade[56] = 1;//blueberry syrup
		CookMade[57] = 1;//Choco covered blueberries
		CookMade[58] = 1;//Cheese dipped blueberries
		CookMade[59] = 1;//blueberry concentrate
		CookMade[60] = 1;//bluberry jelly
		CookMade[61] = 1;//blueberry jelly candy
		CookMade[62] = 1;//blueberry jelly beans
		CookMade[63] = 1;//pancakes w blueberry syrup
		CookMade[64] = 1;//Thin pancakes w blueberry syrup
		CookMade[65] = 1;//Cheese pancakes w blueberry syrup
		CookMade[66] = 1;//choco pancakes w blueberry syrup
		CookMade[67] = 1;//blueberry pancakes w syrup
		CookMade[68] = 1;//blueberry pancakes w choco syrup
		CookMade[69] = 1;//blueberry pancakes w blueberry syrup
		CookMade[70] = 1;//toast w blueberry jelly
		CookMade[71] = 1;//Ice sculpture
		CookMade[72] = 1;//Ice water
		CookMade[73] = 1;//crushed ice
		CookMade[74] = 1;//blueberry icicle
		CookMade[75] = 1;//shaved ice
		CookMade[76] = 1;//blueberry shaved ice
		CookMade[77] = 1;//refreshing choco drink
		CookMade[78] = 1;//Caramel Pancakes
		CookMade[79] = 1;//Caramel Bread
		CookMade[80] = 1;//Caramel Choco bar
		CookMade[81] = 1;//Caramel Pancakes w syrup
		CookMade[82] = 1;//caramel pancakes w choco syrup
		CookMade[83] = 1;//Caramel pancakes w blueberry syrup
		CookMade[84] = 1;//Stale Bread
		CookMade[85] = 1;//rotten Meat
		CookMade[86] = 1;//Cursed Meat
		CookMade[87] = 1;//Prison Food
		CookMade[88] = 1;//Dry Bread
		CookMade[89] = 1;//Pancake Armor
		CookMade[90] = 1;//Pancake Armor w Syrup
		CookMade[91] = 1;//Blueberry Armor
		CookMade[92] = 1;//NULL Pancakes
		CookMade[93] = 1;//UnusedItem
		CookMade[94] = 1;//CookItem
		CookMade[95] = 1;//Potion
	}
	Cook CookedItem = new Cook(-1, "", "", 0, 0);
	
	Items CookItem = NullItem;
	Items CookItem1 = NullItem;
	Items CookItem2 = NullItem;
	Cook NullCook = new Cook(0, "", "", 0, 0);
	Cook CookItem3 = NullCook;
	
	int MoveToggle = 0;
	int CookToggle = 0;
	int CookItemToggle = 0;
	int MonsterPage = 1;
	//int MonstersFound = Monster1Found;
	int TalkPage = 1;
	//int DiscussionsFound = Topics.TopicTotal(Topic1Found);
	
	int Price = 0;
	int AmountPurchased = 0;
	
	int[] Topic1Found = new int[11];{
		Topic1Found[0] = 1;
		Topic1Found[1] = 1;
		Topic1Found[2] = 1;
		Topic1Found[3] = 1;
		Topic1Found[4] = 1;
		Topic1Found[5] = 1;
		Topic1Found[6] = 1;
		Topic1Found[7] = 1;
		Topic1Found[8] = 1;
		Topic1Found[9] = 1;
		Topic1Found[10] = 1;
	}
	Topics NullTopic = new Topics(00, "", "No Disc", 0);
	Topics Topic1 = NullTopic;
	Topics Topic2 = NullTopic;
	Topics Topic3 = NullTopic;
	Topics Topic4 = NullTopic;
	Topics Topic5 = NullTopic;
	Topics Topic6 = NullTopic;
	Topics Topic7 = NullTopic;
	Topics Topic8 = NullTopic;
	Topics Topic9 = NullTopic;
	Topics Topic10 = NullTopic;
	
	int TalkTopic = 0;
	Topics CurrentTopic = NullTopic;;
	
	int[] Area1Found = new int[70];{
		Area1Found[0] = 1;//Market/Town
		Area1Found[1] = 1;//Elder's Office/Town
		Area1Found[2] = 1;//Cook's Kitchen/Town
		Area1Found[3] = 1;//Weaponsmith's Shop/Town
		Area1Found[4] = 1;//Armorsmith's Shop/Town
		Area1Found[5] = 1;//Tavern/Town
		Area1Found[6] = 1;//Inventor's Shop/Town
		Area1Found[7] = 1;//Alley 
		Area1Found[8] = 1;//Town Gate/Town 
		
		Area1Found[9] = 1;//Field1/Field 
		Area1Found[10] = 1;//Field2/Field 
		Area1Found[11] = 1;//Grassy Field 
		Area1Found[12] = 1;//Haunted Field/Field 
		Area1Found[13] = 1;//Castle Ruins 
		Area1Found[14] = 1;//Wide Field 
		Area1Found[15] = 1;//Rocky Feild 
		Area1Found[16] = 1;//Cave 
		Area1Found[17] = 1;//Endless Feild 
		Area1Found[18] = 1;//Null Area 
		Area1Found[19] = 1;//Null Area 2
		Area1Found[20] = 1;//Dark Field
		
		Area1Found[21] = 1;//Mountain Trail1 
		Area1Found[22] = 1;//Mountain Stream
		Area1Found[23] = 1;//Mountain Trail2 
		Area1Found[24] = 1;//Mountain Top 
		Area1Found[25] = 1;//Under the Mountain 
		Area1Found[26] = 1;//Dark Mountain
		
		Area1Found[27] = 1;//Desert Area1 
		Area1Found[28] = 1;//Wide Desert 
		Area1Found[29] = 1;//Desert Oasis 
		Area1Found[30] = 1;//Pyramid
		Area1Found[31] = 1;//Midnight Desert Area 
		Area1Found[32] = 1;//Dark Desert
		
		Area1Found[33] = 1;//Castle Floor0 
		Area1Found[34] = 1;//Castle Floor1 
		Area1Found[35] = 1;//Castle Floor2 
		Area1Found[36] = 1;//Castle Floor3 
		Area1Found[37] = 1;//Castle Floor4 
		Area1Found[38] = 1;//Castle Floor5 
		Area1Found[39] = 1;//Castle Floor6 
		Area1Found[40] = 1;//Castle Floor7 
		Area1Found[41] = 1;//Castle Floor8 
		Area1Found[42] = 1;//Castle Floor9 
		Area1Found[43] = 1;//Castle Floor10 
		Area1Found[44] = 1;//Castle Floor11 
		Area1Found[45] = 1;//Dark Castle
		
		Area1Found[46] = 1;//Dark Area1 
		Area1Found[47] = 1;//Dark Area2 
		Area1Found[48] = 1;//Dark Area 3
		
		Area1Found[49] = 1;//Unfinished Area 

		Area1Found[50] = 1;//Secret Path
		Area1Found[51] = 1;//Forest
		
		Area1Found[52] = 1;//Path
		Area1Found[53] = 1;//Gate
		Area1Found[54] = 1;//SnowyPath
		Area1Found[55] = 1;//Snowy Mountain Base
		Area1Found[56] = 1;//SnMntPath1
		Area1Found[57] = 1;//SnMntCave
		Area1Found[58] = 1;//SnMntMine
		Area1Found[59] = 1;//SnMntPath2
		Area1Found[60] = 1;//Cabin
		Area1Found[61] = 1;//SnMntPath3
		Area1Found[62] = 1;//SnMntPeak
		
		Area1Found[63] = 1;//TestArea1/Test Area 
		Area1Found[64] = 1;//TestArea2/Test Area 
		Area1Found[65] = 1;//TestArea3/Test Area 
		Area1Found[66] = 1;//TestArea4/Test Area 
		Area1Found[67] = 1;//Password/Password Screen 
		
		Area1Found[68] = 1;//Forbiddon Area 
		
		Area1Found[69] = 1;//Admin Area 
	}
	int[][] EnteryCounter = new int[][] {//Counts how many time you have entered an area, from another area
			/*Area1*/ {0,0,0,0,0,0},
			/*Area2*/ {0,0,0,0,0,0}
	};
	int[][] AccessArea = new int[][] {//Stores info whether you can enter certain areas from other areas or not
			/*Market*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Elder*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Cook*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Weaponsmith*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Armorsmith*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Tavern*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Inventor*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Alley*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*TownGate*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Field Area1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Field Area2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*GrassyFeild*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Haunted Field*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleRuins*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*WideFeild*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*RockyFeild*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Cave*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*EndlessFeild*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*NullArea*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*NullArea2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Dark Field*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*MountainTrail1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*MountainStream*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*MountainTrail2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*MountainTop*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*UnderTheMountain*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*DarkMountain*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*DesertArea1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*WideDesert*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*DesertOasis*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Pyramid*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*MidnightDesertArea*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*DarkDesert*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*CastleFloor0*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor3*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor4*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor5*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor6*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor7*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor8*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor9*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor10*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*CastleFloor11*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*DarkCastle*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*DarkArea1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*DarkArea2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*DarkArea3*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*UnfinishedArea*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*SecretPath*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Forest*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*Path*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Gate*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnowyPath*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntBase*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntPath1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntCave*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntMine*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntPath2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntCabin*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntPath3*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*SnMntPeak*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			
			/*TestArea1*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*TestArea2*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*TestArea3*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*TestArea4*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Password*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*Forbiddon Area*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/0,/*AdminArea*/1},
			/*AdminArea*/ {/*Market*/1,/*Elder*/1,/*Cook*/1,/*Weaponsmith*/1,/*Armorsmith*/1,/*Tavern*/1,/*Inventor*/1,/*Alley*/1,/*Town Gate*/1,/*Field Area1*/1,/*Field Area2*/1,/*Grassy Feild*/1,/*Haunted Field*/1,/*Castle Ruins*/1,/*Wide Feild*/1,/*Rocky Feild*/1,/*Cave*/1,/*Endless Feild*/1,/*Null Area*/1,/*Null Area2*/1,/*DarkField Area*/1,/*Mountain Trail1*/1,/*MountainStream*/1,/*MountainTrail2*/1,/*MountainTop*/1,/*UnderTheMountain*/1,/*DarkMountain*/1,/*DesertArea1*/1,/*WideDesert*/1,/*DesertOasis*/1,/*Pyramid*/1,/*MidnightDesertArea*/1,/*DarkDesert*/1,/*CastleFloor0*/1,/*CastleFloor1*/1,/*CastleFloor2*/1,/*CastleFloor3*/1,/*CastleFloor04*/1,/*CastleFloor05*/1,/*CastleFloor06*/1,/*CastleFloor07*/1,/*CastleFloor08*/1,/*CastleFloor09*/1,/*CastleFloor10*/1,/*CastleFloor11*/1,/*DarkCastle*/1,/*DarkArea1*/1,/*DarkArea2*/1,/*Dark Area3*/1,/*UnfinishedArea*/1,/*SecretPath*/1,/*Forest*/1,/*Path*/1,/*Gate*/1,/*SnowyPath*/1,/*SnyMntBase*/1,/*SnyMntPath1*/1,/*SnyMntCave*/1,/*SnyMntMine*/1,/*SnyMntPath2*/1,/*SnyMntCabin*/1,/*SnyMntPath3*/1,/*SnyMntPeak*/1,/*TestArea1*/1,/*TestArea2*/1,/*TestArea3*/1,/*TestArea4*/1,/*PasswordArea*/1,/*ForbiddonArea*/1,/*AdminArea*/1},
	};
	//Used by PathChecker to unlock paths to other areas from certain areas
	int[][] PathUnlockerKey = new int[][] {
			{0,0,0,0}//EnterCounterArea[X][], EnterCounterFrom[][X], AccessAreaArea[X][], AccessAreaAccess[][X]
	};
	
	int AreasFound = AreaData.ATotal(Area1Found, GamePanel.CurrentArea.AreaNo, AccessArea);
	
	//Area(AreaID,AreaNo.,AreaName):
	int AreaNumber = 1;
	String AreaName = "TestArea";
	int AreaPlacement = 0;
	//TODO Starting Area
	static AreaData CurrentArea = new AreaData(1, "Password Area", "It's just the Password Screen", 0, "TestArea", 
			/*ItemChance*/new int[]{1}, new int[]{0}, /*MoneyChance*/new int[]{3}, new int[]{33}, 
			/*BattleChance*/new int[]{1}, new int[]{66}, 
			/*XBattleChance*/new int[]{1}, new int[]{-100}, /*RBattleChance*/new int[]{1}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
	//AreaData CurrentArea = new AreaData(0, "TestArea1", "TestArea1", 1, "TestArea", 1, 0, 3, 33, 1, 66, 70, 60);
	//int AreaItem = 0;
	int AreaItemP = 10; //Percent
	int AreaBattleP = 33;
	//int AreaGoldFound;
	int AreaGoldP = 33;
	AreaData NULLData = new AreaData(000, "", "No Data", 1, "AdminArea", /*ItemChance*/new int[]{1}, new int[]{20}, /*MoneyChance*/new int[]{3}, new int[]{33}, /*BattleChance*/new int[]{1}, new int[]{66}, /*XBattleChance*/new int[]{1}, new int[]{-100}, /*RBattleChance*/new int[]{1}, new int[]{-100}, /*Events*/new int[][]{/*EventType1*/{0},/*EventType2*/{0},/*EventData*/{0},/*EventFlag*/{0},/*EventChance*/{0}},/*Ypos, Xpos*/70, 60, /*Cutscene*/new int[][]{{0, 0}}, /*ScreenMode*/1, /*RandomText*/new String[] {"", ""});
	AreaData Area1 = NULLData; AreaData Area2 = NULLData;
	AreaData Area3 = NULLData; AreaData Area4 = NULLData;
	AreaData Area5 = NULLData; AreaData Area6 = NULLData;
	AreaData Area7 = NULLData; AreaData Area8 = NULLData;
	AreaData Area9 = NULLData; AreaData Area10 = NULLData;
	
	AreaData[] AreaD = AreaData.AList(Area1Found, CurrentArea.AreaNo, AccessArea);{
		//Initialize area Display for MoveScreen
		if(AreasFound >=1){ 
			Area1 = AreaD[0]; }
		if(AreasFound >=2){
			Area2 = AreaD[1];}
		if(AreasFound >=3){
			Area3 = AreaD[2];}
		if(AreasFound >=4){
			Area4 = AreaD[3];}
		if(AreasFound >=5){
			Area5 = AreaD[4];}
		if(AreasFound >=6){
			Area6 = AreaD[5];}
		if(AreasFound >=7){
			Area7 = AreaD[6];}
		if(AreasFound >=8){
			Area8 = AreaD[7];}
		if(AreasFound >=9){
			Area9 = AreaD[8];}
		if(AreasFound >=10){
			Area10 = AreaD[9];}
//		if(AreasFound >=11){
//			Area10 = AreaD[10];}//Password Area, Soft Unlock?
	}
	
	int NoteToggle = 0;
	int NotePage = 1;
	String TestNote1Text = "Note1";
	String Note1Text = "Note1";
	String TestNote2Text = "Note2";
	String Note2Text = "Note2";
	Notes NullNote = new Notes(000, "", "No Note", "");
	Notes Note1 = NullNote;//"TestNote1";
	Notes Note2 = NullNote;
	Notes Note3 = NullNote;
	Notes Note4 = NullNote;
	Notes Note5 = NullNote;
	Notes Note6 = NullNote;
	Notes Note7 = NullNote;
	Notes Note8 = NullNote;
	Notes Note9 = NullNote;
	Notes Note10 = NullNote;
	
	int[] Note1Found = new int[17];{
		Note1Found[15] = 0;//Notes Note
		Note1Found[16] = 0;//Move Note
		Note1Found[0] = 1;//Story Note
		Note1Found[1] = 1;//Actions Note
		Note1Found[2] = 1;//Mission Note
		Note1Found[3] = 1;//Items Note
		Note1Found[4] = 0;//Ingredient Note
		Note1Found[5] = 1;//Metal Note
		Note1Found[6] = 1;//Alloy Note
		Note1Found[7] = 1;//GunPowder Note
		Note1Found[8] = 1;//Energy Note
		Note1Found[9] = 1;//Recipe Note
		Note1Found[10] = 1;//Weapon Note
		Note1Found[11] = 1;//Armor Note
		Note1Found[12] = 1;//Character Note
		Note1Found[13] = 1;//Area Note
		Note1Found[14] = 1;//Password Note
	}
	
	int NotesFound = Notes.NoteTotal(Note1Found); //total
	//Note(NoteID,Name,Data,NoteFound,Modifier);
	//Notes[] TestNote = new Notes[1],
	Notes[] NoteList = Notes.NoteBook(Note1Found);{
		if(NotesFound >=1){
			Note1 = NoteList[0];}
		if(NotesFound >=2){
			Note2 = NoteList[1];}
		if(NotesFound >=3){
			Note3 = NoteList[2];}
		if(NotesFound >=4){
			Note4 = NoteList[3];}
		if(NotesFound >=5){
			Note5 = NoteList[4];}
		if(NotesFound >=6){
			Note6 = NoteList[5];}
		if(NotesFound >=7){
			Note7 = NoteList[6];}
		if(NotesFound >=8){
			Note8 = NoteList[7];}
		if(NotesFound >=9){
			Note9 = NoteList[8];}
		if(NotesFound >=10){
			Note10 = NoteList[9];}
	}
	
	int DiscussionsFound = Topics.TopicTotal(Topic1Found);
	Topics[] TopicList = Topics.TopicList(Topic1Found);{
		if(DiscussionsFound >=1){
			Topic1 = TopicList[0];}
		if(DiscussionsFound >=2){
			Topic2 = TopicList[1];}
		if(DiscussionsFound >=3){
			Topic3 = TopicList[2];}
		if(DiscussionsFound >=4){
			Topic4 = TopicList[3];}
		if(DiscussionsFound >=5){
			Topic5 = TopicList[4];}
		if(DiscussionsFound >=6){
			Topic6 = TopicList[5];}
		if(DiscussionsFound >=7){
			Topic7 = TopicList[6];}
		if(DiscussionsFound >=8){
			Topic8 = TopicList[7];}
		if(DiscussionsFound >=9){
			Topic9 = TopicList[8];}
		if(DiscussionsFound >=10){
			Topic10 = TopicList[9];}
	}
	
	int[] WeaponRecipe = new int[68];{
		WeaponRecipe[0] = 1;//Sword from MetalB
		WeaponRecipe[1] = 1;//TestItem1 from TestItem1?
		WeaponRecipe[2] = 1;//TestItem2 from TestItem1
		WeaponRecipe[3] = 1;//TestItem4 from TestItem1
		WeaponRecipe[4] = 1;//TestItem5 
		WeaponRecipe[5] = 1;//TestBomb
		
		WeaponRecipe[6] = 1;//FireSword
		WeaponRecipe[7] = 1;//WaterSword
		WeaponRecipe[8] = 1;//WindSword
		WeaponRecipe[9] = 1;//EarthSword
		WeaponRecipe[10] = 1;//ElecSword
		WeaponRecipe[11] = 1;//IceSword
		WeaponRecipe[12] = 1;//LightSword
		WeaponRecipe[13] = 1;//DarkSword
		WeaponRecipe[14] = 1;//Sw0rd
		WeaponRecipe[15] = 1;//NULL Sword
		WeaponRecipe[16] = 1;//Mysterious Sword
		WeaponRecipe[17] = 1;//Corroded Sword
		WeaponRecipe[18] = 1;//Corroded Sword recipe Beta
		WeaponRecipe[19] = 1;//AdminSword
		WeaponRecipe[20] = 1;//AllSword
		
		WeaponRecipe[21] = 1;//Lance
		WeaponRecipe[22] = 1;//FireLance
		WeaponRecipe[23] = 1;//WaterLance
		WeaponRecipe[24] = 1;//WindLance
		WeaponRecipe[25] = 1;//EarthLance
		WeaponRecipe[26] = 1;//ElecLance
		WeaponRecipe[27] = 1;//IceLance
		WeaponRecipe[28] = 1;//LightLance
		WeaponRecipe[29] = 1;//DarkLance
		
		WeaponRecipe[30] = 1;//Axe
		WeaponRecipe[31] = 1;//FireAxe
		WeaponRecipe[32] = 1;//WaterAxe
		WeaponRecipe[33] = 1;//WindAxe
		WeaponRecipe[34] = 1;//EarthAxe
		WeaponRecipe[35] = 1;//ElecAxe
		WeaponRecipe[36] = 1;//IceAxe
		WeaponRecipe[37] = 1;//LightAxe
		WeaponRecipe[38] = 1;//DarkAxe
		
		WeaponRecipe[39] = 1;//Hammer
		WeaponRecipe[40] = 1;//FireHammer
		WeaponRecipe[41] = 1;//WaterHammer
		WeaponRecipe[42] = 1;//WindHammer
		WeaponRecipe[43] = 1;//EarthHammer
		WeaponRecipe[44] = 1;//ElecHammer
		WeaponRecipe[45] = 1;//IceHammer
		WeaponRecipe[46] = 1;//LightHammer
		WeaponRecipe[47] = 1;//DarkHammer
		
		WeaponRecipe[48] = 1;//Pole
		WeaponRecipe[49] = 1;//FirePole
		WeaponRecipe[50] = 1;//WaterPole
		WeaponRecipe[51] = 1;//WindPole
		WeaponRecipe[52] = 1;//EarthPole
		WeaponRecipe[53] = 1;//ElecPole
		WeaponRecipe[54] = 1;//IcePole
		WeaponRecipe[55] = 1;//LightPole
		WeaponRecipe[56] = 1;//DarkPole
		
		WeaponRecipe[57] = 1;//Bomb
		WeaponRecipe[58] = 1;//FireBomb
		WeaponRecipe[59] = 1;//WaterBomb
		WeaponRecipe[60] = 1;//WindBomb
		WeaponRecipe[61] = 1;//EarthBomb
		WeaponRecipe[62] = 1;//ElecBomb
		WeaponRecipe[63] = 1;//IceBomb
		WeaponRecipe[64] = 1;//LightBomb
		WeaponRecipe[65] = 1;//DarkBomb
		WeaponRecipe[66] = 1;//Bigbomb
		WeaponRecipe[67] = 1;//Bugbomb
	}
	int[] WeaponMade = new int[68];{//or just WeaponRecipe = 2?
		WeaponMade[0] = 0;
		WeaponMade[1] = 1;
		WeaponMade[2] = 1;
		WeaponMade[3] = 1;
		WeaponMade[4] = 1;
		WeaponMade[5] = 1;
		
		WeaponMade[6] = 1;//FireSword
		WeaponMade[7] = 1;//WaterSword
		WeaponMade[8] = 1;//WindSword
		WeaponMade[9] = 1;//EarthSword
		WeaponMade[10] = 1;//ElecSword
		WeaponMade[11] = 1;//IceSword
		WeaponMade[12] = 1;//LightSword
		WeaponMade[13] = 1;//DarkSword
		WeaponMade[14] = 1;//Sw0rd
		WeaponMade[15] = 1;//NULL Sword
		WeaponMade[16] = 1;//Mysterious Sword
		WeaponMade[17] = 1;//Corroded Sword
		WeaponMade[18] = 1;//Corroded Sword
		WeaponMade[19] = 1;//AdminSword
		WeaponMade[20] = 1;//AllSword
		
		WeaponMade[21] = 1;//Lance
		WeaponMade[22] = 1;//FireLance
		WeaponMade[23] = 1;//WaterLance
		WeaponMade[24] = 1;//WindLance
		WeaponMade[25] = 1;//EarthLance
		WeaponMade[26] = 1;//ElecLance
		WeaponMade[27] = 1;//IceLance
		WeaponMade[28] = 1;//LightLance
		WeaponMade[29] = 1;//DarkLance
		
		WeaponMade[30] = 1;//Axe
		WeaponMade[31] = 1;//FireAxe
		WeaponMade[32] = 1;//WaterAxe
		WeaponMade[33] = 1;//WindAxe
		WeaponMade[34] = 1;//EarthAxe
		WeaponMade[35] = 1;//ElecAxe
		WeaponMade[36] = 1;//IceAxe
		WeaponMade[37] = 1;//LightAxe
		WeaponMade[38] = 1;//DarkAxe
		
		WeaponMade[39] = 1;//Hammer
		WeaponMade[40] = 1;//FireHammer
		WeaponMade[41] = 1;//WaterHammer
		WeaponMade[42] = 1;//WindHammer
		WeaponMade[43] = 1;//EarthHammer
		WeaponMade[44] = 1;//ElecHammer
		WeaponMade[45] = 1;//IceHammer
		WeaponMade[46] = 1;//LightHammer
		WeaponMade[47] = 1;//DarkHammer
		
		WeaponMade[48] = 1;//Pole
		WeaponMade[49] = 1;//FirePole
		WeaponMade[50] = 1;//WaterPole
		WeaponMade[51] = 1;//WindPole
		WeaponMade[52] = 1;//EarthPole
		WeaponMade[53] = 1;//ElecPole
		WeaponMade[54] = 1;//IcePole
		WeaponMade[55] = 1;//LightPole
		WeaponMade[56] = 1;//DarkPole
		
		WeaponMade[57] = 1;//Bomb
		WeaponMade[58] = 1;//FireBomb
		WeaponMade[59] = 1;//WaterBomb
		WeaponMade[60] = 1;//WindBomb
		WeaponMade[61] = 1;//EarthBomb
		WeaponMade[62] = 1;//ElecBomb
		WeaponMade[63] = 1;//IceBomb
		WeaponMade[64] = 1;//LightBomb
		WeaponMade[65] = 1;//DarkBomb
		WeaponMade[66] = 1;//Bigbomb
		WeaponMade[67] = 1;//Bugbomb
	}
	Weaponsmith NullWeapon = new Weaponsmith(00, 00, "", "No Disc", 0, "", 0, "", 0, 0, 0);
	Weaponsmith Weapon1 = NullWeapon;
	Weaponsmith Weapon2 = NullWeapon;
	Weaponsmith Weapon3 = NullWeapon;
	Weaponsmith Weapon4 = NullWeapon;
	Weaponsmith Weapon5 = NullWeapon;
	Weaponsmith Weapon6 = NullWeapon;
	Weaponsmith Weapon7 = NullWeapon;
	Weaponsmith[] WList = Weaponsmith.WeaponList(WeaponRecipe, WeaponMade);{
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 1){
			Weapon1 = WList[0];}
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 2){
			Weapon2 = WList[1];}
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 3){
			Weapon3 = WList[2];}
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 4){
			Weapon4 = WList[3];}
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 5){
			Weapon5 = WList[4];}
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 6){
			Weapon6 = WList[5];}
		if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 7){
			Weapon7 = WList[6];}
	}
	int WeaponPlacement = 0;
	Weaponsmith WeaponSelected = NullWeapon;
	int Amount1 = 0;
	int Amount2 = 0;
	
	
	int[] ArmorRecipe = new int[38];{
		
		ArmorRecipe[0] = 1;//TestItem 1?
		ArmorRecipe[1] = 1;//TestItem2
		ArmorRecipe[2] = 1;//TestItem4
		ArmorRecipe[3] = 1;//TestItem6
		ArmorRecipe[4] = 1;//hood
		ArmorRecipe[5] = 1;//robe
		ArmorRecipe[6] = 1;//Shirt.
		ArmorRecipe[7] = 1;//Gloves? Recipe
		ArmorRecipe[8] = 1;//Pants
		ArmorRecipe[9] = 1;//Socks
		
		ArmorRecipe[10] = 1;//Ghost Hood
		ArmorRecipe[11] = 1;//Ghost Robe
		ArmorRecipe[12] = 1;//Ghost Shirt
		ArmorRecipe[13] = 1;//Ghost Gloves
		ArmorRecipe[14] = 1;//GhostPants
		ArmorRecipe[15] = 1;//Ghost Socks
		
		ArmorRecipe[16] = 1;//Dark Hood
		ArmorRecipe[17] = 1;//Dark Robe
		ArmorRecipe[18] = 1;//Dark Shirt
		ArmorRecipe[19] = 1;//Dark Gloves
		ArmorRecipe[20] = 1;//DarkPants
		ArmorRecipe[21] = 1;//Dark Socks
		
		ArmorRecipe[22] = 1;//Chain Hood
		ArmorRecipe[23] = 1;//Chain Robe
		ArmorRecipe[24] = 1;//Chain Armor
		
		ArmorRecipe[25] = 1;//Slime Armor
		ArmorRecipe[26] = 1;//Golem Armor
		
		ArmorRecipe[27] = 1;//icy helmet
		ArmorRecipe[28] = 1;//icy Armor
		ArmorRecipe[29] = 1;//Icy Gauntlets
		ArmorRecipe[30] = 1;//Icy Boots
		
		ArmorRecipe[31] = 1;//Rubber Armor
		
		ArmorRecipe[32] = 1;//Pancake Armor
		ArmorRecipe[33] = 1;//PancakeArmor W Syrup
		
		ArmorRecipe[34] = 1;//Alloy A
		ArmorRecipe[35] = 1;//Alloy B
		ArmorRecipe[36] = 1;//Alloy D
		ArmorRecipe[37] = 1;//Alloy I
		
		//ArmorRecipe[38] = 1;//Helmet
		//ArmorRecipe[39] = 1;//Armor
		//ArmorRecipe[40] = 1;//Gauntlets
		//ArmorRecipe[41] = 1;//Boots			
		
		//ArmorRecipe[42] = 1;//Fire Helmet
		//ArmorRecipe[43] = 1;//Fire Armor
		//ArmorRecipe[44] = 1;//Fire Gauntlets
		//ArmorRecipe[45] = 1;//Fire Boots
		
		//ArmorRecipe[46] = 1;//WaterHelmet
		//ArmorRecipe[47] = 1;//Water Armor
		//ArmorRecipe[48] = 1;//Water Gauntlets
		//ArmorRecipe[49] = 1;//Water Boots	
		
		//ArmorRecipe[50] = 1;//Wind Helmet
		//ArmorRecipe[51] = 1;//Wind Armor
		//ArmorRecipe[52] = 1;//Wind Gauntlets
		//ArmorRecipe[53] = 1;//Wind Boots	
		
		//ArmorRecipe[54] = 1;//Earth Helmet
		//ArmorRecipe[55] = 1;//Earth Armor
		//ArmorRecipe[56] = 1;//Earth Gauntlets
		//ArmorRecipe[57] = 1;//Earth Boots	
		
		//ArmorRecipe[58] = 1;//Electric Helmet
		//ArmorRecipe[59] = 1;//Electric Armor
		//ArmorRecipe[60] = 1;//Electric Gauntlets
		//ArmorRecipe[61] = 1;//Electric Boots		
		
		//ArmorRecipe[62] = 1;//Ice Helmet
		//ArmorRecipe[63] = 1;//Ice Armor
		//ArmorRecipe[64] = 1;//Ice Gauntlets
		//ArmorRecipe[65] = 1;//Ice Boots		
		
		//ArmorRecipe[66] = 1;//Light Helmet
		//ArmorRecipe[67] = 1;//Light Armor
		//ArmorRecipe[68] = 1;//Light Gauntlets
		//ArmorRecipe[69] = 1;//Light Boots		
		
		//ArmorRecipe[70] = 1;//Dark Helmet
		//ArmorRecipe[71] = 1;//Dark Armor
		//ArmorRecipe[72] = 1;//Dark Gauntlets
		//ArmorRecipe[73] = 1;//Dark Boots	
		
		//ArmorRecipe[74] = 1;//Boots?
		//ArmorRecipe[75] = 1;//Shield?
		//ArmorRecipe[76] = 1;//Armor?
		//ArmorRecipe[77] = 1;//Gauntlets?
		//ArmorRecipe[78] = 1;//Helmet?
		
		//ArmorRecipe[79] = 1;//NULL Helmet
		//ArmorRecipe[80] = 1;//NULL Armor
		//ArmorRecipe[81] = 1;//NULL Gauntlets
		//ArmorRecipe[82] = 1;//NULL Boots		
		
		//ArmorRecipe[83] = 1;//Blueberry Armor
		
		//ArmorRecipe[84] = 1;//Mystery Armor
		
		//ArmorRecipe[85] = 1;//Corrupt Helmet
		//ArmorRecipe[86] = 1;//Corrupt Armor
		//ArmorRecipe[87] = 1;//Corrupt Gauntlets
		//ArmorRecipe[88] = 1;//Corrupt Boots		
		
		//ArmorRecipe[89] = 1;//Admin Armor
		
		//ArmorRecipe[90] = 1;//All Armor
	}
	int[] ArmorMade = new int[38];{
		
		ArmorMade[0] = 1;//TestItem 1?
		ArmorMade[1] = 1;//TestItem2
		ArmorMade[2] = 1;//TestItem4
		ArmorMade[3] = 1;//TestItem6
		ArmorMade[4] = 1;//hood
		ArmorMade[5] = 1;//robe
		ArmorMade[6] = 1;//shirt
		ArmorMade[7] = 0;//Gloves? Recipe
		ArmorMade[8] = 1;//pants
		ArmorMade[9] = 1;//Socks
		
		ArmorMade[10] = 1;//Ghost Hood
		ArmorMade[11] = 1;//Ghost Robe
		ArmorMade[12] = 1;//Ghost Shirt
		ArmorMade[13] = 1;//Ghost Gloves
		ArmorMade[14] = 1;//GhostPants
		ArmorMade[15] = 1;//Ghost Socks
		
		ArmorMade[16] = 1;//Dark Hood
		ArmorMade[17] = 1;//Dark Robe
		ArmorMade[18] = 1;//Dark Shirt
		ArmorMade[19] = 1;//Dark Gloves
		ArmorMade[20] = 1;//DarkPants
		ArmorMade[21] = 1;//Dark Socks
		
		ArmorMade[22] = 1;//Chain Hood
		ArmorMade[23] = 1;//Chain Robe
		ArmorMade[24] = 1;//Chain Armor
		
		ArmorMade[25] = 1;//Slime Armor
		ArmorMade[26] = 1;//Golem Armor
		
		ArmorMade[27] = 1;//icy helmet
		ArmorMade[28] = 1;//icy Armor
		ArmorMade[29] = 1;//Icy Gauntlets
		ArmorMade[30] = 1;//Icy Boots
		
		ArmorMade[31] = 1;//Rubber Armor
		
		ArmorMade[32] = 1;//Pancake Armor
		ArmorMade[33] = 1;//PancakeArmor W Syrup
		
		ArmorMade[34] = 1;//Alloy A
		ArmorMade[35] = 1;//Alloy B
		ArmorMade[36] = 1;//Alloy D
		ArmorMade[37] = 1;//Alloy I
		
		//ArmorMade[38] = 1;//Helmet
		//ArmorMade[39] = 1;//Armor
		//ArmorMade[40] = 1;//Gauntlets
		//ArmorMade[41] = 1;//Boots			
		
		//ArmorMade[42] = 1;//Fire Helmet
		//ArmorMade[43] = 1;//Fire Armor
		//ArmorMade[44] = 1;//Fire Gauntlets
		//ArmorMade[45] = 1;//Fire Boots
		
		//ArmorMade[46] = 1;//WaterHelmet
		//ArmorMade[47] = 1;//Water Armor
		//ArmorMade[48] = 1;//Water Gauntlets
		//ArmorMade[49] = 1;//Water Boots	
		
		//ArmorMade[50] = 1;//Wind Helmet
		//ArmorMade[51] = 1;//Wind Armor
		//ArmorMade[52] = 1;//Wind Gauntlets
		//ArmorMade[53] = 1;//Wind Boots	
		
		//ArmorMade[54] = 1;//Earth Helmet
		//ArmorMade[55] = 1;//Earth Armor
		//ArmorMade[56] = 1;//Earth Gauntlets
		//ArmorMade[57] = 1;//Earth Boots	
		
		//ArmorMade[58] = 1;//Electric Helmet
		//ArmorMade[59] = 1;//Electric Armor
		//ArmorMade[60] = 1;//Electric Gauntlets
		//ArmorMade[61] = 1;//Electric Boots		
		
		//ArmorMade[62] = 1;//Ice Helmet
		//ArmorMade[63] = 1;//Ice Armor
		//ArmorMade[64] = 1;//Ice Gauntlets
		//ArmorMade[65] = 1;//Ice Boots		
		
		//ArmorMade[66] = 1;//Light Helmet
		//ArmorMade[67] = 1;//Light Armor
		//ArmorMade[68] = 1;//Light Gauntlets
		//ArmorMade[69] = 1;//Light Boots		
		
		//ArmorMade[70] = 1;//Dark Helmet
		//ArmorMade[71] = 1;//Dark Armor
		//ArmorMade[72] = 1;//Dark Gauntlets
		//ArmorMade[73] = 1;//Dark Boots	
		
		//ArmorMade[74] = 1;//Boots?
		//ArmorMade[75] = 1;//Shield?
		//ArmorMade[76] = 1;//Armor?
		//ArmorMade[77] = 1;//Gauntlets?
		//ArmorMade[78] = 1;//Helmet?
		
		//ArmorMade[79] = 1;//NULL Helmet
		//ArmorMade[80] = 1;//NULL Armor
		//ArmorMade[81] = 1;//NULL Gauntlets
		//ArmorMade[82] = 1;//NULL Boots		
		
		//ArmorMade[83] = 1;//Blueberry Armor
		
		//ArmorMade[84] = 1;//Mystery Armor
		
		//ArmorMade[85] = 1;//Corrupt Helmet
		//ArmorMade[86] = 1;//Corrupt Armor
		//ArmorMade[87] = 1;//Corrupt Gauntlets
		//ArmorMade[88] = 1;//Corrupt Boots		
		
		//ArmorMade[89] = 1;//Admin Armor
		
		//ArmorMade[90] = 1;//All Armor
		
	}
	Armorsmith NullArmor = new Armorsmith(00, 00, "", "No Disc", 0, "", 0, "", 0, 0, 0);
	Armorsmith Armor1 = NullArmor;
	Armorsmith Armor2 = NullArmor;
	Armorsmith Armor3 = NullArmor;
	Armorsmith Armor4 = NullArmor;
	Armorsmith Armor5 = NullArmor;
	Armorsmith Armor6 = NullArmor;
	Armorsmith Armor7 = NullArmor;
	Armorsmith[] AList = Armorsmith.ArmorList(ArmorRecipe, ArmorMade);{
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 1){
			Armor1 = AList[0];}
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 2){
			Armor2 = AList[1];}
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 3){
			Armor3 = AList[2];}
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 4){
			Armor4 = AList[3];}
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 5){
			Armor5 = AList[4];}
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 6){
			Armor6 = AList[5];}
		if(Armorsmith.ArmorTotal(ArmorRecipe) >= 7){
			Armor7 = AList[6];}
	}
	int ArmorPlacement = 0;
	Armorsmith ArmorSelected = NullArmor;
	
	MonsterData MDataSelected = NullData; //MData?
	
	int[] EventSale = new int[13];{//Item Available for sale
		
		EventSale[0] = 1;//Bread Dough
		EventSale[1] = 1;//Gloves? Recipe
		EventSale[2] = 1;
		EventSale[3] = 1;
		EventSale[4] = 1;
		EventSale[5] = 1;
		EventSale[6] = 1;
		EventSale[7] = 1;
		EventSale[8] = 1;
		EventSale[9] = 1;
		EventSale[10] = 1;
		EventSale[11] = 1;
		EventSale[12] = 1;
	}
	int EventSaleTotal = Market.MarketTotal(EventSale);
	
	Market NullSale = new Market(00, "", "OutOfStock", 0, 0, 0);
	Market CurrentItemS = NullSale;
	Market ItemS1 = NullSale;
	Market ItemS2 = NullSale;
	Market ItemS3 = NullSale;
	Market ItemS4 = NullSale;
	Market ItemS5 = NullSale;
	Market ItemS6 = NullSale;
	Market ItemS7 = NullSale;
	Market[] ShopList = Market.MarketList(EventSale);{
		if(EventSaleTotal >=1){
			ItemS1 = ShopList[0];}
		if(EventSaleTotal >=2){
			ItemS2 = ShopList[1];}
		if(EventSaleTotal >=3){
			ItemS3 = ShopList[2];}
		if(EventSaleTotal >=4){
			ItemS4 = ShopList[3];}
		if(EventSaleTotal >=5){
			ItemS5 = ShopList[4];}
		if(EventSaleTotal >=6){
			ItemS6 = ShopList[5];}
		if(EventSaleTotal >=7){
			ItemS7 = ShopList[6];}
	}
	int ShopPlacement = 0;
	int ItemS1Qty = 1;//amount? quantity?
	int ItemS2Qty = 1;
	int ItemS3Qty = 1;
	int ItemS4Qty = 1;
	int ItemS5Qty = 1;
	int ItemS6Qty = 1;
	int ItemS7Qty = 1;
	
	int[] InvEvent = new int[12];{
		InvEvent[0] = 1;//TestMonster1
		InvEvent[1] = 1;//TestMonster2
		InvEvent[2] = 1;//TestMonster3
		InvEvent[3] = 1;//TestMonster4
		InvEvent[4] = 0;//TestMonster5 TestBoss
		InvEvent[5] = 1;//TestMonster6
		InvEvent[6] = 1;//TestMonster7
		InvEvent[7] = 1;//TestMonster8
		InvEvent[8] = 1;//TestMonster9
		InvEvent[9] = 1;//TestMonster10
		InvEvent[10] = 1;//???
		InvEvent[11] = 1;//Test
	}
	int InvEventTotal = Inventor.InvTotal(InvEvent);
	
	Inventor NullInv = new Inventor(000, "", 0, 1);
	Inventor Inv1 = NullInv;
	Inventor Inv2 = NullInv;
	Inventor Inv3 = NullInv;
	Inventor Inv4 = NullInv;
	Inventor Inv5 = NullInv;
	Inventor Inv6 = NullInv;
	Inventor Inv7 = NullInv;
	Inventor Inv8 = NullInv;
	Inventor Inv9 = NullInv;
	Inventor Inv10 = NullInv;
	Inventor[] InvList = Inventor.InvList(InvEvent, Monster1Defeated);{
		if(InvEventTotal >=1){
			Inv1 = InvList[0];}
		if(InvEventTotal >=2){
			Inv2 = InvList[1];}
		if(InvEventTotal >=3){
			Inv3 = InvList[2];}
		if(InvEventTotal >=4){
			Inv4 = InvList[3];}
		if(InvEventTotal >=5){
			Inv5 = InvList[4];}
		if(InvEventTotal >=6){
			Inv6 = InvList[5];}
		if(InvEventTotal >=7){
			Inv7 = InvList[6];}
		if(InvEventTotal >=8){
			Inv8 = InvList[7];}
		if(InvEventTotal >=9){
			Inv9 = InvList[8];}
		if(InvEventTotal >=10){
			Inv10 = InvList[9];}
	}
	int InvPlacement = 0;
	
	Items ItemSelected = NullItem;
	Items CurrentWeapon = NullItem;
	int WeaponType = 0;//Unequiped
	int WeaponElement = 0;//No Element
	
	Items CurrentHood = NullItem;
	Items CurrentHelmet = NullItem;
	Items CurrentRobe = NullItem;
	Items CurrentArmor = NullItem;
	Items CurrentShirt = NullItem;
	Items CurrentGuantlets = NullItem;
	Items CurrentGloves = NullItem;
	Items CurrentPants = NullItem;
	Items CurrentSocks = NullItem;
	Items CurrentBoots = NullItem;
	
	int CutsceneMode = 0;//Used for TalkTalkTalking!
	TalkTextCutscene NullCutscene = new TalkTextCutscene(0, "NULL", "", new int[]{0}, new int[][]{{0, 0}}, 1);//, new int[]{80}, new int[]{80}
	TalkTextCutscene CurrentCutscene = NullCutscene;
	int CutsceneText = 0;
	
	BattleEvent NullBattleEvent = new BattleEvent(0, "", "", new int[] {0}, new int[][] {{0}}, new int[] {0});
	BattleEvent CurrentBattleEvent = NullBattleEvent;
	
	String HiddenText1 = "";
	String HiddenText2 = "";
	
	int M = 0;
	int Var = 0;
	int EventS = 0;
	int ExamineUnlocked = 1; //May Rename
	int ItemUnlocked = 1; //May Rename
	int NotesUnlocked = 1; //May Rename
	int MoveUnlocked = 1; //May Rename
	int BattleLocation = 1;//?
	int ElderToggle = 0;
	int InventorToggle = 0;
	int ElderToggle2 = 0;
	int TopicToggle = 0;
	int WeaponToggle = 0;
	int WeaponToggle2 = 0;
	int ArmorToggle = 0;
	int ArmorToggle2 = 0;
	int TavernToggle = 0;
	int ShopToggle = 0;
	//int EventToggle = 0;//?
	int EnterToggle = 0;
	int DefeatToggle = 0;
	int ItemFoundToggle = 0;//ItemGet?
	int ItemToggle2 = 0;
	int ItemToggle3 = 0;
	
	int CutsceneToggle = 0;
	int BattleEventMode = 0;
	
	int BattleEventText = 0;
	int BattleEventToggle = 0;
	int EnemyEscapedToggle = 0;
	int BattleEventMonsterFocus = 0;
	
	public GamePanel() {//setup
		//this.setPreferredSize(new Dimension(screenpixelWidth, screenpixelHieght));
		this.setPreferredSize(new Dimension(200, 200));
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyHandler);
		this.setFocusable(true);
	}//Gamepanel setup end
	
	public void Startgamethread() {
		
		gamethread = new Thread(this);
		gamethread.start();
	}//end of Startgamethread

	@Override
	public void run() {
		
		while(gamethread != null) {
			
			//Update
			update();
			
			//Draw
			repaint();
			
		}//While Gamethread is existing end
	}//run End
	
	public void update() {
		
		if(Keyhandler.UpPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedUp();
			if(EnterOK == 0){
				//P1 X60 Y70 S for Selection? or not?
				//P2 X60 Y85
				//P3 X60 Y100
				//P4 X60 Y115
				
				if(ScreenType == 1 || ScreenType == 2){
				//P2 X60 Y85
					if(ScreenType == 1 || (Turn % 2 == 0 && ScreenType == 2)){//Monster's Turn
				if(Ypos == 3 && Xpos == 16){
					Ypos = 70;
					Xpos = 60;
				}
				
				if(Ypos == 85){
					Ypos = 70;
				}
				
				//P3 X60 Y100
				if(Ypos == 100){
				 Ypos = 85;
				}
				
				//P4 X60 Y115
				if(Ypos == 115){
				 Ypos = 100;
				}
				if(Ypos == 190 && Xpos == 7){
					Ypos = 70;
					Xpos = 60;
				}
					}
				}//Navigation Screen, or Battle Screen Up End
				
				//ItemScreen Placement Up
				if(ScreenType == 3 && ItemsFound !=0){
					if(Ypos == 30 && ItemPlacement > 0){
						ItemPlacement = ItemPlacement - 1;
						
						UpdateItem(ItemPlacement, ItemSortMode);
						
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 1){
						Ypos = 30;
						Xpos = 30;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 45 && ItemsFound > 1){
						Ypos = 30;
						Xpos = 30;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 2){
						Ypos = 45;
						Xpos = 30;
						Text1 = Item2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 60 && ItemsFound > 2){
						Ypos = 45;
						Xpos = 30;
						Text1 = Item2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 3){
						Ypos = 60;
						Xpos = 30;
						Text1 = Item3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 75 && ItemsFound > 3){
						Ypos = 60;
						Xpos = 30;
						Text1 = Item3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 4){
						Ypos = 75;
						Xpos = 30;
						Text1 = Item4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 90 && ItemsFound > 4){
						Ypos = 75;
						Xpos = 30;
						Text1 = Item4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 5){
						Ypos = 90;
						Xpos = 30;
						Text1 = Item5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 105 && ItemsFound > 5){
						Ypos = 90;
						Xpos = 30;
						Text1 = Item5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 6){
						Ypos = 105;
						Xpos = 30;
						Text1 = Item6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 120 && ItemsFound > 6){
						Ypos = 105;
						Xpos = 30;
						Text1 = Item6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound >= 7){
						Ypos = 120;
						Xpos = 30;
						Text1 = Item7.getItemDisc();
						Text2 = "";
					}
				}//ItemScreen Up End
				
				//NoteScreen Placement Up
				if(ScreenType == 5 && NotesFound != 0){
					//CurserMoveUp
					//Ypos = CurserMoveUp(Xpos, YPos, ScreenType, NotesFound, NotePage);
					//Xpos = CurserMoveUp(Xpos, YPos, ScreenType, NotesFound, NotePage);
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, NotesFound, NotePage)[0];
					XPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, NotesFound, NotePage)[1];
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;
					//10 Notes Per Page
					//Notes on page = NoteTotal - ((Page - 1) X 10) if Note Total - current Page !> 10
//					if(Ypos == ??? && NotesFound == 0){
//						//Ypos = ??;
//						//Xpos = ??;
//					}
						
				}//NoteScreen Up End
				
				//Password Screen Up
				if(ScreenType == 0){
					if(Xpos == 7 && Ypos == 190 && PasswordMode == 1){// Active Mode
						Ypos = 165;
					}
				}
				
				//MoveScreen Up
				if(ScreenType == 7){
					if(AreasFound != 0){
					if(Ypos == 30 && AreaPlacement > 0){
						AreaPlacement = AreaPlacement - 1;
						
						Area1 = NULLData;
						Area2 = NULLData;
						Area3 = NULLData;
						Area4 = NULLData;
						Area5 = NULLData;
						Area6 = NULLData;
						Area7 = NULLData;
						Area8 = NULLData;
						Area9 = NULLData;
						Area10 = NULLData;
						AreaD = AreaData.AList(Area1Found, CurrentArea.AreaNo, AccessArea);{
							if(AreasFound >=1){
								Area1 = AreaD[0 + AreaPlacement];
							}
							if(AreasFound >=2){
								Area2 = AreaD[1 + AreaPlacement];
							}
							if(AreasFound >=3){
								Area3 = AreaD[2 + AreaPlacement];
							}
							if(AreasFound >=4){
								Area4 = AreaD[3 + AreaPlacement];
							}
							if(AreasFound >=5){
								Area5 = AreaD[4 + AreaPlacement];
							}
							if(AreasFound >=6){
								Area6 = AreaD[5 + AreaPlacement];
							}
							if(AreasFound >=7){
								Area7 = AreaD[6 + AreaPlacement];
							}
							if(AreasFound >=8){
								Area8 = AreaD[7 + AreaPlacement];
							}
							if(AreasFound >=9){
								Area9 = AreaD[8 + AreaPlacement];
							}
							if(AreasFound >=10){
								Area10 = AreaD[9 + AreaPlacement];
							}
						}
					}
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, AreasFound, AreaPlacement)[0];//AreaPage? AreaRage?
					XPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, AreasFound, AreaPlacement)[1];//TODO What if AreaPlacement (or other variable) acted like zelda Beta Quest? (cutscene quest)?
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;
					
					}//AreasFound != 0 (Some areas have been found?)
				}//MoveScreen Up End
				
				//CookScreen Up 
				if(ScreenType == 4 && ItemsFound !=0){
					if(Ypos == 30 && ItemPlacement > 0){
						ItemPlacement = ItemPlacement - 1;
						
						UpdateItem(ItemPlacement, 0);//? ItemSortMode Always 0 for Cookscreen?
						
						CurrentItem = Item1;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 1){
						Ypos = 30;
						Xpos = 5;
						CurrentItem = Item1;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 45 && ItemsFound > 1){
						Ypos = 30;
						Xpos = 5;
						CurrentItem = Item1;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 2){
						Ypos = 45;
						Xpos = 5;
						CurrentItem = Item2;
						Text1 = Item2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 60 && ItemsFound > 2){
						Ypos = 45;
						Xpos = 5;
						CurrentItem = Item2;
						Text1 = Item2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 3){
						Ypos = 60;
						Xpos = 5;
						CurrentItem = Item3;
						Text1 = Item3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 75 && ItemsFound > 3){
						Ypos = 60;
						Xpos = 5;
						CurrentItem = Item3;
						Text1 = Item3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 4){
						Ypos = 75;
						Xpos = 5;
						CurrentItem = Item4;
						Text1 = Item4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 90 && ItemsFound > 4){
						Ypos = 75;
						Xpos = 5;
						CurrentItem = Item4;
						Text1 = Item4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 5){
						Ypos = 90;
						Xpos = 5;
						CurrentItem = Item5;
						Text1 = Item5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 105 && ItemsFound > 5){
						Ypos = 90;
						Xpos = 5;
						CurrentItem = Item5;
						Text1 = Item5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound == 6){
						Ypos = 105;
						Xpos = 5;
						CurrentItem = Item6;
						Text1 = Item6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 120 && ItemsFound > 6){
						Ypos = 105;
						Xpos = 5;
						CurrentItem = Item6;
						Text1 = Item6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && ItemsFound >= 7){
						Ypos = 120;
						Xpos = 5;
						CurrentItem = Item7;
						Text1 = Item7.getItemDisc();
						Text2 = "";
					}
				}//CookScreen Up and if you have ingredients End
				
				//Inventor Screen Up
				if(ScreenType == 14 && InvEventTotal != 0){
					if(Ypos == 30 && InvPlacement > 0){
						InvPlacement = InvPlacement - 1;
						
						Inv1 = NullInv;
						Inv2 = NullInv;
						Inv3 = NullInv;
						Inv4 = NullInv;
						Inv5 = NullInv;
						Inv6 = NullInv;
						Inv7 = NullInv;
						Inv8 = NullInv;
						Inv9 = NullInv;
						Inv10 = NullInv;
						InvList = Inventor.InvList(InvEvent, Monster1Defeated);{
						if(InvEventTotal >=1){//?
							Inv1 = InvList[0 + InvPlacement];
						}
						if(InvEventTotal >=2){
							Inv2 = InvList[1 + InvPlacement];
						}
						if(InvEventTotal >=3){
							Inv3 = InvList[2 + InvPlacement];
						}
						if(InvEventTotal >=4){
							Inv4 = InvList[3 + InvPlacement];
						}
						if(InvEventTotal >=5){
							Inv5 = InvList[4 + InvPlacement];
						}
						if(InvEventTotal >=6){
							Inv6 = InvList[5 + InvPlacement];
						}
						if(InvEventTotal >=7){
							Inv7 = InvList[6 + InvPlacement];
						}
						if(InvEventTotal >=8){
							Inv8 = InvList[7 + InvPlacement];
						}
						if(InvEventTotal >=9){
							Inv9 = InvList[8 + InvPlacement];
						}
						if(InvEventTotal >=10){
							Inv10 = InvList[9 + InvPlacement];
						}
						}
					}
					
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, InvEventTotal, InvPlacement)[0];//TODO See AreaPlacement
					XPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, InvEventTotal, InvPlacement)[1];//TODO InvPlacement What if this changed the monster? or something else in the Inventor Page screen itself?
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;
					
				}//Inventor Screen Up End
				
				//Elder Screen Up
				if(ScreenType == 11){
					if(Ypos == 85){
						Ypos = 70;
					}
					
					//P3 X60 Y100
					if(Ypos == 100){
					 Ypos = 85;
					}
					
					//P4 X60 Y115
					if(Ypos == 115){
					 Ypos = 100;
					}
				}//Elder Screen Up End
				
				//Topics Screen Up
				if(ScreenType == 9 && DiscussionsFound != 0){
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[0];//Glitch where AreasFound or InvEventTotal is used instead of DiscussionsFound?
					XPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[1];//One you find enough areas, the glitch corrects itself, and you can view the other pages of Discussions
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;
					
				}//Topic Screen Up End
				
				//Monster List Up
				if(ScreenType == 12 && MonstersFound != 0){
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[0];
					XPOSNEW = Movement.CurserMoveUp(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[1];
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;

				}//MonsterList Up End
				
				//Shop Up
				if(ScreenType == 13 && EventSaleTotal != 0){
					if(Ypos == 30 && ShopPlacement > 0){
						ShopPlacement = ShopPlacement - 1;
						ItemS1 = NullSale;
						ItemS2 = NullSale;
						ItemS3 = NullSale;
						ItemS4 = NullSale;
						ItemS5 = NullSale;
						ItemS6 = NullSale;
						ItemS7 = NullSale;
						ItemS1Qty = 1;//amount? quantity?
						ItemS2Qty = ItemS1Qty;
						ItemS3Qty = ItemS2Qty;
						ItemS4Qty = ItemS3Qty;
						ItemS5Qty = ItemS4Qty;
						ItemS6Qty = ItemS5Qty;
						ItemS7Qty = ItemS6Qty;
						ShopList = Market.MarketList(EventSale);{
						if(EventSaleTotal >=1){//?
							ItemS1 = ShopList[0 + ShopPlacement];
						}
						if(EventSaleTotal >=2){
							ItemS2 = ShopList[1 + ShopPlacement];
						}
						if(EventSaleTotal >=3){
							ItemS3 = ShopList[2 + ShopPlacement];
						}
						if(EventSaleTotal >=4){
							ItemS4 = ShopList[3 + ShopPlacement];
						}
						if(EventSaleTotal >=5){
							ItemS5 = ShopList[4 + ShopPlacement];
						}
						if(EventSaleTotal >=6){
							ItemS6 = ShopList[5 + ShopPlacement];
						}
						if(EventSaleTotal >=7){
							ItemS7 = ShopList[6 + ShopPlacement];
						}
						}
						CurrentItemS = ItemS1;
						Text1 = ItemS1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal == 1){
						Ypos = 30;
						Xpos = 30;
						CurrentItemS = ItemS1;
						Text1 = ItemS1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 45 && EventSaleTotal > 1){
						Ypos = 30;
						Xpos = 30;
						CurrentItemS = ItemS1;
						Text1 = ItemS1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal == 2){
						Ypos = 45;
						Xpos = 30;
						CurrentItemS = ItemS2;
						Text1 = ItemS2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 60 && EventSaleTotal > 2){
						Ypos = 45;
						Xpos = 30;
						CurrentItemS = ItemS2;
						Text1 = ItemS2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal == 3){
						Ypos = 60;
						Xpos = 30;
						CurrentItemS = ItemS3;
						Text1 = ItemS3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 75 && EventSaleTotal > 3){
						Ypos = 60;
						Xpos = 30;
						CurrentItemS = ItemS3;
						Text1 = ItemS3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal == 4){
						Ypos = 75;
						Xpos = 30;
						CurrentItemS = ItemS4;
						Text1 = ItemS4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 90 && EventSaleTotal > 4){
						Ypos = 75;
						Xpos = 30;
						CurrentItemS = ItemS4;
						Text1 = ItemS4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal == 5){
						Ypos = 90;
						Xpos = 30;
						CurrentItemS = ItemS5;
						Text1 = ItemS5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 105 && EventSaleTotal > 5){
						Ypos = 90;
						Xpos = 30;
						CurrentItemS = ItemS5;
						Text1 = ItemS5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal == 6){
						Ypos = 105;
						Xpos = 30;
						CurrentItemS = ItemS6;
						Text1 = ItemS6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 120 && EventSaleTotal > 6){
						Ypos = 105;
						Xpos = 30;
						CurrentItemS = ItemS6;
						Text1 = ItemS6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 190 && EventSaleTotal > 6){
						Ypos = 120;
						Xpos = 30;
						CurrentItemS = ItemS7;
						Text1 = ItemS7.getItemDisc();
						Text2 = "";
					}
				}//Shop Up End
				
				//WeaponSmith Up
				if(ScreenType == 10){
					if(Weaponsmith.WeaponTotal(WeaponRecipe) != 0){
						if(Ypos == 30 && WeaponPlacement > 0){
							WeaponPlacement = WeaponPlacement - 1;
							Weapon1 = NullWeapon;
							Weapon2 = NullWeapon;
							Weapon3 = NullWeapon;
							Weapon4 = NullWeapon;
							Weapon5 = NullWeapon;
							Weapon6 = NullWeapon;
							Weapon7 = NullWeapon;
							WList = Weaponsmith.WeaponList(WeaponRecipe, WeaponMade);{
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=1){//?
								Weapon1 = WList[0 + WeaponPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=2){
								Weapon2 = WList[1 + WeaponPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=3){
								Weapon3 = WList[2 + WeaponPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=4){
								Weapon4 = WList[3 + WeaponPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=5){
								Weapon5 = WList[4 + WeaponPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=6){
								Weapon6 = WList[5 + WeaponPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=7){
								Weapon7 = WList[6 + WeaponPlacement];
							}
							}
							Text1 = Weapon1.getItemDisc();
							Text2 = "";
							Price = Weapon1.getPrice();
							WeaponSelected = Weapon1;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 1){
							Ypos = 30;
							Xpos = 30;
							Text1 = Weapon1.getItemDisc();
							Text2 = "";
							Price = Weapon1.getPrice();
							WeaponSelected = Weapon1;
						}
						if(Ypos == 45 && Weaponsmith.WeaponTotal(WeaponRecipe) > 1){
							Ypos = 30;
							Xpos = 30;
							Text1 = Weapon1.getItemDisc();
							Text2 = "";
							Price = Weapon1.getPrice();
							WeaponSelected = Weapon1;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 2){
							Ypos = 45;
							Xpos = 30;
							Text1 = Weapon2.getItemDisc();
							Text2 = "";
							Price = Weapon2.getPrice();
							WeaponSelected = Weapon2;
						}
						if(Ypos == 60 && Weaponsmith.WeaponTotal(WeaponRecipe) > 2){
							Ypos = 45;
							Xpos = 30;
							Text1 = Weapon2.getItemDisc();
							Text2 = "";
							Price = Weapon2.getPrice();
							WeaponSelected = Weapon2;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 3){
							Ypos = 60;
							Xpos = 30;
							Text1 = Weapon3.getItemDisc();
							Text2 = "";
							Price = Weapon3.getPrice();
							WeaponSelected = Weapon3;
						}
						if(Ypos == 75 && Weaponsmith.WeaponTotal(WeaponRecipe) > 3){
							Ypos = 60;
							Xpos = 30;
							Text1 = Weapon3.getItemDisc();
							Text2 = "";
							Price = Weapon3.getPrice();
							WeaponSelected = Weapon3;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 4){
							Ypos = 75;
							Xpos = 30;
							Text1 = Weapon4.getItemDisc();
							Text2 = "";
							Price = Weapon4.getPrice();
							WeaponSelected = Weapon4;
						}
						if(Ypos == 90 && Weaponsmith.WeaponTotal(WeaponRecipe) > 4){
							Ypos = 75;
							Xpos = 30;
							Text1 = Weapon4.getItemDisc();
							Text2 = "";
							Price = Weapon4.getPrice();
							WeaponSelected = Weapon4;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 5){
							Ypos = 90;
							Xpos = 30;
							Text1 = Weapon5.getItemDisc();
							Text2 = "";
							Price = Weapon5.getPrice();
							WeaponSelected = Weapon5;
						}
						if(Ypos == 105 && Weaponsmith.WeaponTotal(WeaponRecipe) > 5){
							Ypos = 90;
							Xpos = 30;
							Text1 = Weapon5.getItemDisc();
							Text2 = "";
							Price = Weapon5.getPrice();
							WeaponSelected = Weapon5;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 6){
							Ypos = 105;
							Xpos = 30;
							Text1 = Weapon6.getItemDisc();
							Text2 = "";
							Price = Weapon6.getPrice();
							WeaponSelected = Weapon6;
						}
						if(Ypos == 120 && Weaponsmith.WeaponTotal(WeaponRecipe) > 6){
							Ypos = 105;
							Xpos = 30;
							Text1 = Weapon6.getItemDisc();
							Text2 = "";
							Price = Weapon6.getPrice();
							WeaponSelected = Weapon6;
						}
						if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) > 6){
							Ypos = 120;
							Xpos = 30;
							Text1 = Weapon7.getItemDisc();
							Text2 = "";
							Price = Weapon7.getPrice();
							WeaponSelected = Weapon7;
						}
						if(WeaponSelected.getMaterialNo1() == 0){//
							Amount1 = 0;
						}
						if(WeaponSelected.getMaterialNo1() != 0){
							Amount1 = ItemAmount1[WeaponSelected.getMaterialNo1() - 1];
						}
						if(WeaponSelected.getMaterialNo2() == 0){
							Amount2 = 0;
						}
						if(WeaponSelected.getMaterialNo2() != 0){
							Amount2 = ItemAmount1[WeaponSelected.getMaterialNo2() - 1];
						}//
					}//If Has Weapon Recipes End
				}//Weaponsmith Up End
				
				//ArmorSmith Up
				if(ScreenType == 16){
					if(Armorsmith.ArmorTotal(ArmorRecipe) != 0){
						if(Ypos == 30 && ArmorPlacement > 0){
							ArmorPlacement = ArmorPlacement - 1;
							Armor1 = NullArmor;
							Armor2 = NullArmor;
							Armor3 = NullArmor;
							Armor4 = NullArmor;
							Armor5 = NullArmor;
							Armor6 = NullArmor;
							Armor7 = NullArmor;
							AList = Armorsmith.ArmorList(ArmorRecipe, ArmorMade);{
							if(Armorsmith.ArmorTotal(ArmorRecipe) >=1){//?
								Armor1 = AList[0 + ArmorPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=2){
								Armor2 = AList[1 + ArmorPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=3){
								Armor3 = AList[2 + ArmorPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=4){
								Armor4 = AList[3 + ArmorPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=5){
								Armor5 = AList[4 + ArmorPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=6){
								Armor6 = AList[5 + ArmorPlacement];
							}
							if(Weaponsmith.WeaponTotal(WeaponRecipe) >=7){
								Armor7 = AList[6 + ArmorPlacement];
							}
							}
							Text1 = Armor1.getItemDisc();
							Text2 = "";
							Price = Armor1.getPrice();
							ArmorSelected = Armor1;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 1){
							Ypos = 30;
							Xpos = 30;
							Text1 = Armor1.getItemDisc();
							Text2 = "";
							Price = Armor1.getPrice();
							ArmorSelected = Armor1;
						}
						if(Ypos == 45 && Armorsmith.ArmorTotal(ArmorRecipe) > 1){
							Ypos = 30;
							Xpos = 30;
							Text1 = Armor1.getItemDisc();
							Text2 = "";
							Price = Armor1.getPrice();
							ArmorSelected = Armor1;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 2){
							Ypos = 45;
							Xpos = 30;
							Text1 = Armor2.getItemDisc();
							Text2 = "";
							Price = Armor2.getPrice();
							ArmorSelected = Armor2;
						}
						if(Ypos == 60 && Armorsmith.ArmorTotal(ArmorRecipe) > 2){
							Ypos = 45;
							Xpos = 30;
							Text1 = Armor2.getItemDisc();
							Text2 = "";
							Price = Armor2.getPrice();
							ArmorSelected = Armor2;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 3){
							Ypos = 60;
							Xpos = 30;
							Text1 = Armor3.getItemDisc();
							Text2 = "";
							Price = Armor3.getPrice();
							ArmorSelected = Armor3;
						}
						if(Ypos == 75 && Armorsmith.ArmorTotal(ArmorRecipe) > 3){
							Ypos = 60;
							Xpos = 30;
							Text1 = Armor3.getItemDisc();
							Text2 = "";
							Price = Armor3.getPrice();
							ArmorSelected = Armor3;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 4){
							Ypos = 75;
							Xpos = 30;
							Text1 = Armor4.getItemDisc();
							Text2 = "";
							Price = Armor4.getPrice();
							ArmorSelected = Armor4;
						}
						if(Ypos == 90 && Armorsmith.ArmorTotal(ArmorRecipe) > 4){
							Ypos = 75;
							Xpos = 30;
							Text1 = Armor4.getItemDisc();
							Text2 = "";
							Price = Armor4.getPrice();
							ArmorSelected = Armor4;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 5){
							Ypos = 90;
							Xpos = 30;
							Text1 = Armor5.getItemDisc();
							Text2 = "";
							Price = Armor5.getPrice();
							ArmorSelected = Armor5;
						}
						if(Ypos == 105 && Armorsmith.ArmorTotal(ArmorRecipe) > 5){
							Ypos = 90;
							Xpos = 30;
							Text1 = Armor5.getItemDisc();
							Text2 = "";
							Price = Armor5.getPrice();
							ArmorSelected = Armor5;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 6){
							Ypos = 105;
							Xpos = 30;
							Text1 = Armor6.getItemDisc();
							Text2 = "";
							Price = Armor6.getPrice();
							ArmorSelected = Armor6;
						}
						if(Ypos == 120 && Armorsmith.ArmorTotal(ArmorRecipe) > 6){
							Ypos = 105;
							Xpos = 30;
							Text1 = Armor6.getItemDisc();
							Text2 = "";
							Price = Armor6.getPrice();
							ArmorSelected = Armor6;
						}
						if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) > 6){
							Ypos = 120;
							Xpos = 30;
							Text1 = Armor7.getItemDisc();
							Text2 = "";
							Price = Armor7.getPrice();
							ArmorSelected = Armor7;
						}
						if(ArmorSelected.getMaterialNo1() == 0){
							Amount1 = 0;
						}
						if(ArmorSelected.getMaterialNo1() != 0){
							Amount1 = ItemAmount1[ArmorSelected.getMaterialNo1() - 1];
						}
						if(ArmorSelected.getMaterialNo2() == 0){
							Amount2 = 0;
						}
						if(ArmorSelected.getMaterialNo2() != 0){
							Amount2 = ItemAmount1[ArmorSelected.getMaterialNo2() - 1];
						}
					}//If Has Armor Recipes End
				}//Armorsmith Up End
				
				//Tavern Up
				if(ScreenType == 17){
					
				}//Tavern Up End
				
				}
			Keyhandler.UpPressed = false;
		}//Up Key Pressed End
		
		if(Keyhandler.DownPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				//P1 X60 Y70
				//P2 X60 Y85
				//P3 X60 Y100
				//P4 X60 Y115
				
				if(ScreenType == 1 || ScreenType == 2){
				//P3 X60 Y100
					if(ScreenType == 1 || (Turn % 2 == 0 && ScreenType == 2)){//Monster's Turn
				if(Ypos == 100){	
				 Ypos = 115;
				}
				
				//P2 X60 Y85
				if(Ypos == 85){
				 Ypos = 100;
				}
				
				//P1 X60 Y70 
				if(Ypos == 70){
					Ypos = 85;
				}
					}
				}
				
				//ItemScreen Placement Down
				if(ScreenType == 3){
					if(ItemsFound !=0){
//					if(Ypos == 30){
//						Ypos = 190;
//						Xpos = 140;
//					}
					if(Ypos == 120 && ItemsFound >= 7 && ItemPlacement >= ItemsFound - 7){// && ItemPlacement <= Itemsfound - 10
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					if(Ypos == 120 && ItemsFound >= 7 && ItemPlacement < ItemsFound - 7){
						ItemPlacement = ItemPlacement + 1;
						
						Item1 = NullItem;
						Item2 = NullItem;
						Item3 = NullItem;
						Item4 = NullItem;
						Item5 = NullItem;
						Item6 = NullItem;
						Item7 = NullItem;
						Items[] ItemList = Items.ItemList(Item1Found, ItemSortMode, Gamemode);{
							Item1 = ItemList[0 + ItemPlacement];
							Item2 = ItemList[1 + ItemPlacement];
							Item3 = ItemList[2 + ItemPlacement];
							Item4 = ItemList[3 + ItemPlacement];
							Item5 = ItemList[4 + ItemPlacement];
							Item6 = ItemList[5 + ItemPlacement];
							Item7 = ItemList[6 + ItemPlacement];
						}
						Text1 = Item7.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 105 && ItemsFound > 6){
						Ypos = 120;
						Xpos = 30;
						Text1 = Item7.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 105 && ItemsFound == 6){
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					if(Ypos == 90 && ItemsFound > 5){
						Ypos = 105;
						Xpos = 30;
						Text1 = Item6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 90 && ItemsFound == 5){
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					if(Ypos == 75 && ItemsFound > 4){
						Ypos = 90;
						Xpos = 30;
						Text1 = Item5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 75 && ItemsFound == 4){
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					if(Ypos == 60 && ItemsFound > 3){
						Ypos = 75;
						Xpos = 30;
						Text1 = Item4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 60 && ItemsFound == 3){
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					if(Ypos == 45 && ItemsFound > 2){
						Ypos = 60;
						Xpos = 30;
						Text1 = Item3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 45 && ItemsFound == 2){
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					if(Ypos == 30 && ItemsFound > 1){
						Ypos = 45;
						Xpos = 30;
						Text1 = Item2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 30 && ItemsFound == 1){
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					}
				}//Itemscreen Down End
				
				//Notescreen Placement Down
				if(ScreenType == 5 && NotesFound != 0){
//					if(Ypos == ??){//Item3 to 4 notation?
//						//Ypos = ??;
//						//Xpos = ??;
//					}
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, NotesFound, NotePage)[0];//Odd Placement like 0, 0 or 0 , 30
					XPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, NotesFound, NotePage)[1];
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;

				}//Notescreen Down End
				
				//Password Screen Down
				if(ScreenType == 0){
					if(Xpos == 7 && Ypos == 165){
						Ypos = 190;
					}
				}
				
				//MoveScreen Down
				if(ScreenType == 7){
					if(AreasFound != 0){
						System.out.println("What is area placement" + AreaPlacement);
						if(Ypos == 165 && AreasFound >= 10 && AreaPlacement >= AreasFound - 10){
							Ypos = 190;
							Xpos = 140;
						}//End of if has no more areas and can press down
						else if(Ypos == 165 && AreasFound >= 10 && AreaPlacement < AreasFound - 10){
							AreaPlacement = AreaPlacement + 1;
							Area1 = NULLData;
							Area2 = NULLData;
							Area3 = NULLData;
							Area4 = NULLData;
							Area5 = NULLData;
							Area6 = NULLData;
							Area7 = NULLData;
							Area8 = NULLData;
							Area9 = NULLData;
							Area10 = NULLData;
							AreaD = AreaData.AList(Area1Found, CurrentArea.AreaNo, AccessArea);{
								Area1 = AreaD[0 + AreaPlacement];
								Area2 = AreaD[1 + AreaPlacement];
								Area3 = AreaD[2 + AreaPlacement];
								Area4 = AreaD[3 + AreaPlacement];
								Area5 = AreaD[4 + AreaPlacement];
								Area6 = AreaD[5 + AreaPlacement];
								Area7 = AreaD[6 + AreaPlacement];
								Area8 = AreaD[7 + AreaPlacement];
								Area9 = AreaD[8 + AreaPlacement];
								Area10 = AreaD[9 + AreaPlacement];
							}
						}
						int YPOSNEW = 0;
						int XPOSNEW = 0;
						YPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, AreasFound, AreaPlacement)[0];//Odd Placement like 0, 0 or 0 , 30
						XPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, AreasFound, AreaPlacement)[1];//Noteplacement? 
						Ypos = YPOSNEW;
						Xpos = XPOSNEW;

					}//Actually FOund some Areas
				}//Movescreen Down End
				
				//CookScreen Down
				if(ScreenType == 4){
					if(ItemsFound !=0){
//						if(Ypos == 30){
//							Ypos = 190;
//							Xpos = 140;
//						}
						if(Ypos == 120 && ItemsFound >= 7 && ItemPlacement >= ItemsFound - 7){// && ItemPlacement <= Itemsfound - 10
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 120 && ItemsFound >= 7 && ItemPlacement < ItemsFound - 7){
							ItemPlacement = ItemPlacement + 1;
							Item1 = NullItem;
							Item2 = NullItem;
							Item3 = NullItem;
							Item4 = NullItem;
							Item5 = NullItem;
							Item6 = NullItem;
							Item7 = NullItem;
							Items[] ItemList = Items.ItemList(Item1Found, 0, Gamemode);{
								Item1 = ItemList[0 + ItemPlacement];
								Item2 = ItemList[1 + ItemPlacement];
								Item3 = ItemList[2 + ItemPlacement];
								Item4 = ItemList[3 + ItemPlacement];
								Item5 = ItemList[4 + ItemPlacement];
								Item6 = ItemList[5 + ItemPlacement];
								Item7 = ItemList[6 + ItemPlacement];
							}
							CurrentItem = Item7;
							Text1 = Item7.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 105 && ItemsFound > 6){
							Ypos = 120;
							Xpos = 5;
							CurrentItem = Item7;
							Text1 = Item7.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 105 && ItemsFound == 6){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 90 && ItemsFound > 5){
							Ypos = 105;
							Xpos = 5;
							CurrentItem = Item6;
							Text1 = Item6.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 90 && ItemsFound == 5){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 75 && ItemsFound > 4){
							Ypos = 90;
							Xpos = 5;
							CurrentItem = Item5;
							Text1 = Item5.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 75 && ItemsFound == 4){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 60 && ItemsFound > 3){
							Ypos = 75;
							Xpos = 5;
							CurrentItem = Item4;
							Text1 = Item4.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 60 && ItemsFound == 3){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 45 && ItemsFound > 2){
							Ypos = 60;
							Xpos = 5;
							CurrentItem = Item3;
							Text1 = Item3.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 45 && ItemsFound == 2){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 30 && ItemsFound > 1){
							Ypos = 45;
							Xpos = 5;
							CurrentItem = Item2;
							Text1 = Item2.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 30 && ItemsFound == 1){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 95 && Xpos == 75){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 95 && Xpos == 125){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
					}
				}//Cookscreen Down End
				
				//Inventor Screen Down
				if(ScreenType == 14){
					if(InvEventTotal != 0){
						if(Ypos == 165 && InvEventTotal >= 10 && InvPlacement >= InvEventTotal - 10){
							Ypos = 190;
							Xpos = 140;
						}
						if(Ypos == 165 && InvEventTotal >= 10 && InvPlacement < InvEventTotal - 10){
						InvPlacement = InvPlacement + 1;
						Inv1 = NullInv;
						Inv2 = NullInv;
						Inv3 = NullInv;
						Inv4 = NullInv;
						Inv5 = NullInv;
						Inv6 = NullInv;
						Inv7 = NullInv;
						Inv8 = NullInv;
						Inv9 = NullInv;
						Inv10 = NullInv;
						InvList = Inventor.InvList(InvEvent, Monster1Defeated);{
							Inv1 = InvList[0 + InvPlacement];
							Inv2 = InvList[1 + InvPlacement];
							Inv3 = InvList[2 + InvPlacement];
							Inv4 = InvList[3 + InvPlacement];
							Inv5 = InvList[4 + InvPlacement];
							Inv6 = InvList[5 + InvPlacement];
							Inv7 = InvList[6 + InvPlacement];
							Inv8 = InvList[7 + InvPlacement];
							Inv9 = InvList[8 + InvPlacement];
							Inv10 = InvList[9 + InvPlacement];
						}
						//if(GlitchFunction){
						//	Ypos = 190;
						//	Xpos = 140;
						//}
					}//Inventor Down Y = 165
						int YPOSNEW = 0;
						int XPOSNEW = 0;
						YPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, InvEventTotal, InvPlacement)[0];//Invplacement For when you need more room for extra battle challenges or something :)
						XPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, InvEventTotal, InvPlacement)[1];
						Ypos = YPOSNEW;
						Xpos = XPOSNEW;

					}//Has some inventor battle data
				}//Inventor Screen Down End
				
				//Elder Screen Down
				if(ScreenType == 11){
					//P3 X60 Y100 //if(Turn % 2 != 0){
					if(Ypos == 100){
					 Ypos = 115;
					}
					
					//P2 X60 Y85
					if(Ypos == 85){
					 Ypos = 100;
					}
					
					//P1 X60 Y70
					if(Ypos == 70){
						Ypos = 85;
					}
				}//Elder Screen Down End
				
				//Topics Screen Down
				if(ScreenType == 9 && DiscussionsFound != 0){
					int YPOSNEW = 0;
					int XPOSNEW = 0;
					YPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[0];//In the next game, you can talk to everyone, but the Elder still has the most to say
					XPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[1];//If I still find it possible to make
					Ypos = YPOSNEW;
					Xpos = XPOSNEW;

				}//Topic Screen Down End
				
				//Monster List Down
				if(ScreenType == 12){
					if(MonstersFound != 0){
						int YPOSNEW = 0;
						int XPOSNEW = 0;
						YPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[0];//TODO Maybe empty spaces in Monster list are not skipped, but they don't do anything when clicked on?
						XPOSNEW = Movement.CurserMoveDown(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[1];
						Ypos = YPOSNEW;
						Xpos = XPOSNEW;

					}//Monsters Have been Found
				}//Monster List Screen Down
				
				//Shop Down
				if(ScreenType == 13){
					if(EventSaleTotal  != 0){
						if(Ypos == 120 && EventSaleTotal >= 7 && ShopPlacement >= EventSaleTotal - 7){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
							if(Ypos == 120 && EventSaleTotal >= 7 && ShopPlacement < EventSaleTotal - 7){
							ShopPlacement = ShopPlacement + 1;
							ItemS1 = NullSale;
							ItemS2 = NullSale;
							ItemS3 = NullSale;
							ItemS4 = NullSale;
							ItemS5 = NullSale;
							ItemS6 = NullSale;
							ItemS7 = NullSale;
							ItemS1Qty = ItemS2Qty;//amount? quantity?
							ItemS2Qty = ItemS3Qty;
							ItemS3Qty = ItemS4Qty;
							ItemS4Qty = ItemS5Qty;
							ItemS5Qty = ItemS6Qty;
							ItemS6Qty = ItemS7Qty;
							ItemS7Qty = 1;
							ShopList = Market.MarketList(EventSale);{
								ItemS1 = ShopList[0 + ShopPlacement];
								ItemS2 = ShopList[1 + ShopPlacement];
								ItemS3 = ShopList[2 + ShopPlacement];
								ItemS4 = ShopList[3 + ShopPlacement];
								ItemS5 = ShopList[4 + ShopPlacement];
								ItemS6 = ShopList[5 + ShopPlacement];
								ItemS7 = ShopList[6 + ShopPlacement];
							}
							CurrentItemS = ItemS7;
							Text1 = ItemS7.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 105 && EventSaleTotal > 6){
							Ypos = 120;
							Xpos = 30;
							CurrentItemS = ItemS7;
							Text1 = ItemS7.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 105 && EventSaleTotal == 6){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 90 && EventSaleTotal > 5){
							Ypos = 105;
							Xpos = 30;
							CurrentItemS = ItemS6;
							Text1 = ItemS6.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 90 && EventSaleTotal == 5){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 75 && EventSaleTotal > 4){
							Ypos = 90;
							Xpos = 30;
							CurrentItemS = ItemS5;
							Text1 = ItemS5.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 75 && EventSaleTotal == 4){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 60 && EventSaleTotal > 3){
							Ypos = 75;
							Xpos = 30;
							CurrentItemS = ItemS4;
							Text1 = ItemS4.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 60 && EventSaleTotal == 3){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 45 && EventSaleTotal > 2){
							Ypos = 60;
							Xpos = 30;
							CurrentItemS = ItemS3;
							Text1 = ItemS3.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 45 && EventSaleTotal == 2){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
						if(Ypos == 30 && EventSaleTotal > 1){
							Ypos = 45;
							Xpos = 30;
							CurrentItemS = ItemS2;
							Text1 = ItemS2.getItemDisc();
							Text2 = "";
						}
						if(Ypos == 30 && EventSaleTotal == 1){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
						}
					}
				}//Shop Screen Down End
				
				//WeaponSmith Down
				if(ScreenType == 10){
					if(Weaponsmith.WeaponTotal(WeaponRecipe)  != 0){
						if(Ypos == 120 && Weaponsmith.WeaponTotal(WeaponRecipe) >= 7 && WeaponPlacement >= Weaponsmith.WeaponTotal(WeaponRecipe) - 7){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
							if(Ypos == 120 && Weaponsmith.WeaponTotal(WeaponRecipe) >= 7 && WeaponPlacement < Weaponsmith.WeaponTotal(WeaponRecipe) - 7){
								WeaponPlacement = WeaponPlacement + 1;
							Weapon1 = NullWeapon;
							Weapon2 = NullWeapon;
							Weapon3 = NullWeapon;
							Weapon4 = NullWeapon;
							Weapon5 = NullWeapon;
							Weapon6 = NullWeapon;
							Weapon7 = NullWeapon;
							WList = Weaponsmith.WeaponList(WeaponRecipe, WeaponMade);{
								Weapon1 = WList[0 + WeaponPlacement];
								Weapon2 = WList[1 + WeaponPlacement];
								Weapon3 = WList[2 + WeaponPlacement];
								Weapon4 = WList[3 + WeaponPlacement];
								Weapon5 = WList[4 + WeaponPlacement];
								Weapon6 = WList[5 + WeaponPlacement];
								Weapon7 = WList[6 + WeaponPlacement];
							}
							Text1 = Weapon7.getItemDisc();
							Text2 = "";
							Price = Weapon7.getPrice();
							WeaponSelected = Weapon7;
						}
						if(Ypos == 105 && Weaponsmith.WeaponTotal(WeaponRecipe) > 6){
							Ypos = 120;
							Xpos = 30;
							Text1 = Weapon7.getItemDisc();
							Text2 = "";
							Price = Weapon7.getPrice();
							WeaponSelected = Weapon7;
						}
						if(Ypos == 105 && Weaponsmith.WeaponTotal(WeaponRecipe) == 6){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 90 && Weaponsmith.WeaponTotal(WeaponRecipe) > 5){
							Ypos = 105;
							Xpos = 30;
							Text1 = Weapon6.getItemDisc();
							Text2 = "";
							Price = Weapon6.getPrice();
							WeaponSelected = Weapon6;
						}
						if(Ypos == 90 && Weaponsmith.WeaponTotal(WeaponRecipe) == 5){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 75 && Weaponsmith.WeaponTotal(WeaponRecipe) > 4){
							Ypos = 90;
							Xpos = 30;
							Text1 = Weapon5.getItemDisc();
							Text2 = "";
							Price = Weapon5.getPrice();
							WeaponSelected = Weapon5;
						}
						if(Ypos == 75 && Weaponsmith.WeaponTotal(WeaponRecipe) == 4){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 60 && Weaponsmith.WeaponTotal(WeaponRecipe) > 3){
							Ypos = 75;
							Xpos = 30;
							Text1 = Weapon4.getItemDisc();
							Text2 = "";
							Price = Weapon4.getPrice();
							WeaponSelected = Weapon4;
						}
						if(Ypos == 60 && Weaponsmith.WeaponTotal(WeaponRecipe) == 3){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 45 && Weaponsmith.WeaponTotal(WeaponRecipe) > 2){
							Ypos = 60;
							Xpos = 30;
							Text1 = Weapon3.getItemDisc();
							Text2 = "";
							Price = Weapon3.getPrice();
							WeaponSelected = Weapon3;
						}
						if(Ypos == 45 && Weaponsmith.WeaponTotal(WeaponRecipe) == 2){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 30 && Weaponsmith.WeaponTotal(WeaponRecipe) > 1){
							Ypos = 45;
							Xpos = 30;
							Text1 = Weapon2.getItemDisc();
							Text2 = "";
							Price = Weapon2.getPrice();
							WeaponSelected = Weapon2;
						}
						if(Ypos == 30 && Weaponsmith.WeaponTotal(WeaponRecipe) == 1){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(WeaponSelected.getMaterialNo1() == 0){//
							Amount1 = 0;
						}
						if(WeaponSelected.getMaterialNo1() != 0){
							Amount1 = ItemAmount1[WeaponSelected.getMaterialNo1() - 1];
						}
						if(WeaponSelected.getMaterialNo2() == 0){
							Amount2 = 0;
						}
						if(WeaponSelected.getMaterialNo2() != 0){
							Amount2 = ItemAmount1[WeaponSelected.getMaterialNo2() - 1];
						}//
					}
				}//Weaponsmith Down End
				
				//ArmorSmith Down
				if(ScreenType == 16){
					if(Armorsmith.ArmorTotal(ArmorRecipe)  != 0){
						if(Ypos == 120 && Armorsmith.ArmorTotal(ArmorRecipe) >= 7 && ArmorPlacement >= Armorsmith.ArmorTotal(ArmorRecipe) - 7){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 120 && Armorsmith.ArmorTotal(ArmorRecipe) >= 7 && ArmorPlacement < Armorsmith.ArmorTotal(ArmorRecipe) - 7){
							ArmorPlacement = ArmorPlacement + 1;
							Armor1 = NullArmor;
							Armor2 = NullArmor;
							Armor3 = NullArmor;
							Armor4 = NullArmor;
							Armor5 = NullArmor;
							Armor6 = NullArmor;
							Armor7 = NullArmor;
							AList = Armorsmith.ArmorList(ArmorRecipe, ArmorMade);{
								Armor1 = AList[0 + ArmorPlacement];
								Armor2 = AList[1 + ArmorPlacement];
								Armor3 = AList[2 + ArmorPlacement];
								Armor4 = AList[3 + ArmorPlacement];
								Armor5 = AList[4 + ArmorPlacement];
								Armor6 = AList[5 + ArmorPlacement];
								Armor7 = AList[6 + ArmorPlacement];
							}
							Text1 = Armor7.getItemDisc();
							Text2 = "";
							Price = Armor7.getPrice();
							ArmorSelected = Armor7;
						}
						if(Ypos == 105 && Armorsmith.ArmorTotal(ArmorRecipe) > 6){
							Ypos = 120;
							Xpos = 30;
							Text1 = Armor7.getItemDisc();
							Text2 = "";
							Price = Armor7.getPrice();
							ArmorSelected = Armor7;
						}
						if(Ypos == 105 && Armorsmith.ArmorTotal(ArmorRecipe) == 6){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 90 && Armorsmith.ArmorTotal(ArmorRecipe) > 5){
							Ypos = 105;
							Xpos = 30;
							Text1 = Armor6.getItemDisc();
							Text2 = "";
							Price = Armor6.getPrice();
							ArmorSelected = Armor6;
						}
						if(Ypos == 90 && Armorsmith.ArmorTotal(ArmorRecipe) == 5){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 75 && Armorsmith.ArmorTotal(ArmorRecipe) > 4){
							Ypos = 90;
							Xpos = 30;
							Text1 = Armor5.getItemDisc();
							Text2 = "";
							Price = Armor5.getPrice();
							ArmorSelected = Armor5;
						}
						if(Ypos == 75 && Armorsmith.ArmorTotal(ArmorRecipe) == 4){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 60 && Armorsmith.ArmorTotal(ArmorRecipe) > 3){
							Ypos = 75;
							Xpos = 30;
							Text1 = Armor4.getItemDisc();
							Text2 = "";
							Price = Armor4.getPrice();
							ArmorSelected = Armor4;
						}
						if(Ypos == 60 && Armorsmith.ArmorTotal(ArmorRecipe) == 3){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 45 && Armorsmith.ArmorTotal(ArmorRecipe) > 2){
							Ypos = 60;
							Xpos = 30;
							Text1 = Armor3.getItemDisc();
							Text2 = "";
							Price = Armor3.getPrice();
							ArmorSelected = Armor3;
						}
						if(Ypos == 45 && Armorsmith.ArmorTotal(ArmorRecipe) == 2){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(Ypos == 30 && Armorsmith.ArmorTotal(ArmorRecipe) > 1){
							Ypos = 45;
							Xpos = 30;
							Text1 = Armor2.getItemDisc();
							Text2 = "";
							Price = Armor2.getPrice();
							ArmorSelected = Armor2;
						}
						if(Ypos == 30 && Armorsmith.ArmorTotal(ArmorRecipe) == 1){
							Ypos = 190;
							Xpos = 140;
							Text1 = "";
							Text2 = "";
							Price = 0;
						}
						if(ArmorSelected.getMaterialNo1() == 0){
							Amount1 = 0;
						}
						if(ArmorSelected.getMaterialNo1() != 0){
							Amount1 = ItemAmount1[ArmorSelected.getMaterialNo1() - 1];
						}
						if(ArmorSelected.getMaterialNo2() == 0){
							Amount2 = 0;
						}
						if(ArmorSelected.getMaterialNo2() != 0){
							Amount2 = ItemAmount1[ArmorSelected.getMaterialNo2() - 1];
						}
					}
				}//Armorsmith Down End
				
				//Tavern Down
				if(ScreenType == 17){
					
				}//Tavern Down End
				
				}//Enter Okay Check thingy???
			Keyhandler.DownPressed = false;
		}//Down Key Pressed End
		
		if(Keyhandler.LeftPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedLeft();
			//Password Screen Left
			if(ScreenType == 0){
				
				//TODO location 30, 30
				if(Ypos == 190 && Xpos == 55){
					Xpos = 7;
				}
				if(Ypos == 190 && Xpos == 130){
					Xpos = 55;
				}
			}//Password Screen Left End
			
			//if(Turn % 2 == 0){
			if(EnterOK == 0){ 
			if(ExpToggleOK == 1 && ExpToggle == 0){
				ExpToggleOK = 0;
				ExpToggle = 1;
			}
			if(ExpToggleOK == 1 && ExpToggle == 1){
				ExpToggleOK = 0;
				ExpToggle = 0;
			}
			ExpToggleOK = 1;
			//}
			
			//Battle Screen Left
			if(ScreenType == 2 && TargetM > 0 && MTurn == 0){//&& (CurrentM + 1) < Battle.Monsters.length
				TargetM = TargetM -1;
				CurrentM  = TargetM;
				DisplayMN = CurrentM;
				DisplayM = BattleM.MonsterD[DisplayMN];
				DisplayM.MHp1 = MHP1[CurrentM];
				DisplayM.MHp2 = MHP2[CurrentM];
				DisplayM.MHp3 = MHP3[CurrentM];
				DisplayM.MHp4 = MHP4[CurrentM];
				MNo = BattleM.MonsterD[TargetM].MonsterID;
				SetM(BattleM.MonsterD[CurrentM]);//CurrentMonster
				//MName
			}
			
			//NoteScreen Left
			if(ScreenType == 5 && NotesFound != 0){
				int YPOSNEW = 0;
				int XPOSNEW = 0;
				YPOSNEW = Movement.CurserMoveLeft(Xpos, Ypos, ScreenType, NotesFound, NotePage)[0];// Once again I am reminded of the Page 0. 
				XPOSNEW = Movement.CurserMoveLeft(Xpos, Ypos, ScreenType, NotesFound, NotePage)[1];// I wonder what would be on it... Would it even appear in this game?
				Ypos = YPOSNEW;
				Xpos = XPOSNEW;

			}//NotesScreen Left End
			
			//MoveScreen Left
			if(ScreenType == 7){
				if(Xpos == 140 && AreasFound !=0){
					Ypos = 30;
					Xpos = 30;
				}

			}//MoveScreen Left End
			
			//Inventor Screen Left
			if(ScreenType == 14){
				
			}
			
			//Elder Screen Left
			if(ScreenType == 11){
				
			}
			
			//Topics Screen Left
			if(ScreenType == 9){
				int YPOSNEW = 0;
				int XPOSNEW = 0;
				YPOSNEW = Movement.CurserMoveLeft(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[0];// When you travel off the edge of the map, sometimes you just find nothing.
				XPOSNEW = Movement.CurserMoveLeft(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[1];// Sometimes then, nothing can be boring. Only sometimes...
				Ypos = YPOSNEW;
				Xpos = XPOSNEW;

			}//Topics Left End
			
			//Monster List Left
			if(ScreenType == 12 && MonstersFound != 0){
				int YPOSNEW = 0;
				int XPOSNEW = 0;
				YPOSNEW = Movement.CurserMoveLeft(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[0];// If at least one person has enjoyed my game, It will have been a success!
				XPOSNEW = Movement.CurserMoveLeft(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[1];// To think, a Minigame idea could become this! It may not be impressive, but I enjoyed working on it!
				Ypos = YPOSNEW;
				Xpos = XPOSNEW;

			}//MonsterList Left End
			
			//Shop Left
			if(ScreenType == 13){
				if(Ypos == 30 && ItemS1Qty > 1){
					ItemS1Qty = ItemS1Qty - 1;//amount? quantity?
					Text1 = ItemS1.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 45 && ItemS2Qty > 1){
					ItemS2Qty = ItemS2Qty - 1;
					Text1 = ItemS2.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 60 && ItemS3Qty > 1){
					ItemS3Qty = ItemS3Qty - 1;
					Text1 = ItemS3.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 75 && ItemS4Qty > 1){
					ItemS4Qty = ItemS4Qty - 1;
					Text1 = ItemS4.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 90 && ItemS5Qty > 1){
					ItemS5Qty = ItemS5Qty - 1;
					Text1 = ItemS5.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 105 && ItemS6Qty > 1){
					ItemS6Qty = ItemS6Qty - 1;
					Text1 = ItemS6.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 120 && ItemS7Qty > 1){
					ItemS7Qty = ItemS7Qty - 1;
					Text1 = ItemS7.getItemDisc();
					Text2 = "";
				}
				if(Ypos == 190 && EventSaleTotal > 6){
					Ypos = 120;
					Xpos = 30;
					CurrentItemS = ItemS7;
					Text1 = ItemS7.getItemDisc();
					Text2 = "";
				}
			}//Shop Left End
			
			//Cook Left
			if(ScreenType == 4){
				if(Ypos == 95 && Xpos == 75 && ItemsFound >= 1){
					Ypos = 30;
					Xpos = 5;
					CurrentItem = Item1;
					Text1 = Item1.ItemDisc;
				}
				if(Ypos == 95 && Xpos == 125){
					Ypos = 95;
					Xpos = 75;
					CurrentItem = new Items(CookItem3.CookedItem, CookItem3.ItemName, CookItem3.ItemName, 0, 0, 0, -5, CookItem3.ItemDescription, 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0});
					Text1 = CookItem3.ItemDescription;//???
				}
				//g.drawString("Cook", 80, 100);
				//g.drawString("Reselect", 130, 100);
			}//Cook Left End
			
			//WeaponSmith Left
			if(ScreenType == 10){
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 1){
					Ypos = 30;
					Xpos = 30;
					Text1 = Weapon1.getItemDisc();
					Text2 = "";
					Price = Weapon1.getPrice();
					WeaponSelected = Weapon1;
				}
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 2){
					Ypos = 45;
					Xpos = 30;
					Text1 = Weapon2.getItemDisc();
					Text2 = "";
					Price = Weapon2.getPrice();
					WeaponSelected = Weapon2;
				}
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 3){
					Ypos = 60;
					Xpos = 30;
					Text1 = Weapon3.getItemDisc();
					Text2 = "";
					Price = Weapon3.getPrice();
					WeaponSelected = Weapon3;
				}
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 4){
					Ypos = 75;
					Xpos = 30;
					Text1 = Weapon4.getItemDisc();
					Text2 = "";
					Price = Weapon4.getPrice();
					WeaponSelected = Weapon4;
				}
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 5){
					Ypos = 75;
					Xpos = 30;
					Text1 = Weapon5.getItemDisc();
					Text2 = "";
					Price = Weapon5.getPrice();
					WeaponSelected = Weapon5;
				}
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) == 6){
					Ypos = 105;
					Xpos = 30;
					Text1 = Weapon6.getItemDisc();
					Text2 = "";
					Price = Weapon6.getPrice();
					WeaponSelected = Weapon6;
				}
				if(Ypos == 190 && Weaponsmith.WeaponTotal(WeaponRecipe) >= 7){
					Ypos = 120;
					Xpos = 30;
					Text1 = Weapon7.getItemDisc();
					Text2 = "";
					Price = Weapon7.getPrice();
					WeaponSelected = Weapon7;
				}
				if(WeaponSelected.getMaterialNo1() == 0){//
					Amount1 = 0;
				}
				if(WeaponSelected.getMaterialNo1() != 0){
					Amount1 = ItemAmount1[WeaponSelected.getMaterialNo1() - 1];
				}
				if(WeaponSelected.getMaterialNo2() == 0){
					Amount2 = 0;
				}
				if(WeaponSelected.getMaterialNo2() != 0){
					Amount2 = ItemAmount1[WeaponSelected.getMaterialNo2() - 1];
				}//
//				if(Ypos == 190 && EventSaleTotal > 6){ 30, 45 etc?
//					Ypos = 120;
//					Xpos = 30;
//					Text1 = ItemS7.getItemDisc();
//					Text2 = "";
//				}
			}//Weaponsmith Left End
			
			//ArmorSmith Left
			if(ScreenType == 16){
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 1){
					Ypos = 30;
					Xpos = 30;
					Text1 = Armor1.getItemDisc();
					Text2 = "";
					Price = Armor1.getPrice();
					ArmorSelected = Armor1;
				}
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 2){
					Ypos = 45;
					Xpos = 30;
					Text1 = Armor2.getItemDisc();
					Text2 = "";
					Price = Armor2.getPrice();
					ArmorSelected = Armor2;
				}
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 3){
					Ypos = 60;
					Xpos = 30;
					Text1 = Armor3.getItemDisc();
					Text2 = "";
					Price = Armor3.getPrice();
					ArmorSelected = Armor3;
				}
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 4){
					Ypos = 75;
					Xpos = 30;
					Text1 = Armor4.getItemDisc();
					Text2 = "";
					Price = Armor4.getPrice();
					ArmorSelected = Armor4;
				}
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 5){
					Ypos = 75;
					Xpos = 30;
					Text1 = Armor5.getItemDisc();
					Text2 = "";
					Price = Armor5.getPrice();
					ArmorSelected = Armor5;
				}
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) == 6){
					Ypos = 105;
					Xpos = 30;
					Text1 = Armor6.getItemDisc();
					Text2 = "";
					Price = Armor6.getPrice();
					ArmorSelected = Armor6;
				}
				if(Ypos == 190 && Armorsmith.ArmorTotal(ArmorRecipe) >= 7){
					Ypos = 120;
					Xpos = 30;
					Text1 = Armor7.getItemDisc();
					Text2 = "";
					Price = Armor7.getPrice();
					ArmorSelected = Armor7;
				}
				if(ArmorSelected.getMaterialNo1() == 0){
					Amount1 = 0;
				}
				if(ArmorSelected.getMaterialNo1() != 0){
					Amount1 = ItemAmount1[ArmorSelected.getMaterialNo1() - 1];
				}
				if(ArmorSelected.getMaterialNo2() == 0){
					Amount2 = 0;
				}
				if(ArmorSelected.getMaterialNo2() != 0){
					Amount2 = ItemAmount1[ArmorSelected.getMaterialNo2() - 1];
				}
//				if(Ypos == 190 && EventSaleTotal > 6){ 30, 45 etc?
//					Ypos = 120;
//					Xpos = 30;
//					Text1 = ItemS7.getItemDisc();
//					Text2 = "";
//				}
			}//Armorsmith Left End
			
			//Tavern Left
			if(ScreenType == 17){
				if(Xpos == 140){
					Ypos = 190;
					Xpos = 70;
				}
			}//Tavern Left End
			
			//ItemScreen Left
			if(ScreenType == 3){
				if(Xpos == 140 && ItemsFound !=0){
					Ypos = 30;
					Xpos = 30;
				}
			}//ItemScreen Left End
			
			}
			
			Keyhandler.LeftPressed = false;
		}//Left Key Pressed End
		
		if(Keyhandler.RightPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedRight();
			
			//Password Screen Right
			if(ScreenType == 0){
				if(Ypos == 190 && Xpos == 55){
					Xpos = 130;
				}
				if(Ypos == 190 && Xpos == 7){
					Xpos = 55;
				}
			}//Password Screen Right End
			
			if(EnterOK == 0){ //if(Turn % 2 != 0){
				if(ExpToggleOK == 1 && ExpToggle == 0){
					ExpToggleOK = 0;
					ExpToggle = 1;
					
				}
				if(ExpToggleOK == 1 && ExpToggle == 1){
					ExpToggleOK = 0;
					ExpToggle = 0;
				}
				ExpToggleOK = 1;
				
				//Battle Screen Right
				if(ScreenType == 2 && (TargetM + 1) < BattleM.MonsterD.length && MTurn == 0){//CurrentM - TargetM
					TargetM = TargetM + 1;
					CurrentM = TargetM;
					DisplayMN = CurrentM;
					DisplayM = BattleM.MonsterD[DisplayMN];
					DisplayM.MHp1 = MHP1[CurrentM];
					DisplayM.MHp2 = MHP2[CurrentM];
					DisplayM.MHp3 = MHP3[CurrentM];
					DisplayM.MHp4 = MHP4[CurrentM];
					MNo = BattleM.MonsterD[TargetM].MonsterID;
					SetM(BattleM.MonsterD[CurrentM]);//CurrentMonster
					//MName
					if(EventS == 1){
						EventS = 0;
					}
				}
				
				//NoteScreen Right
				//Only if Notes on page more than 5 or next/back
				if(ScreenType == 5 && NotesFound != 0){
					int YMovePos = 0;
					int XMovePos = 0;
					YMovePos = Movement.CurserMoveRight(Xpos, Ypos, ScreenType, NotesFound, NotePage)[0];//Odd Placement like 0, 0 or 0 , 30
					XMovePos = Movement.CurserMoveRight(Xpos, Ypos, ScreenType, NotesFound, NotePage)[1];
					Ypos = YMovePos;
					Xpos = XMovePos;
				}//NoteScreen Right End
				
				//MoveScreen Right
				if(ScreenType == 7){
					if(Xpos == 30){
						Ypos = 190;
						Xpos = 140;
					}
				}
				
				//Inventor Screen Right
				if(ScreenType == 14){
					if(Xpos == 30 || Xpos == 15){
						Ypos = 190;
						Xpos = 140;
					}
				}
				
				//Elder Screen Right
				if(ScreenType == 11){
					
				}
				
				//Topics Screen Right
				if(ScreenType == 9){
					int YMovePos = 0;
					int XMovePos = 0;
					YMovePos = Movement.CurserMoveRight(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[0];//Odd Placement like 0, 0 or 0 , 30
					XMovePos = Movement.CurserMoveRight(Xpos, Ypos, ScreenType, DiscussionsFound, TalkPage)[1];
					Ypos = YMovePos;
					Xpos = XMovePos;
				}//Topics Right End
				
				//Monster List Right
				if(ScreenType == 12 && MonstersFound != 0){
					int YMovePos = 0;
					int XMovePos = 0;
					YMovePos = Movement.CurserMoveRight(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[0];//Odd Placement like 0, 0 or 0 , 30
					XMovePos = Movement.CurserMoveRight(Xpos, Ypos, ScreenType, MonstersFound, MonsterPage)[1];
					Ypos = YMovePos;
					Xpos = XMovePos;
				}//Monster List Right End
				
				//Shop Right
				if(ScreenType == 13){
					if(Ypos == 30){
						if(ItemS1.ItemType !=2 && ItemS1.ItemType !=3 && ItemS1.ItemType !=4){
							ItemS1Qty = ItemS1Qty + 1;//amount? quantity?
						}
						Text1 = ItemS1.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 45){
						if(ItemS2.ItemType !=2 && ItemS2.ItemType !=3 && ItemS2.ItemType !=4){
							ItemS2Qty = ItemS2Qty + 1;
						}
						Text1 = ItemS2.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 60){
						if(ItemS3.ItemType !=2 && ItemS3.ItemType !=3 && ItemS3.ItemType !=4){
							ItemS3Qty = ItemS3Qty + 1;
						}
						Text1 = ItemS3.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 75){
						if(ItemS4.ItemType !=2 && ItemS4.ItemType !=3 && ItemS4.ItemType !=4){
							ItemS4Qty = ItemS4Qty + 1;
						}
						Text1 = ItemS4.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 90){
						if(ItemS5.ItemType !=2 && ItemS5.ItemType !=3 && ItemS5.ItemType !=4){
							ItemS5Qty = ItemS5Qty + 1;
						}
						Text1 = ItemS5.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 105){
						if(ItemS6.ItemType !=2 && ItemS6.ItemType !=3 && ItemS6.ItemType !=4){
							ItemS6Qty = ItemS6Qty + 1;
						}
						Text1 = ItemS6.getItemDisc();
						Text2 = "";
					}
					if(Ypos == 120){
						if(ItemS7.ItemType !=2 && ItemS7.ItemType !=3 && ItemS7.ItemType !=4){
							ItemS7Qty = ItemS7Qty + 1;
						}
						Text1 = ItemS7.getItemDisc();
						Text2 = "";
					}
//					if(Ypos == 190 && EventSaleTotal != 0){
//						Ypos = 120;
//						Xpos = 30;
//						CurrentItemS = ItemS7;
//						Text1 = ItemS7.getItemDisc();
//						Text2 = "";
//					}
				}//Shop Right End
				
				//Cook Right
				if(ScreenType == 4){
					if(Ypos == 95 && Xpos == 75){
						Ypos = 95;
						Xpos = 125;
					}
					if(Ypos == 30 || Ypos == 45 || Ypos == 60 || Ypos == 75 || Ypos == 90 || Ypos == 105 || Ypos == 120){
						Ypos = 95;
						Xpos = 75;
						CurrentItem = new Items(CookItem3.CookedItem, CookItem3.ItemName, CookItem3.ItemName, 0, 0, 0, 0, CookItem3.ItemDescription, 0, 0, 0, new double[]{/*Normal*/0.0, /*Slime*/0.0, /*Ghost*/0.0, /*Golem*/0.0, /*Armor*/0.0, /*Other*/0.0, /*Glitch*/0.0, /*Fire*/0.0, /*Water*/0.0, /*Wind*/0.0, /*Earth*/0.0, /*Electric*/0.0, /*Ice*/0.0, /*Light*/0.0, /*Dark*/0.0, /*Glitch*/0.0, /*Null*/0.0, /*Mystery*/0.0, /*Corrupt*/0.0, /*Admin*/0.0, /*All*/0.0}, /*Speed*/0, /*Luck*/0, /*Dodge*/0, /*Critical*/0, /*Cure*/0, /*NegStatus*/0, new int[]{/*Poison*/0, /*Curse*/0, /*Sticky*/0, /*???*/0, /*All*/0});
						Text1 = CookItem3.ItemDescription;
						Text2 = "";
					}
					if(Ypos == 190){
						
					}
					//g.drawString("Cook", 80, 100); 95
					//g.drawString("Reselect", 130, 100);
				}//Cook Right End
				
				//WeaponSmith Right
				if(ScreenType == 10){//Xpos = 30;//140
					if(Ypos == 30 || Ypos == 45 || Ypos == 60 || Ypos == 75 || Ypos == 90 || Ypos == 105 || Ypos == 120){
						Ypos = 190;
						Xpos = 140;
						Price = 0;
					}
				}//Weaponsmith Right End
				
				//ArmorSmith Right
				if(ScreenType == 16){
					if(Ypos == 30 || Ypos == 45 || Ypos == 60 || Ypos == 75 || Ypos == 90 || Ypos == 105 || Ypos == 120){
						Ypos = 190;
						Xpos = 140;
						Price = 0;
					}
				}//Aromrsmith Right End
				
				//Tavern Right
				if(ScreenType == 17){
					if(Xpos == 70){
						Ypos = 190;
						Xpos = 140;
					}
				}//Tavern Right End
				
				//ItemScreen Right
				if(ScreenType == 3){
					if(Xpos == 30 || Xpos == 15){
						Ypos = 190;
						Xpos = 140;
					}
				}//ItemScreen Right end.
				
				}
			
			Keyhandler.RightPressed = false;
		}
		if(Keyhandler.EnterPressed) {
			//MainClass.PlayerPressedEnter();
			
			//Random Numbers Test
			Random generator = new Random();
			int Random = generator.nextInt(100);
			System.out.println("Enter Random: " + Random);
			MoneyToggle = 1;
			ItemToggle3 = 1;
			if(ScreenType == 3){
				ItemToggle = 1;//EnterToggle1?
			}
			if(ScreenType == 5 || ScreenType == 6){
				NoteToggle = 1;
			}
			if(ScreenType == 7){
				MoveToggle = 1;
			}
			if(ScreenType == 4){
				CookToggle = 1;
			}
			if(ScreenType == 14){
				InventorToggle = 1;
			}
			if(ScreenType == 11){
				ElderToggle2 = 1;
			}
			if(ScreenType == 9){
				TopicToggle = 1;
			}
			if(ScreenType == 10){
				WeaponToggle = 1;
			}
			if(ScreenType == 16){
				ArmorToggle = 1;
			}
			if(ScreenType == 17){
				TavernToggle = 1;
			}
			if(ScreenType == 13){
				ShopToggle = 1;
			}
			if(ScreenType == 1){
				EnterToggle = 1;
			}
			if(CutsceneMode != 0){//TODO Is this really necessary?
				CutsceneToggle = 1;
			}
			
			if(ScreenType == 0){
				PasswordToggle = 1;
			}
			
			if(EventS == 1){//BattleStart
				EnterOK = 0;
				//MNo?
				int iT = 0;
				while(iT < BattleM.MonsterD.length){
					Monster1Found[BattleM.MonsterD[iT].MonsterID] = 1;
					iT = iT + 1;
				}
				UpdateMonster();
				CurrentM = 0;
				SetM(BattleM.MonsterD[CurrentM]);//CurrentMonster
				MHP1 = BattleData.SetMHp(BattleM.MonsterD, 1);
				MHP2 = BattleData.SetMHp(BattleM.MonsterD, 2);
				MHP3 = BattleData.SetMHp(BattleM.MonsterD, 3);
				MHP4 = BattleData.SetMHp(BattleM.MonsterD, 4);
				MItemDrop1 = BattleM.Drop1;
				MItemPercent1 = BattleM.Drop1Percent;
				ExpGained = BattleM.Exp;
				MoneyDrop = BattleM.MoneyDrop;
				MoneyChance = BattleM.MoneyChance;
				AreaScreenMode = ScreenMode;
				ScreenMode = BattleM.BattleScreenMode;
				DisplayMN = 0;
				DisplayM = BattleM.MonsterD[0];
				DisplayM.MHp1 = MHP1[CurrentM];
				DisplayM.MHp2 = MHP2[CurrentM];
				DisplayM.MHp3 = MHP3[CurrentM];
				DisplayM.MHp4 = MHP4[CurrentM];
				if(Gamemode == 0){
					Text1 = BattleM.RandomText[0];
					Text2 = BattleM.RandomText[1];
				}
				CurrentM = 0;
				TargetM = 0;
				Turn = 0;
				MTurn = 0;
				BattleToggle = 1;
				EventS = 0;
			}//Battle Start End
			
			if(EventS == 5){//BattleEnd
				EnterOK = 0;
				EnemyEscapedToggle = 0;
				Turn = 0;
				BattleToggle = 0;
				ScreenMode = AreaScreenMode;
				if(BattleLocation == 1){
					ScreenType = 1;
					Text1 = "";
					Text2 = "";
				}
				if(BattleLocation == 14){//Inventor Screen
					ScreenType = 14;
					Xpos = 15;
					Ypos = 30;
					Text1 = "";
					Text2 = "";
				}
				if(BattleM.EndEvent != 0){
					CurrentCutscene = TalkTextCutscene.CutsceneList(BattleM.EndEvent);
					LoadCutscene(CurrentCutscene);
				}
				EventS = 0;
			}//Battle End End
			
			if(EventS == 7){//Level Up!
//				EnterOK = 0;
				Turn = 0;
				int[] NewLevelData = LevelUpData.LevelData(Exp, Level, Gamemode);
				Next = NewLevelData[0];
				Level = NewLevelData[1];
				int[] NewStats = LevelUpData.LoadStats(Level, Gamemode);
				CHP1Max = NewStats[1];
				CHP1Max = NewStats[2];
				CHP1Max = NewStats[3];
				CHP1Max = NewStats[4];
				
				CAtk1 = NewStats[5];
				CAtk2 = NewStats[6];
				CAtk3 = NewStats[7];
				CAtk4 = NewStats[8];
				
				
				CDef1 = NewStats[9];
				CDef2 = NewStats[10];
				CDef3 = NewStats[11];
				CDef4 = NewStats[12];
				
				Speed = NewStats[13] + CurrentHood.Speed + CurrentHelmet.Speed + CurrentRobe.Speed + CurrentArmor.Speed + CurrentShirt.Speed + CurrentGuantlets.Speed + CurrentGloves.Speed + CurrentPants.Speed + CurrentSocks.Speed + CurrentBoots.Speed;
				if(Status == 2 || Status == 5){
					Luck = NewStats[14]+ CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck + CursedLuck;
				}
				else
					Luck = NewStats[14]+ CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
				
				//Levels? DodgeChance = CurrentHood.Dodge + CurrentHelmet.Dodge + CurrentRobe.Dodge + CurrentArmor.Dodge + CurrentShirt.Dodge + CurrentGuantlets.Dodge + CurrentGloves.Dodge + CurrentPants.Dodge + CurrentSocks.Dodge + CurrentBoots.Dodge;
				//Levels? CriticalChance = CurrentHood.Critical + CurrentHelmet.Critical + CurrentRobe.Critical + CurrentArmor.Critical + CurrentShirt.Critical + CurrentGuantlets.Critical + CurrentGloves.Critical + CurrentPants.Critical + CurrentSocks.Critical + CurrentBoots.Critical;
				
				Text1 = "Level Up!: " + Level;
				Text2 = "";
				EventS = 5;//Battle End
			}//Level Up!
			
			if(EventS == 4){//ExpGained
				//EnterOK = 0;
				Turn = 0;
				if(MoneyToggle == 1){
					Exp = Exp + ExpGained;
				}
				Text1 = "Gained " + ExpGained + " Exp.";
				Text2 = "";

				if(Level < LevelMAX){
					if(LevelUpData.LevelData(Exp, Level, Gamemode)[1] != Level && Next <= Exp){//Exp is high enough for a level up, and can level up
						EventS = 7;//Level Up!
						//		int Next = 5; int Level = 1;
					}
					else{
						EventS = 5;//Battle End
					}
				}
				else{
					EventS = 5;//Battle End
				}
				
				ItemToggle2 = 0;
			}//ExpGained End

			if(EventS == 3){//Money found
				//EnterOK = 0;
				Turn = 0;
				if(MoneyToggle == 1){
					Money = Money + MoneyDrop;
				}
				Text1 = "Got " + MoneyDrop + " Gold";
				Text2 = "";
				EventS = 4;
				ItemToggle2 = 0;
			}//Money Found End
			
			if(EventS == 2){//Item found
				//EnterOK = 0;
				Turn = 0;
				Item1Found[MItemDrop1 - 1] = 1;
				ItemAmount1[MItemDrop1 - 1] = ItemAmount1[MItemDrop1 - 1] + 1; //Glitch "Items.ItemNo(Item1Found, MItemDrop1)" Instead of just "MItemDrop1 - 1"
				int i1 = 0;
				int i2 = 0;
				while(i1 < Item1Found.length){
				if(Item1Found[i1] == 1){
					ItemAmount2[i2] = ItemAmount1[i1];
					i2 = i2 + 1;
				}
				i1 = i1 + 1;
				}
				ItemsFound = Items.ItemTotal(Item1Found);
				UpdateItem(ItemPlacement, ItemSortMode);
				
				if(ItemFoundToggle == 1){
					//ItemAmount1[MItemDrop1 - 1] = ItemAmount1[MItemDrop1 - 1] + 1;
					//ItemAmount2 = ItemAmount1;
					Text1 = "Obtained " + Items.ItemList(Item1Found, 0, Gamemode)[Items.ItemNo(Item1Found, MItemDrop1)].ItemName; //
					Text2 = "";
				}
				//Text1 = "Obtained " + "TestItem1";
				ItemFoundToggle = 0;
				//if(ItemToggle2 == 1){
				Random BattleRandom = new Random();
				int BRandom = BattleRandom.nextInt(100);
				if(BRandom <= MoneyChance){
					EventS = 3;
					EnterOK = 1;
//					if(MoneyToggle == 1){
//						Money = Money + MoneyDrop;
//					}
					MoneyToggle = 0;
					DefeatToggle = 0;
				}
				if(BRandom > MoneyChance){
					EventS = 4;
					EnterOK = 1;
					DefeatToggle = 0;
				}
				//}
				ItemToggle2 = 1;
			}//Item Found End
			
			if(EventS == 6){//TODO Cutscene mode ACTIVATE!
				//x
				//CutsceneMode
				//LoadCutscene();
				//Active Cutscene Mode, occures during normal gameplay
				//Normal Cutscene Mode: Advances with press of Enter
			}
			
			if((CutsceneMode == 0 || CutsceneMode == 5 || CutsceneMode == 6 || CutsceneMode == 7 || CutsceneMode == 8) && BattleEventMode == 0){//TalkTalkTalkMode is Off! ... It is off right?
			
				//Navigation Screen Enter
			if(ScreenType == 1 && EnterToggle == 1){
			//Navigation Screen: Examine
				
			if(Ypos == 70 && BattleToggle == 0 && CutsceneMode != 1){
				if(ExamineUnlocked == 1){
				//AreaItemP = CurrentArea.Drop1Percent;//10;
				//AreaBattleP = CurrentArea.BattleChance Total
				//AreaGoldP = CurrentArea.MoneyChance;//33;
				CurrentCutscene = NullCutscene;
				int AreaEventAction = 0;
				
				//Multi Type Found;
				int iEvent = 0;
				while(iEvent < CurrentArea.Events[0].length){
					if(iEvent < CurrentArea.Events[0].length){
				if(Random <= CurrentArea.Events[/*EventChance*/4][iEvent] && AreaEventAction == 0){
					if(CurrentArea.Events[/*EventType1*/0][iEvent] == 1){//One Time Event
						if(MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] == 0){
							MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] = 1;
							CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentArea.Events[/*EventData*/2][iEvent]);
							
							LoadCutscene(CurrentCutscene);
							
							iEvent = CurrentArea.Events[0].length + 15;
							AreaEventAction = 1;
						}
					}//Area 1 time event end
					else if(CurrentArea.Events[/*EventType1*/0][iEvent] == 2){//Multiple Chance to happen Event
						MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] += 1;
						CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentArea.Events[/*EventData*/2][iEvent]);
						
						LoadCutscene(CurrentCutscene);
						
						iEvent = CurrentArea.Events[0].length + 15;
						AreaEventAction = 1;
					}//Multiple Chance to happen Area Event End
					else if(CurrentArea.Events[/*EventType1*/0][iEvent] == 3 || CurrentArea.Events[/*EventType1*/0][iEvent] == 5){//One Time Key Event
						if(MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] == 0 && ItemAmount1[CurrentArea.Events[/*EventType2*/1][iEvent]] > 0){
							MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] = 1;
							CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentArea.Events[/*EventData*/2][iEvent]);
							
							LoadCutscene(CurrentCutscene);
							
							AreaEventAction = 1;
							if(CurrentArea.Events[/*EventType1*/0][iEvent] == 3){
								ItemAmount1[CurrentArea.Events[/*EventType2*/1][iEvent]] -= 1;
							}
							iEvent = CurrentArea.Events[0].length + 15;
						}
					}//One Time Key Area Event End
					else if(CurrentArea.Events[/*EventType1*/0][iEvent] == 4 || CurrentArea.Events[/*EventType1*/0][iEvent] == 6){//Multiple Time Key Event
						if(ItemAmount1[CurrentArea.Events[/*EventType2*/1][iEvent]] > 0){
							MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] = 1;
							CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentArea.Events[/*EventData*/2][iEvent]);
							
							LoadCutscene(CurrentCutscene);
							
							AreaEventAction = 1;
							if(CurrentArea.Events[/*EventType1*/0][iEvent] == 4){
								ItemAmount1[CurrentArea.Events[/*EventType2*/1][iEvent]] -= 1;
							}
							iEvent = CurrentArea.Events[0].length + 15;
						}
					}//Multiple Time Key Area Event End
					else if(CurrentArea.Events[/*EventType1*/0][iEvent] == 7){//Multiple Time Flag Event
						System.out.println("Multiple time area event is working " + MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]]);
						if(MainClass.SEventFlag[CurrentArea.Events[/*EventFlag*/3][iEvent]] == CurrentArea.Events[/*EventType2*/1][iEvent]){//Happens if Flag is set to certain thing
							CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentArea.Events[/*EventData*/2][iEvent]);
							
							LoadCutscene(CurrentCutscene);
							iEvent = CurrentArea.Events[0].length + 15;
							AreaEventAction = 1;
						}
					}//Multiple Time Flag Area Event End
				}//Area EventChance
					}
				iEvent += 1;
			}//While Loop End
				
				//Make sure it doesn't activate toggle~!;
				//Multi Type Found;
				if(AreaEventAction == 0){
				int iItems = 0;
				while(iItems < CurrentArea.Drop1.length){//Random <= AreaItemP && AreaItemP > 0 && AreaEventAction == 0
					Random = generator.nextInt(100);
					if(Random <= CurrentArea.Drop1Percent[iItems] && AreaEventAction == 0){
					if(ItemToggle3 == 1){
						Item1Found[CurrentArea.Drop1[iItems] - 1] = 1;
						ItemAmount1[CurrentArea.Drop1[iItems] - 1] = 
							ItemAmount1[CurrentArea.Drop1[iItems] - 1] + 1;
						int i1 = 0;
						int i2 = 0;
						while(i1 < Item1Found.length){
							if(Item1Found[i1] == 1){
								ItemAmount2[i2] = ItemAmount1[i1];
								i2 = i2 + 1;
							}
							i1 = i1 + 1;
						}	
						ItemsFound = Items.ItemTotal(Item1Found);
						UpdateItem(ItemPlacement, ItemSortMode);
					
					}
					Text1X = 30;//Text1X = 50;//Text1X = 80;
					Text1 = "Found " + ItemList[Items.ItemNo(Item1Found, CurrentArea.Drop1[iItems])].ItemName;
					Text2 = "";
					ItemToggle3 = 0;
					AreaEventAction = 1;
					}
					iItems += 1;
				}//While Items in area to be found End
				}
				//Multi Type Found???;
				//TODO BATTLE MHP and MHPMax?
				
				if(AreaEventAction == 0){
				int iArea = 0;
				while(iArea < CurrentArea.Battle.length){
					Random = generator.nextInt(100);
					 if(Random <= CurrentArea.BattleChance[iArea] && AreaEventAction == 0){//if(AreaItemP < Random && Random <= AreaItemP + AreaBattleP && AreaEventAction == 0){
						 Text1X = 30;//Text1X = 80;
						 Text1 = "Monster found";// or Battle Start?
						 Text2 = "";
						 BattleLocation = 1;
						Random = generator.nextInt(100);

						//TODO	int XModifier = 0;
						if((MainClass.XBattleMode != 0 && MainClass.XBattleMode != 4 && MainClass.XBattleMode != 8 && Random <= CurrentArea.XChance[0]) || MainClass.XBattleMode == 5 || MainClass.XBattleMode == 6 || MainClass.XBattleMode == 9){//XBattleMode == 1 &&
							BattleM = BattleData.GetBattleData(CurrentArea.XBattle[iArea]);
						}
						else{
							BattleM = BattleData.GetBattleData(CurrentArea.Battle[iArea]);
						}
						MNo = BattleM.MonsterD[0].MonsterID;
						DefeatToggle = 1;
						EnterOK = 1;
						EventS = 1;
						AreaEventAction = 1;
//						MHP1 = ???;
//						Turn = 0;
//						BattleToggle = 1;
					}
					 iArea += 1;
				}
				}
				
				if(AreaEventAction == 0){
				//Multi Type Found???;
				int IGold = 0;
				while(IGold < CurrentArea.MoneyDrop.length){//AreaItemP + AreaBattleP < Random && Random <= AreaItemP + AreaBattleP + AreaGoldP && AreaEventAction == 0
					Random = generator.nextInt(100);
					System.out.println("Gold Chance");
					if(Random <= CurrentArea.MoneyChance[IGold] && AreaEventAction == 0){
						Text1X = 30;//Text1X = 80;
						Text1 = "Found " + CurrentArea.MoneyDrop[IGold] + " gold";
						Text2 = "";
						if(MoneyToggle == 1){
							Money = Money + CurrentArea.MoneyDrop[IGold];
						}
						MoneyToggle = 0;
						IGold += 1;
						AreaEventAction = 1;
					}
				}
				}

				if(AreaEventAction == 0){
					Text1X = 30;//Text1X = 80;
					Text1 = "Nothing found";
					Text2 = "";
				}
				
				AreaEventAction = 0;
				
				}//Examine Unlocked
				else if(Gamemode == 6){
					Text1 = "... It's ???? what do ";
					Text2 = "you expect?";
				}
				
			}//Navigation Screen Examine End
			
			
			//Navigation Screen: Items
			if(Ypos == 85){
				if(MoveUnlocked == 1){
					ScreenType = 3;
					if(ItemsFound >= 1){
						Ypos = 30;
						Xpos = 30;
						Text1X = 30;
						Text2X = 30;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					else{
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
				}//Items Action Unlocked End
				else if(Gamemode == 6){
					Text1 = "... It's ???? what do ";
					Text2 = "you expect?";
				}
			}//Navigation Screen Items End
			
			//Navigation Screen: Notes
			if(Ypos == 100){
				if(NotesUnlocked == 1){
					ScreenType = 5;
					if(NotesFound >= 1){
						Ypos = 30;
						Xpos = 30;
					}
					if(NotesFound == 0){//?
						Ypos = 190;
						Xpos = 140;
					}
				}//Notes Action Unlocked
				else if(Gamemode == 6){
					Text1 = "... It's ???? what do ";
					Text2 = "you expect?";
				}
			}//Navigation Screen Notes End
			
			//Navigation Screen: Move
			if(Ypos == 115){
				if(MoveUnlocked == 1){
					ScreenType = 7;
					if(AreasFound != 0){
						Ypos = 30;
						Xpos = 30;
					}
					if(AreasFound == 0){
						Ypos = 190;
						Xpos = 140;
					}
				}//Move Action Unlocked
				else if(Gamemode == 6){
					Text1 = "... It's ???? what do ";
					Text2 = "you expect?";
				}
				//Text1 = "... It's ???? what did ";
				//Text2 = "you expect would happen?";
			}//Navigation Screen Move End
			
			}//Navigation Screen Enter End
			
			
			//Battle Screen Enter
			//Battle Screen: Attack
			else if(ScreenType == 2 && EnemyEscapedToggle != 1){//ItemTurns

				if(MTurn == 0){ // Checks to see if Turn even
					if(BombCounter == 0){//Normal No Bomb battle turn
						CDmg1 = 0;
						CDmg2 = 0;
						CDmg3 = 0;
						CDmg4 = 0;
				if(Ypos == 70){//Attack
					if(MHP4[CurrentM] != 0 || MHP3[CurrentM] != 0 || MHP2[CurrentM] !=0 || MHP1[CurrentM] !=0){
						int[] CDmg = new int[4];{
							CDmg[0] = 0;
							CDmg[1] = 0;
							CDmg[2] = 0;
							CDmg[3] = 0;
						}
						
						//Calculate Weapon Attack
						int CurrentCAtk1 = 0;
						int CurrentCAtk2 = 0;
						int CurrentCAtk3 = 0;
						int CurrentCAtk4 = 0;
						
						Random CriticalRandom = new Random();
						int CriticalR = CriticalRandom.nextInt(100);
						int CriticalM = 0;//Critical Mode
						
						if(Luck < 0){
							AntiLuck = Luck;
						}
						else
							AntiLuck = 0;
						
						//Was it a critical attack?
						if(CriticalR < CriticalChance + AntiLuck){
							CriticalM = 1;
						}
						
						//Weapons Increase Attack, if no weapon, takes damage from guantlets
						if(CurrentWeapon.ItemNo != 0){
							WeaponType = CurrentWeapon.ItemType2;
							CurrentCAtk4 = CAtk4 + CurrentWeapon.MDmg4;
							if(CurrentCAtk4 >= 10){
								CurrentCAtk3 =- 10;
								CurrentCAtk2 =+ 1;
								//CurrentCAtk3 =+ (CurrentCAtk4 /10);
								//CurrentCAtk4 =- ((CurrentCAtk4 /10)* 10);
							}
							CurrentCAtk3 = CAtk3 + CurrentWeapon.MDmg3;
							if(CurrentCAtk3 >= 10){
								CurrentCAtk3 =- 10;
								CurrentCAtk2 =+ 1;
							}
							CurrentCAtk4 = CAtk2 + CurrentWeapon.MDmg2;
							if(CurrentCAtk2 >= 10){
								CurrentCAtk2 =- 10;
								CurrentCAtk1 =+ 1;
							}
							CurrentCAtk4 = CAtk1 + CurrentWeapon.MDmg1;
							
							//int[] AttackWeaponDamage;
							
//							AttackWeaponDamage = BattleCalculations.CalculateWeakness(CurrentCAtk1, CurrentCAtk2, CurrentCAtk3, CurrentCAtk4, 1, 0, BattleM.MonsterD[CurrentM].Weakness);
//							CurrentCAtk1 = AttackWeaponDamage[0];
//							CurrentCAtk2 = AttackWeaponDamage[1];
//							CurrentCAtk3 = AttackWeaponDamage[2];
//							CurrentCAtk4 = AttackWeaponDamage[3];
							
							CDmg = BattleCalculations.CalculateDmg(CurrentCAtk1, CurrentCAtk2, CurrentCAtk3, CurrentCAtk4, WeaponType, WeaponElement, MDef1, MDef2, MDef3, MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType, CriticalM);
							CDmg1 = CDmg[0];
							CDmg2 = CDmg[1];
							CDmg3 = CDmg[2];
							CDmg4 = CDmg[3];
						}//Has a weapon
						else if(CurrentWeapon.ItemNo == 0 && CurrentGuantlets.ItemNo != 0){
							WeaponType = 0;//Unarmed
							CurrentCAtk4 = CAtk4 - CurrentGuantlets.MDmg4;
							if(CurrentCAtk4 >= 10){
								CurrentCAtk4 =- 10;
								CurrentCAtk3 =+ 1;
							}
							CurrentCAtk3 = CAtk3 - CurrentGuantlets.MDmg3;
							if(CurrentCAtk3 >= 10){
								CurrentCAtk3 =- 10;
								CurrentCAtk2 =+ 1;
							}
							CurrentCAtk4 = CAtk2 - CurrentGuantlets.MDmg2;
							if(CurrentCAtk2 >= 10){
								CurrentCAtk2 =- 10;
								CurrentCAtk1 =+ 1;
							}
							CurrentCAtk4 = CAtk1 - CurrentGuantlets.MDmg1;
							
//							int[] AttackUnarmedDamage = BattleCalculations.CalculateWeakness(CurrentCAtk1, CurrentCAtk2, CurrentCAtk3, CurrentCAtk4, 0, 0, BattleM.MonsterD[CurrentM].Weakness);
//							CurrentCAtk1 = AttackUnarmedDamage[0];
//							CurrentCAtk2 = AttackUnarmedDamage[1];
//							CurrentCAtk3 = AttackUnarmedDamage[2];
//							CurrentCAtk4 = AttackUnarmedDamage[3];
							
							CDmg = BattleCalculations.CalculateDmg(CurrentCAtk1, CurrentCAtk2, CurrentCAtk3, CurrentCAtk4, WeaponType, WeaponElement, MDef1, MDef2, MDef3, MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType, CriticalM);
							CDmg1 = CDmg[0];
							CDmg2 = CDmg[1];
							CDmg3 = CDmg[2];
							CDmg4 = CDmg[3];
						}//No Weapon, but wearing Guantlets
						else{//No Weapon/Null Weapon
							WeaponType = 0;//Unarmed
							
//							int[] AttackUnarmedDamage = BattleCalculations.CalculateDmg(CAtk1, CAtk2, CAtk3, CAtk4, WeaponType, WeaponElement, MDef1, MDef2, MDef3, MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType);
//							CDmg1 = AttackUnarmedDamage[0];
//							CDmg2 = AttackUnarmedDamage[1];
//							CDmg3 = AttackUnarmedDamage[2];
//							CDmg4 = AttackUnarmedDamage[3];
							
							CDmg = BattleCalculations.CalculateDmg(CAtk1, CAtk2, CAtk3, CAtk4, WeaponType, WeaponElement, MDef1, MDef2, MDef3, MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType, CriticalM);
							CDmg1 = CDmg[0];
							CDmg2 = CDmg[1];
							CDmg3 = CDmg[2];
							CDmg4 = CDmg[3];
						}
						
						Random DodgeRandom = new Random();
						int MDodgeRoll = DodgeRandom.nextInt(100);
						
						if(Luck < 0){					
							AntiLuck = Luck;
						}
						else
							AntiLuck = 0;
						
						if(MDodgeRoll < (BattleM.MonsterD[CurrentM].DodgeChance + MSpeed - Speed - AntiLuck)){
							Text1X = 30;
							Text1 = "Your attack missed!";
							Text2 = "";
						}//Attack Missed!
						else{//The Attack doesn't miss!
							
							//Recovered Health instead?
							if(CDmg1 < 1 && CDmg2 < 1 && CDmg3 < 1 && CDmg4 < 1 && (CDmg1 != 0 || CDmg2 != 0 || CDmg3 != 0 || CDmg4 != 0)){//Recovered HP from attack?
								//Absorbes attack as health
								if(BattleM.MonsterD[CurrentM].WeaknessType[WeaponType] == 3 || BattleM.MonsterD[CurrentM].WeaknessType[WeaponElement] == 3){
									EnemyRecover(1);
								}
								else
									EnemyRecover(0);
								
								if(CriticalM == 1){
									Text2 = "Critical Recover??";
								}
								CriticalM = 0;
								
								int[] MHP = BattleCalculations.RecoverGlitchedHp(MHP1[CurrentM], MHP2[CurrentM], MHP3[CurrentM], MHP4[CurrentM], BattleM.MonsterD[CurrentM].MHp1, BattleM.MonsterD[CurrentM].MHp2, BattleM.MonsterD[CurrentM].MHp3, BattleM.MonsterD[CurrentM].MHp4, CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[CurrentM].MHpMax);//BattleM.MonsterD[CurrentM].MHpMax
								MHP1[CurrentM] = MHP[0];
								MHP2[CurrentM] = MHP[1];
								MHP3[CurrentM] = MHP[2];
								MHP4[CurrentM] = MHP[3];
							}//Recovered health?
							else{//Took Damage
						
								DamageEnemy();
					
								if(CriticalM == 1){
									Text2 = "A Critical Hit!";
								}
								CriticalM = 0;
						
								int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[CurrentM], MHP2[CurrentM], MHP3[CurrentM], MHP4[CurrentM], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[CurrentM].MHpMax);//BattleM.MonsterD[CurrentM].MHpMax
								MHP1[CurrentM] = MHP[0];
								MHP2[CurrentM] = MHP[1];
								MHP3[CurrentM] = MHP[2];
								MHP4[CurrentM] = MHP[3];
						
							}//M Took Damage from Player Normal Attack
							
							if(CurrentWeapon.ItemNo == 138){//Admin Sword
								Text1 = BattleM.MonsterD[CurrentM].AdminText[0];
								Text2 = BattleM.MonsterD[CurrentM].AdminText[1];
							}
						
						}//The Attack Hit!
						
						//Enemy not Defeated
						if(MHP1[CurrentM] != 0 || MHP2[CurrentM] != 0 || MHP3[CurrentM] != 0 || MHP4[CurrentM] != 0){
							if(FocusToggle == 1){
								DisplayMN = 0;
								DisplayM = BattleM.MonsterD[0];
								DisplayM.MHp1 = MHP1[CurrentM];
								DisplayM.MHp2 = MHP2[CurrentM];
								DisplayM.MHp3 = MHP3[CurrentM];
								DisplayM.MHp4 = MHP4[CurrentM];
								MName = BattleM.MonsterD[0].MonsterName[0];
							}
							else{
								if(TargetToggle == 1){
									DisplayMN = CurrentM;
									DisplayM = BattleM.MonsterD[CurrentM];
									DisplayM.MHp1 = MHP1[CurrentM];
									DisplayM.MHp2 = MHP2[CurrentM];
									DisplayM.MHp3 = MHP3[CurrentM];
									DisplayM.MHp4 = MHP4[CurrentM];
									MName = BattleM.MonsterD[CurrentM].MonsterName[0];
								}
								else{
									DisplayMN = 0;
									DisplayM = BattleM.MonsterD[0];
									DisplayM.MHp1 = MHP1[0];
									DisplayM.MHp2 = MHP2[0];
									DisplayM.MHp3 = MHP3[0];
									DisplayM.MHp4 = MHP4[0];
									MName = BattleM.MonsterD[0].MonsterName[0];
								}
							}
						}
						
						//Enemy Defeated, but there are more left
						if(MHP1[CurrentM] == 0 && MHP2[CurrentM] == 0 && MHP3[CurrentM] == 0 && MHP4[CurrentM] == 0 && BattleM.MonsterD.length > 1){
							UpdateBattle(CurrentM);
							
							if(FocusToggle == 1){
//								if(BattleM.MonsterD[0].MonsterName.length > 1){
//									CurrentRandoName[0]= MNameRandom.nextInt(BattleM.MonsterD[0].MonsterName.length);
//								}
								DisplayMN = 0;
								DisplayM = BattleM.MonsterD[0];
								DisplayM.MHp1 = MHP1[0];
								DisplayM.MHp2 = MHP2[0];
								DisplayM.MHp3 = MHP3[0];
								DisplayM.MHp4 = MHP4[0];
								MName = BattleM.MonsterD[0].MonsterName[0];
							}
							else{
								if(TargetToggle == 1){
									DisplayMN = CurrentM;
									DisplayM = BattleM.MonsterD[CurrentM];
									DisplayM.MHp1 = MHP1[CurrentM];
									DisplayM.MHp2 = MHP2[CurrentM];
									DisplayM.MHp3 = MHP3[CurrentM];
									DisplayM.MHp4 = MHP4[CurrentM];
									MName = BattleM.MonsterD[CurrentM].MonsterName[0];
								}
								else{
									DisplayMN = 0;
									DisplayM = BattleM.MonsterD[0];
									DisplayM.MHp1 = MHP1[0];
									DisplayM.MHp2 = MHP2[0];
									DisplayM.MHp3 = MHP3[0];
									DisplayM.MHp4 = MHP4[0];
									MName = BattleM.MonsterD[0].MonsterName[0];
								}
							}
							//TODO TargetM Enemy Defeated Update Rewrite  //Misplaced TargetM
							
						}//Enemy Defeated, but there are more left End
						
						//TODO FocusToggle and TargetToggle?
						Turn = Turn + 1; //Attack Turn
						//if(Battle.Monsters.length == 1 || MTurn <= Battle.Monsters.length){
						//	MTurn = 0;
						//}
						//if(MTurn <= Battle.Monsters.length){
						//	MTurn = MTurn + 1;
						//}
						MTurn = 1;
					}//Enemy has HP left End
				}//Battle Screen: Attack End
				
				//Battle Screen: Item
				if(Ypos == 85){
					if(ItemsFound > 0){
						ScreenType = 3;
						Ypos = 30;
						Xpos = 30;
						Text1 = Item1.getItemDisc();
						Text2 = "";
					}
					if(ItemsFound == 0){
						ScreenType = 3;
						Ypos = 190;
						Xpos = 140;
						Text1 = "";
						Text2 = "";
					}
					Text1X = 30;
					Text2X = 30;
				}//Battle Screen: Item End
				
				//Battle Screen: Notes
				if(Ypos == 100){// && BombCounter == 0
					ScreenType = 5;
					if(NotesFound >= 1){
						Ypos = 30;
						Xpos = 30;
					}
					if(NotesFound == 0){//?
						Ypos = 190;
						Xpos = 140;
					}
				}//Battle Screen: Notes End
				
				//Battle Screen: Escape (used to be ????)
				if(Ypos == 115){
					if(BattleM.EscapeChance == 0){//Can't escape!
						Text1X = 30;
						Text1 = "There is no Escape!";//Probably for Boss or special event
						Text2 = "";
					}
					else{
						Random EscapeRandom = new Random();
						int ERandom = EscapeRandom.nextInt(100);
						if(ERandom <= BattleM.EscapeChance){
							Text1X = 30;
							Text1 = "Escape Success!";//"... It's ???? what do you expect?"
							Text2 = "";
							Turn = 0;
							MTurn = 0;
							EventS = 5;
							EnterOK = 1;
						}
						else{
							Text1X = 30;
							Text1 = "Escape Failed!";//Back to enemy turn?
							Text2 = "";
							Turn += 1;
							MTurn = 1;
						}
					}//Battle: If can escape End
				}//Battle Screen: Escape End
				
					System.out.println("Battle Turn is" + Turn);
					}//Normal No Bomb battle turn End
					if(BombCounter >= 2){//Bomb Attack 
						
						CDmg1 = MDmg1;
						CDmg2 = MDmg2;
						CDmg3 = MDmg3;
						CDmg4 = MDmg4;
						

						if(ItemType2 != 1){//Attack Item Does not do Pierce Damage
							//Bomb Damage
							int[] NewDamage = BattleCalculations.CalculateDmg(CDmg1, CDmg2, CDmg3, CDmg4, 6, ItemElement, BattleM.MonsterD[CurrentM].MDef1, BattleM.MonsterD[CurrentM].MDef2, BattleM.MonsterD[CurrentM].MDef3, BattleM.MonsterD[CurrentM].MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType, 0);
							CDmg1 = NewDamage[0];
							CDmg2 = NewDamage[1];
							CDmg3 = NewDamage[2];
							CDmg4 = NewDamage[3];
						}
//						
						if((CDmg1 > 0 || CDmg2 > 0 || CDmg3 > 0 || CDmg4 > 0) || (CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0 && CDmg4 == 0)){//Did positive Bomb damage
							
							DamageEnemy();
							
							
							int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[BombCounter - 2], MHP2[BombCounter - 2], MHP3[BombCounter - 2], MHP4[BombCounter - 2], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[BombCounter - 2].MHpMax);
							MHP1[BombCounter - 2] = MHP[0];
							MHP2[BombCounter - 2] = MHP[1];
							MHP3[BombCounter - 2] = MHP[2];
							MHP4[BombCounter - 2] = MHP[3];
							
							CDmg1 = 0;
							CDmg2 = 0;
							CDmg3 = 0;
							CDmg4 = 0;
						}//Positive Bomb Damage End
						
						if(CDmg1 < 0 || CDmg2 < 0 || CDmg3 < 0 || CDmg4 < 0){//Recover HP Bomb Damage //Negative damage?
							
							EnemyRecover(0);
							
							int[] RHpM = BattleCalculations.RecoverHp(MHP1[BombCounter - 2], MHP2[BombCounter - 2], MHP3[BombCounter - 2], MHP4[BombCounter - 2], MonsterData.MData(BattleM.MonsterD[BombCounter - 2].MonsterID, Gamemode).MHp1, MonsterData.MData(BattleM.MonsterD[BombCounter - 2].MonsterID, Gamemode).MHp2, MonsterData.MData(BattleM.MonsterD[BombCounter - 2].MonsterID, Gamemode).MHp3, MonsterData.MData(BattleM.MonsterD[BombCounter - 2].MonsterID, Gamemode).MHp4, CDmg1, CDmg2, CDmg3, CDmg4);{
								MHP1[BombCounter - 2] = RHpM[0];
								MHP2[BombCounter - 2] = RHpM[1];
								MHP3[BombCounter - 2] = RHpM[2];
								MHP4[BombCounter - 2] = RHpM[3];
							}
							
							
							CDmg1 = 0;
							CDmg2 = 0;
							CDmg3 = 0;
							CDmg4 = 0;
						}////Recover HP Bomb Damage End
						//TODO Bombturn

						if((BombCounter - 2) >= 0 && (BombCounter - 1 <= MHP1.length)){
							//Bomb Enemy Defeated
							if((MHP1[BombCounter - 2] == 0 && MHP2[BombCounter - 2] == 0 && MHP3[BombCounter - 2] == 0 && MHP4[BombCounter - 2] == 0)){
								Text1 = BattleM.MonsterD[BombCounter - 2].MonsterName + " defeated";
								Text2 = "";
								
								DisplayM = BattleM.MonsterD[CurrentM];
								//MHP1
								MName = BattleM.MonsterD[CurrentM].MonsterName[0];
								
								//All Enemy Defeated
								if(BattleM.MonsterD.length == 1){
									BombCounter = 0;
									EnterOK = 0;
								}//All Enemy Defeated End

								//Bomb Enemy Defeated No More Bomb
								else if(BattleM.MonsterD.length > 1 && BattleM.MonsterD.length < (BombCounter - 1)){
									UpdateBattle(CurrentM);
									EnterOK = 0;
									BombCounter = 0;
									//Turn = Turn + 1;

									//Next Turn 
									CurrentM = 0;
									MNo = BattleM.MonsterD[CurrentM].MonsterID;
									SetM(BattleM.MonsterD[CurrentM]);
									DisplayMN = CurrentM;
									//DisplayM = BattleM.MonsterD[CurrentM];
									//MName = BattleM.MonsterD[CurrentM].MonsterName;
									
									if(TargetToggle == 1){
										//X
										//TargetM = No Change?
										DisplayMN = TargetM;
										DisplayM = BattleM.MonsterD[TargetM];
										CurrentM = 0;
										
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]);
										MName = BattleM.MonsterD[TargetM].MonsterName[0];
									}
									else{
										if(FocusToggle == 1){
											CurrentM = 0;
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											//TargetM No Change?
											 
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										}
										else{
											CurrentM = 0;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										}
									}
								}//Enemy Defeated No More Bomb End
								
								//Bomb Enemy Defeated More Bomb
								else if(BattleM.MonsterD.length > 1 && BattleM.MonsterD.length >= (BombCounter - 1)){//||TestMonster4
									UpdateBattle(CurrentM);
									//Next Bomb
									CurrentM = BombCounter - 2;
									//X
									MNo = BattleM.MonsterD[CurrentM].MonsterID;
									SetM(BattleM.MonsterD[CurrentM]);
									DisplayMN = CurrentM;
									DisplayM = BattleM.MonsterD[CurrentM];
									MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									
									if(FocusToggle == 1){
										CurrentM = BombCounter - 2;
										DisplayMN = BombCounter - 2;
										DisplayM = BattleM.MonsterD[CurrentM];
										//TargetM = NO CHANGE
										
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]); 
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									}
									else{
										if(TargetToggle == 1){
											//TargetM NO CHANGE;
											DisplayMN = TargetM;
											DisplayM = BattleM.MonsterD[TargetM];
											CurrentM = BombCounter - 2;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);  
											MName = BattleM.MonsterD[TargetM].MonsterName[0];
										}
										else{
											CurrentM =  BombCounter - 2;
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											//TargetM NO CHANGE
											 
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);  
											MName = BattleM.MonsterD[0].MonsterName[0];
										}
									}
								}
							}//Bomb Enemy Defeated End
							

							//Bomb Enemy Not Defeated
							else if((MHP1[BombCounter - 2] != 0 || MHP2[BombCounter - 2] != 0 || MHP3[BombCounter - 2] != 0 || MHP4[BombCounter - 2] != 0)){
								
								//Bomb Enemy Okay No More Bomb
								if(BattleM.MonsterD.length > 1 && BattleM.MonsterD.length <= (BombCounter - 1)){
									EnterOK = 0;
									BombCounter = 0;
									//Next Turn TODO FocusToggle and TargetToggle
									//Turn = Turn + 1;
									CurrentM = 0;
									MNo = BattleM.MonsterD[CurrentM].MonsterID;
									SetM(BattleM.MonsterD[CurrentM]);
									DisplayMN = CurrentM;
									DisplayM = BattleM.MonsterD[CurrentM];
									MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									
									if(TargetToggle == 1){
										DisplayMN = TargetM;
										DisplayM = BattleM.MonsterD[TargetM];
										//TargetM = NO CHANGE;
										CurrentM = TargetM;
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]);
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									}
									else{
										if(FocusToggle == 1){
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											//TargetM = No Change;
											CurrentM = 0; 
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										}
										else{
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											//TargetM no change;
											CurrentM = 0;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											MName = BattleM.MonsterD[0].MonsterName[0];
										}
									}
								}

								//Bomb Enemy not defeated More Bomb
								else if(BattleM.MonsterD.length > 1 && BattleM.MonsterD.length > (BombCounter - 1)){
									//Next Bomb
									BombCounter = BombCounter + 1;
									CurrentM = BombCounter - 2;
									MNo = BattleM.MonsterD[CurrentM].MonsterID;
									SetM(BattleM.MonsterD[CurrentM]);
									DisplayMN = CurrentM;
									DisplayM = BattleM.MonsterD[CurrentM];
									MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									
									if(FocusToggle == 1){
										CurrentM = BombCounter - 2;
										DisplayMN = CurrentM;
										DisplayM = BattleM.MonsterD[CurrentM];
										//TargetM = no change;
									
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]);
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									}
									else{
										if(TargetM == 1){
											DisplayMN = TargetM;
											DisplayM = BattleM.MonsterD[TargetM];
											//TargetM nochange
											CurrentM = BombCounter - 2;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											MName = BattleM.MonsterD[TargetM].MonsterName[0];
										}
										else{
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											//TargetM NoChange
											CurrentM = BombCounter - 2;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											MName = BattleM.MonsterD[0].MonsterName[0];
										}
									}
								}
							}//Bomb Enemy not defeated End
						
						}//Bomb Enemy defeated or not? and More bomb/ No more bomb
						else{//BombCounter is too Large/Small
							if(BombCounter - 1 > MHP1.length){
								BombCounter = BombCounter - 1;
							}
						}
						
						
						//FocusToggle and TargetToggle
						
					}//Bomb Attack End
				}//End of if Attack turn MTurn = 0
				//Start Monster's Turn need to add a new turncounter // MTurns
				else if(MTurn <= BattleM.MonsterD.length){ // else Turn is odd Monster's turn
					
					Random BattleEventRandom = new Random();
					int BERandom = BattleEventRandom.nextInt(100);
					
					//CheckEventTypesandStuff;
					boolean BattleAttack = false;
					
	//	Here;
					//Monster special attack/ability Check
					if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][1] >= BERandom){
						if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 1 && BattleM.MonsterD.length <= 50){//Summon
		
							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);

							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];
							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];
							
							BattleEventEffect(MTurn - 1, CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
							BattleEventMonsterFocus = MTurn - 1;
							//BattleEventText = 1;
							BattleEventMode = 1;
							System.out.println("Battle Event Text: " + BattleEventText);
						}
						//Prismatic Def 2 ~ 15 Starts a Cutscene
						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] >= 2 && BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] <= 15){

							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
							
							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];
							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];
							
							BattleEventMonsterFocus = MTurn - 1;
							BattleEventEffect(BattleEventMonsterFocus, CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
							
							//BattleEventText = 1;
							BattleEventMode = 1;
		
						}
						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 3){//Normal/Multi Attack
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//						}
//						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 4){//Special Attack
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//						}//Special Attack End
						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 5 || BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 6){//Recover or Special Recover
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];
//							
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//							
//						}//Recover Ability End
//						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 7){//Vampire Recover
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//						}//Vampire Recover End
//						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 8){//Snowstorm
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//						}//Snowstorm End
//						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 9){//Negative Status
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//						}
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 10){//Change Current Weapon
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//		
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];;
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];;
//						}
//						
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 11){//Break Current Weapon
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];;
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];;
//							
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//		
//						}
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 12){//Disarm Weapon
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];;
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];;
//							
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//		
//						}
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 13){//Escape
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];;
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];;
//							
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//		
//						}
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 14){//Drop Money
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];;
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];;
//							
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//		
//						}
//						else if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 15){//Start Cutscene
//							Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[0];
//							Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[1];
//							HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[2];;
//							HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[0])[3];;
//							
//							CurrentBattleEvent = BattleEvent.LoadEvent(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0]);
//							BattleEventEffect(CurrentBattleEvent.EventType[0], CurrentBattleEvent.EventData[0]);
//							
//							//BattleEventText += 1;
//							//BattleEventMode = 1;
//		
//							//Cutscene Mode may determine 
//						}
						else{//Not Recognised Battle Event Type
							BattleAttack = true;
						}
					}//Special Attacks/Abilities Activated Randomly End
					else
						BattleAttack = true;
				
					
					//0 No Event/Null Event
					//1 Summon another enemy
					//2 Special Attack
					//3 Recover Health
					
					if(BattleAttack == true){//Monster does a normal attack
					
						MDmg1 = 0;
						MDmg2 = 0;
						MDmg3 = 0;
						MDmg4 = 0;
						MAtk1 = BattleM.MonsterD[MTurn - 1].MAtk1;// MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMATK1();
						MAtk2 = BattleM.MonsterD[MTurn - 1].MAtk2;
						MAtk3 = BattleM.MonsterD[MTurn - 1].MAtk3;
						MAtk4 = BattleM.MonsterD[MTurn - 1].MAtk4;
						AtkType = BattleM.MonsterD[MTurn - 1].AtkType;
						MName = BattleM.MonsterD[MTurn - 1].MonsterName[0];
						MSpeed = BattleM.MonsterD[MTurn - 1].MSpeed;
						int MStatus = BattleM.MonsterD[MTurn - 1].NegativeStatus;
						int MStatusChance = BattleM.MonsterD[MTurn - 1].StatusChance;
					
					//int MAttackElement1 = 
					//int MAttackElement2 = 
					
					int[] MDmg = new int[4];{
						MDmg[0] = 0;
						MDmg[1] = 0;
						MDmg[2] = 0;
						MDmg[3] = 0;
					}
					
					int CombinedDefence = CDef1*1000 + CDef2*100 + CDef3*10 + CDef4;
					int CurrentCDef1;
					int CurrentCDef2;
					int CurrentCDef3;
					int CurrentCDef4;
					
					//Calculate Defence
					//CurrentCDef = CDef + CurrentArmor
					
					Random DodgeRandom = new Random();
					int DodgeRoll = DodgeRandom.nextInt(100);
					
					if(Luck < 0){
						AntiLuck = Luck;
					}
					else
						AntiLuck = 0;
					
					if(DodgeRoll <= (DodgeChance + Speed - MSpeed + AntiLuck)){
						Text1X = 70;
						Text2X = 70;
						Text1 = MName + "'s attack";
						Text2 = "missed!";
					}
					else{//Attack not dodged!
						
						Random CriticalRandom = new Random();
						int CriticalR = CriticalRandom.nextInt(100);
						
						if(CriticalR <= BattleM.MonsterD[MTurn - 1].CriticalChance - AntiLuck){//Critcal Hit!
							
							MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleM.MonsterD[MTurn - 1].AttackElement1, BattleM.MonsterD[MTurn - 1].AttackElement2, CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 1, PlayerWeaknesses);
							MDmg1 = MDmg[0];
							MDmg2 = MDmg[1];
							MDmg3 = MDmg[2];
							MDmg4 = MDmg[3];
							TookDamage(3);
						}
						else{
							//Calculate Damage Regular HP
							MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleM.MonsterD[MTurn - 1].AttackElement1, BattleM.MonsterD[MTurn - 1].AttackElement2, CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 0, PlayerWeaknesses);
							MDmg1 = MDmg[0];
							MDmg2 = MDmg[1];
							MDmg3 = MDmg[2];
							MDmg4 = MDmg[3];

							TookDamage(2);
							//DisplayMN = MTurn - 1;
							//DisplayM = BattleM.MonsterD[MTurn - 1];
							//MName = BattleM.MonsterD[MTurn - 1].MonsterName;
						}
						
						int StatusR = 0;
						
						if(MStatusChance > 0){
							Random StatusRandom = new Random();
							StatusR = StatusRandom.nextInt(MStatusChance);
						}
						else
							StatusR = MStatusChance;
						if(MStatus != 0){
						if(StatusR - AntiLuck > StatusResist[MStatus-1]){//Enemies that can cause negative statuses, but at 0% chance... It's about Luck!
							if(Status == 6){//Barrier
								Status = 0;
							}
							else{
								Status = MStatus;
								StatusTurns = 5;
							}
						}
						}//If Current Enemy can inflict Negative Status
					
						//Calculate Damage Received Regular HP
						int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
						CHP1 = CHP[0];
						CHP2 = CHP[1];
						CHP3 = CHP[2];
						CHP4 = CHP[3];
					}//MAttack not Dodged End
					
				}//Monster Attacks End
					//Lose
					if(CHP1 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
						Defeated(0);
					}//Lose End
					
					//Turn = Turn + 1; Actions
					if((BattleM.MonsterD.length == 1 || MTurn == BattleM.MonsterD.length) && (Status != 1 && Status != 5)){//Enemy Turn End
						MTurn = 0;
						Turn = Turn + 1;
						if(TargetToggle == 1){
							//DisplayM = CurrentM;
							//MName = BattleM.MonsterD[TargetM].MonsterName;
							CurrentM = TargetM;
							MNo = BattleM.MonsterD[TargetM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[TargetM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[TargetM].MonsterName[0];
						}
						else{
							CurrentM = 0;
							TargetM = CurrentM;//?
							MNo = BattleM.MonsterD[CurrentM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
					}//Enemy Turn End End
					else if((BattleM.MonsterD.length == 1 || MTurn == BattleM.MonsterD.length) && (Status == 1 || Status == 5)){//Poison Turn Next
						MTurn = MTurn + 1;
						
						if(TargetToggle == 1){
							//DisplayM = CurrentM;
							//MName = BattleM.MonsterD[TargetM].MonsterName;
							CurrentM = TargetM;
							MNo = BattleM.MonsterD[TargetM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[TargetM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[TargetM].MonsterName[0];
						}
						else{
							CurrentM = 0;
							TargetM = CurrentM;//?
							MNo = BattleM.MonsterD[CurrentM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
					}
					else if(MTurn < BattleM.MonsterD.length){//Enemy Turn Next
						MTurn = MTurn + 1;
						//System.out.println("MTurn " + MTurn);
						CurrentM = 0;
						//SetM(MNo);
						if(FocusToggle == 1){
							CurrentM = MTurn - 1;
							MNo = BattleM.MonsterD[CurrentM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[CurrentM];
							DisplayM.MHp2 = MHP2[CurrentM];
							DisplayM.MHp3 = MHP3[CurrentM];
							DisplayM.MHp4 = MHP4[CurrentM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
						else{
							
							if(TargetToggle == 1){
								CurrentM = MTurn - 1;
								//TargetM
								MNo = BattleM.MonsterD[TargetM].MonsterID;
								SetM(BattleM.MonsterD[TargetM]);
								DisplayMN = TargetM;
								DisplayM = BattleM.MonsterD[TargetM];
								DisplayM.MHp1 = MHP1[TargetM];
								DisplayM.MHp2 = MHP2[TargetM];
								DisplayM.MHp3 = MHP3[TargetM];
								DisplayM.MHp4 = MHP4[TargetM];
								MName = BattleM.MonsterD[TargetM].MonsterName[0];
							}
							else{
								CurrentM = 0;
								TargetM = CurrentM;
								MNo = BattleM.MonsterD[CurrentM].MonsterID;
								SetM(BattleM.MonsterD[CurrentM]);
								DisplayMN = 0;
								DisplayM = BattleM.MonsterD[CurrentM];
								DisplayM.MHp1 = MHP1[CurrentM];
								DisplayM.MHp2 = MHP2[CurrentM];
								DisplayM.MHp3 = MHP3[CurrentM];
								DisplayM.MHp4 = MHP4[CurrentM];
								MName = BattleM.MonsterD[CurrentM].MonsterName[0];
							}
						}
					}//Enemy Turn Next End
					
					
				} // Else odd End of Monster's Turn MTurn !=0
				else if(MTurn > BattleM.MonsterD.length){//Poison Turns MTurn > BattleM.MonsterD.length
					MTurn = 0;
					Turn = Turn + 1;
					
					if(StatusTurns > 0 && MTurn != 0){
						StatusTurns -= 1;
					}
					if(StatusTurns == 0){
						Status = 0;
						Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
					}
					
					//Set Poison Damage
					MDmg1 = 0;
					MDmg2 = 0;
					MDmg3 = 0;
					MDmg4 = 5;
					
					int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
					CHP1 = CHP[0];
					CHP2 = CHP[1];
					CHP3 = CHP[2];
					CHP4 = CHP[3];
					
					Text1X = 80;
					Text1 = "Took "+ MDmg4 + " Damage";
					Text2 = "from Poison!";
					
					if(CHP4 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
						Defeated(1);//Defeated by the Poison
					}
				}
				//else{//Error Handling?
				//	
				//}
				
			}//Battle Screen Enter End
			
			//All Enemies Defeated
			if(BattleToggle == 1 && MHP4[CurrentM] == 0 && MHP3[CurrentM] == 0 && MHP2[CurrentM] == 0 && MHP1[CurrentM] == 0 && DefeatToggle == 1 && BombCounter == 0 && BattleM.MonsterD.length <= 1){//may reorder
				if(StatusTurns > 0){
					StatusTurns -= 1;
				}
				if(StatusTurns == 0){
					Status = 0;
				}
				EnemyDefeatedBattle();
			}//Enemy Defeated Checker End
			
			else if(EnemyEscapedToggle == 1 && EventS == 0){
				//EnemyEscapedToggle = 0;
				EnemyDefeatedBattle();
				
				Text1 = Conversations.LoadText(CurrentBattleEvent.EventData[0][9])[0];
				Text2 = Conversations.LoadText(CurrentBattleEvent.EventData[0][9])[1];
				HiddenText1 = Conversations.LoadText(CurrentBattleEvent.EventData[0][9])[2];
				HiddenText2 = Conversations.LoadText(CurrentBattleEvent.EventData[0][9])[3];
				//x;
			}
			
			//Item Screen Enter
			else if(ScreenType == 3){
				System.out.println("Tring to fix items ERRRRG");
				//Item Screen: Item
				if(Ypos == 30 || Ypos == 45 || Ypos == 60 || Ypos == 75 || Ypos == 90 || Ypos == 105 || Ypos == 120 || Ypos == 135 || Ypos == 150 || Ypos == 165){//Ypos == 30
					if(ItemToggle == 1){//ItemToggle
					//Text1X = 70;
					//Text2X = 700;
					//Text1 = "No Items Yet";
						if(Ypos == 30){//might put MDMG after Itemtype?
							//Get ItemData
							ItemSelected = Item1;
						}
						if(Ypos == 45){
							ItemSelected = Item2;
						}
						if(Ypos == 60){
							ItemSelected = Item3;
						}
						if(Ypos == 75){
							ItemSelected = Item4;
						}
						if(Ypos == 90){
							ItemSelected = Item5;
						}
						if(Ypos == 105){
							ItemSelected = Item6;
						}
						if(Ypos == 120){
							ItemSelected = Item7;
						}
						
						ItemName = ItemSelected.ItemName;
						MDmg1 = ItemSelected.getMDmg1();
						MDmg2 = ItemSelected.getMDmg2();
						MDmg3 = ItemSelected.getMDmg3();
						MDmg4 = ItemSelected.getMDmg4();
						ItemType = ItemSelected.getItemType();
						ItemType2 = ItemSelected.ItemType2;
						ItemAmount = ItemAmount1[ItemSelected.getItemNo() - 1];//?Item1.getItemNo() - 1 //0 + ItemPlacement
						ItemNo = ItemSelected.getItemNo() - 1;
						//int RestoreStatus = ItemSelected.Cure;
						
						if(ItemType == 1 || ItemType == 2){//Potion or Food
							if(ItemAmount == 0){
								Text1 = "Out of " + ItemName;//Need more, cant use, No ItemName Left, Not enough
								Text2 = "";
							}
						if(ItemAmount != 0){//exploitable glitch detected in battle mode if 0
											//Display health and item rapid fire in Another Story?
							ItemAmount = ItemAmount - 1;
							ItemAmount1[ItemNo] = ItemAmount1[ItemNo] - 1;
							int i1 = 0;
							int i2 = 0;
							while(i1 < Item1Found.length){
								if(Item1Found[i1] == 1){
									ItemAmount2[i2] = ItemAmount1[i1];
									i2 = i2 + 1;
								}
								i1 = i1 + 1;
							}
							CHP1Max = 0;
							CHP2Max = 0;
							CHP3Max = 2;
							CHP4Max = 5;
						
						
						if(MDmg1 <= 0 && MDmg2 <= 0 && MDmg3 <= 0 && MDmg4 <= 0){//MDmg1 !> 0?
						//Calculate Recover w Defence?
						
						RecoverHealth();
						
						int[] RHp = BattleCalculations.RecoverHp(CHP1, CHP2, CHP3, CHP4, CHP1Max, CHP2Max, CHP3Max, CHP4Max, MDmg1, MDmg2, MDmg3, MDmg4);{
							CHP1 = RHp[0];
							CHP2 = RHp[1];
							CHP3 = RHp[2];
							CHP4 = RHp[3];
						}
								
						//Lose Negative HP?
						if(CHP4 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
							Defeated(0);
						}
						MDmg1 = 0;
						MDmg2 = 0;
						MDmg3 = 0;
						MDmg4 = 0;
						}//End of if Potion/Food Item used Recovers health
						
						if(MDmg1 > 0 || MDmg2 > 0 || MDmg3 > 0 || MDmg4 > 0){
							//Calculate Damage Regular HP?
							
							//Calculate Damage Theory Regular HP
							//HP1 HP2 HP3 HP4
							//Atk1 Atk2 Atk3 Atk4
							//Def1 Def2 Def3 Def4
							
							TookDamage(1);//Message
							
							//Calculate Damage Received Regular HP
							int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
							CHP1 = CHP[0];
							CHP2 = CHP[1];
							CHP3 = CHP[2];
							CHP4 = CHP[3];
							
							//if(CHP4 >= MDmg4){ //no damage?
							
							//Lose
							if(CHP4 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
								Defeated(0);
							}
							
							MDmg1 = 0;
							MDmg2 = 0;
							MDmg3 = 0;
							MDmg4 = 0;
						}//End of if Potion/Food Item used causes damage
						
						//Cures Poison?
						if((Status == 1 || Status == 5) && (ItemSelected.Cure == 1 || ItemSelected.Cure == 6)){
							Status = 0;
							StatusTurns = 0;
						}
						//Cures Curse?
						else if((Status == 2 || Status == 5) && (ItemSelected.Cure == 2 || ItemSelected.Cure == 6)){
							Status = 0;
							StatusTurns = 0;
							Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
						}
						//Cures Sticky?
						else if((Status == 3 || Status == 5) && (ItemSelected.Cure == 3 || ItemSelected.Cure == 6)){
							Status = 0;
							StatusTurns = 0;
						}
						//Cures ????
						else if((Status == 4 || Status == 5) && (ItemSelected.Cure == 4 || ItemSelected.Cure == 6)){
							Status = 0;
							StatusTurns = 0;
						}
						//Cures ALL?
						else if((Status == 5 || Status == 6)  && (ItemSelected.Cure == 5 || ItemSelected.Cure == 6)){
							Status = 0;
							StatusTurns = 0;
							Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
						}
						
						if(Luck < 0){					
							AntiLuck = Luck;
						}
						else
							AntiLuck = 0;
						
						Random NegStatusRandom = new Random();
						int NegStatusR = NegStatusRandom.nextInt(100);
						
						if(NegStatusR < -AntiLuck && ItemSelected.NegStatus != 0){
							Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
							
							if(Status == 6){//Status "Barrier"
								Status = 0;
								StatusTurns = 0;
							}
							else if(ItemSelected.NegStatus == 1){//Poison
								Status = 1;
								StatusTurns = 5;
								Text1X = 80;
								Text1 = "You became Poisoned!";
								Text2 = "How Unlucky!";
							}
							else if(ItemSelected.NegStatus == 2){//Curse
								Status = 2;
								StatusTurns = 5;
								Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck + CursedLuck;
								Text1X = 80;
								Text1 = "You became Cursed!";
								Text2 = "How Unlucky!";
							}
							else if(ItemSelected.NegStatus == 3){//Sticky
								Status = 3;
								StatusTurns = 5;
								Text1X = 80;
								Text1 = "You became Sticky!";
								Text2 = "How Unlucky!";
							}
							else if(ItemSelected.NegStatus == 4){//???
								Status = 4;
								StatusTurns = 5;
								Text1X = 80;
								Text1 = "What just happened?";
								Text2 = "Something unlucky?";
							}
							else if(ItemSelected.NegStatus == 5){//All?
								Status = 5;
								StatusTurns = 5;
								Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck + CursedLuck;
								Text1X = 80;
								Text1 = "All?";
								Text2 = "That's not good";
							}
							else if(ItemSelected.NegStatus == 6 && Status != 0){//Cure!
								Status = 0;
								StatusTurns = 0;
								Text1X = 80;
								Text1 = "Your status is normal?";
								Text2 = "What happened?";
							}
							else if(ItemSelected.NegStatus == 6 && Status == 0){//StatusBarrier
								Status = 6;
								StatusTurns = 5;
							}
						}
						
						if(BattleToggle == 1){
							ScreenType = 2;
							Ypos = 70;
							Xpos = 60;
							if(MTurn == 0 && ItemTurns == 1){
								Turn = Turn + 1;
								MTurn = MTurn + 1;
							}
						}
						if(BattleToggle == 0){
							ScreenType = 1;
							Ypos = 70;
							Xpos = 60;
						}
						
						}//End of Actually have some of the potion/Food you are trying to drink/eat
					}//End ItemType = 1 or 2 (Potion or Food)
						
						if(ItemType == 3 || ItemType == 4 || ItemType == 5){//NonEdible Food, Metal or Alloy
							Text1 = "Cannot use this Item";
							Text2 = "";
						}
						
						if(ItemType == 6){//Weapon
							//ChangeWeapon
							if(CurrentWeapon == NullItem){//Unequiped
								if(ItemAmount == 0){
									Text1 = "Out of " + ItemName;//Need more, cant use, No ItemName Left, Not enough
									Text2 = "";
								}
								else{//You actually have the weapon you want to use
									CurrentWeapon = ItemSelected;
									CurrentElement = ItemElement;//ItemList[Items.ItemNo(Item1Found, CurrentWeapon)].Element;k
									Text1 = "Equipt " + ItemName;
									Text2 = "";
									if(BattleToggle == 1){
										ScreenType = 2;
										Ypos = 70;
										Xpos = 60;
										if(MTurn == 0 && EquipmentTurns == 1){
											Turn = Turn + 1;
											MTurn = MTurn + 1;
										}
									}
								}//Actually have the weapon you want to use
							}//Equipting Weapon End
							else{//Weapon Equiped Already
								if(Status == 2){//Cursed!
									Text1 = "I'm Cursed!";
									Text2 = "";
								}
								else if(Status == 3 || Status == 5){
									Text1 = "It's Stuck!";
									Text2 = "";
								}
								else if(CurrentWeapon == ItemSelected){
									CurrentWeapon = NullItem;
									if(CurrentGuantlets != NullItem){
										CurrentElement = CurrentGuantlets.ItemElement;
									}
									else//Has Guantlets On
										CurrentElement = 0; //Gloves Element?
									Text1 = "Unequipt " + ItemName;
									Text2 = "";
									if(BattleToggle == 1){
										ScreenType = 2;
										Ypos = 70;
										Xpos = 60;
										if(MTurn == 0 && EquipmentTurns == 1){
											Turn = Turn + 1;
											MTurn = MTurn + 1;
										}
									}
								}//Un-Equipting Weapon End
								else{//Switching Weapon
									CurrentWeapon = ItemSelected;
									CurrentElement = CurrentWeapon.ItemElement;
									Text1 = "Equipt " + ItemName;
									Text2 = "";
									if(BattleToggle == 1){
										ScreenType = 2;
										Ypos = 70;
										Xpos = 60;
										if(MTurn == 0 && EquipmentTurns == 1){
											Turn = Turn + 1;
											MTurn = MTurn + 1;
										}
									}
								}//Switching Weapon End
							}//Un-Equipting/Switching Weapon End
							
						}//Weapon End
						
						if(ItemType == 7){//Weapon(Bomb)
							if(BattleToggle == 0){//Not in battle
								Text1 = "Cannot use this Item";
								Text2 = "";
							}//Not in Battle End
							if(BattleToggle == 1){//In Battle
							if(ItemAmount == 0){//No Bombs left
								Text1 = "Out of " + ItemName;//Need more, cant use, No ItemName Left, Not enough
								Text2 = "";
							}
							if(ItemAmount != 0){//Have some Bombs
								ItemAmount = ItemAmount - 1;
								ItemAmount1[ItemNo] = ItemAmount1[ItemNo] - 1;
								int i1 = 0;
								int i2 = 0;
								while(i1 < Item1Found.length){//ItemAmountUsed/Update
									if(Item1Found[i1] == 1){
										ItemAmount2[i2] = ItemAmount1[i1];
										i2 = i2 + 1;
									}
									i1 = i1 + 1;
								}//Item Amount Used/Update End
								
								EnterOK = 1;
								BombCounter = 2;
								TargetM = CurrentM;
								CurrentM = 0;
								
								CDmg1 = MDmg1;
								CDmg2 = MDmg2;
								CDmg3 = MDmg3;
								CDmg4 = MDmg4;
								
								if(ItemType2 != 1){//Attack Item Does not do Pierce Damage
									//Bomb Damage
									int[] NewDamage = BattleCalculations.CalculateDmg(CDmg1, CDmg2, CDmg3, CDmg4, 6, ItemElement, BattleM.MonsterD[CurrentM].MDef1, BattleM.MonsterD[CurrentM].MDef2, BattleM.MonsterD[CurrentM].MDef3, BattleM.MonsterD[CurrentM].MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType, 0);
									CDmg1 = NewDamage[0];
									CDmg2 = NewDamage[1];
									CDmg3 = NewDamage[2];
									CDmg4 = NewDamage[3];
								}
								
								if((CDmg1 > 0 || CDmg2 > 0 || CDmg3 > 0 || CDmg4 > 0) || (CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0 && CDmg4 == 0)){//Did positive Bomb damage
									
									DamageEnemy();
									
									int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[CurrentM], MHP2[CurrentM], MHP3[CurrentM], MHP4[CurrentM], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[CurrentM].MHpMax);
									MHP1[CurrentM] = MHP[0];
									MHP2[CurrentM] = MHP[1];
									MHP3[CurrentM] = MHP[2];
									MHP4[CurrentM] = MHP[3];
									
									CDmg1 = 0;
									CDmg2 = 0;
									CDmg3 = 0;
									CDmg4 = 0;
								}//Positive Bomb Damage End
								
								if(CDmg1 < 0 || CDmg2 < 0 || CDmg3 < 0 || CDmg4 < 0){//Recover HP Bomb Damage //Negative damage?
									
									EnemyRecover(0);
									
									int[] RHpM = BattleCalculations.RecoverHp(MHP1[CurrentM], MHP2[CurrentM], MHP3[CurrentM], MHP4[CurrentM], MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp1, MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp2, MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp3, MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp4, CDmg1, CDmg2, CDmg3, CDmg4);{
										MHP1[CurrentM] = RHpM[0];
										MHP2[CurrentM] = RHpM[1];
										MHP3[CurrentM] = RHpM[2];
										MHP4[CurrentM] = RHpM[3];
									}
									
									CDmg1 = 0;
									CDmg2 = 0;
									CDmg3 = 0;
									CDmg4 = 0;
								}////Recover HP Bomb Damage End
								
								//Enemy not defeated, and is the only enemy in the battle
								if((MHP1[CurrentM] != 0 || MHP2[CurrentM] != 0 || MHP3[CurrentM] != 0 || MHP4[CurrentM] != 0) && BattleM.MonsterD.length == 1){
									BombCounter = 0;
									if(MTurn == 0 && BombTurns == 1){
										Turn = Turn + 1;
										MTurn = MTurn + 1;
									}
								}
								
								//Bomb: Enemy Defeated, but there are more left
								if(MHP1[CurrentM] == 0 && MHP2[CurrentM] == 0 && MHP3[CurrentM] == 0 && MHP4[CurrentM] == 0 && BattleM.MonsterD.length > 1){
									Text1 = MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).getMonsterName(0) + " defeated";
									Text2 = "";
									UpdateBattle(CurrentM);
									BombCounter = 2;//BombCounter = BombCounter - 1;
									if(FocusToggle == 1){
										CurrentM = 0;
										//TargetM No Change
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]);
										DisplayMN = CurrentM;
										DisplayM = BattleM.MonsterD[CurrentM];
										DisplayM.MHp1 = MHP1[CurrentM];
										DisplayM.MHp2 = MHP2[CurrentM];
										DisplayM.MHp3 = MHP3[CurrentM];
										DisplayM.MHp4 = MHP4[CurrentM];
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										
										//DisplayM = 0;
										//TargetM No Change
										//CurrentM  X
										//MNO  X
										//SetM  X
										//MName = BattleM.MonsterD[CurrentM].MonsterName
									}//FocusToggle is On End
									else{
										if(TargetToggle == 1){
											CurrentM = 0;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = TargetM;
											DisplayM = BattleM.MonsterD[TargetM];
											DisplayM.MHp1 = MHP1[TargetM];
											DisplayM.MHp2 = MHP2[TargetM];
											DisplayM.MHp3 = MHP3[TargetM];
											DisplayM.MHp4 = MHP4[TargetM];
											MName = BattleM.MonsterD[TargetM].MonsterName[0];
											
											//DisplayM = TargetM
											//TargetM?
											//CurrentM
											//MNO
											//SetM
											//MName
										}//TargetToggle is on End
										else{
											CurrentM = 0;
											TargetM = CurrentM;//?TargetLock
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[CurrentM];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											MName = BattleM.MonsterD[CurrentM].MonsterName[0];
											
											//DisplayM = 0
											//TargetM?
											//CurrentM
											//MNO
											//SetM
											//MName
										}
									}//FocusToggle is not on End
								}//Enemy Defeated, but there are more left End
								
								ScreenType = 2;
								Ypos = 70;
								Xpos = 60;
								
								
								//Bomb: Enemy Not Defeated, and there are more
								if(((MHP1[CurrentM] != 0 || MHP2[CurrentM] != 0 || MHP3[CurrentM] != 0 || MHP4[CurrentM] != 0) && BattleM.MonsterD.length == 1) || BattleM.MonsterD.length > 1){
									BombCounter = BombCounter + 1;
									CurrentM = 1;
									MNo = BattleM.MonsterD[CurrentM].MonsterID;
									SetM(BattleM.MonsterD[CurrentM]);
									DisplayMN = CurrentM;
									DisplayM = BattleM.MonsterD[CurrentM];
									MName = BattleM.MonsterD[CurrentM].MonsterName[0];
									
									if(FocusToggle == 1){
//										//CurrentM = ;
//										MNo = BattleM.MonsterD[CurrentM].MonsterID;
//										SetM(BattleM.MonsterD[CurrentM]);
										DisplayMN = CurrentM;
										DisplayM = BattleM.MonsterD[CurrentM];
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										
										//DisplayM = Next Enemy
										//TargetM?
										//CurrentM
										//MNO
										//SetM
										//MName
									}
									else{//Else if?
										if(TargetToggle == 1){
//											CurrentM = TargetM;
//											MNo = BattleM.MonsterD[TargetM].MonsterID;
//											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = TargetM;
											DisplayM = BattleM.MonsterD[TargetM];
											MName = BattleM.MonsterD[TargetM].MonsterName[0];
											
											//DisplayM = TargetM
											//TargetM?
											//CurrentM
											//MNO
											//SetM
											//MName
										}
										else{
//											CurrentM = 0;
//											TargetM = CurrentM;
//											MNo = BattleM.MonsterD[CurrentM].MonsterID;
//											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[0];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											MName = BattleM.MonsterD[0].MonsterName[0];
											
											//DisplayM = 0
											//TargetM = 0
											//CurrentM = next one
											//MNo
											//SetM
											//MName
										}
									}//Else FocusToggle = 0
									
								}//Enemy Not Defeated, and there are more END
								
								//Bomb: Enemy Defeated
								if((MHP1[CurrentM] == 0 || MHP2[CurrentM] == 0 || MHP3[CurrentM] == 0 || MHP4[CurrentM] == 0) && BattleM.MonsterD.length == 1){
									BombCounter = 0;
								}
							}//Have Bombs to use
							}//In Battle
						}//Weapon(Bomb) End
						
						if(ItemType == 8){//Armor
//							if((Status == 2 || Status == 5) && ItemType2 == 5 && CurrentWeapon == NullItem && CurrentGuantlets != NullItem){//Trying to change guantlets if your cursed?
//								Text1 = "I'm Cursed!";
//								Text2 = "";
//							}
							if((CurrentHood == ItemSelected && ItemType2 == 0) || (CurrentHelmet == ItemSelected && ItemType2 == 1) || (CurrentRobe == ItemSelected && ItemType2 == 2) || (CurrentArmor == ItemSelected && ItemType2 == 3) || (CurrentShirt == ItemSelected && ItemType2 == 4) || (CurrentGuantlets == ItemSelected && ItemType2 == 5) || (CurrentGloves == ItemSelected && ItemType2 == 6) || (CurrentPants == ItemSelected && ItemType2 == 7) || (CurrentSocks == ItemSelected && ItemType2 == 8) || (CurrentBoots == ItemSelected && ItemType2 == 9)){
								//Switch Case?
									if(ItemType2 == 0){
										CurrentHood = NullItem;
									}
									else if(ItemType2 == 1){
										CurrentHelmet = NullItem;
									}
									else if(ItemType2 == 2){
										CurrentRobe = NullItem;
									}
									else if(ItemType2 == 3){
										CurrentArmor = NullItem;
									}
									else if(ItemType2 == 4){
										CurrentShirt = NullItem;
									}
									else if(ItemType2 == 5){
										CurrentGuantlets = NullItem;
										if(CurrentWeapon == NullItem){//Unarmed
											WeaponElement = 0;
										}
									}
									else if(ItemType2 == 6){
										CurrentGloves = NullItem;
									}
									else if(ItemType2 == 7){
										CurrentPants = NullItem;
									}
									else if(ItemType2 == 8){
										CurrentSocks = NullItem;
									}
									else if(ItemType2 == 9){
										CurrentBoots = NullItem;
									}
									
									Text1 = "Un-Equipt " + ItemName;
									Text2 = "";
									
									PlayerWeaknesses = new double[]{/*Normal*/1 + CurrentHood.Weaknesses[0] + CurrentHelmet.Weaknesses[0] + CurrentRobe.Weaknesses[0] + CurrentArmor.Weaknesses[0] + CurrentShirt.Weaknesses[0] + CurrentGuantlets.Weaknesses[0] + CurrentGloves.Weaknesses[0] + CurrentPants.Weaknesses[0] + CurrentSocks.Weaknesses[0] + CurrentBoots.Weaknesses[0], 
											/*Slime*/1 + CurrentHood.Weaknesses[1] + CurrentHelmet.Weaknesses[1] + CurrentRobe.Weaknesses[1] + CurrentArmor.Weaknesses[1] + CurrentShirt.Weaknesses[1] + CurrentGuantlets.Weaknesses[1] + CurrentGloves.Weaknesses[1] + CurrentPants.Weaknesses[1] + CurrentSocks.Weaknesses[1] + CurrentBoots.Weaknesses[1], 
											/*Ghost*/1 + CurrentHood.Weaknesses[2] + CurrentHelmet.Weaknesses[2] + CurrentRobe.Weaknesses[2] + CurrentArmor.Weaknesses[2] + CurrentShirt.Weaknesses[2] + CurrentGuantlets.Weaknesses[2] + CurrentGloves.Weaknesses[2] + CurrentPants.Weaknesses[2] + CurrentSocks.Weaknesses[2] + CurrentBoots.Weaknesses[2], 
											/*Golem*/1 + CurrentHood.Weaknesses[3] + CurrentHelmet.Weaknesses[3] + CurrentRobe.Weaknesses[3] + CurrentArmor.Weaknesses[3] + CurrentShirt.Weaknesses[3] + CurrentGuantlets.Weaknesses[3] + CurrentGloves.Weaknesses[3] + CurrentPants.Weaknesses[3] + CurrentSocks.Weaknesses[3] + CurrentBoots.Weaknesses[3], 
											/*Armor*/1 + CurrentHood.Weaknesses[4] + CurrentHelmet.Weaknesses[4] + CurrentRobe.Weaknesses[4] + CurrentArmor.Weaknesses[4] + CurrentShirt.Weaknesses[4] + CurrentGuantlets.Weaknesses[4] + CurrentGloves.Weaknesses[4] + CurrentPants.Weaknesses[4] + CurrentSocks.Weaknesses[4] + CurrentBoots.Weaknesses[4], 
											/*Other*/1 + CurrentHood.Weaknesses[5] + CurrentHelmet.Weaknesses[5] + CurrentRobe.Weaknesses[5] + CurrentArmor.Weaknesses[5] + CurrentShirt.Weaknesses[5] + CurrentGuantlets.Weaknesses[5] + CurrentGloves.Weaknesses[5] + CurrentPants.Weaknesses[5] + CurrentSocks.Weaknesses[5] + CurrentBoots.Weaknesses[5], 
											/*Glitch*/1 + CurrentHood.Weaknesses[6] + CurrentHelmet.Weaknesses[6] + CurrentRobe.Weaknesses[6] + CurrentArmor.Weaknesses[6] + CurrentShirt.Weaknesses[6] + CurrentGuantlets.Weaknesses[6] + CurrentGloves.Weaknesses[6] + CurrentPants.Weaknesses[6] + CurrentSocks.Weaknesses[6] + CurrentBoots.Weaknesses[6], 
											/*Fire*/1 + CurrentHood.Weaknesses[7] + CurrentHelmet.Weaknesses[7] + CurrentRobe.Weaknesses[7] + CurrentArmor.Weaknesses[7] + CurrentShirt.Weaknesses[7] + CurrentGuantlets.Weaknesses[7] + CurrentGloves.Weaknesses[7] + CurrentPants.Weaknesses[7] + CurrentSocks.Weaknesses[7] + CurrentBoots.Weaknesses[7], 
											/*Water*/1 + CurrentHood.Weaknesses[8] + CurrentHelmet.Weaknesses[8] + CurrentRobe.Weaknesses[8] + CurrentArmor.Weaknesses[8] + CurrentShirt.Weaknesses[8] + CurrentGuantlets.Weaknesses[8] + CurrentGloves.Weaknesses[8] + CurrentPants.Weaknesses[8] + CurrentSocks.Weaknesses[8] + CurrentBoots.Weaknesses[8], 
											/*Wind*/1 + CurrentHood.Weaknesses[9] + CurrentHelmet.Weaknesses[9] + CurrentRobe.Weaknesses[9] + CurrentArmor.Weaknesses[9] + CurrentShirt.Weaknesses[9] + CurrentGuantlets.Weaknesses[9] + CurrentGloves.Weaknesses[9] + CurrentPants.Weaknesses[9] + CurrentSocks.Weaknesses[9] + CurrentBoots.Weaknesses[9], 
											/*Earth*/1 + CurrentHood.Weaknesses[10] + CurrentHelmet.Weaknesses[10] + CurrentRobe.Weaknesses[10] + CurrentArmor.Weaknesses[10] + CurrentShirt.Weaknesses[10] + CurrentGuantlets.Weaknesses[10] + CurrentGloves.Weaknesses[10] + CurrentPants.Weaknesses[10] + CurrentSocks.Weaknesses[10] + CurrentBoots.Weaknesses[10], 
											/*Electric*/1 + CurrentHood.Weaknesses[11] + CurrentHelmet.Weaknesses[11] + CurrentRobe.Weaknesses[11] + CurrentArmor.Weaknesses[11] + CurrentShirt.Weaknesses[11] + CurrentGuantlets.Weaknesses[11] + CurrentGloves.Weaknesses[11] + CurrentPants.Weaknesses[11] + CurrentSocks.Weaknesses[11] + CurrentBoots.Weaknesses[11], 
											/*Ice*/1 + CurrentHood.Weaknesses[12] + CurrentHelmet.Weaknesses[12] + CurrentRobe.Weaknesses[12] + CurrentArmor.Weaknesses[12] + CurrentShirt.Weaknesses[12] + CurrentGuantlets.Weaknesses[12] + CurrentGloves.Weaknesses[12] + CurrentPants.Weaknesses[12] + CurrentSocks.Weaknesses[12] + CurrentBoots.Weaknesses[12], 
											/*Light*/1 + CurrentHood.Weaknesses[13] + CurrentHelmet.Weaknesses[13] + CurrentRobe.Weaknesses[13] + CurrentArmor.Weaknesses[13] + CurrentShirt.Weaknesses[13] + CurrentGuantlets.Weaknesses[13] + CurrentGloves.Weaknesses[13] + CurrentPants.Weaknesses[13] + CurrentSocks.Weaknesses[13] + CurrentBoots.Weaknesses[13], 
											/*Dark*/1 + CurrentHood.Weaknesses[14] + CurrentHelmet.Weaknesses[14] + CurrentRobe.Weaknesses[14] + CurrentArmor.Weaknesses[14] + CurrentShirt.Weaknesses[14] + CurrentGuantlets.Weaknesses[14] + CurrentGloves.Weaknesses[14] + CurrentPants.Weaknesses[14] + CurrentSocks.Weaknesses[14] + CurrentBoots.Weaknesses[14], 
											/*Glitch*/1 + CurrentHood.Weaknesses[15] + CurrentHelmet.Weaknesses[15] + CurrentRobe.Weaknesses[15] + CurrentArmor.Weaknesses[15] + CurrentShirt.Weaknesses[15] + CurrentGuantlets.Weaknesses[15] + CurrentGloves.Weaknesses[15] + CurrentPants.Weaknesses[15] + CurrentSocks.Weaknesses[15] + CurrentBoots.Weaknesses[15], 
											/*Null*/1 + CurrentHood.Weaknesses[16] + CurrentHelmet.Weaknesses[16] + CurrentRobe.Weaknesses[16] + CurrentArmor.Weaknesses[16] + CurrentShirt.Weaknesses[16] + CurrentGuantlets.Weaknesses[16] + CurrentGloves.Weaknesses[16] + CurrentPants.Weaknesses[16] + CurrentSocks.Weaknesses[16] + CurrentBoots.Weaknesses[16], 
											/*Mystery*/1 + CurrentHood.Weaknesses[17] + CurrentHelmet.Weaknesses[17] + CurrentRobe.Weaknesses[17] + CurrentArmor.Weaknesses[17] + CurrentShirt.Weaknesses[17] + CurrentGuantlets.Weaknesses[17] + CurrentGloves.Weaknesses[17] + CurrentPants.Weaknesses[17] + CurrentSocks.Weaknesses[17] + CurrentBoots.Weaknesses[17], 
											/*Corrupt*/1 + CurrentHood.Weaknesses[18] + CurrentHelmet.Weaknesses[18] + CurrentRobe.Weaknesses[18] + CurrentArmor.Weaknesses[18] + CurrentShirt.Weaknesses[18] + CurrentGuantlets.Weaknesses[18] + CurrentGloves.Weaknesses[18] + CurrentPants.Weaknesses[18] + CurrentSocks.Weaknesses[18] + CurrentBoots.Weaknesses[18], 
											/*Admin*/1 + CurrentHood.Weaknesses[19] + CurrentHelmet.Weaknesses[19] + CurrentRobe.Weaknesses[19] + CurrentArmor.Weaknesses[19] + CurrentShirt.Weaknesses[19] + CurrentGuantlets.Weaknesses[19] + CurrentGloves.Weaknesses[19] + CurrentPants.Weaknesses[19] + CurrentSocks.Weaknesses[19] + CurrentBoots.Weaknesses[19], 
											/*All*/1 + CurrentHood.Weaknesses[20] + CurrentHelmet.Weaknesses[20] + CurrentRobe.Weaknesses[20] + CurrentArmor.Weaknesses[20] + CurrentShirt.Weaknesses[20] + CurrentGuantlets.Weaknesses[20] + CurrentGloves.Weaknesses[20] + CurrentPants.Weaknesses[20] + CurrentSocks.Weaknesses[20] + CurrentBoots.Weaknesses[20]};
									Speed = LevelUpData.LoadStats(Level, Gamemode)[13] + CurrentHood.Speed + CurrentHelmet.Speed + CurrentRobe.Speed + CurrentArmor.Speed + CurrentShirt.Speed + CurrentGuantlets.Speed + CurrentGloves.Speed + CurrentPants.Speed + CurrentSocks.Speed + CurrentBoots.Speed;
									Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
									DodgeChance = CurrentHood.Dodge + CurrentHelmet.Dodge + CurrentRobe.Dodge + CurrentArmor.Dodge + CurrentShirt.Dodge + CurrentGuantlets.Dodge + CurrentGloves.Dodge + CurrentPants.Dodge + CurrentSocks.Dodge + CurrentBoots.Dodge;
									CriticalChance = CurrentHood.Critical + CurrentHelmet.Critical + CurrentRobe.Critical + CurrentArmor.Critical + CurrentShirt.Critical + CurrentGuantlets.Critical + CurrentGloves.Critical + CurrentPants.Critical + CurrentSocks.Critical + CurrentBoots.Critical;
									StatusResist = new int[]{/*Poison*/CurrentHood.StatusResist[0] + CurrentHelmet.StatusResist[0] + CurrentRobe.StatusResist[0] + CurrentArmor.StatusResist[0] + CurrentShirt.StatusResist[0] + CurrentGuantlets.StatusResist[0] + CurrentGloves.StatusResist[0] + CurrentPants.StatusResist[0] + CurrentSocks.StatusResist[0] + CurrentBoots.StatusResist[0], 
											/*Curse*/CurrentHood.StatusResist[1] + CurrentHelmet.StatusResist[1] + CurrentRobe.StatusResist[1] + CurrentArmor.StatusResist[1] + CurrentShirt.StatusResist[1] + CurrentGuantlets.StatusResist[1] + CurrentGloves.StatusResist[1] + CurrentPants.StatusResist[1] + CurrentSocks.StatusResist[1] + CurrentBoots.StatusResist[1], 
											/*Sticky*/CurrentHood.StatusResist[2] + CurrentHelmet.StatusResist[2] + CurrentRobe.StatusResist[2] + CurrentArmor.StatusResist[2] + CurrentShirt.StatusResist[2] + CurrentGuantlets.StatusResist[2] + CurrentGloves.StatusResist[2] + CurrentPants.StatusResist[2] + CurrentSocks.StatusResist[2] + CurrentBoots.StatusResist[2], 
											/*???*/CurrentHood.StatusResist[3] + CurrentHelmet.StatusResist[3] + CurrentRobe.StatusResist[3] + CurrentArmor.StatusResist[3] + CurrentShirt.StatusResist[3] + CurrentGuantlets.StatusResist[3] + CurrentGloves.StatusResist[3] + CurrentPants.StatusResist[3] + CurrentSocks.StatusResist[3] + CurrentBoots.StatusResist[3], 
											/*All*/CurrentHood.StatusResist[4] + CurrentHelmet.StatusResist[4] + CurrentRobe.StatusResist[4] + CurrentArmor.StatusResist[4] + CurrentShirt.StatusResist[4] + CurrentGuantlets.StatusResist[4] + CurrentGloves.StatusResist[4] + CurrentPants.StatusResist[4] + CurrentSocks.StatusResist[4] + CurrentBoots.StatusResist[4]};
									
									System.out.println();
									
									if(BattleToggle == 1){
										ScreenType = 2;
										Ypos = 70;
										Xpos = 60;
										if(MTurn == 0 && EquipmentTurns == 1){
											Turn = Turn + 1;
											MTurn = MTurn + 1;
										}
									}
								}//End of "if equipment is the same as the current one"
								else{//Equipment is different from current one
									if(ItemAmount == 0){//You don't actually have the armor you want to wear
										Text1 = "Out of " + ItemName;//Need more, cant use, No ItemName Left, Not enough
										Text2 = "";
									}
									else{//You actually have the armor you want to wear
										if(ItemType2 == 0){
											CurrentHood = ItemSelected;
										}
										if(ItemType2 == 1){
											CurrentHelmet = ItemSelected;
										}
										if(ItemType2 == 2){
											CurrentRobe = ItemSelected;
										}
										if(ItemType2 == 3){
											CurrentArmor = ItemSelected;
										}
										if(ItemType2 == 4){
											CurrentShirt = ItemSelected;
										}
										if(ItemType2 == 5){
											CurrentGuantlets = ItemSelected;
											if(CurrentWeapon == NullItem){//Unarmed
												WeaponElement = ItemElement;
											}
										}
										if(ItemType2 == 6){
											CurrentGloves = ItemSelected;
										}
										if(ItemType2 == 7){
											CurrentPants = ItemSelected;
										}
										if(ItemType2 == 8){
											CurrentSocks = ItemSelected;
										}
										if(ItemType2 == 9){
											CurrentBoots = ItemSelected;
										}
										
										
										PlayerWeaknesses = new double[]{/*Normal*/1 + CurrentHood.Weaknesses[0] + CurrentHelmet.Weaknesses[0] + CurrentRobe.Weaknesses[0] + CurrentArmor.Weaknesses[0] + CurrentShirt.Weaknesses[0] + CurrentGuantlets.Weaknesses[0] + CurrentGloves.Weaknesses[0] + CurrentPants.Weaknesses[0] + CurrentSocks.Weaknesses[0] + CurrentBoots.Weaknesses[0], 
												/*Slime*/1 + CurrentHood.Weaknesses[1] + CurrentHelmet.Weaknesses[1] + CurrentRobe.Weaknesses[1] + CurrentArmor.Weaknesses[1] + CurrentShirt.Weaknesses[1] + CurrentGuantlets.Weaknesses[1] + CurrentGloves.Weaknesses[1] + CurrentPants.Weaknesses[1] + CurrentSocks.Weaknesses[1] + CurrentBoots.Weaknesses[1], 
												/*Ghost*/1 + CurrentHood.Weaknesses[2] + CurrentHelmet.Weaknesses[2] + CurrentRobe.Weaknesses[2] + CurrentArmor.Weaknesses[2] + CurrentShirt.Weaknesses[2] + CurrentGuantlets.Weaknesses[2] + CurrentGloves.Weaknesses[2] + CurrentPants.Weaknesses[2] + CurrentSocks.Weaknesses[2] + CurrentBoots.Weaknesses[2], 
												/*Golem*/1 + CurrentHood.Weaknesses[3] + CurrentHelmet.Weaknesses[3] + CurrentRobe.Weaknesses[3] + CurrentArmor.Weaknesses[3] + CurrentShirt.Weaknesses[3] + CurrentGuantlets.Weaknesses[3] + CurrentGloves.Weaknesses[3] + CurrentPants.Weaknesses[3] + CurrentSocks.Weaknesses[3] + CurrentBoots.Weaknesses[3], 
												/*Armor*/1 + CurrentHood.Weaknesses[4] + CurrentHelmet.Weaknesses[4] + CurrentRobe.Weaknesses[4] + CurrentArmor.Weaknesses[4] + CurrentShirt.Weaknesses[4] + CurrentGuantlets.Weaknesses[4] + CurrentGloves.Weaknesses[4] + CurrentPants.Weaknesses[4] + CurrentSocks.Weaknesses[4] + CurrentBoots.Weaknesses[4], 
												/*Other*/1 + CurrentHood.Weaknesses[5] + CurrentHelmet.Weaknesses[5] + CurrentRobe.Weaknesses[5] + CurrentArmor.Weaknesses[5] + CurrentShirt.Weaknesses[5] + CurrentGuantlets.Weaknesses[5] + CurrentGloves.Weaknesses[5] + CurrentPants.Weaknesses[5] + CurrentSocks.Weaknesses[5] + CurrentBoots.Weaknesses[5], 
												/*Glitch*/1 + CurrentHood.Weaknesses[6] + CurrentHelmet.Weaknesses[6] + CurrentRobe.Weaknesses[6] + CurrentArmor.Weaknesses[6] + CurrentShirt.Weaknesses[6] + CurrentGuantlets.Weaknesses[6] + CurrentGloves.Weaknesses[6] + CurrentPants.Weaknesses[6] + CurrentSocks.Weaknesses[6] + CurrentBoots.Weaknesses[6], 
												/*Fire*/1 + CurrentHood.Weaknesses[7] + CurrentHelmet.Weaknesses[7] + CurrentRobe.Weaknesses[7] + CurrentArmor.Weaknesses[7] + CurrentShirt.Weaknesses[7] + CurrentGuantlets.Weaknesses[7] + CurrentGloves.Weaknesses[7] + CurrentPants.Weaknesses[7] + CurrentSocks.Weaknesses[7] + CurrentBoots.Weaknesses[7], 
												/*Water*/1 + CurrentHood.Weaknesses[8] + CurrentHelmet.Weaknesses[8] + CurrentRobe.Weaknesses[8] + CurrentArmor.Weaknesses[8] + CurrentShirt.Weaknesses[8] + CurrentGuantlets.Weaknesses[8] + CurrentGloves.Weaknesses[8] + CurrentPants.Weaknesses[8] + CurrentSocks.Weaknesses[8] + CurrentBoots.Weaknesses[8], 
												/*Wind*/1 + CurrentHood.Weaknesses[9] + CurrentHelmet.Weaknesses[9] + CurrentRobe.Weaknesses[9] + CurrentArmor.Weaknesses[9] + CurrentShirt.Weaknesses[9] + CurrentGuantlets.Weaknesses[9] + CurrentGloves.Weaknesses[9] + CurrentPants.Weaknesses[9] + CurrentSocks.Weaknesses[9] + CurrentBoots.Weaknesses[9], 
												/*Earth*/1 + CurrentHood.Weaknesses[10] + CurrentHelmet.Weaknesses[10] + CurrentRobe.Weaknesses[10] + CurrentArmor.Weaknesses[10] + CurrentShirt.Weaknesses[10] + CurrentGuantlets.Weaknesses[10] + CurrentGloves.Weaknesses[10] + CurrentPants.Weaknesses[10] + CurrentSocks.Weaknesses[10] + CurrentBoots.Weaknesses[10], 
												/*Electric*/1 + CurrentHood.Weaknesses[11] + CurrentHelmet.Weaknesses[11] + CurrentRobe.Weaknesses[11] + CurrentArmor.Weaknesses[11] + CurrentShirt.Weaknesses[11] + CurrentGuantlets.Weaknesses[11] + CurrentGloves.Weaknesses[11] + CurrentPants.Weaknesses[11] + CurrentSocks.Weaknesses[11] + CurrentBoots.Weaknesses[11], 
												/*Ice*/1 + CurrentHood.Weaknesses[12] + CurrentHelmet.Weaknesses[12] + CurrentRobe.Weaknesses[12] + CurrentArmor.Weaknesses[12] + CurrentShirt.Weaknesses[12] + CurrentGuantlets.Weaknesses[12] + CurrentGloves.Weaknesses[12] + CurrentPants.Weaknesses[12] + CurrentSocks.Weaknesses[12] + CurrentBoots.Weaknesses[12], 
												/*Light*/1 + CurrentHood.Weaknesses[13] + CurrentHelmet.Weaknesses[13] + CurrentRobe.Weaknesses[13] + CurrentArmor.Weaknesses[13] + CurrentShirt.Weaknesses[13] + CurrentGuantlets.Weaknesses[13] + CurrentGloves.Weaknesses[13] + CurrentPants.Weaknesses[13] + CurrentSocks.Weaknesses[13] + CurrentBoots.Weaknesses[13], 
												/*Dark*/1 + CurrentHood.Weaknesses[14] + CurrentHelmet.Weaknesses[14] + CurrentRobe.Weaknesses[14] + CurrentArmor.Weaknesses[14] + CurrentShirt.Weaknesses[14] + CurrentGuantlets.Weaknesses[14] + CurrentGloves.Weaknesses[14] + CurrentPants.Weaknesses[14] + CurrentSocks.Weaknesses[14] + CurrentBoots.Weaknesses[14], 
												/*Glitch*/1 + CurrentHood.Weaknesses[15] + CurrentHelmet.Weaknesses[15] + CurrentRobe.Weaknesses[15] + CurrentArmor.Weaknesses[15] + CurrentShirt.Weaknesses[15] + CurrentGuantlets.Weaknesses[15] + CurrentGloves.Weaknesses[15] + CurrentPants.Weaknesses[15] + CurrentSocks.Weaknesses[15] + CurrentBoots.Weaknesses[15], 
												/*Null*/1 + CurrentHood.Weaknesses[16] + CurrentHelmet.Weaknesses[16] + CurrentRobe.Weaknesses[16] + CurrentArmor.Weaknesses[16] + CurrentShirt.Weaknesses[16] + CurrentGuantlets.Weaknesses[16] + CurrentGloves.Weaknesses[16] + CurrentPants.Weaknesses[16] + CurrentSocks.Weaknesses[16] + CurrentBoots.Weaknesses[16], 
												/*Mystery*/1 + CurrentHood.Weaknesses[17] + CurrentHelmet.Weaknesses[17] + CurrentRobe.Weaknesses[17] + CurrentArmor.Weaknesses[17] + CurrentShirt.Weaknesses[17] + CurrentGuantlets.Weaknesses[17] + CurrentGloves.Weaknesses[17] + CurrentPants.Weaknesses[17] + CurrentSocks.Weaknesses[17] + CurrentBoots.Weaknesses[17], 
												/*Corrupt*/1 + CurrentHood.Weaknesses[18] + CurrentHelmet.Weaknesses[18] + CurrentRobe.Weaknesses[18] + CurrentArmor.Weaknesses[18] + CurrentShirt.Weaknesses[18] + CurrentGuantlets.Weaknesses[18] + CurrentGloves.Weaknesses[18] + CurrentPants.Weaknesses[18] + CurrentSocks.Weaknesses[18] + CurrentBoots.Weaknesses[18], 
												/*Admin*/1 + CurrentHood.Weaknesses[19] + CurrentHelmet.Weaknesses[19] + CurrentRobe.Weaknesses[19] + CurrentArmor.Weaknesses[19] + CurrentShirt.Weaknesses[19] + CurrentGuantlets.Weaknesses[19] + CurrentGloves.Weaknesses[19] + CurrentPants.Weaknesses[19] + CurrentSocks.Weaknesses[19] + CurrentBoots.Weaknesses[19], 
												/*All*/1 + CurrentHood.Weaknesses[20] + CurrentHelmet.Weaknesses[20] + CurrentRobe.Weaknesses[20] + CurrentArmor.Weaknesses[20] + CurrentShirt.Weaknesses[20] + CurrentGuantlets.Weaknesses[20] + CurrentGloves.Weaknesses[20] + CurrentPants.Weaknesses[20] + CurrentSocks.Weaknesses[20] + CurrentBoots.Weaknesses[20]};
										Speed = LevelUpData.LoadStats(Level, Gamemode)[13] + CurrentHood.Speed + CurrentHelmet.Speed + CurrentRobe.Speed + CurrentArmor.Speed + CurrentShirt.Speed + CurrentGuantlets.Speed + CurrentGloves.Speed + CurrentPants.Speed + CurrentSocks.Speed + CurrentBoots.Speed;
										Luck = LevelUpData.LoadStats(Level, Gamemode)[14] + CurrentHood.Luck + CurrentHelmet.Luck + CurrentRobe.Luck + CurrentArmor.Luck + CurrentShirt.Luck + CurrentGuantlets.Luck + CurrentGloves.Luck + CurrentPants.Luck + CurrentSocks.Luck + CurrentBoots.Luck;
										DodgeChance = CurrentHood.Dodge + CurrentHelmet.Dodge + CurrentRobe.Dodge + CurrentArmor.Dodge + CurrentShirt.Dodge + CurrentGuantlets.Dodge + CurrentGloves.Dodge + CurrentPants.Dodge + CurrentSocks.Dodge + CurrentBoots.Dodge;
										CriticalChance = CurrentHood.Critical + CurrentHelmet.Critical + CurrentRobe.Critical + CurrentArmor.Critical + CurrentShirt.Critical + CurrentGuantlets.Critical + CurrentGloves.Critical + CurrentPants.Critical + CurrentSocks.Critical + CurrentBoots.Critical;
										
										Text1 = "Equipt " + ItemName;
										Text2 = "";
										
										if(BattleToggle == 1){
											ScreenType = 2;
											Ypos = 70;
											Xpos = 60;
											if(MTurn == 0 && EquipmentTurns == 1){
												Turn = Turn + 1;
												MTurn = MTurn + 1;
											}
										}
									}//End of Actually have that piece of Armor you can wear
								}//End of If armor is different from current armor
								
						}//End of Itemtype = 8 Armor
						
						if(ItemType == 9){//KeyItem
							//if(){Can use KeyItem?)
								//By Area or by Item, Item that can start an event???
							//Else
								Text1 = "Cannot use this Item";
								Text2 = "";
							//}
						}
					    
						//TODO Attack1 TargetToggle and Focustoggle
						if(ItemType == 10){//Attack 1 Item
							if(BattleToggle == 0){//Not in battle
								Text1 = "Cannot use this Item";
								Text2 = "";
							}//Not in Battle End
							if(BattleToggle == 1){//In Battle
								if(ItemAmount == 0){//No Attack Items left
									Text1 = "Out of " + ItemName;//Need more, cant use, No ItemName Left, Not enough
									Text2 = "";
								}
								if(ItemAmount != 0){//Have some Attack Items
									ItemAmount = ItemAmount - 1;
									ItemAmount1[ItemNo] = ItemAmount1[ItemNo] - 1;
									int i1 = 0;
									int i2 = 0;
									while(i1 < Item1Found.length){//ItemAmountUsed/Update
										if(Item1Found[i1] == 1){
											ItemAmount2[i2] = ItemAmount1[i1];
											i2 = i2 + 1;
										}
										i1 = i1 + 1;
									}//Item Amount Used/Update End
									
									CDmg1 = MDmg1;
									CDmg2 = MDmg2;
									CDmg3 = MDmg3;
									CDmg4 = MDmg4;
									
									if(ItemType2 != 1){//Attack Item Does not do Pierce Damage
										int[] NewDamage = BattleCalculations.CalculateDmg(CDmg1, CDmg2, CDmg3, CDmg4, 6, ItemElement, BattleM.MonsterD[CurrentM].MDef1, BattleM.MonsterD[CurrentM].MDef2, BattleM.MonsterD[CurrentM].MDef3, BattleM.MonsterD[CurrentM].MDef4, BattleM.MonsterD[CurrentM].Weakness, BattleM.MonsterD[CurrentM].WeaknessType, 0);
										CDmg1 = NewDamage[0];
										CDmg2 = NewDamage[1];
										CDmg3 = NewDamage[2];
										CDmg4 = NewDamage[3];
									}
									
									//Did positive Attack1 Item damage
									if((CDmg1 > 0 || CDmg2 > 0 || CDmg3 > 0 || CDmg4 > 0) || (CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0 && CDmg4 == 0)){
										
										DamageEnemy();
										
										//TODO Maybe using an item with a certain element will cause normal damage instead of checking to see if the HP is glitched?
										int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[CurrentM], MHP2[CurrentM], MHP3[CurrentM], MHP4[CurrentM], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[CurrentM].MHpMax);
										MHP1[CurrentM] = MHP[0];
										MHP2[CurrentM] = MHP[1];
										MHP3[CurrentM] = MHP[2];
										MHP4[CurrentM] = MHP[3];
										
										CDmg1 = 0;
										CDmg2 = 0;
										CDmg3 = 0;
										CDmg4 = 0;
									}//Positive Attack1 Item Damage End
									
									//Recover HP Attack1 Item Damage //Negative damage?
									if(CDmg1 < 0 || CDmg2 < 0 || CDmg3 < 0 || CDmg4 < 0){
										
										EnemyRecover(0);
										
										int[] RHpM = BattleCalculations.RecoverHp(MHP1[CurrentM], MHP2[CurrentM], MHP3[CurrentM], MHP4[CurrentM], MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp1, MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp2, MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp3, MonsterData.MData(BattleM.MonsterD[CurrentM].MonsterID, Gamemode).MHp4, CDmg1, CDmg2, CDmg3, CDmg4);{
											MHP1[CurrentM] = RHpM[0];
											MHP2[CurrentM] = RHpM[1];
											MHP3[CurrentM] = RHpM[2];
											MHP4[CurrentM] = RHpM[3];
										}
										
										CDmg1 = 0;
										CDmg2 = 0;
										CDmg3 = 0;
										CDmg4 = 0;
									}////Recover HP Attack1 Item Damage End
									
									//Enemy not defeated
									if(MHP1[CurrentM] != 0 || MHP2[CurrentM] != 0 || MHP3[CurrentM] != 0 || MHP4[CurrentM] != 0){
										ScreenType = 2;
										Ypos = 70;
										Xpos = 60;
										if(MTurn == 0 && ItemTurns == 1){
											Turn = Turn + 1;
											MTurn = MTurn + 1;
										}
										
									}//Enemy Not defeated by Attack1 Item End
									
									//Enemy Defeated, but there are more left
									if(MHP1[CurrentM] == 0 && MHP2[CurrentM] == 0 && MHP3[CurrentM] == 0 && MHP4[CurrentM] == 0 && BattleM.MonsterD.length > 1){
										UpdateBattle(CurrentM);
										DisplayMN = CurrentM;
										DisplayM = BattleM.MonsterD[CurrentM];
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										
									}
									
									if(FocusToggle == 1){
										CurrentM = 0;
										//TargetM No Change
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]);
										DisplayMN = CurrentM;
										DisplayM = BattleM.MonsterD[CurrentM];
										DisplayM.MHp1 = MHP1[CurrentM];
										DisplayM.MHp2 = MHP2[CurrentM];
										DisplayM.MHp3 = MHP3[CurrentM];
										DisplayM.MHp4 = MHP4[CurrentM];
										MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										
										//DisplayM = 0;
										//TargetM No Change
										//MNO  X
										//SetM  X
										//MName = BattleM.MonsterD[CurrentM].MonsterName
									}
									else{
										if(TargetToggle == 1){
											CurrentM = 0;
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = TargetM;
											DisplayM = BattleM.MonsterD[TargetM];
											DisplayM.MHp1 = MHP1[TargetM];
											DisplayM.MHp2 = MHP2[TargetM];
											DisplayM.MHp3 = MHP3[TargetM];
											DisplayM.MHp4 = MHP4[TargetM];
											MName = BattleM.MonsterD[TargetM].MonsterName[0];
											
											//DisplayM = TargetM
											//TargetM?
											//MNO
											//SetM
											//MName
										}
										else{
											CurrentM = 0;
											TargetM = CurrentM;//?TargetLock
											MNo = BattleM.MonsterD[CurrentM].MonsterID;
											SetM(BattleM.MonsterD[CurrentM]);
											DisplayMN = 0;
											DisplayM = BattleM.MonsterD[CurrentM];
											DisplayM.MHp1 = MHP1[0];
											DisplayM.MHp2 = MHP2[0];
											DisplayM.MHp3 = MHP3[0];
											DisplayM.MHp4 = MHP4[0];
											MName = BattleM.MonsterD[CurrentM].MonsterName[0];
										}
									}//If FocusToggle is not on End
									
									ScreenType = 2;
									Ypos = 70;
									Xpos = 60;
									
									
								}//Have Some Attack Items End
							}//if In Battle End
						} //Attack 1 Item End ItemType = 10
						
						//TODO ItemType11 What about not in battle?
						if(ItemType == 11){//Attack All Item
							if(BattleToggle == 0){//Not in battle
								Text1 = "Cannot use this Item";
								Text2 = "";
							}//Not in Battle End
							if(BattleToggle == 1){//In Battle
								if(ItemAmount == 0){//No Attack All Items left
									Text1 = "Out of " + ItemName;//Need more, cant use, No ItemName Left, Not enough
									Text2 = "";
								}
								if(ItemAmount != 0){//Have some Attack All Items
									ItemAmount = ItemAmount - 1;
									ItemAmount1[ItemNo] = ItemAmount1[ItemNo] - 1;
									int i1 = 0;
									int i2 = 0;
									while(i1 < Item1Found.length){//ItemAmountUsed/Update
										if(Item1Found[i1] == 1){
											ItemAmount2[i2] = ItemAmount1[i1];
											i2 = i2 + 1;
										}
										i1 = i1 + 1;
									}//Item Amount Used/Update End
									
									if(ItemType2 != 1){//Attack Item Does not do Pierce Damage
										//Bomb Damage
										int[] NewDamage = BattleCalculations.CalculateDmg(MDmg1, MDmg2, MDmg3, MDmg4, 6, ItemElement, CDef1, CDef2, CDef3, CDef4, PlayerWeaknesses, PlayerWeaknessTypes, 0);
										MDmg1 = NewDamage[0];
										MDmg2 = NewDamage[1];
										MDmg3 = NewDamage[2];
										MDmg4 = NewDamage[3];
									}
									
									if(MDmg1 <= 0 && MDmg2 <= 0 && MDmg3 <= 0 && MDmg4 <= 0){//MDmg1 !> 0?
										//Calculate Recover w Defence?
										
										RecoverHealth();
										
										int[] RHp = BattleCalculations.RecoverHp(CHP1, CHP2, CHP3, CHP4, CHP1Max, CHP2Max, CHP3Max, CHP4Max, MDmg1, MDmg2, MDmg3, MDmg4);{
											CHP1 = RHp[0];
											CHP2 = RHp[1];
											CHP3 = RHp[2];
											CHP4 = RHp[3];
										}
												
										//Lose Negative HP?
										if(CHP4 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
											Defeated(0);
										}
										//MDmg1 = 0;
										//MDmg2 = 0;
										//MDmg3 = 0;
										//MDmg4 = 0;
									}//End of if AttackAll Item used Recovers health
										
									if(MDmg1 > 0 || MDmg2 > 0 || MDmg3 > 0 || MDmg4 > 0){
										//Calculate Damage Regular HP?
											
										//Calculate Damage Theory Regular HP
										//HP1 HP2 HP3 HP4
										//Atk1 Atk2 Atk3 Atk4
										//Def1 Def2 Def3 Def4
											
										TookDamage(1);//Message
											
										//Calculate Damage Received Regular HP
										int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
										CHP1 = CHP[0];
										CHP2 = CHP[1];
										CHP3 = CHP[2];
										CHP4 = CHP[3];
											
										//if(CHP4 >= MDmg4){ //no damage?
											
										//Lose
										if(CHP4 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
											Defeated(0);
										}
											
										//MDmg1 = 0;
										//MDmg2 = 0;
										//MDmg3 = 0;
										//MDmg4 = 0;
									}//End of if Attackall Item used causes damage
										
									//Still Have HP and Next Turn FocusToggle and TargetToggle
									if(CHP1 != 0 || CHP2 !=0 || CHP3 !=0 || CHP4 !=0){
										ScreenType = 2;
										Ypos = 70;
										Xpos = 60;
										BombCounter = 2;//BombCounter = BombCounter - 1;
										CurrentM = 0;
										TargetM = 0;
										MNo = BattleM.MonsterD[CurrentM].MonsterID;
										SetM(BattleM.MonsterD[CurrentM]);
									}//Still Have HP End
									
									//If defeated youself?
									if(CHP1 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
										Defeated(0);
									}//If defeated yourself End
									
								}//Have some to use
							}//In Battle
						}//ItemType11 Attack all End
						
					}//if ItemToggle == 1
					ItemToggle = 0;
				}//Ypos == 30
				
				//If All Enemies Defeated by items
				if(BattleToggle == 1 && MHP4[CurrentM] == 0 && MHP3[CurrentM] == 0 && MHP2[CurrentM] == 0 && MHP1[CurrentM] == 0 && DefeatToggle == 1 && BombCounter == 0 && BattleM.MonsterD.length <= 1){//may reorder
					EnemyDefeatedBattle();
				}//Enemy Defeated Checker End
				
				//Item Screen: Back
				if(Ypos == 190){
					//Navigation Screen
					if(BattleToggle == 0){
						if(Gamemode != 0 || Gamemode != 6) {
							Text1 = "";
							Text2 = "";
						}
						ScreenType = 1;
						Ypos = 70;
						Xpos = 60;
					}
					
					//Battle Screen
					if(BattleToggle == 1){
						if(Gamemode != 0 || Gamemode != 6) {
							Text1 = "";
							Text2 = "";
						}
						ScreenType = 2;
						Ypos = 70;
						Xpos = 60;
					}
				}
			}//Item Screen Enter End
			
			
			//Notes Screen Enter
			else if(ScreenType == 5 && NoteToggle == 1){
				//Notes Screen: Note
				if(Xpos == 30){
					if(Ypos == 30){ //Note1
						Note1Text = Note1.getNoteDisc();
						Note2Text = Note1.getNoteDisc2();
					}
					//Note Selected
					if(Ypos == 60){ //Note2
						Note1Text = Note2.getNoteDisc();
						Note2Text = Note2.getNoteDisc2();
					}
					
					if(Ypos == 90){ //Note3
						Note1Text = Note3.getNoteDisc();
						Note2Text = Note3.getNoteDisc2();
					}
					
					if(Ypos == 120){ //Note4
						Note1Text = Note4.getNoteDisc();
						Note2Text = Note4.getNoteDisc2();
					}
					
					if(Ypos == 150){ //Note5
						Note1Text = Note5.getNoteDisc();
						Note2Text = Note5.getNoteDisc2();
					}
				}//Notes1-5 End
				//
				if(Xpos == 120){
					if(Ypos == 30){ //Note6
						Note1Text = Note6.getNoteDisc();
						Note2Text = Note6.getNoteDisc2();
					}
					
					if(Ypos == 60){ //Note7
						Note1Text = Note7.getNoteDisc();
						Note2Text = Note7.getNoteDisc2();
					}

					if(Ypos == 90){ //Note8
						Note1Text = Note8.getNoteDisc();
						Note2Text = Note8.getNoteDisc2();
					}

					if(Ypos == 120){ //Note9
						Note1Text = Note9.getNoteDisc();
						Note2Text = Note9.getNoteDisc2();
					}

					if(Ypos == 150){ //Note10
						Note1Text = Note10.getNoteDisc();
						Note2Text = Note10.getNoteDisc2();
					}
				}//Notes 6-10 End
				if(Ypos != 190){
					ScreenType = 6;
					NoteToggle = 0;
				}
				
				//Back1
				if(Ypos == 190 && Xpos == 5 && NotesFound != 0){
					if(NotePage <= 1){
					//Navigation Screen
					if(BattleToggle == 0 && CurrentArea.AreaNo != 2){//Not in Elder's Office
						Note1Text = "No Note";
						ScreenType = 1;
						Ypos = 70;
						Xpos = 60;
					}
					
					//Battle Screen
					if(BattleToggle == 1 && CurrentArea.AreaNo != 2){//Not in Elder's Office
						ScreenType = 2;
						Ypos = 70;
						Xpos = 60;
					}
					//Elder Screen
					if(BattleToggle == 0 && CurrentArea.AreaNo == 2){//Elder's Office
						ScreenType = 11;
						Ypos = 70;
						Xpos = 60;
					}
					//???
					//if(BattleToggle == 1 && ElderToggle == 1){//This may actually be important/useful
					//	ScreenType = ??;
					//	Ypos = ??;
					//	Xpos = ??;
					//}
					}
					if(NotePage > 1){
						NotePage = NotePage - 1;
						Note1 = NullNote;//"TestNote1";
						Note2 = NullNote;
						Note3 = NullNote;
						Note4 = NullNote;
						Note5 = NullNote;
						Note6 = NullNote;
						Note7 = NullNote;
						Note8 = NullNote;
						Note9 = NullNote;
						Note10 = NullNote;
						NotesFound = Notes.NoteTotal(Note1Found); //total
						Notes[] NoteList = Notes.NoteBook(Note1Found);
						if(NotesFound >= ((NotePage - 1)*10) + 1){
							Note1 = NoteList[(NotePage - 1)*10];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 2){
							Note2 = NoteList[((NotePage - 1)*10) + 1];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 3){
							Note3 = NoteList[((NotePage - 1)*10) + 2];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 4){
							Note4 = NoteList[((NotePage - 1)*10) + 3];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 5){
							Note5 = NoteList[((NotePage - 1)*10) + 4];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 6){
							Note6 = NoteList[((NotePage - 1)*10) + 5];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 7){
							Note7 = NoteList[((NotePage - 1)*10) + 6];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 8){
							Note8 = NoteList[((NotePage - 1)*10) + 7];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 9){
							Note9 = NoteList[((NotePage - 1)*10) + 8];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 10){
							Note10 = NoteList[((NotePage - 1)*10) + 9];
						}
					}
				}
				//Back2/Next
				if(Ypos == 190 && Xpos == 140){
					if(NotesFound <= (NotePage*10)){
					//Navigation Screen
					if(BattleToggle == 0 && CurrentArea.AreaNo != 2){
						Note1Text = "No Note";
						ScreenType = 1;
						Ypos = 70;
						Xpos = 60;
					}
					
					//Battle Screen
					if(BattleToggle == 1 && CurrentArea.AreaNo != 2){//Not Elder Screen
						ScreenType = 2;
						Ypos = 70;
						Xpos = 60;
					}
					//Elder Screen
					if(BattleToggle == 0 && CurrentArea.AreaNo == 2){//Elder Screen
						ScreenType = 11;
						Ypos = 70;
						Xpos = 60;
					}
					//???
					//if(BattleToggle == 1 && ElderToggle == 1){
					//	ScreenType = ??;
					//	Ypos = ??;
					//	Xpos = ??;
					//}
					}
					if(NotesFound > (NotePage*10)){
						NotePage = NotePage + 1;
						Note1 = NullNote;//"TestNote1";
						Note2 = NullNote;
						Note3 = NullNote;
						Note4 = NullNote;
						Note5 = NullNote;
						Note6 = NullNote;
						Note7 = NullNote;
						Note8 = NullNote;
						Note9 = NullNote;
						Note10 = NullNote;
						NotesFound = Notes.NoteTotal(Note1Found); //total
						Notes[] NoteList = Notes.NoteBook(Note1Found);
						if(NotesFound >= ((NotePage - 1)*10) + 1){
							Note1 = NoteList[((NotePage - 1)*10)];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 2){
							Note2 = NoteList[((NotePage - 1)*10) + 1];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 3){
							Note3 = NoteList[((NotePage - 1)*10) + 2];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 4){
							Note4 = NoteList[((NotePage - 1)*10) + 3];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 5){
							Note5 = NoteList[((NotePage - 1)*10) + 4];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 6){
							Note6 = NoteList[((NotePage - 1)*10) + 5];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 7){
							Note7 = NoteList[((NotePage - 1)*10) + 6];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 8){
							Note8 = NoteList[((NotePage - 1)*10) + 7];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 9){
							Note9 = NoteList[((NotePage - 1)*10) + 8];
						}
						if(NotesFound >= ((NotePage - 1)*10) + 10){
							Note10 = NoteList[((NotePage - 1)*10) + 9];
						}
					}
				}
			}//Note Screen Enter End
			
			
			//Notes2 Screen Enter
			else if(ScreenType == 6){
				ScreenType = 5;
			}
			
			
			//Move Screen Enter
			else if(ScreenType == 7 && MoveToggle == 1){
				//Move

				if(Ypos == 30){
					CurrentArea = Area1;
				}
				
				if(Ypos == 45){
					CurrentArea = Area2;
				}
				
				if(Ypos == 60){
					CurrentArea = Area3;
				}
				
				if(Ypos == 75){
					CurrentArea = Area4;
				}
				
				if(Ypos == 90){
					CurrentArea = Area5;
				}
				
				if(Ypos == 105){
					CurrentArea = Area6;
				}
				
				if(Ypos == 120){
					CurrentArea = Area7;
				}
				
				if(Ypos == 135){
					CurrentArea = Area8;
				}
				
				if(Ypos == 150){
					CurrentArea = Area9;
				}
				
				if(Ypos == 165){
					CurrentArea = Area10;
				}
				
				if(Ypos != 190){
					AreaNumber = CurrentArea.AreaNo;
					AreaName = CurrentArea.AreaName;
					ScreenType = CurrentArea.getScreenType();
					Ypos = CurrentArea.Ypos;
					Xpos = CurrentArea.Xpos;
					ScreenMode = CurrentArea.ScreenMode;
					if(Gamemode == 0){
						Text1 = CurrentArea.RandomText[0];
						Text2 = CurrentArea.RandomText[1];
						HiddenText1 = CurrentArea.RandomText[3];
						HiddenText2 = CurrentArea.RandomText[4];
					}
					MoveToggle = 0;
					ElderToggle = 0;
					
					UpdateAreas();
					AreaPlacement = 0;

					//Entering Area Cutscene Event
					int I = 0;
					while(I < CurrentArea.EnterCutscene.length){
					//for(int i = 0, i < CurrentArea.EnterCutscene[0].length, i++){
						if(CurrentArea.EnterCutscene[I][1] != 0 && MainClass.SEventFlag[CurrentArea.EnterCutscene[I][0]] == 1){//If it has a cutscene && StoryFlag = ???
							CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentArea.EnterCutscene[I][1]);
							LoadCutscene(CurrentCutscene);
							I = CurrentArea.EnterCutscene.length + 1;
						}
						I = I + 1;
					}
				}//LoadArea End
				
				//Move Screen: Back
				if(Ypos == 190){
				//Navigation Screen
					AreaNumber = CurrentArea.getAreaNo();
					AreaName = CurrentArea.getAreaName();
					ScreenType = CurrentArea.getScreenType();
					Ypos = CurrentArea.Ypos;
					Xpos = CurrentArea.Xpos;
					//CurrentArea = Area10;
					ScreenMode = CurrentArea.ScreenMode;
					if(Gamemode == 0){
						Text1 = CurrentArea.RandomText[0];
						Text2 = CurrentArea.RandomText[1];
					}
					//MoveToggle = 0;
					ElderToggle = 0;
				}
				//Inventor Screen
				if(ScreenType == 14 && MonstersFound != 0){
					Ypos = 30;
					Xpos = 15;//30
				}
				if(ScreenType == 14 && MonstersFound == 0){
					Ypos = 190;
					Xpos = 140;
				}
				
				if(ScreenType == 4 && ItemsFound != 0){//Cookscreen, Has an Item
					Ypos = 30;
					Xpos = 5;
					Text1X = 30;//80
					Text2X = 30;
					Price = 0;
					CookItem1 = NullItem;
					CookItem2 = NullItem;
					CookItem3 = NullCook;
					CurrentItem = Item1; //Glitch Mode, this doesn't always work?
					Price = 0;
					Text1 = Item1.ItemDisc;
					//Text2 = "";
					ItemSortMode = 0;
				}
				if(ScreenType == 4 && ItemsFound == 0){//CookScreen, Has no items yet
					Ypos = 190;
					Xpos = 140;
					Text1X = 80;
					Text2X = 80;
					CookItem1 = NullItem;
					CookItem2 = NullItem;
					CookItem3 = NullCook;
					Price = 0;
					//Text1 = "";
					//Text2 = "";
					ItemSortMode = 0;
					
					if(ScreenType == 0){
						Ypos = 190;
						Xpos = 7;
					}
					
				}
				
				if(ScreenType != 4){
					Text2X = 30;
					Text2X = 30;
				}
				
				if(ScreenType == 13 && EventSaleTotal != 0){
					Ypos = 30;
					Xpos = 30;
					CurrentItemS = ItemS1;
					Text1 = ItemS1.getItemDisc();
				}
				if(ScreenType == 13 && EventSaleTotal == 0){
					Ypos = 190;
					Xpos = 140;
					Text1 = "";
					Text2 = "";
				}
			}//Move Screen Enter End
			
			//Cook Screen Enter
			else if(ScreenType == 4 && CookToggle == 1){
				//Cook Food
				//Items CookItem = NullItem;
				//cooking two of the same?
				//ItemAmountC1
				//ItemAmountC2
				//Select Item
				
				if(Ypos == 30){//Items CookItem
					ItemAmount = ItemAmount1[Item1.getItemNo() - 1];
					CookItem = Item1;
					CookItemToggle = 1;
				}
				if(Ypos == 45){
					ItemAmount = ItemAmount1[Item2.getItemNo() - 1];
					CookItem = Item2;
					CookItemToggle = 1;
				}
				if(Ypos == 60){
					ItemAmount = ItemAmount1[Item3.getItemNo() - 1];
					CookItem = Item3;
					CookItemToggle = 1;
				}
				if(Ypos == 75){
					ItemAmount = ItemAmount1[Item4.getItemNo() - 1];
					CookItem = Item4;
					CookItemToggle = 1;
				}
				if(Ypos == 90){
					ItemAmount = ItemAmount1[Item5.getItemNo() - 1];
					CookItem = Item5;
					CookItemToggle = 1;
				}
				if(Ypos == 105){
					ItemAmount = ItemAmount1[Item6.getItemNo() - 1];
					CookItem = Item6;
					CookItemToggle = 1;
				}
				if(Ypos == 120){
					ItemAmount = ItemAmount1[Item7.getItemNo() - 1];
					CookItem = Item7;
					CookItemToggle = 1;
				}
					
				if(CookItemToggle == 1){
					if(ItemAmount == 0){ //<0?
						Text1X = 70;
						Text1 = "Not enough to cook";
						Text2 = "";
						CookToggle = 0;
					}
					if(ItemAmount > 0){
						if(CookItem1 != NullItem && CookItem2 != NullItem){
							Text1X = 70;
							Text1 = "Not enough to cook";
							Text2 = "";
						}
						if(CookItem1 != NullItem && CookItem2 == NullItem && CookItem2 != CookItem1){
							CookItem2 = CookItem;
							CookToggle = 0;
							//MDmg1 = Item1.getMDmg1();//glitch item values?
						}
						if(CookItem1 != NullItem && CookItem2 == NullItem && CookItem2 == CookItem1){
							if(ItemAmount >= 2){
								CookItem2 = CookItem;
								//MDmg1 = Item1.getMDmg1();//glitch item values?
							}
							if(ItemAmount < 2){
								Text1X = 70;
								Text1 = "Not enough to cook";
								Text2 = "";
								CookToggle = 0;
							}
						}
						if(CookItem1 == NullItem && CookItem2 == NullItem){
							CookItem1 = CookItem;
						}
						//CookedItem = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo);
						CookItem3 = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo, CookRecipe, CookMade);//Cook.CookedItem(CookedItem.getCookedItemNo());
						//System.out.println("Item: " + CookItem3.getItemName());
						Price = CookedItem.getPrice();
						CookToggle = 0;
					}
					CookItemToggle = 0;
				}
				//Item1
				//Item2
				//CookToggle = 0;?
				
				//Cook Screen: Cook
				if(Ypos == 95 && Xpos == 75){ //CookItem1 == NullItem && CookItem2 != NullItem?
					if(CookItem1 == NullItem && CookItem2 == NullItem){
						CookToggle = 0;
						Text1 = "Need to select an Item first";
						Text2 = "";
					}
					if(CookItem1 != NullItem || CookItem2 != NullItem){
						if(CookItem3.CookedItem == -1){
							CookToggle = 0;
							Text1 = "I cannot cook that";
							Text2 = "";
						}
						
						if(CookItem3.CookedItem != -1){
							if(CookItem1 != NullItem && CookItem2 != NullItem){
								if(ItemAmount1[CookItem1.getItemNo() - 1] < 1 || ItemAmount1[CookItem2.getItemNo() - 1] < 1){
									CookToggle = 0;
									Text1 = "Not enough to cook";
									Text2 = "";
								}
							}
							else if(CookItem1 != NullItem && CookItem2 == NullItem){
								if(ItemAmount1[CookItem1.getItemNo() - 1] < 1){
									CookToggle = 0;
									Text1 = "Not enough to cook";
									Text2 = "";
								}
							}

//							if((ItemAmount1[CookItem1.getItemNo() - 1] >=1 && ItemAmount1[CookItem2.getItemNo() - 1] >= 1 &&
//									CookItem1 != NullItem && CookItem2 != NullItem)|| 
//								(ItemAmount1[CookItem1.getItemNo() - 1] >=1 && CookItem1 != NullItem && CookItem2 == NullItem)){
							if(CookToggle != 0){//You have enough Items to cook
								
						if(Money < Price){
							CookToggle = 0;
							Text1 = "Not enough Money";
							Text2 = "";
						}
						if(Money >= Price){
							Money = Money - Price;
							Item1Found[Cook.CookedItem(CookItem3.CookedItem).CookedItem - 1] = 1;
						
						UpdateItem(ItemPlacement, 0);
						//Use up CookItem1
						ItemAmount1[Items.ItemNo(Item1Found, CookItem1.getItemNo())] = 
								ItemAmount1[CookItem1.getItemNo() - 1] - 1;
						//Use Up CookItem2
						if(CookItem2 != NullItem){
							ItemAmount1[Items.ItemNo(Item1Found, CookItem2.getItemNo())] = 
									ItemAmount1[CookItem2.getItemNo() - 1] - 1;
						}
						if(CookItem3.CookedItem != -2){
							ItemAmount1[CookItem3.CookedItem - 1] = ItemAmount1[CookItem3.CookedItem - 1] + 1;
						}

						int i1 = 0;
						int i2 = 0;
						while(i1 < Item1Found.length){
						if(Item1Found[i1] == 1){
							ItemAmount2[i2] = ItemAmount1[i1];
							i2 = i2 + 1;
						}
						i1 = i1 + 1;
						}
						ItemsFound = Items.ItemTotal(Item1Found);
						UpdateItem(ItemPlacement, 0);
						CookToggle = 0;
						if(CookItem3.CookedItem != -2){
							RecipeNo = Cook.CookRecipeNo(CookItem1.ItemNo,CookItem2.ItemNo);
							CookMade[RecipeNo - 1] = 1;
							CookItem3 = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo, CookRecipe, CookMade);
//							Text1 = "Obtained " + CookItem3.ItemName;
//							Text2 = "";
							
							CurrentCutscene = TalkTextCutscene.CutsceneList(CookItem3.CutsceneEvent);
							LoadCutscene(CurrentCutscene);
							
							//Text1X??
							
							TopicToggle = 0;//????????????????????????????????????????
							
						}
						if(CookItem3.CookedItem == -2){
							Text1 = "Sorry, it didn't work";
							Text2 = "";
						}
					}
						}
					}
					}//If Selected an Item to Cook End
				}//Cook Screen: Cook End
				
				//Cook Screen: Reselect
				if(Ypos == 95 && Xpos == 125){
					if(CookItem1 == NullItem && CookItem2 == NullItem){
						Text1 = "Nothing Selected";
						Text2 = "";
						//CookedItem = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo);
						CookItem3 = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo, CookRecipe, CookMade);//Cook.CookedItem(CookedItem.getCookedItemNo());
					}
					if(CookItem1 != NullItem && CookItem2 == NullItem){
						CookItem1 = NullItem;
						//CookedItem = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo);
						CookItem3 = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo, CookRecipe, CookMade);//Cook.CookedItem(CookedItem.getCookedItemNo());
					}
					if(CookItem1 != NullItem && CookItem2 != NullItem){
						CookItem2 = NullItem;
						//CookedItem = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo);
						CookItem3 = Cook.CookItems(CookItem1.ItemNo, CookItem2.ItemNo, CookRecipe, CookMade);//Cook.CookedItem(CookedItem.getCookedItemNo());
					}
					CookToggle = 0;
				}
				
				//Cook Screen: Leave
				if(Ypos == 190){
					//Navigation Screen
						//AreaNumber = 1;
						ScreenType = 7;
						Ypos = 30;
						Xpos = 30;
				}
			}//Cook Screen Enter End
			
			//Password Screen Enter TODO Password Screen Enter
			//Enter Password
			//New Game
			if(ScreenType == 0 && PasswordToggle == 1){
				//Back
				if(Xpos == 7 && Ypos == 165){//Back to move screen
					ScreenType = 7;
					Ypos = 30;
					Xpos = 30;
				}//Password Screen Enter Back end
				//Load
				else if(Xpos == 7 && Ypos == 190){//Load Currently Save Password
					//LoadPassword();
					//LoadFromPassword(Password);
					LoadGamefromPassword();
					//Area, X Y
				}//password Screen Enter Load End
				//Password
				else if(Xpos == 55 && Ypos == 190){
					
				}//Password Screen Enter Password End
				//New Game
				else if(Xpos == 130 && Ypos == 190){
					//Starts A
					//Set's Password to Newgame Conditions
					//Loads Password
					//LoadFromPassword(Passwords.NewGame(Gamemode));
					//AreaPlacement = 0;
					//UpdateAreas();
					NewishGame();
				}//Password Screen New Game Enter
			}//Password Screen Enter End
			
			//Action Screen Enter
			//Next
			else if(ScreenType == 8){
				
			}
			
			
			//Inventor Screen Enter
			else if(ScreenType == 14 && InventorToggle == 1){
				//Select Monster
				if(Ypos == 30){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = BattleData.GetBattleData(Inv1.BattleNo).MonsterD[0].MonsterID;
					BattleM = BattleData.GetBattleData(Inv1.BattleNo);
				}
				if(Ypos == 45){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv2.MonsterID;
					BattleM = BattleData.GetBattleData(Inv2.BattleNo);
				}
				if(Ypos == 60){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv3.MonsterID;
					BattleM = BattleData.GetBattleData(Inv3.BattleNo);
				}
				if(Ypos == 75){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv4.MonsterID;
					BattleM = BattleData.GetBattleData(Inv4.BattleNo);
				}
				if(Ypos == 90){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv5.MonsterID;
					BattleM = BattleData.GetBattleData(Inv5.BattleNo);
				}
				if(Ypos == 105){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv6.MonsterID;
					BattleM = BattleData.GetBattleData(Inv6.BattleNo);
				}
				if(Ypos == 120){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv7.MonsterID;
					BattleM = BattleData.GetBattleData(Inv7.BattleNo);
				}
				if(Ypos == 135){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv8.MonsterID;
					BattleM = BattleData.GetBattleData(Inv8.BattleNo);
				}
				if(Ypos == 150){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo = Inv9.MonsterID;
					BattleM = BattleData.GetBattleData(Inv9.BattleNo);
				}
				if(Ypos == 165){
					Text1X = 95;
					Text1 = "Monster found";// or Battle Start?
					Text2 = "";
					BattleLocation = 14;
					MNo =  Inv10.MonsterID;
					BattleM = BattleData.GetBattleData(Inv10.BattleNo);
				}
				
				if(Ypos != 190){
					Xpos = 60;
					Ypos = 70;
					DefeatToggle = 1;
					//EnterOK = 1;
					EventS = 1;
				}
				
				//Move
				if(Ypos == 190){
				ScreenType = 7;
				Ypos = 190;
				Xpos = 140;
				}
				
			}//Inventor Enter End
			
			//Elder Screen Enter
			else if(ScreenType == 11 && ElderToggle2 == 1){
				//Talk
				if(Ypos == 70){
					ScreenType = 9;
					Ypos = 30;
					Xpos = 30;
				}
				
				//Elder Screen: Monster List
				if(Ypos == 85){
					ScreenType = 12;
					if(MonstersFound > 0){
					Ypos = 30;
					Xpos = 30;
					}
					if(MonstersFound == 0){
						Ypos = 190;
						Xpos = 140;
					}
				}
				
				//Elder Screen: Notes
				if(Ypos == 100){
					ScreenType = 5;
					if(NotesFound >= 1){
					Ypos = 30;
					Xpos = 30;
					}
					if(NotesFound == 0){//?
					Ypos = 190;
					Xpos = 140;
					}
				}
				
				//Elder Screen: Move
				if(Ypos == 115){
				ScreenType = 7;
				Ypos = 30;
				Xpos = 30;
				}
			}//Elder Screen Enter End
			
			
			//Topics Screen Enter
			else if(ScreenType == 9  && TopicToggle == 1){//TODO Topics Enter
				if(Xpos == 30){//Topics 1-5 Enter
					if(Ypos == 30){//Topic1 Enter
						CurrentTopic = Topic1;
					}
					if(Ypos == 60){//Topic2 Enter
						CurrentTopic = Topic2;
					}
					if(Ypos == 90){//Topic3 Enter
						CurrentTopic = Topic3;
					}
					if(Ypos == 120){//Topic4 Enter
						CurrentTopic = Topic4;
					}
					if(Ypos == 150){//Topic5 Enter
						CurrentTopic = Topic5;
					}
					
				}
				if(Xpos == 120){//Topics 6-10 Enter
					if(Ypos == 30){//Topic6 Enter
						CurrentTopic = Topic6;
					}
					if(Ypos == 60){//Topic7 Enter
						CurrentTopic = Topic7;
					}
					if(Ypos == 90){//Topic8 Enter
						CurrentTopic = Topic8;
					}
					if(Ypos == 120){//Topic9 Enter
						CurrentTopic = Topic9;
					}
					if(Ypos == 150){//Topic10 Enter
						CurrentTopic = Topic10;
					}
				}
				if(Ypos == 30 || Ypos == 60 || Ypos == 90 || Ypos == 120 || Ypos == 150){
					Xpos = 60;
					Ypos = 70;
					ScreenType = 11;
					//Text1 = Conversations.LoadText(CurrentTopic.TopicText)[0];
					//Fix Cutscene Mode?
					CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentTopic.TopicText);
					Text1X = 30;
					Text2X = 30;
					LoadCutscene(CurrentCutscene);
					TopicToggle = 0;
				}
				
				//Return to Elder Screen
				//Start Talk Event
				
				//Back1
				if(Ypos == 190 && Xpos == 5){
					if(TalkPage == 1){
					AreaNumber = 3;
					ScreenType = 11;
					Ypos = 70;
					Xpos = 60;
					}
					if(TalkPage > 1){
						TalkPage = TalkPage - 1;
					Topic1 = NullTopic;
					Topic2 = NullTopic;
					Topic3 = NullTopic;
					Topic4 = NullTopic;
					Topic5 = NullTopic;
					Topic6 = NullTopic;
					Topic7 = NullTopic;
					Topic8 = NullTopic;
					Topic9 = NullTopic;
					Topic10 = NullTopic;
					int DiscussionsFound = Topics.TopicTotal(Topic1Found);
					Topics[] TopicList = Topics.TopicList(Topic1Found);{
						if(DiscussionsFound >=1){
							Topic1 = TopicList[0];
						}
						if(DiscussionsFound >=2){
							Topic2 = TopicList[1];
						}
						if(DiscussionsFound >=3){
							Topic3 = TopicList[2];
						}
						if(DiscussionsFound >=4){
							Topic4 = TopicList[3];
						}
						if(DiscussionsFound >=5){
							Topic5 = TopicList[4];
						}
						if(DiscussionsFound >=6){
							Topic6 = TopicList[5];
						}
						if(DiscussionsFound >=7){
							Topic7 = TopicList[6];
						}
						if(DiscussionsFound >=8){
							Topic8 = TopicList[7];
						}
						if(DiscussionsFound >=9){
							Topic9 = TopicList[8];
						}
						if(DiscussionsFound >=10){
							Topic10 = TopicList[9];
						}
					}
				}
				}
				//Back2
				if(Ypos == 190 && Xpos == 140){
					if(DiscussionsFound <= (TalkPage) * 10){
						AreaNumber = 3;
						ScreenType = 11;
						Ypos = 70;
						Xpos = 60;
						System.out.println("TopicBack1: " + DiscussionsFound);
					}
					if(DiscussionsFound > (TalkPage) * 10){
						TalkPage = TalkPage + 1;
						System.out.println("TopicBack2: " + DiscussionsFound);
					Topic1 = NullTopic;
					Topic2 = NullTopic;
					Topic3 = NullTopic;
					Topic4 = NullTopic;
					Topic5 = NullTopic;
					Topic6 = NullTopic;
					Topic7 = NullTopic;
					Topic8 = NullTopic;
					Topic9 = NullTopic;
					Topic10 = NullTopic;
					int DiscussionsFound = Topics.TopicTotal(Topic1Found);
					Topics[] TopicList = Topics.TopicList(Topic1Found);{
						if(DiscussionsFound >= 1 + (10 * (TalkPage - 1))){
							Topic1 = TopicList[0 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 2 + (10 * (TalkPage - 1))){
							Topic2 = TopicList[1 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 3 + (10 * (TalkPage - 1))){
							Topic3 = TopicList[2 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 4 + (10 * (TalkPage - 1))){
							Topic4 = TopicList[3 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 5 + (10 * (TalkPage - 1))){
							Topic5 = TopicList[4 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 6 + (10 * (TalkPage - 1))){
							Topic6 = TopicList[5 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 7 + (10 * (TalkPage - 1))){
							Topic7 = TopicList[6 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 8 + (10 * (TalkPage - 1))){
							Topic8 = TopicList[7 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 9 + (10 * (TalkPage - 1))){
							Topic9 = TopicList[8 + (TalkPage - 1) * 10];
						}
						if(DiscussionsFound >= 10 + (10 * (TalkPage - 1))){
							Topic10 = TopicList[9 + (TalkPage - 1) * 10];
						}
					}
				}
				}
			}//Topic Screen Enter End
			
			
			//Monster List Enter
			else if(ScreenType == 12){// && MonsterListToggle == 1
				//Select
				if(Xpos == 30){
					if(Ypos == 30){ //MDataSelected???
						MDataSelected = Monster1;
					}
					if(Ypos == 60){ //MData2
						MDataSelected = Monster2;
					}
					//
					if(Ypos == 90){ //MData3
						MDataSelected = Monster3;
					}
					//
					if(Ypos == 120){ //MData4
						MDataSelected = Monster4;
					}
					//
					if(Ypos == 150){ //MData5
						MDataSelected = Monster5;
					}
				}//End if first 5 on page
				if(Xpos == 120){
					if(Ypos == 30){ //MData6
						MDataSelected = Monster6;
					}
					//
					if(Ypos == 60){ //MData7
						MDataSelected = Monster7;
					}
					//
					if(Ypos == 90){ //MData8
						MDataSelected = Monster8;
					}
					//
					if(Ypos == 120){ //MData9
						MDataSelected = Monster9;
					}
					//
					if(Ypos == 150){ //MData10
						MDataSelected = Monster10;
					}
				}//End if second 5 on page
				
				if(Ypos != 190){
					AreaNumber = 3;
					ScreenType = 15;
					Ypos = 70;
					Xpos = 60;
				}
				
				//Monster List: Back
				//if(MonsterPage = 1){
				if(Ypos == 190 && Xpos == 5){
					if(MonsterPage == 1){
					AreaNumber = 3;
					ScreenType = 11;
					Ypos = 70;
					Xpos = 60;
					}
					if(MonsterPage > 1){
						MonsterPage = MonsterPage-1;
						Monster1 = NullData;
						Monster2 = NullData;
						Monster3 = NullData;
						Monster4 = NullData;
						Monster5 = NullData;
						Monster6 = NullData;
						Monster7 = NullData;
						Monster8 = NullData;
						Monster9 = NullData;
						Monster10 = NullData;
						MonstersFound = MonsterData.MTotal(Monster1Found);
						MonsterData[] MonsterD = MonsterData.MInfo(Monster1Found, Gamemode);{
						if(MonstersFound >= ((MonsterPage - 1)*10) + 1){
							Monster1 = MonsterD[(MonsterPage - 1)*10];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 2){
							Monster2 = MonsterD[((MonsterPage - 1)*10) + 1];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 3){
							Monster3 = MonsterD[((MonsterPage - 1)*10) + 2];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 4){
							Monster4 = MonsterD[((MonsterPage - 1)*10) + 3];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 5){
							Monster5 = MonsterD[((MonsterPage - 1)*10) + 4];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 6){
							Monster6 = MonsterD[((MonsterPage - 1)*10) + 5];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 7){
							Monster7 = MonsterD[((MonsterPage - 1)*10) + 6];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 8){
							Monster8 = MonsterD[((MonsterPage - 1)*10) + 7];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 9){
							Monster9 = MonsterD[((MonsterPage - 1)*10) + 8];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 10){
							Monster10 = MonsterD[((MonsterPage - 1)*10) + 9];
						}
						}
					}
				}//Monster List Back/Exit End
				//}
				
				//Monster List: Back/Next
				if(Ypos == 190 && Xpos == 140){
					
					if(MonstersFound <= ((MonsterPage)*10)){
					AreaNumber = 3;
					ScreenType = 11;
					Ypos = 70;
					Xpos = 60;
					}
					if(MonstersFound > ((MonsterPage)*10)){
						MonsterPage = MonsterPage + 1;
						Monster1 = NullData;
						Monster2 = NullData;
						Monster3 = NullData;
						Monster4 = NullData;
						Monster5 = NullData;
						Monster6 = NullData;
						Monster7 = NullData;
						Monster8 = NullData;
						Monster9 = NullData;
						Monster10 = NullData;
						MonstersFound = MonsterData.MTotal(Monster1Found);
						MonsterData[] MonsterD = MonsterData.MInfo(Monster1Found, Gamemode);{
						if(MonstersFound >= ((MonsterPage - 1)*10) + 1){
							Monster1 = MonsterD[(MonsterPage - 1)*10];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 2){
							Monster2 = MonsterD[((MonsterPage - 1)*10) + 1];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 3){
							Monster3 = MonsterD[((MonsterPage - 1)*10) + 2];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 4){
							Monster4 = MonsterD[((MonsterPage - 1)*10) + 3];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 5){
							Monster5 = MonsterD[((MonsterPage - 1)*10) + 4];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 6){
							Monster6 = MonsterD[((MonsterPage - 1)*10) + 5];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 7){
							Monster7 = MonsterD[((MonsterPage - 1)*10) + 6];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 8){
							Monster8 = MonsterD[((MonsterPage - 1)*10) + 7];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 9){
							Monster9 = MonsterD[((MonsterPage - 1)*10) + 8];
						}
						if(MonstersFound >= ((MonsterPage - 1)*10) + 10){
							Monster10 = MonsterD[((MonsterPage - 1)*10) + 9];
						}
						}
					}
				}//Monster List Next/Exit End
				
			}//Monster List Enter End
			
			//Monster Info Enter//15
			//Exit
			else if(ScreenType == 15){
				AreaNumber = 3;
				ScreenType = 12;
				Ypos = 30;
				Xpos = 30;
			}//Monster Info Enter End
			
			
			//Shop Enter
			else if(ScreenType == 13 && ShopToggle == 1){
				//Buy
				int Purchase = 0;
				int Qty = 0;
				if(Ypos == 30){
					//Get ItemData
					CurrentItemS = ItemS1;
					Price = ItemS1.ItemPrice * ItemS1Qty;
					AmountPurchased = ItemS1Qty;
				}
				if(Ypos == 45){
					CurrentItemS = ItemS2;
					Price = ItemS2.ItemPrice * ItemS2Qty;
					AmountPurchased = ItemS2Qty;
				}
				if(Ypos == 60){
					CurrentItemS = ItemS3;
					Price = ItemS3.ItemPrice * ItemS3Qty;
					AmountPurchased = ItemS3Qty;
				}
				if(Ypos == 75){
					CurrentItemS = ItemS4;
					Price = ItemS4.ItemPrice * ItemS4Qty;
					AmountPurchased = ItemS4Qty;
				}
				if(Ypos == 90){
					CurrentItemS = ItemS5;
					Price = ItemS5.ItemPrice * ItemS5Qty;
					AmountPurchased = ItemS5Qty;
				}
				if(Ypos == 105){
					CurrentItemS = ItemS6;
					Price = ItemS6.ItemPrice * ItemS6Qty;
					AmountPurchased = ItemS6Qty;
				}
				if(Ypos == 120){
					CurrentItemS = ItemS7;
					Price = ItemS7.ItemPrice * ItemS7Qty;
					AmountPurchased = ItemS7Qty;
				}
				
				if(Ypos != 190){
					ItemName = CurrentItemS.ItemName;
					ItemType = CurrentItemS.getItemType();
					ItemNo = CurrentItemS.getItemNo();
					if(ItemType != 2 && ItemType != 3 && ItemType != 4){
						ItemAmount = ItemAmount1[ItemNo - 1];//?Item1.getItemNo() - 1 //0 + ItemPlacement
					}
					Qty = CurrentItemS.Qty;
					ShopToggle = 0;
					Purchase = 1;
				}
				
				//Item1
				if(Purchase == 1){
				if(Money < Price){
					Text1 = "Not enough money.";//Too expensive
					Text2 = "";
					Purchase = 0;
				}
				
				if(Money >= Price){
					
					if(ItemType == 1){//Normal Purchase
						Money = Money - Price;
						Item1Found[ItemNo - 1] = 1;
						ItemAmount1[ItemNo - 1] = ItemAmount1[ItemNo - 1] + AmountPurchased;
						int i1 = 0;
						int i2 = 0;
						while(i1 < Item1Found.length){
							if(Item1Found[i1] == 1){
								ItemAmount2[i2] = ItemAmount1[i1];
								i2 = i2 + 1;
							}
							i1 = i1 + 1;
						}
						UpdateItem(ItemPlacement, ItemSortMode);
						
						ItemFoundToggle = 0;
						Text1 = "Purchased " + ItemName;
						Text2 = "";
					}//Buying an Item End
					
					if(ItemType == 2){//Recipe Cook?
						Money = Money - Price;
						CookRecipe[ItemNo] = 1;
						EventSale[CurrentItemS.Qty] = 0;
						Text1 = "Purchase Unavalable";
						Text2 = "";
						UpdateMarket();
					}//Buying Food Recipe End
					
					if(ItemType == 3){//Recipe Weapon
						Money = Money - Price;
						WeaponRecipe[ItemNo] = 1;
						EventSale[CurrentItemS.Qty] = 0;
						Text1 = "Purchased Recipe";
						Text2 = "";
						UpdateMarket();
					}//Buying Weapon Recipe End
					
					if(ItemType == 4){//Recipe Armor
						Money = Money - Price;
						ArmorRecipe[ItemNo] = 1;
						EventSale[CurrentItemS.Qty] = 0;
						Text1 = "Purchased Recipe";
						Text2 = "";
						UpdateMarket();
					}//Buying Armor Recipe End
					
				}//End of If you have enough money to buy the item you want
				Purchase = 0;
				}//if purchase = 1
				
				//Exit
				if(Ypos == 190 && ShopToggle == 1){
					ItemS1Qty = 0;
					ScreenType = 7;
					Ypos = 30;
					Xpos = 30;
				}//Exit Shop End
			}//Shop Enter End
			
			//WeaponSmith Enter
			else if(ScreenType == 10 && WeaponToggle == 1){
				//Make Something
				if(Ypos == 30){
					WeaponSelected = Weapon1;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
				if(Ypos == 45){
					WeaponSelected = Weapon2;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
				if(Ypos == 60){
					WeaponSelected = Weapon3;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
				if(Ypos == 75){
					WeaponSelected = Weapon4;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
				if(Ypos == 90){
					WeaponSelected = Weapon5;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
				if(Ypos == 105){
					WeaponSelected = Weapon6;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
				if(Ypos == 120){
					WeaponSelected = Weapon7;
					WeaponToggle = 0;
					WeaponToggle2 = 1;
				}
					
				if(WeaponSelected.getMaterialNo1() == 0){//
					Amount1 = 0;
				}
				if(WeaponSelected.getMaterialNo1() != 0){
					Amount1 = ItemAmount1[WeaponSelected.getMaterialNo1() - 1];
				}
				if(WeaponSelected.getMaterialNo2() == 0){
					Amount2 = 0;
				}
				if(WeaponSelected.getMaterialNo2() != 0){
					Amount2 = ItemAmount1[WeaponSelected.getMaterialNo2() - 1];
				}//
					
				if(WeaponToggle2 == 1){
					if(WeaponSelected.getMaterialNo1() == 0){//
						Amount1 = 0;
					}
					if(WeaponSelected.getMaterialNo1() != 0){
						Amount1 = ItemAmount1[WeaponSelected.getMaterialNo1() - 1];
					}
					if(WeaponSelected.getMaterialNo2() == 0){
						Amount2 = 0;
					}
					if(WeaponSelected.getMaterialNo2() != 0){
						Amount2 = ItemAmount1[WeaponSelected.getMaterialNo2() - 1];
					}//
					if((WeaponSelected.getMaterialNo1() != 0 && Item1Found[WeaponSelected.getMaterialNo1() - 1] == 0) ||
							(WeaponSelected.getMaterialNo2() != 0 && Item1Found[WeaponSelected.getMaterialNo2() - 1] == 0)){
						Text1X = 70;
						Text1 = "Sorry I can't make that";
						Text2 = "";
						WeaponToggle2 = 0;
					}
					if((WeaponSelected.getMaterialNo1() != 0 && Item1Found[WeaponSelected.getMaterialNo1() - 1] != 0 && WeaponSelected.getMaterialNo2() != 0 && Item1Found[WeaponSelected.getMaterialNo2() - 1] != 0) ||
							(WeaponSelected.getMaterialNo1() != 0 && Item1Found[WeaponSelected.getMaterialNo1() - 1] != 0 && WeaponSelected.getMaterialNo2() == 0) ||
							(WeaponSelected.getMaterialNo1() == 0 && WeaponSelected.getMaterialNo2() != 0 && Item1Found[WeaponSelected.getMaterialNo2() - 1] != 0) ||
							(WeaponSelected.getMaterialNo1() == 0 && WeaponSelected.getMaterialNo2() == 0)){
					if(Amount1 == 0 && WeaponSelected.getMaterialNo1() != 0 || Amount2 == 0 && WeaponSelected.getMaterialNo2() != 0){ //<0?
						Text1X = 70;
						Text1 = "Not enough to make";
						Text2 = "";
						WeaponToggle2 = 0;
					}
					if(Amount1 > 0 && WeaponSelected.getMaterialNo1() != 0 && Amount2 > 0 && WeaponSelected.getMaterialNo2() != 0 || 
						Amount1 > 0 && WeaponSelected.getMaterialNo1() != 0 && Amount2 == 0 && WeaponSelected.getMaterialNo2() == 0 ||
						Amount1 == 0 && WeaponSelected.getMaterialNo1() == 0 && Amount2 > 0 && WeaponSelected.getMaterialNo2() != 0 ||
						Amount1 == 0 && WeaponSelected.getMaterialNo1() == 0 && Amount2 == 0 && WeaponSelected.getMaterialNo2() == 0){ //enough
						if(Money < Price){//Money?
							Text1X = 70;
							Text1 = "Not enough Money";
							Text2 = "";
							WeaponToggle2 = 0;
						}
						if(Money >= Price){//
							Money = Money - Price;
							WeaponMade[WeaponSelected.RecipeNo - 1] = 1;
							WList = Weaponsmith.WeaponList(WeaponRecipe, WeaponMade);{
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 1){
									Weapon1 = WList[0 + WeaponPlacement];
								}
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 2){
									Weapon2 = WList[1 + WeaponPlacement];
								}
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 3){
									Weapon3 = WList[2 + WeaponPlacement];
								}
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 4){
									Weapon4 = WList[3 + WeaponPlacement];
								}
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 5){
									Weapon5 = WList[4 + WeaponPlacement];
								}
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 6){
									Weapon6 = WList[5 + WeaponPlacement];
								}
								if(Weaponsmith.WeaponTotal(WeaponRecipe) >= 7){
									Weapon7 = WList[6 + WeaponPlacement];
								}
							}
							WeaponSelected = WList[Weaponsmith.WeaponNo(WeaponRecipe, WeaponSelected.RecipeNo)];
							Item1Found[WeaponSelected.getItemNo() - 1] = 1;
							
							if(WeaponSelected.getMaterialNo1() != 0){
								ItemAmount1[WeaponSelected.getMaterialNo1() - 1] = 
										ItemAmount1[WeaponSelected.getMaterialNo1() - 1] - 1;
								Amount1 = ItemAmount1[WeaponSelected.getMaterialNo1() - 1];
							}
							if(WeaponSelected.getMaterialNo2() != 0){
								ItemAmount1[WeaponSelected.getMaterialNo2() - 1] = 
										ItemAmount1[WeaponSelected.getMaterialNo2() - 1] - 1;
								Amount2 = ItemAmount1[WeaponSelected.getMaterialNo2() - 1];
							}

							ItemAmount1[WeaponSelected.getItemNo() - 1] = 
									ItemAmount1[WeaponSelected.getItemNo() - 1] + 1;
							int i1 = 0;
							int i2 = 0;
							while(i1 < Item1Found.length){
								if(Item1Found[i1] == 1){
									ItemAmount2[i2] = ItemAmount1[i1];
									i2 = i2 + 1;
								}
								i1 = i1 + 1;
							}
							
							UpdateItem(ItemPlacement, ItemSortMode);
								
							Text1X = 70;
							Text1 = "Obtained " + WeaponSelected.getItemName();
							Text2 = "";
							//WeaponToggle = 0;
							}//End of If you have enough money to buy make the weapon you want
						}
					}
//					//Item1
//					//Item2
//					//CookToggle = 0;?
					WeaponToggle2 = 0;
				}
				
				//Move
				if(Ypos == 190){
					ScreenType = 7;
					Ypos = 30;
					Xpos = 30;
				}
			}//Weaponsmith Enter End
			
			//ArmorSmith Enter
			else if(ScreenType == 16 && ArmorToggle == 1){
				//Make Something
				if(Ypos == 30){
					ArmorSelected = Armor1;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
				if(Ypos == 45){
					ArmorSelected = Armor2;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
				if(Ypos == 60){
					ArmorSelected = Armor3;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
				if(Ypos == 75){
					ArmorSelected = Armor4;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
				if(Ypos == 90){
					ArmorSelected = Armor5;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
				if(Ypos == 105){
					ArmorSelected = Armor6;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
				if(Ypos == 120){
					ArmorSelected = Armor7;
					ArmorToggle = 0;
					ArmorToggle2 = 1;
				}
					
				if(ArmorSelected.getMaterialNo1() == 0){
					Amount1 = 0;
				}
				if(ArmorSelected.getMaterialNo1() != 0){
					Amount1 = ItemAmount1[ArmorSelected.getMaterialNo1() - 1];
				}
				if(ArmorSelected.getMaterialNo2() == 0){
					Amount2 = 0;
				}
				if(ArmorSelected.getMaterialNo2() != 0){
					Amount2 = ItemAmount1[ArmorSelected.getMaterialNo2() - 1];
				}
					
				if(ArmorToggle2 == 1){
					if(ArmorSelected.getMaterialNo1() == 0){
						Amount1 = 0;
					}
					if(ArmorSelected.getMaterialNo1() != 0){
						Amount1 = ItemAmount1[ArmorSelected.getMaterialNo1() - 1];
					}
					if(ArmorSelected.getMaterialNo2() == 0){
						Amount2 = 0;
					}
					if(ArmorSelected.getMaterialNo2() != 0){
						Amount2 = ItemAmount1[ArmorSelected.getMaterialNo2() - 1];
					}
					if((ArmorSelected.getMaterialNo1() != 0 && Item1Found[ArmorSelected.getMaterialNo1() - 1] == 0) ||
							(ArmorSelected.getMaterialNo2() != 0 && Item1Found[ArmorSelected.getMaterialNo2() - 1] == 0)){
						Text1X = 70;
						Text1 = "Sorry I can't make that";
						Text2 = "";
						ArmorToggle2 = 0;
					}
					if((ArmorSelected.getMaterialNo1() != 0 && Item1Found[ArmorSelected.getMaterialNo1() - 1] != 0 && ArmorSelected.getMaterialNo2() != 0 && Item1Found[ArmorSelected.getMaterialNo2() - 1] != 0) ||
							(ArmorSelected.getMaterialNo1() != 0 && Item1Found[ArmorSelected.getMaterialNo1() - 1] != 0 && ArmorSelected.getMaterialNo2() == 0) ||
							(ArmorSelected.getMaterialNo1() == 0 && ArmorSelected.getMaterialNo2() != 0 && Item1Found[ArmorSelected.getMaterialNo2() - 1] != 0) ||
							(ArmorSelected.getMaterialNo1() == 0 && ArmorSelected.getMaterialNo2() == 0)){
					if((Amount1 == 0 && ArmorSelected.getMaterialNo1() != 0) || (Amount2 == 0 && ArmorSelected.getMaterialNo2() != 0)){ //<0?
						Text1X = 70;
						Text1 = "Not enough to make";
						Text2 = "";
						ArmorToggle2 = 0;
					}
					if(Amount1 > 0 && ArmorSelected.getMaterialNo1() != 0 && Amount2 > 0 && ArmorSelected.getMaterialNo2() != 0 || 
						Amount1 > 0 && ArmorSelected.getMaterialNo1() != 0 && Amount2 == 0 && ArmorSelected.getMaterialNo2() == 0 ||
						Amount1 == 0 && ArmorSelected.getMaterialNo1() == 0 && Amount2 > 0 && ArmorSelected.getMaterialNo2() != 0 ||
						Amount1 == 0 && ArmorSelected.getMaterialNo1() == 0 && Amount2 == 0 && ArmorSelected.getMaterialNo2() == 0){ //enough
						if(Money < Price){//Money?
							Text1X = 70;
							Text1 = "Not enough Money";
							Text2 = "";
							ArmorToggle2 = 0;
						}
						if(Money >= Price){//
							Money = Money - Price;
							ArmorMade[ArmorSelected.RecipeNo - 1] = 1;
							
							AList = Armorsmith.ArmorList(ArmorRecipe, ArmorMade);{
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 1){
									Armor1 = AList[0 + ArmorPlacement];
								}
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 2){
									Armor2 = AList[1 + ArmorPlacement];
								}
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 3){
									Armor3 = AList[2 + ArmorPlacement];
								}
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 4){
									Armor4 = AList[3 + ArmorPlacement];
								}
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 5){
									Armor5 = AList[4 + ArmorPlacement];
								}
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 6){
									Armor6 = AList[5 + ArmorPlacement];
								}
								if(Armorsmith.ArmorTotal(ArmorRecipe) >= 7){
									Armor7 = AList[6 + ArmorPlacement];
								}
							}
							ArmorSelected = AList[Armorsmith.ArmorNo(ArmorRecipe, ArmorSelected.RecipeNo)];
							Item1Found[ArmorSelected.getItemNo() - 1] = 1;
							if(ArmorSelected.getMaterialNo1() != 0){
								ItemAmount1[ArmorSelected.getMaterialNo1() - 1] = 
										ItemAmount1[ArmorSelected.getMaterialNo1() - 1] - 1;
								Amount1 = ItemAmount1[ArmorSelected.getMaterialNo1() - 1];
							}
							if(ArmorSelected.getMaterialNo2() != 0){
								ItemAmount1[ArmorSelected.getMaterialNo2() - 1] = 
										ItemAmount1[ArmorSelected.getMaterialNo2() - 1] - 1;
								Amount2 = ItemAmount1[ArmorSelected.getMaterialNo2() - 1];
							}
							ItemAmount1[ArmorSelected.getItemNo() - 1] = 
									ItemAmount1[ArmorSelected.getItemNo() - 1] + 1;
							int i1 = 0;
							int i2 = 0;
							while(i1 < Item1Found.length){
							if(Item1Found[i1] == 1){
								ItemAmount2[i2] = ItemAmount1[i1];
								i2 = i2 + 1;
							}
							i1 = i1 + 1;
							}
								
							UpdateItem(ItemPlacement, ItemSortMode);
								
							Text1X = 70;
							Text1 = "Obtained " + ArmorSelected.getItemName();
							Text2 = "";
							//ArmorToggle = 0;
							}
						}
					}
//					//Item1
//					//Item2
//					//CookToggle = 0;?
					ArmorToggle2 = 0;
				}
				
				//Move
				if(Ypos == 190){
				ScreenType = 7;
				Ypos = 30;
				Xpos = 30;
				}
			}//Armorsmith Enter End
			
		//Tavern Enter
			else if(ScreenType == 17 && TavernToggle == 1){
				//Next //Ypos == 190?
				if(Xpos == 70 && Ypos == 190){
					Random TavernTopicRandom = new Random();
					int iTavern = 0;
					int TavernUnlockedTotal = 0;
					int[] TavernListA = new int[]{0,0};
					int[] TavernList;
					while(iTavern < MainClass.TavernUnlocked.length){
						if(MainClass.TavernUnlocked[iTavern] == 1){
							TavernListA[TavernUnlockedTotal] = iTavern;
							TavernUnlockedTotal += 1;
						}
						iTavern += 1;
					}
					iTavern = 0;
					TavernList = new int[TavernUnlockedTotal + 1];
					while(iTavern < TavernUnlockedTotal){
						TavernList[iTavern] = TavernListA[iTavern];
						iTavern += 1;
					}
					
					if(TavernUnlockedTotal > 0){
						int TTRandom = TavernTopicRandom.nextInt(TavernUnlockedTotal);
						CurrentCutscene = TalkTextCutscene.CutsceneList(MainClass.TavernTopics[TavernList[TTRandom]]);//21, 22
						LoadCutscene(CurrentCutscene);
					}
					else{
						Text1 = "No rumors to hear...";
						Text2 = "";
					}
					TavernToggle = 0;

				}
				
				//Move
				if(Xpos == 140 && Ypos == 190){//140, 190?
					ScreenType = 7;
					Ypos = 30;
					Xpos = 30;
					Text1 = "";
					Text2 = "";
				}
			}//Tavern Enter End
			
			}//TalkTalkTalkMode is Off End!
			if(CutsceneMode != 0){//TalkTalkTalkMode is On!
				System.out.println("The Cutscene Continues..." + CutsceneToggle);
				if(CutsceneToggle == 1){
					if(CutsceneText >= CurrentCutscene.TextContained.length){//Cutscene Has ended already (TextNo is > Text contianed in cutscene)
						CutsceneMode = 0;
						CutsceneText = 0;
						if(Gamemode != 0){
							Text1 = "";
							Text2 = "";
							HiddenText1 = "";
							HiddenText2 = "";
						}
						//X
					}//Else Cutscene has ended already (TextNo is > Text contianed in cutscene)
					else if(CutsceneText < CurrentCutscene.TextContained.length){
						String[] LoadedCutsceneText = Conversations.LoadText(CurrentCutscene.TextContained[CutsceneText]);
						if(CurrentCutscene.EventsIncluded[CutsceneText][0] != 15){
							CutsceneEventEffect();
							Text1 = LoadedCutsceneText[0];
							Text2 = LoadedCutsceneText[1];
							HiddenText1 = LoadedCutsceneText[2];
							HiddenText2 = LoadedCutsceneText[3];
							CutsceneText += 1;
						}
						else{//The Event included is Loading another Cutscene
							CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentCutscene.EventsIncluded[CutsceneText][1]);
							CutsceneText = 0;
							LoadCutscene(CurrentCutscene);
						}
					}//There is still cutscene left End (length of array)
					
					CutsceneToggle = 0; //Doesn't happen with quickscroll text? Or SkipScroll Text?
				}//Cutscene Toggle is GO! End
			}//CutscneMode is On! End
			if(BattleEventMode != 0){
				//x;
				System.out.println("Battle Event Text: " + BattleEventText);
				if(BattleEventText == 0){
					BattleEventText = 1;
				}
				else if(BattleEventText < CurrentBattleEvent.TextContained.length){
				//if(CurrentBattleEvent.EventType[BattleEventText] != 15){
					Text1 = Conversations.LoadText(CurrentBattleEvent.TextContained[BattleEventText])[0];;
					Text2 = Conversations.LoadText(CurrentBattleEvent.TextContained[BattleEventText])[1];
					HiddenText1 = Conversations.LoadText(CurrentBattleEvent.TextContained[BattleEventText])[2];
					HiddenText2 = Conversations.LoadText(CurrentBattleEvent.TextContained[BattleEventText])[3];
					BattleEventEffect(BattleEventMonsterFocus, CurrentBattleEvent.EventType[BattleEventText], CurrentBattleEvent.EventData[BattleEventText]);
					//BattleEventMode = 0;
					//BattleEvent NullBattleEvent = new BattleEvent(0, "", "", new int[] {0}, new int[][] {{0}}, new int[] {0});
					
					BattleEventText += 1;
					//int BattleEventToggle = 0;
				//}
				}
				else{//The Event has ended
					BattleEventMode = 0;
					CutsceneText = 0;
					//End Monster Turn
					if(Gamemode != 0){
						Text1 = "";
						Text2 = "";
						HiddenText1 = "";
						HiddenText2 = "";
					}
					if(CHP1 == 0 && CHP2 ==0 && CHP3 ==0 && CHP4 ==0){
						Defeated(0);
					}//Lose End
					
					//Turn = Turn + 1; Actions
					if((BattleM.MonsterD.length == 1 || MTurn == BattleM.MonsterD.length) && (Status != 1 && Status != 5)){//Enemy Turn End
						MTurn = 0;
						Turn = Turn + 1;
						
						if(TargetToggle == 1){
							//DisplayM = CurrentM;
							//MName = BattleM.MonsterD[TargetM].MonsterName;
							CurrentM = TargetM;
							MNo = BattleM.MonsterD[TargetM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[TargetM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[TargetM].MonsterName[0];
						}
						else{
							CurrentM = 0;
							TargetM = CurrentM;//?
							MNo = BattleM.MonsterD[CurrentM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
					}//Enemy Turn End End
					else if((BattleM.MonsterD.length == 1 || MTurn == BattleM.MonsterD.length) && (Status == 1 || Status == 5)){//Poison Turn Next
						MTurn = MTurn + 1;
						
						if(TargetToggle == 1){
							//DisplayM = CurrentM;
							//MName = BattleM.MonsterD[TargetM].MonsterName;
							CurrentM = TargetM;
							MNo = BattleM.MonsterD[TargetM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[TargetM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[TargetM].MonsterName[0];
						}
						else{
							CurrentM = 0;
							TargetM = CurrentM;//?
							MNo = BattleM.MonsterD[CurrentM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[TargetM];
							DisplayM.MHp2 = MHP2[TargetM];
							DisplayM.MHp3 = MHP3[TargetM];
							DisplayM.MHp4 = MHP4[TargetM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
					}
					else if(MTurn < BattleM.MonsterD.length){//Enemy Turn Next
						MTurn = MTurn + 1;
						//System.out.println("MTurn " + MTurn);
						CurrentM = 0;
						//SetM(MNo);
						if(FocusToggle == 1){
							CurrentM = MTurn - 1;
							MNo = BattleM.MonsterD[CurrentM].MonsterID;
							SetM(BattleM.MonsterD[CurrentM]);
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[CurrentM];
							DisplayM.MHp2 = MHP2[CurrentM];
							DisplayM.MHp3 = MHP3[CurrentM];
							DisplayM.MHp4 = MHP4[CurrentM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
						else{
							
							if(TargetToggle == 1){
								CurrentM = MTurn - 1;
								//TargetM
								MNo = BattleM.MonsterD[TargetM].MonsterID;
								SetM(BattleM.MonsterD[TargetM]);
								DisplayMN = TargetM;
								DisplayM = BattleM.MonsterD[TargetM];
								DisplayM.MHp1 = MHP1[TargetM];
								DisplayM.MHp2 = MHP2[TargetM];
								DisplayM.MHp3 = MHP3[TargetM];
								DisplayM.MHp4 = MHP4[TargetM];
								MName = BattleM.MonsterD[TargetM].MonsterName[0];
							}
							else{
								CurrentM = 0;
								TargetM = CurrentM;
								MNo = BattleM.MonsterD[CurrentM].MonsterID;
								SetM(BattleM.MonsterD[CurrentM]);
								DisplayMN = 0;
								DisplayM = BattleM.MonsterD[CurrentM];
								DisplayM.MHp1 = MHP1[CurrentM];
								DisplayM.MHp2 = MHP2[CurrentM];
								DisplayM.MHp3 = MHP3[CurrentM];
								DisplayM.MHp4 = MHP4[CurrentM];
								MName = BattleM.MonsterD[CurrentM].MonsterName[0];
							}
						}
					}//Enemy Turn Next End
					
				}//Ending Battle Event Mode End
					
			}
			
			NoteToggle = 0;
			CookToggle = 0;
			InventorToggle = 0;
			ElderToggle2 = 0;
			TopicToggle = 0;
			WeaponToggle = 0;
			ArmorToggle = 0;
			TavernToggle = 0;
			ShopToggle = 0;
			ItemToggle = 0;
			MoveToggle = 0;
			EnterToggle = 0;
			PasswordToggle = 0;
			
			Keyhandler.EnterPressed = false;
		}//Enter Pressed End
		
		//TODO cheats
		if(Keyhandler.DashPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// / pressed end
		if(Keyhandler.HPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// H pressed end
		if(Keyhandler.CPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// C pressed end
		if(Keyhandler.IPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// I pressed end
		if(Keyhandler.NPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// N pressed end
		if(Keyhandler.BPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// B pressed end
		if(Keyhandler.EPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// E pressed end
		
		if(Keyhandler.VPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// V pressed end
		
		if(Keyhandler.LPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// L pressed end
		
		if(Keyhandler.DPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// D pressed end
		
		if(Keyhandler.RPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// R pressed end
		
		if(Keyhandler.OPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// O pressed end
		
		if(Keyhandler.WPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// W pressed end
		
		if(Keyhandler.SPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// S pressed end
		
		if(Keyhandler.APressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// A pressed end
		
		if(Keyhandler.PPressed && CutsceneMode != 1 && CutsceneMode != 2 && CutsceneMode != 5 && CutsceneMode != 6) {
			//MainClass.PlayerPressedDown();
			if(EnterOK == 0){
				
			}
		}// P pressed end
		
		
	}//update end
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//set color 
				g.setColor(Color.BLACK); 
				if(ScreenMode == 0){//Nothingness
					g.setColor(Color.LIGHT_GRAY);
				}
				if(ScreenMode == 3){//Negative
					g.setColor(Color.black); 
					g.fillRect(0, 0, 500, 500);
					g.setColor(Color.white);
				}
				if(ScreenMode == 4){//Entered Forbiddon Area / Area is on fire?
					g.setColor(Color.RED); 
					g.fillRect(0, 0, 500, 500);
					g.setColor(Color.black);
				}
				if(ScreenMode == 6){//Mystery
					g.setColor(Color.LIGHT_GRAY); 
					g.fillRect(0, 0, 500, 500);
					g.setColor(Color.DARK_GRAY);
				}
				if(ScreenMode == 7){//Midnight
					g.setColor(new Color(10 , 10, 100)); 
					g.fillRect(0, 0, 500, 500);
					g.setColor(Color.white);
				}
				//RGB
				//White is (255, 255, 255) and black is (0,0,0).
				//Color c = new Color(int Red, int Green, int Blue)
				Color purple = new Color(195 , 0, 200);// not using magenta + blue though may use 161, 32, 223 as a third alternative.
				Color RedOrange = new Color(245 , 133, 10);
				//g.setColor(RedOrange);
				
				//g.drawString(String, X, Y);
				
				//Password Screen
				//Password
				//NewGame
				//Load
				if(ScreenType == 0){
					g.drawString("Enter Password", 10, 30);//Changes with Selection?
					g.drawLine(30, 50, 180, 50);
					//KeyCode g.drawString("Code1", 15, 195);
					//g.drawString(Password, 15, 195);
					g.drawRect(30, 50, 130, 20);
					g.drawString("Load", 15, 195);
					g.drawString("Password", 65, 195);
					g.drawString("New Game", 135, 195);
					//Back Command, Only available if accessed though "normal gameplay"
					//if(PasswordMode == 1){//Active Mode
						g.drawString("Back", 15, 170);
					//}
						g.drawString(MainClass.GlitchHPString(15, 15, 15, 15, 1), 255, 170);
						
						g.drawString(OldPassword, 15, 215);
						g.drawString(Password, 15, 235);
						g.drawString(FuturePassword, 15, 235);
				}//screentype 0 password end
				
				//NotesFound = TestNote1Found + TestNote2Found + TestNote3Found + TestNote4Found + TestNote5Found + TestNote6Found + TestNote7Found + TestNote8Found + TestNote9Found + TestNote10Found;---------------?
				//System.out.println(Ypos);
				
				//Action Screen     For that into screen when you first enter town, or some other important event
				if(ScreenType == 8){
					//g.drawString("Test String", X, Y);
					//g.drawString("TestNote", 30, 35);
					g.drawString(Text1, Text1X, 100);
					g.drawString(Text2, Text2X, 115); //70X
					g.drawString("Enter", 150, 180);
					g.drawString("Back", 150, 195); //Next
				}
				
				if(ScreenType == 1){
				//Navigation Screen
				//g.drawString(String, X, Y);
				g.drawString("Test String", 5, 15);	
				if(CHP1 != 0){
					g.drawString("Hp:" + CHP1 + CHP2 +CHP3 + CHP4, 5, 30);
				}
				else if(CHP1 == 0 && CHP2 != 0){
					g.drawString("Hp:" + CHP2 +CHP3 + CHP4, 5, 30);
				}
				else if(CHP1 == 0 && CHP2 == 0 && CHP3 != 0){
					g.drawString("Hp:" + CHP3 + CHP4, 5, 30);
				}
				else if(CHP1 == 0 && CHP2 == 0 && CHP3 == 0 ){
					g.drawString("Hp:" + CHP4, 5, 30);
				}
				g.drawString("Money:" + Money, 5, 45);
				g.drawString("Area", 150, 15);
				g.drawString("No:" + AreaNumber, 150, 30);
				g.drawString("Name:", 150, 45);
				g.drawString(AreaName, 140, 60);
				
				if(Status == 1){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.yellow);
							g.drawString("Poison!", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(purple);
							g.drawString("Poison!", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else	
						g.drawString("Status: Poison!", 5, 60);
					
				}
				else if(Status == 2){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: Cursed!", 5, 60);
							g.setColor(Color.cyan);
							g.drawString("Cursed!", 45, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: Cursed!", 5, 60);
							g.setColor(RedOrange);
							g.drawString("Cursed!", 45, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else	
						g.drawString("Status: Cursed!", 5, 60);
				}
				else if(Status == 3){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.BLUE);
							g.drawString("Sticky!", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.magenta);
							g.drawString("Sticky!", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else	
						g.drawString("Status: Sticky!", 5, 60);
				}
				else if(Status == 4){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.LIGHT_GRAY);
							g.drawString("????", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.gray);
							g.drawString("????", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else
						g.drawString("Status: ????", 5, 60);
				}
				else if(Status == 5){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							
							if(RainbowAll == true){
								Random ColorRand = new Random();
								g.setColor(new Color(ColorRand.nextInt(255), ColorRand.nextInt(255), ColorRand.nextInt(255)));
							}
							else{
								g.setColor(purple);
							}
							g.drawString("All", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.orange);
							g.drawString("All", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else
						g.drawString("Status: All", 5, 60);
				}
				
				//g.drawString("", 150, 60);
				//g.drawString("", 150, 75);
				if(ExamineUnlocked == 1){
					g.drawString("Examine", 80, 75);
				}
				if(ExamineUnlocked == 0){
					g.drawString("????", 80, 75);
				}
				if(ItemUnlocked == 1){
					g.drawString("Items", 80, 90);
				}
				if(ItemUnlocked == 0){
					g.drawString("????", 80, 90);
				}
				if(NotesUnlocked == 1){
					g.drawString("Notes", 80, 105);
				}
				if(NotesUnlocked == 0){
					g.drawString("????", 80, 105);
				}
				if(MoveUnlocked == 1){
					g.drawString("Move", 80, 120);
				}
				if(MoveUnlocked == 0){
					g.drawString("????", 80, 120);
				}
				g.drawString("Description:", 65, 135);
				g.drawString(Text1, Text1X, 150);
				g.drawString(Text2, Text2X, 165);
				g.drawString(HiddenText1, Text1X + 200, 150);
				g.drawString(HiddenText2, Text2X + 200, 165);
				if(EnterOK == 1){
					g.drawString("Enter", 80, 180);
					g.drawString("Next>", 80, 195);
				}
				if(ExpToggle == 1){//Toggles Experience
					g.drawString("Exp:" + Exp, 5, 195);
					g.drawString("Next:" + Next, 150, 195);
				}
				}//Navigation Screen Display End
				
				//Prevents battle screen from appearing if not battle screen
				if(BattleToggle == 1 && ScreenType !=3 && ScreenType !=5 && ScreenType !=6){
					ScreenType = 2;
				}

				if(ScreenType == 2 && ScreenMode != 2){
//				//Battle Screen
				//g.drawString("Test String", X, Y);
				if(CHP1 != 0){
					g.drawString("Hp:" + CHP1 + CHP2 +CHP3 + CHP4, 5, 15);
				}
				else if(CHP1 == 0 && CHP2 != 0){
					g.drawString("Hp:" + CHP2 +CHP3 + CHP4, 5, 15);
				}
				else if(CHP1 == 0 && CHP2 == 0 && CHP3 != 0){
					g.drawString("Hp:" + CHP3 + CHP4, 5, 15);
				}
				else if(CHP1 == 0 && CHP2 == 0 && CHP3 == 0){
					g.drawString("Hp:" + CHP4, 5, 15);
				}
				g.drawString("Money:" + Money, 5, 30);
				g.drawString("Area", 150, 15);
				g.drawString("No:" + AreaNumber, 150, 30);
				g.drawString("Name:", 150, 45);
				g.drawString(AreaName, 140, 60);
				if(DisplayMN > 0){//CurrentM?
					g.drawLine(22, 50, 17, 55);
					g.drawLine(17, 55, 22, 60);
				}
				if(MTurn != 0 && CurrentM == (MTurn + 1)){//Monster's Turn
					//g.fillOval(127, 65, 10, 10);ww
					g.fillOval(17, 35, 10, 10);
				}
				//g.drawString(MName, 140, 75);//??? may move to X is near 80 Y<75
				if(Status == 4 || Status == 5){
					g.drawString("?????", 30, 45);//EnemyShortName?
				}
				else
					g.drawString(MName, 30, 45);//EnemyShortName?
				
				if(Status == 1){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.yellow);
							g.drawString("Poison!", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(purple);
							g.drawString("Poison!", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else	
						g.drawString("Status: Poison!", 5, 60);
					
				}
				else if(Status == 2){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: Cursed!", 5, 60);
							g.setColor(Color.cyan);
							g.drawString("Cursed!", 45, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: Cursed!", 5, 60);
							g.setColor(RedOrange);
							g.drawString("Cursed!", 45, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else	
						g.drawString("Status: Cursed!", 5, 60);
				}
				else if(Status == 3){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.BLUE);
							g.drawString("Sticky!", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.magenta);
							g.drawString("Sticky!", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else	
						g.drawString("Status: Sticky!", 5, 60);
				}
				else if(Status == 4){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.LIGHT_GRAY);
							g.drawString("????", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.gray);
							g.drawString("????", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else
						g.drawString("Status: ????", 5, 60);
				}
				else if(Status == 5){
					if(Gamemode != 6 && ScreenMode != 0){
						if(ScreenMode == 3){//Negative
							g.drawString("Status: ", 5, 60);
							
							if(RainbowAll == true){
								Random ColorRand = new Random();
								g.setColor(new Color(ColorRand.nextInt(255), ColorRand.nextInt(255), ColorRand.nextInt(255)));
							}
							else{
								g.setColor(purple);
							}
							g.drawString("All", 46, 60);
							g.setColor(Color.white);
						}
						else{
							g.drawString("Status: ", 5, 60);
							g.setColor(Color.orange);
							g.drawString("All", 46, 60);
							g.setColor(Color.black);
						}
						if(ScreenMode == 7){
							g.setColor(Color.white);
						}
					}
					else
						g.drawString("Status: All", 5, 60);
				}
				
				if((DisplayMN + 1) < BattleM.MonsterD.length){
					g.drawLine(117, 50, 122, 55);
					g.drawLine(122, 55, 117, 60);
				}
//					if(){
//						GlitchHPString(15, 15, 15, 15, 1);
//						g.drawString("Hp:" + GlitchHPString(CHP1, CHP2, CHP3, CHP4, HpType), 5, 30);
//					}
				if(Status == 4 || Status == 5 || HpType == 5){
					g.drawString("Hp:????", 150, 90);
				}
				else
					g.drawString("Hp:" + MainClass.GlitchHPString(DisplayM.MHp1, DisplayM.MHp2, DisplayM.MHp3, DisplayM.MHp4, HpType), 150, 90);

//				else if(DisplayM.MHp1 != 0){// == 0?
//					g.drawString("Hp:" + DisplayM.MHp1 + DisplayM.MHp2 + DisplayM.MHp3 + DisplayM.MHp4, 150, 90);
//				}
//				else if(DisplayM.MHp1 == 0 && DisplayM.MHp2 != 0){
//					g.drawString("Hp:" + DisplayM.MHp2 + DisplayM.MHp3 + DisplayM.MHp4, 150, 90);
//				}
//				else if(DisplayM.MHp1 == 0 && DisplayM.MHp2 == 0 && DisplayM.MHp3 != 0){
//					g.drawString("Hp:" + DisplayM.MHp3 + DisplayM.MHp4, 150, 90);
//				}
//				else if(DisplayM.MHp1 == 0 && DisplayM.MHp2 == 0 && DisplayM.MHp3 == 0){
//					g.drawString("Hp:" + DisplayM.MHp4, 150, 90);
//				}
				
				g.drawString("Attack", 80, 75);
				g.drawString("Items", 80, 90);
				g.drawString("Notes", 80, 105);
				g.drawString("Escape", 80, 120);
				g.drawString("Description:", 65, 135);
				g.drawString(Text1, Text1X, 150);
				g.drawString(Text2, Text2X, 165);
				g.drawString(HiddenText1, Text1X + 100, 150);
				g.drawString(HiddenText2, Text2X + 100, 165);
				if(EnterOK == 1){
					g.drawString("Enter", 80, 180);
					g.drawString("Next>", 80, 195);
				}
				g.drawString("Level:" + Level, 5, 180);
				g.drawString("Exp:" + Exp, 5, 195);
				g.drawString("Next:" + Next, 150, 195);
				}//BattleScreen End
				
				
				if(ScreenType == 2 && ScreenMode == 2){//Mirrored
//					//Battle Screen
					//g.drawString("Test String", X, Y);
					if(CHP1 != 0){
						g.drawString("" + CHP4 + CHP3 + CHP2 + CHP1 + ":pH", 5, 15);
					}
					else if(CHP1 == 0 && CHP2 != 0){
						g.drawString("" + CHP4 + CHP3 + CHP2 + ":pH", 5, 15);
					}
					else if(CHP1 == 0 && CHP2 == 0 && CHP3 != 0){
						g.drawString("" + CHP4 + CHP3 + ":pH", 5, 15);
					}
					else if(CHP1 == 0 && CHP2 == 0 && CHP3 == 0){
						g.drawString("" + CHP4 + ":pH", 5, 15);
					}
					g.drawString(Money + ":yenoM", 5, 30);
					g.drawString("aerA", 150, 15);
					g.drawString(AreaNumber + ":oN", 150, 30);
					g.drawString(":emaN", 150, 45);
					g.drawString(AreaName, 140, 60);
					if(DisplayMN > 0){//CurrentM?
						g.drawLine(22, 50, 17, 55);
						g.drawLine(17, 55, 22, 60);
					}
					if(MTurn != 0 && CurrentM == (MTurn + 1)){//Monster's Turn
						//g.fillOval(127, 65, 10, 10);ww
						g.fillOval(17, 35, 10, 10);
					}
					//g.drawString(MName, 140, 75);//??? may move to X is near 80 Y<75
					if(Status == 4 || Status == 5){
						g.drawString("?????", 30, 45);//EnemyShortName?
					}
					else
						g.drawString(MName, 30, 45);//EnemyShortName?
					
					if(Status == 1){
						if(Gamemode != 6){
							g.setColor(purple);
							g.drawString("!nosioP", 5, 60);
							g.setColor(Color.black);
							g.drawString(" :sutatS", 47, 60);
						}
						else	
							g.drawString("!nosioP :sutatS", 5, 60);
						
					}
					else if(Status == 2){
						if(Gamemode != 6){
							g.setColor(RedOrange);
							g.drawString("!desruC", 5, 60);
							g.setColor(Color.black);
							g.drawString("!desruC :sutatS", 6, 60);
						}
						else	
							g.drawString("!desruC :sutatS", 5, 60);
					}
					else if(Status == 3){
						if(Gamemode != 6){
							g.setColor(Color.magenta);
							g.drawString("!ykcitS", 5, 60);
							g.setColor(Color.black);
							g.drawString(" :sutatS", 40, 60);
						}
						else	
							g.drawString("!ykcitS :sutatS", 5, 60);
					}
					else if(Status == 4){
						if(Gamemode != 6){
							g.setColor(Color.gray);
							g.drawString("????", 5, 60);
							g.setColor(Color.black);
							g.drawString(" :sutatS", 35, 60);
						}
						else
							g.drawString("???? :sutatS", 5, 60);
					}

					else if(Status == 5){
						if(Gamemode != 6){
							g.setColor(Color.orange);
							g.drawString("llA", 5, 60);
							g.setColor(Color.black);
							g.drawString(" :sutatS", 20, 60);
						}
						else
							g.drawString("llA :sutatS", 5, 60);
					}
					
					if((DisplayMN + 1) < BattleM.MonsterD.length){
						g.drawLine(117, 50, 122, 55);
						g.drawLine(122, 55, 117, 60);
					}
					
					if(Status == 4 || Status == 5 || (HpType == 5 && (Gamemode == 6 || Gamemode == 5 || Gamemode == 7))){//|| (HpType == 5 && Gamemode != ?)
						g.drawString("????:pH", 150, 90);
					}
					else 
						g.drawString(MainClass.GlitchHPString(DisplayM.MHp1, DisplayM.MHp2, DisplayM.MHp3, DisplayM.MHp4, HpType) + ":pH", 150, 90);
					
					g.drawString("kcattA", 80, 75);
					g.drawString("smetI", 80, 90);
					g.drawString("setoN", 80, 105);
					g.drawString("epacsE", 80, 120);
					g.drawString(":noitpircseD", 65, 135);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);
					g.drawString(HiddenText1, Text1X + 100, 150);
					g.drawString(HiddenText2, Text2X + 100, 165);
					if(EnterOK == 1){
						g.drawString("retnE", 80, 180);
						g.drawString("<txeN", 80, 195);
					}
					g.drawString(Level + ":leveL" + Level, 5, 180);
					g.drawString(Exp + ":pxE:", 5, 195);
					g.drawString(Next + ":txeN", 150, 195);
				}//BattleScreen Mirrored End
				
				//Corrosion HP
				if(ScreenType == 2 && BattleM.MonsterD.length > 0){
					if(BattleM.MonsterD[CurrentM].HpType == 4){
					if(MHP1[CurrentM] > 0 || MHP2[CurrentM] > 0 || MHP3[CurrentM] > 0 || MHP4[CurrentM] > 0){
						if(MHP4[CurrentM] > 0){
							MHP4[CurrentM] -= 1;
							//Maybe in a certain game type, Corrosion HP doesn't update Display M?
							DisplayM.MHp4 = MHP4[CurrentM];
						}
						else if(MHP3[CurrentM] > 0){
							MHP3[CurrentM] -= 1;
							MHP4[CurrentM] = BattleM.MonsterD[CurrentM].MHpMax;
							DisplayM.MHp3 = MHP3[CurrentM];
							DisplayM.MHp4 = MHP4[CurrentM];
						}
						else if(MHP2[CurrentM] > 0){
							MHP2[CurrentM] -= 1;
							MHP3[CurrentM] = BattleM.MonsterD[CurrentM].MHpMax;
							DisplayM.MHp2 = MHP2[CurrentM];
							DisplayM.MHp3 = MHP3[CurrentM];
						}
						else if(MHP1[CurrentM] > 0){
							MHP1[CurrentM] -= 1;
							MHP2[CurrentM] = BattleM.MonsterD[CurrentM].MHpMax;
							DisplayM.MHp1 = MHP1[CurrentM];
							DisplayM.MHp2 = MHP2[CurrentM];
						}
					}
					}
				}//Battle Screen 2 end
				
				if(ScreenType == 3){
					//Item Screen
						//g.drawString("Test String", X, Y);
						//g.drawLine(X1, Y1, X2, Y2);
						if(ItemPlacement > 0){
							g.drawLine(95 - 30, 20, 100 - 30, 10);
							g.drawLine(100 - 30, 10, 105 - 30, 20);
						}
						if(ItemsFound > 10 && ItemPlacement == 0){
							g.drawLine(95 - 30, 175, 100 - 30, 185);
							g.drawLine(100 - 30, 185, 105 - 30, 175);
						}
						if(ItemsFound >= 1){
							g.drawString(Item1.getItemName() + " " + ItemAmount2[0 + ItemPlacement], 40, 35);//ItemAmount1[0 + Item1.getItemNo() - 1]?
							if(Item1.ItemNo == CurrentWeapon.ItemNo || Item1.ItemNo == CurrentHood.ItemNo || Item1.ItemNo == CurrentHelmet.ItemNo || Item1.ItemNo == CurrentRobe.ItemNo || Item1.ItemNo == CurrentArmor.ItemNo 
									|| Item1.ItemNo == CurrentShirt.ItemNo || Item1.ItemNo == CurrentGuantlets.ItemNo || Item1.ItemNo == CurrentGloves.ItemNo || Item1.ItemNo == CurrentPants.ItemNo || Item1.ItemNo == CurrentSocks.ItemNo || Item1.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,35);
							}
						}
						if(ItemsFound >= 2){
							g.drawString(Item2.getItemName() + " " + ItemAmount2[1 + ItemPlacement], 40, 50);
							if(Item2.ItemNo == CurrentWeapon.ItemNo  || Item2.ItemNo == CurrentHood.ItemNo || Item2.ItemNo == CurrentHelmet.ItemNo || Item2.ItemNo == CurrentRobe.ItemNo || Item2.ItemNo == CurrentArmor.ItemNo
									|| Item2.ItemNo == CurrentShirt.ItemNo || Item2.ItemNo == CurrentGuantlets.ItemNo || Item2.ItemNo == CurrentGloves.ItemNo || Item2.ItemNo == CurrentPants.ItemNo || Item2.ItemNo == CurrentSocks.ItemNo || Item2.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,50);
							}
						}
						if(ItemsFound >= 3){
							g.drawString(Item3.getItemName() + " " + ItemAmount2[2 + ItemPlacement], 40, 65);
							if(Item3.ItemNo == CurrentWeapon.ItemNo  || Item3.ItemNo == CurrentHood.ItemNo || Item3.ItemNo == CurrentHelmet.ItemNo || Item3.ItemNo == CurrentRobe.ItemNo || Item3.ItemNo == CurrentArmor.ItemNo
									|| Item3.ItemNo == CurrentShirt.ItemNo || Item3.ItemNo == CurrentGuantlets.ItemNo || Item3.ItemNo == CurrentGloves.ItemNo || Item3.ItemNo == CurrentPants.ItemNo || Item3.ItemNo == CurrentSocks.ItemNo || Item3.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,65);
							}
						}
						if(ItemsFound >= 4){
							g.drawString(Item4.getItemName() + " " + ItemAmount2[3 + ItemPlacement], 40, 80);
							if(Item4.ItemNo == CurrentWeapon.ItemNo  || Item4.ItemNo == CurrentHood.ItemNo || Item4.ItemNo == CurrentHelmet.ItemNo || Item4.ItemNo == CurrentRobe.ItemNo || Item4.ItemNo == CurrentArmor.ItemNo
									|| Item4.ItemNo == CurrentShirt.ItemNo || Item4.ItemNo == CurrentGuantlets.ItemNo || Item4.ItemNo == CurrentGloves.ItemNo || Item4.ItemNo == CurrentPants.ItemNo || Item4.ItemNo == CurrentSocks.ItemNo || Item4.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,80);
							}
						}
						if(ItemsFound >= 5){
							g.drawString(Item5.getItemName() + " " + ItemAmount2[4 + ItemPlacement], 40, 95);
							if(Item5.ItemNo == CurrentWeapon.ItemNo  || Item5.ItemNo == CurrentHood.ItemNo || Item5.ItemNo == CurrentHelmet.ItemNo || Item5.ItemNo == CurrentRobe.ItemNo || Item5.ItemNo == CurrentArmor.ItemNo
									|| Item5.ItemNo == CurrentShirt.ItemNo || Item5.ItemNo == CurrentGuantlets.ItemNo || Item5.ItemNo == CurrentGloves.ItemNo || Item5.ItemNo == CurrentPants.ItemNo || Item5.ItemNo == CurrentSocks.ItemNo || Item5.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,95);
							}
						}
						if(ItemsFound >= 6){
							g.drawString(Item6.getItemName() + " " + ItemAmount2[5 + ItemPlacement], 40, 110);
							if(Item6.ItemNo == CurrentWeapon.ItemNo  || Item6.ItemNo == CurrentHood.ItemNo || Item6.ItemNo == CurrentHelmet.ItemNo || Item6.ItemNo == CurrentRobe.ItemNo || Item6.ItemNo == CurrentArmor.ItemNo
									|| Item6.ItemNo == CurrentShirt.ItemNo || Item6.ItemNo == CurrentGuantlets.ItemNo || Item6.ItemNo == CurrentGloves.ItemNo || Item6.ItemNo == CurrentPants.ItemNo || Item6.ItemNo == CurrentSocks.ItemNo || Item6.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,110);
							}
						}
						if(ItemsFound >= 7){
							g.drawString(Item7.getItemName() + " " + ItemAmount2[6 + ItemPlacement], 40, 125);
							if(Item7.ItemNo == CurrentWeapon.ItemNo  || Item7.ItemNo == CurrentHood.ItemNo || Item7.ItemNo == CurrentHelmet.ItemNo || Item7.ItemNo == CurrentRobe.ItemNo || Item7.ItemNo == CurrentArmor.ItemNo
									|| Item7.ItemNo == CurrentShirt.ItemNo || Item7.ItemNo == CurrentGuantlets.ItemNo || Item7.ItemNo == CurrentGloves.ItemNo || Item7.ItemNo == CurrentPants.ItemNo || Item7.ItemNo == CurrentSocks.ItemNo || Item7.ItemNo == CurrentBoots.ItemNo){
								g.drawString("E", 30,125);
							}
						}
						g.drawString("Description:", 65, 140);//?
						g.drawString(Text1, Text1X, 155);
						g.drawString(Text2, Text2X, 170);//70
						g.drawString(HiddenText1, Text1X + 100, 150);
						g.drawString(HiddenText2, Text2X + 100, 165);
						//if(EnterOK == 1){
						g.drawString("Enter", 80, 180);
						g.drawString("Select>", 80, 195);
						//}
						g.drawString("Back", 150, 195);
					}//ItemScreen 3 End
				
				if(ScreenType == 4){
				//CookScreen
				//g.drawString("Test String", X, Y);
				g.drawString(Item1.ItemShortname, 10, 35);
				g.drawString(Item2.ItemShortname, 10, 50);
				g.drawString(Item3.ItemShortname, 10, 65);
				g.drawString(Item4.ItemShortname, 10, 80);
				g.drawString(Item5.ItemShortname, 10, 95);
				g.drawString(Item6.ItemShortname, 10, 110);
				g.drawString(Item7.ItemShortname, 10, 125);
				if(CurrentItem.ItemNo >= 1 && CurrentItem.ItemNo <= 11){
					if(Item1Found[CurrentItem.ItemNo - 1] == 1){
						g.drawString("Have:" + ItemAmount1[CurrentItem.ItemNo - 1], 10, 180);//CurrentItem
					}
					else{
						g.drawString("Have:" + "???", 10, 180);//150
					}
				}
				else{
					g.drawString("Have:" + "???", 10, 180);//150
				}
				//g.drawLine(X1, Y1, X2, Y2);
				if(Gamemode == 6){
					g.drawLine(70, 0, 70, 200);
				}
				else{
					g.drawLine(70, 0, 70, 135);
					g.drawLine(0, 135, 70, 135);
				}
				g.drawString("Money: " + Money, 90, 30);
				g.drawString("Price: " + Price, 90, 45);
				//g.drawString("Money: " + Money, 75, 45);
				//g.drawString("Price: " + Price, 140, 45);
				//g.drawString("Welcome", 90, 60);
				g.drawString("Item1:", 80, 75);//Item1
				g.drawString(CookItem1.ItemShortname, 80, 85);//Item1
				g.drawString("Item2:", 150, 75);//Item1
				g.drawString(CookItem2.ItemShortname, 150, 85);//Item2
				g.drawString("Cook", 80, 100);
				g.drawString("Reselect", 130, 100);
				g.drawString(CookItem3.ItemName, 80, 115);
				g.drawString("Description:", 75, 135);//Description?
				g.drawString(Text1, Text1X, 150);
				g.drawString(Text2, Text2X, 165);//70
				//if(EnterOK == 1){
				g.drawString("Enter", 80, 180);
				g.drawString("Select>", 80, 195);
				//}
				g.drawString("Move", 150, 195); //Next?
				}//CookScreen 4 End
				
				if(ScreenType == 5){//TODO Back/Next Strangeness
					//Notes
					//Last?
					//Next?
					//Back
					//Exit?
					//g.drawString("Test String", X, Y);
					g.drawString("Page " + NotePage, 150, 15);
					g.drawString(Note1.getNoteName(), 30, 35);
					g.drawString(Note2.getNoteName(), 30, 65);
					g.drawString(Note3.getNoteName(), 30, 95);
					g.drawString(Note4.getNoteName(), 30, 125);
					g.drawString(Note5.getNoteName(), 30, 155);
					g.drawString(Note6.getNoteName(), 120, 35);
					g.drawString(Note7.getNoteName(), 120, 65);
					g.drawString(Note8.getNoteName(), 120, 95);
					g.drawString(Note9.getNoteName(), 120, 125);
					g.drawString(Note10.getNoteName(), 120, 155);
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					if(NotesFound > 10 && NotePage < 2){
						g.drawString("Exit", 10, 195);
					}
					if(NotesFound > 10 && NotePage >= 2){
						//g.drawString("<", 5, 180);
						g.drawString("Back", 10, 195);
					}
					//g.drawString(">", 150, 185);
					if(NotesFound != 0 && NotesFound > 10){//&& NotesFound > (NotePage * 10)
						if(NotePage * 10 > NotesFound){
							g.drawString("Exit", 150, 195);
						}
						if(NotePage * 10 <= NotesFound){
							g.drawString("Next", 150, 195);
						}
					}
					
					if(NotesFound <= 10){
						g.drawString("Back", 150, 195);
					}
					if(NotesFound > 10){
						g.drawString("", 150, 195);
					}
				}//Notes Screen Enter
					
				
				if(ScreenType == 6){
					//Notes2
					//g.drawString("Test String", X, Y);
					//g.drawString("TestNote", 30, 35);
					g.drawString(Note1Text, 60, 90);
					g.drawString(Note2Text, 60, 105); //Note1Text2?
					g.drawString("Enter", 150, 180);
					g.drawString("Back", 150, 195);
				}//Notes2 End
					
				if(ScreenType == 7){
					//MoveScreen
					//g.drawString("Test String", X, Y);
					g.drawString(Area1.getAreaName(), 40, 35);
					g.drawString(Area2.getAreaName(), 40, 50);
					g.drawString(Area3.getAreaName(), 40, 65);
					g.drawString(Area4.getAreaName(), 40, 80);
					g.drawString(Area5.getAreaName(), 40, 95);
					g.drawString(Area6.getAreaName(), 40, 110);
					g.drawString(Area7.getAreaName(), 40, 125);
					g.drawString(Area8.getAreaName(), 40, 140);
					g.drawString(Area9.getAreaName(), 40, 155);
					g.drawString(Area10.getAreaName(), 40, 170);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);//70
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					g.drawString("Back", 150, 195); //Next?
				}//Movescreen End
				
				if(ScreenType == 14){
					//Inventor Screen
					//Monster
					//Move
					//g.drawString("Test String", X, Y);
					g.drawString(Inv1.getMonsterName(), 20, 35);//"TestMonster1" //InvPlacement
					g.drawString(Inv2.getMonsterName(), 20, 50);
					g.drawString(Inv3.getMonsterName(), 20, 65);
					g.drawString(Inv4.getMonsterName(), 20, 80);
					g.drawString(Inv5.getMonsterName(), 20, 95);
					g.drawString(Inv6.getMonsterName(), 20, 110);
					g.drawString(Inv7.getMonsterName(), 20, 125);
					g.drawString(Inv8.getMonsterName(), 20, 140);
					g.drawString(Inv9.getMonsterName(), 20, 155);
					g.drawString(Inv10.getMonsterName(), 20, 170);
					//g.drawLine(X1, Y1, X2, Y2);
					g.drawLine(90, 0, 90, 200);
					g.drawString("Description:", 95, 135);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);//70
//					//if(EnterOK == 1){
					g.drawString("Enter", 90, 180);
					g.drawString("Select>", 90, 195);
//					//}
					g.drawString("Move", 150, 195);
				}//Inventor Screen End
				
				if(ScreenType == 11){
					//Elder Screen
					//Talk
					//Monster List
					//Notes
					//Move
					//g.drawString(String, X, Y);
					g.drawString("Test String", 5, 15);//?
					if(CHP1 != 0){
					g.drawString("Hp:" + CHP1 + CHP2 +CHP3 + CHP4, 5, 30);
					}
					else if(CHP1 == 0 && CHP2 != 0){
					g.drawString("Hp:" + CHP2 +CHP3 + CHP4, 5, 30);
					}
					else if(CHP1 == 0 && CHP2 == 0 && CHP3 != 0){
					g.drawString("Hp:" + CHP3 + CHP4, 5, 30);
					}
					else if(CHP1 == 0 && CHP2 == 0 && CHP3 == 0 ){
					g.drawString("Hp:" + CHP4, 5, 30);
					}
					g.drawString("Money:" + Money, 5, 45);
					g.drawString("Area", 150, 15);
					g.drawString("No:" + AreaNumber, 150, 30);
					g.drawString("Name:", 150, 45);
					g.drawString(AreaName, 140, 60);
					//g.drawString("", 150, 60);
					//g.drawString("", 150, 75);
					g.drawString("Talk", 80, 75);
					g.drawString("Monster List", 80, 90);
					g.drawString("Notes", 80, 105);
					g.drawString("Move", 80, 120);
					g.drawString("Description:", 65, 135);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);
					if(EnterOK == 1){
						g.drawString("Enter", 80, 180);
						g.drawString("Next>", 80, 195);
					}
//					if(ExpToggle == 1){//Toggles Experience
//						g.drawString("Exp:" + Exp, 5, 195);
//						g.drawString("Next:" + Next, 150, 195);
//					}
				}//Elder Screen End
				
				if(ScreenType == 9){//TODO Back/Next Strangeness
					//Topics Screen
					//g.drawString("Test String", X, Y);
					if(DiscussionsFound > 10){
						g.drawString("Page " + TalkPage, 150, 15);
					}
					g.drawString(Topic1.getTopicName(), 30, 35);
					g.drawString(Topic2.getTopicName(), 30, 65);
					g.drawString(Topic3.getTopicName(), 30, 95);
					g.drawString(Topic4.getTopicName(), 30, 125);
					g.drawString(Topic5.getTopicName(), 30, 155);
					g.drawString(Topic6.getTopicName(), 120, 35);
					g.drawString(Topic7.getTopicName(), 120, 65);
					g.drawString(Topic8.getTopicName(), 120, 95);
					g.drawString(Topic9.getTopicName(), 120, 125);
					g.drawString(Topic10.getTopicName(), 120, 155);
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					
					if(DiscussionsFound > 10 && TalkPage > 1){
						//g.drawString("<", 5, 180);
						g.drawString("Back", 5, 195);
					}
					if(DiscussionsFound > 10 && TalkPage == 1){
						g.drawString("Cancel", 5, 195);
					}
					
					if(DiscussionsFound <= 10){
						g.drawString("Back", 150, 195);
					}
					if(DiscussionsFound > 10 && (TalkPage * 10 <= DiscussionsFound)){
						//g.drawString(">", 150, 185);
						g.drawString("Next", 150, 195);
					}
					if(TalkPage * 10 > DiscussionsFound && DiscussionsFound > 10){
						//g.drawString(">", 150, 185);
						g.drawString("Cancel", 150, 195);//Exit?
					}
				}//Topic Screen End
				
				if(ScreenType == 12){
					//Monster List
					//Monster Data
					//Back
					//g.drawString("Test String", X, Y);
					
					g.drawString("Page " + MonsterPage, 150, 15);//?
					g.drawString(Monster1.getMonsterShortName(
							MNameRandom.nextInt(Monster1.MonsterShortName.length)), 30, 35);
					g.drawString(Monster2.getMonsterShortName(
							MNameRandom.nextInt(Monster2.MonsterShortName.length)), 30, 65);
					g.drawString(Monster3.getMonsterShortName(
							MNameRandom.nextInt(Monster3.MonsterShortName.length)), 30, 95);
					g.drawString(Monster4.getMonsterShortName(
							MNameRandom.nextInt(Monster4.MonsterShortName.length)), 30, 125);
					g.drawString(Monster5.getMonsterShortName(
							MNameRandom.nextInt(Monster5.MonsterShortName.length)), 30, 155);
					g.drawString(Monster6.getMonsterShortName(
							MNameRandom.nextInt(Monster6.MonsterShortName.length)), 120, 35);
					g.drawString(Monster7.getMonsterShortName(
							MNameRandom.nextInt(Monster7.MonsterShortName.length)), 120, 65);
					g.drawString(Monster8.getMonsterShortName(
							MNameRandom.nextInt(Monster8.MonsterShortName.length)), 120, 95);
					g.drawString(Monster9.getMonsterShortName(
							MNameRandom.nextInt(Monster9.MonsterShortName.length)), 120, 125);
					g.drawString(Monster10.getMonsterShortName(
							MNameRandom.nextInt(Monster10.MonsterShortName.length)), 120, 155);
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					if(MonstersFound > 10 && MonsterPage < 2){
						g.drawString("Exit", 5, 195);
					}
					if(MonstersFound > 10 && MonsterPage >= 2){
						//g.drawString("<", 5, 180);
						g.drawString("Back", 5, 195);
					}
					if(MonstersFound <= 10){
						g.drawString("Back", 5, 195);
					}
					
					if(MonstersFound > 10 && MonsterPage * 10 > MonstersFound){
						g.drawString("Exit", 150, 195);
					}
					if(MonstersFound > 10 && MonsterPage * 10 <= MonstersFound){
						//g.drawString(">", 150, 185);
						g.drawString("Next", 150, 195);
					}
					if(MonstersFound <= 10){
						g.drawString("Back", 150, 195);
					}
				}//Monster List Screen End
				
				if(ScreenType == 15){
					//Monster Info
					//HP
					//Def
					//Atk
					//Exp.
					//Drops
					//Weaknesses
					//Monster Type
					//Description
					//Back
					//No Defeated?
					//Money?
					//g.drawString(String, X, Y);
//					g.drawString("Test String", 5, 15);
					if(MainClass.SEventSecond == 1) {
						g.drawString(MDataSelected.DisplayNo1 + " - " + MDataSelected.MonsterName[
					        MNameRandom.nextInt(MDataSelected.MonsterName.length)], 5, 15);//MDataSelected
						}
					else if(MainClass.SEventSecond == 2) {
						g.drawString(MDataSelected.DisplayNo2 + " - " + MDataSelected.MonsterName[
						    MNameRandom.nextInt(MDataSelected.MonsterName.length)], 5, 15);//MDataSelected
						}
					else
						g.drawString(MDataSelected.MonsterID + " - " + MDataSelected.MonsterName[
						    MNameRandom.nextInt(MDataSelected.MonsterName.length)], 5, 15);//MDataSelected                   	
					
					if(MDataSelected.MHp1 != 0){
					g.drawString("Hp:" + MDataSelected.MHp1 + MDataSelected.MHp2 + MDataSelected.MHp3 + MDataSelected.MHp4, 25, 30);
					}
					else if(MDataSelected.MHp1 == 0 && MDataSelected.MHp2 != 0){
					g.drawString("Hp:" + MDataSelected.MHp2 + MDataSelected.MHp3 + MDataSelected.MHp4, 25, 30);
					}
					else if(MDataSelected.MHp1 == 0 && MDataSelected.MHp2 == 0 && MDataSelected.MHp3 != 0){
					g.drawString("Hp:" + MDataSelected.MHp3 + MDataSelected.MHp4, 25, 30);
					}
					else if(MDataSelected.MHp1 == 0 && MDataSelected.MHp2 == 0 && MDataSelected.MHp3 == 0 ){
					g.drawString("Hp:" + MDataSelected.MHp4, 25, 30);
					}
//					g.drawString("Money:" + Money, 5, 45);//?
					if(MDataSelected.MAtk1 != 0){
						g.drawString("Atk: " + MDataSelected.MAtk1 + MDataSelected.MAtk2 + MDataSelected.MAtk3 + MDataSelected.MAtk4, 120, 45);
						}
						else if(MDataSelected.MAtk1 == 0 && MDataSelected.MAtk2 != 0){
						g.drawString("Atk: " + MDataSelected.MAtk2 + MDataSelected.MAtk3 + MDataSelected.MAtk4, 120, 30);
						}
						else if(MDataSelected.MAtk1 == 0 && MDataSelected.MAtk2 == 0 && MDataSelected.MAtk3 != 0){
						g.drawString("Atk: " + MDataSelected.MAtk3 + MDataSelected.MAtk4, 120, 30);
						}
						else if(MDataSelected.MAtk1 == 0 && MDataSelected.MAtk2 == 0 && MDataSelected.MAtk3 == 0 ){
						g.drawString("Atk: " + MDataSelected.MAtk4, 120, 30);
						}
					if(MDataSelected.MDef1 != 0){
						g.drawString("Def: " + MDataSelected.MDef1 + MDataSelected.MDef2 + MDataSelected.MDef3 + MDataSelected.MDef4, 120, 45);
						}
						else if(MDataSelected.MDef1 == 0 && MDataSelected.MDef2 != 0){
						g.drawString("Def: " + MDataSelected.MDef2 + MDataSelected.MDef3 + MDataSelected.MDef4, 120, 45);
						}
						else if(MDataSelected.MDef1 == 0 && MDataSelected.MDef2 == 0 && MDataSelected.MDef3 != 0){
						g.drawString("Def: " + MDataSelected.MDef3 + MDataSelected.MDef4, 120, 45);
						}
						else if(MDataSelected.MDef1 == 0 && MDataSelected.MDef2 == 0 && MDataSelected.MDef3 == 0 ){
						g.drawString("Def: " + MDataSelected.MDef4, 120, 45);
						}
					g.drawString("Exp: " + "Exp", 80, 75);
					g.drawString("Drop1: " + "TestItem", 80, 90);
					g.drawString("Drop2: " + "TestItem", 80, 105);
					//g.drawString("Monster Type: " + "Type", 70, 120);
					if(Gamemode == 6){
						g.drawString("Description: " + MDataSelected.MDescription, 25, 135);
					}
					else
						g.drawString("Desc: " + MDataSelected.MDescription, 15, 135);
					//g.drawString("Description: " + "TestDescription", 25, 135);
					g.drawString("Weaknesses: " + MDataSelected.WeaknessDisplay[0], 50, 150);
					g.drawString("Weaknesses2: " + MDataSelected.WeaknessDisplay[0], 50, 165);
//					if(EnterOK == 1){
					g.drawString("Enter", 150, 180);
					g.drawString("Back>", 150, 195);//exit?
//					}
//					if(ExpToggle == 1){//Toggles Experience?
//						g.drawString("Next:" + Next, 150, 195);?
//					}
				}//Monster Info Screen End
				
				if(ScreenType == 151){//Glitched MInfo
					//Monster Info
					//HP
					//Def
					//Atk
					//Exp.
					//Drops
					//Weaknesses
					//Monster Type
					//Description
					//Back
					//No Defeated?
					//Money?
					//g.drawString(String, X, Y);
//					g.drawString("Test String", 5, 15);
					g.drawString(MDataSelected.MonsterID + " - " + MDataSelected.MonsterName, 5, 15);//MDataSelected
					if(MDataSelected.MHp1 != 0){
					g.drawString("Hp:" + MDataSelected.MHp1 + MDataSelected.MHp2 + MDataSelected.MHp3 + MDataSelected.MHp4, 25, 30);
					}
					else if(MDataSelected.MHp1 == 0 && MDataSelected.MHp2 != 0){
					g.drawString("Hp:" + MDataSelected.MHp2 + MDataSelected.MHp3 + MDataSelected.MHp4, 25, 30);
					}
					else if(MDataSelected.MHp1 == 0 && MDataSelected.MHp2 == 0 && MDataSelected.MHp3 != 0){
					g.drawString("Hp:" + MDataSelected.MHp3 + MDataSelected.MHp4, 25, 30);
					}
					else if(MDataSelected.MHp1 == 0 && MDataSelected.MHp2 == 0 && MDataSelected.MHp3 == 0 ){
					g.drawString("Hp:" + MDataSelected.MHp4, 25, 30);
					}
//					g.drawString("Money:" + Money, 5, 45);//?
					if(MDataSelected.MAtk1 != 0){
						g.drawString("Atk: " + MDataSelected.MAtk1 + MDataSelected.MAtk2 + MDataSelected.MAtk3 + MDataSelected.MAtk4, 120, 45);
						}
						else if(MDataSelected.MAtk1 == 0 && MDataSelected.MAtk2 != 0){
						g.drawString("Atk: " + MDataSelected.MAtk2 + MDataSelected.MAtk3 + MDataSelected.MAtk4, 120, 30);
						}
						else if(MDataSelected.MAtk1 == 0 && MDataSelected.MAtk2 == 0 && MDataSelected.MAtk3 != 0){
						g.drawString("Atk: " + MDataSelected.MAtk3 + MDataSelected.MAtk4, 120, 30);
						}
						else if(MDataSelected.MAtk1 == 0 && MDataSelected.MAtk2 == 0 && MDataSelected.MAtk3 == 0 ){
						g.drawString("Atk: " + MDataSelected.MAtk4, 120, 30);
						}
					if(MDataSelected.MDef1 != 0){
						g.drawString("Def: " + MDataSelected.MDef1 + MDataSelected.MDef2 + MDataSelected.MDef3 + MDataSelected.MDef4, 120, 45);
						}
						else if(MDataSelected.MDef1 == 0 && MDataSelected.MDef2 != 0){
						g.drawString("Def: " + MDataSelected.MDef2 + MDataSelected.MDef3 + MDataSelected.MDef4, 120, 45);
						}
						else if(MDataSelected.MDef1 == 0 && MDataSelected.MDef2 == 0 && MDataSelected.MDef3 != 0){
						g.drawString("Def: " + MDataSelected.MDef3 + MDataSelected.MDef4, 120, 45);
						}
						else if(MDataSelected.MDef1 == 0 && MDataSelected.MDef2 == 0 && MDataSelected.MDef3 == 0 ){
						g.drawString("Def: " + MDataSelected.MDef4, 120, 45);
						}
					g.drawString("Exp: " + "Exp", 80, 75);
					g.drawString("Drop1: " + "TestItem", 80, 90);
					g.drawString("Drop2: " + "TestItem", 80, 105);
					g.drawString("Monster Type: " + "Type", 70, 120);
					g.drawString("Description: " + MDataSelected.MDescription, 25, 135);
					//g.drawString("Description: " + "TestDescription", 25, 135);
					g.drawString("Weaknesses:" + "Weakness/Resistance: (U(), S(), L(), H(), A(), P(), B(), D(), G())", 50, 150);
					g.drawString("Weakness2", 50, 165);
//					if(EnterOK == 1){
					g.drawString("Enter", 150, 180);
					g.drawString("Back>", 150, 195);//exit?
//					}
//					if(ExpToggle == 1){//Toggles Experience?
//						g.drawString("Next:" + Next, 150, 195);?
//					}
				}//Glitched Monster Info Screen End
				
				if(ScreenType == 13){//Display
					//Shop
					//Item
					//Price
					//Qty.
					//Move
					//Sell?
					//g.drawString("Test String", X, Y);
					g.drawString("Item          Qty.       Price", 40, 20);
					
					if(EventSaleTotal == 0) {
						g.drawString("Sold Out", 40, 35);
					}
					//ShopItem1
					if(EventSaleTotal >= 1) {
						g.drawString(ItemS1.getItemName() + " " + ItemS1Qty, 40, 35);
						g.drawString((ItemS1.getPrice() * ItemS1Qty) + "", 150, 35);//g or G?
					}
					//ShopItem2
					if(EventSaleTotal >= 2) {
						g.drawString(ItemS2.getItemName() + " " + ItemS2Qty, 40, 50);
						g.drawString((ItemS2.getPrice() * ItemS2Qty) + "", 150, 50);//g or G?
					}
					//ShopItem3
					if(EventSaleTotal >= 3) {
						g.drawString(ItemS3.getItemName() + " " + ItemS3Qty, 40, 65);
						g.drawString((ItemS3.getPrice() * ItemS3Qty) + "", 150, 65);//g or G?
					}
					//ShopItem4
					if(EventSaleTotal >= 4) {
						g.drawString(ItemS4.getItemName() + " " + ItemS4Qty, 40, 80);
						g.drawString((ItemS4.getPrice() * ItemS4Qty) + "", 150, 80);//g or G?
					}
					//ShopItem5
					if(EventSaleTotal >= 5) {
						g.drawString(ItemS5.getItemName() + " " + ItemS5Qty, 40, 95);
						g.drawString((ItemS5.getPrice() * ItemS5Qty) + "", 150, 95);//g or G?
					}
					//ShopItem6
					if(EventSaleTotal >= 6) {
						g.drawString(ItemS6.getItemName() + " " + ItemS6Qty, 40, 110);
						g.drawString((ItemS6.getPrice() * ItemS6Qty) + "", 150, 110);//g or G?
					}
					//ShopItem7
					if(EventSaleTotal >= 7) {
						g.drawString(ItemS7.getItemName() + " " + ItemS7Qty, 40, 125);
						g.drawString((ItemS7.getPrice() * ItemS7Qty) + "", 150, 125);//g or G?
					}
					g.drawString("Description:", 65, 135);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);//70
					if(CurrentItemS.ItemNo == 0 && CurrentItemS.ItemType != 2 || CurrentItemS.ItemType != 3 || CurrentItemS.ItemType != 4) {//Recipe or Null
						//Does nothing?
						
					}
					else if(CurrentItemS.ItemType == 2 || CurrentItemS.ItemType == 3 || CurrentItemS.ItemType == 4){
						//g.drawString("Have: " + "New", 5, 180);//None?
					}
					else if(Item1Found[CurrentItemS.ItemNo - 1] == 1){
						g.drawString("Have: " + ItemAmount1[CurrentItemS.ItemNo - 1], 5, 180);//CurrentItemS = ItemS1;
					}
					else{
						g.drawString("Have: " + "New", 5, 180);//None?
					}
					//g.drawString("Have: " + "???", 5, 180);
					g.drawString("Money: " + Money, 5, 195);
//					//if(EnterOK == 1){
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
//					//}
					g.drawString("Move", 150, 195);
				}//Shop Screen End
				
				//WeaponSmith
				//Requires
				//Makes
				//Price
				//Back
				if(ScreenType == 10){
					//g.drawString("Test String", X, Y);
					g.drawString(Weapon1.ItemName, 10, 35);
					g.drawString(Weapon2.ItemName, 10, 50);
					g.drawString(Weapon3.ItemName, 10, 65);
					g.drawString(Weapon4.ItemName, 10, 80);
					g.drawString(Weapon5.ItemName, 10, 95);
					g.drawString(Weapon6.ItemName, 10, 110);
					g.drawString(Weapon7.ItemName, 10, 125);
//					//g.drawLine(X1, Y1, X2, Y2);
//					g.drawLine(70, 0, 70, 200);
					g.drawString("Money: " + Money, 90, 30);
					g.drawString("Price: " + Price, 90, 45);
					g.drawString("Requires:", 90, 60);
					//x;
					g.drawString("Item1: " + Amount1, 80, 80);//Item1
					if(WeaponSelected.MaterialNo2 != 0){
						g.drawString("Item2: " + Amount2, 140, 80);//Item2
					}
					g.drawString(WeaponSelected.Material1Name, 80, 95);//Item1
					g.drawString(WeaponSelected.Material2Name, 140, 95);//Item2
					
					if(WeaponSelected.ItemNo >= 1 && WeaponSelected.ItemNo <= 11){
						if(Item1Found[WeaponSelected.ItemNo - 1] == 1){
							g.drawString("Have:" + ItemAmount1[WeaponSelected.ItemNo - 1], 10, 150);//CurrentItem
						}
						else{
							g.drawString("Have:" + "???", 10, 150);
						}
					}
					else{
						//g.drawString("Have:" + "???", 10, 150);
					}
					
//					g.drawString("Cook", 80, 100);
//					g.drawString("Reselect", 130, 100);
					g.drawString("Weapon", 80, 115);
					g.drawString("Description:", 70, 135);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);//70
					//if(EnterOK == 1){
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					//}
					g.drawString("Move", 150, 195);
				}//Weaponsmith Screen End
				
				//ArmorSmith
				//Requires
				//Makes
				//Price
				//Back
				if(ScreenType == 16){
					//g.drawString("Test String", X, Y);
					g.drawString(Armor1.ItemName, 10, 35);
					g.drawString(Armor2.ItemName, 10, 50);
					g.drawString(Armor3.ItemName, 10, 65);
					g.drawString(Armor4.ItemName, 10, 80);
					g.drawString(Armor5.ItemName, 10, 95);
					g.drawString(Armor6.ItemName, 10, 110);
					g.drawString(Armor7.ItemName, 10, 125);
//					//g.drawLine(X1, Y1, X2, Y2);
//					g.drawLine(70, 0, 70, 200);
					g.drawString("Money: " + Money, 90, 30);
					g.drawString("Price: " + Price, 90, 45);
					g.drawString("Requires:", 90, 60);
					g.drawString("Item1: " + Amount1, 80, 80);//Item1
					g.drawString(ArmorSelected.Material1Name, 80, 95);//Item1
					g.drawString("Item2: " + Amount2, 150, 80);//Item2
					g.drawString(ArmorSelected.Material2Name, 150, 95);//Item2
					
					//??? Should this be hiddon if they don't have?
					if(ArmorSelected.ItemNo >= 1 && ArmorSelected.ItemNo <= 11){
						if(Item1Found[ArmorSelected.ItemNo - 1] == 1){
							g.drawString("Have:" + ItemAmount1[ArmorSelected.ItemNo - 1], 10, 150);//CurrentItem
						}
						else{
							g.drawString("Have:" + "???", 10, 150);
						}
					}
					else{
						//g.drawString("Have:" + "???", 10, 150);
					}
					
//					g.drawString("Cook", 80, 100);
//					g.drawString("Reselect", 130, 100);
					g.drawString("Armor", 80, 115);
					g.drawString("Description:", 70, 135);
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);//70
					//if(EnterOK == 1){
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					//}
					g.drawString("Move", 150, 195);
				}//Armorsmith Screen End
				
				//Tavern
				if(ScreenType == 17){
					g.drawString(Text1, Text1X, 150);
					g.drawString(Text2, Text2X, 165);//70
					g.drawString("Enter", 80, 180);
					g.drawString("Select>", 80, 195);
					g.drawString("Move", 150, 195); //Next?
				}//Tavern Screen End
				
				g.drawString(HiddenText1, 250, 60);
				g.drawString(HiddenText2, 250, 75);
				
				//Paints cursor//TODO Curserpos during enemy Turn? and during Inventor Screen
				if((ScreenType !=6 && ScreenType !=8 && (Gamemode != 6 && Gamemode != 0)) || (ScreenType !=6 && ScreenType !=8 && MTurn == 0 && (Gamemode == 6 || Gamemode == 0))){ //Paints cursor (except on notes page 2).
					if(CutsceneMode == 1 || CutsceneMode == 3 || CutsceneMode == 5 || CutsceneMode == 7 || Gamemode == 0){
						//CutsceneMode != 0 //TalkTalkTalkMode is On!
						//CutsceneToggle == 1
						if(ScreenMode == 3){//Negative
							g.setColor(RedOrange); 
						}
						else
							g.setColor(Color.cyan); 
					}
					if(MTurn != 0 || Status == 4 || Status == 5 && Gamemode != 0){
						if(ScreenMode == 0){//Nothingness
							g.setColor(Color.white); 
						}
						else if(ScreenMode == 3){//Negative
							g.setColor(Color.lightGray); 
						}
						else
							g.setColor(Color.gray);
					}
					g.fillOval(Xpos - Radius, Ypos - Radius, 2 * Radius, 2 * Radius); 
					if(ScreenMode == 0){//Nothingness
						g.setColor(Color.lightGray); 
					}
					else if(ScreenMode == 3 || ScreenMode == 7){//Negative or Midnight
						g.setColor(Color.WHITE); 
					}
					else
						g.setColor(Color.BLACK); 
				}
				if(ScreenType == 2 && MTurn != 0){//30, 45
					if(CutsceneMode == 1 || CutsceneMode == 3 || CutsceneMode == 5 || CutsceneMode == 7 || Gamemode == 0){
						//CutsceneMode != 0 //TalkTalkTalkMode is On!
						//CutsceneToggle == 1
						if(ScreenMode == 3){//Negative
							g.setColor(RedOrange); 
						}
						else
							g.setColor(Color.cyan); 
					}
					if(Status == 4 || Status == 5 && Gamemode != 0){
						if(ScreenMode == 0){//Nothingness
							g.setColor(Color.lightGray); 
						}
						else if(ScreenMode == 3){//Negative
							g.setColor(Color.lightGray); 
						}
						else
							g.setColor(Color.gray);
					}
					g.fillOval(20, 35, 2 * Radius, 2 * Radius);
					if(ScreenMode == 0){//Nothingness
						g.setColor(Color.lightGray); 
					}
					else if(ScreenMode == 3){//Negative
						g.setColor(Color.WHITE); 
					}
					else
						g.setColor(Color.BLACK); 
				}//??
				//Image Placement: g.drawImage(ImageName, XPos, YPos, frame); 
				//g.drawImage("ImageName", 0, 0, this); 
				
				g.dispose();
	}//paintcomponent End
	
	//Load Cutscene
	public void LoadCutscene(TalkTextCutscene LoadingCutscene){
		//Really need to set CurrentCutscene before this loads...
		Text1 = Conversations.LoadText(LoadingCutscene.TextContained[0])[0];
		Text2 = Conversations.LoadText(LoadingCutscene.TextContained[0])[1];
		HiddenText1 = Conversations.LoadText(LoadingCutscene.TextContained[0])[2];
		HiddenText2 = Conversations.LoadText(LoadingCutscene.TextContained[0])[3];
		CutsceneEventEffect();
		CutsceneText = 0;
		CutsceneMode = LoadingCutscene.CMode;
		CutsceneToggle = 1;
	}//Load Curscene End
	
	public void CutsceneEventEffect(){
		if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 1){//Find Monster
			BattleLocation = ScreenType;
			BattleM = BattleData.GetBattleData(CurrentCutscene.EventsIncluded[CutsceneText][1]);
			MNo = BattleM.MonsterD[0].MonsterID;
			DefeatToggle = 1;
			EnterOK = 1;
			EventS = 1;
		}//Find Monster! Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 2){//Find Cook Recipe
			CookRecipe[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
		}//Find Recipe Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 3){//Unlock Note
			Note1Found[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
			UpdateNote();
		}//Unlock Note Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 4){//Get Item
			Item1Found[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
			ItemAmount1[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 
				ItemAmount1[CurrentCutscene.EventsIncluded[CutsceneText][1]] + 1;
			int i1 = 0;
			int i2 = 0;
			while(i1 < Item1Found.length){
			if(Item1Found[i1] == 1){
				ItemAmount2[i2] = ItemAmount1[i1];
				i2 = i2 + 1;
			}
			i1 = i1 + 1;
			}
			ItemsFound = Items.ItemTotal(Item1Found);
			UpdateItem(ItemPlacement, ItemSortMode);
		}//Get Item Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 5){//Find Area
			Area1Found[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
			UpdateAreas();
		}//Find Area Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 6){//Find Money
			Money += CurrentCutscene.EventsIncluded[CutsceneText][1];
		}//Find Money Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 7){//Unlock Action
			if(CurrentCutscene.EventsIncluded[CutsceneText][1] == 0){
				ExamineUnlocked = 1; //May Rename
			}
			else if(CurrentCutscene.EventsIncluded[CutsceneText][1] == 1){
				ItemUnlocked = 1; //May Rename
			}
			else if(CurrentCutscene.EventsIncluded[CutsceneText][1] == 2){
				NotesUnlocked = 1; //May Rename
			}
			else if(CurrentCutscene.EventsIncluded[CutsceneText][1] == 3){
				MoveUnlocked = 1; //May Rename
			}
			
		}//Unlock Action Talk Event End
		
		//8 Unlock Topic??
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 8){//Topics
			Topic1Found[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
			UpdateTopics();//Refresh!
		}//Find Topic Talk Event End
		
		//9 Take Damage, Recover Health
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 9){//Take Damage/Recover Health
			//???
		}
		
		//10 Story Flag
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 10){//Story Flag
			MainClass.SEventFlag[CurrentCutscene.EventsIncluded[CutsceneText][1]] += 1;
		}//Story Flag Talk Event End
		
		//11 Inventor Battle
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 11){//Inventor Battle
			InvEvent[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
			UpdateInventor();//Refresh!
		}//Find Inventor Talk Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 12){//Tavern Rumor
			MainClass.TavernUnlocked[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
		}//Tavern Rumor Unlocked Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 13){//Change ScreenType
			ScreenType = CurrentCutscene.EventsIncluded[CutsceneText][1];
		}//ScreenType Change Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 14){//Change ScreenMode
			ScreenMode = CurrentCutscene.EventsIncluded[CutsceneText][1];
		}//ScreenType Change Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 15){//Load another Cutscene
			CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentCutscene.EventsIncluded[CutsceneText][1]);
			CutsceneText = 0;
			LoadCutscene(CurrentCutscene);
		}//ScreenType Change Event End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 16){//Move player to another area
			CurrentArea = AreaData.AData(CurrentCutscene.EventsIncluded[CutsceneText][1], 0, MainClass.SEventSecond);
			AreaNumber = CurrentArea.AreaNo;
			AreaName = CurrentArea.AreaName;
			ScreenType = CurrentArea.getScreenType();
			Ypos = CurrentArea.getYpos();
			Xpos = CurrentArea.getXpos();
			//Text1X = 
			//Text2X = 
			ScreenMode = CurrentArea.ScreenMode;
			if(Gamemode == 0){
				Text1 = CurrentArea.RandomText[0];
				Text2 = CurrentArea.RandomText[1];
				HiddenText1 = CurrentArea.RandomText[3];
				HiddenText2 = CurrentArea.RandomText[4];
			}
			MoveToggle = 0;
			ElderToggle = 0;
		}//Move to Area Event End
		
		//TODO XMode Cutscene Effect
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 17){//ChangeCutscene Because of XModeBoss!
			//If player has been fortunate (or unfortunate) enough to fight so many XMode enemies
			if(MonsterData.XTotal(Monster1Found) <= CurrentCutscene.EventsIncluded[CutsceneText][1]){
				Random RandC = new Random();
				if((MainClass.XBattleMode != 0 && MainClass.XBattleMode != 3 && MainClass.XBattleMode != 6 && RandC.nextInt(100) < CurrentCutscene.EventsIncluded[CutsceneText][1]) 
						|| MainClass.XBattleMode == 2 || MainClass.XBattleMode == 5 || MainClass.XBattleMode == 8){
					CurrentCutscene = TalkTextCutscene.CutsceneList(CurrentCutscene.EventsIncluded[CutsceneText][2]);
					CutsceneText = 0;
					LoadCutscene(CurrentCutscene);
				}
			}
		}//ChangeCutscene Because of XModeBoss End
		
		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 18){//Change Gamemode
			Gamemode = CurrentCutscene.EventsIncluded[CutsceneText][1];
		}//Gamemode Change Event End

//		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 19){//Change Player Level
//			Level = CurrentCutscene.EventsIncluded[CutsceneText][1];
//		}//Change Player Level Event End
//		
//		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 20){//Change Current Level Cap
//			LevelMAX = CurrentCutscene.EventsIncluded[CutsceneText][1];
//		}//Change Player Level Event End
//		
//		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 21){//Find Weapon Recipe
//			WeaponRecipe[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
//		}//Find Weapon Recipe Event End
//		else if(CurrentCutscene.EventsIncluded[CutsceneText][0] == 22){//Find Weapon Recipe
//			ArmorRecipe[CurrentCutscene.EventsIncluded[CutsceneText][1]] = 1;
//		}//Find Weapon Recipe Event End
		
		//Other???
		//Get XP?
	}//Cutscene Event End
	
	public void SetM(MonsterData Mno){ //SetM(int Mno)
		MName = Mno.MonsterName[0]; //MonsterData.MInfo(Mno).getMonsterName(); int Mno
		Hp1 = Mno.MHp1;
		Hp2 = Mno.MHp2;
		Hp3 = Mno.MHp3;
		Hp4 = Mno.MHp4;
		HpType = Mno.HpType;
		MAtk1 = Mno.MAtk1;
		MAtk2 = Mno.MAtk2;
		MAtk3 = Mno.MAtk3;
		MAtk4 = Mno.MAtk4;
		AtkType = Mno.AtkType;
		MDef1 = Mno.MDef1;
		MDef2 = Mno.MDef2;
		MDef3 = Mno.MDef3;
		MDef4 = Mno.MDef4;
		DefType = Mno.DefType;
	}//SetM End
	
	//Items
		public void UpdateItem(int ItemsOffset, int SortingItemsVar){
			Item1 = NullItem;
			Item2 = NullItem;
			Item3 = NullItem;
			Item4 = NullItem;
			Item5 = NullItem;
			Item6 = NullItem;
			Item7 = NullItem;
			ItemList = Items.ItemList(Item1Found, SortingItemsVar, Gamemode);{
			ItemsFound = Items.ItemTotal(Item1Found);
				if(ItemsFound >=1){
					Item1 = ItemList[0 + ItemsOffset];
				}
				if(ItemsFound >=2){
					Item2 = ItemList[1 + ItemsOffset];
				}
				if(ItemsFound >=3){
					Item3 = ItemList[2 + ItemsOffset];
				}
				if(ItemsFound >=4){
					Item4 = ItemList[3 + ItemsOffset];
				}
				if(ItemsFound >=5){
					Item5 = ItemList[4 + ItemsOffset];
				}
				if(ItemsFound >=6){
					Item6 = ItemList[5 + ItemsOffset];
				}
				if(ItemsFound >=7){
					Item7 = ItemList[6 + ItemsOffset];
				}
			}
		}//UpdateItem End
	
	//Topics
		public void UpdateTopics(){
			Topic1 = NullTopic;
			Topic2 = NullTopic;
			Topic3 = NullTopic;
			Topic4 = NullTopic;
			Topic5 = NullTopic;
			Topic6 = NullTopic;
			Topic7 = NullTopic;
			Topic8 = NullTopic;
			Topic9 = NullTopic;
			Topic10 = NullTopic;
			DiscussionsFound = Topics.TopicTotal(Topic1Found);
			TopicList = Topics.TopicList(Topic1Found);{
				if(DiscussionsFound >=1){
					Topic1 = TopicList[0];}
				if(DiscussionsFound >=2){
					Topic2 = TopicList[1];}
				if(DiscussionsFound >=3){
					Topic3 = TopicList[2];}
				if(DiscussionsFound >=4){
					Topic4 = TopicList[3];}
				if(DiscussionsFound >=5){
					Topic5 = TopicList[4];}
				if(DiscussionsFound >=6){
					Topic6 = TopicList[5];}
				if(DiscussionsFound >=7){
					Topic7 = TopicList[6];}
				if(DiscussionsFound >=8){
					Topic8 = TopicList[7];}
				if(DiscussionsFound >=9){
					Topic9 = TopicList[8];}
				if(DiscussionsFound >=10){
					Topic10 = TopicList[9];}
			}
		}//UpdateTopicsEnd
		
		public void RecoverHealth(){
			if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 == 0){
				Text1X = 80;
				Text1 = "Recovered "+ -MDmg4 + " HP";
				Text2 = "";
			}
			if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 != 0){
				Text1X = 80;
				Text1 = "Recovered "+ -MDmg3 + -MDmg4 + " HP";
				Text2 = "";
			}
			if(MDmg1 == 0 && MDmg2 != 0){
				Text1X = 80;
				Text1 = "Recovered "+ + -MDmg2 + -MDmg3 + -MDmg4 + " HP";
				Text2 = "";
			}
			if(MDmg1 != 0){
				Text1X = 80;
				Text1 = "Recovered "+ + -MDmg1 + -MDmg2 + -MDmg3 + -MDmg4 + " HP";
				Text2 = "";
			}
		}//RecoverHealth End
		
		public void DamageEnemy(){
			if(CDmg1 != 0){
				Text1X = 80;
				Text1 = "did " + CDmg1 + CDmg2 + CDmg3 + CDmg4 + " Damage";
				Text2 = "";
			}
			else if(CDmg1 == 0 && CDmg2 != 0){
				Text1X = 80;
				Text1 = "did " + CDmg2 + CDmg3 + CDmg4 + " Damage";
				Text2 = "";
			}
			else if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 != 0){
				Text1X = 80;
				Text1 = "did " + CDmg3 + CDmg4 + " Damage";
				Text2 = "";
			}
			else if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0){
				Text1X = 80;
				Text1 = "did " + CDmg4 + " Damage";
				Text2 = "";
			}
		}//Damage Enemy End
		
		public void EnemyRecover(int RecovType){
			//Text1 = MonsterData.MInfo(Battle.Monsters[MTurn - 1]).getMonsterName()
			//Text2 = "Recovered " + ????? + " HP"
			if(RecovType == 0){//Normal Recover
			if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0){
				Text1X = 80;
				Text1 = "Enemy recovered "+ -CDmg4 + " HP"; //Gave Negative Damage?
				Text2 = "";
			}
			if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 != 0){
				Text1X = 80;
				Text1 = "Enemy recovered "+ -CDmg3 + -CDmg4 + " HP";
				Text2 = "";
			}
			if(CDmg1 == 0 && CDmg2 != 0){
				Text1X = 80;
				Text1 = "Enemy recovered "+ -CDmg2 + -CDmg3 + -CDmg4 + " HP";
				Text2 = "";
			}
			if(CDmg1 != 0){
				Text1X = 80;
				Text1 = "Enemy recovered "+ -CDmg1 + -CDmg2 + -CDmg3 + -CDmg4 + " HP";
				Text2 = "";
			}
			}//Normal Recover End
			else if(RecovType == 1){//Absorb
				if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " absorbed the attack!"; //Gave Negative Damage?
					Text2 = "Recovered "+ -CDmg4 + " HP";
				}
				if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 != 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " absorbed the attack!";
					Text2 = "Recovered "+ -CDmg3 + -CDmg4 + " HP";
				}
				if(CDmg1 == 0 && CDmg2 != 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " absorbed the attack!";
					Text2 = "Recovered "+ -CDmg2 + -CDmg3 + -CDmg4 + " HP";
				}
				if(CDmg1 != 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " absorbed the attack!";
					Text2 = "Recovered "+ -CDmg1 + -CDmg2 + -CDmg3 + -CDmg4 + " HP";
				}
				
			}//Absorb Recover End
			else if(RecovType == 2){//Vampire/Drain
				if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 == 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " drained"; //Gave Negative Damage?
					Text2 = "" + -CDmg4 + " HP from you!";
				}
				if(CDmg1 == 0 && CDmg2 == 0 && CDmg3 != 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " drained";
					Text2 = ""+ -CDmg3 + -CDmg4 + " HP from you!";
				}
				if(CDmg1 == 0 && CDmg2 != 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " drained";
					Text2 = ""+ -CDmg2 + -CDmg3 + -CDmg4 + " HP from you!";
				}
				if(CDmg1 != 0){
					Text1X = 30;
					Text1 = BattleM.MonsterD[CurrentM].MonsterShortName[0] + " drained";
					Text2 = ""+ -CDmg1 + -CDmg2 + -CDmg3 + -CDmg4 + " HP from you!";
				}
				
			}//Vampire Recover End
		}//Enemy Recover End
		
		public void UpdateBattle(int UpdateM){//TODO UpdateM
			Monster1Defeated[BattleM.MonsterD[UpdateM].MonsterID - 1] = Monster1Defeated[BattleM.MonsterD[UpdateM].MonsterID - 1] + 1;
			MonsterData[] MUpdater = new MonsterData[BattleM.MonsterD.length - 1];
			int[] Updater = new int[BattleM.MonsterD.length - 1];
			int i1 = 0;
			int i2 = 0;
			while(i1 < BattleM.MonsterD.length){
				if(i1 != UpdateM){
					MUpdater[i2] = BattleM.MonsterD[i1];
					i2 = i2 + 1;
				}
				i1 = i1 + 1;
			}
			BattleM.MonsterD = MUpdater;
			
			i1 = 0;
			i2 = 0;
			Updater = new int[MHP1.length - 1];
			while(i1 < MHP1.length){
				if(i1 != UpdateM){
					Updater[i2] = MHP1[i1];
					i2 = i2 + 1;
				}
				i1 = i1 + 1;
			}
			MHP1 = Updater;
			
			i1 = 0;
			i2 = 0;
			Updater = new int[MHP2.length - 1];
			while(i1 < MHP2.length){
				if(i1 != UpdateM){
					Updater[i2] = MHP2[i1];
					i2 = i2 + 1;
				}
				i1 = i1 + 1;
			}
			MHP2 = Updater;
			
			i1 = 0;
			i2 = 0;
			Updater = new int[MHP3.length - 1];
			while(i1 < MHP3.length){
				if(i1 != UpdateM){
					Updater[i2] = MHP3[i1];
					i2 = i2 + 1;
				}
				i1 = i1 + 1;
			}
			MHP3 = Updater;
			
			i1 = 0;
			i2 = 0;
			Updater = new int[MHP4.length - 1];
			while(i1 < MHP4.length){
				if(i1 != UpdateM){
					Updater[i2] = MHP4[i1];
					i2 = i2 + 1;
				}
				i1 = i1 + 1;
			}
			MHP4 = Updater;
			
			//May do Something else here? //TODO TargetToggle and FocusToggle CurrentM
			if(TargetM == CurrentM){
				TargetM = 0;
			}
			else if(TargetM > CurrentM){
				TargetM = TargetM -1;
			}
			
			CurrentM = 0;
			
			if(UpdateM > 0){
				UpdateM = UpdateM - 1;
			}
			
			MNo = BattleM.MonsterD[UpdateM].MonsterID;
			SetM(BattleM.MonsterD[UpdateM]);
		}//Update Battle End
		
		//Inventor
		public void UpdateInventor(){
			Inv1 = NullInv;
			Inv2 = NullInv;
			Inv3 = NullInv;
			Inv4 = NullInv;
			Inv5 = NullInv;
			Inv6 = NullInv;
			Inv7 = NullInv;
			Inv8 = NullInv;
			Inv9 = NullInv;
			Inv10 = NullInv;
			InvEventTotal = Inventor.InvTotal(InvEvent);
			InvList = Inventor.InvList(InvEvent, Monster1Defeated);{
				if(InvEventTotal >=1){
					Inv1 = InvList[0];}
				if(InvEventTotal >=2){
					Inv2 = InvList[1];}
				if(InvEventTotal >=3){
					Inv3 = InvList[2];}
				if(InvEventTotal >=4){
					Inv4 = InvList[3];}
				if(InvEventTotal >=5){
					Inv5 = InvList[4];}
				if(InvEventTotal >=6){
					Inv6 = InvList[5];}
				if(InvEventTotal >=7){
					Inv7 = InvList[6];}
				if(InvEventTotal >=8){
					Inv8 = InvList[7];}
				if(InvEventTotal >=9){
					Inv9 = InvList[8];}
				if(InvEventTotal >=10){
					Inv10 = InvList[9];}
			}
		}//UpdateInventor End
		
		//Notes
		public void UpdateNote(){
			Note1 = NullNote;//"TestNote1";
			Note2 = NullNote;
			Note3 = NullNote;
			Note4 = NullNote;
			Note5 = NullNote;
			Note6 = NullNote;
			Note7 = NullNote;
			Note8 = NullNote;
			Note9 = NullNote;
			Note10 = NullNote;
			NotesFound = Notes.NoteTotal(Note1Found); //total
			Notes[] NoteList = Notes.NoteBook(Note1Found);{
				if(NotesFound >=1){
					Note1 = NoteList[0];}
				if(NotesFound >=2){
					Note2 = NoteList[1];}
				if(NotesFound >=3){
					Note3 = NoteList[2];}
				if(NotesFound >=4){
					Note4 = NoteList[3];}
				if(NotesFound >=5){
					Note5 = NoteList[4];}
				if(NotesFound >=6){
					Note6 = NoteList[5];}
				if(NotesFound >=7){
					Note7 = NoteList[6];}
				if(NotesFound >=8){
					Note8 = NoteList[7];}
				if(NotesFound >=9){
					Note9 = NoteList[8];}
				if(NotesFound >=10){
					Note10 = NoteList[9];}
			}
		}//Update notes End
		
		//Market
		public void UpdateMarket(){
			ItemS1 = NullSale;
			ItemS2 = NullSale;
			ItemS3 = NullSale;
			ItemS4 = NullSale;
			ItemS5 = NullSale;
			ItemS6 = NullSale;
			ItemS7 = NullSale;
			EventSaleTotal = Market.MarketTotal(EventSale);
			Market[] ShopList = Market.MarketList(EventSale);{
				if(EventSaleTotal >=1){
					ItemS1 = ShopList[0];}
				if(EventSaleTotal >=2){
					ItemS2 = ShopList[1];}
				if(EventSaleTotal >=3){
					ItemS3 = ShopList[2];}
				if(EventSaleTotal >=4){
					ItemS4 = ShopList[3];}
				if(EventSaleTotal >=5){
					ItemS5 = ShopList[4];}
				if(EventSaleTotal >=6){
					ItemS6 = ShopList[5];}
				if(EventSaleTotal >=7){
					ItemS7 = ShopList[6];}
			}
		}
		
		//Areas
		public void UpdateAreas(){
			Area1 = NULLData; Area2 = NULLData;
			Area3 = NULLData; Area4 = NULLData;
			Area5 = NULLData; Area6 = NULLData;
			Area7 = NULLData; Area8 = NULLData;
			Area9 = NULLData; Area10 = NULLData;
			AreaD = AreaData.AList(Area1Found, CurrentArea.AreaNo, AccessArea);{
				//Initialize area Display for MoveScreen
				AreasFound = AreaData.ATotal(Area1Found, CurrentArea.AreaNo, AccessArea);
				if(AreasFound >=1){ 
					Area1 = AreaD[0]; }
				if(AreasFound >=2){
					Area2 = AreaD[1];}
				if(AreasFound >=3){
					Area3 = AreaD[2];}
				if(AreasFound >=4){
					Area4 = AreaD[3];}
				if(AreasFound >=5){
					Area5 = AreaD[4];}
				if(AreasFound >=6){
					Area6 = AreaD[5];}
				if(AreasFound >=7){
					Area7 = AreaD[6];}
				if(AreasFound >=8){
					Area8 = AreaD[7];}
				if(AreasFound >=9){
					Area9 = AreaD[8];}
				if(AreasFound >=10){
					Area10 = AreaD[9];}
				if(AreasFound >=11){
					Area10 = AreaD[10];}//Password Area
			}
		}//UpdateAreas End
		
		public void UpdateMonster(){
			Monster1 = NullData;
			Monster2 = NullData;
			Monster3 = NullData;
			Monster4 = NullData;
			Monster5 = NullData;
			Monster6 = NullData;
			Monster7 = NullData;
			Monster8 = NullData;
			Monster9 = NullData;
			Monster10 = NullData;
			int MonstersFound = MonsterData.MTotal(Monster1Found);
			MonsterData[] MonsterD = MonsterData.MInfo(Monster1Found, Gamemode);{
			if(MonstersFound >=1){
				Monster1 = MonsterD[0];
			}
			if(MonstersFound >=2){
				Monster2 = MonsterD[1];
			}
			if(MonstersFound >=3){
				Monster3 = MonsterD[2];
			}
			if(MonstersFound >=4){
				Monster4 = MonsterD[3];
			}
			if(MonstersFound >=5){
				Monster5 = MonsterD[4];
			}
			if(MonstersFound >=6){
				Monster6 = MonsterD[5];
			}
			if(MonstersFound >=7){
				Monster7 = MonsterD[6];
			}
			if(MonstersFound >=8){
				Monster8 = MonsterD[7];
			}
			if(MonstersFound >=9){
				Monster9 = MonsterD[8];
			}
			if(MonstersFound >=10){
				Monster10 = MonsterD[9];
			}
			}
		}//UpdateMonster End
		
		public void TookDamage(int ModeM){
			if(ModeM == 1){//Took Damage from Item
				if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 == 0){
					Text1X = 50;
					Text1 = "Took "+ MDmg4 + " Damage";
					Text2 = "";
				}
				if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 != 0){
					Text1X = 50;
					Text1 = "Took "+ MDmg3 + MDmg4 + " Damage";
					Text2 = "";
				}
				if(MDmg1 == 0 && MDmg2 != 0){
					Text1X = 50;
					Text1 = "Took "+ + MDmg2 + MDmg3 + MDmg4 + " Damage";
					Text2 = "";
				}
				if(MDmg1 != 0){
					Text1X = 50;
					Text1 = "Took "+ + MDmg1 + MDmg2 + MDmg3 + MDmg4 + " Damage";
					Text2 = "";
				}
			}//Mode1 Took Damage from Item End
			if(ModeM == 2){//Took Damage from Monster
				if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 == 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took "+ MDmg4 + " Damage";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0]; //MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMonsterName();
				}
				if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 != 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took "+ MDmg3 + MDmg4 + " Damage";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0];
				}
				if(MDmg1 == 0 && MDmg2 != 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took "+ + MDmg2 + MDmg3 + MDmg4 + " Damage";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0];
				}
				if(MDmg1 != 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took "+ + MDmg1 + MDmg2 + MDmg3 + MDmg4 + " Damage";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0];
				}
			}//Took Damage from Monster End
			if(ModeM == 3){//Took Damage from Monster Critical
				if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 == 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took a "+ MDmg4 + " Critical Hit";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0]; //MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMonsterName();
				}
				if(MDmg1 == 0 && MDmg2 == 0 && MDmg3 != 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took a "+ MDmg3 + MDmg4 + " Critical Hit";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0];
				}
				if(MDmg1 == 0 && MDmg2 != 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took a "+ + MDmg2 + MDmg3 + MDmg4 + " Critical Hit";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0];
				}
				if(MDmg1 != 0){
					Text1X = 50;
					Text2X = 50;
					Text1 = "Took a "+ + MDmg1 + MDmg2 + MDmg3 + MDmg4 + " Critical Hit";
					Text2 = "from " + BattleM.MonsterD[MTurn - 1].MonsterName[0];
				}
			}//Took Damage from Monster Critical End
		}//TookDamage End
	
		//Battle Event Effect

		public void BattleEventEffect(int EnemyAffected, int BattleEventType, int[] BattleEventData){
			//x;
			//Summon Enemy
			if(BattleEventType == 1 && BattleM.MonsterD.length <= 50){
				//if(BattleM.MonsterD[MTurn - 1].BattleEventChanceType[0][0] == 1 && BattleM.MonsterD.length <= 50){//Summon
				BattleData CurrentBattleData = BattleM;
				
				MonsterData[] CurrentMonsterBattleDataForUpdate = BattleM.MonsterD;
				MonsterData[] NEWMonsterBattleDataForUpdate = new MonsterData[CurrentMonsterBattleDataForUpdate.length + 1];
				
				int M_Tuner = 0;
				while(M_Tuner < CurrentMonsterBattleDataForUpdate.length){
					NEWMonsterBattleDataForUpdate[M_Tuner] = CurrentMonsterBattleDataForUpdate[M_Tuner];
					M_Tuner += 1;
				}
				NEWMonsterBattleDataForUpdate[CurrentMonsterBattleDataForUpdate.length] = MonsterData.MData(BattleEventData[0], BattleEventData[1]);//?
					
				BattleM = new BattleData(CurrentBattleData.BattleNo, NEWMonsterBattleDataForUpdate, CurrentBattleData.Event, CurrentBattleData.Drop1, CurrentBattleData.Drop1Percent, CurrentBattleData.Exp, CurrentBattleData.MoneyDrop, CurrentBattleData.MoneyChance, CurrentBattleData.EscapeChance, CurrentBattleData.EndEvent, CurrentBattleData.BattleScreenMode, CurrentBattleData.RandomText);;
				
				int[] HPBuilder = new int[MHP1.length + 1];
				M_Tuner = 0;
				while(M_Tuner < MHP1.length){
					HPBuilder[M_Tuner] = MHP1[M_Tuner];
					M_Tuner += 1;
				}
				HPBuilder[CurrentMonsterBattleDataForUpdate.length] = NEWMonsterBattleDataForUpdate[CurrentMonsterBattleDataForUpdate.length].MHp1;
				MHP1 = HPBuilder;
					
				HPBuilder = new int[MHP1.length + 1];
				M_Tuner = 0;
				while(M_Tuner < MHP2.length){
					HPBuilder[M_Tuner] = MHP2[M_Tuner];
					M_Tuner += 1;
				}
				HPBuilder[CurrentMonsterBattleDataForUpdate.length] = NEWMonsterBattleDataForUpdate[CurrentMonsterBattleDataForUpdate.length].MHp2;
				MHP2 = HPBuilder;
					
				HPBuilder = new int[MHP1.length + 1];
				M_Tuner = 0;
				while(M_Tuner < MHP3.length){
					HPBuilder[M_Tuner] = MHP3[M_Tuner];
					M_Tuner += 1;
				}
				HPBuilder[CurrentMonsterBattleDataForUpdate.length] = NEWMonsterBattleDataForUpdate[CurrentMonsterBattleDataForUpdate.length].MHp3;
				MHP3 = HPBuilder;
					
				HPBuilder = new int[MHP1.length + 1];
				M_Tuner = 0;
				while(M_Tuner < MHP4.length){
					HPBuilder[M_Tuner] = MHP4[M_Tuner];
					M_Tuner += 1;
				}
				HPBuilder[CurrentMonsterBattleDataForUpdate.length] = NEWMonsterBattleDataForUpdate[CurrentMonsterBattleDataForUpdate.length].MHp4;
				MHP4 = HPBuilder;
					
				//Text1 = BattleM.MonsterD[MTurn - 1].MonsterName + "Summoned";
				//Text2 = NEWMonsterBattleDataForUpdate[CurrentMonsterBattleDataForUpdate.length].MonsterName[0];
				//}
			}//Battle Event Summon End
			
			//Prismatic Def
			else if(BattleEventType == 2){
				BattleM.MonsterD[EnemyAffected] = BattleEvent.FormChange(BattleEventData[0]);
			}
			
//			//Attack Multiple Times //Acts like a normal attack, but can be chained together in one event
			else if(BattleEventType == 3){
				MDmg1 = 0;
				MDmg2 = 0;
				MDmg3 = 0;
				MDmg4 = 0;
				MAtk1 = BattleM.MonsterD[EnemyAffected].MAtk1;// MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMATK1();
				MAtk2 = BattleM.MonsterD[EnemyAffected].MAtk2;
				MAtk3 = BattleM.MonsterD[EnemyAffected].MAtk3;
				MAtk4 = BattleM.MonsterD[EnemyAffected].MAtk4;
				AtkType = BattleM.MonsterD[EnemyAffected].AtkType;
				MName = BattleM.MonsterD[EnemyAffected].MonsterName[0];
				MSpeed = BattleM.MonsterD[EnemyAffected].MSpeed;
				int MStatus = BattleM.MonsterD[EnemyAffected].NegativeStatus;
				int MStatusChance = BattleM.MonsterD[EnemyAffected].StatusChance;
				
				//int MAttackElement1 = 
				//int MAttackElement2 = 
				
				int[] MDmg = new int[4];{
					MDmg[0] = 0;
					MDmg[1] = 0;
					MDmg[2] = 0;
					MDmg[3] = 0;
				}
				
				int CombinedDefence = CDef1*1000 + CDef2*100 + CDef3*10 + CDef4;
				int CurrentCDef1;
				int CurrentCDef2;
				int CurrentCDef3;
				int CurrentCDef4;
				
				//Calculate Defence
				//CurrentCDef = CDef + CurrentArmor
				
				Random DodgeRandom = new Random();
				int DodgeRoll = DodgeRandom.nextInt(100);
				
				if(Luck < 0){
					AntiLuck = Luck;
				}
				else
					AntiLuck = 0;
				
				if(DodgeRoll <= (DodgeChance + Speed - MSpeed + AntiLuck)){
					Text1X = 30;
					Text2X = 70;
					Text1 = MName + "'s attack";
					Text2 = "missed!";
				}
				else{//Attack not dodged!
					
					Random CriticalRandom = new Random();
					int CriticalR = CriticalRandom.nextInt(100);
					
					if(CriticalR <= BattleM.MonsterD[EnemyAffected].CriticalChance - AntiLuck){//Critcal Hit!
						
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleM.MonsterD[EnemyAffected].AttackElement1, BattleM.MonsterD[EnemyAffected].AttackElement2, CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 1, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];
						TookDamage(3);
					}
					else{
						//Calculate Damage Regular HP
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleM.MonsterD[EnemyAffected].AttackElement1, BattleM.MonsterD[EnemyAffected].AttackElement2, CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 0, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];

						TookDamage(2);
						//DisplayMN = MTurn - 1;
						//DisplayM = BattleM.MonsterD[MTurn - 1];
						//MName = BattleM.MonsterD[MTurn - 1].MonsterName;
					}
					
					int StatusR = 0;
					
					if(MStatusChance > 0){
						Random StatusRandom = new Random();
						StatusR = StatusRandom.nextInt(MStatusChance);
					}
					else
						StatusR = MStatusChance;

					if(MStatus != 0){
					if(StatusR - AntiLuck > StatusResist[EnemyAffected]){//Enemies that can cause negative statuses, but at 0% chance... It's about Luck!
						if(Status == 6){//Barrier
							Status = 0;
						}
						else{
							Status = MStatus;
							StatusTurns = 5;
						}
					}
					}//If Current Enemy can inflict Negative Status
				
					//Calculate Damage Received Regular HP
					int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
					CHP1 = CHP[0];
					CHP2 = CHP[1];
					CHP3 = CHP[2];
					CHP4 = CHP[3];
				}//MAttack not Dodged End
			}//Multi Attack Ability End

//			//Special Attack
			else if(BattleEventType == 4){
				//BattleEventData{MAtk1 0, MAtk2 1, MAtk3 2, MAtk4 3, AttackDigitMax 4, Type 5, MSpeed 6, CriticalChance 7, MStatus 8, MStatusChance 9, MAttack Element1 10, MAttack Element2 11, AttackTextNorm 12, AttackTextCritical! 13}
				MDmg1 = 0;
				MDmg2 = 0;
				MDmg3 = 0;
				MDmg4 = 0;
				MAtk1 = BattleEventData[0]; //BattleM.MonsterD[MTurn - 1].MAtk1;// MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMATK1();
				MAtk2 = BattleEventData[1];
				MAtk3 = BattleEventData[2];
				MAtk4 = BattleEventData[3];
				AtkType = BattleEventData[5];
				MName = BattleM.MonsterD[EnemyAffected].MonsterName[0];
				MSpeed = BattleEventData[6];
				int MStatus = BattleEventData[8];
				int MStatusChance = BattleEventData[9];
				
				//int MAttackElement1 = 
				//int MAttackElement2 = 
				
				int[] MDmg = new int[4];{
					MDmg[0] = 0;
					MDmg[1] = 0;
					MDmg[2] = 0;
					MDmg[3] = 0;
				}
				
				int CombinedDefence = CDef1*1000 + CDef2*100 + CDef3*10 + CDef4;
				int CurrentCDef1;
				int CurrentCDef2;
				int CurrentCDef3;
				int CurrentCDef4;
				
				//Calculate Defence
				//CurrentCDef = CDef + CurrentArmor
				
				Random DodgeRandom = new Random();
				int DodgeRoll = DodgeRandom.nextInt(100);
				
				if(Luck < 0){
					AntiLuck = Luck;
				}
				else
					AntiLuck = 0;
				
				if(DodgeRoll <= (DodgeChance + Speed - MSpeed + AntiLuck)){
					Text1X = 30;
					Text2X = 70;
					Text1 = MName + "'s attack";
					Text2 = "missed!";
				}
				else{//Attack not dodged!
					
					Random CriticalRandom = new Random();
					int CriticalR = CriticalRandom.nextInt(100);
					
					if(CriticalR <= BattleEventData[7] - AntiLuck){//Critcal Hit!
						
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleEventData[10], BattleEventData[11], CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 1, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];
						Text1 = Conversations.LoadText(BattleEventData[13])[0];
						Text2 = Conversations.LoadText(BattleEventData[13])[1];
						HiddenText1 = Conversations.LoadText(BattleEventData[13])[2];
						HiddenText2 = Conversations.LoadText(BattleEventData[13])[3];
						
					}
					else{
						//Calculate Damage Regular HP
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleEventData[10], BattleEventData[11], CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 0, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];

						Text1 = Conversations.LoadText(BattleEventData[12])[0];
						Text2 = Conversations.LoadText(BattleEventData[12])[1];
						HiddenText1 = Conversations.LoadText(BattleEventData[12])[2];
						HiddenText2 = Conversations.LoadText(BattleEventData[12])[3];
						
						//DisplayMN = MTurn - 1;
						//DisplayM = BattleM.MonsterD[MTurn - 1];
						//MName = BattleM.MonsterD[MTurn - 1].MonsterName;
					}
					
					int StatusR = 0;
					
					if(MStatusChance > 0){
						Random StatusRandom = new Random();
						StatusR = StatusRandom.nextInt(MStatusChance);
					}
					else
						StatusR = MStatusChance;
					if(MStatus != 0){
					if(StatusR - AntiLuck > StatusResist[MStatus-1]){//Enemies that can cause negative statuses, but at 0% chance... It's about Luck!
						if(Status == 6){//Barrier
							Status = 0;
						}
						else{
							Status = MStatus;
							StatusTurns = 5;
						}
					}
					}//If Current Enemy can inflict Negative Status
					
					//Calculate Damage Received Regular HP
					int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
					CHP1 = CHP[0];
					CHP2 = CHP[1];
					CHP3 = CHP[2];
					CHP4 = CHP[3];
				}//MAttack not Dodged End
			}//Special Attack Ability End

//			//Recover 5, Special Recover 6
			else if(BattleEventType == 5 || BattleEventType == 6){
				//BattleEventData = Amount Recovered
				int UpdaterA = BattleEventData[0];
				int[] AttackUpdater = new int[]{0, 0, 0, 0};
				AttackUpdater[0] = UpdaterA/1000;
				UpdaterA = UpdaterA - (UpdaterA/1000)*1000;
				AttackUpdater[1] = UpdaterA/100;
				UpdaterA = UpdaterA - (UpdaterA/100)*100;
				AttackUpdater[2] = UpdaterA/10;
				UpdaterA = UpdaterA - (UpdaterA/10)*10;
				AttackUpdater[3] = UpdaterA;
				
				CDmg1 = -1 * AttackUpdater[0];
				CDmg2 = -1 * AttackUpdater[1];
				CDmg3 = -1 * AttackUpdater[2];
				CDmg4 = -1 * AttackUpdater[3];
				
				if(BattleEventType == 5){
					EnemyRecover(0);
				}
				
				int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[EnemyAffected], MHP2[EnemyAffected], MHP3[EnemyAffected], MHP4[EnemyAffected], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[EnemyAffected].MHpMax);
				MHP1[EnemyAffected] = MHP[0];
				MHP2[EnemyAffected] = MHP[1];
				MHP3[EnemyAffected] = MHP[2];
				MHP4[EnemyAffected] = MHP[3];

				DisplayM.MHp1 = MHP1[EnemyAffected];
				DisplayM.MHp2 = MHP2[EnemyAffected];
				DisplayM.MHp3 = MHP3[EnemyAffected];
				DisplayM.MHp4 = MHP4[EnemyAffected];
			}//Recover Ability End

			//Vampire Recover
			else if(BattleEventType == 7){
				//Diget Max and CriticalChance
				//BattleEventData{MAtk1 0, MAtk2 1, MAtk3 2, MAtk4 3, DigetMax 4, Type 5, MSpeed 6, CriticalChance 7, MStatus 8, MStatusChance 9, MAttack Element1 10, MAttack Element2 11, AttackTextNorm 12, AttackTextCritical! 13}
				MDmg1 = 0;
				MDmg2 = 0;
				MDmg3 = 0;
				MDmg4 = 0;
				MAtk1 = BattleEventData[0]; //BattleM.MonsterD[MTurn - 1].MAtk1;// MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMATK1();
				MAtk2 = BattleEventData[1];
				MAtk3 = BattleEventData[2];
				MAtk4 = BattleEventData[3];
				AtkType = BattleEventData[5];
				MName = BattleM.MonsterD[EnemyAffected].MonsterName[0];
				MSpeed = BattleEventData[6];
				int MStatus = BattleEventData[8];
				int MStatusChance = BattleEventData[9];
				
				//int MAttackElement1 = 
				//int MAttackElement2 = 
				
				int[] MDmg = new int[4];{
					MDmg[0] = 0;
					MDmg[1] = 0;
					MDmg[2] = 0;
					MDmg[3] = 0;
				}
				
				int CombinedDefence = CDef1*1000 + CDef2*100 + CDef3*10 + CDef4;
				int CurrentCDef1;
				int CurrentCDef2;
				int CurrentCDef3;
				int CurrentCDef4;
				
				//Calculate Defence
				//CurrentCDef = CDef + CurrentArmor
				
				Random DodgeRandom = new Random();
				int DodgeRoll = DodgeRandom.nextInt(100);
				
				if(Luck < 0){
					AntiLuck = Luck;
				}
				else
					AntiLuck = 0;
				
				if(DodgeRoll <= (DodgeChance + Speed - MSpeed + AntiLuck)){
					Text1X = 30;
					Text2X = 30;
					Text1 = MName + "'s attack";
					Text2 = "missed!";
				}
				else{//Attack not dodged!
					
					Random CriticalRandom = new Random();
					int CriticalR = CriticalRandom.nextInt(100);
					
					if(CriticalR <= BattleEventData[7] - AntiLuck){//Critcal Hit!
						
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleEventData[10], BattleEventData[11], CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 1, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];
//						Text1 = Conversations.LoadText(BattleEventData[11])[0];
//						Text2 = Conversations.LoadText(BattleEventData[11])[1];
//						HiddenText1 = Conversations.LoadText(BattleEventData[11])[2];
//						HiddenText2 = Conversations.LoadText(BattleEventData[11])[3];
					}
					else{
						//Calculate Damage Regular HP
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleEventData[10], BattleEventData[11], CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 0, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];

//						Text1 = Conversations.LoadText(BattleEventData[10])[0];
//						Text2 = Conversations.LoadText(BattleEventData[10])[1];
//						HiddenText1 = Conversations.LoadText(BattleEventData[10])[2];
//						HiddenText2 = Conversations.LoadText(BattleEventData[10])[3];
						//DisplayMN = MTurn - 1;
						//DisplayM = BattleM.MonsterD[MTurn - 1];
						//MName = BattleM.MonsterD[MTurn - 1].MonsterName;
					}
					
					int StatusR = 0;
					
					if(MStatusChance > 0){
						Random StatusRandom = new Random();
						StatusR = StatusRandom.nextInt(MStatusChance);
					}
					else
						StatusR = MStatusChance;
					if(MStatus != 0){
					if(StatusR - AntiLuck > StatusResist[MStatus-1]){//Enemies that can cause negative statuses, but at 0% chance... It's about Luck!
						if(Status == 6){//Barrier
							Status = 0;
						}
						else{
							Status = MStatus;
							StatusTurns = 5;
						}
					}
					}//If Current Enemy can inflict Negative Status
				
					//Calculate Damage Received Regular HP
					int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
					CHP1 = CHP[0];
					CHP2 = CHP[1];
					CHP3 = CHP[2];
					CHP4 = CHP[3];
					
					CDmg1 = -1 * MDmg1;
					CDmg2 = -1 * MDmg2;
					CDmg3 = -1 * MDmg3;
					CDmg4 = -1 * MDmg4;

					MDmg1 = -1 * MDmg1;
					MDmg2 = -1 * MDmg2;
					MDmg3 = -1 * MDmg3;
					MDmg4 = -1 * MDmg4;
					
					EnemyRecover(2);
					
					int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[EnemyAffected], MHP2[EnemyAffected], MHP3[EnemyAffected], MHP4[EnemyAffected], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[EnemyAffected].MHpMax);
					MHP1[EnemyAffected] = MHP[0];
					MHP2[EnemyAffected] = MHP[1];
					MHP3[EnemyAffected] = MHP[2];
					MHP4[EnemyAffected] = MHP[3];

					DisplayM.MHp1 = MHP1[EnemyAffected];
					DisplayM.MHp2 = MHP2[EnemyAffected];
					DisplayM.MHp3 = MHP3[EnemyAffected];
					DisplayM.MHp4 = MHP4[EnemyAffected];
				}//MAttack not Dodged End
			}

			//SnowStorm (Recovers specific amount while attacking)
			else if(BattleEventType == 8){
				//x;
				//BattleEventData{MAtk1 0, MAtk2 1, MAtk3 2, MAtk4 3, Type 4, MSpeed 5, MStatus 6, MStatusChance 7, MAttack Element1 8, MAttack Element2 9, AttackTextNorm 10, AttackTextCritical! 11, AttackTextMissed! 12, Recover 13, CriticalChance 14}
				MDmg1 = 0;
				MDmg2 = 0;
				MDmg3 = 0;
				MDmg4 = 0;
				MAtk1 = BattleEventData[0]; //BattleM.MonsterD[MTurn - 1].MAtk1;// MonsterData.MInfo(BattleM.MonsterD[MTurn - 1].MonsterID).getMATK1();
				MAtk2 = BattleEventData[1];
				MAtk3 = BattleEventData[2];
				MAtk4 = BattleEventData[3];
				AtkType = BattleEventData[4];
				MName = BattleM.MonsterD[EnemyAffected].MonsterName[0];
				MSpeed = BattleEventData[5];
				int MStatus = BattleEventData[6];
				int MStatusChance = BattleEventData[7];
				
				//int MAttackElement1 = 
				//int MAttackElement2 = 
				
				int[] MDmg = new int[4];{
					MDmg[0] = 0;
					MDmg[1] = 0;
					MDmg[2] = 0;
					MDmg[3] = 0;
				}
				
				int CombinedDefence = CDef1*1000 + CDef2*100 + CDef3*10 + CDef4;
				int CurrentCDef1;
				int CurrentCDef2;
				int CurrentCDef3;
				int CurrentCDef4;
				
				//Calculate Defence
				//CurrentCDef = CDef + CurrentArmor
				
				Random DodgeRandom = new Random();
				int DodgeRoll = DodgeRandom.nextInt(100);
				
				if(Luck < 0){
					AntiLuck = Luck;
				}
				else
					AntiLuck = 0;
				
				if(DodgeRoll <= (DodgeChance + Speed - MSpeed + AntiLuck)){
					Text1X = 30;
					Text2X = 30;
					Text1 = Conversations.LoadText(BattleEventData[12])[0];
					Text2 = Conversations.LoadText(BattleEventData[12])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[12])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[12])[3];
				}
				else{//Attack not dodged!
					
					Random CriticalRandom = new Random();
					int CriticalR = CriticalRandom.nextInt(100);
					
					if(CriticalR <= BattleEventData[14] - AntiLuck){//Critcal Hit!
						
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleEventData[8], BattleEventData[9], CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 1, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];
						Text1 = Conversations.LoadText(BattleEventData[11])[0];
						Text2 = Conversations.LoadText(BattleEventData[11])[1];
						HiddenText1 = Conversations.LoadText(BattleEventData[11])[2];
						HiddenText2 = Conversations.LoadText(BattleEventData[11])[3];
					}
					else{
						//Calculate Damage Regular HP
						MDmg = BattleCalculations.CalculatePlayerDmg(MAtk1, MAtk2, MAtk3, MAtk4, BattleEventData[8], BattleEventData[9], CDef1, CDef2, CDef3, CDef4, CurrentHood, CurrentHelmet, CurrentRobe, CurrentArmor, CurrentShirt, CurrentGuantlets, CurrentGloves, CurrentPants, CurrentSocks, CurrentBoots, 0, PlayerWeaknesses);
						MDmg1 = MDmg[0];
						MDmg2 = MDmg[1];
						MDmg3 = MDmg[2];
						MDmg4 = MDmg[3];

						Text1 = Conversations.LoadText(BattleEventData[10])[0];
						Text2 = Conversations.LoadText(BattleEventData[10])[1];
						HiddenText1 = Conversations.LoadText(BattleEventData[10])[2];
						HiddenText2 = Conversations.LoadText(BattleEventData[10])[3];
						//DisplayMN = MTurn - 1;
						//DisplayM = BattleM.MonsterD[MTurn - 1];
						//MName = BattleM.MonsterD[MTurn - 1].MonsterName;
					}
					
					int StatusR = 0;
					
					if(MStatusChance > 0){
						Random StatusRandom = new Random();
						StatusR = StatusRandom.nextInt(MStatusChance);
					}
					else
						StatusR = MStatusChance;
					if(MStatus != 0){
					if(StatusR - AntiLuck > StatusResist[MStatus-1]){//Enemies that can cause negative statuses, but at 0% chance... It's about Luck!
						if(Status == 6){//Barrier
							Status = 0;
						}
						else{
							Status = MStatus;
							StatusTurns = 5;
						}
					}
					}//If Current Enemy can inflict Negative Status
				
					//Calculate Damage Received Regular HP
					int[] CHP = BattleCalculations.CalculateHp(CHP1, CHP2, CHP3, CHP4, MDmg1, MDmg2, MDmg3, MDmg4);
					CHP1 = CHP[0];
					CHP2 = CHP[1];
					CHP3 = CHP[2];
					CHP4 = CHP[3];
					
					
				}//MAttack not Dodged End
				
				int UpdaterA = BattleEventData[13];
				int[] AttackUpdater = new int[]{0, 0, 0, 0};
				AttackUpdater[0] = UpdaterA/1000;
				UpdaterA = UpdaterA - (UpdaterA/1000)*1000;
				AttackUpdater[1] = UpdaterA/100;
				UpdaterA = UpdaterA - (UpdaterA/100)*100;
				AttackUpdater[2] = UpdaterA/10;
				UpdaterA = UpdaterA - (UpdaterA/10)*10;
				AttackUpdater[3] = UpdaterA;
				
				CDmg1 = -1 * AttackUpdater[0];
				CDmg2 = -1 * AttackUpdater[1];
				CDmg3 = -1 * AttackUpdater[2];
				CDmg4 = -1 * AttackUpdater[3];
				
				if(BattleEventType == 5){
					EnemyRecover(0);
				}
				
				int[] MHP = BattleCalculations.CalculateGlitchedHp(MHP1[EnemyAffected], MHP2[EnemyAffected], MHP3[EnemyAffected], MHP4[EnemyAffected], CDmg1, CDmg2, CDmg3, CDmg4, BattleM.MonsterD[EnemyAffected].MHpMax);
				MHP1[EnemyAffected] = MHP[0];
				MHP2[EnemyAffected] = MHP[1];
				MHP3[EnemyAffected] = MHP[2];
				MHP4[EnemyAffected] = MHP[3];

				DisplayM.MHp1 = MHP1[EnemyAffected];
				DisplayM.MHp2 = MHP2[EnemyAffected];
				DisplayM.MHp3 = MHP3[EnemyAffected];
				DisplayM.MHp4 = MHP4[EnemyAffected];
			}

//			//Inflict Negative Status
			else if(BattleEventType == 9){
				//BattleEventData[StatusType 0, StatusTurns 1, StatushasEffectText 2, StatusDoesn'tEffect Text 3]
				if(Status == 6){
					Status = 0;
					StatusTurns = 0;
					Text1 = Conversations.LoadText(BattleEventData[3])[0];
					Text2 = Conversations.LoadText(BattleEventData[3])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[3])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[3])[3];
				}
				else{
					Status = BattleEventData[0];
					StatusTurns = BattleEventData[1];
//					Text1 = BattleM.MonsterD[MTurn - 1].MonsterName + " has";//You became poisoned!
//					Text2 = "a Poisonous attack!";
					Text1 = Conversations.LoadText(BattleEventData[2])[0];
					Text2 = Conversations.LoadText(BattleEventData[2])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[2])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[2])[3];
				}
			}

			//Change Weapon Element
			else if(BattleEventType == 10){
				//BattleEventData[] 
					//Type
				if(BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentWeapon.ItemNo)[0] != 0){
					int[] newItem = BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentWeapon.ItemNo);
					ItemAmount1[CurrentWeapon.ItemNo] -= 1;
					
					Item1Found[newItem[0] - 1] = 1;
					ItemAmount1[newItem[0] - 1] = 
							ItemAmount1[newItem[0] - 1] + 1;
					int i1 = 0;
					int i2 = 0;
					while(i1 < Item1Found.length){
					if(Item1Found[i1] == 1){
						ItemAmount2[i2] = ItemAmount1[i1];
						i2 = i2 + 1;
					}
					i1 = i1 + 1;
					}
					ItemsFound = Items.ItemTotal(Item1Found);
					UpdateItem(ItemPlacement, ItemSortMode);
					CurrentWeapon = Items.ItemData(newItem[0], newItem[1]);
					CurrentElement = CurrentWeapon.ItemElement;
					
					Text1 = Conversations.LoadText(BattleEventData[1])[0];
					Text2 = Conversations.LoadText(BattleEventData[1])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[1])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[1])[3];
				}
				//Unarmed Weapon (Gauntlets)
				else if(CurrentWeapon == NullItem && BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentGuantlets.ItemNo)[0] != 0){
					int[] newItem = BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentGuantlets.ItemNo);
					ItemAmount1[CurrentGuantlets.ItemNo] -= 1;
					
					Item1Found[newItem[0] - 1] = 1;
					ItemAmount1[newItem[0] - 1] = 
							ItemAmount1[newItem[0] - 1] + 1;
					int i1 = 0;
					int i2 = 0;
					while(i1 < Item1Found.length){
					if(Item1Found[i1] == 1){
						ItemAmount2[i2] = ItemAmount1[i1];
						i2 = i2 + 1;
					}
					i1 = i1 + 1;
					}
					ItemsFound = Items.ItemTotal(Item1Found);
					UpdateItem(ItemPlacement, ItemSortMode);
					CurrentGuantlets = Items.ItemData(newItem[0], newItem[1]);
					CurrentElement = CurrentGuantlets.ItemElement;
					
					Text1 = Conversations.LoadText(BattleEventData[2])[0];
					Text2 = Conversations.LoadText(BattleEventData[2])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[2])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[2])[3];
				}
				
				//ItemAmount old weapon -
				//CurrentWeapon = New Weapon
				//ItemAmount new weapon +
			}//Change Weapon Element End

//			//Break Current Weapon
			else if(BattleEventType == 11){
				//BattleEventData[Changetype 0, WeaponBrokeText 1, GauntletsBroke Text 2]
				if(BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentWeapon.ItemNo)[0] != 0){
					int newItem[] = BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentWeapon.ItemNo);
					ItemAmount1[CurrentWeapon.ItemNo] -= 1;
					
					CurrentWeapon = NullItem;
					
					Text1 = Conversations.LoadText(BattleEventData[1])[0];
					Text2 = Conversations.LoadText(BattleEventData[1])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[1])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[1])[3];
				}
				else if(CurrentWeapon == NullItem && BattleEvent.ChangeCurrentWeapon(BattleEventData[0], CurrentGuantlets.ItemNo)[0] != 0){
					CurrentGuantlets = NullItem;
					if(CurrentWeapon == NullItem){//Unarmed
						WeaponElement = 0;
					}
					Text1 = Conversations.LoadText(BattleEventData[2])[0];
					Text2 = Conversations.LoadText(BattleEventData[2])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[2])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[2])[3];
				}
			}//Break Weapon End

			//Disarm (Unequiped Weapon)
			else if(BattleEventType == 12){
				if(CurrentWeapon != NullItem){
					CurrentWeapon = NullItem;
					if(CurrentGuantlets != NullItem){//Unarmed
						WeaponElement = CurrentGuantlets.ItemElement;
					}
					else{
						WeaponElement = 0;
					}
					Text1 = Conversations.LoadText(BattleEventData[0])[0];
					Text2 = Conversations.LoadText(BattleEventData[0])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[0])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[0])[3];
				}
				else if(CurrentGuantlets != NullItem){
					CurrentGuantlets = NullItem;
					WeaponElement = 0;
					Text1 = Conversations.LoadText(BattleEventData[1])[0];
					Text2 = Conversations.LoadText(BattleEventData[1])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[1])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[1])[3];
				}
				else{
					Text1 = Conversations.LoadText(BattleEventData[2])[0];
					Text2 = Conversations.LoadText(BattleEventData[2])[1];
					HiddenText1 = Conversations.LoadText(BattleEventData[2])[2];
					HiddenText2 = Conversations.LoadText(BattleEventData[2])[3];
				}
				
			}//Disarm End
			//x;//EnemyAffected??
//			//Escape
			else if(BattleEventType == 13){
				//x;
				//BattleData(int BattleNo, MonsterData[] MonsterD, int Event, int Drop1, int Drop1Percent, int Exp, int MoneyDrop, int MoneyChance, int EscapeChance, int EndEvent, int BattleScreenMode, String[] RandomText
				//BattleEventData[Event 0 , Drop 1, DropPercentChange 2, ExpRemoved 3, MoneyLost 4, MoneychanceChange 5, EscapeIncrease 6, End Event 7, NewScreenMode 8, LoadedText 9]
				BattleM.Event = BattleEventData[0];
				BattleM.Drop1 = BattleEventData[1];
				BattleM.Drop1Percent += BattleEventData[2];
				BattleM.Exp += BattleEventData[3];
				BattleM.MoneyDrop += BattleEventData[4];
				BattleM.MoneyChance += BattleEventData[5];
				BattleM.EscapeChance += BattleEventData[6];
				BattleM.EndEvent = BattleEventData[7];
				BattleM.BattleScreenMode = BattleEventData[8];
				ScreenMode = BattleM.BattleScreenMode;
				
				
				//Enemy Escaped, but there are more left
				if(BattleM.MonsterD.length > 1){
					MonsterData[] MUpdater = new MonsterData[BattleM.MonsterD.length - 1];
					int[] Updater = new int[BattleM.MonsterD.length - 1];
					int i1 = 0;
					int i2 = 0;
					while(i1 < BattleM.MonsterD.length){
						if(i1 != EnemyAffected){
							MUpdater[i2] = BattleM.MonsterD[i1];
							i2 = i2 + 1;
						}
						i1 = i1 + 1;
					}
					BattleM.MonsterD = MUpdater;
					
					i1 = 0;
					i2 = 0;
					Updater = new int[MHP1.length - 1];
					while(i1 < MHP1.length){
						if(i1 != EnemyAffected){
							Updater[i2] = MHP1[i1];
							i2 = i2 + 1;
						}
						i1 = i1 + 1;
					}
					MHP1 = Updater;
					
					i1 = 0;
					i2 = 0;
					Updater = new int[MHP2.length - 1];
					while(i1 < MHP2.length){
						if(i1 != EnemyAffected){
							Updater[i2] = MHP2[i1];
							i2 = i2 + 1;
						}
						i1 = i1 + 1;
					}
					MHP2 = Updater;
					
					i1 = 0;
					i2 = 0;
					Updater = new int[MHP3.length - 1];
					while(i1 < MHP3.length){
						if(i1 != EnemyAffected){
							Updater[i2] = MHP3[i1];
							i2 = i2 + 1;
						}
						i1 = i1 + 1;
					}
					MHP3 = Updater;
					
					i1 = 0;
					i2 = 0;
					Updater = new int[MHP4.length - 1];
					while(i1 < MHP4.length){
						if(i1 != EnemyAffected){
							Updater[i2] = MHP4[i1];
							i2 = i2 + 1;
						}
						i1 = i1 + 1;
					}
					MHP4 = Updater;
					
					//May do Something else here? //TODO TargetToggle and FocusToggle CurrentM
					if(TargetM == CurrentM){
						TargetM = 0;
					}
					else if(TargetM > CurrentM){
						TargetM = TargetM -1;
					}
					
					CurrentM = 0;
					
					if(CurrentM > 0){
						CurrentM = CurrentM - 1;
					}
					
					MNo = BattleM.MonsterD[CurrentM].MonsterID;
					SetM(BattleM.MonsterD[CurrentM]);
					
					if(FocusToggle == 1){
//						if(BattleM.MonsterD[0].MonsterName.length > 1){
//							CurrentRandoName[0]= MNameRandom.nextInt(BattleM.MonsterD[0].MonsterName.length);
//						}
						DisplayMN = 0;
						DisplayM = BattleM.MonsterD[0];
						DisplayM.MHp1 = MHP1[0];
						DisplayM.MHp2 = MHP2[0];
						DisplayM.MHp3 = MHP3[0];
						DisplayM.MHp4 = MHP4[0];
						MName = BattleM.MonsterD[0].MonsterName[0];
					}
					else{
						if(TargetToggle == 1){
							DisplayMN = CurrentM;
							DisplayM = BattleM.MonsterD[CurrentM];
							DisplayM.MHp1 = MHP1[CurrentM];
							DisplayM.MHp2 = MHP2[CurrentM];
							DisplayM.MHp3 = MHP3[CurrentM];
							DisplayM.MHp4 = MHP4[CurrentM];
							MName = BattleM.MonsterD[CurrentM].MonsterName[0];
						}
						else{
							DisplayMN = 0;
							DisplayM = BattleM.MonsterD[0];
							DisplayM.MHp1 = MHP1[0];
							DisplayM.MHp2 = MHP2[0];
							DisplayM.MHp3 = MHP3[0];
							DisplayM.MHp4 = MHP4[0];
							MName = BattleM.MonsterD[0].MonsterName[0];
						}
					}
					
				}//Enemy Escaped, but there are more left End
				else{
					//x;
					//EnemyDefeatedBattle();
					EnemyEscapedToggle = 1;
				}
				
				Text1 = Conversations.LoadText(BattleEventData[9])[0];
				Text2 = Conversations.LoadText(BattleEventData[9])[1];
				HiddenText1 = Conversations.LoadText(BattleEventData[9])[2];
				HiddenText2 = Conversations.LoadText(BattleEventData[9])[3];
				System.out.println("In Battle Event Effects: " + Text1);
			}
			
			//Drop Money?
			else if(BattleEventType == 14){
				Money += BattleEventData[0];
			}
			
			//Activate Cutscene
			else if(BattleEventType == 15){
				CurrentCutscene = TalkTextCutscene.CutsceneList(BattleEventData[0]);
				LoadCutscene(CurrentCutscene);
			}
		
			
		}//Battle Event End
		
		public void EnemyDefeatedBattle(){
			//if(){
			DisplayM.MHp1 = 0;
			DisplayM.MHp2 = 0;
			DisplayM.MHp3 = 0;
			DisplayM.MHp4 = 0;
			//}
			
			Text1X = 80;
			Text1 = "Enemy Defeated";// or Battle Start? ???
			Text2 = "";
			Monster1Defeated[BattleM.MonsterD[CurrentM].MonsterID - 1] = Monster1Defeated[BattleM.MonsterD[CurrentM].MonsterID - 1] + 1;
			CHP1 = CHP1Max;
			CHP2 = CHP2Max;
			CHP3 = CHP3Max;
			CHP4 = CHP4Max;
			Turn = 0;
			MTurn = 0;
			
			
			Random BattleItemRandom = new Random();
			int BIRandom = BattleItemRandom.nextInt(100);
			if(BIRandom <= MItemPercent1){
				EventS = 2;
				EnterOK = 1;
//				if(MoneyToggle == 1){
//					Money = Money + MoneyDrop;
//				}
				MoneyToggle = 0;
				DefeatToggle = 0;
				ItemFoundToggle = 1;
			}
			if(BIRandom > MItemPercent1){
				Random BattleRandom = new Random();
				int BRandom = BattleRandom.nextInt(100);
				if(BRandom <= MoneyChance){
					EventS = 3;
					EnterOK = 1;
//					if(MoneyToggle == 1){
//						Money = Money + MoneyDrop;
//					}
					MoneyToggle = 0;
					DefeatToggle = 0;
				}
				if(BRandom > MoneyChance){
					//BattleToggle = 0;
					//ScreenType = 1;
					EventS = 4;
					EnterOK = 1;
					DefeatToggle = 0;
				}
			}
		}//EnemyDefeatedBattle End Function End
		
		//Defeated
		public void Defeated(int DMessage){//Negative HP? 
			if(BattleLocation == 1){
				ScreenType = 1;
				Text1X = 30;
				Text1 = "You Lost";
				Text2 = "";
				CHP4 = 5;
				Status = 0;
				StatusTurns = 0;
			}
			if(BattleLocation == 14){
				ScreenType = 14;
				Xpos = 30;
				Ypos = 30;
				//Text1X = 85;
				//Text2X = 85;
				Text1 = "You Lost";
				Text2 = "";
				CHP4 = 5;
				Status = 0;
				StatusTurns = 0;
			}
			if(DMessage == 1){
				Text1 = "Defeated by";
				Text2 = "poison!";
			}
			BattleToggle = 0;
			//Turn = 0;
		}//Defeated End
	
public void NewishGame(){
		
		CHP1Max = 0;//Not sure if this is a good name
		CHP2Max = 2;
		CHP3Max = 5;
		CHP4Max = 5;
		Money = 50;
		ExamineUnlocked = 1; //May Rename
		ItemUnlocked = 1; //May Rename
		NotesUnlocked = 0; //May Rename 
		MoveUnlocked = 0; //May Rename

		Gamemode = 1;//Normal Mode
			//0 = Cutscene Quest
			//1 = Normal Mode
			//2 = Easy Mode
			//3 = Hard Mode
			//4 = Other Story
			//5 = Glitch
			//6 = Beta
		MainClass.XBattleMode = 0;
		
		AccessArea = AreaData.LoadAreaPathNormal();
		AreasFound = AreaData.ATotal(Area1Found, GamePanel.CurrentArea.AreaNo, AccessArea);
		
		CurrentArea = AreaData.AData(9, 0, MainClass.SEventSecond);//Town Gate
		AreaName = CurrentArea.AreaName;
		AreaNumber = CurrentArea.AreaNo;
		ScreenType = 1;
		ScreenMode = CurrentArea.ScreenMode;
		AreaScreenMode = ScreenMode;
		Xpos = CurrentArea.Xpos;
		Ypos = CurrentArea.Ypos;
		Text1 = "";
		Text2 = "";
		ScreenType = 8;
		//Loading New Game Cutscene
		CurrentCutscene = TalkTextCutscene.CutsceneList(26);
		Text1X = 30;
		Text2X = 30;
		LoadCutscene(CurrentCutscene);
		
}//Newish Game End

public void LoadGamefromPassword() {
	String LoadedPassword = passwordRW.loadPassword();
	OldPassword = Password;
	Password = LoadedPassword;
	int[] loadingfrompasswordint = new int[]{0};
	loadingfrompasswordint = Passwords.LoadFromPasswordA(Password);
	CHP1 = loadingfrompasswordint[0] - 48;
	CHP2 = loadingfrompasswordint[1] - 48;
	CHP3 = loadingfrompasswordint[2] - 48;
	CHP4 = loadingfrompasswordint[3] - 48;
}//Load from Password End
	
}//JPanel Class End
