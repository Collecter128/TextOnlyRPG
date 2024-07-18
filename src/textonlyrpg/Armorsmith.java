package textonlyrpg;

public class Armorsmith {
	public int RecipeNo = 1;
	public int ItemNo = 1;
	public String ItemName = "TestItem1";
	public String ItemDisc = "TestItem1";
	public int MaterialNo1 = 0;
	public String Material1Name = "";
	public int MaterialNo2 = 0;
	public String Material2Name = "";
	public int ItemType = 1;
	public int RecipeMade = 1;
	public int Price;
	static int i = 0;
	
	
	public Armorsmith(int RecipeNo, int ItemNo, String ItemName, String ItemDisc, int MaterialNo1, String Material1Name, int MaterialNo2, String Material2Name, int ItemType, int RecipeMade, int Price){
		this.RecipeNo = RecipeNo;
		this.ItemNo = ItemNo;
		this.ItemName  = ItemName;
		this.ItemDisc = ItemDisc;
		this.MaterialNo1 = MaterialNo1;
		this.Material1Name = Material1Name;
		this.MaterialNo2 = MaterialNo2;
		this.Material2Name = Material2Name;
		this.ItemType = ItemType;
		this.RecipeMade = RecipeMade;
		this.Price = Price;
	}
	
	public int getRecipeNo(){
		return RecipeNo;
	}
	
	public int getItemNo(){
		return ItemNo;
	}
	
	public String getItemName(){
		return ItemName;
	}
	
	public String getItemDisc(){
		return ItemDisc;
	}
	
	public int getItemType(){
		return ItemType;
	}
	
	public int getMaterialNo1(){
		return MaterialNo1;
	}
	
	public int getMaterialNo2(){
		return MaterialNo2;
	}
	
	public int getRecipeMade(){
		return RecipeMade;
	}
	
	public int getPrice(){
		return Price;
	}

