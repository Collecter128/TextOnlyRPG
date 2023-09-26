package textonlyrpg;

public class Cook {
	public int ItemNo1 = 1;
	public int ItemNo2 = 1;
	public int CookedItem = 1;
	public String ItemName = "ItemName";
	public String ItemDescription = "ItemDescription";
	public int Price = 3;
	//public int Unlocked = 1;
	public int CutsceneEvent = 0;
	//ItemNo?
	
	public Cook(int CookedItem ,String ItemName, String ItemDescription, int Price, int CutsceneEvent){
		this.CookedItem = CookedItem;
		this.ItemName = ItemName;
		this.ItemDescription = ItemDescription;
		this.Price = Price;
		this.CutsceneEvent = CutsceneEvent;
	}
	
	public int getCookedItemNo(){
		return CookedItem;
	}
	
	//GetName important?
	
	public int getPrice(){
		return Price;
	}

	public static Cook CookItems(int Item1, int Item2, int[] RecipesFound, int[] RecipeMade){
		Cook ItemData = new Cook(0, "", "", 0, 0);//CookedItem
		int CookedItem = 1;
		String ItemName = "";
		String ItemDescription = "";
		int CutsceneEvent = 0;
		int Price = 0;
		ItemData = new Cook(CookedItem, ItemName, ItemDescription, Price, CutsceneEvent);
			//Noitem
			if((Item1 == 0 && Item2 == 0) || (Item1 == 0 && Item2 == 0)){
				CookedItem = 0;
				ItemName = "";
				ItemDescription = "";
				Price = 0;
				CutsceneEvent = 0;
				ItemData = new Cook(0, "", "", 0, 0);
			}//Noitem
			//Bread
			else if((Item1 == 2 && Item2 == 0) && RecipesFound[0] == 1){//Bread
				CookedItem = 3;
				if(RecipeMade[0] == 1){
					ItemName = "Bread";
					ItemDescription = "Fresh Bread";
					Price = 3;
					CutsceneEvent = 25;
					ItemData = new Cook(3, "Bread", "Fresh Bread", 3, 25);
				}//has been made before
				else{
					ItemName = "???";
					ItemDescription = "???";
					Price = 3;
					CutsceneEvent = 25;
					ItemData = new Cook(3, "???", "???", 3, 25);
				}//Has not been made before
			}//Bread
			//Testfood
			else if(((Item1 == 289 && Item2 == 290) || (Item1 == 290 && Item2 == 289)) && RecipesFound[1] == 1){
				CookedItem = 291;
				if(RecipeMade[1] == 1){
					ItemName = "TestItem3";
					ItemDescription = "TestFood";
					Price = 3;
					CutsceneEvent = 19;
					ItemData = new Cook(291, "TestItem3", "TestFood", 3, 19);//280
				}
				if(RecipeMade[1] == 0){
					ItemName = "???";
					ItemDescription = "???";
					Price = 3;
					CutsceneEvent = 19;
					ItemData = new Cook(291, "???", "???", 3, 19);//280
				}
				
			}//TestFood
			
			//testitem2 + testbomb
			else if((Item1 == 290 && Item2 == 295) || (Item1 == 295 && Item2 == 290)){
				CookedItem = 299;
				if(RecipeMade[2] == 1){
					ItemName = "";
					ItemDescription = "WARNING!";
					//ItemDescription = "???";
					Price = 3;
					CutsceneEvent = 20;
					ItemData = new Cook(299, "DebugBomb", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
				}
				if(RecipeMade[2] == 0){
					ItemName = "Impossible";
					ItemDescription = "ERROR"; 
					//ItemDescription = "???";
					Price = 3;
					CutsceneEvent = 20;
					ItemData = new Cook(299, "DebugBomb", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
				}
				
			}//DebugBomb End
			
//			else if((Item1 ==  && Item2 == ) || (Item1 ==  && Item2 == )){
//			CookedItem = ;
//			if(RecipeMade[2] == 1){
//				ItemName = "";
//				ItemDescription = "???";
//				Price = 3;
//				CutsceneEvent = 20;
//				ItemData = new Cook(299, "DebugBomb", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
//			}
//			if(RecipeMade[2] == 0){
//				ItemName = "Toast";
//				ItemDescription = "Crispy Bread"; 
//				Price = 3;
//				CutsceneEvent = ??;
//				ItemData = new Cook(4, "Toast", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
//			}
//			
//		}//
			
//			else if((Item1 ==  && Item2 == ) || (Item1 ==  && Item2 == )){
//				CookedItem = ;
//				if(RecipeMade[2] == 1){
//					ItemName = "";
//					ItemDescription = "WARNING!";
//					Price = 3;
//					CutsceneEvent = 20;
//					ItemData = new Cook(299, "DebugBomb", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
//				}
//				if(RecipeMade[2] == 0){
//					ItemName = "Impossible";
//					ItemDescription = "ERROR"; 
//					Price = 3;
//					CutsceneEvent = 20;
//					ItemData = new Cook(299, "DebugBomb", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
//				}
//				
//			}//
			else{
				CookedItem = -1;
				ItemName = "???";
				ItemDescription = "???";
				Price = 0;
				CutsceneEvent = 0;
				ItemData = new Cook(-1, "???", "???", 0, 0);
			}
		ItemData = new Cook(CookedItem, ItemName, ItemDescription, Price, CutsceneEvent);
		return ItemData;
	}
	
	public static Cook CookedItem(int ItemNo){
		Cook ItemData = new Cook(00, "", "No Disc", 0, 0);// Items(00, "", 0, 0, 0, -5, "No Disc", 0); //NullItem
		
		if(ItemNo == -2){//Lose Item
			ItemData = new Cook(-1, "???", "No Disc", 0, 18);// Items(-1, "???", 0, 0, 0, -5, "No Disc", 0)
		}
		if(ItemNo == -1){//Cannot Cook
			ItemData = new Cook(-1, "???", "No Disc", 0, 0);// new Items(-1, "???", 0, 0, 0, -5, "No Disc", 0);
		}
		if(ItemNo == 0){//Nothing?
			ItemData = new Cook(-1, "", "Nothing", 0, 0);// Items(-1, "", 0, 0, 0, -5, "Nothing", 0);
		}
//		if(ItemNo == 1){
//			ItemData = new Cook(1, "Potion", "Green Potion", 1, ??);
//		}
		if(ItemNo == 3){
			ItemData = new Cook(3, "Bread", "Bread", 1, 19);// Items(1, "TestItem1", 0, 0, 0, -5, "TestItem1", 1);
		}

//		if(ItemNo == 4){
//		ItemData = new Cook(4, "Toast", "Toast", 1, ??);
//	}
		
//		if(ItemNo == 7){
//			ItemData = new Cook(7, "Pancakes", "Pancakes", 1, ??);
//		}
//		if(ItemNo == 1){
//		ItemData = new Cook(8, "ThinPncaks", "Thin Pancakes", 1, ??);
//	}
		
//		if(ItemNo == 1){
//			ItemData = new Cook(10, "CheesFndue", "Cheese Fondue", 1, ??);
//		}
//		if(ItemNo == 1){
//		ItemData = new Cook(11, "ChzSandwch", "Cheese Sandwich", 1, ??);
//	}
//		if(ItemNo == 1){
//		ItemData = new Cook(12, "Chz Toast", "Cheese Toast", 1, ??);
//	}
//		if(ItemNo == 1){
//		ItemData = new Cook(13, "ChzPncakes", "Cheese Pancakes", 1, ??);
//	}
//		if(ItemNo == 1){
//		ItemData = new Cook(14, "GrilledChz", "Grilled Cheese", 1, ??);
//	}
		
//		if(ItemNo == 1){
//			ItemData = new Cook(16, "chopdSteak", "Chopped Steak", 1, ??);
//		}
//		if(ItemNo == 1){
//		ItemData = new Cook(3, "chopdSteak", "", 1, ??);
//	}
//		if(ItemNo == 17){
//		ItemData = new Cook(17, "Meatbread", "Meatbread", 1, ??);
//	}
//		if(ItemNo == 18){
//		ItemData = new Cook(18, "Meat Bun", "Meat Bun", 1, ??);
//	}
//		if(ItemNo == 19){
//		ItemData = new Cook(19, "BurgerBytes", "Burger Bytes", 1, ??);
//	}
//		if(ItemNo == 20){
//		ItemData = new Cook(20, "Meatloaf", "Meatloaf Stuffed Bread", 1, ??);
//	}
//		if(ItemNo == 21){
//		ItemData = new Cook(21, "StuffdMeat", "Breading Stuffed Meat", 1, ??);
//	}
//		if(ItemNo == 22){
//		ItemData = new Cook(22, "Meat Pasta", "Meat Pasta", 1, ??);
//	}
//		if(ItemNo == 23){
//		ItemData = new Cook(23, "StfdSndwch", "Stuffed Sandwich", 1, ??);
//	}
//		if(ItemNo == 24){
//		ItemData = new Cook(24, "Hamburger", "Hamburger", 1, ??);
//	}
//		if(ItemNo == 25){
//		ItemData = new Cook(25, "BoiledMeat", "Boiled Meat", 1, ??);
//	}
//		if(ItemNo == 26){
//		ItemData = new Cook(26, "Steakburgr", "Steak Burger", 1, ??);
//	}
//		if(ItemNo == 27){
//		ItemData = new Cook(27, "StkhouseBgr", "Steakhouse Burger", 1, ??);
//	}
//		if(ItemNo == 28){
//		ItemData = new Cook(28, "Chz Steak", "Cheese Steak", 1, ??);
//	}
//		if(ItemNo == 29){
//		ItemData = new Cook(29, "Chzburger", "CheeseBurger", 1, ??);
//	}
//		if(ItemNo == 30){
//		ItemData = new Cook(30, "ChzStkBrgr", "Steakburger W Cheese", 1, ??);
//	}
//		if(ItemNo == 31){
//		ItemData = new Cook(31, "ChzStkSndw", "Cheesesteak Sandwich", 1, ??);
//	}
//		if(ItemNo == 33){
//		ItemData = new Cook(33, "Caramel", "Caramel", 1, ??);
//	}
//		if(ItemNo == 34){
//		ItemData = new Cook(34, "SweetRolls", "Sweet Rolls", 1, ??);
//	}
//		if(ItemNo == 35){
//		ItemData = new Cook(35, "Syrup", "Syrup", 1, ??);
//	}
//		if(ItemNo == 36){
//		ItemData = new Cook(36, "StickyBuns", "Sticky Buns", 1, ??);
//	}
//		if(ItemNo == 37){
//		ItemData = new Cook(37, "Pncaks&Srp", "Pancakes W. Syrup", 1, ??);
//	}
//		if(ItemNo == 38){
//		ItemData = new Cook(38, "SrpThnPnck", "Thin Pancakes W. Syrup", 1, ??);
//	}
//		if(ItemNo == 39){
//		ItemData = new Cook(39, "SrpChzPnck", "Cheese Pancakes W. Syrup", 1, ??);
//	}
//		if(ItemNo == 40){
//		ItemData = new Cook(40, "Caramels", "Caramels", 1, ??);
//	}
//		if(ItemNo == 41){
//		ItemData = new Cook(41, "Hard Candy", "Hard Candy", 1, ??);
//	}
//		if(ItemNo == 42){
//		ItemData = new Cook(42, "Jelly Candy", "Jelly Candy", 1, ??);
//	}
//		if(ItemNo == 43){
//		ItemData = new Cook(43, "SgrFrtCrml", "Sugar Frosted Caramels", 1, ??);
//	}
//		if(ItemNo == 44){
//		ItemData = new Cook(44, "Crml Syrup", "Caramel Syrup", 1, ??);
//	}
//		if(ItemNo == 45){
//		ItemData = new Cook(45, "HrdCandies", "Hard Candies", 1, ??);
//	}
//		if(ItemNo == 46){
//		ItemData = new Cook(46, "JellyBeans", "Jelly Beans", 1, ??);
//	}
//		if(ItemNo == 48){
//		ItemData = new Cook(48, "Chc Fondue", "Chocolate Fondue", 1, ??);
//	}
//		if(ItemNo == 49){
//		ItemData = new Cook(49, "HtChocolat", "Hot Chocolate", 1, ??);
//	}
//		if(ItemNo == 50){
//		ItemData = new Cook(50, "ChcPncakes", "Chocolate Pancakes", 1, ??);
//	}
//		if(ItemNo == 51){
//		ItemData = new Cook(51, "Choco Bar", "Chocolate Bar", 1, ??);
//	}
//		if(ItemNo == 52){
//		ItemData = new Cook(52, "ChocoCarml", "Chocolate Caramels", 1, ??);
//	}
//		if(ItemNo == 53){
//		ItemData = new Cook(53, "ChocoSyrup", "Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 54){
//		ItemData = new Cook(54, "CrmlHtChoc", "Caramel Hot Chocolate", 1, ??);
//	}
//		if(ItemNo == 55){
//		ItemData = new Cook(55, "Pncks&ChSr", "Pancakes W. Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 56){
//		ItemData = new Cook(56, "TnPks&ChSr", "Thin Pancakes W. Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 57){
//		ItemData = new Cook(57, "CzPks&ChSr", "Cheese Pancakes W. Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 58){
//		ItemData = new Cook(58, "ChPncks&Sr", "Chocolate Pancakes W. Syrup", 1, ??);
//	}
//		if(ItemNo == 59){
//		ItemData = new Cook(59, "ChPks&ChSr", "Chocolate Pancakes W. Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 60){
//		ItemData = new Cook(60, "ChcCmlCake", "Chocolate Caramel Cake", 1, ??);
//	}
//		if(ItemNo == 62){
//		ItemData = new Cook(62, "BlbryBread", "Blueberry Bread", 1, ??);
//	}
//		if(ItemNo == 63){
//		ItemData = new Cook(63, "BlbryJuice", "Blueberry Juice", 1, ??);
//	}
//		if(ItemNo == 64){
//		ItemData = new Cook(64, "BlbPncakes", "Blueberry Pancakes", 1, ??);
//	}
//		if(ItemNo == 65){
//		ItemData = new Cook(65, "BlbrySteak", "Blueberry Steak", 1, ??);
//	}
//		if(ItemNo == 66){
//		ItemData = new Cook(66, "BlbrySyrup", "Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 67){
//		ItemData = new Cook(67, "ChocoBlbry", "Chocolate Covered Blueberries", 1, ??);
//	}
//		if(ItemNo == 68){
//		ItemData = new Cook(68, "ChzBlbrrys", "Cheese Dipped Blueberries", 1, ??);
//	}
//		if(ItemNo == 69){
//		ItemData = new Cook(69, "BluePowder", "Blueberry Concentrate?", 1, ??);
//	}
//		if(ItemNo == 70){
//		ItemData = new Cook(70, "BlbryJelly", "Blueberry Jelly", 1, ??);
//	}
//		if(ItemNo == 71){
//		ItemData = new Cook(71, "BbJllyCandy", "Blueberry Jelly Candy", 1, ??);
//	}
//		if(ItemNo == 72){
//		ItemData = new Cook(72, "BbJellyBns", "Blueberry Jelly Beans", 1, ??);
//	}
//		if(ItemNo == 73){
//		ItemData = new Cook(73, "Pncks&BbSr", "Pancakes W. Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 74){
//		ItemData = new Cook(74, "TnPks&BbSr", "Thin Pancakes W. Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 75){
//		ItemData = new Cook(75, "CzPks&BbSr", "Cheese Pancakes W. Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 76){
//		ItemData = new Cook(76, "ChPks&BbSr", "Chocolate Pancakes W. Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 77){
//		ItemData = new Cook(77, "BbPncks&Sr", "Blueberry Pancakes W. Syrup", 1, ??);
//	}
//		if(ItemNo == 78){
//		ItemData = new Cook(78, "BbPks&ChSr", "Blueberry Pancakes W. Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 79){
//		ItemData = new Cook(79, "BbPks&BbSr", "Blueberry Pancakes W. Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 80){
//		ItemData = new Cook(80, "TstW.BbJly", "Toast W. Blueberry Jelly", 1, ??);
//	}
//		if(ItemNo == 82){
//		ItemData = new Cook(82, "IceSclptre", "Ice Sculpture", 1, ??);
//	}
//		if(ItemNo == 83){
//		ItemData = new Cook(83, "Ice Water", "Ice Water", 1, ??);
//	}
//		if(ItemNo == 84){
//		ItemData = new Cook(84, "CrushedIce", "Crushed Ice", 1, ??);
//	}
//		if(ItemNo == 85){
//		ItemData = new Cook(85, "BlubrryIce", "Blueberry Icicle", 1, ??);
//	}
//		if(ItemNo == 86){
//		ItemData = new Cook(86, "Shaved Ice", "Shaved Ice", 1, ??);
//	}
//		if(ItemNo == 87){
//		ItemData = new Cook(87, "BbShavdIce", "Blueberry Shaved Ice", 1, ??);
//	}
//		if(ItemNo == 88){
//		ItemData = new Cook(88, "ChocoDrink", "Refreshing Chocolate Drink", 1, ??);
//	}
//		if(ItemNo == 89){
//		ItemData = new Cook(89, "CmlPncakes", "Caramel Pancakes", 1, ??);
//	}
//		if(ItemNo == 90){
//		ItemData = new Cook(90, "CarmlBread", "Caramel Bread", 1, ??);
//	}
//		if(ItemNo == 91){
//		ItemData = new Cook(91, "CrmChocBar", "Caramel Chocolate Bar", 1, ??);
//	}
//		if(ItemNo == 92){
//		ItemData = new Cook(92, "ClPncks&Sr", "Caramel Pancakes W. Syrup", 1, ??);
//	}
//		if(ItemNo == 93){
//		ItemData = new Cook(93, "ClPks&ChSr", "Caramel Pancakes W. Chocolate Syrup", 1, ??);
//	}
//		if(ItemNo == 94){
//		ItemData = new Cook(94, "ClPks&BbSr", "Caramel Pancakes W. Blueberry Syrup", 1, ??);
//	}
//		if(ItemNo == 120){
//		ItemData = new Cook(120, "StaleBread", "Stale Bread", 1, ??);
//	}
//		if(ItemNo == 121){
//		ItemData = new Cook(121, "RottenMeat", "Rotten Meat", 1, ??);
//	}
//		if(ItemNo == 122){
//			ItemData = new Cook(121, "CursedMeat", "Cursed Meat", 1, ??);
//		}
//		if(ItemNo == 123){
//			ItemData = new Cook(123, "PrisonFood", "Prison Food?", 1, ??);
//		}
//		if(ItemNo == 124){
//			ItemData = new Cook(124, "Dry Bread", "Dry Bread", 1, ??);
//		}
//		if(ItemNo == 204){
//			ItemData = new Cook(204, "PncakArmor", "Pancake Armor", 1, ??);
//		}
//		if(ItemNo == 205){
//			ItemData = new Cook(205, "PnckArmrSr", "Pancake Armor W. Syrup", 1, ??);
//		}
//		if(ItemNo == 252){
//			ItemData = new Cook(252, "BlueBArmor", "Blueberry Armor", 1, ??);
//		}
//		if(ItemNo == 285){
//			ItemData = new Cook(285, "NullPncakes", "NULL Pancakes", 1, ??);
//		}
//		if(ItemNo == 288){
//			ItemData = new Cook(288, "UnusedItem", "Unused Item", 1, ??);
//		}
		if(ItemNo == 289){//2
			ItemData = new Cook(289, "TestItem1", "TestItem1", 1, 19);// Items(1, "TestItem1", 0, 0, 0, -5, "TestItem1", 1);
			//ItemData = new Cook(8, "TestItem1", "TestItem1", 1, 19);// Items(1, "TestItem1", 0, 0, 0, -5, "TestItem1", 1);
		}
		if(ItemNo == 290){//3
			ItemData = new Cook(290, "TestItem2", "TestItem2", 1, 19);// Items(2, "TestItem2", 0, 0, -1, 0, "TestItem2", 1);
			//ItemData = new Cook(9, "TestItem2", "TestItem2", 1, 19);// Items(2, "TestItem2", 0, 0, -1, 0, "TestItem2", 1);
		}
		if(ItemNo == 291){//4
			ItemData = new Cook(291, "TestItem3", "TestItem3", 1, 19);// Items(3, "TestItem3", 0, 0, -1, -5, "TestItem3", 1);
			//ItemData = new Cook(10, "TestItem3", "TestItem3", 1, 19);// Items(3, "TestItem3", 0, 0, -1, -5, "TestItem3", 1);
		}
		if(ItemNo == 299){//5
			ItemData = new Cook(299, "", "WARNING", 9, 20);// Items(?, "DebugBomb", ?, ?, ?, ?, "...", ?);
			//ItemData = new Cook(18, "", "WARNING", 9, 20);// Items(?, "DebugBomb", ?, ?, ?, ?, "...", ?);
		}
//		if(ItemNo == 300){
//			ItemData = new Cook(300, "CookItem", "Description", 1, ??);
//		}
		return ItemData;
	}
	
	public static int CookRecipeNo(int Item1, int Item2){
		int RecipeNo = 0;// Items(00, "", 0, 0, 0, -5, "No Disc", 0); //NullItem
		if((Item1 == 0 && Item2 == 0) || (Item1 == 0 && Item2 == 0)){
			RecipeNo = 0;
		}
		else if((Item1 == 2 && Item2 == 0)){
			RecipeNo = 1;//Bread
		}
		else if((Item1 == 289 && Item2 == 290) || (Item1 == 290 && Item2 == 289)){
		//else if((Item1 == 8 && Item2 == 9) || (Item1 == 9 && Item2 == 8)){
			RecipeNo = 2;//TestItem3 TestFood
		}
		else if((Item1 == 290 && Item2 == 295) || (Item1 == 295 && Item2 == 290)){
		//else if((Item1 == 9 && Item2 == 14) || (Item1 == 14 && Item2 == 9)){
			RecipeNo = 3;//DebugBomb
		}
		else if((Item1 == 3 && Item2 == 0)){
				RecipeNo = 4;//toast
			}
		else{
			RecipeNo = -1;
		}
		return RecipeNo;
	}
}
