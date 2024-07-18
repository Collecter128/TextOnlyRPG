package textonlyrpg;

public class Cook {
	public int ItemNo1 = 1;
	public int ItemNo2 = 1;
	public int CookedItem = 1;
	public int RecipeNo = 0;
	public String ItemName = "ItemName";
	public String ItemDescription = "ItemDescription";
	public int Price = 3;
	//public int Unlocked = 1;
	public int CutsceneEvent = 0;
	//ItemNo?
	
	public Cook(int RecipeNo, int CookedItem ,String ItemName, String ItemDescription, int Price, int CutsceneEvent){
		this.RecipeNo = RecipeNo;
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

	public static Cook CookItems(int Item1, int Item2, int[] RecipesFound, int[] RecipeMade, int Gamemode){
		Cook ItemData = new Cook(0, 0, "", "", 0, 0);//CookedItem
		int CookedRecipe = 0;
		int CookedItem = 1;
		String ItemName = "";
		String ItemDescription = "";
		int CutsceneEvent = 0;
		int Price = 0;
		ItemData = new Cook(CookedRecipe, CookedItem, ItemName, ItemDescription, Price, CutsceneEvent);
		
			//Noitem
			if((Item1 == 0 && Item2 == 0) || (Item1 == 0 && Item2 == 0)){
				//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
				ItemData = new Cook(0, 0, "", "", 0, 0);
			}//Noitem
			
			//Bread
			else if((Item1 == 2 && Item2 == 0) && RecipesFound[0] == 1){//Bread
				CookedItem = 3;
				if(RecipeMade[0] == 1){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(1, 3, "Bread", "Fresh Bread", 3, 25);
				}//has been made before
				else{
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(1, 3, "???", "???", 3, 25);
				}//Has not been made before
			}//Bread
			
			//Testfood
			else if(((Item1 == 289 && Item2 == 290) || (Item1 == 290 && Item2 == 289)) && RecipesFound[1] == 1){
				CookedItem = 291;
				if(RecipeMade[1] == 1){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(2, 291, "TestItem3", "TestFood", 3, 19);//280
				}
				if(RecipeMade[1] == 0){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(2, 291, "???", "???", 3, 19);//280
				}
				
			}//TestFood
			
			//testitem2? + testbomb?
			else if(Gamemode == 6 && ((Item1 == 290 && Item2 == 296) || (Item1 == 296 && Item2 == 290))){
				CookedItem = 299;
				if(RecipeMade[2] == 1){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(3, 299, "DebugBomb", "Warning!", 3, 20);//Big Bomb + Bug Bomb??  288
				}
				if(RecipeMade[2] == 0){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(3, 299, "Impossible", "Error!", 3, 20);//Big Bomb + Bug Bomb??  288
				}
				
			}//DebugBomb End
			
			//Big Bomb + Bug Bomb??
			else if(Gamemode != 6 && ((Item1 == 298 && Item2 == 297) || (Item1 == 297 && Item2 == 298))){
				CookedItem = 299;
				if(RecipeMade[2] == 1){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(3, 299, "DebugBomb", "Deals 255 Damage", 3, 20);//Big Bomb + Bug Bomb??  288
				}
				if(RecipeMade[2] == 0){
					//Cook(ItemNumber, Item Name, Item Desc., Price, CutsceneEvent);
					ItemData = new Cook(3, 299, "Bomb???", "???", 3, 20);//Big Bomb + Bug Bomb??  288
				}
				
			}//DebugBomb End
			
			//Toast
			else if((Item1 == 3 && Item2 == 0) && RecipesFound[3] == 1){
				if(RecipeMade[3] == 1){
					ItemData = new Cook(/*recipe No*/4, /*Item No*/4, "Toast", "Crispy Toast", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/4, /*Item No*/4, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Toast
			
			//Pancakes
			else if((Item1 == 6 && Item2 == 0) && RecipesFound[4] == 1){
				if(RecipeMade[4] == 1){
					ItemData = new Cook(/*recipe No*/5, /*Item No*/7, "Pancakes", "Pancake stack", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/5, /*Item No*/7, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Pancakes

			//Thin Pancakes
			else if(((Item1 == 6 && Item2 == 5) ||
					(Item1 == 5 && Item2 == 6)) && RecipesFound[5] == 1){
				if(RecipeMade[5] == 1){
					ItemData = new Cook(/*recipe No*/6, /*Item No*/8, "ThnPancakes", "Thin Pancakes?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/6, /*Item No*/8, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Thin Pancakes		
			
			//Cheese Fondue
			else if((Item1 == 9 && Item2 == 0) && RecipesFound[6] == 1){
				if(RecipeMade[6] == 1){
					ItemData = new Cook(/*recipe No*/7, /*Item No*/10, "Cheese Fondue", "A thick cheese dish", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/7, /*Item No*/10, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Fondue
			
			//Cheese sandwich
			else if(((Item1 == 3 && Item2 == 9) ||
					(Item1 == 9 && Item2 == 3)) && RecipesFound[7] == 1){
				if(RecipeMade[7] == 1){
					ItemData = new Cook(/*recipe No*/8, /*Item No*/11, "Cheese Sandwich", "Simple but good", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/8, /*Item No*/11, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Sandwich
			
			//Cheese toast
			else if(((Item1 == 4 && Item2 == 9) ||
					(Item1 == 9 && Item2 == 4)) && RecipesFound[8] == 1){
				if(RecipeMade[8] == 1){
					ItemData = new Cook(/*recipe No*/9, /*Item No*/12, "Cheese Toast", "Cheesy, crispy", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/9, /*Item No*/12, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//cheese toast

			//Cheese Pancakes
			else if(((Item1 == 6 && Item2 == 9) ||
					(Item1 == 9 && Item2 == 6)) && RecipesFound[9] == 1){
				if(RecipeMade[9] == 1){
					ItemData = new Cook(/*recipe No*/10, /*Item No*/13, "Cheese Pancakes", "Tasty!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/10, /*Item No*/13, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Pancakes
			
			//Grilled Cheese
			else if((Item1 == 11 && Item2 == 0) && RecipesFound[10] == 1){
				if(RecipeMade[10] == 1){
					ItemData = new Cook(/*recipe No*/11, /*Item No*/14, "Grilled Cheese", "Melty and nice!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/11, /*Item No*/14, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Grilled Cheese
			
			//Chopped Steak
			else if((Item1 == 15 && Item2 == 0) && RecipesFound[11] == 1){
				if(RecipeMade[11] == 1){
					ItemData = new Cook(/*recipe No*/12, /*Item No*/16, "Chopped Steak", "Sizzling with flavor", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/12, /*Item No*/16, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chopped Steak

			//MeatBread
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[12] == 1 && Gamemode == 0){
				if(RecipeMade[12] == 1){
					ItemData = new Cook(/*recipe No*/13, /*Item No*/17, "MeatBread", "Chunky?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/13, /*Item No*/17, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//MeatBread

			//Meat Bun
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[13] == 1 && Gamemode == 1){
				if(RecipeMade[13] == 1){
					ItemData = new Cook(/*recipe No*/14, /*Item No*/18, "Meat Bun", "Juicy!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/14, /*Item No*/18, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Meat Bun
			
			//Burger Bytes
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[14] == 1 && Gamemode == 2){
				if(RecipeMade[14] == 1){
					ItemData = new Cook(/*recipe No*/15, /*Item No*/19, "Burger Bytes", "Small, but good", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/15, /*Item No*/19, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Burger Bytes
			
			//Meatloaf Stuffed Bread
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[15] == 1 && Gamemode == 3){
				if(RecipeMade[15] == 1){
					ItemData = new Cook(/*recipe No*/16, /*Item No*/20, "MeatloafStffdBread", "Very odd", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/16, /*Item No*/20, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Meatloaf Stuffed Bread
			
			//Breading Stuffed Meat
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[16] == 1 && Gamemode == 4){
				if(RecipeMade[16] == 1){
					ItemData = new Cook(/*recipe No*/17, /*Item No*/21, "BreadStffdMeat", "Well Seasoned", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/17, /*Item No*/21, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Breading Stuffed Meat
			
			//Meaty Pasta
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[17] == 1 && Gamemode == 5){
				if(RecipeMade[17] == 1){
					ItemData = new Cook(/*recipe No*/18, /*Item No*/22, "Meaty Pasta", "Pasta?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/18, /*Item No*/22, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Meaty Pasta

			//Stuffed Sandwitch
			else if(((Item1 == 2 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 2)) && RecipesFound[18] == 1 && Gamemode == 6){
				if(RecipeMade[18] == 1){
					ItemData = new Cook(/*recipe No*/19, /*Item No*/23, "StuffdSandwtch", "delightful", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/19, /*Item No*/23, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Stuffed Sandwitch
	
			//Hamburger
			else if(((Item1 == 3 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 3)) && RecipesFound[19] == 1){
				if(RecipeMade[19] == 1){
					ItemData = new Cook(/*recipe No*/20, /*Item No*/24, "Hamburger", "Grilled to perfection", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/20, /*Item No*/24, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Hamburger

			//Boiled Meat
			else if(((Item1 == 5 && Item2 == 15) ||
					(Item1 == 15 && Item2 == 5)) && RecipesFound[20] == 1){
				if(RecipeMade[20] == 1){
					ItemData = new Cook(/*recipe No*/21, /*Item No*/25, "BoiledMeat", "Interesting", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/21, /*Item No*/25, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Boiled Meat

			//Steakburger
			else if(((Item1 == 3 && Item2 == 16) ||
					(Item1 == 16 && Item2 == 3)) && RecipesFound[21] == 1){
				if(RecipeMade[21] == 1){
					ItemData = new Cook(/*recipe No*/22, /*Item No*/26, "Steakburger", "Well seasoned!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/22, /*Item No*/26, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Steakburger

			//Steakhouse Burger
			else if(((Item1 == 4 && Item2 == 16) ||
					(Item1 == 16 && Item2 == 4)) && RecipesFound[22] == 1){
				if(RecipeMade[22] == 1){
					ItemData = new Cook(/*recipe No*/23, /*Item No*/27, "SteakhouseBurger", "Fancy!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/23, /*Item No*/27, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Steakhouse Burger
			
			//Cheese Steak
			else if(((Item1 == 9 && Item2 == 16) ||
					(Item1 == 16 && Item2 == 9)) && RecipesFound[23] == 1){
				if(RecipeMade[23] == 1){
					ItemData = new Cook(/*recipe No*/24, /*Item No*/28, "Cheese Steak", "Cheesy!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/24, /*Item No*/28, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Steak

			//Cheeseburger
			else if(((Item1 == 9 && Item2 == 24) ||
					(Item1 == 24 && Item2 == 9)) && RecipesFound[24] == 1){
				if(RecipeMade[24] == 1){
					ItemData = new Cook(/*recipe No*/25, /*Item No*/29, "Cheeseburger", "Cheesy!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/25, /*Item No*/29, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheeseburger

			//Steakburger W Cheese
			else if(((Item1 == 9 && Item2 == 26) ||
					(Item1 == 26 && Item2 == 9)) && RecipesFound[25] == 1){
				if(RecipeMade[25] == 1){
					ItemData = new Cook(/*recipe No*/26, /*Item No*/30, "StkburgerwCheese", "Cheesy!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/26, /*Item No*/30, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Steakburger W Cheese

			//Cheesesteak Sandwich
			else if(((Item1 == 3 && Item2 == 28) ||
					(Item1 == 28 && Item2 == 3)) && RecipesFound[26] == 1){
				if(RecipeMade[26] == 1){
					ItemData = new Cook(/*recipe No*/27, /*Item No*/31, "ChsSteakSndwch", "Gooey!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/27, /*Item No*/31, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheesesteak Sandwich
			
			//Caramel
			else if((Item1 == 32 && Item2 == 0) && RecipesFound[27] == 1){
				if(RecipeMade[27] == 1){
					ItemData = new Cook(/*recipe No*/28, /*Item No*/33, "Caramel", "Gooey and tasty", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/28, /*Item No*/33, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel
			
			//Sweet Rolls
			else if(((Item1 == 2 && Item2 == 32) ||
					(Item1 == 32 && Item2 == 2)) && RecipesFound[28] == 1){
				if(RecipeMade[28] == 1){
					ItemData = new Cook(/*recipe No*/29, /*Item No*/34, "Sweet Rolls", "Hot and fresh!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/29, /*Item No*/34, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Sweet Rolls

			//Syrup
			else if(((Item1 == 5 && Item2 == 32) ||
					(Item1 == 32 && Item2 == 5)) && RecipesFound[29] == 1){
				if(RecipeMade[29] == 1){
					ItemData = new Cook(/*recipe No*/30, /*Item No*/35, "Syrup", "Sticky and sweet", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/30, /*Item No*/35, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Syrup

			//Sticky Buns
			else if(((Item1 == 2 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 2)) && RecipesFound[30] == 1){
				if(RecipeMade[30] == 1){
					ItemData = new Cook(/*recipe No*/31, /*Item No*/36, "StickyBuns", "Sticky and sweet", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/31, /*Item No*/36, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Sticky Buns

			//Pancakes w Syrup
			else if(((Item1 == 7 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 7)) && RecipesFound[31] == 1){
				if(RecipeMade[31] == 1){
					ItemData = new Cook(/*recipe No*/32, /*Item No*/37, "PncaksWSyrup", "A stack of flavor", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/32, /*Item No*/37, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Pancakes w Syrup

			//Thin Pancakes w Syrup
			else if(((Item1 == 8 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 8)) && RecipesFound[32] == 1){
				if(RecipeMade[32] == 1){
					ItemData = new Cook(/*recipe No*/33, /*Item No*/38, "ThnPncaksWSyrup", "A stack of flavor?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/33, /*Item No*/38, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Thin Pancakes w Syrup
			
			//Cheese Pancakes w Syrup
			else if(((Item1 == 13 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 13)) && RecipesFound[33] == 1){
				if(RecipeMade[33] == 1){
					ItemData = new Cook(/*recipe No*/34, /*Item No*/39, "ChzPncaksWSyrup", "A stack of flavor!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/34, /*Item No*/39, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Pancakes w Syrup
			
			//Caramels
			else if((Item1 == 33 && Item2 == 0) && RecipesFound[34] == 1){
				if(RecipeMade[34] == 1){
					ItemData = new Cook(/*recipe No*/35, /*Item No*/40, "Caramels", "Bite sized bits", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/35, /*Item No*/40, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramels
			
			//Hard Candy
			else if((Item1 == 35 && Item2 == 0) && RecipesFound[35] == 1){
				if(RecipeMade[35] == 1){
					ItemData = new Cook(/*recipe No*/36, /*Item No*/41, "Hard Candy", "Hard to eat", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/36, /*Item No*/41, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Hard Candy
			
			//Jelly Candy
			else if(((Item1 == 32 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 32)) && RecipesFound[36] == 1){
				if(RecipeMade[36] == 1){
					ItemData = new Cook(/*recipe No*/37, /*Item No*/42, "Jelly Candy", "Chewy!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/37, /*Item No*/42, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Jelly Candy

			//Sugar Frosted Caramels
			else if(((Item1 == 32 && Item2 == 40) ||
					(Item1 == 40 && Item2 == 32)) && RecipesFound[37] == 1){
				if(RecipeMade[37] == 1){
					ItemData = new Cook(/*recipe No*/38, /*Item No*/43, "SugrFrstdCaramel", "Sugar frosted?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/38, /*Item No*/43, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Sugar Frosted Caramels
			
			//Caramel Syrup
			else if(((Item1 == 33 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 33)) && RecipesFound[38] == 1){
				if(RecipeMade[38] == 1){
					ItemData = new Cook(/*recipe No*/39, /*Item No*/44, "Caramel Syrup", "For pancakes?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/39, /*Item No*/44, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Syrup
			
			//Hard Candies
			else if((Item1 == 41 && Item2 == 0) && RecipesFound[39] == 1){
				if(RecipeMade[39] == 1){
					ItemData = new Cook(/*recipe No*/40, /*Item No*/45, "Hard Candies", "Sharp?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/40, /*Item No*/45, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Hard Candies
			
			//Jelly Beans
			else if(((Item1 == 32 && Item2 == 42) ||
					(Item1 == 42 && Item2 == 32)) && RecipesFound[40] == 1){
				if(RecipeMade[40] == 1){
					ItemData = new Cook(/*recipe No*/41, /*Item No*/46, "Jelly Beans", "Small candies", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/41, /*Item No*/46, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Jelly Beans
			
			//Chocolate Fondue
			else if((Item1 == 47 && Item2 == 0) && RecipesFound[41] == 1){
				if(RecipeMade[41] == 1){
					ItemData = new Cook(/*recipe No*/42, /*Item No*/48, "Chocolate fondue", "almost like soup", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/42, /*Item No*/48, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Fondue
			
			//Hot Chocolate
			else if(((Item1 == 5 && Item2 == 47) ||
					(Item1 == 47 && Item2 == 5)) && RecipesFound[42] == 1){
				if(RecipeMade[42] == 1){
					ItemData = new Cook(/*recipe No*/43, /*Item No*/49, "Hot Chocolate", "Steamy goodness", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/43, /*Item No*/49, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Hot Chocolate
	
			//Chocolate Pancakes
			else if(((Item1 == 6 && Item2 == 47) ||
					(Item1 == 47 && Item2 == 6)) && RecipesFound[43] == 1){
				if(RecipeMade[43] == 1){
					ItemData = new Cook(/*recipe No*/44, /*Item No*/50, "ChocoPncakes", "Tasty stack", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/44, /*Item No*/50, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Pancakes

			//Chocolate Bar
			else if(((Item1 == 32 && Item2 == 47) ||
					(Item1 == 47 && Item2 == 32)) && RecipesFound[44] == 1){
				if(RecipeMade[44] == 1){
					ItemData = new Cook(/*recipe No*/45, /*Item No*/51, "ChocolateBar", "Portable chocolate", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/45, /*Item No*/51, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Bar

			//Chocolate Caramels
			else if(((Item1 == 40 && Item2 == 47) ||
					(Item1 == 47 && Item2 == 40)) && RecipesFound[45] == 1){
				if(RecipeMade[45] == 1){
					ItemData = new Cook(/*recipe No*/46, /*Item No*/52, "ChocoCaramels", "Candy Cubes", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/46, /*Item No*/52, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Caramels

			//Chocolate Syrup
			else if(((Item1 == 35 && Item2 == 47) ||
					(Item1 == 47 && Item2 == 35)) && RecipesFound[46] == 1){
				if(RecipeMade[46] == 1){
					ItemData = new Cook(/*recipe No*/47, /*Item No*/53, "ChocoSyrup", "Tasty liquid", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/47, /*Item No*/53, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Syrup

			//Caramel Hot Chocolate
			else if(((Item1 == 33 && Item2 == 49) ||
					(Item1 == 49 && Item2 == 33)) && RecipesFound[47] == 1){
				if(RecipeMade[47] == 1){
					ItemData = new Cook(/*recipe No*/48, /*Item No*/54, "CarmlHotChoco", "Sweet drink", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/48, /*Item No*/54, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Hot Chocolate

			//Pancakes W choco Syrup
			else if(((Item1 == 7 && Item2 == 53) ||
					(Item1 == 53 && Item2 == 7)) && RecipesFound[48] == 1){
				if(RecipeMade[48] == 1){
					ItemData = new Cook(/*recipe No*/49, /*Item No*/55, "PncaksWChocoSyrup", "Stack of sweetness", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/49, /*Item No*/55, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Pancakes W Choco Syrup

			//Thin Pancakes W choco Syrup
			else if(((Item1 == 8 && Item2 == 53) ||
					(Item1 == 53 && Item2 == 8)) && RecipesFound[49] == 1){
				if(RecipeMade[49] == 1){
					ItemData = new Cook(/*recipe No*/50, /*Item No*/56, "ThnPncksWChSyrup", "Less dissapointing", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/50, /*Item No*/56, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Thin Pancakes W Choco Syrup

			//Cheese Pancakes W choco Syrup
			else if(((Item1 == 13 && Item2 == 53) ||
					(Item1 == 53 && Item2 == 13)) && RecipesFound[50] == 1){
				if(RecipeMade[50] == 1){
					ItemData = new Cook(/*recipe No*/51, /*Item No*/57, "ChzPncksWChSyrup", "Cheezy Chocolate", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/51, /*Item No*/57, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Pancakes W Choco Syrup

			//Chocolate Pancakes W Syrup
			else if(((Item1 == 35 && Item2 == 50) ||
					(Item1 == 50 && Item2 == 35)) && RecipesFound[51] == 1){
				if(RecipeMade[51] == 1){
					ItemData = new Cook(/*recipe No*/52, /*Item No*/58, "ChocoPncksWSyrup", "Chocolate stack", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/52, /*Item No*/58, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Pancakes W Syrup

			//Chocolate Pancakes W Choco Syrup
			else if(((Item1 == 53 && Item2 == 50) ||
					(Item1 == 50 && Item2 == 53)) && RecipesFound[52] == 1){
				if(RecipeMade[52] == 1){
					ItemData = new Cook(/*recipe No*/53, /*Item No*/59, "ChcPncksWChSyrup", "Double chocolate!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/53, /*Item No*/59, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Pancakes W Choco Syrup
			
			//Chocolate Caramel Cake
			else if(((Item1 == 43 && Item2 == 52) ||
					(Item1 == 52 && Item2 == 43)) && RecipesFound[53] == 1){
				if(RecipeMade[53] == 1){
					ItemData = new Cook(/*recipe No*/54, /*Item No*/60, "ChocoCarmlCake", "Cake! YES!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/54, /*Item No*/60, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Chocolate Caramel Cake
			
			//Blueberry Bread
			else if(((Item1 == 2 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 2)) && RecipesFound[54] == 1){
				if(RecipeMade[54] == 1){
					ItemData = new Cook(/*recipe No*/55, /*Item No*/62, "BlueberryBread", "contains blueberries", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/55, /*Item No*/62, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Bread

			//Blueberry Juice
			else if(((Item1 == 5 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 5)) && RecipesFound[55] == 1){
				if(RecipeMade[55] == 1){
					ItemData = new Cook(/*recipe No*/56, /*Item No*/63, "BlueberryJuice", "refreshing!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/56, /*Item No*/63, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Juice

			//Blueberry Pancakes
			else if(((Item1 == 6 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 6)) && RecipesFound[56] == 1){
				if(RecipeMade[56] == 1){
					ItemData = new Cook(/*recipe No*/57, /*Item No*/64, "BlueberryPancake", "Better than normal!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/57, /*Item No*/64, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Pancakes
			
			//Blueberry Steak
			else if(((Item1 == 16 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 16)) && RecipesFound[57] == 1){
				if(RecipeMade[57] == 1){
					ItemData = new Cook(/*recipe No*/58, /*Item No*/65, "BlueberrySteak", "Sweet and savory!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/58, /*Item No*/65, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Steak

			//Blueberry Syrup
			else if(((Item1 == 35 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 35)) && RecipesFound[58] == 1){
				if(RecipeMade[58] == 1){
					ItemData = new Cook(/*recipe No*/59, /*Item No*/66, "BlueberrySyrup", "Fruity, sticky!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/59, /*Item No*/66, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Syrup
			
			//Choco Covered Blueberries
			else if(((Item1 == 47 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 47)) && RecipesFound[59] == 1){
				if(RecipeMade[59] == 1){
					ItemData = new Cook(/*recipe No*/60, /*Item No*/67, "ChocoBlueberry", "Sweet combo!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/60, /*Item No*/67, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Choco Covered Blueberries
			
			//Cheese Dipped Blueberries
			else if(((Item1 == 10 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 10)) && RecipesFound[60] == 1){
				if(RecipeMade[60] == 1){
					ItemData = new Cook(/*recipe No*/61, /*Item No*/68, "CheeseBlueberry", "Cheese dipped", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/61, /*Item No*/68, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Dipped Blueberries	
			
			//Blueberry Concentrate
			else if((Item1 == 63 && Item2 == 0) && RecipesFound[61] == 1){
				if(RecipeMade[61] == 1){
					ItemData = new Cook(/*recipe No*/62, /*Item No*/69, "Blue Powder", "Tastes like blueberries", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/62, /*Item No*/69, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Concentrate
			
			//Blueberry Jelly
			else if(((Item1 == 35 && Item2 == 63) ||
					(Item1 == 63 && Item2 == 35)) && RecipesFound[62] == 1){
				if(RecipeMade[62] == 1){
					ItemData = new Cook(/*recipe No*/63, /*Item No*/70, "BlueberryJelly", "Fruit jelly", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/63, /*Item No*/70, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Jelly

			//Blueberry Jelly Candy
			else if(((Item1 == 42 && Item2 == 63) ||
					(Item1 == 63 && Item2 == 42)) && RecipesFound[63] == 1){
				if(RecipeMade[63] == 1){
					ItemData = new Cook(/*recipe No*/64, /*Item No*/71, "BberryJellyCandy", "Chewy and fruity", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/64, /*Item No*/71, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Jelly Candy

			//Blueberry Jelly Beans
			else if(((Item1 == 46 && Item2 == 63) ||
					(Item1 == 63 && Item2 == 46)) && RecipesFound[64] == 1){
				if(RecipeMade[64] == 1){
					ItemData = new Cook(/*recipe No*/65, /*Item No*/72, "BberryJellyBeans", "Tiny and fruity", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/65, /*Item No*/72, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Jelly Beans

			//Pancakes W Blueberry Syrup
			else if(((Item1 == 7 && Item2 == 66) ||
					(Item1 == 66 && Item2 == 7)) && RecipesFound[65] == 1){
				if(RecipeMade[65] == 1){
					ItemData = new Cook(/*recipe No*/66, /*Item No*/73, "PancakeWBbSyrup", "Fruity and good", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/66, /*Item No*/73, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Pancakes W Blueberry Syrup
			
			//Thin Pancakes W Blueberry Syrup
			else if(((Item1 == 8 && Item2 == 66) ||
					(Item1 == 66 && Item2 == 8)) && RecipesFound[66] == 1){
				if(RecipeMade[66] == 1){
					ItemData = new Cook(/*recipe No*/67, /*Item No*/74, "ThnPncakWBbSyrup", "Fruity and good?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/67, /*Item No*/74, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Thin Pancakes W Blueberry Syrup

			//Cheese Pancakes W Blueberry Syrup
			else if(((Item1 == 13 && Item2 == 66) ||
					(Item1 == 66 && Item2 == 13)) && RecipesFound[67] == 1){
				if(RecipeMade[67] == 1){
					ItemData = new Cook(/*recipe No*/68, /*Item No*/75, "ChzPncakWBbSyrup", "Cheese and fruit", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/68, /*Item No*/75, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cheese Pancakes W Blueberry Syrup

			//Choco Pancakes W Blueberry Syrup
			else if(((Item1 == 50 && Item2 == 66) ||
					(Item1 == 66 && Item2 == 50)) && RecipesFound[68] == 1){
				if(RecipeMade[68] == 1){
					ItemData = new Cook(/*recipe No*/69, /*Item No*/76, "ChcPncakWBbSyrup", "fruity chocolate", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/69, /*Item No*/76, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Choco Pancakes W Blueberry Syrup

			//Blueberry Pancakes W Syrup
			else if(((Item1 == 35 && Item2 == 64) ||
					(Item1 == 64 && Item2 == 35)) && RecipesFound[69] == 1){
				if(RecipeMade[69] == 1){
					ItemData = new Cook(/*recipe No*/70, /*Item No*/77, "BBPncakWSyrup", "A sweet combo", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/70, /*Item No*/77, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Pancakes W Syrup

			//Blueberry Pancakes W Choco Syrup
			else if(((Item1 == 53 && Item2 == 64) ||
					(Item1 == 64 && Item2 == 53)) && RecipesFound[70] == 1){
				if(RecipeMade[70] == 1){
					ItemData = new Cook(/*recipe No*/71, /*Item No*/78, "BBPncakWChSyrup", "A sweet combo", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/71, /*Item No*/78, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Pancakes W Choco Syrup

			//Blueberry Pancakes W Blueberry Syrup
			else if(((Item1 == 66 && Item2 == 64) ||
					(Item1 == 64 && Item2 == 66)) && RecipesFound[71] == 1){
				if(RecipeMade[71] == 1){
					ItemData = new Cook(/*recipe No*/72, /*Item No*/79, "BBPncakWBbSyrup", "Double Blueberry", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/72, /*Item No*/79, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Pancakes W Blueberry Syrup

			//Toast W Blueberry Jelly
			else if(((Item1 == 4 && Item2 == 70) ||
					(Item1 == 70 && Item2 == 4)) && RecipesFound[72] == 1){
				if(RecipeMade[72] == 1){
					ItemData = new Cook(/*recipe No*/73, /*Item No*/80, "Toast W Jelly", "A good combo", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/73, /*Item No*/80, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Toast W Blueberry Jelly
			
			//Ice Sculpture
			else if((Item1 == 81 && Item2 == 0) && RecipesFound[73] == 1){
				if(RecipeMade[73] == 1){
					ItemData = new Cook(/*recipe No*/74, /*Item No*/82, "Ice Sculpture", "well made", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/74, /*Item No*/82, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Ice Sculpture
			
			//Ice Water
			else if(((Item1 == 5 && Item2 == 81) ||
					(Item1 == 81 && Item2 == 5)) && RecipesFound[74] == 1){
				if(RecipeMade[74] == 1){
					ItemData = new Cook(/*recipe No*/75, /*Item No*/83, "Ice Water", "It's cold!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/75, /*Item No*/83, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Ice Water
			
			//Crushed Ice
			else if((Item1 == 82 && Item2 == 0) && RecipesFound[75] == 1){
				if(RecipeMade[75] == 1){
					ItemData = new Cook(/*recipe No*/76, /*Item No*/84, "Crushed ice", "It's broken", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/76, /*Item No*/84, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Crushed Ice
			
			//Blueberry Icicle
			else if(((Item1 == 81 && Item2 == 63) ||
					(Item1 == 63 && Item2 == 81)) && RecipesFound[76] == 1){
				if(RecipeMade[76] == 1){
					ItemData = new Cook(/*recipe No*/77, /*Item No*/85, "BBerryIcicle", "Cold confection", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/77, /*Item No*/85, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Icicle

			//Shaved Ice
			else if(((Item1 == 81 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 81)) && RecipesFound[77] == 1){
				if(RecipeMade[77] == 1){
					ItemData = new Cook(/*recipe No*/78, /*Item No*/86, "Shaved Ice", "Cool and sweet!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/78, /*Item No*/86, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Shaved Ice

			//Blueberry Shaved Ice
			else if(((Item1 == 81 && Item2 == 66) ||
					(Item1 == 66 && Item2 == 81)) && RecipesFound[78] == 1){
				if(RecipeMade[78] == 1){
					ItemData = new Cook(/*recipe No*/79, /*Item No*/87, "BerryShavedIce", "Cool and sweet!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/79, /*Item No*/87, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Shaved Ice

			//Refreshing Choco Drink
			else if(((Item1 == 81 && Item2 == 47) ||
					(Item1 == 47 && Item2 == 81)) && RecipesFound[79] == 1){
				if(RecipeMade[79] == 1){
					ItemData = new Cook(/*recipe No*/80, /*Item No*/88, "Choco Drink", "Refreshing!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/80, /*Item No*/88, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Refreshing Choco Drink

			//Caramel Pancakes
			else if(((Item1 == 6 && Item2 == 33) ||
					(Item1 == 33 && Item2 == 6)) && RecipesFound[80] == 1){
				if(RecipeMade[80] == 1){
					ItemData = new Cook(/*recipe No*/81, /*Item No*/89, "CarmlPancakes", "Sweet stack!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/81, /*Item No*/89, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Pancakes

			//Caramel Bread
			else if(((Item1 == 2 && Item2 == 33) ||
					(Item1 == 33 && Item2 == 2)) && RecipesFound[81] == 1){
				if(RecipeMade[81] == 1){
					ItemData = new Cook(/*recipe No*/82, /*Item No*/90, "CarmelBread", "Sweet Bread", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/82, /*Item No*/90, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Bread

			//Caramel Choco Bar
			else if(((Item1 == 51 && Item2 == 33) ||
					(Item1 == 33 && Item2 == 51)) && RecipesFound[82] == 1){
				if(RecipeMade[82] == 1){
					ItemData = new Cook(/*recipe No*/83, /*Item No*/91, "CarmelChcBar", "Gooey inside", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/83, /*Item No*/91, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Choco Bar

			//Caramel Pancakes W Syrup
			else if(((Item1 == 89 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 89)) && RecipesFound[83] == 1){
				if(RecipeMade[83] == 1){
					ItemData = new Cook(/*recipe No*/84, /*Item No*/92, "CrmlPnckWSyrup", "Double Sweetness", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/84, /*Item No*/92, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Pancakes W Syrup

			//Caramel Pancakes W Choco Syrup
			else if(((Item1 == 89 && Item2 == 53) ||
					(Item1 == 53 && Item2 == 89)) && RecipesFound[84] == 1){
				if(RecipeMade[84] == 1){
					ItemData = new Cook(/*recipe No*/85, /*Item No*/93, "CrmlPnckWChSyrup", "Double Sweetness", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/85, /*Item No*/93, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Pancakes W Choco Syrup

			//Caramel Pancakes W Blueberry Syrup
			else if(((Item1 == 89 && Item2 == 66) ||
					(Item1 == 66 && Item2 == 89)) && RecipesFound[85] == 1){
				if(RecipeMade[85] == 1){
					ItemData = new Cook(/*recipe No*/86, /*Item No*/94, "CrmlPnckWBbSyrup", "Double Sweetness!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/86, /*Item No*/94, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Caramel Pancakes W Blueberry Syrup

			//Stale Bread
			else if(((Item1 == 3 && Item2 == 119) ||
					(Item1 == 119 && Item2 == 3)) && RecipesFound[86] == 1){
				if(RecipeMade[86] == 1){
					ItemData = new Cook(/*recipe No*/87, /*Item No*/120, "Stale Bread", " Gross", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/87, /*Item No*/120, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Stale Bread
			
			//Rotten Meat
			else if(((Item1 == 15 && Item2 == 119) ||
					(Item1 == 119 && Item2 == 15)) && RecipesFound[87] == 1){
				if(RecipeMade[87] == 1){
					ItemData = new Cook(/*recipe No*/88, /*Item No*/121, "Rotten Meat", " Why though?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/88, /*Item No*/121, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Rotten Meat

			//Cursed Meat
			else if(((Item1 == 121 && Item2 == 118) ||
					(Item1 == 118 && Item2 == 121)) && RecipesFound[88] == 1){
				if(RecipeMade[88] == 1){
					ItemData = new Cook(/*recipe No*/89, /*Item No*/122, "Cursed Meat", "Not good", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/89, /*Item No*/122, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cursed Meat

			//Prison Food
			else if(((Item1 == 120 && Item2 == 5) ||
					(Item1 == 5 && Item2 == 120)) && RecipesFound[89] == 1){
				if(RecipeMade[89] == 1){
					ItemData = new Cook(/*recipe No*/90, /*Item No*/123, "Prison Food", "Haha", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/90, /*Item No*/123, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Prison Food

			//Dry Bread
			else if(((Item1 == 112 && Item2 == 3) ||
					(Item1 == 3 && Item2 == 112)) && RecipesFound[90] == 1){
				if(RecipeMade[90] == 1){
					ItemData = new Cook(/*recipe No*/91, /*Item No*/124, "Dry Bread", "desert like", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/91, /*Item No*/124, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Dry Bread

			//Pancake Armor
			else if(((Item1 == 280 && Item2 == 6) ||
					(Item1 == 6 && Item2 == 280)) && RecipesFound[91] == 1){
				if(RecipeMade[91] == 1){
					ItemData = new Cook(/*recipe No*/92, /*Item No*/204, "PanckeArmor", "Armor?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/92, /*Item No*/204, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Pancake Armor

			//Pancake Armor W Syrup
			else if(((Item1 == 204 && Item2 == 35) ||
					(Item1 == 35 && Item2 == 204)) && RecipesFound[92] == 1){
				if(RecipeMade[92] == 1){
					ItemData = new Cook(/*recipe No*/93, /*Item No*/205, "PnckArmrWSyrup", "Better Armor?", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/93, /*Item No*/205, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Pancake Armor W Syrup
			
			//Blueberry Armor
			else if(((Item1 == 280 && Item2 == 61) ||
					(Item1 == 61 && Item2 == 280)) && RecipesFound[93] == 1){
				if(RecipeMade[93] == 1){
					ItemData = new Cook(/*recipe No*/94, /*Item No*/252, "BluebrryArmr", "Strange Armor", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/94, /*Item No*/252, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Blueberry Armor
			
			//Null Pancakes
			else if(((Item1 == 6 && Item2 == 281) ||
					(Item1 == 281 && Item2 == 6)) && RecipesFound[94] == 1){
				if(RecipeMade[94] == 1){
					ItemData = new Cook(/*recipe No*/95, /*Item No*/285, "NULLPancakes", "...", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/95, /*Item No*/285, "???", "NULL", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Null Pancakes
			
			//Unused Item
			else if((Item1 == 287 && Item2 == 0) && RecipesFound[95] == 1){
				if(RecipeMade[95] == 1){
					ItemData = new Cook(/*recipe No*/96, /*Item No*/288, "Unused Item", "Uncertain use", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/96, /*Item No*/288, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Unused Item
			
			//Cook Item
			else if(((Item1 == 112 && Item2 == 280) ||
					(Item1 == 280 && Item2 == 112)) && RecipesFound[96] == 1){
				if(RecipeMade[96] == 1){
					ItemData = new Cook(/*recipe No*/97, /*Item No*/300, "Cook Item", "Flaming hot!", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/97, /*Item No*/300, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Cook Item
			
			//Potion
			else if((Item1 == 98 && Item2 == 0) && RecipesFound[97] == 1){
				if(RecipeMade[97] == 1){
					ItemData = new Cook(/*recipe No*/98, /*Item No*/1, "Potion", "Useful", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//has been made before
				else{
					ItemData = new Cook(/*recipe No*/98, /*Item No*/1, "???", "???", /*Price*/3, /*Cutscene*/45);//Cook Normal Food item cutscene
				}//Has not been made before
			}//Potion
			
				
			else{
				ItemData = new Cook(-1, -1, "???", "???", 0, 0);
			}
		//ItemData = new Cook(CookedItem, ItemName, ItemDescription, Price, CutsceneEvent);
		return ItemData;
	}//CookItems End
	
	
}