	//Cook
	//Weaponsmith
	//Armorsmith
	
	
	//Armorsmith(RecipeNo, ItemNo, ItemName, ItemDisc, MaterialNo1, MaterialNo2, ItemType, RecipeMade, Price)
	public static Armorsmith[] ArmorList(int[] ArmorFound, int[] ArmorMade){
		int ArmorTotal = ArmorTotal(ArmorFound);
		Armorsmith[] AData = new Armorsmith[ArmorTotal];{
			int i = 0;
			while(i < (ArmorTotal - 1)){
				AData[i] = new Armorsmith(00, 00, "", "No Disc", 0, "", 0, "", 0, 0, 0);
				i = i + 1;
			}
			int Total = 0;

			if(ArmorFound[0] == 1){
				if(ArmorMade[0] == 0){
					AData[Total] = new Armorsmith(1, 289, "???", "???", 1, "TestItem1?", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(2, 8, "???", "???", 1, "TestItem1?", 0, "", 1, 0, 3);
				}
				if(ArmorMade[0] == 1){
					AData[Total] = new Armorsmith(1, 289, "AItem1", "TestItem1", 289, "TestItem1", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(2, 8, "AItem1", "TestItem1", 8, "TestItem1", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
			if(ArmorFound[1] == 1){
				if(ArmorMade[1] == 0){
					AData[Total] = new Armorsmith(2, 290, "???", "???", 1, "???", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(3, 9, "???", "???", 1, "???", 0, "", 1, 0, 3);
				}
				if(ArmorMade[1] == 1){
					AData[Total] = new Armorsmith(2, 290, "AItem2", "TestItem2", 1, "Potion??", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(3, 9, "AItem2", "TestItem2", 1, "Potion??", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
//			if(ArmorFound[2] == 1){
//				if(ArmorMade[2] == 0){
//					AData[Total] = new Armorsmith(3, 3, "???", "???", 0, "", 0, "", 1, 0, 3);
//				}
//				if(ArmorMade[2] == 1){
//					AData[Total] = new Armorsmith(3, 3, "AItem3", "TestItem3", 0, "", 0, "", 1, 1, 3);
//				}
//				Total = Total + 1;
//			}
			if(ArmorFound[2] == 1){
				if(ArmorMade[2] == 0){
					AData[Total] = new Armorsmith(3, 292, "???", "???", 0, "", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(4, 11, "???", "???", 0, "", 0, "", 1, 0, 3);
				}
				if(ArmorMade[2] == 1){
					AData[Total] = new Armorsmith(3, 292, "AItem3", "TestItem4", 0, "", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(4, 11, "AItem3", "TestItem4", 0, "", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
//			if(ArmorFound[3] == 1){
//			if(ArmorMade[2] == 0){
//				AData[Total] = new Armorsmith(4, 5, "???", "???", 0, "", 0, "", 1, 0, 3);
//			}
//			if(ArmorMade[2] == 1){
//				AData[Total] = new Armorsmith(4, 282, "AItem4", "TestItem5", 0, "", 0, "", 1, 1, 3);
//			}
//			Total = Total + 1;
//		}
			if(ArmorFound[3] == 1){
				if(ArmorMade[3] == 0){
					AData[Total] = new Armorsmith(4, 294, "???", "???", 0, "", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(5, 13, "???", "???", 0, "", 0, "", 1, 0, 3);
				}
				if(ArmorMade[3] == 1){
					AData[Total] = new Armorsmith(4, 294, "AItem4", "TestItem6", 292, "TestItem4", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(5, 13, "AItem4", "TestItem6", 11, "TestItem4", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}
			//ArmorFound[4] == 1?
			
			if(ArmorFound[4] == 1){//Hood
				if(ArmorMade[4] == 0){
					AData[Total] = new Armorsmith(5, 176, "???", "Head Armor", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[4] == 1){
					AData[Total] = new Armorsmith(5, 176, "Hood", "Head Armor", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Hood
			if(ArmorFound[5] == 1){
				if(ArmorMade[5] == 0){
					AData[Total] = new Armorsmith(6, 177, "???", "Body Armor", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[5] == 1){
					AData[Total] = new Armorsmith(6, 177, "Robe", "Body Armor", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//robe
			if(ArmorFound[6] == 1){
				if(ArmorMade[6] == 0){
					AData[Total] = new Armorsmith(7, 178, "???", "Basic Armor?", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[6] == 1){
					AData[Total] = new Armorsmith(7, 178, "Shirt", "Basic Armor?", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//shirt
			if(ArmorFound[7] == 1){//Gloves
				if(ArmorMade[7] == 0){
					AData[Total] = new Armorsmith(8, 179, "???", "Hand Armor", 95, "Cloth", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(1, 7, "???", "Hand Armor", 4, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[7] == 1){
					AData[Total] = new Armorsmith(8, 179, "Gloves", "Hand Armor", 95, "Cloth", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(1, 7, "Gloves", "Hand Armor", 4, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Gloves
			if(ArmorFound[8] == 1){//Pants
				if(ArmorMade[8] == 0){
					AData[Total] = new Armorsmith(9, 180, "???", "Leg Armor", 95, "Cloth", 0, "", 1, 0, 3);
					//AData[Total] = new Armorsmith(1, 7, "???", "Hand Armor", 4, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[8] == 1){
					AData[Total] = new Armorsmith(9, 180, "Pants", "Leg Armor", 95, "Cloth", 0, "", 1, 1, 3);
					//AData[Total] = new Armorsmith(1, 7, "Gloves", "Hand Armor", 4, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pants
			if(ArmorFound[9] == 1){//Socks
				if(ArmorMade[9] == 0){
					AData[Total] = new Armorsmith(10, 181, "???", "Foot Armor?", 95, "Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[9] == 1){
					AData[Total] = new Armorsmith(10, 181, "Socks", "Foot Armor?", 95, "Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Socks
			
			if(ArmorFound[10] == 1){//Ghost Hood
				if(ArmorMade[10] == 0){
					AData[Total] = new Armorsmith(11, 182, "???", "Head Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[10] == 1){
					AData[Total] = new Armorsmith(11, 182, "Ghost Hood", "Head Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost Hood
			if(ArmorFound[11] == 1){
				if(ArmorMade[11] == 0){
					AData[Total] = new Armorsmith(12, 183, "???", "Body Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[11] == 1){
					AData[Total] = new Armorsmith(12, 183, "Ghost Robe", "Body Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost robe
			if(ArmorFound[12] == 1){
				if(ArmorMade[12] == 0){
					AData[Total] = new Armorsmith(13, 184, "???", "Basic Armor?", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[12] == 1){
					AData[Total] = new Armorsmith(13, 184, "Ghost Shirt", "Basic Armor?", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost shirt
			if(ArmorFound[13] == 1){//Gloves
				if(ArmorMade[13] == 0){
					AData[Total] = new Armorsmith(14, 185, "???", "Hand Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[13] == 1){
					AData[Total] = new Armorsmith(14, 185, "GhostGloves", "Hand Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ghost Gloves
			if(ArmorFound[14] == 1){//Ghost Pants
				if(ArmorMade[14] == 0){
					AData[Total] = new Armorsmith(15, 186, "???", "Leg Armor", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[14] == 1){
					AData[Total] = new Armorsmith(15, 186, "GhostPants", "Leg Armor", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//GhostPants
			if(ArmorFound[15] == 1){//Ghost Socks
				if(ArmorMade[15] == 0){
					AData[Total] = new Armorsmith(16, 187, "???", "Foot Armor?", 96, "Ghost Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[15] == 1){
					AData[Total] = new Armorsmith(16, 187, "GhostSocks", "Foot Armor?", 96, "Ghost Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//GhostSocks
			
			if(ArmorFound[16] == 1){//Dark Hood
				if(ArmorMade[16] == 0){
					AData[Total] = new Armorsmith(17, 188, "???", "Head Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[16] == 1){
					AData[Total] = new Armorsmith(17, 188, "DarkHood", "Head Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Hood
			if(ArmorFound[17] == 1){
				if(ArmorMade[17] == 0){
					AData[Total] = new Armorsmith(18, 189, "???", "Body Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[17] == 1){
					AData[Total] = new Armorsmith(18, 189, "DarkRobe", "Body Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark robe
			if(ArmorFound[18] == 1){
				if(ArmorMade[18] == 0){
					AData[Total] = new Armorsmith(19, 190, "???", "Basic Armor?", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[18] == 1){
					AData[Total] = new Armorsmith(19, 190, "DarkShirt", "Basic Armor?", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark shirt
			if(ArmorFound[19] == 1){//Dark Gloves
				if(ArmorMade[19] == 0){
					AData[Total] = new Armorsmith(20, 191, "???", "Hand Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[19] == 1){
					AData[Total] = new Armorsmith(20, 191, "DarkGloves", "Hand Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Gloves
			if(ArmorFound[20] == 1){//Dark Pants
				if(ArmorMade[20] == 0){
					AData[Total] = new Armorsmith(21, 192, "???", "Leg Armor", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[20] == 1){
					AData[Total] = new Armorsmith(21, 192, "DarkPants", "Leg Armor", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Pants
			if(ArmorFound[21] == 1){//Dark Socks
				if(ArmorMade[21] == 0){
					AData[Total] = new Armorsmith(22, 193, "???", "Foot Armor?", 97, "Dark Cloth", 0, "", 1, 0, 3);
				}
				if(ArmorMade[21] == 1){
					AData[Total] = new Armorsmith(22, 193, "DarkSocks", "Foot Armor?", 97, "Dark Cloth", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Socks
			
			if(ArmorFound[22] == 1){//Chain Hood
				if(ArmorMade[22] == 0){
					AData[Total] = new Armorsmith(23, 194, "???", "Head Chain Armor", 100, "Chain", 0, "", 1, 0, 3);
				}
				if(ArmorMade[22] == 1){
					AData[Total] = new Armorsmith(23, 194, "ChainHood", "A hood of Chain", 100, "Chain", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Chain Hood
			if(ArmorFound[23] == 1){//Chain robe
				if(ArmorMade[23] == 0){
					AData[Total] = new Armorsmith(24, 195, "???", "Chain back armor", 100, "Chain", 0, "", 1, 0, 3);
				}
				if(ArmorMade[23] == 1){
					AData[Total] = new Armorsmith(24, 195, "ChainRobe", "A chain cloak", 100, "Chain", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Chain Robe
			if(ArmorFound[24] == 1){//Chain Armor
				if(ArmorMade[24] == 0){
					AData[Total] = new Armorsmith(25, 196, "???", "Chain armor", 100, "Chain", 0, "", 1, 0, 3);
				}
				if(ArmorMade[24] == 1){
					AData[Total] = new Armorsmith(25, 196, "ChainArmor", "It's Chainmail", 100, "Chain", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Chain Armor
			
			if(ArmorFound[25] == 1){//Slime Armor
				if(ArmorMade[25] == 0){
					AData[Total] = new Armorsmith(26, 197, "???", "Slime???", 98, "Slime Jell", 0, "", 1, 0, 3);
				}
				if(ArmorMade[25] == 1){
					AData[Total] = new Armorsmith(26, 197, "SlimeArmor", "Armor made of slime", 98, "Slime Jell", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Slime Armor
			if(ArmorFound[26] == 1){//Golem Armor
				if(ArmorMade[26] == 0){
					AData[Total] = new Armorsmith(27, 198, "???", "Golem???", 99, "Golem Clay", 0, "", 1, 0, 3);
				}
				if(ArmorMade[26] == 1){
					AData[Total] = new Armorsmith(27, 198, "GolemArmr", "Armor made of clay", 99, "Golem Clay", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Golem Armor
			
			if(ArmorFound[27] == 1){//Icy Helmet
				if(ArmorMade[27] == 0){
					AData[Total] = new Armorsmith(28, 199, "???", "It's a Helmet?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[27] == 1){
					AData[Total] = new Armorsmith(28, 199, "IcyHelmet", "Helmet made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Armor
			if(ArmorFound[28] == 1){//Icy Armor
				if(ArmorMade[28] == 0){
					AData[Total] = new Armorsmith(29, 200, "???", "It's an Armor?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[28] == 1){
					AData[Total] = new Armorsmith(29, 200, "Icy Armor", "Armor made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Armor
			if(ArmorFound[29] == 1){//Icy Gauntlets
				if(ArmorMade[29] == 0){
					AData[Total] = new Armorsmith(30, 201, "???", "It's gauntlets?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[29] == 1){
					AData[Total] = new Armorsmith(30, 201, "IcyGntlets", "Gloves made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Gauntlets
			if(ArmorFound[30] == 1){//Icy Boots
				if(ArmorMade[30] == 0){
					AData[Total] = new Armorsmith(31, 202, "???", "It's boots?", 81, "Ice", 0, "", 1, 0, 3);
				}
				if(ArmorMade[30] == 1){
					AData[Total] = new Armorsmith(31, 202, "Icy Boots", "Boots made of ice?", 81, "Ice", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Icy Boots
			
			if(ArmorFound[31] == 1){//Rubber Armor
				if(ArmorMade[31] == 0){
					AData[Total] = new Armorsmith(32, 203, "???", "Armor", 101, "Rubber", 0, "", 1, 0, 3);
				}
				if(ArmorMade[31] == 1){
					AData[Total] = new Armorsmith(32, 203, "Rbr Armor", "Tough armor", 101, "Rubber", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Rubber Armor
			
			if(ArmorFound[32] == 1){//Pancake Armor
				if(ArmorMade[32] == 0){
					AData[Total] = new Armorsmith(33, 204, "???", "Armor?", 6, "PancakeMix", 0, "", 1, 0, 3);
				}
				if(ArmorMade[32] == 1){
					AData[Total] = new Armorsmith(33, 204, "PnCkArmor", "A bread armor?", 6, "PancakeMix", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pancake Armor
			
			if(ArmorFound[33] == 1){//Pancake Armor W. Syrup
				if(ArmorMade[33] == 0){
					AData[Total] = new Armorsmith(34, 205, "???", "Armor?", 204, "PnCkArmor", 35, "Syrup", 1, 0, 3);
				}
				if(ArmorMade[33] == 1){
					AData[Total] = new Armorsmith(34, 205, "PnCkArWS", "Better bread armor?", 204, "PnCkArmor", 35, "Syrup", 1, 1, 3);
				}
				Total = Total + 1;
			}//Pancake Armor W. Syrup
			
			if(ArmorFound[34] == 1){//Alloy A
				if(ArmorMade[34] == 0){
					AData[Total] = new Armorsmith(35, 106, "Alloy A", "Metal A+B", 102, "Metal A", 103, "Metal B", 1, 0, 3);
				}
				if(ArmorMade[34] == 1){
					AData[Total] = new Armorsmith(35, 106, "Alloy A", "A useful alloy", 102, "Metal A", 103, "Metal B", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy A
			
			if(ArmorFound[35] == 1){//Alloy B
				if(ArmorMade[35] == 0){
					AData[Total] = new Armorsmith(36, 107, "Alloy B", "Metal B+C", 103, "Metal B", 104, "Metal C", 1, 0, 3);
				}
				if(ArmorMade[35] == 1){
					AData[Total] = new Armorsmith(36, 107, "Alloy B", "A useful alloy", 103, "Metal B", 104, "Metal C", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy B
			
			if(ArmorFound[36] == 1){//Alloy D
				if(ArmorMade[36] == 0){
					AData[Total] = new Armorsmith(37, 108, "Alloy D", "Metal A+C", 102, "Metal A", 104, "Metal C", 1, 0, 3);
				}
				if(ArmorMade[36] == 1){
					AData[Total] = new Armorsmith(37, 108, "Alloy D", "A useful alloy", 102, "Metal A", 104, "Metal C", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy D
			
			if(ArmorFound[37] == 1){//Alloy I
				if(ArmorMade[37] == 0){
					AData[Total] = new Armorsmith(38, 109, "Alloy I", "Metal C + E", 104, "Metal C", 105, "Metal E", 1, 0, 3);
				}
				if(ArmorMade[37] == 1){
					AData[Total] = new Armorsmith(38, 109, "Alloy I", "A useful alloy", 104, "Metal C", 105, "Metal E", 1, 1, 3);
				}
				Total = Total + 1;
			}//Alloy I
			
			if(ArmorFound[38] == 1){//Helmet
				if(ArmorMade[38] == 0){
					AData[Total] = new Armorsmith(39, 206, "Helmet", "A helmet", 104, "Metal C", 0, "", 1, 0, 3);
				}
				if(ArmorMade[38] == 1){
					AData[Total] = new Armorsmith(39, 206, "Helmet", "A helmet", 104, "Metal C", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Helmet
			if(ArmorFound[39] == 1){//Armor
				if(ArmorMade[39] == 0){
					AData[Total] = new Armorsmith(40, 207, "Armor", "Body Armor", 104, "Metal C", 0, "", 1, 0, 3);
				}
				if(ArmorMade[39] == 1){
					AData[Total] = new Armorsmith(40, 207, "Armor", "Body Armor", 104, "Metal C", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Armor
			if(ArmorFound[40] == 1){//Gauntlets
				if(ArmorMade[40] == 0){
					AData[Total] = new Armorsmith(41, 208, "Gauntlts", "Hand armor", 104, "Metal C", 0, "", 1, 0, 3);
				}
				if(ArmorMade[40] == 1){
					AData[Total] = new Armorsmith(41, 208, "Gauntlts", "Hand armor", 104, "Metal C", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Gauntlets
			if(ArmorFound[41] == 1){//Boots
				if(ArmorMade[41] == 0){
					AData[Total] = new Armorsmith(42, 209, "Boots", "Foot armor", 104, "Metal C", 0, "", 1, 0, 3);
				}
				if(ArmorMade[41] == 1){
					AData[Total] = new Armorsmith(42, 209, "Boots", "Foot armor", 104, "Metal C", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Boots

			if(ArmorFound[42] == 1){//Fire Helmet
				if(ArmorMade[42] == 0){
					AData[Total] = new Armorsmith(43, 210, "FireHelm", "Fire Helmet", 104, "Metal C", 112, "FrEnergy", 1, 0, 3);
				}
				if(ArmorMade[42] == 1){
					AData[Total] = new Armorsmith(43, 210, "FireHelm", "Fire Helmet", 104, "Metal C", 112, "FrEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Fire Helmet
			if(ArmorFound[43] == 1){//Fire Armor
				if(ArmorMade[43] == 0){
					AData[Total] = new Armorsmith(44, 211, "FireArmr", "Fire Armor", 104, "Metal C", 112, "FrEnergy", 1, 0, 3);
				}
				if(ArmorMade[43] == 1){
					AData[Total] = new Armorsmith(44, 211, "FireArmr", "Fire Armor", 104, "Metal C", 112, "FrEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Fire Armor
			if(ArmorFound[44] == 1){//Fire Gauntlets
				if(ArmorMade[44] == 0){
					AData[Total] = new Armorsmith(45, 212, "FireGntls", "Fire Gauntlets", 104, "Metal C", 112, "FrEnergy", 1, 0, 3);
				}
				if(ArmorMade[44] == 1){
					AData[Total] = new Armorsmith(45, 212, "FireGntls", "Fire Gauntlets", 104, "Metal C", 112, "FrEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Fire Gauntlets
			if(ArmorFound[45] == 1){//Fire Boots
				if(ArmorMade[45] == 0){
					AData[Total] = new Armorsmith(46, 213, "FireBoots", "Fire Boots", 104, "Metal C", 112, "FrEnergy", 1, 0, 3);
				}
				if(ArmorMade[45] == 1){
					AData[Total] = new Armorsmith(46, 213, "FireBoots", "Fire Boots", 104, "Metal C", 112, "FrEnergy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Fire Boots
			
			if(ArmorFound[46] == 1){//Water Helmet
				if(ArmorMade[46] == 0){
					AData[Total] = new Armorsmith(47, 214, "WtrHelm", "Water Helm", 104, "Metal C", 113, "WtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[46] == 1){
					AData[Total] = new Armorsmith(47, 214, "WtrHelm", "Water Helm", 104, "Metal C", 113, "WtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Water Helmet
			if(ArmorFound[47] == 1){//Water Armor
				if(ArmorMade[47] == 0){
					AData[Total] = new Armorsmith(48, 215, "WtrArmr", "Water Armor", 104, "Metal C", 113, "WtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[47] == 1){
					AData[Total] = new Armorsmith(48, 215, "WtrArmr", "Water Armor", 104, "Metal C", 113, "WtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Water Armor
			if(ArmorFound[48] == 1){//Water Gauntlets
				if(ArmorMade[48] == 0){
					AData[Total] = new Armorsmith(49, 216, "WtrGntls", "Water Gauntlets", 104, "Metal C", 113, "WtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[48] == 1){
					AData[Total] = new Armorsmith(49, 216, "WtrGntls", "Water Gauntlets", 104, "Metal C", 113, "WtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Water Gauntlets
			if(ArmorFound[49] == 1){//Water Boots
				if(ArmorMade[49] == 0){
					AData[Total] = new Armorsmith(50, 217, "WtrBoots", "Water Boots", 104, "Metal C", 113, "WtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[49] == 1){
					AData[Total] = new Armorsmith(50, 217, "WtrBoots", "Water Boots", 104, "Metal C", 113, "WtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Water Boots
			
			if(ArmorFound[50] == 1){//Wind Helmet
				if(ArmorMade[50] == 0){
					AData[Total] = new Armorsmith(51, 218, "WndHelm", "Wind Helmet", 104, "Metal C", 114, "WdEnrgy", 1, 0, 3);
				}
				if(ArmorMade[50] == 1){
					AData[Total] = new Armorsmith(51, 218, "WndHelm", "Wind Helmet", 104, "Metal C", 114, "WdEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Wind Helmet
			if(ArmorFound[51] == 1){//Wind Armor
				if(ArmorMade[51] == 0){
					AData[Total] = new Armorsmith(52, 219, "WndArmr", "Wind Armor", 104, "Metal C", 114, "WdEnrgy", 1, 0, 3);
				}
				if(ArmorMade[51] == 1){
					AData[Total] = new Armorsmith(52, 219, "WndArmr", "Wind Armor", 104, "Metal C", 114, "WdEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Wind Armor
			if(ArmorFound[52] == 1){//Wind Gauntlets
				if(ArmorMade[52] == 0){
					AData[Total] = new Armorsmith(53, 220, "WndGntls", "Wind Gauntlets", 104, "Metal C", 114, "WdEnrgy", 1, 0, 3);
				}
				if(ArmorMade[52] == 1){
					AData[Total] = new Armorsmith(53, 220, "WndGntls", "Wind Gauntlets", 104, "Metal C", 114, "WdEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Wind Gauntlets
			if(ArmorFound[53] == 1){//Wind Boots
				if(ArmorMade[53] == 0){
					AData[Total] = new Armorsmith(54, 221, "WndBoots", "Wind Boots", 104, "Metal C", 114, "WdEnrgy", 1, 0, 3);
				}
				if(ArmorMade[53] == 1){
					AData[Total] = new Armorsmith(54, 221, "WndBoots", "Wind Boots", 104, "Metal C", 114, "WdEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Wind Boots
			
			if(ArmorFound[54] == 1){//Earth Helmet
				if(ArmorMade[54] == 0){
					AData[Total] = new Armorsmith(55, 222, "ErthHelm", "Earth Helmet", 104, "Metal C", 115, "EthEnrgy", 1, 0, 3);
				}
				if(ArmorMade[54] == 1){
					AData[Total] = new Armorsmith(55, 222, "ErthHelm", "Earth Helmet", 104, "Metal C", 115, "EthEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Earth Helmet
			if(ArmorFound[55] == 1){//Earth Armor
				if(ArmorMade[55] == 0){
					AData[Total] = new Armorsmith(56, 223, "ErthArmr", "Earth Armor", 104, "Metal C", 115, "EthEnrgy", 1, 0, 3);
				}
				if(ArmorMade[55] == 1){
					AData[Total] = new Armorsmith(56, 223, "ErthArmr", "Earth Armor", 104, "Metal C", 115, "EthEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Earth Armor
			if(ArmorFound[56] == 1){//Earth Gauntlets
				if(ArmorMade[56] == 0){
					AData[Total] = new Armorsmith(57, 224, "ErthGntls", "Earth Gauntlets", 104, "Metal C", 115, "EthEnrgy", 1, 0, 3);
				}
				if(ArmorMade[56] == 1){
					AData[Total] = new Armorsmith(57, 224, "ErthGntls", "Earth Gauntlets", 104, "Metal C", 115, "EthEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Earth Gauntlets
			if(ArmorFound[57] == 1){//Earth Boots
				if(ArmorMade[57] == 0){
					AData[Total] = new Armorsmith(58, 225, "ErthBoots", "Earth Boots", 104, "Metal C", 115, "EthEnrgy", 1, 0, 3);
				}
				if(ArmorMade[57] == 1){
					AData[Total] = new Armorsmith(58, 225, "ErthBoots", "Earth Boots", 104, "Metal C", 115, "EthEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Earth Boots
			
			if(ArmorFound[58] == 1){//Electric Helmet
				if(ArmorMade[58] == 0){
					AData[Total] = new Armorsmith(59, 226, "ElecHelm", "Electric Helmet", 104, "Metal C", 116, "ElcEnrgy", 1, 0, 3);
				}
				if(ArmorMade[58] == 1){
					AData[Total] = new Armorsmith(59, 226, "ElecHelm", "Electric Helmet", 104, "Metal C", 116, "ElcEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Electric Helmet
			if(ArmorFound[59] == 1){//Electric Armor
				if(ArmorMade[59] == 0){
					AData[Total] = new Armorsmith(60, 227, "ElecArmr", "Electric Armor", 104, "Metal C", 116, "ElcEnrgy", 1, 0, 3);
				}
				if(ArmorMade[59] == 1){
					AData[Total] = new Armorsmith(60, 227, "ElecArmr", "Electric Armor", 104, "Metal C", 116, "ElcEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Electric Armor
			if(ArmorFound[60] == 1){//Electric Gauntlets
				if(ArmorMade[60] == 0){
					AData[Total] = new Armorsmith(61, 228, "ElecGntlt", "Electric Gauntlets", 104, "Metal C", 116, "ElcEnrgy", 1, 0, 3);
				}
				if(ArmorMade[60] == 1){
					AData[Total] = new Armorsmith(61, 228, "ElecGntlt", "Electric Gauntlets", 104, "Metal C", 116, "ElcEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Electric Gauntlets
			if(ArmorFound[61] == 1){//Electric Boots
				if(ArmorMade[61] == 0){
					AData[Total] = new Armorsmith(62, 229, "ElecBoots", "Electric Boots", 104, "Metal C", 116, "ElcEnrgy", 1, 0, 3);
				}
				if(ArmorMade[61] == 1){
					AData[Total] = new Armorsmith(62, 229, "ElecBoots", "Electric Boots", 104, "Metal C", 116, "ElcEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Electric Boots
			
			if(ArmorFound[62] == 1){//Ice Helmet
				if(ArmorMade[62] == 0){
					AData[Total] = new Armorsmith(63, 230, "IceHelm", "Ice Helmet", 104, "Metal C", 117, "IceEnrgy", 1, 0, 3);
				}
				if(ArmorMade[62] == 1){
					AData[Total] = new Armorsmith(63, 230, "IceHelm", "Ice Helmet", 104, "Metal C", 117, "IceEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ice Helmet
			if(ArmorFound[63] == 1){//Ice Armor
				if(ArmorMade[63] == 0){
					AData[Total] = new Armorsmith(64, 231, "IceArmr", "Ice Armor", 104, "Metal C", 117, "IceEnrgy", 1, 0, 3);
				}
				if(ArmorMade[63] == 1){
					AData[Total] = new Armorsmith(64, 231, "IceArmr", "Ice Armor", 104, "Metal C", 117, "IceEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ice Armor
			if(ArmorFound[64] == 1){//Ice Gauntlets
				if(ArmorMade[64] == 0){
					AData[Total] = new Armorsmith(65, 232, "IceGntlt", "Ice Gauntlets", 104, "Metal C", 117, "IceEnrgy", 1, 0, 3);
				}
				if(ArmorMade[64] == 1){
					AData[Total] = new Armorsmith(65, 232, "IceGntlt", "Ice Gauntlets", 104, "Metal C", 117, "IceEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ice Gauntlets
			if(ArmorFound[65] == 1){//Ice Boots
				if(ArmorMade[65] == 0){
					AData[Total] = new Armorsmith(66, 233, "IceBoots", "Ice Boots", 104, "Metal C", 117, "IceEnrgy", 1, 0, 3);
				}
				if(ArmorMade[65] == 1){
					AData[Total] = new Armorsmith(66, 233, "IceBoots", "Ice Boots", 104, "Metal C", 117, "IceEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Ice Boots
			
			if(ArmorFound[66] == 1){//Light Helmet
				if(ArmorMade[66] == 0){
					AData[Total] = new Armorsmith(67, 234, "LghtHelm", "Light Helmet", 104, "Metal C", 118, "LhtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[66] == 1){
					AData[Total] = new Armorsmith(67, 234, "LghtHelm", "Light Helmet", 104, "Metal C", 118, "LhtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Light Helmet
			if(ArmorFound[67] == 1){//Light Armor
				if(ArmorMade[67] == 0){
					AData[Total] = new Armorsmith(68, 235, "LghtArmr", "Light Armor", 104, "Metal C", 118, "LhtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[67] == 1){
					AData[Total] = new Armorsmith(68, 235, "LghtArmr", "Light Armor", 104, "Metal C", 118, "LhtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Light Armor
			if(ArmorFound[68] == 1){//Light Gauntlets
				if(ArmorMade[68] == 0){
					AData[Total] = new Armorsmith(69, 236, "LghtGntlt", "Light Gauntlets", 104, "Metal C", 118, "LhtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[68] == 1){
					AData[Total] = new Armorsmith(69, 236, "LghtGntlt", "Light Gauntlets", 104, "Metal C", 118, "LhtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Light Gauntlets
			if(ArmorFound[69] == 1){//Light Boots
				if(ArmorMade[69] == 0){
					AData[Total] = new Armorsmith(70, 237, "LghtBoots", "Light Boots", 104, "Metal C", 118, "LhtEnrgy", 1, 0, 3);
				}
				if(ArmorMade[69] == 1){
					AData[Total] = new Armorsmith(70, 237, "LghtBoots", "Light Boots", 104, "Metal C", 118, "LhtEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Light Boots
			
			if(ArmorFound[70] == 1){//Dark Helmet
				if(ArmorMade[70] == 0){
					AData[Total] = new Armorsmith(71, 238, "DrkHelm", "Dark Helmet", 104, "Metal C", 119, "DrkEnrgy", 1, 0, 3);
				}
				if(ArmorMade[70] == 1){
					AData[Total] = new Armorsmith(71, 238, "DrkHelm", "Dark Helmet", 104, "Metal C", 119, "DrkEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Helmet
			if(ArmorFound[71] == 1){//Dark Armor
				if(ArmorMade[71] == 0){
					AData[Total] = new Armorsmith(72, 239, "DrkArmr", "Dark Armor", 104, "Metal C", 119, "DrkEnrgy", 1, 0, 3);
				}
				if(ArmorMade[71] == 1){
					AData[Total] = new Armorsmith(72, 239, "DrkArmr", "Dark Armor", 104, "Metal C", 119, "DrkEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Armor
			if(ArmorFound[72] == 1){//Dark Gauntlets
				if(ArmorMade[72] == 0){
					AData[Total] = new Armorsmith(73, 240, "DrkGntlt", "Dark Gauntlets", 104, "Metal C", 119, "DrkEnrgy", 1, 0, 3);
				}
				if(ArmorMade[72] == 1){
					AData[Total] = new Armorsmith(73, 240, "DrkGntlt", "Dark Gauntlets", 104, "Metal C", 119, "DrkEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Gauntlets
			if(ArmorFound[73] == 1){//Dark Boots
				if(ArmorMade[73] == 0){
					AData[Total] = new Armorsmith(74, 241, "DrkBoots", "Dark Boots", 104, "Metal C", 119, "DrkEnrgy", 1, 0, 3);
				}
				if(ArmorMade[73] == 1){
					AData[Total] = new Armorsmith(74, 241, "DrkBoots", "Dark Boots", 104, "Metal C", 119, "DrkEnrgy", 1, 1, 3);
				}
				Total = Total + 1;
			}//Dark Boots
			
			if(ArmorFound[74] == 1){//Boots?
				if(ArmorMade[74] == 0){
					AData[Total] = new Armorsmith(75, 242, "Boots", "Boots?", 104, "Metal C", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[74] == 1){
					AData[Total] = new Armorsmith(75, 242, "Boots?", "Boots?", 104, "Metal C", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Boots?
			if(ArmorFound[75] == 1){//Shield?
				if(ArmorMade[75] == 0){
					AData[Total] = new Armorsmith(76, 243, "Sheild", "Sheild?", 104, "Metal C", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[75] == 1){
					AData[Total] = new Armorsmith(76, 243, "Shield?", "Sheild?", 104, "Metal C", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Sheild?
			if(ArmorFound[76] == 1){//Armor?
				if(ArmorMade[76] == 0){
					AData[Total] = new Armorsmith(77, 244, "Armor", "Armor?", 104, "Metal C", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[76] == 1){
					AData[Total] = new Armorsmith(77, 244, "Armor?", "Armor?", 104, "Metal C", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Armor?
			if(ArmorFound[77] == 1){//Guantlets?
				if(ArmorMade[77] == 0){
					AData[Total] = new Armorsmith(78, 245, "Gntlets", "Gauntlets?", 104, "Metal C", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[77] == 1){
					AData[Total] = new Armorsmith(78, 245, "Gntlets?", "Gauntlets?", 104, "Metal C", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Gauntlets?
			if(ArmorFound[78] == 1){//Helmet?
				if(ArmorMade[78] == 0){
					AData[Total] = new Armorsmith(79, 246, "Helmet", "Helmet?", 104, "Metal C", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[78] == 1){
					AData[Total] = new Armorsmith(79, 246, "Helmet?", "Helmet?", 104, "Metal C", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Helmet?
			
			if(ArmorFound[79] == 1){//Null Helmet
				if(ArmorMade[79] == 0){
					AData[Total] = new Armorsmith(80, 247, "NULLHelm", "NULL Helmet", 104, "Metal C", 281, "Null", 1, 0, 3);
				}
				if(ArmorMade[79] == 1){
					AData[Total] = new Armorsmith(80, 247, "NULLHelm", "NULL Helmet", 104, "Metal C", 281, "Null", 1, 1, 3);
				}
				Total = Total + 1;
			}//Null Helmet
			if(ArmorFound[80] == 1){//Null Armor
				if(ArmorMade[80] == 0){
					AData[Total] = new Armorsmith(81, 248, "NULLArmr", "NULL Armor", 104, "Metal C", 281, "Null", 1, 0, 3);
				}
				if(ArmorMade[80] == 1){
					AData[Total] = new Armorsmith(81, 248, "NULLArmr", "NULL Armor", 104, "Metal C", 281, "Null", 1, 1, 3);
				}
				Total = Total + 1;
			}//Null Armor
			if(ArmorFound[81] == 1){//Null Gauntlets
				if(ArmorMade[81] == 0){
					AData[Total] = new Armorsmith(82, 249, "NULLGntlt", "NULL Gauntlets", 104, "Metal C", 281, "Null", 1, 0, 3);
				}
				if(ArmorMade[81] == 1){
					AData[Total] = new Armorsmith(82, 249, "NULLGntlt", "NULL Gauntlets", 104, "Metal C", 281, "Null", 1, 1, 3);
				}
				Total = Total + 1;
			}//Null Gauntlets
			if(ArmorFound[82] == 1){//Null Boots
				if(ArmorMade[82] == 0){
					AData[Total] = new Armorsmith(83, 250, "NULLBoots", "NULL Boots", 104, "Metal C", 281, "Null", 1, 0, 3);
				}
				if(ArmorMade[82] == 1){
					AData[Total] = new Armorsmith(83, 250, "NULLBoots", "NULL Boots", 104, "Metal C", 281, "Null", 1, 1, 3);
				}
				Total = Total + 1;
			}//Null Boots
			
			if(ArmorFound[83] == 1){//Blueberry Armor
				if(ArmorMade[83] == 0){
					AData[Total] = new Armorsmith(84, 251, "BBArmor", "Blueberry Armor", 61, "Blueberry", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[83] == 1){
					AData[Total] = new Armorsmith(84, 251, "BBArmor", "Blueberry Armor", 61, "Blueberry", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//Blueberry Armor
			
			if(ArmorFound[84] == 1){//Mystery Armor
				if(ArmorMade[84] == 0){
					AData[Total] = new Armorsmith(85, 252, "MysArmr", "Mystery Armor", 104, "Metal C", 284, "???", 1, 0, 3);
				}
				if(ArmorMade[84] == 1){
					AData[Total] = new Armorsmith(85, 252, "MysArmr", "Mystery Armor", 104, "Metal C", 284, "???", 1, 1, 3);
				}
				Total = Total + 1;
			}//Mystery Armor
			
			if(ArmorFound[85] == 1){//Corrupt Helmet
				if(ArmorMade[85] == 0){
					AData[Total] = new Armorsmith(86, 253, "CorrHelm", "Corrupt Helmet", 282, "RustyMetal", 0, "", 1, 0, 3);
				}
				if(ArmorMade[85] == 1){
					AData[Total] = new Armorsmith(86, 253, "CorrHelm", "Corrupt Helmet", 282, "RustyMetal", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Helmet
			if(ArmorFound[86] == 1){//Corrupt Armor
				if(ArmorMade[86] == 0){
					AData[Total] = new Armorsmith(87, 254, "CorrArmr", "Corrupt Armor", 282, "RustyMetal", 0, "", 1, 0, 3);
				}
				if(ArmorMade[86] == 1){
					AData[Total] = new Armorsmith(87, 254, "CorrArmr", "Corrupt Armor", 282, "RustyMetal", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Armor
			if(ArmorFound[87] == 1){//Corrupt Gauntlets
				if(ArmorMade[87] == 0){
					AData[Total] = new Armorsmith(88, 255, "CorrGntlt", "Corrupt Gauntlets", 282, "RustyMetal", 0, "", 1, 0, 3);
				}
				if(ArmorMade[87] == 1){
					AData[Total] = new Armorsmith(88, 255, "CorrGntlt", "Corrupt Gauntlets", 282, "RustyMetal", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Gauntlets
			if(ArmorFound[88] == 1){//Corrupt Boots
				if(ArmorMade[88] == 0){
					AData[Total] = new Armorsmith(89, 256, "CorrBoots", "Corrupt Boots", 282, "RustyMetal", 0, "", 1, 0, 3);
				}
				if(ArmorMade[88] == 1){
					AData[Total] = new Armorsmith(89, 256, "CorrBoots", "Corrupt Boots", 282, "RustyMetal", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Boots
			
			if(ArmorFound[89] == 1){//Corrupt Helmet
				if(ArmorMade[89] == 0){
					AData[Total] = new Armorsmith(90, 253, "CorrHelm", "Corrupt Helmet", 283, "Item/Corr.name", 0, "", 1, 0, 3);
				}
				if(ArmorMade[89] == 1){
					AData[Total] = new Armorsmith(90, 253, "CorrHelm", "Corrupt Helmet", 283, "Item/Corr.name", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Helmet
			if(ArmorFound[90] == 1){//Corrupt Armor
				if(ArmorMade[90] == 0){
					AData[Total] = new Armorsmith(91, 254, "CorrArmr", "Corrupt Armor", 283, "Item/Corr.name", 0, "", 1, 0, 3);
				}
				if(ArmorMade[90] == 1){
					AData[Total] = new Armorsmith(91, 254, "CorrArmr", "Corrupt Armor", 283, "Item/Corr.name", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Armor
			if(ArmorFound[91] == 1){//Corrupt Gauntlets
				if(ArmorMade[91] == 0){
					AData[Total] = new Armorsmith(92, 255, "CorrGntlt", "Corrupt Gauntlets", 283, "Item/Corr.name", 0, "", 1, 0, 3);
				}
				if(ArmorMade[91] == 1){
					AData[Total] = new Armorsmith(92, 255, "CorrGntlt", "Corrupt Gauntlets", 283, "Item/Corr.name", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Gauntlets
			if(ArmorFound[92] == 1){//Corrupt Boots
				if(ArmorMade[92] == 0){
					AData[Total] = new Armorsmith(93, 256, "CorrBoots", "Corrupt Boots", 283, "Item/Corr.name", 0, "", 1, 0, 3);
				}
				if(ArmorMade[92] == 1){
					AData[Total] = new Armorsmith(93, 256, "CorrBoots", "Corrupt Boots", 283, "Item/Corr.name", 0, "", 1, 1, 3);
				}
				Total = Total + 1;
			}//Corrupt Boots
			
			if(ArmorFound[93] == 1){//Admin Armor
				if(ArmorMade[93] == 0){
					AData[Total] = new Armorsmith(94, 257, "AdmArmr", "Admin Armor", 281, "Null", 284, "???", 1, 0, 3);
				}
				if(ArmorMade[93] == 1){
					AData[Total] = new Armorsmith(94, 257, "AdmArmr", "Admin Armor", 281, "Null", 284, "???", 1, 1, 3);
				}
				Total = Total + 1;
			}//Admin Armor
			
			if(ArmorFound[94] == 1){//All Armor
				if(ArmorMade[94] == 0){
					AData[Total] = new Armorsmith(95, 258, "AllArmr", "All Armor", 281, "Null", 280, "Glitch", 1, 0, 3);
				}
				if(ArmorMade[94] == 1){
					AData[Total] = new Armorsmith(95, 258, "AllArmr", "All Armor", 281, "Null", 280, "Glitch", 1, 1, 3);
				}
				Total = Total + 1;
			}//All Armor
			
		}
		return AData;
	}
	
	//MakeArmor
	
	public static int ArmorNo(int[] ArmorFound, int ArmorNo){
		int Index = 0;
		int i = 0;
		while(i < ArmorNo - 1){
			Index = Index + ArmorFound[i];
			i = i + 1;
		}
		return Index;
	}
	
	public static int ArmorTotal(int[] ArmorFound){
		int Total = 0;
		int i = 0;
		while(i < ArmorFound.length){
			Total = Total + ArmorFound[i];
			i = i + 1;
		}
		return Total;
	}
}
